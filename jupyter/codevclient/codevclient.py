import requests
import nbformat
import inspect
import IPython
import os
import ipynbname
# import keyboard
import platform
import time

from IPython.core.magic import register_cell_magic
from IPython import get_ipython
from contextlib import redirect_stdout
from io import StringIO

# Initialize client as None initially
client = None
filepath = None
historyStr = None
output = False
debug = False
cell_id = None
start_time = None

class CodevClient:
    global debug
    username = None
    password = None
    userkey = None
  
    def connect(self, username, password):
        server = requests.post(
            'http://app.corus-ai.net/api/corus/backend/token',
            data={'username': username, 'password': password}
        )
        output = server.json()
        self.token = output['access_token']
   
    def connect2(self, userkey):      
        server = requests.post(
            #'http://app.corus-ai.net/api/corus/backend/dashboard/iam/authDevice/',
            'http://codev.skcc.com/api/corus/backend/dashboard/iam/authDevice/',
            headers={
                'user-key': userkey,
                'Content-Type': 'application/json',
            }
        )
        output = server.json()
        self.token = output['data']['access_token']
        print(f"token:", self.token)
        
    def __init__(self, username, password):
        self.username = username
        self.password = password
        self.connect(username, password)
        
        # # self.connect2(userkey)
        # server = requests.post(
        #     'http://codev.skcc.com/api/corus/backend/token',
        #     data={'username': username, 'password': password}
        # )
        # output = server.json()
        # # self.token = output['access_token']
        # self.token = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOjYsInVzZXJfbmFtZSI6ImhlZXNlb2sgamVvbmciLCJjcmVhdGVkX2F0IjoiMjAyMy0wOS0xMyAwMTo1MjowMCIsImV4cGlyZXNfaW4iOjYwLCJleHAiOjE2OTQ1NzM1MjB9.9T4i3hy4JtP6ZKbVPe_X9WmkZU0AqW7S6umTv2v5uYs'
   
    def __del__(self):
        print("Codev client reset.")

    def serverStr(self, data):
        server = requests.post(
            #'http://app.corus-ai.net/api/corus/backend/completions?type=editor',
            'http://codev.skcc.com/api/corus/backend/completions?type=editor',
            headers={
                'Authorization': 'Bearer ' + self.token,
                'Content-Type': 'application/json',
            },
            json=data,
        ) 
        return server
        
    def completion(self, contexts , code, placeholder='<<HERE>>'):
        try:
            if placeholder not in code:
                code = code + "" + placeholder
            before, after = code.split(placeholder)
            before = contexts + before
            data = {
                "file_name": "nb.py",
                "before_code": before,
                "after_code": after,
            }
            server = self.serverStr(data)            
            if debug:
                print('\033[31m' + f"☞---- server.json() :\n  {server.json() }" + '\033[0m')
                print('\033[31m' + f"☞---- server requests.post time : { time.time() - start_time } 초" + '\033[0m')
    
            #토큰 만료되면 재접속 한다.             
            if str(server.json()['code'])  == "-1002":
                self.connect(self.username, self.password)
                # self.connect2(self.userkey)
                server = self.serverStr(data)   
                
                if debug:
                    print('\033[31m' + f"☞---- reconnect time : { time.time() - start_time } 초" + '\033[0m')                               

            completionStr = server.json()['data'][0]['text']
            
            if output == True:
                print(f"===> completion :\n",completionStr)
            return code.replace(placeholder, completionStr.strip())
        except requests.exceptions.RequestException as e:
            print("An completion error occurred:", e) 
            
            return None

def connectCodev(username, password):
    global client
    if client is None:
        # print("client is None ")
        client = CodevClient(username, password)     
        print("connected in Codev. ")
    getFilepath()
    get_ipython().events.register('pre_run_cell', pre_run_cell)

def checkCodev():
    global client
    if client is None:
        print("Codev is none")   
    else:
        print("Codev is not none.") 
       
def resetCodev(username, password):
    global client
    checkCodev()
    if client is not None:
        del client
        client = None
        # print("Codev client reset.")       
    connectCodev(username, password)

def monitor_file_save(file_path, check_interval=1):
    global output
    # 이전 파일 상태를 저장할 변수
    previous_timestamp = None

    while True:
        # 파일의 현재 수정 시간 가져오기
        current_timestamp = os.path.getmtime(file_path)

        # 이전 파일 상태와 현재 파일 상태를 비교
        if previous_timestamp is None:
            previous_timestamp = current_timestamp
        elif current_timestamp > previous_timestamp:
            # 파일이 수정되면 경과 시간을 계산하고 출력
            elapsed_time = time.time() - current_timestamp
            if output == True:
                print(f"Time to save File: {elapsed_time:.2f} 초")
            break  # 파일 저장이 완료되면 루프를 종료

        # 일정 시간마다 파일 상태를 확인
        time.sleep(check_interval)


from ipylab import JupyterFrontEnd
def saveCurrentFile1(): 
    app = JupyterFrontEnd()
    app.commands.execute('docmanager:save')
    # print(f" saveCurrentFile : ", saveCurrentFile)
    time.sleep(1)  # get_cell_infos2 시 해제 

def saveCurrentFile3(): 
    from IPython.display import display, Javascript
    display(Javascript(
        "document.body.dispatchEvent("
        "new KeyboardEvent('keydown', {key:'s', keyCode: 83, ctrlKey: true}"
        "))"
    ))


def getFilepath():
    global filepath
    # Get the absolute path of the current notebook (this might be a temporary path)
    notebook_path = os.path.abspath(ipynbname.name())
    
    # Extract the directory and filename from the path
    notebook_directory = os.path.dirname(notebook_path)
    notebook_filename = os.path.basename(notebook_path)
    filepath = f"{notebook_directory}/{notebook_filename}.ipynb"
    print(f"filepath : ", filepath)

def capture_history_with_timestamps():
    # Create a StringIO object to capture the output
    output_buffer = StringIO()
    # Run the magic command and capture the output
    with redirect_stdout(output_buffer):
        get_ipython().run_line_magic('history', '')
    # Get the captured output as a string
    captured_output = output_buffer.getvalue()
    return captured_output

# main 에서 sub 들어가 부분을 <<END>> ㄹ
def end_substring(main_string, sub_string):
  
    # print(f"main_string : ",main_string)
    # print(f"sub_string : ",sub_string)
    if sub_string in main_string and 'codev_magic' in main_string :
        result = '<<END>>'
        # print(f"===> result if :  true")
    else:
        result = main_string
        # print(f"===> result if :  false")
    # print(f"========================================================================")
    return result
    
def remove_substring(main_string, sub_string):
    result = main_string.replace(sub_string, '')
    # print(f"main_string : ",main_string)
    # print(f"sub_string : ",sub_string)
    # print(f"result : ",main_string)
    return result
    
def remove_lines_starting_with_substring(main_string, sub_string):
     # 문자열을 줄 단위로 나눔
    lines = main_string.split('\n') 
     # 서브스트링으로 시작하지 않는 줄만 선택
    filtered_lines = [line for line in lines if not line.startswith(sub_string)] 
    # 줄들을 다시 문자열로 결합
    result = '\n'.join(filtered_lines)  
    return result

def join_lines_up_to_substring(main_string, sub_string):
    lines = main_string.split('\n')
    result = []

    for line in lines:
        result.append(line)
        if sub_string in line:
            break
    
    result = '\n'.join(result)
    return result

def get_history():
    contexts =  get_ipython().run_line_magic('history', '')
    # print(f" filepath : ", contexts)
    return f"{contexts}"

import IPython.display as display
# from IPython.core.display import display_code

def add_metadata(cell, key, value):
    """Adds metadata to a JupyterLab code cell.
    
    Args:
    cell: The JupyterLab code cell to add metadata to.
    key: The name of the metadata key.
    value: The value of the metadata key.
    """
    
    metadata = cell.metadata.copy()
    metadata[key] = value
    cell.metadata = metadata


def newCell(contents):
    from IPython.core.getipython import get_ipython
    shell = get_ipython()
    payload = dict(
        source='set_next_input',
        text=contents,
        replace=False,
    )
    shell.payload_manager.write_payload(payload, single=False)

def selfCell(contents):
    contents = "# %%codev_magic1  \n" + contents
    from IPython.core.getipython import get_ipython
    shell = get_ipython()
    payload = dict(
        source='set_next_input',
        text=contents,
        replace=True,
    )
    shell.payload_manager.write_payload(payload, single=False)

# 해당 셀의 execution_count 까지 code merge 한다. (사용하지 않음)
def get_cells_above_target(notebook_path, target_cell_index):

    # os.system(f'jupyter nbconvert --to notebook --execute --inplace  {notebook_path} ')

    # Load the IPython Notebook file
    with open(notebook_path, 'r') as notebook_file:
        notebook_content = notebook_file.read()

    # Parse the notebook content using nbformat
    notebook = nbformat.reads(notebook_content, as_version=4)

    # Iterate through cells above the target cell and access their content
    cell_contents_above_target = []
    for idx, cell in enumerate(notebook.cells[:target_cell_index]):
        if cell.cell_type == 'code':
            # Access code cell content
            cell_contents_above_target.append(("Code", cell.source))
        # elif cell.cell_type == 'markdown':
        #     # Access markdown cell content
        #     cell_contents_above_target.append(("Markdown", cell.source))

    for idx, (cell_type, content) in enumerate(cell_contents_above_target):
        print(f"Cell {idx + 1} ({cell_type}):")
        print(content)
        print("-------------------------")

# 해당 Cell.id 까지만 code 병함, runCell 상용안함
def get_cell_infos(ipynb_file_path, runCell):
    # try:
    # Read the notebook file
    with open(ipynb_file_path, 'r') as notebook_file:
        notebook_content = notebook_file.read()

    # Parse the notebook content
    notebook = nbformat.reads(notebook_content, as_version=4)

    # Iterate through the cells and extract the execution counts
    execution_counts = []
    sources = []
    global cell_id
    for cell in notebook.cells:
        if cell.id != None:
            print(f"-------- cell.id : " , cell.id ) # 검증
            if cell_id != cell.id:  # 해당 Cell.id 까지만 code 병함
                if cell.cell_type == 'code' and cell.execution_count != None:
                    execution_counts.append(cell.execution_count)
                    # sources.append("#  Cell ID : [" + str(cell.execution_count) + "]  #")
                    if 'codev_magic' not in cell.source:
                        sources.append(cell.source)
            else:
                break                   

    return execution_counts,sources 
    # except Exception as e:
    #     print("An error occurred:", str(e))
    #     return [],[]


def get_cell_infos1(ipynb_file_path , runCell):
    try:
        # Read the notebook file
        with open(ipynb_file_path, 'r') as notebook_file:
            notebook_content = notebook_file.read()

        # Parse the notebook content
        notebook = nbformat.reads(notebook_content, as_version=4)

        # Iterate through the cells and extract the execution counts
        execution_counts = []
        sources = []
        for cell in notebook.cells:
            if cell.cell_type == 'code' and cell.execution_count != None:
                execution_counts.append(cell.execution_count)
                # sources.append("#  Cell ID : [" + str(cell.execution_count) + "]  #")
                if 'codev_magic' not in cell.source:
                    sources.append(cell.source)


        return execution_counts,sources 
    except Exception as e:
        print("An error occurred:", str(e))
        return [],[]

def get_cell_infos2(ipynb_file_path , runCell):
    try:
        # os.system(f'jupyter nbconvert --execute --to notebook  {ipynb_file_path} ')
        # Read the notebook file
        with open(ipynb_file_path, 'r') as notebook_file:
            notebook_content = notebook_file.read()

        # Parse the notebook content
        notebook = nbformat.reads(notebook_content, as_version=4)
        
        # # Save the modified notebook back to the file
        # with open(ipynb_file_path, 'w') as notebook_file:
        # nbformat.write(notebook, notebook_file)
    
        # Iterate through the cells and extract the execution counts
        execution_counts = []
        sources = []
        for cell in notebook.cells:
            # print("#  === Cell ID : [" + str(cell.execution_count) + "]  #") : error
            # Print("-------- markdown_cell_to_html : " + display.markdown_cell_to_html(cell).metadata) 
            # print(f"-------- cell.id : " , cell.id )  # 검증x
            if cell.cell_type == 'code':

                # codev_magic 있는 cell 경우는 runCell 일 경우만 치환하고 append 한다.
                if 'codev_magic' in cell.source:
                    # <<END>> 치환
                    cellStr = end_substring(cell.source , runCell.strip() )
                    # # print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
                    # print("# (null) <<END>>  Cell  #")
                    # print("#  === Cell source : [" + str(cell.source) + "] ")
                    # print("#  === runCell source : [" + runCell.strip() + "] ")
                    # print("치환 : " + cellStr)
                    # print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
                    if "<<END>>" in cellStr: 
                        sources.append(cellStr)
                        break
                else: # codev_magic 없고 cell 이 not None 경우만 append 한다.
                    if cell.execution_count != None:
                        execution_counts.append(cell.execution_count)
                        sources.append(cell.source)
                        
        return execution_counts,sources 
    except Exception as e:
        print("An error occurred:", str(e))
        return [],[]
        
# saveCurrentFile -> sleep 1초 -> runCell execution_count 이 null 로 넘어온다. # windows 실행시
# cell.source 이 null and codev_magic 경우 => <<END>> 치환한다. 
def get_cell_infos3(ipynb_file_path , runCell):
    try:
        # os.system(f'jupyter nbconvert --execute --to notebook  {ipynb_file_path} ')
        # Read the notebook file
        with open(ipynb_file_path, 'r') as notebook_file:
            notebook_content = notebook_file.read()

        # Parse the notebook content
        notebook = nbformat.reads(notebook_content, as_version=4)
        
        # # Save the modified notebook back to the file
        # with open(ipynb_file_path, 'w') as notebook_file:
        # nbformat.write(notebook, notebook_file)
    
        # Iterate through the cells and extract the execution counts
        execution_counts = []
        sources = []
        for cell in notebook.cells:
            # print("#  for Cell ID : [" + str(cell.execution_count) + "]  #") : error
            # Print("-------- markdown_cell_to_html : " + display.markdown_cell_to_html(cell).metadata) 
            # print(f"-------- cell.id : " , cell.id )  # 검증x
            if cell.cell_type == 'code':
                if cell.execution_count != None:
                    execution_counts.append(cell.execution_count)
                    # sources.append("#  Cell ID : [" + str(cell.execution_count) + "]  #")
                    # contexts = remove_substring(contexts, cell.strip())
                    if 'codev_magic' not in cell.source:
                        sources.append(cell.source)
                else: # null and codev_magic 경우 => <<END>>  # saveCurrentFile 실행시 null 로직                           
                    # magic command 포함된 cell 은 제외
                    if 'codev_magic' in cell.source:
                        # <<END>> 치환
                        cellStr = end_substring(cell.source , runCell.strip() )
                        # print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
                        # print("# <<END>>  Cell  #")
                        # print(cellStr)
                        # print("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
                        sources.append(cellStr)
                        break
                
        return execution_counts,sources 
    except Exception as e:
        print("An error occurred:", str(e))
        return [],[]

# 사용안함        
def get_contexts(ipynb_file_path):
    try:
        # Read the notebook file
        with open(ipynb_file_path, 'r') as notebook_file:
            notebook_content = notebook_file.read()

        # Parse the notebook content
        notebook = nbformat.reads(notebook_content, as_version=4)

        # Iterate through the cells and extract the execution counts
        execution_counts = []
        sources = []
        for cell in notebook.cells:
            if cell.cell_type == 'code' and cell.execution_count != None:
                execution_counts.append(cell.execution_count)
                # sources.append("#  Cell ID : [" + str(cell.execution_count) + "]  #")
                # <<END>> 치환
                cellStr = end_substring(cell.source)
                # magic command 포함된 cell 은 제외
                if '%%' not in cellStr:
                    sources.append(cellStr)

        return execution_counts,sources 
    except Exception as e:
        print("An error occurred:", str(e))
        return [],[]

def get_cell_sources(ipynb_file_path):
    sources = []  # List to store cell sources
    with open(ipynb_file_path, 'r') as notebook_file:
        notebook_content = notebook_file.read()
        notebook = nbformat.reads(notebook_content, as_version=4)
        
        for cell in notebook.cells:
            if cell.cell_type == 'code'  :
                # sources.append("# Cell ID : [" + str(cell.execution_count) + "]  #")
                sources.append(cell.source)
                # sources.append("------")

    # return the accumulated sources
    return '\n'.join(sources)

def check_instr(instr):
    instr_lower = instr.lower()  # instr를 소문자로 변환하여 비교합니다.
    
    if instr_lower == "on":
        return True
    elif instr_lower == "off":
        return False
    else:
        raise Exception("output 옵션이 유효하지 않습니다. output=on, output=off")

def check_option(line):
    # print(f"line: ",line)
    if "=" not in line:
        return

    global output, debug  # Declare global variables

    instr_pairs = line.split(',')
    
    for instr_pair in instr_pairs:
        key_value = instr_pair.split('=')
        
        # if len(key_value) != 2:
        #     print(f"Error: Invalid key-value pair: {instr_pair}")
        #     continue
        
        key, value = key_value[0].strip().lower(), key_value[1].strip().lower()

        try:
            if key == "output":
                if value == "on":
                    output = True
                elif value == "off":
                    output = False
                else:
                    print(f"Error: Invalid value for 'output'. Use 'on' or 'off'.")

            elif key == "debug":
                if value == "on":
                    debug = True
                elif value == "off":
                    debug = False
                else:
                    print(f"Error: Invalid value for 'debug'. Use 'on' or 'off'.")

            else:
                print(f"Error: Invalid key: {key}. Only 'output', 'debug' are allowed.")

        except Exception as e:
            print(f"Error: {e}")

def pre_run_cell(info):
    global cell_id
    cell_id = info.cell_id
    # print(f"pre_run_cell is registered" )

@register_cell_magic
def codev_magic1(line, cell):
    global cell_id
    # print(f"--1 cell_id : ",cell_id) # 검증
    process_codev_magic(line, cell, selfCell)

@register_cell_magic
def codev_magic2(line, cell):
    global cell_id
    # print(f"--2 cell_id : ",cell_id) # 검증
    process_codev_magic(line, cell, newCell)

def process_codev_magic(line, cell, completion_func):
    global client
    global filepath
    global output
    global start_time
    start_time = time.time()
    # history 사용
    # contexts = capture_history_with_timestamps()
    # contexts = remove_substring(contexts, cell)
    # contexts = remove_substring(contexts, "<<HERE>>")
    # contexts = remove_lines_starting_with_substring(contexts, "%%")  

        # if data:
        #     instr = data.split('=')[1]
        #     output = check_instr(instr)
        #     # myCell = cellId
        #     # print(f" instr : ", instr)
        #     print(f"output : ", output)
    
    check_option(line)
    # print(f"---- check_option : " , time.time() - start_time)
    if debug:
        process_codev_magin_body(line, cell, completion_func)
        print('\033[31m' + f"☞---- process_codev_magic time : { time.time() - start_time } 초" + '\033[0m')
    else:        
        try:
            process_codev_magin_body(line, cell, completion_func)
        except Exception as e:
            # Handle the exception here, you can print an error message or take appropriate action
            print(f"An error occurred: {str(e)}")
    

def process_codev_magin_body(line, cell, completion_func): 
    # global start_time

    # 서버에서 1,2 안됨
    saveCurrentFile3()
    if debug:
        print('\033[31m' + f"☞---- saveCurrentFile3 : { time.time() - start_time } 초" + '\033[0m')

    # keyboard.press_and_release('ctrl+s')
    # if debug:
    #     monitor_file_save(filepath)
    #     print(f"☞---- monitor_file_save(on) : { time.time() - start_time } 초")

    if filepath:
        # print(f" filepath is exist : ", filepath)
        # print(get_cell_sources(filepath))
        execution_counts, sources = get_cell_infos2(filepath, cell)
        # print("Execution counts:", execution_counts)
        if debug:
            print('\033[31m' + f"☞---- get_cell_infos2 : { time.time() - start_time } 초" + '\033[0m')
        contexts = '\n'.join(sources)
        
        # <<HERE>> 제거 -> magic command 포함된 cell 은 제외 ( get_cell_infos2)
        # contexts = remove_substring(contexts, "<<HERE>>")
        
        # 자신 cell 내용과 같은 cell 제외> -> magic command 포함된 cell 은 제외 (get_cell_infos2)
        # contexts = remove_substring(contexts, cell.strip())
        # magic command 시작하는 cell 은 제외 -> corus_magic 만 제외 (get_cell_infos2)
        # contexts = remove_lines_starting_with_substring(contexts, "%%")

        # get_cell_infos2, 3 적용
        # 싫행 cell 을  <<END>>  로 치환
        contexts = join_lines_up_to_substring(contexts, "<<END>>")
        if debug:
            print('\033[31m' + f"☞---- join_lines_up_to_substring : { time.time() - start_time } 초" + '\033[0m')
        # <<END>> 제거
        contexts = remove_substring(contexts, "<<END>>")  
        if debug:
            print('\033[31m' + f"☞---- remove_substring : { time.time() - start_time } 초" + '\033[0m')
        
    # print(contexts)
    
    if output == True:
        # output 
        # print(f"<====================  run in cell ================> :" , get_ipython().execution_count)
        # cell_contents = get_cells_above_target(filepath, get_ipython().execution_count)
        # print(f"===> cell_contents : \n", cell_contents)

        # print(f"==================================================================================== ")
        print(f"===> contexts :\n",contexts)
        if debug:
            print('\033[31m'  + f"☞---- print contexts  :{ time.time() - start_time } 초" + '\033[0m')
    # 변수 사용시 적용

    # if client is None:
    #     print("Please login : connectCodev(username,password) ")
        # client = CodevClient(username, passwd)
    if client:
        # print(" client is exist ")
        if output == True:
            print(f"===> code :\n",cell)
            if debug:
                print('\033[31m' + f"☞---- print code : { time.time() - start_time } 초" + '\033[0m')
        # prompt = f"{contexts}\n{cell}"
        # print(f" prompt : ", prompt)
        completionStr = client.completion(contexts, cell)
        if debug:
            print('\033[31m' + f"☞---- completion : { time.time() - start_time } 초" + '\033[0m')
        if completionStr is not None:
            completion_func(completionStr)

    else:
        print("Please login : connectCodev(username,password) ")

from IPython.core.magic import register_line_magic
last_cell_run = None

@register_line_magic
def cellId(line):
    global last_cell_run
    last_cell_run = get_ipython().execution_count
    # print( f"{last_cell_run}")
    return f"{last_cell_run}"
