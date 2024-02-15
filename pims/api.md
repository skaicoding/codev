# API 명세서

## TokenController API 명세서
### GET /token
#### 파라미터 정보
- 없음
#### 응답 (String)
- JSON Web 토큰(JWT) 반환
---
## BCITSLinkController API 명세서
### POST /api/v1/BCApiITSIssue/issue/upd
#### 파라미터 정보
- Map<String, String> param : 클라이언트로부터 전달 받은 파라미터 모음
#### 응답 (JSON)
- list_cnt : 결과 리스트의 개수
- list : 결과 리스트
- type : 에러 유형(에러 발생 시)
- message : 에러 메세지(에러 발생 시)

### POST /api/v1/BCApiITSIssue/issue/charger/upd
#### 파라미터 정보
- Map<String, String> param : 클라이언트로부터 전달 받은 파라미터 모음
#### 응답 (JSON)
- list_cnt : 결과 리스트의 개수
- list : 결과 리스트
- type : 에러 유형(에러 발생 시)
- message : 에러 메세지(에러 발생 시)

### POST /api/v1/BCApiITSIssue/issue/stateUpd
#### 파라미터 정보
- Map<String, String> param : 클라이언트로부터 전달 받은 파라미터 모음
- HttpServletRequest hr : 클라이언트 요청 정보
#### 응답 (JSON)
- list_cnt : 결과 리스트의 개수
- list : 결과 리스트
- type : 에러 유형(에러 발생 시)
- message : 에러 메세지(에러 발생 시)
---
## BCQmsLinkController API 명세서
### POST /apicall/BCQmsLinkController/pmCheckLinkQMS
#### 파라미터 정보
- requestData : 요청 데이터 (IDataSet 형태)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 형태)
#### 응답 (JSON)
- pmCheckLinkQMS의 실행 결과 값(IDataSet 형태)

### POST /apicall/BCQmsLinkController/pmUpdateInspectionQMS (사용중단)
#### 파라미터 정보
- requestData : 요청 데이터 (IDataSet 형태)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 형태)
#### 응답 (JSON)
- pmUpdateInspectionQMS의 실행 결과 값(IDataSet 형태)

### POST /apicall/BCQmsLinkController/pmGetInspectionQMS
#### 파라미터 정보
- requestData : 요청 데이터 (IDataSet 형태)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 형태)
#### 응답 (JSON)
- pmGetInspectionQMS의 실행 결과 값(IDataSet 형태)
---
## BCTmsLinkController API 명세서
Java로 작성된 BCTmsLinkController 프로그램에 대한 API 명세서입니다.

### POST /apicall/BCTmsLinkController/pmTestTypeSyncTMS
#### 파라미터 정보
- requestData : 동기화를 위한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 동기화 결과 데이터 반환

### POST /apicall/BCTmsLinkController/pmTestSceSyncTMS
#### 파라미터 정보
- requestData : 유형-시나리오 동기화를 위한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 유형-시나리오 동기화 결과 데이터 반환

### POST /apicall/BCTmsLinkController/pmTestSceSyncByTypeTMS
#### 파라미터 정보
- requestData : 유형별 유형-시나리오 동기화를 위한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 유형별 유형-시나리오 동기화 결과 데이터 반환

### POST /apicall/BCTmsLinkController/pmTestExecCoverageTMS
#### 파라미터 정보
- requestData : 수행 집계 동기화를 위한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 수행 집계 동기화 결과 데이터 반환

### POST /apicall/BCTmsLinkController/pmTestDefectCoverageTMS
#### 파라미터 정보
- requestData : 결함 집계 동기화를 위한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결함 집계 동기화 결과 데이터 반환

### POST /apicall/BCTmsLinkController/pmTestScePMS
#### 파라미터 정보
- requestData : 시나리오 테스트 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 시나리오 테스트 결과 데이터 반환

### POST /apicall/BCTmsLinkController/pmTestTypePMS
#### 파라미터 정보
- requestData : 테스트 타입 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 테스트 타입 결과 데이터 반환

### POST /apicall/BCTmsLinkController/pmTestSyncYNPMS
#### 파라미터 정보
- requestData : 동기화 확인 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 동기화 확인 결과 데이터 반환
---
## BCApiPortal API 명세서
### POST /api/v1/BCApiPortal/sendAlarmMessage
#### 파라미터 정보
- projectNo : 프로젝트 번호
- snd_msg : 전송 메시지
- snd_req_id : 전송 요청 ID
- sp_uid : 사용자 ID
- tag : 태그
#### 응답 (JSON 객체)
- 알람 메시지가 전송된 결과 정보를 반환합니다. 이 결과는 Map 형태의 응답으로 돌려줍니다.
---
## BCTokMain API 명세서
### POST /tok/BCTokMain/pmCurrentProjectListInq
#### 파라미터 정보
- requestData : 현재 프로젝트 리스트 조회를 위한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 현재 진행 중인 프로젝트 리스트 정보 반환
---
## BCTokBoardRetrieveController API 명세서
### POST /tok/BCBoardRetrieve/pmBoardListInq
#### 파라미터 정보
- requestData: 게시판 목록 조회에 필요한 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 게시판 목록 정보 반환

### POST /tok/BCBoardRetrieve/pmBoardInq
#### 파라미터 정보
- requestData: 게시판 조회에 필요한 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 특정 게시판의 정보 반환

### POST /tok/BCBoardRetrieve/pmBoardReg
#### 파라미터 정보
- requestData: 게시판 등록 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 게시판 등록 결과 반환

### POST /tok/BCBoardRetrieve/pmBoardDel
#### 파라미터 정보
- requestData: 게시판 삭제 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 게시판 삭제 결과 반환

### POST /tok/BCBoardRetrieve/pmUserListInq
#### 파라미터 정보
- requestData: 사용자 목록 조회 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 목록 정보 반환

### POST /tok/BCBoardRetrieve/pmProjectManagement
#### 파라미터 정보
- requestData: 프로젝트 관리 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트 관리 결과 정보 반환
---
## BCResourceMngr API 명세서
### POST prdtvy/BCResourceMngr/pmResourceMngrListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 불러온 자원 관리 리스트 정보 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrSave
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 저장된 자원 관리 정보 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrGetUsers
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 불러온 사용자 정보 반환

### GET prdtvy/BCResourceMngr/pmResourceMngrExcelExport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (File Download)
- 자원 관리 엑셀 파일 다운로드

### POST prdtvy/BCResourceMngr/pmResourceMngrExcelImport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 엑셀 Import 결과 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrGetPeriod
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 불러온 기간 정보 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrGetDetail
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 불러온 상세 정보 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrGetHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 불러온 히스토리 정보 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrSavePeriod
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 저장된 기간 정보 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrSaveDetailPerson
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 저장된 상세 인사 정보 반환

### POST prdtvy/BCResourceMngr/pmResourceMngrSaveDetailGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 저장된 상세 그리드 정보 반환
---
## ProjectLinkMap 프로그램 API 명세서
### POST /nexcorelink/projectlinkmap/getProjectLinkMaps
#### 파라미터 정보
- param : 프로젝트 링크 맵에 대한 조회 조건 사항
#### 응답 (JSON)
- 프로젝트의 링크 맵 정보를 반환

### POST /nexcorelink/projectlinkmap/getList
#### 파라미터 정보
- param : 리스트에 대한 조회 조건 사항
#### 응답 (JSON)
- 조회된 리스트 정보를 반환

### POST /nexcorelink/projectlinkmap/update
#### 파라미터 정보
- param : 업데이트를 원하는 정보에 대한 MAP
- session : 로그인 정보를 포함하고 있는 HttpSession 인스턴스
#### 응답 (JSON)
- 업데이트된 건의 수를 반환

### POST /nexcorelink/projectlinkmap/regist
#### 파라미터 정보
- param : 등록하고자 하는 정보에 대한 MAP 
- session : 로그인 정보를 포함하고 있는 HttpSession 인스턴스
#### 응답
- 등록됨

### POST /nexcorelink/projectlinkmap/remove
#### 파라미터 정보
- param : 제거를 원하는 정보에 대한 MAP
- session : 로그인 정보를 포함하고 있는 HttpSession 인스턴스
#### 응답
- 제거됨

### POST /nexcorelink/projectlinkmap/removes
#### 파라미터 정보
- param : 제거를 원하는 정보들에 대한 LIST
- session : 로그인 정보를 포함하고 있는 HttpSession 인스턴스
#### 응답
- 제거됨

### POST /nexcorelink/projectlinkmap/unlink
#### 파라미터 정보
- param : 연결 해제를 원하는 정보들에 대한 LIST
- session : 로그인 정보를 포함하고 있는 HttpSession 인스턴스
#### 응답 (JSON)
- 연결 해제된 건의 수를 반환

### Exception /nexcorelink/projectlinkmap/dbError
#### 파라미터 정보
- e : 발생한 SQL 예외 정보
#### 응답 (JSON)
- SQL 에러 메시지를 반환

### Exception /nexcorelink/projectlinkmap/defaultException
#### 파라미터 정보
- e : 발생한 일반 예외 정보
#### 응답 (JSON)
- 발생한 시스템 에러 메시지를 반환
---
## AppqController API 명세서
### POST /nexcorelink/appq/synchProjectData
#### 파라미터 정보
- serviceId : 서비스의 아이디
- linkCode : 프로젝트 링크 코드
- linkProjectNo : 프로젝트 릴링크 넘버
- projectNo : 프로젝트 넘버
#### 응답 (int)
- 1 : 요청이 정상적으로 처리되었습니다.
- 0 : 요청 처리에 실패했습니다.

### POST /nexcorelink/appq/synchProjectList
#### 파라미터 정보
- serviceId : 서비스의 아이디
#### 응답 (int)
- 1 : 요청이 정상적으로 처리되었습니다.
- 0 : 요청 처리에 실패했습니다.

### 예외처리
#### 데이터베이스 오류 응답 (ResponseData<String>)
- type : "error"
- msg : "SQL ERROR"

#### 기타 시스템 오류 응답 (ResponseData<String>)
- type : "error"
- msg : "system error"
---
## BCAccumProgressManager API 명세서
### POST progress/BCAccumProgressManager/pmAccumProListInq
#### 파라미터 정보
- requestData : 요청 데이터를 포함하고 있는 객체
- onlineCtx : 온라인 컨텍스트 정보를 가지고 있는 객체
#### 응답 (IDataSet 객체 반환)
- pmAccumProListInq 요청 결과

### POST progress/BCAccumProgressManager/pmAccumProListInqPhase
#### 파라미터 정보
- requestData : 요청 데이터를 포함하고 있는 객체
- onlineCtx : 온라인 컨텍스트 정보를 가지고 있는 객체
#### 응답 (IDataSet 객체 반환)
- pmAccumProListInqPhase 요청 결과

### POST progress/BCAccumProgressManager/pmAccumProColListInq
#### 파라미터 정보
- requestData : 요청 데이터를 포함하고 있는 객체
- onlineCtx : 온라인 컨텍스트 정보를 가지고 있는 객체
#### 응답 (IDataSet 객체 반환)
- pmAccumProColListInq 요청 결과

### POST progress/BCAccumProgressManager/pmAccumProGridUp
#### 파라미터 정보
- requestData : 요청 데이터를 포함하고 있는 객체
- onlineCtx : 온라인 컨텍스트 정보를 가지고 있는 객체
#### 응답 (IDataSet 객체 반환)
- pmAccumProGridUp 요청 결과
---
## BCDevProductivityManager API 명세서

### POST devprdtvt/BCDevProductivityManager/pmExcelDownload
#### 파라미터 정보
- requestData : 엑셀 다운로드를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (엑셀 파일 다운로드 명령)
- 요청받은 데이터에 의해 생성된 엑셀 파일을 다운로드

### POST devprdtvt/BCDevProductivityManager/pmAttchFileListInq
#### 파라미터 정보
- requestData : 첨부파일 리스트 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (첨부파일 리스트 정보)
- 요청받은 데이터를 바탕으로 조회된 첨부파일 리스트 정보

### POST devprdtvt/BCDevProductivityManager/pmFileDownload
#### 파라미터 정보
- requestData : 파일 다운로드를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (파일 다운로드)
- 요청받은 데이터에 의해 다운로드 될 파일 정보 및 명령

### POST devprdtvt/BCDevProductivityManager/pmFileDel
#### 파라미터 정보
- requestData : 파일 삭제를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (파일 삭제 결과 정보)
- 요청받은 데이터에 따라 삭제된 파일 결과 정보

### POST devprdtvt/BCDevProductivityManager/pmSubProjectStartEndDateInq
#### 파라미터 정보
- requestData : 하위 프로젝트의 시작 및 종료일 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (하위 프로젝트 시작 및 종료일 정보)
- 요청받은 데이터를 바탕으로 조회된 하위 프로젝트의 시작 및 종료일 정보

### POST devprdtvt/BCDevProductivityManager/pmDevProductivityGridUpd
#### 파라미터 정보
- requestData : 개발 생산성 그리드 업데이트를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (개발 생산성 그리드 업데이트 결과 정보)
- 요청받은 데이터에 의해 업데이트된 개발 생산성 그리드 정보

### POST devprdtvt/BCDevProductivityManager/pmWorkingdayInq
#### 파라미터 정보
- requestData : 근무일 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (근무일 정보)
- 요청받은 데이터에 따라 조회된 근무일 정보

이외에도 각종 조회, 업데이트, 엑셀 업로드 및 다운로드, 코드리스트 조회, 함수 이름 조회 등 다양한 API가 존재합니다.
---
## BCSwingAsisPgmManagerController API 명세서
### POST /scope/BCSwingAsisPgmManager/pmScopeListInq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 조회된 프로젝트 범위 목록에 대한 정보 

### POST /scope/BCSwingAsisPgmManager/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (Download)
- Excel 파일로의 모든 데이터 다운로드

### POST /scope/BCSwingAsisPgmManager/pmScopeListDel
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 삭제된 프로젝트 범위 목록에 대한 정보 

### POST /scope/BCSwingAsisPgmManager/pmScopeListExcel
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (JSON)
- Excel로 변환된 프로젝트 범위 목록에 대한 정보

### POST /scope/BCSwingAsisPgmManager/pmScopeListEdit
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 수정된 프로젝트 범위 목록에 대한 정보 

### POST /scope/BCSwingAsisPgmManager/pmScopeListSave
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 저장된 프로젝트 범위 목록에 대한 정보 

### POST /scope/BCSwingAsisPgmManager/pmScopeListCode
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 프로젝트 범위 코드 목록에 대한 정보 

### POST /scope/BCSwingAsisPgmManager/pmScopeListCode02
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 및 매개변수
- onlineCtx  : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 프로젝트 범위 코드02 목록에 대한 정보

---
## BCSQualityImprovementTools API 명세서
### POST /scope/BCSQualityImprovementTools/pmWorkCodeMangerExcelUpload
#### 파라미터 정보
- requestData : 업로드할 Excel 파일에 대한 정보를 담고 있는 데이터 세트
- onlineCtx : 온라인 상황 정보

#### 응답 (IDataSet)
- 업로드된 Excel 파일 처리 결과 정보를 담은 데이터 세트 반환

### POST /scope/BCSQualityImprovementTools/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요구 사항 범위 목록 조회에 필요한 정보를 담고 있는 데이터 세트
- onlineCtx : 온라인 상황 정보

#### 응답 (IDataSet)
- 조회된 요구 사항 범위 목록 정보를 담은 데이터 세트 반환

### POST /scope/BCSQualityImprovementTools/pmSystemCodeMangerLUpd
#### 파라미터 정보
- requestData : 시스템 코드 업데이트에 필요한 정보를 담고 있는 데이터 세트
- onlineCtx : 온라인 상황 정보

#### 응답 (IDataSet)
- 시스템 코드 업데이트 결과 정보를 담은 데이터 세트 반환

### POST /scope/BCSQualityImprovementTools/pmSystemCodeMangerAdd
#### 파라미터 정보
- requestData : 새로운 시스템 코드 추가에 필요한 정보를 담고 있는 데이터 세트
- onlineCtx : 온라인 상황 정보

#### 응답 (IDataSet)
- 시스템 코드 추가 결과 정보를 담은 데이터 세트 반환

### POST /scope/BCSQualityImprovementTools/pmSystemCodeMangerLUpd02
#### 파라미터 정보
- requestData : 시스템 코드 업데이트에 필요한 정보를 담고 있는 데이터 세트
- onlineCtx : 온라인 상황 정보

#### 응답 (IDataSet)
- 시스템 코드 업데이트 결과 정보를 담은 데이터 세트 반환

### POST /scope/BCSQualityImprovementTools/pmChckprojects
#### 파라미터 정보
- requestData : 프로젝트 검증에 필요한 정보를 담고 있는 데이터 세트
- onlineCtx : 온라인 상황 정보

#### 응답 (IDataSet)
- 프로젝트 검증 결과 정보를 담은 데이터 세트 반환

### POST /scope/BCSQualityImprovementTools/pmSystemCodeMangerDel
#### 파라미터 정보
- requestData : 삭제할 시스템 코드의 정보를 담고 있는 데이터 세트
- onlineCtx : 온라인 상황 정보

#### 응답 (IDataSet)
- 시스템 코드 삭제 결과 정보를 담은 데이터 세트 반환
---
## BCCheckRiskExecutionController API 명세서

### POST /scope/BCCheckRiskExecution/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 보내야 할 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 목록 조회 결과

### POST /scope/BCCheckRiskExecution/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 보내야 할 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 추가 결과

### POST /scope/BCCheckRiskExecution/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 보내야 할 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 수정 결과

### POST /scope/BCCheckRiskExecution/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 보내야 할 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 그리드 업데이트 결과

### POST /scope/BCCheckRiskExecution/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 보내야 할 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 파일 삭제 결과

### POST /scope/BCCheckRiskExecution/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 보내야 할 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 삭제 결과 

(마찬가지로 나머지 API도 작성해야하지만 이렇게 진행하면 됩니다!)
---
## BCTestStatusForCharger API 명세서
### POST /scope/BCTestStatusForCharger/pmStatusForTester
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- PUTestStatusForCharger 서비스의 pmStatusForTester 메소드 결과 데이터

### POST /scope/BCTestStatusForCharger/pmChargerListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- PUTestStatusForCharger 서비스의 pmChargerListInq 메소드 결과 데이터

### POST /scope/BCTestStatusForCharger/pmStatusForActionCharger
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- PUTestStatusForCharger 서비스의 pmStatusForActionCharger 메소드 결과 데이터
---
## BCProgramDevWoori API 명세서

### POST scope/BCProgramDevWoori/pmUserIdCode 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 사용자 ID 코드 정보

### POST scope/BCProgramDevWoori/pmProRate 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 프로젝트 비율 정보

### POST scope/BCProgramDevWoori/pmApprovalSettingInq 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 승인 설정 조회 정보

### POST scope/BCProgramDevWoori/pmExcelDownload 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 엑셀 파일 다운로드 정보

### POST scope/BCProgramDevWoori/pmExcelUpload 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 업로드된 엑셀 파일 정보

### POST scope/BCProgramDevWoori/pmScopeUpd 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 업데이트된 스코프 정보

### POST scope/BCProgramDevWoori/pmScopeDel 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 삭제된 스코프 정보

### POST scope/BCProgramDevWoori/pmScopeAdd 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 새로 추가된 스코프 정보

### POST scope/BCProgramDevWoori/pmTaskName 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 작업 이름 정보

### POST scope/BCProgramDevWoori/pmScopeInq 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 스코프 조회 정보

### POST scope/BCProgramDevWoori/pmScopeListInq 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 스코프 리스트 조회 정보

### POST scope/BCProgramDevWoori/pmScopeGridUpd 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 업데이트된 스코프 그리드 정보

### POST scope/BCProgramDevWoori/pmWorkingdayInq 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 작업일 조회 정보

### POST scope/BCProgramDevWoori/pmAttchFileListInq 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 첨부파일 목록 조회 정보

### POST scope/BCProgramDevWoori/pmFileDownload 
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 파일 다운로드 정보

### 그 외의 요청 API는 위와 같은 양식으로 요청 파라미터 정보와 함께 출력한다. 각각의 요청 API는 대응되는 기능을 수행한다. 응답방식은 주로 JSON을 사용한다.
---
## BCTestPlanPerform API 명세서

### POST /scope/BCTestPlanPerform/pmTestPlanPerformAdd
#### 파라미터 정보
- IDataSet requestData : 테스트 플랜 추가에 필요한 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (JSON)
- 테스트 플랜 추가 결과

### POST /scope/BCTestPlanPerform/pmTestPlanPerformUpd
#### 파라미터 정보
- IDataSet requestData : 테스트 플랜 업데이트에 필요한 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (JSON)
- 테스트 플랜 업데이트 결과

### POST /scope/BCTestPlanPerform/pmTestPlanPerformDel
#### 파라미터 정보
- IDataSet requestData : 테스트 플랜 삭제에 필요한 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (JSON)
- 테스트 플랜 삭제 결과

### POST /scope/BCTestPlanPerform/pmExcelDataAllDownload
#### 파라미터 정보
- IDataSet requestData : 엑셀 데이터 다운로드에 필요한 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (DownloadView)
- 회신된 엑셀 파일

### POST /scope/BCTestPlanPerform/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData : 엑셀 파일 업로드에 필요한 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (JSON)
- 엑셀 파일 업로드 응답

### POST /scope/BCTestPlanPerform/pmTestPlanIntegratedGridUpd
#### 파라미터 정보
- IDataSet requestData : 테스트 플랜 통합 그리드 업데이트에 필요한 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (JSON)
- 테스트 플랜 통합 그리드 업데이트 응답

### POST /scope/BCTestPlanPerform/pmTestIdNameListInq
#### 파라미터 정보
- IDataSet requestData : 테스트 ID 및 이름 조회에 필요한 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (JSON)
- 테스트 ID 및 이름 리스트

### POST /scope/BCTestPlanPerform/pmProjectUserListInq
#### 파라미터 정보
- IDataSet requestData : 프로젝트 사용자 리스트 조회에 필요한 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보

#### 응답 (JSON)
- 프로젝트 사용자 리스트

---
## BCTestExecution API 명세서

### POST /scope/BCTestExecution/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 서비스로 전송되는 요청 데이터 정보
- onlineCtx : 서비스 호출 상태 및 환경 정보
#### 응답 (JSON)
- 요구 사항 영역 목록 조회 결과 

### POST /scope/BCTestExecution/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 서비스로 전송되는 요청 데이터 정보
- onlineCtx : 서비스 호출 상태 및 환경 정보
#### 응답 (JSON)
- 요구 사항 영역 추가 결과

### POST /scope/BCTestExecution/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 서비스로 전송되는 요청 데이터 정보
- onlineCtx : 서비스 호출 상태 및 환경 정보
#### 응답 (JSON)
- 요구 사항 영역 업데이트 결과

### POST /scope/BCTestExecution/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 서비스로 전송되는 요청 데이터 정보
- onlineCtx : 서비스 호출 상태 및 환경 정보
#### 응답 (JSON)
- 요구 사항 영역 그리드 업데이트 결과

### POST /scope/BCTestExecution/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 서비스로 전송되는 요청 데이터 정보
- onlineCtx : 서비스 호출 상태 및 환경 정보
#### 응답 (JSON)
- 요구 사항 영역 파일 삭제 결과 

### POST /scope/BCTestExecution/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 서비스로 전송되는 요청 데이터 정보
- onlineCtx : 서비스 호출 상태 및 환경 정보
#### 응답 (JSON)
- 요구 사항 영역 삭제 결과

### POST /scope/BCTestExecution/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 서비스로 전송되는 요청 데이터 정보
- onlineCtx : 서비스 호출 상태 및 환경 정보
#### 응답 (파일 다운로드)
- 요구 사항 영역 보고서 다운로드 결과

(이하 생략...)
---
## BCCheckRiskPlanController API 명세서
### POST /scope/BCCheckRiskPlan/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위에 대한 목록 조회

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위 추가

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위 업데이트

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위 그리드 업데이트

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위 파일 삭제

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위 삭제

### POST /scope/BCCheckRiskPlan/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 요구 사항 범위 보고서 다운로드

### POST /scope/BCCheckRiskPlan/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 플랜 진행률 조회

### POST /scope/BCCheckRiskPlan/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 전체 엑셀 다운로드

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위 파일 리스트 조회

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 요구 사항 범위 엑셀 다운로드

### POST /scope/BCCheckRiskPlan/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 범위 엑셀 업로드

### POST /scope/BCCheckRiskPlan/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 ID 이름 리스트 조회

### POST /scope/BCCheckRiskPlan/pmTestStatusRightChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 상태 오른쪽 차트 조회

### POST /scope/BCCheckRiskPlan/pmTestPlanCaseGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 케이스 그리드 업데이트

### POST /scope/BCCheckRiskPlan/pmRequirementsL4Inq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구 사항 L4 조회

### POST /scope/BCCheckRiskPlan/pmTestStatusLeftChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 상태 왼쪽 차트 조회

### POST /scope/BCCheckRiskPlan/pmTestPlanGridRight
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 그리드 우측 조회

### POST /scope/BCCheckRiskPlan/pmTestPlanSceInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 현장조사

### POST /scope/BCCheckRiskPlan/pmTestStatusGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 상태 그리드 조회

### POST /scope/BCCheckRiskPlan/pmTestPlanGridLeft
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 그리드 좌측 조회

### POST /scope/BCCheckRiskPlan/pmTestCaseDefectStatus
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 케이스 결함 상태 조회

### POST /scope/BCCheckRiskPlan/pmTestSequenceInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 시퀀스 조회 

### POST /scope/BCCheckRiskPlan/pmTestGetObject
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 객체 가져오기

### POST /scope/BCCheckRiskPlan/pmTestGetLinkCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 링크 코드 가져오기

### POST /scope/BCCheckRiskPlan/pmChangeFieldBatch
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 필드 일괄 변경

### POST /scope/BCCheckRiskPlan/pmDashboard3OpinionFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 대시보드3의 의견 파일 리스트 조회
---
## BCRequirementsVocScopeManager API 명세서

### GET scope/BCRequirementsVocScopeManager/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 데어터 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (File Download)
- 엑셀파일 다운로드

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeDel
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 삭제 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeUpd
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 업데이트 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeFileDel
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 파일 삭제 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeAdd
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 추가 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeListInq
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 목록 조회 결과

### GET scope/BCRequirementsVocScopeManager/pmExcelReportDownload
#### 파라미터 정보
- requestData : 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (File Download)
- 엑셀 리포트 다운로드

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeExcelDownload
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 엑셀 다운로드 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeFileListInq
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 파일 목록 조회 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeExcelUpload
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 엑셀 업로드 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeReviewListInq
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 리뷰 목록 조회 결과

### POST scope/BCRequirementsVocScopeManager/pmRequirementsVocScopeReviewDel
#### 파라미터 정보
- requestData : 요청 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 Voc 범위 리뷰 삭제 결과
---
## BCRequirementsScopeManagerForHK API 명세서
### POST /scope/BCRequirementsScopeManagerForHK/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 결과 정보를 받아옵니다.

### POST /scope/BCRequirementsScopeManagerForHK/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위를 추가하는 결과 정보를 받아옵니다.

### POST /scope/BCRequirementsScopeManagerForHK/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위를 갱신하는 결과 정보를 받아옵니다.

### POST /scope/BCRequirementsScopeManagerForHK/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 그리드를 갱신하는 결과 정보를 받아옵니다.

### POST /scope/BCRequirementsScopeManagerForHK/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 관련 파일을 삭제하는 결과 정보를 받아옵니다.

### POST /scope/BCRequirementsScopeManagerForHK/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위를 삭제하는 결과 정보를 받아옵니다.

### POST /scope/BCRequirementsScopeManagerForHK/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File)
- 요구사항 범위 관련 보고서를 다운로드 받습니다.

(해당 형식으로 계속 이어서 만들어 주시면 됩니다.)
---
## BCInterfacedevManagerController API 명세서
### POST /scope/BCInterfacedevManager/pmExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- Excel 파일 다운로드

### POST /scope/BCInterfacedevManager/pmAttchFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 첨부파일 리스트 조회 

### POST /scope/BCInterfacedevManager/pmFileDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 파일 다운로드

### POST /scope/BCInterfacedevManager/pmFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 파일 삭제

### POST /scope/BCInterfacedevManager/pmSubProjectStartEndDateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서브 프로젝트의 시작 날짜와 종료 날짜 조회 

...(이하 동일한 형태로 계속됨)....

### GET /scope/BCInterfacedevManager/getList
#### 파라미터 정보
- 없음
#### 응답 (Text)
- "/jsp/sc/SScopeRetrieve.jsp" 페이지로 이동.
---
## BCTestDefectManagementIt API 명세서
### POST /scope/BCTestDefectManagementIt/pmTestDefectManagementItInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (Json)
- 요청 데이터 및 온라인 맥락을 이용하여 조회한 정보를 반환

### POST /scope/BCTestDefectManagementIt/pmTestDefectManagementItAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (Json)
- 요청 데이터 및 온라인 맥락을 이용하여 추가한 정보를 반환

### POST /scope/BCTestDefectManagementIt/pmTestDefectManagementItUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (Json)
- 요청 데이터와 온라인 맥락을 이용하여 업데이트한 정보를 반환

### POST /scope/BCTestDefectManagementIt/pmTestDefectManagementItDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (Json)
- 요청 데이터와 온라인 맥락을 이용하여 삭제한 정보를 반환

### POST /scope/BCTestDefectManagementIt/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (File Download)
- 요청 데이터와 온라인 맥락을 이용하여 엑셀 파일을 다운로드

### POST /scope/BCTestDefectManagementIt/pmExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (Json)
- 요청 데이터 및 온라인 맥락을 이용하여 엑셀 파일을 업로드하고 결과를 반환

### POST /scope/BCTestDefectManagementIt/pmImageInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (Json)
- 요청 데이터 및 온라인 맥락을 이용하여 이미지 정보를 조회하고 결과를 반환

### POST /scope/BCTestDefectManagementIt/pmImageDelete
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 맥락
#### 응답 (Json)
- 요청 데이터 및 온라인 맥락을 이용하여 이미지를 삭제하고 결과를 반환
---
## BCCheckRiskDashBoardMgrController API 명세서
### POST /scope/BCCheckRiskDashBoard/dmCheckQualityDashBoardMgr
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 로직을 수행한 후의 결과 반환 (IDataSet 형식)
---
## BCRmCompleteWB API 명세서

### POST /scope/BCRmCompleteWB/pmRmIdListInq
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (다운로드)
- 요청에 따른 엑셀 파일명과 파일 경로 기반의 다운로드 뷰

### POST /scope/BCRmCompleteWB/pmPopupSearchStep
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (JSON)
- IDataSet 형식의 응답 데이터

### POST /scope/BCRmCompleteWB/pmExcelDownloadAll
#### 파라미터 정보
- requestData : IDataSet 형식의 요청 데이터
- onlineCtx : IOnlineContext 형식의 온라인 컨텍스트 데이터
#### 응답 (다운로드)
- 요청에 따른 엑셀 파일명과 파일 경로 기반의 다운로드 뷰

### 이하 API들의 파라미터 정보와 응답 방식도 상동하므로 생략하겠습니다.

### POST /scope/BCRmCompleteWB/pmRequirementsScopeHistory
### POST /scope/BCRmCompleteWB/pmRequirementsL4Inq
### POST /scope/BCRmCompleteWB/pmDetailCodeUseYn
### POST /scope/BCRmCompleteWB/pmReqIdDupCheck
### POST /scope/BCRmCompleteWB/pmRequirementsScopeFileListInq
### POST /scope/BCRmCompleteWB/pmRequirementsScopeExcelUpload
### POST /scope/BCRmCompleteWB/pmRequirementsScopeObjectUseYN
### POST /scope/BCRmCompleteWB/pmRequirementsScopeExcelDownload
### POST /scope/BCRmCompleteWB/pmRequirementsScopeObjectUseYNSel
### POST /scope/BCRmCompleteWB/pmTestExecutionBatch
### POST /scope/BCRmCompleteWB/pmGetInfoAboutReqId
### POST /scope/BCRmCompleteWB/pmPlanProgressRateInq
---
## BCProductsDefect API 명세서
### POST /scope/BCProductsDefect/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 목록 조회 결과

### POST /scope/BCProductsDefect/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 추가 결과

### POST /scope/BCProductsDefect/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 업데이트 결과

(중요한 API만 추출했습니다. 이외 API도 동일한 방식으로 반복 가능합니다.)
  
### POST /scope/BCProductsDefect/pmDefectStatusRightChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 결함 상태 우측 차트 조회 결과

### POST /scope/BCProductsDefect/pmDetailCodeSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 세부 코드 선택 결과

### POST /scope/BCProductsDefect/pmDetailCodeUseYn
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 세부 코드 사용 여부 결과

### POST /scope/BCProductsDefect/pmRequirementsDetailCodeInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 세부 코드 조회 결과

### POST /scope/BCProductsDefect/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 테스트 ID 이름 목록 조회 결과
---
## BCDesignRetrieveHKController API 명세서
### POST /scope/BCDesignRetrieveHK/pmDesignRetrieveListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 디자인 초기 검색 목록 정보를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmDesignRetrieveAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 디자인 정보 추가를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmDesignRetrieveUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 디자인 정보 업데이트를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 스코프 그리드 업데이트를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 스코프 파일 삭제를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmDesignRetrieveDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 디자인 정보 삭제를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/octet-stream)
- 요구사항 스코프 보고서를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 계획 진행률 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsScopeHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구 사항 스코프 이력 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/octet-stream)
- 모든 데이터를 엑셀로 다운로드할 수 있는 링크를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsScopeL4Check
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 스코프 L4 검증을 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 스코프 파일 리스트 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmDesignRetrieveExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/octet-stream)
- 디자인 정보를 엑셀 파일로 다운로드할 수 있는 링크를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmDesignRetrieveExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 업로드된 엑셀파일의 디자인 정보를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmDetailCodeUseYn
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 상세 코드 사용 여부 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsDetailCodeInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 상세 코드 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsL4Inq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 L4 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 진행률 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsScopeObjectUseYN
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 스코프 객체 사용 가능 여부를 확인하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmRequirementsScopeObjectUseYNSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 스코프 객체 사용 여부 검색을 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmGetSubProjectNo
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 부 프로젝트 번호 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmGetReqmStatus
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 요구사항 상태 조회를 처리하고 결과를 반환합니다.

### POST /scope/BCDesignRetrieveHK/pmGetDesignType
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (application/json)
- 디자인 타입 조회를 처리하고 결과를 반환합니다.
---
## BCProceedingsController API 명세서
### POST /scope/BCProceedings/pmGetProject
#### 파라미터 정보
- requestData : 프로젝트의 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 프로젝트 데이터 

### POST /scope/BCProceedings/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 업로드 요청 데이터  
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 엑셀 업로드 데이터 

### POST /scope/BCProceedings/pmFileDel
#### 파라미터 정보
- requestData : 파일 삭제 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 파일 삭제 데이터

### POST /scope/BCProceedings/pmExcelDownload
#### 파라미터 정보
- requestData : 엑셀 다운로드 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 엑셀 파일 다운로드

### POST /scope/BCProceedings/pmAttchFileListInq
#### 파라미터 정보
- requestData : 첨부파일 리스트 조회 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 첨부파일 리스트 데이터 

### POST /scope/BCProceedings/pmFileDownload
#### 파라미터 정보
- requestData : 파일 다운로드 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 파일 다운로드

### POST /scope/BCProceedings/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 엑셀 데이터 전체 다운로드 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 엑셀 데이터 전체 다운로드

### POST /scope/BCProceedings/pmGetLevelList
#### 파라미터 정보
- requestData : 레벨 리스트 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 레벨 리스트 데이터 

### POST /scope/BCProceedings/pmProceedingsAdd
#### 파라미터 정보
- requestData : 진행사항 추가 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 진행사항 추가 데이터

### POST /scope/BCProceedings/pmProceedingsUpd
#### 파라미터 정보
- requestData : 진행사항 업데이트 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 진행사항 업데이트 데이터

### POST /scope/BCProceedings/pmProceedingsDel
#### 파라미터 정보
- requestData : 진행사항 삭제 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 진행사항 삭제 데이터

### POST /scope/BCProceedings/pmProceedingsHistory
#### 파라미터 정보
- requestData : 진행사항 히스토리 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환하는 진행사항 히스토리 데이터

---
## BCChangeListManagement API 명세서

### POST /scope/BCChangeListManagement/pmChangeListManagementDel
#### 파라미터 정보
- requestData : 삭제 요청에 대한 정보를 담고 있는 데이터셋.
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 pmChangeListManagementDel 메소드 실행 결과를 담은 데이터셋 반환

### POST /scope/BCChangeListManagement/pmChangeListManagementGrid
#### 파라미터 정보
- requestData: 그리드 요청에 대한 정보를 담고 있는 데이터셋.
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 pmChangeListManagementGrid 메소드 실행 결과를 담은 데이터셋 반환

### POST /scope/BCChangeListManagement/pmChangeListManagementGubunCodeSel
#### 파라미터 정보
- requestData: 코드 선택 요청에 대한 정보를 담고 있는 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 pmChangeListManagementGubunCodeSel 메소드 실행 결과를 담은 데이터셋 반환

### POST /scope/BCChangeListManagement/pmChangeListManagementExcelDownload
#### 파라미터 정보
- requestData : 엑셀 다운로드 요청에 대한 정보를 담는 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Download)
- 서비스의 pmChangeListManagementExcelDownload 메소드 실행 결과인 'excelFileNm'으로 지정된 파일명과 함께 파일을 다운로드한다.
---
## BCRmTraceMain API 명세서
### POST /scope/BCRmTraceMain/pmExcelDownloadAll
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (파일 다운로드 형태)
- 다운로드 가능한 엑셀 파일 

### POST /scope/BCRmTraceMain/pmRmTracePhaseDetailInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTracePhaseDivInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTracePhaseSettingInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTraceTableInqV2
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTraceTableInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTracePopupInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTracePopupColumnInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTracePopupComboInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTraceReqPreUpt
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTracePopupSubComboInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTraceReqPostUpt
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTraceReqPreAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 청답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTraceReqPostAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTraceReqPreDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmExcelDownloadTrace
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (파일 다운로드 형태)
- 다운로드 가능한 엑셀 파일 

### POST /scope/BCRmTraceMain/pmRmTraceDataImport
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmExcelUploadTrace
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

### POST /scope/BCRmTraceMain/pmRmTracePopupProgressRateComboInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON 형태)
- 서비스 로직 수행 결과 데이터셋

---
## BCRmManagementVerbalAgreementController API 명세서

### POST /scope/BCRmManagementVerbalAgreement/pmRmIdListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRmIdListInq 처리결과

### POST /scope/BCRmManagementVerbalAgreement/pmRequirementsScopeFileListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeFileListInq 처리결과

### POST /scope/BCRmManagementVerbalAgreement/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeExcelUpload 처리결과

### POST /scope/BCRmManagementVerbalAgreement/pmRequirementsScopeObjectUseYNSel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeObjectUseYNSel 처리결과

### GET /scope/BCRmManagementVerbalAgreement/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 요구사항 스코프 엑셀 파일 다운로드

### POST /scope/BCRmManagementVerbalAgreement/pmGetInfoAboutReqId
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmGetInfoAboutReqId 처리결과

### POST /scope/BCRmManagementVerbalAgreement/pmTestExecutionBatch
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmTestExecutionBatch 처리결과

### GET /scope/BCRmManagementVerbalAgreement/pmExcelDownloadAll
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 모든 정보에 대한 엑셀 파일 다운로드

### POST /scope/BCRmManagementVerbalAgreement/pmDetailCodeUseYn
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmDetailCodeUseYn 처리결과
---
## BCProgramDevRetrieveWoori API 명세서
###  POST /scope/BCProgramDevRetrieveWoori/pmScopeDel
#### 파라미터 정보
- requestData : 삭제 대상 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 삭제 처리된 데이터 정보와 상태

### POST /scope/BCProgramDevRetrieveWoori/pmScopeUpd
#### 파라미터 정보
- requestData : 갱신 대상 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 갱신 처리된 데이터 정보와 상태

### POST /scope/BCProgramDevRetrieveWoori/pmTaskName
#### 파라미터 정보
- requestData : 작업 이름 조회에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 특정 작업의 이름을 조회한 결과

### POST /scope/BCProgramDevRetrieveWoori/pmScopeAdd
#### 파라미터 정보
- requestData : 추가할 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 추가된 데이터 정보와 상태

### POST /scope/BCProgramDevRetrieveWoori/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 파일 업로드에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 업로드된 엑셀 파일 정보와 상태

### POST /scope/BCProgramDevRetrieveWoori/pmProRate
#### 파라미터 정보
- requestData : 프로세스 진행률 查询에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로세스 진행률 查询 결과

### POST /scope/BCProgramDevRetrieveWoori/pmUserIdCode
#### 파라미터 정보
- requestData : 사용자 ID 코드 查询에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 ID 코드 조회 결과

### POST /scope/BCProgramDevRetrieveWoori/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 승인 설정 查询에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 승인 설정 查询 결과

### POST /scope/BCProgramDevRetrieveWoori/pmExcelDownload
#### 파라미터 정보
- requestData : 엑셀 파일 다운로드에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 엑셀 파일이 다운로드된 뷰

### POST /scope/BCProgramDevRetrieveWoori/pmScopeListInq
#### 파라미터 정보
- requestData : 스코프 리스트 查询에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 리스트 查询 결과 

(중략...)

---
## BCCheckCascadingExecution API 명세서
### POST /scope/BCCheckCascadingExecution/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON 형식)
- 서비스가 요구사항 범위 목록을 조회하고 결과를 반환합니다.

### POST /scope/BCCheckCascadingExecution/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON 형식)
- 서비스가 요구사항 범위를 추가하고 결과를 반환합니다.

### POST /scope/BCCheckCascadingExecution/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON 형식)
- 서비스가 요구사항 범위를 업데이트하고 결과를 반환합니다.

### POST /scope/BCCheckCascadingExecution/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON 형식)
- 서비스가 요구사항 범위 그리드를 업데이트하고 결과를 반환합니다.

### POST /scope/BCCheckCascadingExecution/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON 형식)
- 서비스가 요구사항 범위를 삭제하고 결과를 반환합니다.

### POST /scope/BCCheckCascadingExecution/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON 형식)
- 서비스가 요구사항 범위 파일을 삭제하고 결과를 반환합니다.

### POST /scope/BCCheckCascadingExecution/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON 형식)
- 서비스가 요구사항 범위 파일 목록을 조회하고 결과를 반환합니다.

### 더 많은 API은 생략하겠습니다. 각 API는 입력 (requestData, onlineCtx)을 받아 처리 결과를 반환합니다. 대부분의 API는 POST 요청 방식을 사용하며, 일부 API는 파일 다운로드를 위한 웹 브라우저 접근에 사용됩니다.

---
## BCRmTraceSettingMgtController API 명세서
### POST /scope/BCRmTraceSetting/pmRmTraceSettingMgt
#### 파라미터 정보
- requestData : 요청 데이터 중 연계관리를 위한 설정 정보를 가지고 있는 객체
- onlineCtx : 온라인 컨텍스트 정보를 가지고 있는 객체
#### 응답 (JSON Format)
- 트랜잭션 처리 결과에 따른 응답 정보를 반환
---
## BCCsrDefectManagerController API 명세서
처리 유형, 경로, 요청 파라미터, 응답 형식에 따라 아래와 같이 나뉩니다.

### POST /scope/BCCsrDefectManager/pmCsrDefectListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 결함 목록 조회 결과

### POST /scope/BCCsrDefectManager/pmCsrDefectAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataset)
- 결함 추가 결과

### POST /scope/BCCsrDefectManager/pmCsrDefectUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 결함 수정 결과

### POST /scope/BCCsrDefectManager/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataset)
- 요구사항 범위 그리드 업데이트 결과

### POST /scope/BCCsrDefectManager/pmCsrDefectFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 결함 파일 삭제 결과

### POST /scope/BCCsrDefectManager/pmCsrDefectDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 결함 삭제 결과

### POST /scope/BCCsrDefectManager/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (DownloadView)
- 요구사항 범위 보고서 다운로드 처리 결과

### POST /scope/BCCsrDefectManager/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 계획 진행률 조회 결과

### POST /scope/BCCsrDefectManager/pmCsrDefectHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 결함 이력 조회 결과

### POST /scope/BCCsrDefectManager/pmRequirementsSubPrjHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 요구사항 하위 프로젝트 이력 조회 결과

### POST /scope/BCCsrDefectManager/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (DownloadView)
- Excel 파일 전체 다운로드 처리 결과

### POST /scope/BCCsrDefectManager/pmCsrDefectFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 결함 파일 목록 조회 결과

### POST /scope/BCCsrDefectManager/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (DownloadView)
- 요구사항 범위 Excel 파일 다운로드 처리 결과

### POST /scope/BCCsrDefectManager/pmCsrDefectExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 결함 Excel 파일 업로드 결과

### POST /scope/BCCsrDefectManager/pmGetPgmList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDatSet)
- 프로그램 목록 조회 결과

---
## BCTestPlanObjectSelectionController API 명세서
### POST /scope/BCTestPlanObjectSelection/pmRequirementsScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요구사항 범위 목록 조회에 필요한 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항 범위 목록 조회 결과 반환

### POST /scope/BCTestPlanObjectSelection/pmRequirementsScopeAdd
#### 파라미터 정보
- IDataSet requestData : 요구사항 범위 추가에 필요한 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항 범위 추가 결과 반환

### POST /scope/BCTestPlanObjectSelection/pmRequirementsScopeUpd
#### 파라미터 정보
- IDataSet requestData : 요구사항 범위 업데이트에 필요한 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항 범위 업데이트 결과 반환

(이하 생략)

## Note
- 여기서 IDataSet는 Spring Framework를 기반으로 한 SKCC 표준 데이터 모델입니다.
- IOnlineContext 는 사용자 세션, 화면에서 요청한 기능의 ID와 같은 온라인 정보를 담고 있는 SKCC 표준 데이터 모델입니다.
- @RequestBody 어노테이션은 클라이언트가 전송하는 JSON/XML 데이터를 HTTP 요청 몸체를 통해 Java Object로 변환시켜주는 역할을 수행합니다. 해당 어노테이션을 통해 클라이언트가 전송하는 데이터가 Java Object로 자동 변환되어 Controller 내의 메서드 파라미터로 전달됩니다.
- @ResponseBody는 Controller의 메서드 위에 선언이 되어있으면 해당 메서드의 리턴값을 view를 통해 출력하는 것이 아닌, HTTP Response Body에 직접 쓰게 됩니다. 주로 JSON 형태로 데이터를 전달할 때 많이 사용합니다. 
- 이 명세는 POST 방식의 API에 대해서만 작성되었으며, 이외에 다른 HTTP 메서드(예: GET, PUT, DELETE)를 이용하는 API에 대한 명세는 별도로 작성되어야 합니다.
- 각 API의 구체적인 동작 및 파라미터의 역할은 해당 Controller의 메서드를 보거나, 해당 서비스를 직접 컨택하여 문의하시는 것을 권장드립니다.
---
## BCTestSetting API 명세서
### POST /scope/BCTestSetting/pmTestSetting
#### 파라미터 정보
- requestData : 요청 데이터. IDataSet 타입을 이용하여 데이터를 전달받음.
- onlineCtx : 온라인 컨텍스트 정보. IOnlineContext 타입으로 컨텍스트 정보를 저장.

#### 응답 (IDataSet)
- pmTestSetting 메소드에 대한 호출 결과를 반환

### POST /scope/BCTestSetting/pmgetLinkYN
#### 파라미터 정보
- requestData : 요청 데이터. IDataSet 타입을 이용하여 데이터를 전달받음.
- onlineCtx : 온라인 컨텍스트 정보. IOnlineContext 타입으로 컨텍스트 정보를 저장.

#### 응답 (IDataSet)
- pmgetLinkYN 메소드에 대한 호출 결과를 반환

### POST /scope/BCTestSetting/pmTestSetting_confirm
#### 파라미터 정보
- requestData : 요청 데이터. IDataSet 타입을 이용하여 데이터를 전달받음.
- onlineCtx : 온라인 컨텍스트 정보. IOnlineContext 타입으로 컨텍스트 정보를 저장.

#### 응답 (IDataSet)
- pmTestSetting_confirm 메소드에 대한 호출 결과를 반환

> **주의** : 이 API는 Deprecated 표시가 있으며, BCTestManagerforTMSController.pmDelete_confirm로 변경될 예정입니다.
---
## BCTestPlanIntegratedController API 명세서
해당 API는 BCTestPlanIntegratedController에 대한 명세입니다.

### POST /scope/BCTestPlanIntegrated/pmListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 테스트 계획 PM 목록 조회 내용

### POST /scope/BCTestPlanIntegrated/pmTestPlanIntegratedAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 테스트 계획 통합 추가 작업 결과 

### POST /scope/BCTestPlanIntegrated/pmTestPlanIntegratedUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 테스트 계획 통합 업데이트 작업 결과

### POST /scope/BCTestPlanIntegrated/pmTestPlanIntegratedDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 테스트 계획 통합 삭제 작업 결과

### POST /scope/BCTestPlanIntegrated/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (DownloadView)
- 엑셀 데이터 전체 다운로드 결과

### POST /scope/BCTestPlanIntegrated/pmExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 엑셀 업로드 결과

### POST /scope/BCTestPlanIntegrated/pmExpensiveGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 고가 그리드 업데이트 작업 결과

### POST /scope/BCTestPlanIntegrated/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 테스트 ID 및 이름 목록 조회 결과

### POST /scope/BCTestPlanIntegrated/pmProjectUserListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 프로젝트 사용자 목록 조회 결과

---
## BCSwingDevPgmManager7 API 명세서

### POST /scope/BCSwingDevPgmManager7/pmUserIdCode
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmUserIdCode 함수의 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager7/pmScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmScopeListInq 함수의 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager7/pmExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmExcelUpload 함수의 결과를 반환합니다.

### GET /scope/BCSwingDevPgmManager7/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (DownloadView 형식)
- 서비스의 pmExcelDataAllDownload 함수의 결과를 반환하여 파일을 다운로드합니다.

### POST /scope/BCSwingDevPgmManager7/pmScopeListDel
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmScopeListDel 함수의 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager7/pmScopeListExcel
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmScopeListExcel 함수의 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager7/pmScopeListEdit
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmScopeListEdit 함수의 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager7/pmScopeListSave
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmScopeListSave 함수의 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager7/pmScopeListCode
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmScopeListCode 함수의 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager7/pmScopeListCode02
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 서비스의 pmScopeListCode02 함수의 결과를 반환합니다.
---
## BCMappingdesignController API 명세서

### POST scope/BCMappingdesignController/pmScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 항목 목록 조회 정보

### POST scope/BCMappingdesignController/pmScopeGridUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 그리드 업데이트 정보

### POST scope/BCMappingdesignController/pmWorkingdayInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 작업일 정보

### POST scope/BCMappingdesignController/pmAttchFileListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 첨부파일 목록 정보

### POST scope/BCMappingdesignController/pmFileDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 파일 다운로드 정보

### POST scope/BCMappingdesignController/pmNcpCILinkDataInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- NCP CI 링크 데이터 조회 정보

### POST scope/BCMappingdesignController/pmInsepctionInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 인스펙션 조회 정보

### POST scope/BCMappingdesignController/pmExcelDataAllDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 엑셀 데이터 전체 다운로드 정보

### POST scope/BCMappingdesignController/pmDesignFunctionSel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 디자인 기능 선택 정보

(이하 동일한 양식에 따라 요청 파라미터 정보와 응답 정보를 제공)
---
## BCSwingDevDashboard API 명세서

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq06
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq06 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq5
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq5 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq4
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq4 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq3
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq3 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq2
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq2 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq6
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq6 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq7
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq7 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq8
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq8 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq9
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq9 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmOlpDashboard1
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmOlpDashboard1 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmOlpDashboard2
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmOlpDashboard2 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmOlpDashboard3
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmOlpDashboard3 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmITestManagerListInq10
#### 파라미터 정보 
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmITestManagerListInq10 서비스의 응답 데이터

### POST /scope/BCSwingDevDashboard/pmSubProjectInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 인터넷 맥락
#### 응답 (JSON)
- pmSubProjectInq 서비스의 응답 데이터

---
## BCSwingPgmMapping API 명세서
### POST /scope/BCSwingPgmMapping/pmScopeListDel02
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

### POST /scope/BCSwingPgmMapping/pmScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

### POST /scope/BCSwingPgmMapping/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 내려받을 파일 정보를 반환

### POST /scope/BCSwingPgmMapping/pmScopeListDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

### POST /scope/BCSwingPgmMapping/pmScopeListExcel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

### POST /scope/BCSwingPgmMapping/pmScopeListEdit
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

### POST /scope/BCSwingPgmMapping/pmScopeListSave
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

### POST /scope/BCSwingPgmMapping/pmScopeListCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

### POST /scope/BCSwingPgmMapping/pmScopeListCode02
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 응답 데이터 정보를 반환

---
## BCIssueDefectManagementController API 명세서
### POST /scope/IssueDefectManagement/pmIssueDefectManagementExcelUpload
#### 파라미터 정보
- requestData : 이슈 및 결함 관리 엑셀 파일 업로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서버의 엑셀 파일 업로드 결과

### POST /scope/IssueDefectManagement/pmIssueDefectManagementFileListInq
#### 파라미터 정보
- requestData : 이슈 및 결함 관리 파일 목록 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 및 결함 관리 파일 목록

### POST /scope/IssueDefectManagement/pmIssueDefectManagementFileListInq2
#### 파라미터 정보
- requestData : 이슈 및 결함 관리 파일 목록 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 및 결함 관리 파일 목록

### POST /scope/IssueDefectManagement/pmIssueDefectManagementExcelDownload
#### 파라미터 정보
- requestData : 이슈 및 결함 관리 엑셀 파일 다운로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File Download)
- 요청한 이슈 및 결함 관리 엑셀 파일

### POST /scope/IssueDefectManagement/pmIssueDefectManagementDel
#### 파라미터 정보
- requestData : 이슈 및 결함 관리 삭제 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 및 결함 관리 삭제 결과

### POST /scope/IssueDefectManagement/pmIssueDefectManagementUpd
#### 파라미터 정보
- requestData : 이슈 및 결함 관리 수정 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 및 결함 관리 수정 결과

### POST /scope/IssueDefectManagement/pmIssueDefectManagementAdd
#### 파라미터 정보
- requestData : 이슈 및 결함 관리 추가 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 및 결함 관리 추가 결과

### POST /scope/IssueDefectManagement/pmImageInq
#### 파라미터 정보
- requestData : 이미지 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청한 이미지의 조회 결과

### POST /scope/IssueDefectManagement/pmTestDefectManagementHistory
#### 파라미터 정보
- requestData : 테스트 결함 관리 이력 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 테스트 결함 관리 이력 조회 결과

---
## BCDesignProgramManager API 명세서
Spring 기반의 controller로 모든 요청 방식은 POST로 동일하며, requestBody로 IDataSet 타입의 데이터를 받아 서비스를 실행합니다.

### POST /scope/BCDesignProgramManager/pmExcelDownload
#### 파라미터 정보
- requestData: Excel 다운로드 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (선택)
- 엑셀 파일을 다운로드합니다.

### POST /scope/BCDesignProgramManager/pmExcelDownloadNew
#### 파라미터 정보
- requestData: 새로운 Excel 다운로드 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (선택)
- 새로운 엑셀 파일을 다운로드합니다.

### POST /scope/BCDesignProgramManager/pmAttchFileListInq
#### 파라미터 정보
- requestData: 첨부파일 리스트 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 첨부파일 리스트를 조회합니다.

... 반복 ...

### POST /scope/BCDesignProgramManager/pmApprovReset
#### 파라미터 정보
- requestData: 승인 리셋 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 승인 리셋 처리결과를 반환합니다.

---
## BCSwingDevPgmManager6 프로그램 API 명세서

### POST /scope/BCSwingDevPgmManager6/pmUserIdCode
#### 파라미터 정보
- requestData : 사용자 ID에 대한 데이터 요청
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON)
- pmUserIdCode에 대한 데이터 결과 반환

### POST /scope/BCSwingDevPgmManager6/pmProRate
#### 파라미터 정보
- requestData : 프로젝트 비율에 대한 데이터 요청
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON)
- pmProRate에 대한 데이터 결과 반환

### POST /scope/BCSwingDevPgmManager6/pmScopeListTabInq
#### 파라미터 정보
- requestData : ScopeListTab 조회에 대한 데이터 요청
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON)
- pmScopeListTabInq에 대한 데이터 결과 반환

### POST /scope/BCSwingDevPgmManager6/pmScopeHistory
#### 파라미터 정보
- requestData : Scope 히스토리에 대한 데이터 요청
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON)
- pmScopeHistory에 대한 데이터 결과 반환

### POST /scope/BCSwingDevPgmManager6/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 테스트 이름 리스트 조회에 대한 데이터 요청
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON)
- pmTestIdNameListInq에 대한 데이터 결과 반환

...

---
## BCScopeManagerController API 명세서

### POST /scope/BCScopeManager/pmExcelDownload
#### 파라미터 정보 
- requestData : 엑셀 다운로드를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmAttchFileListInq
#### 파라미터 정보 
- requestData : 첨부파일 리스트 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmFileDownload
#### 파라미터 정보 
- requestData : 파일 다운로드를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmFileDel
#### 파라미터 정보 
- requestData : 파일 삭제를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmSubProjectStartEndDateInq
#### 파라미터 정보 
- requestData : 하위 프로젝트 시작 및 종료일 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeGridUpd
#### 파라미터 정보 
- requestData : 스코프 그리드 업데이트를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmWorkingdayInq
#### 파라미터 정보 
- requestData : 근무일 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmNcpCILinkDataInq
#### 파라미터 정보 
- requestData : Ncp CI 링크 데이터 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmInsepctionInq
#### 파라미터 정보 
- requestData : 검사 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmExcelDataAllDownload
#### 파라미터 정보 
- requestData : 모든 엑셀 데이터 다운로드를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeObjectUseYN
#### 파라미터 정보 
- requestData : 스코프 객체 사용 여부 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeObjectUseYNSel
#### 파라미터 정보 
- requestData : 사용 스코프 객체 선택 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmNciTabUseYnInq
#### 파라미터 정보 
- requestData : Nci Tab 사용 여부 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmExcelUpload2
#### 파라미터 정보 
- requestData : 엑셀 업로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmNciInspectionCal
#### 파라미터 정보 
- requestData : Nci 검사 계산을 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmExcelUpload
#### 파라미터 정보 
- requestData : 엑셀 업로드 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmFunctionNameLevel4Inq
#### 파라미터 정보 
- requestData : 함수 이름 Level4 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeManagerApprovalSettingInq
#### 파라미터 정보 
- requestData : 스코프 매니저 승인 설정 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeUpd
#### 파라미터 정보 
- requestData : 스코프 업데이트를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmConfirmInq
#### 파라미터 정보 
- requestData : 확인 요청 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeDel2
#### 파라미터 정보 
- requestData : 스코프 삭제를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmPlCheckInq
#### 파라미터 정보 
- requestData : PL 체크 테스트 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeAdd
#### 파라미터 정보 
- requestData : 스코프 추가를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmTaskName
#### 파라미터 정보 
- requestData : 작업 이름 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeInq
#### 파라미터 정보 
- requestData : 스코프 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeDel
#### 파라미터 정보 
- requestData : 스코프 삭제를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmUserIdCode
#### 파라미터 정보 
- requestData : 사용자 ID 코드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmProRate
#### 파라미터 정보 
- requestData : 진행률 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmPlInfoInq
#### 파라미터 정보 
- requestData : PL 정보 조회를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmGetPLList
#### 파라미터 정보 
- requestData : PL 리스트 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmSettingInq
#### 파라미터 정보 
- requestData : 설정 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeListInq
#### 파라미터 정보 
- requestData : 스코프 리스트 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmGetL4
#### 파라미터 정보 
- requestData : L4 목록 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmScopeRetrieveHistory
#### 파라미터 정보 
- requestData : 스코프 retrieving 이력 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmGetLevelList
#### 파라미터 정보 
- requestData : level 리스트 요청 데이터  
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmNTMUpdate
#### 파라미터 정보 
- requestData : NTM 업데이트를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmIsNtm
#### 파라미터 정보 
- requestData : ntm 이 있는지 확인을 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/codeList
#### 파라미터 정보 
- requestData : 코드 리스트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmGetSubProjectNo
#### 파라미터 정보 
- requestData : 하부 프로젝트 번호 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmProgressUpd
#### 파라미터 정보 
- requestData : 진행 상태 업데이트를 위한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmQCLinkYn
#### 파라미터 정보 
- requestData : QC 링크 사용 여부 조회 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmConfirmTest
#### 파라미터 정보 
- requestData : 확인 테스트 검색 요청 데이터  
- onlineCtx : 온라인 컨텍스트 정보

### POST /scope/BCScopeManager/pmApprovReset
#### 파라미터 정보 
- requestData : 승인 리셋 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

---
## BCSQualityImprovementDashboardMgrController API 명세서
### POST /scope/SQualityImprovementDashboard/dmCheckQualityDashBoardMgr
#### 파라미터 정보
- requestData : 요청 데이터 정보 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 타입)
#### 응답 (JSON)
- 모니터링 대상인 품질 개선 대쉬보드 정보를 반환합니다.
---
## BCSwingDevPgmManager1Controller API 명세서
주로 Post 방식의 요청이며, 각 API는 하나의 엔드포인트에 대응되어 있습니다.

### POST /scope/BCSwingDevPgmManager1/pmUserIdCode
#### 파라미터 정보
- requestData : 사용자 ID 코드 정보를 담고 있는 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 ID 코드를 처리한 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager1/pmProRate
#### 파라미터 정보
- requestData : 프로세스 비율 정보를 담고 있는 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로세스 비율을 처리한 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager1/pmScopeListTabInq
#### 파라미터 정보
- requestData : 스코프 리스트 탭 조회 요청에 대한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 리스트 탭에 대한 조회 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager1/pmScopeHistory
#### 파라미터 정보
- requestData : 스코프 역사에 대한 정보를 담고 있는 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 역사 정보를 처리하고 그 결과를 반환합니다.

### POST /scope/BCSwingDevPgmManager1/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 테스트 ID와 이름 리스트 조회에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 테스트 ID와 이름에 대한 리스트를 조회한 결과를 반환합니다. 

### ~~간략화~~
### POST /scope/BCSwingDevPgmManager1/pmFileDownload
#### 파라미터 정보
- requestData : 파일 다운로드에 대한 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Download)
- 요청한 파일을 다운로드합니다.

### POST /scope/BCSwingDevPgmManager1/pmExcelDownload
#### 파라미터 정보
- requestData : 엑셀 파일 다운로드에 대한 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Download)
- 요청한 엑셀 파일을 다운로드합니다.

### ~~생략~~
---
## BCModeldesignController API 명세서

### POST /scope/BCModeldesignController/pmScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 범위 목록 조회 결과

### POST /scope/BCModeldesignController/pmScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 범위 그리드 업데이트 결과

### POST /scope/BCModeldesignController/pmWorkingdayInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 작업일 조회 결과

### POST /scope/BCModeldesignController/pmAttchFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 첨부파일 목록 조회 결과

### POST /scope/BCModeldesignController/pmFileDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 파일 다운로드

### POST /scope/BCModeldesignController/pmNcpCILinkDataInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- Ncp CI 링크 데이터 조회 결과

### POST /scope/BCModeldesignController/pmInsepctionInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 검사 조회 결과

### POST /scope/BCModeldesignController/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 모든 엑셀 데이터 다운로드

### POST /scope/BCModeldesignController/pmDesignFunctionSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 설계 기능 선택 결과

### POST /scope/BCModeldesignController/pmScopeObjectUseYN
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 범위 객체 사용 여부 결과

### POST /scope/BCModeldesignController/pmScopeObjectUseYNSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 범위 객체 사용 여부 선택 결과

### POST /scope/BCModeldesignController/pmGetLevelList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 레벨 목록 가져오기 결과

### POST /scope/BCModeldesignController/pmScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 범위 삭제 결과

### POST /scope/BCModeldesignController/pmScopeInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 범위 조회 결과

### POST /scope/BCModeldesignController/pmPlInfoInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- PL 정보 조회 결과

### POST /scope/BCModeldesignController/pmConfirmInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 확인 조회 결과

### POST /scope/BCModeldesignController/pmFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 파일 삭제 결과

### POST /scope/BCModeldesignController/pmPlCheckInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- PL 체크 조회 결과

### POST /scope/BCModeldesignController/pmGethistroy
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 히스토리 가져오기 결과

### POST /scope/BCModeldesignController/pmGetASIS
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- ASIS 가져오기 결과

### POST /scope/BCModeldesignController/pmCheckAsis
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- Asis 체크 결과

### POST /scope/BCModeldesignController/pmUasisYN
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- Uasis 사용 여부 결과

### POST /scope/BCModeldesignController/pmGetREQ
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- REQ 가져오기 결과

### POST /scope/BCModeldesignController/pmUserIdCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 사용자 ID 코드 결과

### POST /scope/BCModeldesignController/pmTaskName
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 작업 이름 결과

### POST /scope/BCModeldesignController/pmProRate
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 전문가 비율 결과

### POST /scope/BCModeldesignController/pmExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 업로드 결과

### POST /scope/BCModeldesignController/pmScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 범위 추가 결과

### POST /scope/BCModeldesignController/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 승인 설정 조회 결과

### POST /scope/BCModeldesignController/pmExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 엑셀 다운로드
---
## BCRequirementsTaskChartManager API 명세서

### POST /scope/BCRequirementsTaskChartManager/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON 형태)
- 요구사항 범위 목록 정보

### POST /scope/BCRequirementsTaskChartManager/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON 형태)
- 추가된 요구사항 범위 정보

### POST /scope/BCRequirementsTaskChartManager/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON 형태)
- 업데이트된 요구사항 범위 정보

### POST /scope/BCRequirementsTaskChartManager/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON 형태)
- 업데이트된 요구사항 범위 그리드 정보

### POST /scope/BCRequirementsTaskChartManager/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON 형태)
- 삭제된 요구사항 범위 파일 정보

### POST /scope/BCRequirementsTaskChartManager/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON 형태)
- 삭제된 요구사항 범위 정보

### POST /scope/BCRequirementsTaskChartManager/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (파일 다운로드)
- 요구사항 범위 보고서 파일

### POST /scope/BCRequirementsTaskChartManager/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON 형태)
- 계획 진행률 정보

이하 동일한 방식으로 계속됩니다.
---
## BCProductsPlan API 명세서
### POST scope/BCProductsPlan/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 사용자로부터 받은 정보
- onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 서비스에서 pmRequirementsScopeListInq 메소드를 호출하고 그 결과를 리턴

### POST scope/BCProductsPlan/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 사용자로부터 받은 정보
- onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 서비스에서 pmRequirementsScopeAdd 메소드를 호출하고 그 결과를 리턴

### POST scope/BCProductsPlan/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 사용자로부터 받은 정보
- onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 서비스에서 pmRequirementsScopeUpd 메소드를 호출하고 그 결과를 리턴

### POST scope/BCProductsPlan/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 사용자로부터 받은 정보
- onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 서비스에서 pmRequirementsScopeGridUpd 메소드를 호출하고 그 결과를 리턴

### POST scope/BCProductsPlan/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 사용자로부터 받은 정보
- onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 서비스에서 pmRequirementsScopeFileDel 메소드를 호출하고 그 결과를 리턴

...(이하 동일한 양식으로 복붙)

### POST scope/BCProductsPlan/pmDeleteFileHistory
#### 파라미터 정보
- requestData : 사용자로부터 받은 정보
- onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 서비스에서 pmDeleteFileHistory 메소드를 호출하고 그 결과를 리턴

### POST scope/BCProductsPlan/pmProductsIdRule
#### 파라미터 정보
- requestData : 사용자로부터 받은 정보
- onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 서비스에서 pmProductsIdRule 메소드를 호출하고 그 결과를 리턴
---
## BCRmCompleteHKController API 명세서

### POST /scope/BCRmCompleteHK/pmRmIdListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataset 정보 

### POST /scope/BCRmCompleteHK/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataset 정보 

### POST /scope/BCRmCompleteHK/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataset 정보 

### POST /scope/BCRmCompleteHK/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File Download)
- 엑셀 파일 다운로드 정보 

### POST /scope/BCRmCompleteHK/pmPopupSearchStep
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataset 정보 

### POST /scope/BCRmCompleteHK/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataset 정보 

### POST /scope/BCRmCompleteHK/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataset 정보 

### POST /scope/BCRmCompleteHK/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataset 정보 

(API 명세 계속...)
---
## BCCheckCascadingDashBoardMgr API 명세서
### POST /scope/BCCheckCascadingDashBoard
#### 파라미터 정보
- requestData: 클라이언트로부터 받은 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- service.dmCheckCascadingDashBoardMgr(requestData, onlineCtx) 메소드를 통해 생성된 데이터셋 정보를 반환합니다.
---
## PUDesignASManagerController API 명세서
해당 API 명세서는 PUDesignASManagerController 클래스에 대한 내용을 담고 있습니다.

### POST /scope/BCDesignAS/pmScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeListInq 결과 반환 

### POST /scope/BCDesignAS/pmUserIdCode
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmUserIdCode 결과 반환 

### POST /scope/BCDesignAS/pmProRate
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmProRate 결과 반환 

### POST /scope/BCDesignAS/pmTaskName
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmTaskName 결과 반환 

### POST /scope/BCDesignAS/pmScopeAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeAdd 결과 반환 

### POST /scope/BCDesignAS/pmScopeUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeUpd 결과 반환 

### POST /scope/BCDesignAS/pmScopeDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeDel 결과 반환 

### POST /scope/BCDesignAS/pmScopeGridUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeGridUpd 결과 반환 

### POST /scope/BCDesignAS/pmScopeInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeInq 결과 반환 

### POST /scope/BCDesignAS/pmPlInfoInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmPlInfoInq 결과 반환 

### POST /scope/BCDesignAS/pmConfirmInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmConfirmInq 결과 반환 

### POST /scope/BCDesignAS/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmExcelUpload 결과 반환 

### POST /scope/BCDesignAS/pmApprovalSettingInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmApprovalSettingInq 결과 반환 

### POST /scope/BCDesignAS/pmWorkingdayInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmWorkingdayInq 결과 반환 

### POST /scope/BCDesignAS/pmAttchFileListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmAttchFileListInq 결과 반환 

### POST /scope/BCDesignAS/pmFileDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmFileDel 결과 반환 

### POST /scope/BCDesignAS/pmFileDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 서비스의 pmFileDownload 결과 파일 반환 

### POST /scope/BCDesignAS/pmExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 서비스의 pmExcelDownload 결과 파일 반환 

### POST /scope/BCDesignAS/pmNcpCILinkDataInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmNcpCILinkDataInq 결과 반환 

### POST /scope/BCDesignAS/pmInsepctionInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmInsepctionInq 결과 반환 

### POST /scope/BCDesignAS/pmExcelDataAllDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 서비스의 pmExcelDataAllDownload 결과 파일 반환 

### POST /scope/BCDesignAS/pmPlCheckInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmPlCheckInq 결과 반환 

### POST /scope/BCDesignAS/pmDesignFunctionSel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmDesignFunctionSel 결과 반환 

### POST /scope/BCDesignAS/pmScopeDel2
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeDel2 결과 반환 

### POST /scope/BCDesignAS/pmScopeObjectUseYN
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeObjectUseYN 결과 반환 

### POST /scope/BCDesignAS/pmScopeObjectUseYNSel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmScopeObjectUseYNSel 결과 반환 

### POST /scope/BCDesignAS/pmGetLevelList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmGetLevelList 결과 반환 

### POST /scope/BCDesignAS/pmGethistroy
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스의 pmGethistroy 결과 반환 

---
## BCDesignProgramManager6 API 명세서

### POST /scope/BCDesignProgramManager6/pmScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로그램 범위 목록 조회

### POST /scope/BCDesignProgramManager6/pmScopeGridUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로그램 범위 그리드 업데이트

### POST /scope/BCDesignProgramManager6/pmWorkingdayInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 작업일 조회

### POST /scope/BCDesignProgramManager6/pmAttchFileListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 첨부파일 리스트 조회

### POST /scope/BCDesignProgramManager6/pmFileDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 파일 다운로드

나머지 API에 대해서도 같은 방식으로 명세서를 작성하여야 합니다. 위 방식을 참고하여 추가 API에 대한 명세서를 작성해주세요.
---
## BCTestStatusForUnit API 명세서
### POST /scope/BCTestStatusForUnit/pmStatusForTester
#### 파라미터 정보
- requestData : Tester의 상태 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- Tester의 상태 조회 결과를 반환

### POST /scope/BCTestStatusForUnit/pmChargerListInq
#### 파라미터 정보
- requestData : Charger의 목록 쿼리 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- Charger 목록 조회 결과를 반환 

### POST /scope/BCTestStatusForUnit/pmStatusForActionCharger
#### 파라미터 정보
- requestData : Action Charger의 상태 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- Action Charger의 상태 조회 결과를 반환
---
## BCAsisMapping API 명세서
### POST /scope/BCAsisMapping/pmGetExcel
#### 파라미터 정보
- requestData : 요청 데이터 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (DownloadView 객체 반환)
- 반환되는 파일명 및 파일 경로에 해당하는 엑셀 파일을 다운로드할 수 있는 DownloadView 객체를 반환합니다.

### POST /scope/BCAsisMapping/pmAsisList
#### 파라미터 정보
- requestData : 요청 데이터 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataset 객체 반환)
- 요청 정보에 해당하는 데이터를 반환합니다.
---
## BCTestSettingIntegrated API 명세서
### POST /scope/BCTestSettingIntegrated/pmTestSetting
#### 파라미터 정보
- requestBody (IDataSet requestData) : 요청 데이터셋을 입력하는 파라미터입니다.
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보를 입력하는 파라미터입니다.
#### 응답 (JSON)
- pmTestSetting 메소드의 로직에 따라 처리된 IDataSet 객체를 반환합니다.
---
## BCCheckQualityExecutionController API 명세서
### POST /scope/BCCheckQualityExecution/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 조회하고자 하는 요구사항의 범위에 대한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항의 범위 목록 정보가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요구사항의 범위 추가를 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항의 범위 추가 결과가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요구사항의 범위 업데이트를 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항의 범위 업데이트 결과가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요구사항의 범위 삭제를 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항의 범위 삭제 결과가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmRequirementsScopeHistory
#### 파라미터 정보
- requestData : 요구사항의 범위 이력 조회를 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항의 범위 이력정보가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요구사항의 범위파일 조회를 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항의 범위파일 조회결과가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 요구사항 범위 엑셀파일 업로드 요청을 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항 범위 엑셀파일 업로드 요청 결과가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmDetailCodeSel
#### 파라미터 정보
- requestData : 세부 코드 조회를 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 세부 코드 조회 결과가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 테스트 ID 명칭 리스트 조회를 위한 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 테스트 ID 명칭 리스트가 담긴 데이터 셋 반환

### POST /scope/BCCheckQualityExecution/pmTestExecutionBatch
#### 파라미터 정보
- requestData : 테스트 실행 배치 요청 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 테스트 실행 배치 결과가 담긴 데이터 셋 반환
---
## BCDesignInterfaceManagerWooriController API 명세서
### POST /scope/BCDesignInterfaceManagerWoori/pmScopeListInq
- API 요청방식: POST
- API 경로: /scope/BCDesignInterfaceManagerWoori/pmScopeListInq
#### 파라미터 정보
- requestData : 조회 요청의 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트의 Scope 목록 조회 결과

### POST /scope/BCDesignInterfaceManagerWoori/pmScopeGridUpd
- API 요청방식: POST
- API 경로: /scope/BCDesignInterfaceManagerWoori/pmScopeGridUpd
#### 파라미터 정보
- requestData : 업데이트 요청의 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트의 Scope 그리드 업데이트 결과

### POST /scope/BCDesignInterfaceManagerWoori/pmWorkingdayInq
- API 요청방식: POST
- API 경로: /scope/BCDesignInterfaceManagerWoori/pmWorkingdayInq
#### 파라미터 정보
- requestData : 조회 요청의 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 작업일 대한 정보 조회 결과

### POST /scope/BCDesignInterfaceManagerWoori/pmAttchFileListInq
- API 요청방식: POST
- API 경로: /scope/BCDesignInterfaceManagerWoori/pmAttchFileListInq
#### 파라미터 정보
- requestData : 조회 요청의 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 첨부파일 목록에 대한 조회 결과

---
## BCDesignProgramManager7 API 명세서

### POST /scope/BCDesignProgramManager7/pmScopeDel
#### 파라미터 정보
- IDataSet requestData : 삭제할 프로그램 Scope의 데이터를 포함하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### POST /scope/BCDesignProgramManager7/pmScopeInq
#### 파라미터 정보
- IDataSet requestData : 검색할 프로그램 Scope의 데이터를 포함하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### POST /scope/BCDesignProgramManager7/pmPlInfoInq
#### 파라미터 정보
- IDataSet requestData : 검색할 플랫폼 정보를 포함하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### POST /scope/BCDesignProgramManager7/pmConfirmInq
#### 파라미터 정보
- IDataSet requestData : 조회할 확인 정보를 포함하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### POST /scope/BCDesignProgramManager7/pmFileDel
#### 파라미터 정보
- IDataSet requestData : 삭제할 파일 정보를 포함하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### GET /scope/BCDesignProgramManager7/pmExcelDownload
#### 파라미터 정보
- IDataSet requestData : 다운로드할 엑셀 파일 정보를 포함하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Download View)
- 다운로드할 Excel 파일

### POST /scope/BCDesignProgramManager7/pmProRate
#### 파라미터 정보
- IDataSet requestData : 처리율 정보를 요청하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### GET /scope/BCDesignProgramManager7/pmFileDownload
#### 파라미터 정보
- IDataSet requestData : 다운로드할 파일 정보를 포함하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Download View)
- 다운로드할 파일

### POST /scope/BCDesignProgramManager7/pmDesignFunctionSel
#### 파라미터 정보
- IDataSet requestData : 선택된 디자인 함수 정보를 요청하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### POST /scope/BCDesignProgramManager7/pmScopeObjectUseYN
#### 파라미터 정보
- IDataSet requestData : Scope 객체의 사용 여부 정보를 요청하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

### POST /scope/BCDesignProgramManager7/pmGetLevelList
#### 파라미터 정보
- IDataSet requestData : 레벨 리스트를 요청하는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스의 반환 값

---
## BCServiceRequestManagement API 명세서
### POST scope/BCServiceRequestManagement/pmServiceRequestManagementHistory
#### 파라미터 정보
- requestData : 서비스 요청 관리 이력 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 이력 정보를 반환한다.

### POST scope/BCServiceRequestManagement/pmServiceRequestManagementExcelupload
#### 파라미터 정보
- requestData : 서비스 요청 관리 엑셀 업로드에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 엑셀 업로드 결과를 반환한다.

### POST scope/BCServiceRequestManagement/pmServiceRequestManagementList
#### 파라미터 정보
- requestData : 서비스 요청 관리 목록 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 목록 정보를 반환한다.

### POST scope/BCServiceRequestManagement/pmServiceRequestManagementExceldownload
#### 파라미터 정보
- requestData : 서비스 요청 관리 엑셀 다운로드에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 엑셀 다운로드 결과를 반환한다.

### POST scope/BCServiceRequestManagement/pmCopyServiceRequestMangementAdd
#### 파라미터 정보
- requestData : 클립보드에 복사된 서비스 요청 관리 정보 추가에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 클립보드에 복사된 서비스 요청 관리 정보 추가 결과를 반환한다.

### POST scope/BCServiceRequestManagement/pmServiceRequestManagementAsis
#### 파라미터 정보
- requestData : 현행 서비스 요청 관리 정보 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 현행 서비스 요청 관리 정보를 반환한다.

### POST scope/BCServiceRequestManagement/pmSubprojectSearch
#### 파라미터 정보
- requestData : 하위 프로젝트 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 정보를 반환한다.

### POST scope/BCServiceRequestManagement/pmServiceRequestMangementDel
#### 파라미터 정보
- requestData : 서비스 요청 관리 정보 삭제에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 정보 삭제 결과를 반환한다.

### POST scope/BCServiceRequestManagement/pmServiceRequestMangementAdd
#### 파라미터 정보
- requestData : 서비스 요청 관리 정보 추가에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 정보 추가 결과를 반환한다.

### POST scope/BCServiceRequestManagement/pmServiceRequestManagementUpd
#### 파라미터 정보
- requestData : 서비스 요청 관리 정보 수정에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 정보 수정 결과를 반환한다.

### POST scope/BCServiceRequestManagement/pmScopeListInq_popup
#### 파라미터 정보
- requestData : 스코프 목록 조회 팝업에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 목록 정보를 반환한다.

### POST scope/BCServiceRequestManagement/pmSrManagementFileDel
#### 파라미터 정보
- requestData : 서비스 요청 관리 파일 삭제에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스 요청 관리 파일 삭제 결과를 반환한다.

### POST scope/BCServiceRequestManagement/pmchkIds
#### 파라미터 정보
- requestData : 아이디 체크에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 아이디 중복 체크 결과를 반환한다.
---
## BCRmTrackingWB API 명세서
### POST /scope/BCRmTrackingWB/pmRmTraceTableInq
#### 파라미터 정보
- requestData : 요청 데이터, IDataSet 형태의 객체를 받습니다.
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- service.pmRmTraceTableInq의 실행 결과를 반환합니다.

### POST /scope/BCRmTrackingWB/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터, IDataSet 형태의 객체를 받습니다.
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (File Download)
- Excel 파일을 다운로드합니다. 파일 이름은 'excelFileNm', 파일 경로는 'excelPath'에 저장되어 있습니다.
---
## BCProductsExecution API 명세서
### POST /scope/BCProductsExecution/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData: 요구사항 범위의 목록 조회를 위한 요청 데이터 정보
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 해당 요구사항의 범위 리스트

### POST /scope/BCProductsExecution/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData: 추가할 요구사항 범위에 관한 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 추가한 요구사항의 범위 정보

### POST /scope/BCProductsExecution/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData: 갱신할 요구사항 범위에 대한 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 업데이트된 요구 사항의 범위 정보

### POST /scope/BCProductsExecution/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData: 그리드에서 업데이트할 요구사항 범위에 대한 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 업데이트된 요구사항 범위 정보

### POST /scope/BCProductsExecution/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData: 요구사항 범위 파일을 삭제하기 위한 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 삭제된 요구사항 범위 파일 정보

### POST /scope/BCProductsExecution/pmRequirementsScopeDel
#### 파라미터 정보
- requestData: 요구사항 범위를 삭제하기 위한 요청 데이터
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 삭제된 요구사항 범위 정보

...(이하 생략)...
---
## BCCheckRiskDefectController API 명세서
API 명세서는 다음과 같습니다.

### POST /scope/BCCheckRiskDefect/pmRequirementsScopeListInq
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 목록 조회 서비스의 결과를 반환합니다.

### POST /scope/BCCheckRiskDefect/pmRequirementsScopeAdd
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 추가 서비스의 결과를 반환합니다.

### POST /scope/BCCheckRiskDefect/pmRequirementsScopeUpd
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 업데이트 서비스의 결과를 반환합니다.

### POST /scope/BCCheckRiskDefect/pmRequirementsScopeGridUpd
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 그리드 업데이트 서비스의 결과를 반환합니다.

### POST /scope/BCCheckRiskDefect/pmRequirementsScopeFileDel
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 파일 삭제 서비스의 결과를 반환합니다.

### POST /scope/BCCheckRiskDefect/pmRequirementsScopeDel
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 삭제 서비스의 결과를 반환합니다.

(나머지 API는 이와 유사한 형식으로 작성됩니다.)

### POST /scope/BCCheckRiskDefect/pmRquirementsScopeReport
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (파일 다운로드)
- 요구사항 범위 보고서를 Excel 파일로 다운로드합니다.

### POST /scope/BCCheckRiskDefect/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- IDataSet requestData : 쿼리 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- Excel 파일 업로드 서비스의 결과를 반환합니다.

...이하 생략...
---
## BCCheckCascadingPlanController API 명세서
서비스의 요청 경로는 "scope/BCCheckCascadingPlan" 이다.

### POST /pmRequirementsScopeListInq
#### 파라미터 정보
- requestData, onlineCtx : 서비스 요구 사항 범위 목록 조회
#### 응답 (JSON)
- 서비스 요구 사항 범위 목록 조회 결과

### POST /pmRequirementsScopeAdd
#### 파라미터 정보
- requestData, onlineCtx : 서비스 요구 사항 범위 추가
#### 응답 (JSON)
- 서비스 요구 사항 범위 추가 결과

### POST /pmRequirementsScopeUpd
#### 파라미터 정보
- requestData, onlineCtx : 서비스 요구 사항 범위 업데이트
#### 응답 (JSON)
- 서비스 요구 사항 범위 업데이트 결과

### POST /pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData, onlineCtx : 서비스 요구 사항 범위 그리드 업데이트
#### 응답 (JSON)
- 서비스 요구 사항 범위 그리드 업데이트 결과

### POST /pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData, onlineCtx : 서비스 요구 사항 범위 파일 삭제
#### 응답 (JSON)
- 서비스 요구 사항 범위 파일 삭제 결과

### POST /pmRequirementsScopeDel
#### 파라미터 정보
- requestData, onlineCtx : 서비스 요구 사항 범위 삭제
#### 응답 (JSON)
- 서비스 요구 사항 범위 삭제 결과

### POST /pmRquirementsScopeReport
#### 파라미터 정보
- requestData, onlineCtx : 서비스 요구 사항 범위 보고서
#### 응답 (파일 다운로드)
- 서비스 요구 사항 범위 보고서 다운로드 결과

...
다른 API 역시 위의 공식을 따르며, 각 API의 목적을 기반으로한 설명만 다르다.
---
## BCAsisMappingProgram API 명세서
### GET /scope/BCAsisMappingProgram/pmGetExcel
#### 파라미터 정보
- requestData : 엑셀 파일을 가져오기 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (DownloadView)
- 엑셀 파일 다운로드

### POST /scope/BCAsisMappingProgram/pmAsisList
#### 파라미터 정보
- requestData : 엑셀 파일을 가져오기 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청된 데이터셋 반환
---
## BCMobileInfo API 명세서
### POST scope/BCMobileInfo/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요구사항의 목록 조회를 위한 데이터
- onlineCtx : 사용자 관련 컨텍스트 정보
#### 응답 (IDataSet)
- 요구사항의 목록 정보를 반환함.

### POST scope/BCMobileInfo/pmSystemCodeMangerAdd
#### 파라미터 정보
- requestData : 시스템 코드 관련 추가 데이터
- onlineCtx : 사용자 관련 컨텍스트 정보
#### 응답 (IDataSet)
- 시스템 코드 추가의 처리 결과를 반환함.

### POST scope/BCMobileInfo/pmSystemCodeMangerLUpd
#### 파라미터 정보
- requestData : 시스템 코드 관련 업데이트 데이터
- onlineCtx : 사용자 관련 컨텍스트 정보
#### 응답 (IDataSet)
- 시스템 코드 업데이트의 처리 결과를 반환함.

### POST scope/BCMobileInfo/pmSystemCodeMangerLUpd02
#### 파라미터 정보
- requestData : 시스템 코드 관련 업데이트 데이터 (02버전)
- onlineCtx : 사용자 관련 컨텍스트 정보
#### 응답 (IDataSet)
- 시스템 코드 업데이트(02버전)의 처리 결과를 반환함.

### POST scope/BCMobileInfo/pmSystemCodeMangerDel
#### 파라미터 정보
- requestData : 시스템 코드 관련 삭제 데이터
- onlineCtx : 사용자 관련 컨텍스트 정보
#### 응답 (IDataSet)
- 시스템 코드 삭제의 처리 결과를 반환함.

### POST scope/BCMobileInfo/pmWorkCodeMangerExcelUpload
#### 파라미터 정보
- requestData : 엑셀 업로드를 위한 작업 코드 데이터
- onlineCtx : 사용자 관련 컨텍스트 정보
#### 응답 (IDataSet)
- 엑셀 업로드의 처리 결과를 반환함.

### POST scope/BCMobileInfo/pmChckprojects
#### 파라미터 정보
- requestData : 프로젝트 체크를 위한 데이터
- onlineCtx : 사용자 관련 컨텍스트 정보
#### 응답 (IDataSet)
- 프로젝트 체크의 결과 정보를 반환함.

---
## BCSwingDevPgmManager API 명세서
### POST /scope/BCSwingDevPgmManager/pmUserIdCode
#### 파라미터 정보
- requestData : 사용자 ID 코드 관련 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 사용자 ID 코드 조회 결과

### POST /scope/BCSwingDevPgmManager/pmProRate
#### 파라미터 정보
- requestData : 프로그램 비율 관련 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로그램 비율 조회 결과

### POST /scope/BCSwingDevPgmManager/pmScopeListTabInq
#### 파라미터 정보
- requestData : 탭 조회 관련 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 탭 조회 결과

...(이하 생략)...

### POST /scope/BCSwingDevPgmManager/pmScopeListSave
#### 파라미터 정보
- requestData : 범위 리스트 저장 관련 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 범위 리스트 저장 결과

### GET /scope/BCSwingDevPgmManager/pmFileDownload
#### 파라미터 정보
- requestData : 파일 다운로드에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (파일 다운로드)
- 요청된 파일

### GET /scope/BCSwingDevPgmManager/pmExcelDownload
#### 파라미터 정보
- requestData : 엑셀 파일 다운로드에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (파일 다운로드)
- 요청된 엑셀 파일

### GET /scope/BCSwingDevPgmManager/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 모든 엑셀 데이터 다운로드에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (파일 다운로드)
- 요청된 모든 엑셀 데이터 파일
---
## BcInterfaceDevWBController API 명세서
### POST /scope/BcInterfaceDevWBController/getlists
#### 파라미터 정보
- requestData : 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 리스트 데이터 반환

### POST /scope/BcInterfaceDevWBController/setLayOut
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 레이아웃 설정 데이터 반환

### POST /scope/BcInterfaceDevWBController/chageProjectNO
#### 파라미터 정보
- requestData : 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 번호 변경 데이터 반환

### POST /scope/BcInterfaceDevWBController/insertInter
#### 파라미터 정보
- requestData : 요청 데이터 
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 인터페이스 삽입 결과 데이터 반환

### POST /scope/BcInterfaceDevWBController/updateInter
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 인터페이스 업데이트 결과 데이터 반환

### POST /scope/BcInterfaceDevWBController/insertApplication
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 어플리케이션 삽입 결과 데이터 반환

### POST /scope/BcInterfaceDevWBController/updateApplication
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 어플리케이션 업데이트 결과 데이터 반환

### POST /scope/BcInterfaceDevWBController/getApplocationList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 어플리케이션 리스트 데이터 반환

### POST /scope/BcInterfaceDevWBController/getProgram
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로그램 데이터 반환

### POST /scope/BcInterfaceDevWBController/getUser
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 사용자 데이터 반환

### POST /scope/BcInterfaceDevWBController/doReSet
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 재설정 결과 데이터 반환

### POST /scope/BcInterfaceDevWBController/excelDown
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 엑셀 파일 다운로드

### POST /scope/BcInterfaceDevWBController/excelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 파일 업로드 결과 데이터 반환

---
## BCCheckQualityPlanController API 명세서
### POST /scope/BCCheckQualityPlan/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 목록 조회 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 추가 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 업데이트 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 그리드 업데이트 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 파일 삭제 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 삭제 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 요구사항 범위 리포트 파일

### POST /scope/BCCheckQualityPlan/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 계획 진행률 조회 결과 데이터

### POST /scope/BCCheckQualityPlan/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 엑셀 다운로드 파일

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 파일 목록 조회 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (FILE)
- 요구사항 범위 엑셀 다운로드 파일

### POST /scope/BCCheckQualityPlan/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 엑셀 업로드 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 아이디 이름 목록 조회 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestStatusRightChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 상태 오른쪽 차트 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestPlanCaseGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 케이스 그리드 업데이트 결과 데이터

### POST /scope/BCCheckQualityPlan/pmRequirementsL4Inq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 L4 인큐 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestStatusLeftChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 상태 왼쪽 차트 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestPlanGridRight
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 그리드 오른쪽 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestPlanSceInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 Sce 인큐 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestStatusGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 상태 그리드 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestPlanGridLeft
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 계획 그리드 왼쪽 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestCaseDefectStatus
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 케이스 결함 상태 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestSequenceInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 시퀀스 인큐 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestGetObject
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 객체 얻기 결과 데이터

### POST /scope/BCCheckQualityPlan/pmTestGetLinkCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 링크 코드 얻기 결과 데이터

### POST /scope/BCCheckQualityPlan/pmChangeFieldBatch
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 필드 배치 변경 결과 데이터

### POST /scope/BCCheckQualityPlan/pmDashboard3OpinionFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 대시보드3 의견 파일 목록 조회 결과 데이터
---
## BCRequirementsScopeManagerWB2Controller API 명세서

### POST /scope/BCRequirementsScopeManagerWb2/pmUserIdCode
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmUserIdCode 서비스의 응답 데이터 반환

### POST /scope/BCRequirementsScopeManagerWb2/pmProRate
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmProRate 서비스의 응답 데이터 반환

### POST /scope/BCRequirementsScopeManagerWb2/pmScopeListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmScopeListInq 서비스의 응답 데이터 반환

... (동일한 패턴으로 계속됩니다)

### POST /scope/BCRequirementsScopeManagerWb2/pmScopeObjectUseYN
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmScopeObjectUseYN 서비스의 응답 데이터 반환

### POST /scope/BCRequirementsScopeManagerWb2/pmScopeObjectUseYNSel
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmScopeObjectUseYNSel 서비스의 응답 데이터 반환

### POST /scope/BCRequirementsScopeManagerWb2/pmScopeListInq_history
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmScopeListInq_history 서비스의 응답 데이터 반환
---
## BCProductsPlanTailoring API 명세서
### POST /scope/BCProductsPlanTailoring/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 목록 정보 반환

### POST /scope/BCProductsPlanTailoring/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 추가 정보 반환

### POST /scope/BCProductsPlanTailoring/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 업데이트 정보 반환

### POST /scope/BCProductsPlanTailoring/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 그리드 업데이트 정보 반환

### POST /scope/BCProductsPlanTailoring/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 파일 삭제 정보 반환

### POST /scope/BCProductsPlanTailoring/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 삭제 정보 반환

### POST /scope/BCProductsPlanTailoring/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답
- 요구사항 범위 보고서 다운로드

### POST /scope/BCProductsPlanTailoring/pmXmppNoticeSend
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- XMPP 알림 전송 결과 반환

### POST /scope/BCProductsPlanTailoring/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 계획 진행률 조회 정보 반환

### POST /scope/BCProductsPlanTailoring/pmRequirementsScopeHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 범위 히스토리 정보 반환

- 업데이트된 API는 생략하겠습니다. 위에 양식으로 다른 API도 만들어 주세요.
---
## BCRequirementsCustomerManagerController API 명세서
### POST /scope/BCRequirementsCustomerManager/pmRequirementsScopeListInq  
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 요구사항 목록 조회 요청에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmRequirementsScopeAdd
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 요구사항 추가에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmRequirementsScopeUpd
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 요구사항 업데이트에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmRequirementsScopeGridUpd
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 그리드 형태의 요구사항 업데이트에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmRequirementsScopeFileDel
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 요구사항 파일 삭제에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmRequirementsScopeDel
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 요구사항 삭제에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmRquirementsScopeReport
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (DownloadView)
- 요구사항 보고서 다운로드에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmPlanProgressRateInq
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 계획 진행률 조회에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmRequirementsScopeHistory
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (IDataSet)
- 요구사항 이력 조회에 대한 응답 

### POST /scope/BCRequirementsCustomerManager/pmExcelDownloadAll
#### 파라미터 정보 
- IDataSet requestData : 컨트롤러에 요청되는 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (DownloadView)
- Excel 전체 다운로드에 대한 응답

---
## BCCheckCascadingDefectController API 명세서
### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 Scope List 조회 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 Scope 등록 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
 
#### 응답 (JSON)
- 요구사항 Scope 업데이트 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
 
#### 응답 (JSON)
- 요구사항 Scope 그리드 업데이트 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 Scope 파일 삭제 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 Scope 삭제 결과

### POST /scope/BCCheckCascadingDefect/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (DownloadView)
- 요구사항 Scope 리포트 다운로드 결과

### POST /scope/BCCheckCascadingDefect/pmXmppNoticeSend
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- XMPP 알림 발송 결과

### POST /scope/BCCheckCascadingDefect/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 계획 진척률 조회 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 Scope History 조회 결과

### POST /scope/BCCheckCascadingDefect/pmDefectStatusGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 결함 상태 그리드 조회 결과

### POST /scope/BCCheckCascadingDefect/pmDefectStatusLeftChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 결함 상태 왼쪽 차트 조회 결과

### POST /scope/BCCheckCascadingDefect/pmImageInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 이미지 조회 결과

### POST /scope/BCCheckCascadingDefect/pmImageDelete
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 이미지 삭제 결과

### POST /scope/BCCheckCascadingDefect/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (DownloadView)
- 전체 엑셀 다운로드 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 Scope 파일 리스트 조회 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (DownloadView)
- 요구사항 Scope 엑셀 다운로드 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 Scope 엑셀 업로드 결과

### POST /scope/BCCheckCascadingDefect/pmDefectStatusRightChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 결함 상태 오른쪽 차트 조회 결과

### POST /scope/BCCheckCascadingDefect/pmDetailCodeSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 상세 코드 조회 결과

### POST /scope/BCCheckCascadingDefect/pmDetailCodeUseYn
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 상세 코드 사용 여부 조회 결과

### POST /scope/BCCheckCascadingDefect/pmRequirementsDetailCodeInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 상세 코드 조회 결과

### POST /scope/BCCheckCascadingDefect/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 테스트 ID 이름 리스트 조회 결과

### POST /scope/BCCheckCascadingDefect/pmTestExtinctChartGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 테스트 종료 차트 그리드 조회 결과

### POST /scope/BCCheckCascadingDefect/pmTestTypeSequenceInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 테스트 타입 순서 조회 결과

### POST /scope/BCCheckCascadingDefect/pmSubPrjInfoInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 서브 프로젝트 정보 조회 결과
---
## BCCorrectiveActionWBController API 명세서
이 API는 액션 대체 컨트롤러의 기능을 제공합니다.

### POST /scope/BCCorrectiveActionWB/pmRmIdListInq
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRmIdListInq() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeFileDel() 메소드의 결과를 반환

### GET /scope/BCCorrectiveActionWB/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRquirementsScopeReport() 메소드의 결과를 반환, 파일 다운로드 반환

### POST /scope/BCCorrectiveActionWB/pmPopupSearchStep
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmPopupSearchStep() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeGridUpd() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeUpd() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeAdd() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeListInq() 메소드의 결과를 반환

### GET /scope/BCCorrectiveActionWB/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmExcelDownloadAll() 메소드의 결과를 반환, 파일 다운로드 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeHistory
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeHistory() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsL4Inq
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsL4Inq() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmDetailCodeUseYn
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmDetailCodeUseYn() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmReqIdDupCheck
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmReqIdDupCheck() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeFileListInq() 메소드의 결과를 반환

### POST /scope/BCCorrectiveActionWB/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 요청하려는 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRequirementsScopeExcelUpload() 메소드의 결과를 반환

---
## BCTestDefectManagement API 명세서

### POST /scope/BCTestDefectManagement/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- return : 요구사항 목록 조회 결과

### POST /scope/BCTestDefectManagement/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- return : 요구사항 추가 결과

### POST /scope/BCTestDefectManagement/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- return : 요구사항 업데이트 결과

### POST /scope/BCTestDefectManagement/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- return : 요구사항 그리드 업데이트 결과

### POST /scope/BCTestDefectManagement/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- return : 요구사항 파일 삭제 결과

### POST /scope/BCTestDefectManagement/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- return : 요구사항 삭제 결과

### 요청 및 응답에 대한 자세한 사항은 개별 API에 대한 상세 설명을 참조해주세요.
---
## BCProductsSettingController API 명세서
### POST /scope/BCProductsSetting/pmProductsSetting
#### 파라미터 정보
- requestData : 상품 설정 데이터를 담은 IDataSet 입니다.
- onlineCtx : 상품 설정 기능을 수행하는 동안의 컨텍스트를 나타내는 IOnlineContext 입니다.
#### 응답 (IDataSet)
- 상품 설정 결과를 담은 IDataSet입니다.
---
## BCSwingSystemScopeManage API 명세서
### POST scope/BCSwingSystemScopeManage/pmScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- Scope 리스트 조회 결과 

### POST scope/BCSwingSystemScopeManage/pmExcelDataAllDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (File Download)
- 액셀 파일 다운로드

### POST scope/BCSwingSystemScopeManage/pmScopeListDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- Scope 리스트 삭제 결과 

### POST scope/BCSwingSystemScopeManage/pmScopeListExcel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- Scope 리스트 액셀 결과 

### POST scope/BCSwingSystemScopeManage/pmScopeListEdit
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- Scope 리스트 수정 결과

### POST scope/BCSwingSystemScopeManage/pmScopeListSave
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- Scope 리스트 저장 결과

### POST scope/BCSwingSystemScopeManage/pmScopeListCode
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- Scope 리스트 코드 결과
---
## BCProductsStatusForCharger API 명세서
### POST /scope/BCProductsStatusForCharger/pmStatusForTester
#### 파라미터 정보
- requestData : 테스터에 대한 상품 상태 정보를 담고 있는 데이터
- onlineCtx : 온라인 컨텍스트에 대한 정보를 담고 있는 데이터
#### 응답 (IDataSet)
- service.pmStatusForTester의 실행 결과를 반환. 테스터에 대한 상품 상태 정보를 얻어오는 메소드.

### POST /scope/BCProductsStatusForCharger/pmChargerListInq
#### 파라미터 정보
- requestData : 충전기 목록 조회에 대한 데이터를 담고 있는 데이터
- onlineCtx : 온라인 컨텍스트에 대한 정보를 담고 있는 데이터
#### 응답 (IDataSet)
- service.pmChargerListInq의 실행 결과를 반환. 충전기 목록을 조회하는 메소드.

### POST /scope/BCProductsStatusForCharger/pmStatusForActionCharger
#### 파라미터 정보
- requestData : 액션 충전기에 대한 상품 상태 정보를 담고 있는 데이터
- onlineCtx : 온라인 컨텍스트에 대한 정보를 담고 있는 데이터
#### 응답 (IDataSet)
- service.pmStatusForActionCharger의 실행 결과를 반환. 액션 충전기에 대한 상품 상태 정보를 얻어오는 메소드.
---
## BCRequestReviewPlanWB API 명세서

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 업로드할 Excel 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 엑셀 업로드 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 파일 리스트 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 파일 리스트 조회 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeObjectUseYN
#### 파라미터 정보
- requestData : 사용 여부 확인 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용 여부 확인 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeObjectUseYNSel
#### 파라미터 정보
- requestData : 사용 여부 검색 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용 여부 검색 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- requestData : 엑셀 다운로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 엑셀 다운로드 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 제품 요구사항 스코프 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 업데이트 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 제품 요구사항 스코프 추가 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 추가 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 제품 요구사항 스코프 리스트 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 리스트 조회 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 제품 요구사항 스코프 그리드 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 그리드 업데이트 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 제품 요구사항 스코프 파일 삭제 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 파일 삭제 서비스 결과

### POST /scope/BCRequestReviewPlanWB/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 제품 요구사항 스코프 삭제 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스코프 삭제 서비스 결과
---
## BCInstitutionPlanController API 명세서
### POST /scope/BCInstitutionPlan/pmChckprojects
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmChckprojects 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmWorkCodeMangerExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmWorkCodeMangerExcelUpload 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmSystemCodeMangerDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmSystemCodeMangerDel 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmSystemCodeMangerLUpd02
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmSystemCodeMangerLUpd02 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmSystemCodeMangerLUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmSystemCodeMangerLUpd 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmSystemCodeMangerAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmSystemCodeMangerAdd 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmRequirementsScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmRequirementsScopeListInq 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmServiceRequestManagementExceldownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- pmServiceRequestManagementExceldownload 관련 다운로드 파일

### POST /scope/BCInstitutionPlan/pmServiceRequestManagementExcelupload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmServiceRequestManagementExcelupload 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmhidel1
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmhidel1 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmhidel2
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmhidel2 관련 응답 결과

### POST /scope/BCInstitutionPlan/pmhidel3
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- pmhidel3 관련 응답 결과

---
## BCSrDefectManagementController API 명세서

### POST scope/SrDefectManagement/pmSrDefectManagementExcelUpload
#### 파라미터 정보
- requestData : 엑셀 업로드에 필요한 데이터
- onlineCtx : 온라인 컨택스트 정보
#### 응답 (JSON)
- 업로드된 엑셀 데이터 반환

### POST scope/SrDefectManagement/pmSrDefectManagementFileListInq
#### 파라미터 정보
- requestData : 파일 리스트 조회에 필요한 데이터
- onlineCtx : 온라인 컨택스트 정보
#### 응답 (JSON)
- SrDefectManagement의 파일 리스트 반환

### POST scope/SrDefectManagement/pmExcelHistoryDownload
#### 파라미터 정보
- requestData : 엑셀 히스토리 다운로드에 필요한 데이터
- onlineCtx : 온라인 컨택스트 정보
#### 응답 (File Download)
- 요청된 엑셀 히스토리 파일 다운로드

### POST scope/SrDefectManagement/pmImageDelete
#### 파라미터 정보
- requestData : 이미지 삭제에 필요한 데이터
- onlineCtx : 온라인 컨택스트 정보
#### 응답 (JSON)
- 삭제 성공 여부 반환 

### POST scope/SrDefectManagement/pmSrDefectManagementAdd
#### 파라미터 정보
- requestData : 추가할 SrDefectManagement 데이터
- onlineCtx : 온라인 컨택스트 정보
#### 응답 (JSON)
- 추가된 SrDefectManagement 정보 반환

### POST scope/SrDefectManagement/pmSrDefectManagementDel
#### 파라미터 정보
- requestData : 삭제할 SrDefectManagement 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 삭제된 SrDefectManagement 정보 반환

### POST scope/SrDefectManagement/pmSrDefectManagementList
#### 파라미터 정보
- requestData : SrDefectManagement 리스트 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청된 SrDefectManagement 리스트 반환

### POST scope/SrDefectManagement/pmSrDefectManagementUpd
#### 파라미터 정보
- requestData : 업데이트할 SrDefectManagement 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 업데이트 된 SrDefectManagement 정보 반환

### POST scope/SrDefectManagement/pmSrDefectManagementFile
#### 파라미터 정보
- requestData : 파일 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청된 파일 정보 반환

### POST scope/SrDefectManagement/pmImageInq
#### 파라미터 정보
- requestData : 이미지 조회에 필요한 데이터
- onlineCtx : 온라인 컨택스트 정보
#### 응답 (JSON)
- 요청된 이미지 정보 반환

### POST scope/SrDefectManagement/pmClear
#### 파라미터 정보
- requestData : 클리어할 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 클리어 결과 반환
---
## BCCheckQualityDefect API 명세서
### POST /scope/BCCheckQualityDefect/pmRequirementsScopeListInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 리스트 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeAdd
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 추가 결과 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeUpd
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 업데이트 결과 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeGridUpd
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 그리드 업데이트 결과 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeFileDel
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 파일 삭제 결과 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeDel
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 삭제 결과 반환

### POST /scope/BCCheckQualityDefect/pmRquirementsScopeReport
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 보고서 다운로드 뷰 반환

### POST /scope/BCCheckQualityDefect/pmXmppNoticeSend
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- Xmpp 알림 발송 결과 반환

### POST /scope/BCCheckQualityDefect/pmPlanProgressRateInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 계획 진행률 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeHistory
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 히스토리 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmDefectStatusGrid
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 결함 상태 그리드 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmDefectStatusLeftChart
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 결함 상태 왼쪽 차트 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmImageInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 이미지 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmImageDelete
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 이미지 삭제 결과 반환

### POST /scope/BCCheckQualityDefect/pmExcelDownloadAll
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 전체 엑셀 파일 다운로드 뷰 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeFileListInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 파일 리스트 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 엑셀 파일 다운로드 뷰 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 범위 엑셀 업로드 결과 반환

### POST /scope/BCCheckQualityDefect/pmDefectStatusRightChart
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 결함 상태 오른쪽 차트 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmDetailCodeSel
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 상세 코드 선택 결과 반환

### POST /scope/BCCheckQualityDefect/pmDetailCodeUseYn
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 상세 코드 사용 여부 반환

### POST /scope/BCCheckQualityDefect/pmRequirementsDetailCodeInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 요구사항 상세 코드 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmTestIdNameListInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 테스트 ID 및 이름 리스트 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmTestExtinctChartGrid
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 테스트 소멸 차트 그리드 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmTestTypeSequenceInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 테스트 타입 순서 조회 결과 반환

### POST /scope/BCCheckQualityDefect/pmSubPrjInfoInq
#### 파라미터 정보
- IDataSet requestData : Request 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답
- 하위 프로젝트 정보 조회 결과 반환
---
## BCSwingDevPgmManager4 API 명세서

### POST /scope/BCSwingDevPgmManager4/pmUserIdCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 사용자 ID 코드 조회 결과 반환

### POST /scope/BCSwingDevPgmManager4/pmProRate
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 진행률 정보 조회 결과 반환

### POST /scope/BCSwingDevPgmManager4/pmScopeListTabInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- Scope 리스트 탭 정보 조회 결과 반환

### POST /scope/BCSwingDevPgmManager4/pmScopeHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- Scope 이력 정보 조회 결과 반환

### POST /scope/BCSwingDevPgmManager4/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- Test ID 이름 리스트 조회 결과 반환

### POST /scope/BCSwingDevPgmManager4/pmPIGridUpdate
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- PI 그리드 업데이트 결과 반환

...

### GET /scope/BCSwingDevPgmManager4/pmFileDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (DownloadView)
- 요청한 파일 다운로드

### GET /scope/BCSwingDevPgmManager4/pmExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (DownloadView)
- 요청한 엑셀 파일 다운로드

...

이 외에 여러 API들이 있음. 전부 POST 방식으로 요청 데이터와 온라인 컨텍스트 정보를 파라미터로 받아 각각의 기능을 수행하고 그 결과를 JSON으로 반환함. 특정 파일이나 엑셀 파일을 다운로드하는 API의 경우 GET 방식을 사용하며, DownloadView 형태로 응답함. 해당 API의 특정 기능이 어떤 것인지 정확히 알기 위해선 각 API가 수행하는 서비스의 코드를 참조해야 함.

---
## BCSwingDevPgmManager3 API 명세서
### POST /scope/BCSwingDevPgmManager3/pmUserIdCode
#### 파라미터 정보
- requestData : '{$key : value}' 형식의 자료를 서버에 전송
- onlineCtx : 온라인 작업 맥락 정보

#### 응답 (JSON)
- pmUserIdCode라는 이름의 데이터를 처리하고, 그 결과를 반환한다.

### POST /scope/BCSwingDevPgmManager3/pmProRate
#### 파라미터 정보
- requestData : '{$key : value}' 형식의 자료를 서버에 전송
- onlineCtx : 온라인 작업 맥락 정보

#### 응답 (JSON)
- pmProRate라는 이름의 데이터를 처리하고, 그 결과를 반환한다.

(이하 동일한 양식에 따라 API 명세서 작성) 

...

### GET /scope/BCSwingDevPgmManager3/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : '{$key : value}' 형식의 자료를 서버에 전송
- onlineCtx : 온라인 작업 맥락 정보

#### 응답 (파일 다운로드)
- pmExcelDataAllDownload라는 이름의 데이터를 처리하고, 그 결과를 파일로 반환한다. 

### POST /scope/BCSwingDevPgmManager3/pmDesignFunctionSel
#### 파라미터 정보
- requestData : '{$key : value}' 형식의 자료를 서버에 전송
- onlineCtx : 온라인 작업 맥락 정보

#### 응답 (JSON)
- pmDesignFunctionSel라는 이름의 데이터를 처리하고, 그 결과를 반환한다. 

### POST /scope/BCSwingDevPgmManager3/pmScopeObjectUseYN
#### 파라미터 정보
- requestData : '{$key : value}' 형식의 자료를 서버에 전송
- onlineCtx : 온라인 작업 맥락 정보

### POST /scope/BCSwingDevPgmManager3/pmScopeObjectUseYNSel
#### 파라미터 정보
- requestData : '{$key : value}' 형식의 자료를 서버에 전송
- onlineCtx : 온라인 작업 맥락 정보

#### 응답 (JSON)
- pmScopeObjectUseYNSel라는 이름의 데이터를 처리하고, 그 결과를 반환한다.
---
## BCRequirementsScopeManager1 API 명세서
### POST /scope/BCRequirementsScopeManager1/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 리스트 조회 결과

### POST /scope/BCRequirementsScopeManager1/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 추가 결과

### POST /scope/BCRequirementsScopeManager1/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 업데이트 결과

### POST /scope/BCRequirementsScopeManager1/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 그리드 업데이트 결과

### POST /scope/BCRequirementsScopeManager1/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 
#### 응답 (JSON)
- 요구사항 파일 삭제 결과

### POST /scope/BCRequirementsScopeManager1/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 삭제 결과

### 다른 API들도 위의 양식으로 작문이 가능합니다.
---
## BCStoreCheckListController API 명세서
### POST /scope/BCStoreCheckList/pmReqIdInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

### POST /scope/BCStoreCheckList/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsL4Inq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmDetailCodeSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsDetailCodeInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeObjectUseYN
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmRequirementsScopeObjectUseYNSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmgetPrecStoreListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 

### POST /scope/BCStoreCheckList/pmCheckPrecTask
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
---
## BCDesignManagerController API 명세서
### 요청방식 POST /scope/BCDesignManager/pmExcelDownload
#### 파라미터 정보
- requestData : 엑셀 파일 다운로드 할 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (DownloadView)
- 다운로드할 파일과 파일명 정보 반환

### 요청방식 POST /scope/BCDesignManager/pmAttchFileListInq
#### 파라미터 정보
- requestData : 첨부파일 리스트를 조회하는 데 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 첨부 파일 리스트 데이터 반환

### 요청방식 POST /scope/BCDesignManager/pmFileDownload
#### 파라미터 정보
- requestData : 파일 다운로드 할 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (DownloadView)
- 다운로드할 파일과 파일명 정보 반환

...(이하 생략)...

### 요청방식 POST /scope/BCDesignManager/pmApprovReset
#### 파라미터 정보
- requestData : 승인 리셋에 필요한 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 승인 리셋결과를 데이터 셋으로 반환
---
## BCSwingDevPgmManager5 API 명세서
### POST scope/BCSwingDevPgmManager5/pmUserIdCode
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 사용자 ID 코드 정보

### POST scope/BCSwingDevPgmManager5/pmProRate
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 비율 정보

### POST scope/BCSwingDevPgmManager5/pmScopeListTabInq
#### 파라미터 정보
- requestData(필수) : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 리스트 탭 조회 정보

### POST scope/BCSwingDevPgmManager5/pmScopeHistory
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 히스토리 정보

### POST scope/BCSwingDevPgmManager5/pmTestIdNameListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 ID 명칭 리스트 조회 정보

### POST scope/BCSwingDevPgmManager5/pmPIGridUpdate
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 개인정보 그리드 업데이트 정보

### POST scope/BCSwingDevPgmManager5/pmScopeListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 리스트 조회 정보

### POST scope/BCSwingDevPgmManager5/pmScopeAdd
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 추가 정보

### POST scope/BCSwingDevPgmManager5/pmTaskName
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 작업명 정보

### POST scope/BCSwingDevPgmManager5/pmScopeUpd
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 업데이트 정보

### POST scope/BCSwingDevPgmManager5/pmScopeDel
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 삭제 정보

### POST scope/BCSwingDevPgmManager5/pmScopeInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 조회 정보

### POST scope/BCSwingDevPgmManager5/pmPlInfoInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 플랫폼 정보 조회 정보

### POST scope/BCSwingDevPgmManager5/pmConfirmInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 확인 조회 정보

### POST scope/BCSwingDevPgmManager5/pmExcelUpload
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 업로드 정보

### POST scope/BCSwingDevPgmManager5/pmFileDel
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 파일 삭제 정보

### POST scope/BCSwingDevPgmManager5/pmPlCheckInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 플랫폼 체크 조회 정보

### POST scope/BCSwingDevPgmManager5/pmScopeDel2
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 삭제2 정보

### POST scope/BCSwingDevPgmManager5/pmImageInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 이미지 조회 정보

### POST scope/BCSwingDevPgmManager5/pmImageDelete
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 이미지 삭제 정보

### POST scope/BCSwingDevPgmManager5/pmChangeId
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 아이디 변경 정보

### POST scope/BCSwingDevPgmManager5/pmScopeGridUpd
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 그리드 업데이트 정보

### POST scope/BCSwingDevPgmManager5/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 승인 설정 조회 정보

### POST scope/BCSwingDevPgmManager5/pmWorkingdayInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 근무일 조회 정보

### POST scope/BCSwingDevPgmManager5/pmAttchFileListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 첨부파일 리스트 조회 정보

### POST scope/BCSwingDevPgmManager5/pmNcpCILinkDataInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- NCP CI링크 데이터 조회 정보

### POST scope/BCSwingDevPgmManager5/pmInsepctionInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 검사 조회 정보

### POST scope/BCSwingDevPgmManager5/pmDesignFunctionSel
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 디자인 함수 선택 정보

### POST scope/BCSwingDevPgmManager5/pmScopeObjectUseYN
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 오브젝트 사용 유무 정보

### POST scope/BCSwingDevPgmManager5/pmScopeObjectUseYNSel
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 스코프 오브젝트 사용 유무 선택 정보

### GET scope/BCSwingDevPgmManager5/pmFileDownload
#### 파라미터 정보
- requestData(필수) : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Download)
- 다운로드 될 파일 정보

### GET scope/BCSwingDevPgmManager5/pmExcelDownload
#### 파라미터 정보
- requestData(필수) : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Download)
- 다운로드 될 엑셀 파일 정보

### GET scope/BCSwingDevPgmManager5/pmExcelDataAllDownload
#### 파라미터 정보
- requestData(필수) : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Download)
- 모든 데이터를 포함한 다운로드 될 엑셀 파일 정보

---
## BCAsisObjectManagementController API 명세서
### POST /scope/BCAsisObjectManagement/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 필요 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 목록 조회 서비스의 실행 결과

### POST /scope/BCAsisObjectManagement/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 필요 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 추가 서비스의 실행 결과

### POST /scope/BCAsisObjectManagement/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 필요 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 업데이트 서비스의 실행 결과

### POST /scope/BCAsisObjectManagement/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 필요 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 그리드 업데이트 서비스의 실행 결과

### POST /scope/BCAsisObjectManagement/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 필요 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 파일 삭제 서비스의 실행 결과

### POST /scope/BCAsisObjectManagement/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 필요 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요구사항 범위 삭제 서비스의 실행 결과

### GET /scope/BCAsisObjectManagement/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 필요 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (파일 다운로드)
- 요구사항 범위 보고서 다운로드 서비스의 실행 결과

*여기서부터 아래 API들도 위와 같이 작성해주세요.*
---
## BCCorrectiveActionHKController API 명세서

### POST /scope/BCCorrectiveActionHK/pmCorrectiveActionListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환되는 데이터

### POST /scope/BCCorrectiveActionHK/pmCorrectiveActionHKAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환되는 데이터

### POST /scope/BCCorrectiveActionHK/pmCorrectiveActionHKUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환되는 데이터

### POST /scope/BCCorrectiveActionHK/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환되는 데이터

### POST /scope/BCCorrectiveActionHK/pmCorrectiveActionHKDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 반환되는 데이터


- 여기서부터는 위와 같이 각 API 요청방식, API 경로, 파라미터 정보, 응답 방식을 명세해야 하지만, 위에서 언급한 것처럼 기본적인 패턴이 동일하므로 생략하겠습니다. 다만 파일 다운로드 관련 API는 반환 방식이 조금 다르므로 별도로 명세하겠습니다.

### POST /scope/BCCorrectiveActionHK/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 요청 결과에 따른 파일을 반환

### POST /scope/BCCorrectiveActionHK/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 요청 결과에 따른 파일을 반환
---
## BCRequirementsScopeManager0 API 명세서
### POST /scope/BCRequirementsScopeManager0/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항의 리스트 정보를 조회하는 API

### POST /scope/BCRequirementsScopeManager0/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항을 추가하는 API

### POST /scope/BCRequirementsScopeManager0/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항을 업데이트하는 API

### POST /scope/BCRequirementsScopeManager0/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항을 삭제하는 API

### POST /scope/BCRequirementsScopeManager0/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 그리드 형식의 요구사항을 업데이트하는 API

### POST /scope/BCRequirementsScopeManager0/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 관련 첨부파일을 삭제하는 API

### GET /scope/BCRequirementsScopeManager0/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 요구사항 보고서 다운로드 API

### POST /scope/BCRequirementsScopeManager0/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 계획된 진행률 조회 API

### POST /scope/BCRequirementsScopeManager0/pmRequirementsScopeHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항의 변경이력을 조회하는 API

### POST /scope/BCRequirementsScopeManager0/pmRequirementsSubPrjHistory
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 하위 프로젝트의 변경이력을 조회하는 API

---
## BCDesignInterfaceManager API 명세서
아래 명세서는 BCDesignInterfaceManager 프로그램에 관한 정보를 제공합니다.

### POST /scope/BCDesignInterfaceManager/pmExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (파일 다운로드)
- 엑셀 파일이 다운로드 됩니다.

### POST /scope/BCDesignInterfaceManager/pmExcelDownloadNew
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (파일 다운로드)
- 새로운 엑셀 파일이 다운로드 됩니다.

### POST /scope/BCDesignInterfaceManager/pmAttchFileListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 첨부된 파일 리스트 정보를 리턴합니다.

### POST /scope/BCDesignInterfaceManager/pmFileDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (파일 다운로드)
- 파일을 다운로드합니다.

### POST /scope/BCDesignInterfaceManager/pmFileDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (JSON)
- 파일 삭제 결과를 리턴합니다.

(나머지 API에 대한 명세도 같은 방식으로 작성해야 합니다. 위에 제시한 방식대로 각 세부 요청 경로, 요청 파라미터 정보, 응답 방식과 그 설명을 아래에 계속 작성해야 합니다.)
---
## BCTestManagerforTMSController API 명세서

### POST /scope/bctestmanagerfortms/pmTestListInq
#### 파라미터 정보
- requestBody(IdataSet requestData, IOnlineContext onlineCtx) : 테스트 리스트 조회를 위한 데이터와 온라인 컨텍스트 요청
#### 응답 (IDataSet)
- 테스트 리스트 데이터 반환

### POST /scope/bctestmanagerfortms/pmTestListInqPop
#### 파라미터 정보
- requestBody(IdataSet requestData, IOnlineContext onlineCtx) : 팝업으로 테스트 리스트 조회를 위한 데이터와 온라인 컨텍스트 요청
#### 응답 (IDataSet)
- 팝업으로 테스트 리스트 데이터 반환

### POST /scope/bctestmanagerfortms/pmTestManagerAdd
#### 파라미터 정보
- requestBody(IdataSet requestData, IOnlineContext onlineCtx) : 테스트 매니저 추가를 위한 데이터와 온라인 컨텍스트 요청
#### 응답 (IDataSet)
- 테스트 매니저 추가 데이터 반환

### POST /scope/bctestmanagerfortms/pmTestManagerUpd
#### 파라미터 정보
- requestBody(IdataSet requestData, IOnlineContext onlineCtx) : 테스트 매니저 업데이트를 위한 데이터와 온라인 컨텍스트 요청
#### 응답 (IDataSet)
- 테스트 매니저 업데이트 데이터 반환

### POST /scope/bctestmanagerfortms/pmTestManagerDel
#### 파라미터 정보
- requestBody(IdataSet requestData, IOnlineContext onlineCtx) : 테스트 매니저 삭제를 위한 데이터와 온라인 컨텍스트 요청
#### 응답 (IDataSet)
- 테스트 매니저 삭제 데이터 반환

### POST /scope/bctestmanagerfortms/pmTestManagerExcelDownload
#### 파라미터 정보
- requestBody(IdataSet requestData, IOnlineContext onlineCtx) : 테스트 매니저 엑셀 다운로드를 위한 데이터와 온라인 컨텍스트 요청
#### 응답 (DownloadView)
- 다운로드 가능한 엑셀 파일 정보 반환

### POST /scope/bctestmanagerfortms/pmTestManagertExcelUpload
#### 파라미터 정보
- requestBody(IdataSet requestData, IOnlineContext onlineCtx) : 테스트 매니저 엑셀 업로드를 위한 데이터와 온라인 컨텍스트 요청
#### 응답 (IDataSet)
- 업로드된 엑셀 데이터 반환

(뒤의 API들은 동일한 방식으로 API 명세서를 생성할 수 있습니다. 각 API의 역할은 URI에서 추정 가능합니다.)

(참고: NameOfApi 는 해당 API의 역할을 나타내는 것으로, 실제 API 호출 시 이 부분은 API의 실제 경로가 됩니다.)
---
## BCDesignProgramManager5 API 명세서

### POST /scope/BCDesignProgramManager5/pmApprovalSettingInq
#### 파라미터 정보
- requestBody (IDataSet requestData) : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답
- IDataSet 리턴

### GET /scope/BCDesignProgramManager5/pmExcelDownload
#### 파라미터 정보
- requestBody (IDataSet requestData) : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답
- 엑셀 파일 다운로드

### POST /scope/BCDesignProgramManager5/pmScopeDel
#### 파라미터 정보
- requestBody (IDataSet requestData) : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답
- IDataSet 리턴

### POST /scope/BCDesignProgramManager5/pmScopeInq
#### 파라미터 정보
- requestBody (IDataSet requestData) : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답
- IDataSet 리턴

### POST /scope/BCDesignProgramManager5/pmPlInfoInq
#### 파라미터 정보
- requestBody (IDataSet requestData) : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답
- IDataSet 리턴

마찬가지 패턴으로 반복되는 나머지 API들의 모든 경로는 'POST' 형식이며, 파라미터 정보와 응답은 동일하게 적용됩니다. 

### GET 요청 메서드가 있는 API 명세 는 ["pmExcelDownload", "pmFileDownload", "pmExcelDataAllDownload"] 와 같은 형식으로 파일 다운로드 서비스를 제공하며, 파라미터 정보는 'requestBody (IDataSet requestData)'와 'IOnlineContext onlineCtx'가 있습니다.응답은 해당하는 파일을 다운로드하는 서비스입니다. 

### POST 요청 메서드가 있는 API는 ['"pmApprovalSettingInq", "pmScopeDel", "pmScopeInq", "pmPlInfoInq"] 등과 같은 서비스를 제공하며, 파라미터 정보는 'requestBody (IDataSet requestData)'와 'IOnlineContext onlineCtx'가 있습니다. 응답은 서비스에 따라 동작이 수행되고 결과값을 'IDataSet' 형태로 리턴합니다.
---
## BCDesignProgramManager2 API 명세서

### POST /scope/BCDesignProgramManager2/pmScopeListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 받은 데이터 일람

### POST /scope/BCDesignProgramManager2/pmScopeGridUpd
#### 파라미터 정보
- IDataSet requestData: 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 받은 데이터 일람

### POST /scope/BCDesignProgramManager2/pmApprovalSettingInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 받은 데이터 일람

### POST /scope/BCDesignProgramManager2/pmWorkingdayInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 받은 데이터 일람

### POST /scope/BCDesignProgramManager2/pmAttchFileListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 서비스에서 받은 데이터 일람

(이하 생략...)
---
## BCRequirementsScopeManager1ForFinnq API 명세서
### POST /scope/BCRequirementsScopeManager1ForFinnq/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 목록 조회 결과

### POST /scope/BCRequirementsScopeManager1ForFinnq/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 추가 결과

### POST /scope/BCRequirementsScopeManager1ForFinnq/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 업데이트 결과

### POST /scope/BCRequirementsScopeManager1ForFinnq/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- Grid 요구사항 업데이트 결과

### POST /scope/BCRequirementsScopeManager1ForFinnq/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 파일 삭제 결과

### POST /scope/BCRequirementsScopeManager1ForFinnq/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 삭제 결과

### GET /scope/BCRequirementsScopeManager1ForFinnq/pmRquirementsScopeReport
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요구사항 보고서

### POST /scope/BCRequirementsScopeManager1ForFinnq/pmPlanProgressRateInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 계획 진행률 조회 결과

나머지 API에 대한 설명도 위와 같은 형식으로 작성이 되어야 한다.
---
## BCITestManagerController API 명세서
### POST /scope/BCITestManager/pmExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (httpServletResponse)
- 다운로드 뷰(다운로드 파일, 파일 이름)

### POST /scope/BCITestManager/pmExcelDownloadAll
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (httpServletResponse)
- 다운로드 뷰(다운로드 파일, 파일 이름)

### POST /scope/BCITestManager/pmITestManagerAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmITestMangerUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmITestMangerGridUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmITestMangerDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmITestManagerListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmITestManagerExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmITestManagerReport
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmLinkYNInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

### POST /scope/BCITestManager/pmTesterIdInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (데이터셋)
- 처리 결과 데이터셋

---
## BCDesignDevManager API 명세서
기본 API 경로 : scope/BCDesignDevManager

### POST /pmExcelDownload
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File Download)
- 엑셀파일 다운로드

### POST /pmAttchFileListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 첨부 파일 리스트 조회

### POST /pmFileDownload
#### 파라미터 정보
- requestData : 사용자 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File Download)
- 파일 다운로드

### POST /pmFileDel
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 파일 삭제

(이하 명세 생략)

### GET /getList
#### 파라미터 정보
- 없음
#### 응답 (HTML)
- "/jsp/sc/SScopeRetrieve.jsp" 페이지로 이동 (링크 정보는 환경에 따라 변경될 수 있음)

---
## BCSQualityImprovementDashboard2Controller API 명세서
### POST /scope/SQualityImprovementDashboard2/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 IOnlineContext 객체
#### 응답 (JSON)
- 요구사항 범위 목록의 조회 결과가 포함된 IDataSet 객체를 반환합니다.

### POST /scope/SQualityImprovementDashboard2/pmRequirementsScopeAdd
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 IOnlineContext 객체
#### 응답 (JSON)
- 요구사항 범위 추가 결과가 포함된 IDataSet 객체를 반환합니다.

### POST /scope/SQualityImprovementDashboard2/pmRequirementsScopeUpd
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 IOnlineContext 객체
#### 응답 (JSON)
- 요구사항 범위 업데이트 결과가 포함된 IDataSet 객체를 반환합니다.

### POST /scope/SQualityImprovementDashboard2/pmRequirementsScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 IOnlineContext 객체
#### 응답 (JSON)
- 그리드 형태의 요구사항 범위 업데이트 결과가 포함된 IDataSet 객체를 반환합니다.

### POST /scope/SQualityImprovementDashboard2/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 IOnlineContext 객체
#### 응답 (JSON)
- 요구사항 범위 파일 삭제 결과가 포함된 IDataSet 객체를 반환합니다.

### POST /scope/SQualityImprovementDashboard2/pmRequirementsScopeDel
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 IOnlineContext 객체
#### 응답 (JSON)
- 요구사항 범위 삭제 결과가 포함된 IDataSet 객체를 반환합니다.

이외의 API는 이와 비슷한 방식으로 동작합니다. 모든 API는 요구사항 범위에 관련된 데이터를 처리하고 결과를 IDataSet 객체로 반환합니다.

---
## BCDesignProgramManager3 API 명세서
### POST /scope/BCDesignProgramManager3/pmProRate
#### 파라미터 정보
- requestData : API 요청을 위한 데이터
- onlineCtx: 온라인 컨텍스트 정보

#### 응답 (ResponseBody)
- 프로젝트 비율 반환

### POST /scope/BCDesignProgramManager3/pmUserIdCode
#### 파라미터 정보
- requestData : API 요청을 위한 데이터
- onlineCtx: 온라인 컨텍스트 정보

#### 응답 (ResponseBody)
- 사용자 ID 코드 반환

### POST /scope/BCDesignProgramManager3/pmTaskName
#### 파라미터 정보
- requestData : API 요청을 위한 데이터
- onlineCtx: 온라인 컨텍스트 정보

#### 응답 (ResponseBody)
- 작업 이름 반환

### POST /scope/BCDesignProgramManager3/pmScopeAdd
#### 파라미터 정보
- requestData : API 요청을 위한 데이터
- onlineCtx: 온라인 컨텍스트 정보

#### 응답 (ResponseBody)
- Scope 추가 결과 반환

### POST /scope/BCDesignProgramManager3/pmScopeUpd
#### 파라미터 정보
- requestData : API 요청을 위한 데이터
- onlineCtx: 온라인 컨텍스트 정보

#### 응답 (ResponseBody)
- Scope 업데이트 결과 반환

### POST /scope/BCDesignProgramManager3/pmScopeDel
#### 파라미터 정보
- requestData : API 요청을 위한 데이터
- onlineCtx: 온라인 컨텍스트 정보

#### 응답 (ResponseBody)
- Scope 삭제 결과 반환

##### 이하 이런 식으로 명세서를 작성할 수 있습니다. 시간 관계상 여기까지만 작성하였습니다. 다른 부분도 동일한 방식으로 작성하면 됩니다.+

---
## BCRmManagementWBController API 명세서
### POST /scope/BCRmManagementWB/pmRequirementsScopeUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 업데이트 결과

### POST /scope/BCRmManagementWB/pmRequirementsScopeGridUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 그리드 업데이트 결과

### POST /scope/BCRmManagementWB/pmRequirementsScopeFileDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 파일 삭제 결과

### POST /scope/BCRmManagementWB/pmRequirementsScopeAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 추가 결과

### POST /scope/BCRmManagementWB/pmRequirementsScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 리스트 조회 결과

### POST /scope/BCRmManagementWB/pmRequirementsScopeDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 삭제 결과

### POST /scope/BCRmManagementWB/pmRquirementsScopeReport
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (FILE)
- 요구사항 범위 리포트 다운로드

### POST /scope/BCRmManagementWB/pmPopupSearchStep
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 팝업 검색 스탭 결과

### POST /scope/BCRmManagementWB/pmExcelDownloadAll
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (FILE)
- 결과 엑셀 다운로드

### POST /scope/BCRmManagementWB/pmRequirementsScopeHistory
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 히스토리 결과

### POST /scope/BCRmManagementWB/pmRequirementsL4Inq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- L4 요구사항 조회 결과

### POST /scope/BCRmManagementWB/pmSubProjectLeaderInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 하위 프로젝트 리더 조회 결과

### POST /scope/BCRmManagementWB/pmReqIdDupCheck
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 아이디 중복 체크 결과

### POST /scope/BCRmManagementWB/pm_isk_is_yn
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- ISK가 Y/N인지 확인하는 결과

### POST /scope/BCRmManagementWB/pmRmIdListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- RmId 리스트 조회 결과

### POST /scope/BCRmManagementWB/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 엑셀 업로드 결과

### POST /scope/BCRmManagementWB/pmRequirementsScopeFileListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 요구사항 범위 파일 리스트 조회 결과
---
## BCDesignProgramManager4 API 명세서
### POST scope/BCDesignProgramManager4/pmExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 엑셀 파일 다운로드 기능

### POST scope/BCDesignProgramManager4/pmAttchFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 첨부 파일 리스트 조회 기능

### POST scope/BCDesignProgramManager4/pmFileDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 파일 다운로드 기능

### POST scope/BCDesignProgramManager4/pmFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 파일 삭제 기능

### POST scope/BCDesignProgramManager4/pmScopeGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 스코프 그리드 업데이트 기능

(이하 생략...)
---
## BCChangeManager API 명세서
### POST scope/BCChangeManager/pmLoginUserInfoInq
#### 파라미터 정보
- requestData : 로그인한 사용자 정보에 대한 요청 데이터
- onlineCtx : 온라인 맥락 정보
#### 응답 (IDataSet)
- 로그인한 사용자 정보 조회 결과 반환

### POST scope/BCChangeManager/pmChangeListInq
#### 파라미터 정보
- requestData : 변경 목록 조회에 대한 요청 데이터
- onlineCtx : 온라인 맥락 정보
#### 응답 (IDataSet)
- 변경 목록 조회 결과 반환

### POST scope/BCChangeManager/pmSearchUserListInq
#### 파라미터 정보
- requestData : 사용자 목록 조회에 대한 요청 데이터
- onlineCtx : 온라인 맥락 정보
#### 응답 (IDataSet)
- 사용자 목록 조회 결과 반환

### POST scope/BCChangeManager/pmApprvUserUpd
#### 파라미터 정보
- requestData : 승인 사용자 업데이트에 대한 요청 데이터
- onlineCtx : 온라인 맥락 정보
#### 응답 (IDataSet)
- 승인 사용자 업데이트 결과 반환

### POST scope/BCChangeManager/pmChangeManagerFileDel
#### 파라미터 정보
- requestData : 파일 삭제에 대한 요청 데이터
- onlineCtx : 온라인 맥락 정보
#### 응답 (IDataSet)
- 파일 삭제 결과 반환

모든 API들은 POST 방식으로 요청이며, 반환은 IDataSet 형태를 사용합니다. 추가적인 기능에 대한 정보는 코드에서 확인할 수 있습니다.
---
## BCInstitutionActController API 명세서

### POST /scope/BCInstitutionAct/pmChckprojects
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmChckprojects(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmWorkCodeMangerExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmWorkCodeMangerExcelUpload(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmSystemCodeMangerDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmSystemCodeMangerDel(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmSystemCodeMangerLUpd02
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmSystemCodeMangerLUpd02(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmSystemCodeMangerLUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmSystemCodeMangerLUpd(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmSystemCodeMangerAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmSystemCodeMangerAdd(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmRequirementsScopeListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmRequirementsScopeListInq(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmServiceRequestManagementExceldownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (FILE DOWNLOAD)
- excelFileNm과 excelPath를 이용하여 파일을 다운로드

### POST /scope/BCInstitutionAct/pmServiceRequestManagementExcelupload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmServiceRequestManagementExcelupload(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmhidel1
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmhidel1(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmhidel2
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmhidel2(requestData, onlineCtx) : 서비스 결과

### POST /scope/BCInstitutionAct/pmhidel3
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 Context 정보
#### 응답 (JSON)
- service.pmhidel3(requestData, onlineCtx) : 서비스 결과
---
## BCCheckQualityDashBoardMgrController API 명세서
### POST /scope/BCCheckQualitDashBoard/dmCheckQualityDashBoardMgr
#### 파라미터 정보
- IDataSet requestData : 사용자로부터 요청을 받기 위한 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 서비스로부터 반환된 데이터 세트
---
## BCBlogBoard API 명세서
### POST /blog/BlogBoard/pmBlogBoardList
#### 파라미터 정보
- IDataSet requestData : 블로그 게시판 리스트 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 게시판 리스트 정보

### POST /blog/BlogBoard/pmBlogBoardName
#### 파라미터 정보
- IDataSet requestData : 블로그 게시판 이름 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 게시판 이름 정보

### POST /blog/BlogBoard/pmBlogBoardInfo
#### 파라미터 정보
- IDataSet requestData : 블로그 게시판 정보 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 게시판 상세 정보

---
## BCBlogCmt API 명세서
### POST blog/BlogCmt/pmBlogCmtInsert
#### 파라미터 정보
- requestBody 데이터 (IDataSet requestData) : 블로그 댓글 정보 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 댓글 등록에 대한 결과 정보 

### POST blog/BlogCmt/pmBlogCmtUpdate
#### 파라미터 정보
- requestBody 데이터 (IDataSet requestData) : 변동된 블로그 댓글 정보 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 댓글 갱신에 대한 결과 정보

### POST blog/BlogCmt/pmBlogCmtDelete
#### 파라미터 정보
- requestBody 데이터 (IDataSet requestData) : 삭제될 블로그 댓글 정보  
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 댓글 삭제에 대한 결과 정보

### POST blog/BlogCmt/pmBlogCmtList
#### 파라미터 정보
- requestBody 데이터 (IDataSet requestData) : 블로그 댓글 리스트 조회 요청 정보 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 댓글 리스트 정보 

### POST blog/BlogCmt/pmBlogCmtInfo
#### 파라미터 정보
- requestBody 데이터 (IDataSet requestData) : 특정 블로그 댓글에 대한 정보 조회 요청 정보 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 특정 블로그 댓글에 대한 상세 정보

---
## BCBoardMgr API 명세서
### POST /blog/BCBoardMgr/pmBoardSubmit
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 게시물 제출 결과

### POST /blog/BCBoardMgr/pmBoardDelete
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 게시물 삭제 결과

### POST /blog/BCBoardMgr/pmBoardList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 게시물 목록 정보
---
## BCBlogUser API 명세서
### POST blog/BlogUser/pmBlogInsert
#### 파라미터 정보
- requestData : 요청을 위한 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답(ResponseBody)
- 블로그에 관한 정보를 삽입하고 그 결과를 반환

### POST blog/BlogUser/pmBlogAnswerO
#### 파라미터 정보
- requestData : 요청을 위한 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답(ResponseBody)
- 블로그 답변이 정상적으로 작성된 경우에 대한 정보를 반환

### POST blog/BlogUser/pmBlogAnswerX
#### 파라미터 정보
- requestData : 요청을 위한 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답(ResponseBody)
- 블로그 답변이 실패한 경우에 대한 정보를 반환

### POST blog/BlogUser/pmBlogSysdate
#### 파라미터 정보
- requestData : 요청을 위한 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답(ResponseBody)
- 시스템의 현재 날짜와 시간에 관한 정보를 반환

### POST blog/BlogUser/pmBlogCheck
#### 파라미터 정보
- requestData : 요청을 위한 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답(ResponseBody)
- 블로그의 정보를 확인하고 그 결과를 반환

### POST blog/BlogUser/pmBlogUserInfo
#### 파라미터 정보
- requestData : 요청을 위한 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답(ResponseBody)
- 블로그 사용자 정보를 반환

---
## BCBlogQuiz API 명세서
### POST /blog/BlogQuiz/pmBlogQuiz
#### 파라미터 정보
- requestData : 요청 데이터에 관한 정보를 포함하는 IDataSet 형식의 객체
- onlineCtx : 온라인 작업 상황에 대한 정보를 포함하는 IOnlineContext 형식의 객체
#### 응답 (IDataSet)
- pmBlogQuiz 메소드를 호출하여 반환된 IDataSet 객체 정보
---
## BCBlogArticle API 명세서
### POST /blog/BlogArticle/pmBlogArticleInsert
#### 파라미터 정보
- requestData : 블로그 게시글 생성 정보 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 생성 결과

### POST /blog/BlogArticle/pmBlogArticleCmtPlus
#### 파라미터 정보
- requestData : 블로그 게시글의 댓글 증가 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글의 댓글 증가 결과

### POST /blog/BlogArticle/pmBlogArticleCmtMinus
#### 파라미터 정보
- requestData : 블로그 게시글의 댓글 감소 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글의 댓글 감소 결과

### POST /blog/BlogArticle/pmBlogArticleReadPlus
#### 파라미터 정보
- requestData : 블로그 게시글의 조회수 증가 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글의 조회수 증가 결과

### POST /blog/BlogArticle/pmBlogArticleLikePlus
#### 파라미터 정보
- requestData : 블로그 게시글의 좋아요 증가 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글의 좋아요 증가 결과

### POST /blog/BlogArticle/pmBlogArticleLikeMinus
#### 파라미터 정보
- requestData : 블로그 게시글의 좋아요 감소 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글의 좋아요 감소 결과

### POST /blog/BlogArticle/pmBlogArticleDataUpdate
#### 파라미터 정보
- requestData : 블로그 게시글 업데이트 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 업데이트 결과

### POST /blog/BlogArticle/pmBlogArticleDelete
#### 파라미터 정보
- requestData : 블로그 게시글 삭제 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 삭제 결과

### POST /blog/BlogArticle/pmBlogArticleAll
#### 파라미터 정보
- requestData : 모든 블로그 게시글 조회 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 모든 블로그 게시글 조회 결과

### POST /blog/BlogArticle/pmBlogArticleList
#### 파라미터 정보
- requestData : 블로그 게시글 리스트 조회 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 리스트 조회 결과

### POST /blog/BlogArticle/pmBlogArticleInfo
#### 파라미터 정보
- requestData : 블로그 게시글 상세 정보 조회
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 상세 정보 조회 결과

### POST /blog/BlogArticle/pmBlogFindBoardNo
#### 파라미터 정보
- requestData : 블로그 게시판 번호 조회 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시판 번호 조회 결과

### POST /blog/BlogArticle/pmBlogArticleTagList
#### 파라미터 정보
- requestData : 블로그 게시글 태그 리스트 조회 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 태그 리스트 조회 결과

### POST /blog/BlogArticle/pmBlogArtSearch
#### 파라미터 정보
- requestData : 블로그 게시글 검색 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 검색 결과

### POST /blog/BlogArticle/pmBlogArtConSearch
#### 파라미터 정보
- requestData : 블로그 게시글 내용 검색 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 내용 검색 결과

### POST /blog/BlogArticle/pmBlogArtTagSearch
#### 파라미터 정보
- requestData : 블로그 게시글 태그로 검색 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DataSet)
- 블로그 게시글 태그로 검색 결과
---
## BCBlogLikeCheck API 명세서

### POST /blog/BlogLikeCheck/pmBlogLikeCheckInsert
#### 파라미터 정보
- requestData : 블로그 좋아요 삽입 요청 정보를 담은 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 좋아요 삽입 처리 결과를 반환

### POST /blog/BlogLikeCheck/pmBlogLikeCheckDelete
#### 파라미터 정보
- requestData : 블로그 좋아요 삭제 요청 정보를 담은 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 좋아요 삭제 처리 결과를 반환

### POST /blog/BlogLikeCheck/pmBlogLikeCheck
#### 파라미터 정보
- requestData : 블로그 좋아요 확인 요청 정보를 담은 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 블로그 좋아요 확인 처리 결과를 반환
---
## CommonCodeController API 명세서

### GET /agile/commoncode/getList
#### 파라미터 정보
- param : Map 형식으로 서비스로 전달하는 파라미터들의 항목들
#### 응답 (JSON)
- 서비스로부터 받아온 리스트를 JSON 형식으로 반환

### POST /agile/commoncode/register
#### 파라미터 정보
- param : AgCommonCode 타입의 리스트 객체
- session : 세션 정보
#### 응답 (void)
- 서비스로부터 반환받은 결과를 JSON이나 XML로 반환하지 않음

### Exception Handler /agile/commoncode/
#### 파라미터 정보
- e : 예외 발생 시 예외 정보
#### 응답 (JSON)
- 발생한 예외에 대한 정보를 JSON 형태로 반환

---
## RedmineInterfaceController API 명세서

### POST /agile/redmine_if/synchProjectList
#### 파라미터 정보
- serviceId : 서비스의 ID

#### 응답 (JSON)
- 반응 없음

### POST /agile/redmine_if/synchProjectsByPms
#### 파라미터 정보
- None

#### 응답 (JSON)
- 반응 없음

### POST /agile/redmine_if/synchIssueList
#### 파라미터 정보
- projectNo : 프로젝트 번호
- linkProjectNo : 연결된 프로젝트 번호

#### 응답 (JSON)
- 반응 없음

### POST /agile/redmine_if/checkJql
#### 파라미터 정보
- None

#### 응답 (JSON)
- 해당 서비스에 대한 정보 반환

### POST /agile/redmine_if/dbError
#### 파라미터 정보
- None

#### 응답 (JSON)
- SQL 오류에 대한 정보를 반환

### POST /agile/redmine_if/defaultException
#### 파라미터 정보
- None

#### 응답 (JSON)
- 시스템 오류에 대한 정보를 반환
---
## JiraInterfaceController API 명세서

### HTTP POST `/agile/jira_if/synchProjectList`
#### 파라미터 정보
- serviceId : 서비스 ID
#### 응답 (HTTP)
- 프로젝트 리스트 동기화를 위한 빈 응답

### HTTP POST `/agile/jira_if/synchProjectsByPms`
#### 파라미터 정보
- 패러미터 정보는 HTTP POST body로 이루어져 있으며, 세부 정보는 서버에서 설정
#### 응답 (HTTP)
- PMS로부터 프로젝트 동기화를 위한 빈 응답

### HTTP POST `/agile/jira_if/synchIssueList`
#### 파라미터 정보
- projectNo : 프로젝트 번호
- linkProjectNo : 연계 프로젝트 번호
#### 응답 (HTTP)
- 이슈 리스트 동기화를 위한 빈 응답

### HTTP POST `/agile/jira_if/checkJql`
#### 파라미터 정보
- 파라미터 정보는 HTTP POST body로 이루어져 있으며, 세부 정보는 서버에서 설정
#### 응답 (HTTP)
- Map 타입을 반환함, JQL 검증 결과 반환

### HTTP POST `/agile/jira_if/dbError`
#### 파라미터 정보
- 없음
#### 응답 (HTTP)
- 가상의 메소드로, SQL 오류 처리를 위한 메시지 반환

### HTTP POST `/agile/jira_if/defaultException`
#### 파라미터 정보
- 없음
#### 응답 (HTTP)
- 가상의 메소드로, 기본 예외 처리를 위한 메시지 반환
---
## Agile BackLog API 명세서

### GET /agile/backlog/getTestList
#### 파라미터 정보
- param : 테스트 목록을 가져오는 요청에 필요한 파라미터들의 맵
#### 응답 (List)
- Test 목록의 리스트

### GET /agile/backlog/getList
#### 파라미터 정보
- param : 목록을 가져오는 요청에 필요한 파라미터들의 맵
#### 응답 (List)
- 목록의 리스트

### GET /agile/backlog/agBackLogInit
#### 파라미터 정보
- param : BackLog 초기화 요청에 필요한 파라미터들의 맵
#### 응답 (List)
- 초기화된 BackLog의 리스트

### GET /agile/backlog/agBackScJira
#### 파라미터 정보
- param : Jira Backlog를 호출하기 위한 요청에 필요한 파라미터들의 맵
#### 응답 (List)
- Jira Backlog의 리스트

### GET /agile/backlog/agBackScTy
#### 파라미터 정보
- param : Ty Backlog를 호출하기 위한 요청에 필요한 파라미터들의 맵
#### 응답 (List)
- Ty Backlog의 리스트

### GET /agile/backlog/agBackCommon
#### 파라미터 정보
- param : 공통 Backlog 호출 요청에 필요한 파라미터들의 맵
#### 응답 (Map)
- 공통 Backlog의 맵 정보

### GET /agile/backlog/geAgtList
#### 파라미터 정보
- param : Agt 목록을 가져오는 요청에 필요한 파라미터들의 맵
#### 응답 (Map)
- Agt 목록 맵 정보

### GET /agile/backlog/agBackLogList
#### 파라미터 정보
- param : BackLog 목록을 가져오는 요청에 필요한 파라미터들의 맵
- modelMap : 뷰에 전달할 모델 객체의 맵
#### 응답 (ModelAndView)
- 뷰 이름과 모델을 포함하는 ModelAndView 객체

### GET /agile/backlog/get
#### 파라미터 정보
- param : 상세 정보를 가져오는 요청에 필요한 파라미터들의 맵
#### 응답 (Map)
- 상세 정보 맵

### Exception
#### 파라미터 정보
- PSQLException : SQL 예외 상황에서 발생되는 예외 객체
- Exception : 시스템에서 발생되는 기본 예외 객체
#### 응답 (ResponseData)
- 발생된 예외에 대한 정보를 담은 ResponseData 객체
---
## ChartController API 명세서
Java 기반 웹 어플리케이션에서 ChartController는 ChartService를 사용하여 서비스 제공

### GET /agile/chart/getUserBackStory
입력된 사용자의 백 스토리를 반환합니다.

#### 파라미터 정보
- param : 사용자 객체 정보를 포함하는 Map<String, Object>

#### 응답 (JSON 형태의 리스트)
- 사용자의 백 스토리 정보가 포함된 List<Map<String, Object>>

### GET /agile/chart/burndown
Task의 burndown 차트를 반환합니다.

#### 파라미터 정보
- param : Task 관련 정보를 포함하는 Map<String, Object>

#### 응답 (JSON 형태의 리스트)
- Task의 burndown 차트에 대한 정보가 포함된 List<Map<String, Object>>
---
## WipController API 명세서
### GET /agile/wip/getList
#### 파라미터 정보
- param : 쿼리에 필요한 매개 변수로, Map<String, Object> 유형의 데이터가 필요합니다.
#### 응답 (List<Map<String, Object>>)
- 쿼리된 데이터의 결과를 Map<String, Object> 형태의 리스트로 반환합니다.

### GET /agile/wip/get
#### 파라미터 정보
- param : 쿼리에 필요한 매개 변수로, Map<String, Object> 유형의 데이터가 필요합니다.
#### 응답 (List<Map<String, Object>>)
- 쿼리된 데이터의 결과를 Map<String, Object> 형태의 리스트로 반환합니다.

### ExceptionHandler /PSQLException
#### 응답 (ResponseData<String>)
- 데이터베이스 에러 상황을 처리하며, 에러 메시지는 "SQL ERROR" 입니다.

### ExceptionHandler /Exception
#### 응답 (ResponseData<String>)
- 일반적인 시스템 오류 상황을 처리하며, 에러 메시지는 "system error" 입니다.
---
## BackLogDashBoardController API 명세서
### GET /agile/backlogdashboard/getTestList
#### 파라미터 정보
- param : 조회할 테스트 리스트 정보

#### 응답 (JSON)
- 테스트 리스트 정보 반환

### GET /agile/backlogdashboard/getList
#### 파라미터 정보
- param : 조회할 리스트 정보

#### 응답 (JSON)
- 리스트 정보 반환

### GET /agile/backlogdashboard/agBackLogInit
#### 파라미터 정보
- param : 백로그 초기화 정보 

#### 응답 (JSON)
- 백로그 초기화 정보 반환

### GET /agile/backlogdashboard/agBackScJira
#### 파라미터 정보
- param : Jira에 등록된 백로그 항목 정보

#### 응답 (JSON)
- Jira에 등록된 백로그 항목 정보 반환

### GET /agile/backlogdashboard/agBackScTy
#### 파라미터 정보
- param : Ty에 등록된 백로그 항목 정보

#### 응답 (JSON)
- Ty에 등록된 백로그 항목 정보 반환

### GET /agile/backlogdashboard/geAgtList
#### 파라미터 정보
- param : 조회할 Agt 리스트 정보

#### 응답 (JSON)
- Agt 리스트 정보 반환

### GET /agile/backlogdashboard/sprintList
#### 파라미터 정보
- param : 스프린트 리스트 정보

#### 응답 (JSON)
- 스프린트 리스트 정보 반환

### GET /agile/backlogdashboard/releaseList
#### 파라미터 정보
- param : 릴리즈 리스트 정보

#### 응답 (JSON)
- 릴리즈 리스트 정보 반환

### GET /agile/backlogdashboard/assignee_nameList
#### 파라미터 정보
- param : 할당된 개발자의 리스트 정보

#### 응답 (JSON)
- 할당된 개발자의 리스트 정보 반환

### GET /agile/backlogdashboard/agBackLogList
#### 파라미터 정보
- param : 백로그 리스트 정보
- modelMap : 모델 데이터 정보

#### 응답 (HTML)
- 기본적인 UI를 제공하기 위한 HTML 반환

### GET /agile/backlogdashboard/get
#### 파라미터 정보
- param : 조회할 정보

#### 응답 (JSON)
- 조회된 정보 반환

### Exception Handling /dbError
- 발생한 예외 : PSQLException 

#### 응답 (JSON)
- SQL ERROR 메시지 반환

### Exception Handling /defaultException
- 발생한 예외 : Exception 

#### 응답 (JSON)
- 시스템 에러 메시지 반환
---
## VelocityController API 명세서
### GET /agile/velocity/getList 
#### 파라미터 정보
- param : 요청에 필요한 파라미터를 key-value 형태로 가지고 있는 Map 객체입니다.

#### 응답 (JSON)
- Map<String, Object> 형식으로 반환되며, Map은 key-value 형태로 서비스의 실행 결과를 포함하고 있습니다.

### Post SQL 예외 처리 API
#### 응답 (JSON)
- ResponseData 형식으로 반환되며, "error" 타입의 "SQL ERROR" 메시지를 포함합니다.

### Post 기본 예외 처리 API
#### 응답 (JSON)
- ResponseData 형식으로 반환되며, "error" 타입의 "system error" 메시지를 포함합니다. 또한, 발생한 예외에 대한 추적을 제공합니다.
---
## Agile Sprint API 명세서
### GET /agile/sprint/getList
#### 파라미터 정보
- param: 정보를 가져오기 원하는 스프린트의 맵 형태의 데이터

#### 응답 (JSON)
- 스프린트의 리스트를 map 형식으로 반환


### GET /agile/sprint/get
#### 파라미터 정보
- param: 스프린트 정보를 가져오기 원하는 스프린트의 맵 형태의 데이터

#### 응답 (JSON)
- 선택한 스프린트의 정보를 map 형식으로 반환


### POST /agile/sprint/add
#### 파라미터 정보
- param: 추가하려는 스프린트의 맵 형태의 데이터
- session: 현재 유저의 정보가 담긴 HttpSession 객체

#### 응답 (JSON)
- 추가된 스프린트의 정보를 map 형식으로 반환


### PUT /agile/sprint/update
#### 파라미터 정보
- param: 업데이트하려는 스프린트의 맵 형태의 데이터
- session: 현재 유저의 정보가 담긴 HttpSession 객체

#### 응답 (JSON)
- 업데이트된 스프린트의 정보를 map 형식으로 반환


### DELETE /agile/sprint/remove
#### 파라미터 정보
- param: 삭제하려는 스프린트의 맵 형태의 데이터

#### 응답 (JSON)
- 삭제된 스프린트의 정보를 map 형식으로 반환

### 예외 처리
- SQL에러나 시스템 에러가 발생한 경우, 에러 메시지를 반환
---
## ProjectDashboardController API 명세서
### GET /agile/projectdashboard/getProjectInfo
#### 파라미터 정보
- param : 프로젝트 정보에 대한 모든 파라미터

#### 응답 (Response)
- 프로젝트 관련 정보

### GET /agile/projectdashboard/getInfo
#### 파라미터 정보
- param : 글로벌 정보 요청에 대한 모든 파라미터

#### 응답 (Response)
- 글로벌 관련 정보

### ExceptionHandler /agile/projectdashboard/dbError
#### 파라미터 정보
- Exception e: PostgreSQL 데이터베이스 오류에 대한 예외

#### 응답 (Response)
- 오류 유형: "error"
- 오류 메시지: "SQL ERROR"

### ExceptionHandler /agile/projectdashboard/defaultException
#### 파라미터 정보
- Exception e: 시스템 일반 오류에 대한 예외

#### 응답 (Response)
- 오류 유형: "error"
- 오류 메시지: "system error"
---
## Agile 명세서
### GET /agile/aglist/getSprintList
#### 파라미터 정보
- param : Map 형태의 파라미터로 요구되며, 사용자가 원하는 정보를 값으로 가짐
#### 응답 (JSON)
- 스프린트 목록을 JSON 형태로 반환해줌

### GET /agile/aglist/getDetailList
#### 파라미터 정보
- param : Map 형태의 파라미터로 요구되며, 사용자가 원하는 정보를 값으로 가짐
#### 응답 (JSON)
- 세부 목록을 JSON 형태로 반환해줌

### GET /agile/aglist/getList
#### 파라미터 정보
- param : Map 형태의 파라미터로 요구되며, 사용자가 원하는 정보를 값으로 가짐
#### 응답 (JSON)
- 사용자가 원한 정보의 목록을 JSON 형태로 반환해줌

### GET /agile/aglist/get
#### 파라미터 정보
- param : Map 형태의 파라미터로 요구되며, 사용자가 원하는 정보를 값으로 가짐
#### 응답 (JSON)
- 사용자가 원하는 정보를 JSON 형태로 반환해줌

### POST /agile/aglist/register
#### 파라미터 정보
- param : Map 형태의 파라미터로 요구되며, 사용자가 원하는 정보를 값으로 가짐
- session : 현재 세션 정보
#### 응답 (JSON)
- 새로운 정보를 등록하고, 등록 완료 후 그 정보를 JSON 형태로 반환해줌

### POST /agile/aglist/registerList
#### 파라미터 정보
- param : List<Map> 형태의 파라미터로 요구되며, 사용자가 입력한 정보를 값으로 가짐
- session : 현재 세션 정보
#### 응답 
- 사용자가 입력한 정보를 등록함

### POST /agile/aglist/registerDetailList
#### 파라미터 정보
- param : List<Map> 형태의 파라미터로 요구되며, 사용자가 입력한 정보를 값으로 가짐
- session : 현재 세션 정보
#### 응답 
- 사용자가 입력한 세부 정보를 등록함

### EXCEPTION /agile/aglist
#### 응답 (JSON)
- SQL ERROR 혹은 system error 발생 시 해당 메시지를 JSON 형태로 반환해줌

---
## WorkValueController API 명세서
### GET /agile/workvalue/getDailyList
#### 파라미터 정보
- param : 필요한 정보를 작성하여 가져올 데이터를 정의합니다.
#### 응답 (JSON)
- 일별로 정렬된 데이터 리스트를 반환합니다.

### GET /agile/workvalue/getWeeklyList
#### 파라미터 정보
- param : 필요한 정보를 작성하여 가져올 데이터를 정의합니다.
#### 응답 (JSON)
- 주별로 정렬된 데이터 리스트를 반환합니다.

### GET /agile/workvalue/getMonthlyList
#### 파라미터 정보
- param : 필요한 정보를 작성하여 가져올 데이터를 정의합니다.
#### 응답 (JSON)
- 월별로 정렬된 데이터 리스트를 반환합니다.

### POST /agile/workvalue/register
#### 파라미터 정보
- param : 등록될 정보를 작성하여 데이터를 정의합니다.
- session : 로그인된 사용자의 세션 정보를 참조합니다.
#### 응답 (JSON)
- 등록된 데이터는 반환하지 않습니다.

### ERROR /agile/workvalue
#### 파라미터 정보
- e : 발생한 예외에 대한 내용입니다.
#### 응답 (JSON)
- SQL ERROR : SQL 실행 중 문제가 발생했을 때 응답됩니다.
- system error : 시스템적 에러 발생 시 응답됩니다.

---
## Agile 프로젝트 설정 API 명세서

### [GET] /agile/projectconfig/getList
#### 파라미터 정보
- param : 비즈니스 로직 처리를 위한 입력 파라미터 (Map 자료형)
#### 응답 (List<Map<String, Object>>)
- 비즈니스 로직 처리 결과로 나온 Map 자료형을 원소로 가지는 List 응답

### [GET] /agile/projectconfig/getSearchList
#### 파라미터 정보
- param : 검색 로직 처리를 위한 입력 파라미터 (Map 자료형)
#### 응답 (List<Map<String, Object>>)
- 검색 로직 처리 결과로 나온 Map 자료형을 원소로 가지는 List 응답

### [POST] /agile/projectconfig/register
#### 파라미터 정보
- param : 등록을 위한 입력 파라미터 (List<Map<String, Object>> 자료형)
- session : 현재 로그인한 사용자의 세션 정보
#### 응답 (void)
- 성공적으로 등록 처리를 수행한 후에는 별도의 응답 데이터 없음

### [Exception Handler - PSQLException] 
- SQL에서 발생한 예외 상황 처리
#### 응답 (ResponseData<String>)
- 메시지 형태 ("SQL ERROR")로 SQL에서 발생한 오류에 대한 응답

### [Exception Handler - Exception] 
- 시스템에서 발생한 예외 상황 처리
#### 응답 (ResponseData<String>)
- 메시지 형태 ("system error")로 시스템에서 발생한 오류에 대한 응답
---
## ReportController API 명세서
### GET /agile/report/getStepSummaryByUser
#### 파라미터 정보
- param : 사용자가 요청을 보낼 때 같이 보내는 정보를 말합니다. 
- session : 현재 세션 정보에 대해 접근하는데 사용하는 파라미터로, 세션에 저장된 유저 정보를 얻어오는데 사용됩니다.
#### 응답 (JSON)
- UserInfo : 현재 세션의 사용자 정보 객체로, 프로젝트 UID를 포함합니다.
- List<Map<String, Object>> : 회신받는 데이터는 Map의 리스트로 구성되어 있으며, Step 및 사용자에 대한 요약 정보를 포함합니다.
---
## UserController API 명세서

### POST /agile/user/getProjectMemberList
#### 파라미터 정보
- param (Map<String, Object> 형태의 파라미터) : 프로젝트 정보가 담긴 객체로, 확인 후 세션에서 더 필요한 정보 ("project_uid"와 "locale")를 추가함.

#### 응답 (ResponseBody)
- 프로젝트 멤버들의 리스트가 담겨있는 JSON 객체를 반환. 서비스에서 발생하는 에러는 ExceptionHandler를 통해 처리하고, 에러 메시지를 함께 반환.

### POST /agile/user/dbError (PSQLException.class)
#### 파라미터 정보
- e (Exception 객체) : PostgreSQL에서 발생한 에러 정보가 담긴 객체.

#### 응답 (ResponseBody)
- 에러 유형과 메시지 ("SQL ERROR")를 담은 ResponseData<String> 객체를 반환.

### POST /agile/user/defaultException (Exception.class)
#### 파라미터 정보
- e (Exception 객체) : 일반적인 에러 정보가 담긴 객체.

#### 응답 (ResponseBody)
- 에러 유형과 메시지 ("system error")를 담은 ResponseData<String> 객체를 반환.
---
## IFServiceConfigController API 명세서
### GET /cmnsvc/ifserviceconfig/get
#### 파라미터 정보
- param : 서비스에 필요한 파라미터들이 담긴 맵
#### 응답 (JSON)
- 서비스 결과를 담은 맵

### GET /cmnsvc/ifserviceconfig/getList
#### 파라미터 정보
- param : 서비스에 필요한 파라미터들이 담긴 맵
#### 응답 (JSON)
- 서비스 결과를 담은 리스트

### GET /cmnsvc/ifserviceconfig/getSearchList
#### 파라미터 정보
- param : 검색에 필요한 파라미터들이 담긴 맵
#### 응답 (JSON)
- 검색 결과를 담은 리스트

### POST /cmnsvc/ifserviceconfig/register
#### 파라미터 정보
- params : 등록에 필요한 파라미터들이 담긴 리스트
- session : 세션 정보
#### 응답 (void) 
- 등록작업 후 특별히 응답하지 않음
---
## PMS Bizcomponent API 명세서
### GET cmnsvc/ifservice/getList
#### 파라미터 정보
- param : 查询的参数
#### 응답 (JSON)
- 返回IFServiceVo列表

### POST cmnsvc/ifservice/update
#### 파라미터 정보
- param : 更新参数
- session : 当前会话信息
#### 응답 (JSON)
- 返回更新的记录数

### DELETE cmnsvc/ifservice/delete
#### 파라미터 정보
- param : 删除的参数
- session : 当前会话信息
#### 응답 (JSON)
- 返回删除的记录数
---
## ProjectController API 명세서
### GET cmnsvc/project/getList
#### 파라미터 정보
- param : Map 형태의 파라미터. 키와 값으로 구성되어 있음.
#### 응답 (ResponseData)
- ResponseData : 요청한 파라미터에 따른 데이터를 반환. 데이터의 개수(Cnt)와 실제 데이터(Data)를 포함하고 있음.
---
## BCDesignProgramProgress API 명세서

### POST /project/BCDesignProgramProgress/pmDevProgressListInq
#### 파라미터 정보
- requestData : 필요한 데이터를 담는 객체
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmDevProgressListInq 메소드의 수행 결과 반환

### POST /project/BCDesignProgramProgress/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 필요한 데이터를 담는 객체
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmDevProgressColListInq 메소드의 수행 결과 반환

### POST /project/BCDesignProgramProgress/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 필요한 데이터를 담는 객체
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmDevProgressWorkNameListInq 메소드의 수행 결과 반환

---
## BCTaskPlanUp API 명세서
### POST project/BCTaskPlanUp/pmTaskPlanGridInq
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmExcelDownload
#### 파라미터 정보
- requestData : 다운로드 하고 싶은 엑셀 파일에 대한 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (DownloadView)
- excel 파일 다운로드

### POST project/BCTaskPlanUp/pmMppProjectInq
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmMppPLAuthInq
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmMppPLAuthUpd
#### 파라미터 정보
- requestData : 업데이트 하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmTaskDirectAdd
#### 파라미터 정보
- requestData : 추가하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmSubProjectInq
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmTaskPlanInq
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmMppUserInq
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmMppUpload
#### 파라미터 정보
- requestData : 업로드 하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmTaskPlanUpd
#### 파라미터 정보
- requestData : 업데이트 하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmMppTaskInq
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmMppXLSAddin
#### 파라미터 정보
- requestData : 추가하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmExcelUpload
#### 파라미터 정보
- requestData : 업로드 하고 싶은 엑셀 파일에 대한 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.

### POST project/BCTaskPlanUp/pmGetUserId
#### 파라미터 정보
- requestData : 조회하고 싶은 데이타 정보들
- onlineCtx : 온라인 문맥 데이타
#### 응답 (JSON)
- 같은 온라인 문맥에서 업무 처리 결과를 반환합니다.
---
## BCRealBudgetStatCalcuController API 명세서
### POST /project/BCRealBudgetStatCalcu/pmRealBudgetStatCalcu
#### 파라미터 정보
- requestData : 클라이언트로부터 받은 데이터를 포함하고 있는 IDataSet 타입의 변수
- onlineCtx : 현재 온라인 상황 정보를 포함하고 있는 IOnlineContext 타입의 변수
#### 응답 (JSON)
- service.pmRealBudgetStatCalcu(requestData, onlineCtx) : 서비스 모듈을 통해 계산된 실제 예산 통계 정보를 반환합니다.
---
## BCProjectBasisFeeInfo API 명세서
### POST /project/BCProjectBasisFeeInfo/pmBasisFeeInfoExcelUpload
#### 파라미터 정보
- IDataSet requestData : 엑셀 데이터 정보가 담긴 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 프로젝트 기본비 정보 엑셀 업로드 결과

### POST /project/BCProjectBasisFeeInfo/pmBasisFeeInfoUpt
#### 파라미터 정보
- IDataSet requestData : 변경할 데이터 정보가 담긴 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 프로젝트 기본비 정보 업데이트 결과

### POST /project/BCProjectBasisFeeInfo/pmBasisFeeInfoDel
#### 파라미터 정보
- IDataSet requestData : 삭제할 데이터 정보가 담긴 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 프로젝트 기본비 정보 삭제 결과

### POST /project/BCProjectBasisFeeInfo/pmBasisFeeInfoListInq
#### 파라미터 정보
- IDataSet requestData : 조회할 데이터 정보가 담긴 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 프로젝트 기본비 정보 리스트 조회 결과

### POST /project/BCProjectBasisFeeInfo/pmBasisFeeInfoExcelDownload
#### 파라미터 정보
- IDataSet requestData : 다운로드할 엑셀 파일 정보가 담긴 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (DownloadView)
- 프로젝트 기본비 정보 엑셀 다운로드 결과
---
## BCResultManager API 명세서
### POST /project/BCResultManager/pmResultMilestoneReset
#### 파라미터 정보
- requestData : 호출할 때 필요한 데이터
- onlineCtx : 실행상황에 대한 정보 
#### 응답 (IDataSet)
- 프로젝트 마일스톤을 재설정한 결과

### POST /project/BCResultManager/pmResultPopUpd
#### 파라미터 정보
- requestData : 호출할 때 필요한 데이터
- onlineCtx : 실행상황에 대한 정보 
#### 응답 (IDataSet)
- 프로젝트 결과 정보를 업데이트한 결과

### POST /project/BCResultManager/pmResultPopInq
#### 파라미터 정보
- requestData : 호출할 때 필요한 데이터
- onlineCtx : 실행상황에 대한 정보 
#### 응답 (IDataSet)
- 프로젝트 결과 정보를 조회한 결과

### POST /project/BCResultManager/pmResultListInq
#### 파라미터 정보
- requestData : 호출할 때 필요한 데이터
- onlineCtx : 실행상황에 대한 정보 
#### 응답 (IDataSet)
- 프로젝트 결과 목록을 조회한 결과

### POST /project/BCResultManager/pmResultUpd
#### 파라미터 정보
- requestData : 호출할 때 필요한 데이터
- onlineCtx : 실행상황에 대한 정보 
#### 응답 (IDataSet)
- 프로젝트 결과를 업데이트한 결과
---
## BCProgressRateCalculView API 명세서
### POST /project/BCProgressRateCalculView/pmProgressRateCalculViewList
#### 파라미터 정보
- requestData : 메서드가 요구하는 모든 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (반환값)
- service.pmProgressRateCalculViewList를 호출하고 그 결과를 리턴

### POST /project/BCProgressRateCalculView/pmProgressRateCalculViewListPhase
#### 파라미터 정보
- requestData : 메서드가 요구하는 모든 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (반환값)
- service.pmProgressRateCalculViewListPhase를 호출하고 그 결과를 리턴

### POST /project/BCProgressRateCalculView/pmProgressRateCalculViewCalcPhase
#### 파라미터 정보
- requestData : 메서드가 요구하는 모든 정보를 담은 데이터 셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (반환값)
- service.pmProgressRateCalculViewCalcPhase를 호출하고 그 결과를 리턴
---
## BCDevelopmentProgressController API 명세서
### POST /project/BCDevelopmentProgress/pmDevProgressListInq
#### 파라미터 정보
- requestData : 개발 진행 상황에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 진행 상황에 대한 조회 결과를 반환

---

### POST /project/BCDevelopmentProgress/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 개발 진행 상황 컬럼에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 진행 상황의 컬럼 목록 조회 결과를 반환

---

### POST /project/BCDevelopmentProgress/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 작업명에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 진행 상황의 작업명 목록 조회 결과를 반환

---
## BCDesignProgress API 명세서
### POST /project/BCDesignProgress/pmDevProgressListInq
#### 파라미터 정보
- requestData : 요청하려는 데이터에 대한 정보
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON 형식)
- 개발 진행상황 목록 조회 결과 반환

### POST /project/BCDesignProgress/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 요청하려는 데이터에 대한 정보
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON 형식)
- 개발 진행상황 열 목록 조회 결과 반환

### POST /project/BCDesignProgress/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 요청하려는 데이터에 대한 정보
- onlineCtx : 온라인 상황에 대한 정보
#### 응답 (JSON 형식)
- 개발 진행상황 작업명 목록 조회 결과 반환
---
## BCPlanBudgetStatManager API 명세서 

### POST /project/BCPlanBudgetStatManager/pmPlanBudgetTreeInq
#### 파라미터 정보
- requestData : 요청 정보를 담은 IDataSet 타입의 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 IOnlineContext 타입의 객체
#### 응답 (JSON)
- 서비스의 pmPlanBudgetTreeInq 메서드를 통해 처리된 IDataSet 반환

### POST /project/BCPlanBudgetStatManager/pmPlanBudgetStatListInq
#### 파라미터 정보
- requestData : 요청 정보를 담은 IDataSet 타입의 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 IOnlineContext 타입의 객체
#### 응답 (JSON)
- 서비스의 pmPlanBudgetStatListInq 메서드를 통해 처리된 IDataSet 반환

### POST /project/BCPlanBudgetStatManager/pmPlanBudgetStatYearInq
#### 파라미터 정보
- requestData : 요청 정보를 담은 IDataSet 타입의 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 IOnlineContext 타입의 객체
#### 응답 (JSON)
- 서비스의 pmPlanBudgetStatYearInq 메서드를 통해 처리된 IDataSet 반환

### POST /project/BCPlanBudgetStatManager/pmPlanBudgetIdrtSave
#### 파라미터 정보
- requestData : 요청 정보를 담은 IDataSet 타입의 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 IOnlineContext 타입의 객체
#### 응답 (JSON)
- 서비스의 pmPlanBudgetIdrtSave 메서드를 통해 처리된 IDataSet 반환
---
## BCApprovalProcess API 명세서

### POST /project/BCApprovalProcess/pmSubProjectModifyRestoreUpt
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서브 프로젝트 수정 복구 업데이트 결과

### POST /project/BCApprovalProcess/pmItestListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- ITest 리스트 조회 결과

### POST /project/BCApprovalProcess/pmItestApprovalUpt
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답(JSON)
- ITest 승인 업데이트 결과

### POST /project/BCApprovalProcess/pmItestRestoreUpt
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- ITest 복구 업데이트 결과

### POST /project/BCApprovalProcess/pmSvnApprovalUpt
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- SVN 승인 업데이트 결과

### POST /project/BCApprovalProcess/pmGetSubProjectNo
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답(JSON)
- 서브 프로젝트 번호를 가져온 결과

(이하 동일한 양식으로 작성되며, '파라미터 정보'에서 요청 데이터와 온라인 컨텍스트가 공통으로 사용되며, '응답'에서는 해당 API의 역할에 따라 결과물이 달라집니다. 각 API의 역할은 API 경로에서 함수 이름을 참고하시면 됩니다.)

---
## BCInterfaceDevPerformancemanager API 명세서
Java에서 Spring Framework를 사용하여 구현된 API입니다. 해당 API는 개발 성능과 관련된 API를 제공하며, 세 가지 요청 방식(fetch, list, count)에 대한 명세서입니다.

### POST /project/BCInterfaceDevPerformanceManager/pmSubProjectUserInq
#### 파라미터 정보
- IDataSet requestData : 사용자가 입력한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 서비스에서 서브 프로젝트 사용자 조회 결과를 반환합니다.

### POST /project/BCInterfaceDevPerformanceManager/pmDevelopmentPerformanceListInq
#### 파라미터 정보
- IDataSet requestData : 사용자가 입력한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 서비스에서 개발 성능 목록 조회 결과를 반환합니다.

### POST /project/BCInterfaceDevPerformanceManager/pmDevelopmentPerformanceCountInq
#### 파라미터 정보
- IDataSet requestData : 사용자가 입력한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataset)
- 서비스에서 개발 성능 카운트 조회 결과를 반환합니다.
---
## BCRequestPerformancemanager API 명세서
### POST /project/BCRequestPerformanceManager/pmSubProjectUserInq
#### 파라미터 정보
- requestData : 서브 프로젝트 사용자 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브 프로젝트 사용자 조회 결과 데이터

### POST /project/BCRequestPerformanceManager/pmRequestPerformanceListInq
#### 파라미터 정보
- requestData : 요청 성능 목록 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청 성능 목록 조회 결과 데이터

### POST /project/BCRequestPerformanceManager/pmRequestPerformanceCountInq
#### 파라미터 정보
- requestData : 요청 성능 카운트 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청 성능 카운트 조회 결과 데이터
---
## BCResourceResultManager API 명세서
### POST /project/BCResourceResultManager/pmResourceResultInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 조회 응답

### POST /project/BCResourceResultManager/pmResourceResultListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 리스트 조회 응답

### POST /project/BCResourceResultManager/pmResourceResultAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 추가 응답

### POST /project/BCResourceResultManager/pmResourceResultUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 업데이트 응답

### POST /project/BCResourceResultManager/pmResourceResultDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 삭제 응답

### POST /project/BCResourceResultManager/pmResourceSearchListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 검색 리스트 조회 응답

### POST /project/BCResourceResultManager/pmResourceResultRtTimeCheck
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 실시간 체크 응답

### POST /project/BCResourceResultManager/pmResourceResultHolidayInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 휴일 조회 응답

### POST /project/BCResourceResultManager/pmResourceResultExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 엑셀 업로드 응답

### POST /project/BCResourceResultManager/pmResourceResultExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 파일 다운로드 뷰 반환

### POST /project/BCResourceResultManager/pmResourceResultMultiAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리소스 결과 다중 추가 응답

---
## BCRealBudgetStatManager API 명세서
### POST /project/BCRealBudgetStatManager/pmRealBudgetStatIdrtSave
#### 파라미터 정보
- requestData : 클라이언트가 서버로 보낼 데이터
- onlineCtx : 온라인접속 컨텍스트 정보
#### 응답 (ResponseBody)
- 실행된 서비스의 반환값이 데이터 셋 형태로 반환됨

### POST /project/BCRealBudgetStatManager/pmRealBudgetStatListInq
#### 파라미터 정보
- requestData : 클라이언트가 서버로 보낼 데이터
- onlineCtx : 온라인접속 컨텍스트 정보
#### 응답 (ResponseBody)
- 실행된 서비스의 반환값이 데이터 셋 형태로 반환됨
---
## BCPrdtRatioManager API 명세서
### HTTP POST project/BCPrdtRatioManager/pmProjectInq
#### 파라미터 정보
- requestData : 프로젝트의 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 해당 프로젝트의 정보를 반환한다.

### HTTP POST project/BCPrdtRatioManager/pmExcelDown
#### 파라미터 정보
- requestData : 프로젝트의 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Excel File)
- 요청한 엑셀 파일을 다운로드 시킨다.

### HTTP POST project/BCPrdtRatioManager/pmPrdtCodeInq
#### 파라미터 정보
- requestData : 제품 코드의 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 해당 제품 코드의 정보를 반환한다.

### HTTP POST project/BCPrdtRatioManager/pmExcelUpload
#### 파라미터 정보
- requestData : 업로드할 엑셀 파일의 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 파일 업로드 성공 여부를 반환한다.

### HTTP POST project/BCPrdtRatioManager/pmPrdtRatioManagerInq
#### 파라미터 정보
- requestData : 제품 비율 매니저의 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 제품 비율 관리 정보를 반환한다.

### HTTP POST project/BCPrdtRatioManager/pmPrdtRatioManagerAdd
#### 파라미터 정보
- requestData : 추가될 제품 비율 매니저의 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 제품 비율 매니저 추가 성공 여부를 반환한다.

### HTTP POST project/BCPrdtRatioManager/pmProjectYearInq
#### 파라미터 정보
- requestData : 프로젝트 연도의 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 해당 프로젝트의 연도 정보를 반환한다.
---
## BCProgressBasisManager API 명세서

### POST /project/BCProgressBasisManager/pmProApprovalAdd
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 승인 추가에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmProApprovalGroupAdd
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 승인 그룹 추가에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmProApprovalInq
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 승인 조회에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmProBasisListInq
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 기초 목록 조회에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmProgressBasisRoleYnInq
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 진행기초 역할 여부 조회에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmProBasisAdd
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 기초 추가에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmScpMgtScAdd
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 범위 관리 추가에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmScpMgtScSet
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 범위 설정에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmLinkCode
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 링크 코드에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmProBasisUpdate
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 기초 정보 업데이트에 대한 결과값 반환

### POST /project/BCProgressBasisManager/pmSubmitUpdate
#### 파라미터 정보
- requestData: 요청 데이터세트
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 제출 업데이트에 대한 결과값 반환
---
## BCProgressRateCalcul API 명세서
### POST /project/BCProgressRateCalcul/pmProgressRateCal
#### 파라미터 정보
- requestData : 진척율 계산을 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 진척율 계산 결과에 대한 정보를 반환

### POST /project/BCProgressRateCalcul/pmProgressRateCalAll
#### 파라미터 정보
- requestData : 진척율 전체계산을 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 진척율 전체 계산 결과에 대한 정보를 반환

### POST /project/BCProgressRateCalcul/pmProgressRateListInq
#### 파라미터 정보
- requestData : 진척율 리스트 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 진척율 리스트 조회 결과에 대한 정보를 반환

### POST /project/BCProgressRateCalcul/pmCalc
#### 파라미터 정보
- requestData : 특정 날짜의 진척율 계산을 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 특정 날짜의 진척율 계산 결과에 대한 정보를 반환
---
## BCPlanBudgetStatCalcu API 명세서
### POST /project/BCPlanBudgetStatCalcu/pmPlanBudgetStatCalcu
#### 파라미터 정보
- requestData : 사용자 요청 데이터, 주로 프로젝트 계획 예산 통계 계산 정보가 담겨 있음.
- onlineCtx : 온라인 문맥 정보. 사용자 세션, 네트워크 정보 등이 담겨있음.

#### 응답 (JSON 형식)
- BCPlanBudgetStatCalcu 서비스로부터 반환된 IDataSet(결과 데이터 세트)를 JSON 형태로 반환함. 프로젝트 계획 예산 통계 계산 결과가 반환될 것으로 예상됨.
---
## BCTaskPlanAgile API 명세서
### POST /project/BCTaskPlanAgile/pmTaskPlanGridInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 작업 계획 그리드 조회에 대한 응답

### POST /project/BCTaskPlanAgile/pmExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 엑셀 다운로드에 대한 응답

### POST /project/BCTaskPlanAgile/pmMppProjectInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- Mpp 프로젝트 조회에 대한 응답

### POST /project/BCTaskPlanAgile/pmMppPLAuthInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- Mpp PL 권한 조회에 대한 응답

### POST /project/BCTaskPlanAgile/pmMppPLAuthUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- Mpp PL 권한 업데이트에 대한 응답

### POST /project/BCTaskPlanAgile/pmTaskDirectAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 작업 직접 추가에 대한 응답

### POST /project/BCTaskPlanAgile/pmSubProjectInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 하위 프로젝트 조회에 대한 응답

### POST /project/BCTaskPlanAgile/pmTaskPlanInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 작업 계획 조회에 대한 응답

### POST /project/BCTaskPlanAgile/pmMppUserInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- Mpp 사용자 조회에 대한 응답

### POST /project/BCTaskPlanAgile/pmMppUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- Mpp 업로드에 대한 응답

### POST /project/BCTaskPlanAgile/pmTaskPlanUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 작업 계획 업데이트에 대한 응답

### POST /project/BCTaskPlanAgile/pmMppTaskInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- Mpp 작업 조회에 대한 응답

### POST /project/BCTaskPlanAgile/pmMppXLSAddin
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- Mpp XLS Addin에 대한 응답

### POST /project/BCTaskPlanAgile/pmExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 엑셀 업로드에 대한 응답

### POST /project/BCTaskPlanAgile/pmGetUserId
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 사용자 아이디 조회에 대한 응답

---
## BCProjectList API 명세서
### POST /project/BCProjectList/pmGetNciProjectList
#### 파라미터 정보
- requestData : 클라이언트로부터 받은 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- BCProjectList의 pmGetNciProjectList 함수 실행 결과가 반환됩니다. 이 데이터 셋은 프로젝트 리스트를 포함하고 있습니다.
---
## BCResourcePlanManager API 명세서
### POST project/BCResourcePlanManager/pmResourceInfoInq
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (IDataset)
- 서비스의 요청 처리 인터페이스로, 서비스 로직에서 처리 결과를 나타내는 데이터 셋을 반환합니다.

### POST project/BCResourcePlanManager/pmProjectPeriodInq
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (DownloadView)
- 서비스의 요청 처리 인터페이스로, Excel파일 다운로드를 제공합니다.

### POST project/BCResourcePlanManager/pmTemplateDownload
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (DownloadView)
- 서비스의 요청 처리 인터페이스로, 템플릿 다운로드를 제공하는 인터페이스입니다.

### POST project/BCResourcePlanManager/pmOverTimeMonthListInq
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (IDataset)
- 추가근무 시간의 월별 리스트를 조회하는 요청 처리 인터페이스로, 서비스 로직에서 처리 결과를 나타내는 데이터 셋을 반환합니다.

### POST project/BCResourcePlanManager/pmOverTimeDayListInq
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (IDataset)
- 추가근무 시간의 일별 리스트를 조회하는 요청 처리 인터페이스로, 서비스 로직에서 처리 결과를 나타내는 데이터 셋을 반환합니다.

### POST project/BCResourcePlanManager/pmResourcePlanUpd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (IDataset)
- 리소스 계획의 업데이트를 위한 요청 처리 인터페이스로, 서비스 로직에서 처리 결과를 나타내는 데이터 셋을 반환합니다.

### POST project/BCResourcePlanManager/pmResourcePlanListUpd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (IDataset)
- 다중 리소스 계획의 업데이트를 위한 요청 처리 인터페이스로, 서비스 로직에서 처리 결과를 나타내는 데이터 셋을 반환합니다.

### POST project/BCResourcePlanManager/pmResourcePlanInq
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 컨텍스트
#### 응답 (IDataset)
- 리소스 계획을 조회하는 요청 처리 인터페이스로, 서비스 로직에서 처리 결과를 나타내는 데이터 셋을 반환합니다.

... 과 같이 계속해서 명세를 작성해주시면 됩니다.
---
## BCResourceRetrieveController API 명세서
BCResourceRetrieveController 는 프로젝트의 자원을 검색해오는 컨트롤러입니다.

### POST /project/BCResourceRetrieve/pmProjectPeriodInq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터가 들어 있는 객체입니다.
- onlineCtx : 온라인 컨텍스트 정보가 담겨있는 객체입니다.

#### 응답 (JSON)
- 프로젝트의 기간에 대한 정보를 조회하여 반환합니다.

### POST /project/BCResourceRetrieve/pmResourceRetrieveListInq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터가 들어 있는 객체입니다.
- onlineCtx : 온라인 컨텍스트 정보가 담겨있는 객체입니다.

#### 응답 (JSON)
- 프로젝트 리소스 목록을 반환합니다.

### POST /project/BCResourceRetrieve/pmResourceResultColListInq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터가 들어 있는 객체입니다.
- onlineCtx : 온라인 컨텍스트 정보가 담겨있는 객체입니다.

#### 응답 (JSON)
- 프로젝트의 결과물 콜럼 목록을 반환합니다.

### POST /project/BCResourceRetrieve/pmSubProjectPeriodInq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터가 들어 있는 객체입니다.
- onlineCtx : 온라인 컨텍스트 정보가 담겨있는 객체입니다.

#### 응답 (JSON)
- 하위 프로젝트의 기간 정보를 조회하여 반환합니다.

### POST /project/BCResourceRetrieve/pmProjectHolidayCheck
#### 파라미터 정보
- requestData : 요청에 필요한 데이터가 들어 있는 객체입니다.
- onlineCtx : 온라인 컨텍스트 정보가 담겨있는 객체입니다.

#### 응답 (JSON)
- 프로젝트의 휴일 여부를 확인하여 반환합니다.
---
## PUdevprogressretrieve2wooriController API 명세서
### POST /project/BCDevProgressRetrieve2Woori/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 개발진행상황 컬럼 리스트 조회 결과 반환

### POST /project/BCDevProgressRetrieve2Woori/pmDevProgressListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 개발진행상황 리스트 조회 결과 반환

### POST /project/BCDevProgressRetrieve2Woori/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 개발진행상황에서 작업명 리스트 조회 결과 반환
---
## BCProjectExpoert API 명세서
### POST /project/BCProjectExpoert/pmGetProjectList
#### 파라미터 정보
- requestData : 프로젝트 리스트를 가져오기 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 데이터 셋 반환

### GET /project/BCProjectExpoert/pmExportProject
#### 파라미터 정보
- requestData : 프로젝트 데이터를 내보내기 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (File-Download)
- Excel 파일 다운로드

### POST /project/BCProjectExpoert/pmImportProject
#### 파라미터 정보
- requestData : 프로젝트 데이터를 가져오기 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 데이터 셋 반환
---
## BCDesignDevProgress API 명세서
### POST /project/BCDesignDevProgress/pmDevProgressListInq
#### 파라미터 정보
- requestData : 개발 진행상태 관련 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 진행 상태 리스트 조회 결과

----
### POST /project/BCDesignDevProgress/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 개발 진행상태 관련 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 진행 상태 컬럼 리스트 조회 결과

----
### POST /project/BCDesignDevProgress/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 개발 진행상태 관련 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 진행 상태 작업 이름 리스트 조회 결과
---
## BCProjectService API 명세서

### POST /project/BCProjectService/pmProjectService
#### 파라미터 정보
- requestData : 프로젝트 서비스 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 실행한 서비스의 응답 데이터

### POST /project/BCProjectService/pmUpdateSortForPopup
#### 파라미터 정보
- requestData : 팝업 정렬 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 실행한 서비스의 응답 데이터 

### POST /project/BCProjectService/pmUpdateSortForGrid
#### 파라미터 정보
- requestData : 그리드 정렬 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 실행한 서비스의 응답 데이터 

### POST /project/BCProjectService/pmProjectServiceSimple
#### 파라미터 정보
- requestData : 간단한 프로젝트 서비스 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 실행한 서비스의 응답 데이터 

### POST /project/BCProjectService/pmAutoPageExcelUpload
#### 파라미터 정보
- requestData : 자동 페이지 엑셀 업로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 실행한 서비스의 응답 데이터 

### POST /project/BCProjectService/pmAutoPage
#### 파라미터 정보
- requestData : 자동 페이지 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 실행한 서비스의 응답 데이터 

### POST /project/BCProjectService/pmAutoPageExcelDownload
#### 파라미터 정보
- requestData : 자동 페이지 엑셀 다운로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File Download)
- 요청한 파일을 다운로드 받을 수 있습니다.
---
## BCProjectManagerDetail API 명세서
### POST /project/BCProjectManagerDetail/pmMileStoneInq
#### 파라미터 정보
- requestData : MileStone 조회에 필요한 데이터
- onlineCtx : 사용자가 온라인 상에서 사용하는 컨텍스트
#### 응답 (JSON)
- MileStone 조회 결과 반환

### POST /project/BCProjectManagerDetail/pmCheckListCopy
#### 파라미터 정보
- requestData : 체크리스트 복사에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 체크리스트 복사 결과 반환 

### POST /project/BCProjectManagerDetail/pmExcelDownloadAll
#### 파라미터 정보
- requestData : 엑셀 다운로드에 필요한 데이터
- onlineCtx : 사용자의 온라인 컨텍스트
#### 응답 (FILE)
- 생성된 엑셀 파일 다운로드

### POST /project/BCProjectManagerDetail/pmSimilarProjectIns
#### 파라미터 정보
- requestData : 유사 프로젝트 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 유사 프로젝트 추가 결과 반환

### POST /project/BCProjectManagerDetail/pmCheckLiskDelete
#### 파라미터 정보
- requestData : 체크리스트 삭제에 필요한 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 체크리스트 삭제 결과 반환

### POST /project/BCProjectManagerDetail/pmProjectFpGm
#### 파라미터 정보
- requestData : FP/GM 조회에 필요한 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- FP/GM 조회 결과 반환

### POST /project/BCProjectManagerDetail/pmProjectDel
#### 파라미터 정보
- requestData : 프로젝트 삭제에 필요한 정보
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 삭제 결과 반환

### POST /project/BCProjectManagerDetail/pmProjectUpd
#### 파라미터 정보
- requestData : 프로젝트 업데이트에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 업데이트 결과 반환

### POST /project/BCProjectManagerDetail/pmProjectInq
#### 파라미터 정보
- requestData : 프로젝트 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 조회 결과 반환

### POST /project/BCProjectManagerDetail/pmProjectAdd
#### 파라미터 정보
- requestData : 프로젝트 추가에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 추가 결과 반환

### POST /project/BCProjectManagerDetail/pmProjectMgr
#### 파라미터 정보
- requestData : 프로젝트 관리자 정보 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 관리자 정보 조회 결과 반환

### POST /project/BCProjectManagerDetail/pmProjectListInq
#### 파라미터 정보
- requestData : 프로젝트 리스트 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리스트 조회 결과 반환

### POST /project/BCProjectManagerDetail/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 업로드에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 업로드 결과 반환
---
## BCDesignInterfaceProgress 프로그램 API 명세서
### POST /project/BCDesignInterfaceProgress/pmDevProgressListInq
#### 파라미터 정보
- requestData : 개발 진행상황 목록 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 개발 진행상황 목록 데이터를 반환

### POST /project/BCDesignInterfaceProgress/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 개발 진행상황 열 목록 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 개발 진행상황 열 목록 데이터를 반환

### POST /project/BCDesignInterfaceProgress/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 개발 진행상황 작업명 목록 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 개발 진행상황 작업명 목록 데이터를 반환
---
## BCInterfaceDevProgressController API 명세서
### POST /project/BCInterfaceDevProgress/pmDevProgressListInq
#### 파라미터 정보
- requestData : 요청 데이터를 담은 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 IOnlineContext 객체
#### 응답 (ResponseBody)
- pmDevProgressListInq 메소드 호출 결과 (데이터 세트로 응답)

### POST /project/BCInterfaceDevProgress/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 요청 데이터를 담은 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 IOnlineContext 객체
#### 응답 (ResponseBody)
- pmDevProgressColListInq 메소드 호출 결과 (데이터 세트로 응답)

### POST /project/BCInterfaceDevProgress/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 요청 데이터를 담은 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 IOnlineContext 객체
#### 응답 (ResponseBody)
- pmDevProgressWorkNameListInq 메소드 호출 결과 (데이터 세트로 응답)
---
## BCResourceManager API 명세서
### POST /project/BCResourceManager/pmResourceResultReset
#### 파라미터 정보
- requestData : 결제에 필요한 모든 정보를 포함하고 있는 데이터 세트
- onlineCtx : 아이디, 사용자 롤, 사용자 IP 등의 데이터가 들어있는 온라인 컨텍스트 데이터

#### 응답 (JSON)
- 프로젝트 리소스 결과 리셋에 대한 처리 결과 내용

### POST /project/BCResourceManager/pmResourceResultTaskInq
#### 파라미터 정보
- requestData : 특정 작업 검색에 필요한 모든 정보를 포함하고 있는 데이터 세트
- onlineCtx : 아이디, 사용자 롤, 사용자 IP 등의 데이터가 들어있는 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 프로젝트 리소스 결과 작업 검색 처리에 대한 결과 내용

### POST /project/BCResourceManager/pmResourceResultMultiRegisterAdd
#### 파라미터 정보
- requestData : 다중등록 추가에 필요한 모든 정보를 포함하고 있는 데이터 세트
- onlineCtx : 아이디, 사용자 롤, 사용자 IP 등의 데이터가 들어있는 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 프로젝트 리소스 다중 등록 추가 처리에 대한 결과 내용

### POST /project/BCResourceManager/pmResourceResultMultiRegisterInq
#### 파라미터 정보
- requestData : 다중등록 조회에 필요한 모든 정보를 포함하고 있는 데이터 세트
- onlineCtx : 아이디, 사용자 롤, 사용자 IP 등의 데이터가 들어있는 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 프로젝트 리소스 결과 다중등록 조회 처리에 대한 결과 내용

### POST /project/BCResourceManager/pmResourceResultExcelMultiUpload
#### 파라미터 정보
- requestData : 엑셀 파일을 업로드하기 위한 필요한 모든 정보를 포함하고 있는 데이터 세트
- onlineCtx : 아이디, 사용자 롤, 사용자 IP 등의 데이터가 들어있는 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 프로젝트 리소스 결과 엑셀 다중 업로드 처리에 대한 결과 내용
---
## BCResourceWBSController API 명세서

### POST /project/BCResourceWBS/pmResourceWBSUpd
#### 파라미터 정보
- requestData (IDataSet 타입) : 업데이트에 필요한 데이터를 담고 있는 파라미터.
- onlineCtx (IOnlineContext 타입) : 로그인 정보 등 사용자 정보가 담긴 파라미터.
    
#### 응답 (IDataSet)
- 업데이트된 작업의 정보를 반환합니다.

### POST /project/BCResourceWBS/pmResourceWBSListInq
#### 파라미터 정보
- requestData (IDataSet 타입) : 조회를 위한 데이터를 담고 있는 파라미터.
- onlineCtx (IOnlineContext 타입) : 로그인 정보 등 사용자 정보가 담긴 파라미터.

#### 응답 (IDataSet)
- 요청 데이터에 해당하는 작업의 목록을 반환합니다.

### POST /project/BCResourceWBS/pmRiseRateCodeInq
#### 파라미터 정보
- requestData (IDataSet 타입) : 조회를 위한 데이터를 담고 있는 파라미터.
- onlineCtx (IOnlineContext 타입) : 로그인 정보 등 사용자 정보가 담긴 파라미터.

#### 응답 (IDataSet)
- 증가 비율 코드를 조회해 반환합니다.

### POST /project/BCResourceWBS/pmResourceAdminWBSUpd
#### 파라미터 정보
- requestData (IDataSet 타입) : 업데이트를 위한 데이터를 담고 있는 파라미터.
- onlineCtx (IOnlineContext 타입) : 로그인 정보 등 사용자 정보가 담긴 파라미터.

#### 응답 (IDataSet)
- 관리자 자원 업데이트 결과를 반환합니다.

이외에도 다양한 API 경로와 파라미터 정보, 응답 데이터에 대한 정보가 있어요. 각 API별로 필요한 파라미터와 반환하는 정보가 다르기 때문에, 이 문서를 참고하며 원하는 기능에 맞는 API를 선택해서 사용하면 될 것 같아요.
---
## BCDesignProgramPerformanceManager API 명세서
### POST /project/BCDesignProgramPerformanceManager/pmSubProjectUserInq
#### 파라미터 정보
- requestData : 프로젝트 사용자 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 프로젝트 하위 사용자 정보

### POST /project/BCDesignProgramPerformanceManager/pmDevelopmentPerformanceListInq
#### 파라미터 정보
- requestData : 개발 성능 목록 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 개발 성능 목록 정보

### POST /project/BCDesignProgramPerformanceManager/pmDevelopmentPerformanceCountInq
#### 파라미터 정보
- requestData : 개발 성능 카운트 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 개발 성능 카운트 정보
---
## BCCodeInspectionManager 프로그램 API 명세서
### POST /project/BCCodeInspectionManager/pmCodeDelete
#### 파라미터 정보
- requestData : pmCodeDelete를 진행하는데 필요한 정보가 포함된 IDataSet 객체
- onlineCtx : 현재 온라인 참조값
#### 응답 (Java의 IDataSet 객체)
- pmCodeDelete 요청의 결과 데이터

### POST /project/BCCodeInspectionManager/pmFileAuthorSelectFirst
#### 파라미터 정보
- requestData : pmFileAuthorSelectFirst 진행에 필요한 정보가 포함된 IDataSet 객체
- onlineCtx : 현재 온라인 참조값
#### 응답 (Java의 IDataSet 객체)
- pmFileAuthorSelectFirst 요청의 결과 데이터

### POST /project/BCCodeInspectionManager/pmSelectFileType
#### 파라미터 정보
- requestData : pmSelectFileType을 진행하는데 필요한 정보가 포함된 IDataSet 객체
- onlineCtx : 현재 온라인 참조값
#### 응답 (Java의 IDataSet 객체)
- pmSelectFileType 요청의 결과 데이터

### POST /project/BCCodeInspectionManager/pmCodeInspectionListInq
#### 파라미터 정보
- requestData : pmCodeInspectionListInq을 진행하는데 필요한 정보가 포함된 IDataSet 객체
- onlineCtx : 현재 온라인 참조값
#### 응답 (Java의 IDataSet 객체)
- pmCodeInspectionListInq 요청의 결과 데이터

### POST /project/BCCodeInspectionManager/pmInsertCodeInspection
#### 파라미터 정보
- requestData : pmInsertCodeInspection을 진행하는데 필요한 정보가 포함된 IDataSet 객체
- onlineCtx : 현재 온라인 참조값
#### 응답 (Java의 IDataSet 객체)
- pmInsertCodeInspection 요청의 결과 데이터

### POST /project/BCCodeInspectionManager/pmExcelAllDownload
#### 파라미터 정보
- requestData : pmExcelAllDownload를 진행하는데 필요한 정보가 포함된 IDataSet 객체
- onlineCtx : 현재 온라인 참조값
#### 응답 (Java의 DownloadView 객체)
- 요청된 파일을 다운로드하기 위한 정보는 Excel 파일의 경로 경로와 파일 이름이 포함된 객체를 반환

### POST /project/BCCodeInspectionManager/pmCodeInspectionExcelupload
#### 파라미터 정보
- requestData : pmCodeInspectionExcelupload를 진행하는데 필요한 정보가 포함된 IDataSet 객체
- onlineCtx : 현재 온라인 참조값
#### 응답 (Java의 IDataSet 객체)
- pmCodeInspectionExcelupload 요청의 결과 데이터
---
## BCDesignDevPerformanceManager API 명세서

### POST /project/BCDesignDevPerformanceManager/pmSubProjectUserInq
#### 파라미터 정보
- requestBody (IDataSet) : 서브 프로젝트 정보를 담은 데이터셋
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트 사용자 조회에 대한 결과 데이터셋을 반환

### POST /project/BCDesignDevPerformanceManager/pmDevelopmentPerformanceListInq
#### 파라미터 정보
- requestBody (IDataSet) : 개발 성과에 대한 정보를 담은 데이터셋
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 성과 리스트 조회에 대한 결과 데이터셋을 반환

### POST /project/BCDesignDevPerformanceManager/pmDevelopmentPerformanceCountInq
#### 파라미터 정보
- requestBody (IDataSet) : 개발 성과에 대한 정보를 담은 데이터셋
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 성과 수량 조회에 대한 결과 데이터셋을 반환
---
## PUDevProgressRetrieveWooriController API 명세서
### POST /project/BCDevProgressRetrieveWoori/pmDevProgressColListInq
#### 파라미터 정보
- requestData : 필요한 데이터를 담는 IDataSet 객체
- onlineCtx : 현재 사용자의 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 개발 진행 상황에 대한 정보를 조회한 결과를 담은 IDataSet 객체를 반환

### POST /project/BCDevProgressRetrieveWoori/pmDevProgressListInq
#### 파라미터 정보
- requestData : 필요한 데이터를 담는 IDataSet 객체
- onlineCtx : 현재 사용자의 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 개발 진행 리스트 조회에 대한 정보를 담은 IDataSet 객체를 반환

### POST /project/BCDevProgressRetrieveWoori/pmDevProgressWorkNameListInq
#### 파라미터 정보
- requestData : 필요한 데이터를 담는 IDataSet 객체
- onlineCtx : 현재 사용자의 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 개발 작업 이름 리스트에 대한 정보를 담은 IDataSet 객체를 반환
---
## BCDesignInterfacePerformanceManager API 명세서
### POST /project/BCDesignInterfacePerformanceManager/pmSubProjectUserInq
#### 파라미터 정보
- requestData : 서버에 전송될 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PUDesignInterfacePerformanceManager 서비스의 pmSubProjectUserInq 함수 호출 결과

### POST /project/BCDesignInterfacePerformanceManager/pmDevelopmentPerformanceListInq
#### 파라미터 정보
- requestData : 서버에 전송될 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PUDesignInterfacePerformanceManager 서비스의 pmDevelopmentPerformanceListInq 함수 호출 결과

### POST /project/BCDesignInterfacePerformanceManager/pmDevelopmentPerformanceCountInq
#### 파라미터 정보
- requestData : 서버에 전송될 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PUDesignInterfacePerformanceManager 서비스의 pmDevelopmentPerformanceCountInq 함수 호출 결과
---
## BCTaskPlanController API 명세서
### POST /project/BCTaskPlan/pmTaskPlanGridInq
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 작업 계획 그리드 조회 결과

### POST /project/BCTaskPlan/pmExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (DownloadView)
- 엑셀 다운로드 화면

### POST /project/BCTaskPlan/pmMppProjectInq
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Mpp 프로젝트 조회 결과

### POST /project/BCTaskPlan/pmMppPLAuthInq
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Mpp PL 권한 조회 결과

### POST /project/BCTaskPlan/pmMppPLAuthUpd
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Mpp PL 권한 업데이트 결과

### POST /project/BCTaskPlan/pmTaskDirectAdd
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Task 직접 추가 결과

### POST /project/BCTaskPlan/pmSubProjectInq
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 하위 프로젝트 조회 결과

### POST /project/BCTaskPlan/pmTaskPlanInq
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 작업 계획 조회 결과

### POST /project/BCTaskPlan/pmMppUserInq
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Mpp 사용자 조회 결과

### POST /project/BCTaskPlan/pmMppUpload
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Mpp 업로드 결과

### POST /project/BCTaskPlan/pmTaskPlanUpd
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 작업 계획 업데이트 결과

### POST /project/BCTaskPlan/pmMppTaskInq
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Mpp 작업 조회 결과

### POST /project/BCTaskPlan/pmMppXLSAddin
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Mpp XLS 추가 결과

### POST /project/BCTaskPlan/pmExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- Excel 업로드 결과

### POST /project/BCTaskPlan/pmGetUserId
#### 파라미터 정보
- requestData : 요청 데이터 정보
- onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 사용자 아이디 조회 결과

---
## BCWorkCodeManagerController API 명세서
### POST /project/BCWorkCodeManager/pmWorkCodeMangerCodeListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 코드 리스트 조회 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerCodeAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 코드 추가 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 작업 코드 추가 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeManagerInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 작업 코드 관리자 조회 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeManagerCodeInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 작업 코드 코드 조회 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerCodeLUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 코드 업데이트 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 작업 코드 삭제 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 엑셀 업로드 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 작업 코드 리스트 조회 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerLUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 작업 코드 업데이트 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerCodeDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 작업 코드 코드 삭제 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeManagerCodeExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (Download)
- 엑셀 파일 다운로드를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerCodeExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 엑셀 업로드 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeMangerSysExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 시스템 엑셀 다운로드 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmWorkCodeManagerGroupExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (Download)
- 작업 코드 그룹 엑셀 파일의 다운로드를 반환합니다.

### POST /project/BCWorkCodeManager/pmSearchType
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 검색 유형 결과를 반환합니다.

### POST /project/BCWorkCodeManager/pmgridCodeupdate
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 그리드 코드 업데이트 결과를 반환합니다.
---
## BCAgileInfoMapping API 명세서
### POST /project/BCAgileInfoMapping/pmGetSubPrjMappingInfo
#### 파라미터 정보
- requestData : 요청에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 서브 프로젝트 매핑 정보를 가져옵니다.

### POST /project/BCAgileInfoMapping/pmSubPrjojectMapping
#### 파라미터 정보
- requestData : 요청에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 서브 프로젝트 매핑을 수행합니다.

### POST /project/BCAgileInfoMapping/pmAgileSync
#### 파라미터 정보
- requestData : 요청에 필요한 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- Agile 동기화를 수행합니다.

### GET /project/BCAgileInfoMapping/api/setAgileSprintInfo
#### 파라미터 정보
- param : 요청에 필요한 파라미터
#### 응답 (ResponseEntity)
- 에자일 스프린트 정보를 설정합니다.
---
## BCGoalResultInputController API 명세서
### POST /project/BCGoalResultInput/pmGoalResultInputUpd
#### 파라미터 정보
- requestData : 요청 데이터의 정보를 포함하고 있는 IDataSet 객체
- onlineCtx : 요청과 관련된 온라인 컨텍스트 정보를 가진 IOnlineContext 객체
#### 응답 (ResponseBody)
- PUGoalResultInput 서비스의 pmGoalResultInputUpd 메소드의 결과(수정된 데이터)

### POST /project/BCGoalResultInput/pmGoalResultInputListInq
#### 파라미터 정보
- requestData : 요청 데이터의 정보를 포함하고 있는 IDataSet 객체
- onlineCtx : 요청과 관련된 온라인 컨텍스트 정보를 가진 IOnlineContext 객체
#### 응답 (ResponseBody)
- PUGoalResultInput 서비스의 pmGoalResultInputListInq 메소드의 결과(조회된 데이터 리스트)
---
## BCResourceAssignManager API 명세서
### POST /project/BCResourceAssignManager/pmResourceAssignAdd
#### 파라미터 정보
- IDataSet requestData : 프로젝트의 리소스 할당 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 할당된 리소스 정보의 상세 정보를 반환

### POST /project/BCResourceAssignManager/pmProjectSubProjectListInq
#### 파라미터 정보
- IDataSet requestData : 서브 프로젝트 조회 관련 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 조회된 서브 프로젝트 리스트 정보를 반환

### POST /project/BCResourceAssignManager/pmResoucrceResultAdd
#### 파라미터 정보
- IDataSet requestData : 리소스 결과 추가 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 추가된 리소스 결과의 상세 정보를 반환

### POST /project/BCResourceAssignManager/pmResourceAssignExcelUpload
#### 파라미터 정보
- IDataSet requestData : 엑셀 업로드 관련 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 엑셀 업로드 결과 정보를 반환

### POST /project/BCResourceAssignManager/pmResourceAssignAllUpload
#### 파라미터 정보
- IDataSet requestData : 전체 업로드 관련 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 전체 업로드 결과 정보를 반환

### GET /project/BCResourceAssignManager/pmProjectAssignExcelDownload
#### 파라미터 정보
- IDataSet requestData : 엑셀 다운로드 관련 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (DownloadView)
- 엑셀 파일 다운로드 정보를 반환

### POST /project/BCResourceAssignManager/pmResourceAssignInq
#### 파라미터 정보
- IDataSet requestData : 리소스 조회 관련 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 조회된 리소스 정보를 반환

### POST /project/BCResourceAssignManager/pmResourceDel
#### 파라미터 정보
- IDataSet requestData : 리소스 삭제 관련 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 삭제된 리소스 정보를 반환

### POST /project/BCResourceAssignManager/pmResourceListInq
#### 파라미터 정보
- IDataSet requestData : 리소스 리스트 조회 관련 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (IDateSet)
- 조회된 리소스 리스트 정보를 반환
---
## BCDesignPerformanceManager 프로그램 API 명세서

### POST /project/BCDesignPerformanceManager/pmSubProjectUserInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 포스트 API에 대한 응답으로 PUDesignPerformanceManager 서비스의 pmSubProjectUserInq 메소드를 호출하여 받은 데이터 반환

### POST /project/BCDesignPerformanceManager/pmDevelopmentPerformanceListInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 포스트 API에 대한 응답으로 PUDesignPerformanceManager 서비스의 pmDevelopmentPerformanceListInq 메소드를 호출하여 받은 데이터 반환

### POST /project/BCDesignPerformanceManager/pmDevelopmentPerformanceCountInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 포스트 API에 대한 응답으로 PUDesignPerformanceManager 서비스의 pmDevelopmentPerformanceCountInq 메소드를 호출하여 받은 데이터 반환
---
## BCRewardRatioretrieve API 명세서
### Post /project/BCRewardRatioretrieve/pmProjectYearInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 연도 조회 데이터 반환

### Post /project/BCRewardRatioretrieve/pmProjectInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 조회 데이터 반환

### Post /project/BCRewardRatioretrieve/pmExcelDown
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 엑셀 파일 다운로드 

### Post /project/BCRewardRatioretrieve/pmRewardRatioManagerAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 보상비율 관리자 추가 데이터 반환

### Post /project/BCRewardRatioretrieve/pmRewardRatioManagerInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 보상비율 관리자 조회 데이터 반환

### Post /project/BCRewardRatioretrieve/pmRewardCodeInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 보상코드 조회 데이터 반환

### Post /project/BCRewardRatioretrieve/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 파일 업로드 결과 반환
---
## BCDevelopmentPerformancemanager API 명세서
### POST /project/BCDevelopmentPerformanceManager/pmSubProjectUserInq
#### 파라미터 정보
- requestData : 개발 성과 관련 서브 프로젝트 사용자 조회를 위한 데이터
- onlineCtx : 온라인 작업 컨텍스트
#### 응답 (JSON)
- 서브 프로젝트 사용자 정보를 조회 후 반환 

### POST /project/BCDevelopmentPerformanceManager/pmDevelopmentPerformanceListInq
#### 파라미터 정보
- requestData : 개발 성과 목록 조회를 위한 데이터
- onlineCtx : 온라인 작업 컨텍스트
#### 응답 (JSON)
- 개발 성과 목록 조회 후 반환 

### POST /project/BCDevelopmentPerformanceManager/pmDevelopmentPerformanceCountInq
#### 파라미터 정보
- requestData : 개발 성과 횟수 조회를 위한 데이터
- onlineCtx : 온라인 작업 컨텍스트
#### 응답 (JSON)
- 개발 성과 횟수 조회 후 반환
---
## BCResourceNewResultManager API 명세서
### POST /project/BCResourceNewResultManager/pmResourceInfoInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- Resource 정보 조회 결과

### POST /project/BCResourceNewResultManager/pmResourceNewResultInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 조회

### POST /project/BCResourceNewResultManager/pmProjectPeriodInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (DownlaodView)
- 프로젝트 기간 조회 결과를 Excel 파일로 다운로드

### POST /project/BCResourceNewResultManager/pmResourceNewResultListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 리스트 조회

### POST /project/BCResourceNewResultManager/pmResourceNewResultListUpd
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 리스트 업데이트

### POST /project/BCResourceNewResultManager/pmResourceNewResultUpd
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 업데이트

### POST /project/BCResourceNewResultManager/pmTemplateDownload
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (DownlaodView)
- 템플릿 다운로드

### POST /project/BCResourceNewResultManager/pmOverTimeMonthListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 비정규 근무 월 목록 조회

### POST /project/BCResourceNewResultManager/pmOverTimeDayListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 비정규 근무 일 목록 조회

### POST /project/BCResourceNewResultManager/pmResourceNewResultCostDisplayInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 비용 디스플레이 조회

### POST /project/BCResourceNewResultManager/pmResourceNewResultInitPerPeron
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 초기화

### POST /project/BCResourceNewResultManager/pmResourceNewResultListPlanUpd
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 리스트 계획 업데이트

### POST /project/BCResourceNewResultManager/pmResourceNewResultWorkingDayListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 작업일 리스트 조회

### POST /project/BCResourceNewResultManager/pmResourceNewResultListExcelUpload
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- 새로운 Resource 결과 리스트 Excel 업로드 성공 여부

### POST /project/BCResourceNewResultManager/pmResourceAssignSubProjectListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context
#### 응답 (JSON)
- Resource 할당 하위 프로젝트 리스트 조회

### POST /project/BCResourceNewResultManager/pmResourceNewResultTotalColListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context 
#### 응답 (JSON)
- 새로운 Resource 결과 전체 열 리스트 조회

### POST /project/BCResourceNewResultManager/pmResourceNewResultOverColListInq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 사용자의 online context 
#### 응답 (JSON)
- 새로운 Resource 결과 초과 열 리스트 조회
---
## BCMultiBoardFormManager API 명세서
### POST /project/BCMultiBoardFormManager/pmMultiBoardFormFileDown
#### 파라미터 정보
- requestData : 요청하는 데이터셋 정보
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (DownloadView 객체)
- 엑셀 파일을 다운로드하는 뷰를 반환

### POST /project/BCMultiBoardFormManager/pmMultiBoardFormDel
#### 파라미터 정보
- requestData : 요청하는 데이터셋 정보
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet 객체)
- 제거된 데이터셋 정보를 반환

### POST /project/BCMultiBoardFormManager/pmMultiBoardFormInq
#### 파라미터 정보
- requestData : 요청하는 데이터셋 정보
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet 객체)
- 정보를 조회한 데이터셋을 반환
---
## BCProjectManager API 명세서
### POST /project/BCProjectManager/pmProjectNoCheck
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 프로젝트번호 검사 결과

### POST /project/BCProjectManager/pmProjectWeightSum
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 프로젝트 가중치 합계

### POST /project/BCProjectManager/pmProjectExcelUpload
#### 파라미터 정보
- IDataSet requestData : 업로드될 엑셀 파일(요청 데이터 셋)
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 엑셀 업로드 결과

### POST /project/BCProjectManager/pmProjectNameCheck
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋 (프로젝트 이름)
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 프로젝트 이름 검사 결과

### POST /project/BCProjectManager/pmProjectListInq03
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 프로젝트 목록 조회 결과

... (이하 동일한 패턴으로 진행합니다.) 

---
## BCSubProjectManager API 명세서
주로 project 관련 정보 조회 및 업데이트용 API가 정의되어 있으며, 주소는 'project/BCSubProjectManager/'입니다.

### POST /pmDetailCdInq
#### 파라미터 정보
- requestData : Detail 코드 관련 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Detail 코드에 대한 조회 결과 반환

### POST /pmProjectInfoInq
#### 파라미터 정보
- requestData : 프로젝트 정보 관련 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트에 대한 정보 조회 결과 반환

### POST /pmSubProjectDel
#### 파라미터 정보
- requestData : 서브 프로젝트 관련 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브 프로젝트 삭제 결과 반환

### POST /pmSubProjectUpd
#### 파라미터 정보
- requestData : 서브 프로젝트 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브 프로젝트 업데이트 결과 반환

### POST /pmSubProjectAdd
#### 파라미터 정보
- requestData : 서브 프로젝트 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브 프로젝트 추가 결과 반환

### POST /pmSubProjectInq
#### 파라미터 정보
- requestData : 서브 프로젝트 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브 프로젝트 조회 결과 반환

### POST /pmSubProjectWeightSum
#### 파라미터 정보
- requestData : 서브 프로젝트 가중치 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 주어진 서브 프로젝트의 가중치 합계 결과 반환

### POST /pmMethologyUpload
#### 파라미터 정보
- requestData : 메소드 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메소드 업로드 결과 반환

### POST /pmOurMethodolgyInq
#### 파라미터 정보
- requestData : 메소드 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메소드 조회 결과 반환

### POST /pmEtcMethodolgyInq
#### 파라미터 정보
- requestData : 기타 메소드 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 기타 메소드 조회 결과 반환

### POST /pmTailoringInq
#### 파라미터 정보
- requestData : 필요에 의해 변경현황 또는 인터페이스 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 변형 조회 결과 반환

### POST /pmEtcMethodolgyDel
#### 파라미터 정보
- requestData : 기타 메소드 관련 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 기타 메소드 삭제 결과 반환

### POST /pmSubProjectNameCheck
#### 파라미터 정보
- requestData : 서브 프로젝트 이름 관련 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브 프로젝트 이름 검사 결과 반환

### POST /pmMileStoneInq
#### 파라미터 정보
- requestData : 마일스톤 관련 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 마일스톤 조회 결과 반환
---
## BCAlopexIntegratedDashController API 명세서
BCAlopexIntegratedDashController는 4개의 API를 제공합니다. 

### POST dashboard/BCAlopexIntegratedDash/pmGetAlopex
#### 파라미터 정보
- requestData : IDataSet 타입으로 Alopex의 정보를 가져오는 데 필요한 요청 데이터입니다.
- onlineCtx : IOnlineContext 타입으로 온라인 컨텍스트 정보를 지니고 있습니다.

#### 응답 (IDataSet)
- Alopex의 정보를 반환합니다.

### POST dashboard/BCAlopexIntegratedDash/pmSetAlopex
#### 파라미터 정보
- requestData : IDataSet 타입으로 Alopex의 정보를 설정하는 데 필요한 요청 데이터입니다.
- onlineCtx : IOnlineContext 타입으로 온라인 컨텍스트 정보를 지니고 있습니다.

#### 응답 (IDataSet)
- Alopex세팅의 결과를 반환합니다.

### POST dashboard/BCAlopexIntegratedDash/pmDeleteAlopex
#### 파라미터 정보
- requestData : IDataSet 타입으로 Alopex를 삭제하는 데 필요한 요청 데이터입니다.
- onlineCtx : IOnlineContext 타입으로 온라인 컨텍스트 정보를 지니고 있습니다.

#### 응답 (IDataSet)
- Alopex삭제의 결과를 반환합니다.

### POST dashboard/BCAlopexIntegratedDash/pmWidgetInq
#### 파라미터 정보
- requestData : IDataSet 타입으로 Widget의 정보를 조회하는데 필요한 요청 데이터입니다.
- onlineCtx : IOnlineContext 타입으로 온라인 컨텍스트 정보를 지니고 있습니다.

#### 응답(IDataSet)
- Widget의 정보를 반환합니다.
---
## BCIssueDefectStatus API 명세서
### POST /dashboard/BCIssueDefectStatus/pmDashboardGridList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 인터넷 상황 컨텍스트
#### 응답 (IDataSet)
- 결과 개요 : pmDashboardGridList 서비스로부터 반환 된 데이터 집합

### POST /dashboard/BCIssueDefectStatus/pmChargerListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 인터넷 상황 컨텍스트
#### 응답 (IDataSet)
- 결과 개요 : pmChargerListInq 서비스로부터 반환 된 데이터 집합

### POST /dashboard/BCIssueDefectStatus/pmCodeInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 인터넷 상황 컨텍스트
#### 응답 (IDataSet)
- 결과 개요 : pmCodeInq 서비스로부터 반환 된 데이터 집합
---
## BCIssueProgressRetrieve API 명세서

### POST /dashboard/BCIssueProgressRetrive/pmIssueProgressListInq
#### 파라미터 정보
- requestData : 이슈 진행 상황 리스트를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- pmIssueProgressListInq 서비스를 통해 반환되는 이슈 진행 상황 리스트

### POST /dashboard/BCIssueProgressRetrive/pmIssueProgressColListInq
#### 파라미터 정보
- requestData : 이슈 진행 상황의 컬럼 리스트를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답(IDataSet)
- pmIssueProgressColListInq 서비스를 통해 반환되는 이슈 진행 상황의 컬럼 리스트

### POST /dashboard/BCIssueProgressRetrive/pmIssueProgressSummary
#### 파라미터 정보
- requestData : 이슈 진행 상황 요약을 요청하는 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- pmIssueProgressSummary 서비스를 통해 반환되는 이슈 진행 상황 요약 정보
---
## BCAnalysisReportRetrieve API 명세서
### POST /dashboard/BCAnalysisReportRetrieve/pmReportHistoryAdd
#### 파라미터 정보
- requestData : 클라이언트에서 보내는 데이터
- onlineCtx : 온라인 시스템 통신에 관련된 데이터

#### 응답 (JSON)
- 서비스에서 실행된 결과 데이터를 IDataSet 형태로 반환

### POST /dashboard/BCAnalysisReportRetrieve/pmReportHistoryListInq
#### 파라미터 정보
- requestData : 클라이언트에서 보내는 데이터
- onlineCtx : 온라인 시스템 통신에 관련된 데이터

#### 응답 (JSON)
- 서비스에서 실행된 결과 데이터를 IDataSet 형태로 반환

### POST /dashboard/BCAnalysisReportRetrieve/pmAnalysisReportListInq
#### 파라미터 정보
- requestData : 클라이언트에서 보내는 데이터
- onlineCtx : 온라인 시스템 통신에 관련된 데이터

#### 응답 (JSON)
- 서비스에서 실행된 결과 데이터를 IDataSet 형태로 반환

### POST /dashboard/BCAnalysisReportRetrieve/pmYearMmInq
#### 파라미터 정보
- requestData : 클라이언트에서 보내는 데이터
- onlineCtx : 온라인 시스템 통신에 관련된 데이터

#### 응답 (JSON)
- 서비스에서 실행된 결과 데이터를 IDataSet 형태로 반환

### POST /dashboard/BCAnalysisReportRetrieve/pmAccInfoInq
#### 파라미터 정보
- requestData : 클라이언트에서 보내는 데이터
- onlineCtx : 온라인 시스템 통신에 관련된 데이터

#### 응답 (JSON)
- 서비스에서 실행된 결과 데이터를 IDataSet 형태로 반환
---
## BCActionItemProgressRetrive API 명세서
### POST /dashboard/BCActionItemProgressRetrive/pmActionItemProgressColListInq
#### 파라미터 정보
- IDataSet requestData : 데이터 셋 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- ActionItemProgressColListInq에 대한 데이터 셋 응답

### POST /dashboard/BCActionItemProgressRetrive/pmActionItemProgressListInq
#### 파라미터 정보
- IDataSet requestData : 데이터 셋 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- ActionItemProgressListInq의 데이터 셋 응답
---
## BCRetrieveDevProgramDevDaWoori API 명세서
### POST dashboard/BCRetrieveDevProgramDaWoori/pmListAll 

#### 파라미터 정보
- requestData : 요청 데이터를 보관하는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체

#### 응답 (JSON)
- 모든 PM 목록 : PM 리스트 반환에 사용되는 메소드. IDataSet 형태로 응답합니다.
---
## BCRmTraceStatus API 명세서

### POST /dashboard/BCRmTraceStatus/pmChargerInq
#### 파라미터 정보
- requestData : 사용자로부터 입력 받은 정보를 저장하는 객체(IDataSet)
- onlineCtx : 세션과 같은 온라인 상태 정보를 저장하는 객체(IOnlineContext)

#### 응답 (JSON)
- IDataSet 객체를 반환으로 받음(응답개요는 사용하고 있는 IDataSet 인터페이스에 따라 달라짐)

### POST /dashboard/BCRmTraceStatus/pmProgramStatusGrid
#### 파라미터 정보
- requestData : 사용자로부터 입력 받은 정보를 저장하는 객체(IDataSet)
- onlineCtx : 세션과 같은 온라인 상태 정보를 저장하는 객체(IOnlineContext)

#### 응답 (JSON)
- IDataSet 객체를 반환으로 받음(응답개요는 사용하고 있는 IDataSet 인터페이스에 따라 달라짐)

### POST /dashboard/BCRmTraceStatus/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 사용자로부터 입력 받은 정보를 저장하는 객체(IDataSet)
- onlineCtx : 세션과 같은 온라인 상태 정보를 저장하는 객체(IOnlineContext)

#### 응답 (JSON)
- IDataSet 객체를 반환으로 받음(응답개요는 사용하고 있는 IDataSet 인터페이스에 따라 달라짐)

### POST /dashboard/BCRmTraceStatus/pmProgramStatusChart2
#### 파라미터 정보
- requestData : 사용자로부터 입력 받은 정보를 저장하는 객체(IDataSet)
- onlineCtx : 세션과 같은 온라인 상태 정보를 저장하는 객체(IOnlineContext)

#### 응답 (JSON)
- IDataSet 객체를 반환으로 받음(응답개요는 사용하고 있는 IDataSet 인터페이스에 따라 달라짐)

### POST /dashboard/BCRmTraceStatus/pmProdectivityPersonListInq
#### 파라미터 정보
- requestData : 사용자로부터 입력 받은 정보를 저장하는 객체(IDataSet)
- onlineCtx : 세션과 같은 온라인 상태 정보를 저장하는 객체(IOnlineContext)

#### 응답 (JSON)
- IDataSet 객체를 반환으로 받음(응답개요는 사용하고 있는 IDataSet 인터페이스에 따라 달라짐)

### POST /dashboard/BCRmTraceStatus/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- requestData : 사용자로부터 입력 받은 정보를 저장하는 객체(IDataSet)
- onlineCtx : 세션과 같은 온라인 상태 정보를 저장하는 객체(IOnlineContext)

#### 응답 (JSON)
- IDataSet 객체를 반환으로 받음(응답개요는 사용하고 있는 IDataSet 인터페이스에 따라 달라짐)
---
## PUTableDashBoardWooriController API 명세서
### PUT dashboard/BCDesignTableDashBoard/pmChart1
#### 파라미터 정보
- `requestData` : 요청에 필요한 데이터 정보
- `onlineCtx` : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 해당 서비스 로직을 수행한 후의 결과 데이터셋

### PUT dashboard/BCDesignTableDashBoard/pmChart2
#### 파라미터 정보
- `requestData` : 요청에 필요한 데이터 정보
- `onlineCtx` : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 해당 서비스 로직을 수행한 후의 결과 데이터셋

### PUT dashboard/BCDesignTableDashBoard/pmGrid1
#### 파라미터 정보
- `requestData` : 요청에 필요한 데이터 정보
- `onlineCtx` : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 해당 서비스 로직을 수행한 후의 결과 데이터셋

### PUT dashboard/BCDesignTableDashBoard/pmFunctionNameLevel4Inq
#### 파라미터 정보
- `requestData` : 요청에 필요한 데이터 정보
- `onlineCtx` : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 해당 서비스 로직을 수행한 후의 결과 데이터셋

### PUT dashboard/BCDesignTableDashBoard/pmApprovalSettingInq
#### 파라미터 정보
- `requestData` : 요청에 필요한 데이터 정보
- `onlineCtx` : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 해당 서비스 로직을 수행한 후의 결과 데이터셋
---
## BCInstitutionDashBoard API 명세서
### POST /dashboard/BCInstitutionDashBoard/pmEvListInq
#### 파라미터 정보
- IDataSet requestData : 요청에 필요한 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmEvList 조회 결과를 포함하는 IDataSet

### POST /dashboard/BCInstitutionDashBoard/pmResourcePutStatusListInq
#### 파라미터 정보
- IDataSet requestData : 요청에 필요한 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmResourcePutStatusList 조회 결과를 포함하는 IDataSet

### POST /dashboard/BCInstitutionDashBoard/pmStatusListInq
#### 파라미터 정보
- IDataSet requestData : 요청에 필요한 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmStatusList 조회 결과를 포함하는 IDataSet

### POST /dashboard/BCInstitutionDashBoard/pmProgressListInq
#### 파라미터 정보
- IDataSet requestData : 요청에 필요한 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmProgressList 조회 결과를 포함하는 IDataSet

### POST /dashboard/BCInstitutionDashBoard/pmNoticeListInq
#### 파라미터 정보
- IDataSet requestData : 요청에 필요한 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmNoticeList 조회 결과를 포함하는 IDataSet

... 이하 더 많은 API들이 존재 함.
---
## BCDesignProgramDashBoard API 명세서

### POST /dashboard/BCDesignProgramDashBoard/pmGrid1
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmGrid1 결과

### POST /dashboard/BCDesignProgramDashBoard/pmChart2
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmChart2 결과

### POST /dashboard/BCDesignProgramDashBoard/pmChart1
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmChart1 결과

### POST /dashboard/BCDesignProgramDashBoard/pmApprovalSettingInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 승인 설정 조회 결과

### POST /dashboard/BCDesignProgramDashBoard/pmFunctionNameLevel4Inq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 함수 이름 레벨 4 조회 결과
---
## BCInterfaceDevDashBoardController API 명세서
### POST dashboard/BCInterfaceDevDashBoard/pmExecutiveProjectStatusListInq
#### 파라미터 정보
- requestData : 데이터 셋에 대한 요청 정보
- onlineCtx : 온라인 컨텍스트에 대한 정보
#### 응답 (IDataSet)
- 프로젝트 상태 목록에 대한 정보를 반환

### POST dashboard/BCInterfaceDevDashBoard/pmDevGuideInq
#### 파라미터 정보
- requestData : 데이터 셋에 대한 요청 정보
- onlineCtx : 온라인 컨텍스트에 대한 정보
#### 응답 (IDataSet)
- 개발 가이드 인쿼리에 대한 정보를 반환 

......  (이런 식으로 나머지 API에 대해서도 명세를 작성하세요.)

### POST dashboard/BCInterfaceDevDashBoard/pmProgramStatusGridExcelDown
#### 파라미터 정보
- requestData : 데이터 셋에 대한 요청 정보
- onlineCtx : 온라인 컨텍스트에 대한 정보
#### 응답 (IDataSet)
- 프로그램 상태 그리드 엑셀 다운로드에 대한 정보를 반환

### POST dashboard/BCInterfaceDevDashBoard/pmTeamSiteSeqInq
#### 파라미터 정보
- requestData : 데이터 셋에 대한 요청 정보
- onlineCtx : 온라인 컨텍스트에 대한 정보
#### 응답 (IDataSet)
- 팀 사이트 시퀀스 인쿼리에 대한 정보를 반환
---
## BCDesignDashBoard4 API 명세서
### POST dashboard/BCDesignDashBoard4/pmGrid1
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- IDataSet 형태의 데이터 반환

### POST dashboard/BCDesignDashBoard4/pmChart2
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- IDataSet 형태의 데이터 반환

### POST dashboard/BCDesignDashBoard4/pmChart1
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- IDataSet 형태의 데이터 반환

### POST dashboard/BCDesignDashBoard4/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- IDataSet 형태의 데이터 반환

### POST dashboard/BCDesignDashBoard4/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- IDataSet 형태의 데이터 반환
---
## BCDesignDashBoard3 API 명세서
### POST /dashboard/BCDesignDashBoard3/pmGrid1
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- pmGrid1 서비스의 응답 결과를 담고 있는 IDataSet 객체가 반환됩니다.

### POST /dashboard/BCDesignDashBoard3/pmChart2
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- pmChart2 서비스의 응답 결과를 담고 있는 IDataSet 객체가 반환됩니다.

### POST /dashboard/BCDesignDashBoard3/pmChart1
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- pmChart1 서비스의 응답 결과를 담고 있는 IDataSet 객체가 반환됩니다.

### POST /dashboard/BCDesignDashBoard3/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- pmApprovalSettingInq 서비스의 응답 결과를 담고 있는 IDataSet 객체가 반환됩니다.

### POST /dashboard/BCDesignDashBoard3/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestData : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- pmFunctionNameLevel4Inq 서비스의 응답 결과를 담고 있는 IDataSet 객체가 반환됩니다.
---
## BCManHourInputStatusAccum API 명세서
### POST /dashboard/BCManHourInputStatusAccum/pmManHourInputStatusAccumListInq
#### 파라미터 정보
- requestData : 요청 데이터
- IOnlineContext : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청에 따른 pmManHourInputStatusAccumListInq 서비스의 응답 정보를 반환합니다.
---
## BCDesignDashBoard2Controller API 명세서
### POST /dashboard/BCDesignDashBoard2/pmGrid1
#### 파라미터 정보
- requestBody : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 서비스로부터 반환 받은 데이터를 담고 있는 IDataSet 객체

### POST /dashboard/BCDesignDashBoard2/pmChart2
#### 파라미터 정보
- requestBody : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 서비스로부터 반환 받은 데이터를 담고 있는 IDataSet 객체

### POST /dashboard/BCDesignDashBoard2/pmChart1
#### 파라미터 정보
- requestBody : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 서비스로부터 반환 받은 데이터를 담고 있는 IDataSet 객체

### POST /dashboard/BCDesignDashBoard2/pmApprovalSettingInq
#### 파라미터 정보
- requestBody : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 서비스로부터 반환 받은 데이터를 담고 있는 IDataSet 객체

### POST /dashboard/BCDesignDashBoard2/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestBody : 요청 데이터를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (IDataSet)
- 서비스로부터 반환 받은 데이터를 담고 있는 IDataSet 객체
---
## BCProgramDashBoard API 명세서
### POST /dashboard/BCProgramDashBoard/pmExecutiveProjectStatusListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트의 집행 상태 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmDevGuideInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 가이드 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmScheduleInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스케줄 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmTechSupInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 기술지원 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmEvListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이벤트 목록 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmNoticeInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmNoticeFileListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 파일 목록 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmStatusListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 상태 목록 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmResourcePutStatusListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 리소스 배치 상태 목록 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmProgressListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 진행 중인 목록 관련 정보 반환

### POST /dashboard/BCProgramDashBoard/pmNoticeListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 목록 관련 정보 반환

이 외에도, 각각의 URL (/pmScheduleListInq, /pmSubProjectListInq, /pmMemberStatusListInq 등)에 따라 해당하는 데이터를 반환하는 API가 존재합니다.

각 API의 요청 방식은 POST 방식이며, 응답 형식은 JSON입니다.

파라미터 정보로는 요청에 필요한 정보를 담고 있는 IDataSet requestData와 온라인 컨텍스트 정보를 담고 있는 IOnlineContext onlineCtx를 받습니다.
---
## BCRiskProgressRetrive API 명세서
### POST dashboard/BCRiskProgressRetrive/pmRiskProgressInq
#### 파라미터 정보
- requestData : 클라이언트로부터 받는 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRiskProgressInq 서비스의 수행결과

### POST dashboard/BCRiskProgressRetrive/pmRiskProgressRetrieve
#### 파라미터 정보
- requestData : 클라이언트로부터 받는 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmRiskProgressRetrieve 서비스의 수행결과

---
## BCImportantDashboard API 명세서

### POST /dashboard/bcimportant/BCImportantDashboard/pmImportantDashboardGetUsers
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 유저 정보를 반환

### POST /dashboard/bcimportant/BCImportantDashboard/pmImportantDashboardGetPeriod
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 기간에 대한 정보를 반환

### POST /dashboard/bcimportant/BCImportantDashboard/pmImportantDashboardChart1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 차트1에 대한 정보를 반환 

### POST /dashboard/bcimportant/BCImportantDashboard/pmImportantDashboardChart2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 차트2에 대한 정보를 반환

### POST /dashboard/bcimportant/BCImportantDashboard/pmImportantDashboardGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 그리드에 대한 정보를 반환 

### POST /dashboard/bcimportant/BCImportantDashboard/pmImportantDashboardTrendChart
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 트렌드 차트에 대한 정보를 반환

### POST /dashboard/bcimportant/BCImportantDashboard/pmImportantDashboardTrendGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 트렌드 그리드에 대한 정보를 반환
---
## BCDesignDevProgramDaWooriController API 명세서
### POST dashboard/BCDesignDevProgramDaWoori/pmListAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ISetData)
- 서비스에서 반환하는 모든 PM 리스트

### POST dashboard/BCDesignDevProgramDaWoori/pmModelListAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ISetData)
- 모든 PM 모델 리스트 반환

### POST dashboard/BCDesignDevProgramDaWoori/pmMappingListAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ISetData)
- 모든 PM 맵핑 리스트 반환

---
## BCEvStateRetrieve API 명세서
### POST /dashboard/BCEvStateRetrieve/pmEvStateList
#### 파라미터 정보
- requestData : 사용자가 요청한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- pmEvStateList API를 통해 얻은 결과 데이터
---
## BCManHourInputStatusGrade API 명세서
### POST /dashboard/BCManHourInputStatusGrade/pmManHourInputStatusGradeListInq
#### 파라미터 정보
- IDataSet requestData : 조회를 위한 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터

#### 응답 (JSON)
- pmManHourInputStatusGradeListInq 서비스 결과

### POST /dashboard/BCManHourInputStatusGrade/pmManHourInputStatusGradePivotdown
#### 파라미터 정보
- IDataSet requestData : 다운로드할 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터

#### 응답 (DownloadView)
- DownloadView 객체 (다운로드될 파일 정보 포함)

### POST /dashboard/BCManHourInputStatusGrade/pmManHourInputStatusGradeListInqDynamic
#### 파라미터 정보
- IDataSet requestData : 조회를 위한 데이터셋 
- IOnlineContext onlineCtx : 온라인 컨텍스트 데이터

#### 응답 (JSON)
- pmManHourInputStatusGradeListInqDynamic 서비스 결과

---
## BCInspectionPerformRetrieve API 명세서
### POST /dashboard/BCInspectionPerformRetrieve/pmChargerInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스 내 pmChargerInq 메서드의 결과

### POST /dashboard/BCInspectionPerformRetrieve/pmInspectionPerformChart1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스 내 pmInspectionPerformChart1 메서드의 결과

### POST /dashboard/BCInspectionPerformRetrieve/pmInspectionPerformChart2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스 내 pmInspectionPerformChart2 메서드의 결과

### POST /dashboard/BCInspectionPerformRetrieve/pmInspectionPerformGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스 내 pmInspectionPerformGrid 메서드의 결과

### POST /dashboard/BCInspectionPerformRetrieve/pmInspectionLastDtInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스 내 pmInspectionLastDtInq 메서드의 결과

### POST /dashboard/BCInspectionPerformRetrieve/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스 내 pmScopeManagerApprovalSettingInq 메서드의 결과

---
## BCDashBoardController API 명세서
### POST /dashboard/BCDashBoard/pmExecutiveProjectStatusListInq
#### 파라미터 정보
- requestData : 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트의 진행 상태 리스트 조회 결과

### POST /dashboard/BCDashBoard/pmDevGuideInq
#### 파라미터 정보
- requestData : 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 개발 가이드 정보 조회 결과

### POST /dashboard/BCDashBoard/pmScheduleInq
#### 파라미터 정보
- requestData : 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 스케줄 정보 조회 결과

...

### POST /dashboard/BCDashBoard/pmProgramStatusGrid
#### 파라미터 정보
- requestData : 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File)
- 프로그램 상태 그리드 목록 Excel 파일 다운로드

### POST /dashboard/BCDashBoard/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로그램 상태 차트1 조회 결과

...

### POST /dashboard/BCDashBoard/pmScopeData
#### 파라미터 정보
- requestData : 데이터 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트 범위 데이터 조회 결과
---
## BCDesignDashBoard API 명세서

### POST /dashboard/BCDesignDashBoard/pmGrid1
#### 파라미터 정보
- requestData : 클라이언트에서 서버에 전달하는 데이터(IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 타입)
#### 응답 (IDataSet)
- service.pmGrid1의 실행 결과

### POST /dashboard/BCDesignDashBoard/pmChart2
#### 파라미터 정보
- requestData : 클라이언트에서 서버에 전달하는 데이터(IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 타입)
#### 응답 (IDataSet)
- service.pmChart2의 실행 결과

### POST /dashboard/BCDesignDashBoard/pmChart1
#### 파라미터 정보
- requestData : 클라이언트에서 서버에 전달하는 데이터(IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 타입)
#### 응답 (IDataSet)
- service.pmChart1의 실행 결과

### POST /dashboard/BCDesignDashBoard/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 클라이언트에서 서버에 전달하는 데이터(IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 타입)
#### 응답 (IDataSet)
- service.pmApprovalSettingInq의 실행 결과

### POST /dashboard/BCDesignDashBoard/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestData : 클라이언트에서 서버에 전달하는 데이터(IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 타입)
#### 응답 (IDataSet)
- service.pmFunctionNameLevel4Inq의 실행 결과

---
## BCSBNtmPerController API 명세서
### POST /dashboard/BCSBNtmPerController/pmProgramStatusGrid
#### 파라미터 정보
- requestData : 프로그램 상태 정보를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트를 요청하는 데이터
#### 응답 (application/json)
- 프로그램 상태 정보를 반환

### POST /dashboard/BCSBNtmPerController/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 프로그램 상태 차트 1을 요청하는 데이터
- onlineCtx : 온라인 컨텍스트를 요청하는 데이터
#### 응답 (application/json)
- 프로그램 상태 차트 1 정보를 반환

### POST /dashboard/BCSBNtmPerController/pmProgramStatusChart2
#### 파라미터 정보
- requestData : 프로그램 상태 차트 2를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트를 요청하는 데이터
#### 응답 (application/json)
- 프로그램 상태 차트 2 정보를 반환

### POST /dashboard/BCSBNtmPerController/pmProgramStatusGridTestcase
#### 파라미터 정보
- requestData : 프로그램 상태 그리드 테스트 케이스를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트를 요청하는 데이터
#### 응답 (application/json)
- 프로그램 상태 그리드 테스트 케이스 정보를 반환

### POST /dashboard/BCSBNtmPerController/pmProgramStatusChart1Testcase
#### 파라미터 정보
- requestData : 프로그램 상태 차트 1 테스트 케이스를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트를 요청하는 데이터
#### 응답 (application/json)
- 프로그램 상태 차트 1 테스트 케이스 정보를 반환

### POST /dashboard/BCSBNtmPerController/pmProgramStatusChart2Testcase
#### 파라미터 정보
- requestData : 프로그램 상태 차트 2 테스트 케이스를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트를 요청하는 데이터
#### 응답 (application/json)
- 프로그램 상태 차트 2 테스트 케이스 정보를 반환
---
## BCDesignDashBoardWoori 프로그램 API 명세서
### POST /dashboard/BCDesignDashBoardWoori/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 요청데이터
- onlineCtx : 온라인환경정보

#### 응답 (JSON)
- pmApprovalSettingInq 실행 결과


### POST /dashboard/BCDesignDashBoardWoori/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestData : 요청데이터
- onlineCtx : 온라인환경정보

#### 응답 (JSON)
- pmFunctionNameLevel4Inq 실행 결과


### POST /dashboard/BCDesignDashBoardWoori/pmGrid1
#### 파라미터 정보
- requestData : 요청데이터
- onlineCtx : 온라인환경정보

#### 응답 (JSON)
- pmGrid1 실행 결과


### POST /dashboard/BCDesignDashBoardWoori/pmChart2
#### 파라미터 정보
- requestData : 요청데이터
- onlineCtx : 온라인환경정보

#### 응답 (JSON)
- pmChart2 실행 결과


### POST /dashboard/BCDesignDashBoardWoori/pmChart1
#### 파라미터 정보
- requestData : 요청데이터
- onlineCtx : 온라인환경정보

#### 응답 (JSON)
- pmChart1 실행 결과
---
## BCSBNtmController API 명세서
### POST /dashboard/BCSBNtmController/caseSelectAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- 전체 케이스를 선택하는 API에서의 응답

### POST /dashboard/BCSBNtmController/postSelectAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- 모든 게시물들을 선택하는 API에서의 응답

### POST /dashboard/BCSBNtmController/scenarioSelectAll
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- 모든 시나리오들을 선택하는 API에서의 응답

### POST /dashboard/BCSBNtmController/pmstestcase
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- PMS 테스트케이스 실행 결과

### POST /dashboard/BCSBNtmController/pmsScenario
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- PMS 시나리오 실행 결과

### POST /dashboard/BCSBNtmController/defactstatus
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- 결함 상태 반환

### POST /dashboard/BCSBNtmController/defacttype
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- 결함 유형 반환

### POST /dashboard/BCSBNtmController/Getgubun_code1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- 구분 코드 가져오기 결과

### POST /dashboard/BCSBNtmController/pmdpadashboard
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 콘텍스트

#### 응답 (JSON)
- PMDP 대시보드 데이터 반환

---
## BCDesignDevDashBoard API 명세서

### POST /dashboard/BCDesignDevDashBoard/pmExecutiveProjectStatusListInq
#### 파라미터 정보
- requestData: 요청 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- 프로젝트 진행 상태 리스트 정보를 조회하는 API

### POST /dashboard/BCDesignDevDashBoard/pmDevGuideInq
#### 파라미터 정보
- requestData: 요청 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- 개발 가이드라인 정보를 조회하는 API

### POST /dashboard/BCDesignDevDashBoard/pmScheduleInq
#### 파라미터 정보
- requestData: 요청 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- 일정 정보를 조회하는 API

### POST /dashboard/BCDesignDevDashBoard/pmTechSupInq
#### 파라미터 정보
- requestData: 요청 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- 기술 지원 정보를 조회하는 API

... (이하 생략)

### POST /dashboard/BCDesignDevDashBoard/pmTeamSiteSeqInq
#### 파라미터 정보
- requestData: 요청 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON 형식)
- 팀 사이트의 순서를 조회하는 API
---
## BCManHourInputProgressRetrive API 명세서
### POST /dashboard/BCManHourInputProgressRetrive/pmManHourInputProgressListInq
#### 파라미터 정보
- requestData : 요청 데이터 셋 (IDataSet 형태)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형태)
#### 응답 (JSON)
- 요청한 정보에 맞는 pmManHourInputProgressListInq 항목의 데이셋을 반환

### POST /dashboard/BCManHourInputProgressRetrive/pmProjectDateInq
#### 파라미터 정보
- requestData : 요청 데이터 셋 (IDataSet 형태)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형태)
#### 응답 (JSON)
- 요청한 정보에 맞는 pmProjectDateInq 항목의 데이셋을 반환

### POST /dashboard/BCManHourInputProgressRetrive/pmManHourInputProgressColListInq
#### 파라미터 정보
- requestData : 요청 데이터 셋 (IDataSet 형태)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형태)
#### 응답 (JSON)
- 요청한 정보에 맞는 pmManHourInputProgressColListInq 항목의 데이셋을 반환
---
## BCRequirementsProgressRetrieveController API 명세서
### POST /dashboard/BCRequirementsProgressRetrieve/pmRequirementsProgressListInq
#### 파라미터 정보
- requestData : 요구사항 진행상황 목록의 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 

#### 응답 (IDataSet)
- 요구사항 진행 상태 리스트를 리턴합니다.

### POST /dashboard/BCRequirementsProgressRetrieve/pmRequirementsProgressColListInq
#### 파라미터 정보
- requestData : 요구사항 진행상황 컬럼 목록의 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 요구사항 진행 상태 컬럼 리스트를 리턴합니다.
---
## BCRiskStateRtrieveController API 명세서
### POST /dashboard/BCRiskStateRetrieve/pmRiskStateList
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 사용자의 상황 정보
#### 응답 (IDataSet)
- 위험 상태 리스트를 반환한다.

### POST /dashboard/BCRiskStateRetrieve/pmRiskStateChart
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 사용자의 상황 정보
#### 응답 (IDataSet)
- 위험 상태 차트를 반환한다.

### POST /dashboard/BCRiskStateRetrieve/pmRiskStateSummary
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 사용자의 상황 정보
#### 응답 (IDataSet)
- 위험 상태 요약을 반환한다.
---
## BCDesignInterfaceDashBoardWoori API 명세서

### POST /dashboard/BCDesignInterfaceDashBoardWoori/pmApprovalSettingInq
#### 파라미터 정보
- IDataSet requestData : 처리할 데이터를 담고 있는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보를 저장하는 객체

#### 응답 (IDataSet)
- API를 통해 수신된 요청을 처리한 결과 데이터를 반환합니다.

### POST /dashboard/BCDesignInterfaceDashBoardWoori/pmFunctionNameLevel4Inq
#### 파라미터 정보
- IDataSet requestData : 처리할 데이터를 담고 있는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보를 저장하는 객체

#### 응답 (IDataSet)
- API를 통해 수신된 요청을 처리한 결과 데이터를 반환합니다.

### POST /dashboard/BCDesignInterfaceDashBoardWoori/pmGrid1
#### 파라미터 정보
- IDataSet requestData : 처리할 데이터를 담고 있는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보를 저장하는 객체

#### 응답 (IDataSet)
- API를 통해 수신된 요청을 처리한 결과 데이터를 반환합니다.

### POST /dashboard/BCDesignInterfaceDashBoardWoori/pmChart2
#### 파라미터 정보
- IDataSet requestData : 처리할 데이터를 담고 있는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보를 저장하는 객체

#### 응답 (IDataSet)
- API를 통해 수신된 요청을 처리한 결과 데이터를 반환합니다.

### POST /dashboard/BCDesignInterfaceDashBoardWoori/pmChart1
#### 파라미터 정보
- IDataSet requestData : 처리할 데이터를 담고 있는 객체
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보를 저장하는 객체

#### 응답 (IDataSet)
- API를 통해 수신된 요청을 처리한 결과 데이터를 반환합니다.
---
## PUCorrectiveDashBoardWooriController API 명세서
### POST dashboard/BCCorrectiveActionDashBoardWoori/pmEvListInq
#### 파라미터 정보
- requestData : 클라이언트에서 서버로 보내는 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- PM 이벤트 리스트 정보를 조회한 결과

---

### POST dashboard/BCCorrectiveActionDashBoardWoori/pmResourcePutStatusListInq
#### 파라미터 정보
- requestData : 클라이언트에서 서버로 보내는 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- PM 리소스 배치 상태 리스트를 조회한 결과

---

### POST dashboard/BCCorrectiveActionDashBoardWoori/pmStatusListInq
#### 파라미터 정보
- requestData : 클라이언트에서 서버로 보내는 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- PM 상태 리스트 조회 결과

--- 

### POST dashboard/BCCorrectiveActionDashBoardWoori/pmProgressListInq
#### 파라미터 정보
- requestData : 클라이언트에서 서버로 보내는 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- PM 진행 상황 리스트 조회 결과

---

... 이하 생략 ...
---
## PUTestProgramDashBoardWoori API 명세서
### POST /dashboard/bcntmtestdashboardwoori/pmLIst
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

### POST /dashboard/bcntmtestdashboardwoori/pmntmInsertData
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

### POST /dashboard/bcntmtestdashboardwoori/pmGetCoverage
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

### POST /dashboard/bcntmtestdashboardwoori/pmflawManager
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

### POST /dashboard/bcntmtestdashboardwoori/pmlastlist
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

### POST /dashboard/bcntmtestdashboardwoori/pmlastexcel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (파일 다운로드)
- DownloadView : 응답 데이터(파일)

### POST /dashboard/bcntmtestdashboardwoori/IntegTestProg
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

### POST /dashboard/bcntmtestdashboardwoori/IntegTestOuter
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

### POST /dashboard/bcntmtestdashboardwoori/IntegTestThird
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IDataSet : 응답 데이터

---
## BCRmDashBoardWB API 명세서

### POST /dashboard/BCRmDashBoardWB/pmChart2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmChart2 서비스에 대한 응답을 반환합니다.

---

### POST /dashboard/BCRmDashBoardWB/pmChart1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmChart1 서비스에 대한 응답을 반환합니다.

---

### POST /dashboard/BCRmDashBoardWB/pmGrid1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmGrid1 서비스에 대한 응답을 반환합니다.

---

### POST /dashboard/BCRmDashBoardWB/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmFunctionNameLevel4Inq 서비스에 대한 응답을 반환합니다.

---

### POST /dashboard/BCRmDashBoardWB/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmApprovalSettingInq 서비스에 대한 응답을 반환합니다.
---
## BCLinkedProject API 명세서
### POST /dashboard/BCLinkedProject/pmGetProjectList
#### 파라미터 정보
- requestData : 프로젝트 리스트를 가져오기 위한 요청 데이터. IDataSet 타입입니다.
- onlineCtx : 온라인 컨텍스트 정보. IOnlineContext 타입입니다.
#### 응답 (IDataSet)
- 프로젝트 리스트 정보를 IDataSet 타입으로 반환합니다.

### POST /dashboard/BCLinkedProject/pmUpdateProjectList
#### 파라미터 정보
- requestData : 프로젝트 리스트를 업데이트하기 위한 요청 데이터. IDataSet 타입입니다.
- onlineCtx : 온라인 컨텍스트 정보. IOnlineContext 타입입니다.
#### 응답 (IDataSet)
- 업데이트된 프로젝트 리스트 정보를 IDataSet 타입으로 반환합니다.
---
## BCAnalysisStatusRetrieveController API 명세서
### POST /dashboard/BCAnalysisStatusRetrieve/pmAnalysisMonthInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 사용자의 온라인 콘텍스트 정보
#### 응답 (IDataSet형)
- 대상 월별 분석 결과를 반환

### POST /dashboard/BCAnalysisStatusRetrieve/pmAnalysisTotalInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 사용자의 온라인 콘텍스트 정보
#### 응답 (IDataSet형)
- 전체 분석 결과를 반환

### POST /dashboard/BCAnalysisStatusRetrieve/pmAnalysisChartInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 사용자의 온라인 콘텍스트 정보
#### 응답 (IDataSet형)
- 분석 차트를 반환

### POST /dashboard/BCAnalysisStatusRetrieve/pmAnalysisChartListInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 사용자의 온라인 콘텍스트 정보
#### 응답 (IDataSet형)
- 분석 차트 리스트를 반환

### POST /dashboard/BCAnalysisStatusRetrieve/pmAnalysisLiskInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 사용자의 온라인 콘텍스트 정보
#### 응답 (IDataSet형)
- 분석 위험을 반환

### POST /dashboard/BCAnalysisStatusRetrieve/pmAnalysisYearInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 사용자의 온라인 콘텍스트 정보
#### 응답 (IDataSet형)
- 연간 분석 결과를 반환

### POST /dashboard/BCAnalysisStatusRetrieve/pmAnalysisListInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 사용자의 온라인 콘텍스트 정보
#### 응답 (IDataSet형)
- 분석 목록을 반환
---
## BCPjAnalysisStatusRetrieveController API 명세서

### POST dashboard/BCPjAnalysisStatusRetrieve/pmPjAnalysisTotalInq
#### 파라미터 정보
- requestData : 프로젝트 분석에 관련된 요청 데이터( 타입: IDataSet)
- onlineCtx : 온라인 컨텍스트 정보( 타입: IOnlineContext)
#### 응답 (JSON)
- 프로젝트 분석 상황에 대한 합계 조회 결과을 포함하는 데이터 세트를 반환

### POST dashboard/BCPjAnalysisStatusRetrieve/pmPjAnalysisChartInq
#### 파라미터 정보
- requestData : 프로젝트 분석에 관련된 요청 데이터( 타입: IDataSet)
- onlineCtx : 온라인 컨텍스트 정보( 타입: IOnlineContext)
#### 응답 (JSON)
- 프로젝트 분석 결과를 차트 형태로 조회한 데이터 세트를 반환

---
## BCNCIController API 명세서
### POST /dashboard/BCNCI/pmGetResult
#### 파라미터 정보
- requestData : 검색 기준 파라미터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (객체 IDataset 반환)
- 서비스의 pmGetResult 메소드를 통해 결과 데이터셋을 반환한다.

### POST /dashboard/BCNCI/pmGetTarget
#### 파라미터 정보
- requestData : 검색 기준 파라미터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (객체 IDataset 반환)
- 서비스의 pmGetTarget 메소드를 통해 결과 데이터셋을 반환한다.
---
## BCSInstitutionExistingUserDashboardController API 명세서
### POST /dashboard/BCSInstitutionExistingUserDashboard/pmChckprojects
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmChckprojects 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmWorkCodeMangerExcelUpload
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmWorkCodeMangerExcelUpload 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmSystemCodeMangerDel
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmSystemCodeMangerDel 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmSystemCodeMangerLUpd02
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmSystemCodeMangerLUpd02 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmSystemCodeMangerLUpd
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmSystemCodeMangerLUpd 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmSystemCodeMangerAdd
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmSystemCodeMangerAdd 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmRequirementsScopeListInq 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmServiceRequestManagementExceldownload
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (File)
- 서비스의 pmServiceRequestManagementExceldownload 메서드 수행 결과를 담고 있는 파일 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmServiceRequestManagementExcelupload
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmServiceRequestManagementExcelupload 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmhidel1
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmhidel1 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmhidel2
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmhidel2 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmhidel3
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmhidel3 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.

### POST /dashboard/BCSInstitutionExistingUserDashboard/pmLinkTeamSite
#### 파라미터 정보
- requestData : 요청 정보를 담고 있는 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (JSON)
- 서비스의 pmLinkTeamSite 메서드 수행 결과를 담고 있는 DataSet 객체를 반환합니다.
---
## BCDevelopmentPerformanceSituation API 명세서
### POST /dashboard/BCDevelopmentPerformanceSituation/pmDevPerformanceSituationListInq
#### 파라미터 정보
- requestData : 요청 데이터 (IDataset 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 개발 성과 상황 리스트 조회 결과

### POST /dashboard/BCDevelopmentPerformanceSituation/pmDevPerformanceSituationColListInq
#### 파라미터 정보
- requestData : 요청 데이터 (IDataset 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 개발 성과 상황 컬럼 리스트 조회 결과

### POST /dashboard/BCDevelopmentPerformanceSituation/pmDevPerformanceSituationPrivateColListInq
#### 파라미터 정보
- requestData : 요청 데이터 (IDataset 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 개인별 개발 성과 상황 컬럼 리스트 조회 결과

### POST /dashboard/BCDevelopmentPerformanceSituation/pmDevPerformanceSituationPrivateListInq
#### 파라미터 정보
- requestData : 요청 데이터 (IDataset 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 개인별 개발 성과 상황 리스트 조회 결과

### POST /dashboard/BCDevelopmentPerformanceSituation/pmDevPerformanceSituationWorkdayInq
#### 파라미터 정보
- requestData : 요청 데이터 (IDataset 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 개발 성과 상황 근무일 조회 결과

### POST /dashboard/BCDevelopmentPerformanceSituation/pmDevProgressChargerNameListInq
#### 파라미터 정보
- requestData : 요청 데이터 (IDataset 형식)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 형식)
#### 응답 (JSON)
- 개발 진행 상황 담당자 이름 리스트 조회 결과

---
## BCProgressRateRetrieveController API 명세서
### POST /dashboard/ProgressRateRetrieve/pmProgressRateListInq
#### 파라미터 정보
- requestData : 프로그레스 배율을 조회하기 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로그레스 배율 리스트 반환
---
## BCPrdtvyDashboard API 명세서

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyDashboardGetUsers
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 사용자들 관련 정보를 담는 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyDashboardGetPeriod
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 특정 기간 정보를 담는 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyDashboardGetPeriodWithBaseDt
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 기준날짜를 포함하는 특정 기간 정보를 담는 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyProgChart1
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 프로그레스 차트 1을 생성하는데 필요한 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyProgChart2
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 프로그레스 차트 2를 생성하는데 필요한 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyProgGrid1
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 그리드 1을 생성하는데 필요한 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyProgGrid2
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 그리드 2를 생성하는데 필요한 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyProgHistoryChart
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 프로그레스 히스토리 차트를 생성하는데 필요한 데이터셋 반환

### POST /dashboard/bcprdtvy/BCPrdtvyDashboard/pmPrdtvyProgHistoryGrid
#### 파라미터 정보
- requestBody IDataSet requestData : 데이터셋 요청 데이터 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 프로그레스 히스토리 그리드를 생성하는데 필요한 데이터셋 반환
---
## BCAppQController API 명세서

### POST /dashboard/BCAppQ/pmGetQualityList
#### 파라미터 정보

- `requestData` : 데이터셋 요청 데이터, 서버에서 요청을 처리하는데 필요한 데이터를 포함합니다.
- `onlineCtx` : 온라인 컨텍스트, 서버에 전달되는 요청의 상세한 컨텍스트 정보를 담고 있습니다.

#### 응답 (JSON)
- 서비스에서 처리된 `pmGetQualityList` 메소드의 결과 데이터셋이 반환됩니다.
---
## BCDesignInterfaceDashBoard API 명세서
### POST /dashboard/BCDesignInterfaceDashBoard/pmGrid1
#### 파라미터 정보
- requestData : 전송되는 데이터 세트
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스의 pmGrid1 메서드 반환값

### POST /dashboard/BCDesignInterfaceDashBoard/pmChart2
#### 파라미터 정보
- requestData : 전송되는 데이터 세트
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스의 pmChart2 메서드 반환값

### POST /dashboard/BCDesignInterfaceDashBoard/pmChart1
#### 파라미터 정보
- requestData : 전송되는 데이터 세트
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스의 pmChart1 메서드 반환값

### POST /dashboard/BCDesignInterfaceDashBoard/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 전송되는 데이터 세트
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스의 pmApprovalSettingInq 메서드 반환값

### POST /dashboard/BCDesignInterfaceDashBoard/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestData : 전송되는 데이터 세트
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 서비스의 pmFunctionNameLevel4Inq 메서드 반환값
---
## BCCsrDefectStatusController API 명세서
### POST /dashboard/BCCsrDefectStatus/pmChargerInq
#### 파라미터 정보
- requestData : 전송 받은 데이터
- onlineCtx : 온라인 환경 설정 정보
#### 응답 (JSON)
- 'pmChargerInq'의 작업 결과 담긴 IDataSet 객체

### POST /dashboard/BCCsrDefectStatus/pmCsrStatusGrid
#### 파라미터 정보
- requestData : 전송 받은 데이터
- onlineCtx : 온라인 환경 설정 정보
#### 응답 (JSON)
- 'pmCsrStatusGrid'의 작업 결과 담긴 IDataSet 객체

### POST /dashboard/BCCsrDefectStatus/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 전송 받은 데이터
- onlineCtx : 온라인 환경 설정 정보
#### 응답 (JSON)
- 'pmProgramStatusChart1'의 작업 결과 담긴 IDataSet 객체

### POST /dashboard/BCCsrDefectStatus/pmProgramStatusChart2
#### 파라미터 정보
- requestData : 전송 받은 데이터
- onlineCtx : 온라인 환경 설정 정보
#### 응답 (JSON)
- 'pmProgramStatusChart2'의 작업 결과 담긴 IDataSet 객체

### POST /dashboard/BCCsrDefectStatus/pmProdectivityPersonListInq
#### 파라미터 정보
- requestData : 전송 받은 데이터
- onlineCtx : 온라인 환경 설정 정보
#### 응답 (JSON)
- 'pmProdectivityPersonListInq'의 작업 결과 담긴 IDataSet 객체

### POST /dashboard/BCCsrDefectStatus/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- requestData : 전송 받은 데이터
- onlineCtx : 온라인 환경 설정 정보
#### 응답 (JSON)
- 'pmScopeManagerApprovalSettingInq'의 작업 결과 담긴 IDataSet 객체
---
## BCFunctionPointReport API 명세서
### POST dashboard/BCFunctionPointReport/pmFpReportInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmFpReportInq 서비스에서 응답로 반환하는 데이터 세트

### POST dashboard/BCFunctionPointReport/pmFpReportInq_fp
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmFpReportInq_fp 서비스에서 응답으로 반환하는 데이터 세트

### POST dashboard/BCFunctionPointReport/pmFpReportAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmFpReportAdd 서비스에서 응답으로 반환하는 데이터 세트

### POST dashboard/BCFunctionPointReport/pmFpReportDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmFpReportDel 서비스에서 응답으로 반환하는 데이터 세트

### POST dashboard/BCFunctionPointReport/pmFpReportUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- pmFpReportUpd 서비스에서 응답으로 반환하는 데이터 세트
---
## BCSInstitutionExistingUserDashboardController2 API 명세서
### POST /dashboard/BCSInstitutionExistingUserDashboard2/pmChckprojects
#### 파라미터 정보
- requestData : 요청 정보 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (IDataSet)
- 처리 결과 DataSet 객체 반환

### POST /dashboard/BCSInstitutionExistingUserDashboard2/pmWorkCodeMangerExcelUpload
#### 파라미터 정보
- requestData : 요청 정보 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (IDataSet)
- 처리 결과 DataSet 객체 반환

### POST /dashboard/BCSInstitutionExistingUserDashboard2/pmSystemCodeMangerDel
#### 파라미터 정보
- requestData : 요청 정보 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (IDataSet)
- 처리 결과 DataSet 객체 반환

### POST /dashboard/BCSInstitutionExistingUserDashboard2/pmSystemCodeMangerLUpd02
#### 파라미터 정보
- requestData : 요청 정보 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (IDataSet)
- 처리 결과 DataSet 객체 반환 

### POST /dashboard/BCSInstitutionExistingUserDashboard2/pmSystemCodeMangerLUpd
#### 파라미터 정보
- requestData : 요청 정보 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (IDataSet)
- 처리 결과 DataSet 객체 반환 

### POST /dashboard/BCSInstitutionExistingUserDashboard2/pmSystemCodeMangerAdd
#### 파라미터 정보
- requestData : 요청 정보 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (IDataSet)
- 처리 결과 DataSet 객체 반환 

### POST /dashboard/BCSInstitutionExistingUserDashboard2/pmRequirementsScopeListInq
#### 파라미터 정보
- requestData : 요청 정보 DataSet 객체
- onlineCtx : Request 정보
#### 응답 (IDataSet)
- 처리 결과 DataSet 객체 반환
---
## PUProgramDashBoardWooriController API 명세서
### POST /dashboard/BCDesignProgramDashBoardWoori/pmChart1
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 온라인 문맥에 대한 정보
#### 응답 (IDataSet)
- pmChart1 결과

### POST /dashboard/BCDesignProgramDashBoardWoori/pmChart2
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보 
- onlineCtx : 온라인 문맥에 대한 정보
#### 응답 (IDataSet)
- pmChart2 결과

### POST /dashboard/BCDesignProgramDashBoardWoori/pmGrid1
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 온라인 문맥에 대한 정보
#### 응답 (IDataSet)
- pmGrid1 결과

### POST /dashboard/BCDesignProgramDashBoardWoori/pmFunctionNameLevel4Inq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 온라인 문맥에 대한 정보
#### 응답 (IDataSet)
- 4단계 별 함수명 쿼리 결과

### POST /dashboard/BCDesignProgramDashBoardWoori/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터에 대한 정보
- onlineCtx : 온라인 문맥에 대한 정보
#### 응답 (IDataSet)
- 승인 설정 쿼리 결과
---
## BCChangeStateRetrieveController API 명세서
### POST dashboard/BCChangeStateRetrieve/pmChangeStateList

#### 파라미터 정보
- IDataSet requestData : 변경 상태 목록을 가져오기 위해 필요한 요청 데이터(IDS 세트)
- IOnlineContext onlineCtx : 현재 사용자 컨텍스트 정보(온라인 컨텍스트)

#### 응답 (JSON)
- 변경 상태 목록 정보를 포함한 IDataSet 객체 또는 에러 메시지를 돌려줍니다.
---
## BCTestIntegratedController API 명세서
### POST /dashboard/BCTestIntegrated/pmListInq
#### 파라미터 정보
- requestData : 요청 데이터세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 관리 리스트 조회 결과를 데이터세트로 반환

### POST /dashboard/BCTestIntegrated/pmListInq2
#### 파라미터 정보
- requestData : 요청 데이터세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 관리 리스트 조회 결과를 데이터세트로 반환

### POST /dashboard/BCTestIntegrated/pmTestStatusRightChart
#### 파라미터 정보
- requestData : 요청 데이터세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 테스트 상태에 따른 우측 차트 조회 결과를 데이터세트로 반환
---
## BCMonitoringController API 명세서
### POST system/BCMonitoring/pmLoginList
#### 파라미터 정보
- requestData : 요청 데이터로서 IDataSet 인스턴스를 의미한다. 
- onlineCtx : 온라인 상황 정보로 IOnlineContext 인스턴스를 의미한다.
#### 응답 (Object)
- pmLoginList 메소드 처리 결과를 IDataSet 인스턴스로 출력한다.
---
## BCAdhocQueryManager API 명세서
### POST /system/BCAdhocQueryManager/pmQueryExec
#### 파라미터 정보
- requestData : 요청 데이터셋 (IDataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보 (IOnlineContext 객체)
#### 응답 (JSON)
- BCAdhocQueryManager 서비스의 pmQueryExec 메서드 실행결과를 반환합니다. (IDataSet 객체)
---
## BCLogManager API 명세서
### POST /system/BCLogManager/pmLogList
#### 파라미터 정보
- requestData : 로그에 대한 정보를 담은 데이터셋
- onlineCtx : 온라인 환경 정보가 담긴 컨텍스트

#### 응답 (IDataset)
- 요청에 대한 응답 정보를 담은 데이터셋

### POST /system/BCLogManager/pmLogDownload
#### 파라미터 정보
- requestData : 다운로드 할 로그에 대한 정보를 담은 데이터셋
- onlineCtx : 온라인 환경 정보가 담긴 컨텍스트

#### 응답 (DownloadView)
- 요청한 로그 파일의 다운로드 뷰

### POST /system/BCLogManager/pmLogInfo
#### 파라미터 정보
- requestData : 상세 정보를 조회 할 로그에 대한 정보를 담은 데이터셋
- onlineCtx : 온라인 환경 정보가 담긴 컨텍스트

#### 응답 (IDataset)
- 요청한 로그의 상세 정보를 담은 데이터셋

### POST /system/BCLogManager/pmLogDelete
#### 파라미터 정보
- requestData : 삭제 할 로그에 대한 정보를 담은 데이터셋
- onlineCtx : 온라인 환경 정보가 담긴 컨텍스트

#### 응답 (IDataset)
- 요청에 대한 응답 정보를 담은 데이터셋
---
## BCUserLogin API 명세서
### POST /system/BCUserLogin/pmUserSearch
#### 파라미터 정보
- requestData : 유저 로그인 데이터 정보를 담고 있습니다.
- onlineCtx : 현재 온라인 상황에 대한 정보를 담고 있습니다.
#### 응답 (JSON)
- pmUserSearc 메소드를 통해 반환된 IDataSet입니다. 이는 유저 검색 결과를 담고 있습니다.
---
## BCPropertiesManager API 명세서
### POST /system/BCPropertiesManager/pmPropertiesList
#### 파라미터 정보
- requestData : 속성 리스트에 대한 요청 데이터.
- onlineCtx : 온라인 컨텍스트 정보.
#### 응답 (JSON)
- 속성 리스트를 반환합니다.

### POST /system/BCPropertiesManager/pmPropertiesDownload
#### 파라미터 정보
- requestData : 다운로드할 속성 파일에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보.
#### 응답 (DOWNLOAD)
- 요청한 속성 파일을 다운로드할 수 있는 뷰를 반환합니다.

### POST /system/BCPropertiesManager/pmPropertiesInfo
#### 파라미터 정보
- requestData : 속성에 대한 상세 정보 요청 데이터.
- onlineCtx : 온라인 컨텍스트 정보.
#### 응답 (JSON)
- 속성에 대한 상세 정보를 반환합니다.

### POST /system/BCPropertiesManager/pmPropertiesSave
#### 파라미터 정보
- requestData : 저장할 속성에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보.
#### 응답 (JSON)
- 속성 저장 결과를 반환합니다.
---
## BCTestFileUpload API 명세서
### POST /system/BCTestFileUpload/pmList
#### 파라미터 정보
- requestData : 사용자의 요청 데이터, 서비스를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트, 사용자 세션 및 환경 설정 정보

#### 응답 (JSON)
- 서비스의 처리 결과에 대한 정보가 들어있는 데이터 셋

### POST /system/BCTestFileUpload/pmRegister
#### 파라미터 정보
- requestData : 사용자의 요청 데이터, 서비스를 요청하는 데이터
- onlineCtx : 온라인 컨텍스트, 사용자 세션 및 환경 설정 정보

#### 응답 (JSON)
- 서비스의 처리 결과에 대한 정보가 들어있는 데이터 셋
---
## BCSiteIFMoniteringRetrieve API 명세서
### POST /common/BCSiteIFMoniteringRetrieve/pmLabelInq
#### 파라미터 정보
- requestData : 요청에 필요한 데이터를 담고 있는 객체
- onlineCtx : 컨텍스트 정보를 담고 있는 객체
#### 응답 (JSON)
- pmLabelInq의 실행 결과에 대한 정보를 담고 있는 객체 반환
---
## BCDbLogController API 명세서
### POST /common/BCDbLog/pmDbLogInq
#### 파라미터 정보
- requestData : 데이터 처리를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- pmDbLogInq 메서드를 호출하면 결과 데이터를 반환

### POST /common/BCDbLog/pmServerLogInq
#### 파라미터 정보
- requestData : 데이터 처리를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- pmServerLogInq 메서드를 호출하면 결과 데이터를 반환
---
## BCFavoritPrjController API 명세서
### POST /common/BCFavoritPrjController/pmUserPrjFavorit
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 사용자 프로젝트 즐겨찾기 관련 서비스 응답

### POST /common/BCFavoritPrjController/pmFavoritGridUpd
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 즐겨찾기 그리드 업데이트 관련 서비스 응답

### POST /common/BCFavoritPrjController/pmUserPrjFavorit1
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 사용자 프로젝트 즐겨찾기1 관련 서비스 응답

### POST /common/BCFavoritPrjController/pmFavoritSeq
#### 파라미터 정보
- requestData : 사용자 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 즐겨찾기 순서 관련 서비스 응답
---
## BCPaymentController API 명세서

### POST /common/BCPayment/pmGetPaymentList
#### 파라미터 정보
- requestData : 데이터 세트에 대한 요청 및 정보가 포함되어 있음.
- onlineCtx : 온라인 정보 컨텍스트입니다.
#### 응답 (JSON)
- 결제 목록 정보를 반환합니다.

### POST /common/BCPayment/pmInsertPaymentData
#### 파라미터 정보
- requestData : 새로운 결제 데이터에 대한 정보가 포함되어 있음.
- onlineCtx : 온라인 정보 컨텍스트입니다.
#### 응답 (JSON)
- 새 결제 데이터 삽입 결과를 반환합니다.

### POST /common/BCPayment/pmUpdatePaymentData
#### 파라미터 정보
- requestData : 업데이트할 결제 데이터에 대한 정보가 포함되어 있음.
- onlineCtx : 온라인 정보 컨텍스트입니다.
#### 응답 (JSON)
- 결제 데이터 업데이트 결과를 반환합니다.

### POST /common/BCPayment/pmDeletePaymentData
#### 파라미터 정보
- requestData : 삭제할 결제 데이터에 대한 정보가 포함되어 있음.
- onlineCtx : 온라인 정보 컨텍스트입니다.
#### 응답 (JSON)
- 결제 데이터 삭제 결과를 반환합니다.
---
## BCMessengerLink API 명세서
### POST /common/BCMessengerLink/pmExcuteBatch
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 응답결과는 서비스의 pmExcuteBatch 메서드 실행 결과에 따른다.

### POST /common/BCMessengerLink/pmDataDelete
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 응답결과는 서비스의 pmDataDelete 메서드 실행 결과에 따른다.

### POST /common/BCMessengerLink/pmMessengerLinkCountInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 응답결과는 서비스의 pmMessengerLinkCountInq 메서드 실행 결과에 따른다.

### POST /common/BCMessengerLink/pmMessengerLinkAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 응답결과는 서비스의 pmMessengerLinkAdd 메서드 실행 결과에 따른다.
---
## BCNciManager API 명세서
### POST /common/BCNciManager/pmNciScheSelect
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- 스케줄 선택 정보

### POST /common/BCNciManager/pmNciUseSelect
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 사용 선택 정보

### POST /common/BCNciManager/pmNciProjSelect
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 프로젝트 선택 정보

### POST /common/BCNciManager/pmNciUpdateConnInfo
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 연결정보 업데이트 정보

### POST /common/BCNciManager/pmNciConnectTest
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 연결 테스트 결과 정보

### POST /common/BCNciManager/pmNciUseInsert
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 사용 입력 정보

### POST /common/BCNciManager/pmNciList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 목록 정보

### POST /common/BCNciManager/pmNciDelete
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 삭제 정보

### POST /common/BCNciManager/pmNciInsert
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 삽입 정보

### POST /common/BCNciManager/pmNciReset
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- NCI 리셋 정보

### POST /common/BCNciManager/pmNtmDate
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- 날짜 정보

### POST /common/BCNciManager/pmNtmDateSave
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상태 정보
#### 응답 (ISetData)
- 날짜 저장 정보

---
## BCSystemStatisticsMonitoring API 명세서
### POST common/BCSystemStatisticsMonitoring/pmGetList
#### 파라미터 정보
- requestData : 서비스 요청에 필요한 데이터를 담고 있는 객체
- onlineCtx : 온라인 컨텍스트 객체 정보
#### 응답 (객체)
- 서비스 요청 결과를 담고 있는 IDataSet 객체 반환

### POST common/BCSystemStatisticsMonitoring/pmExcelDown
#### 파라미터 정보
- requestData : 서비스 요청에 필요한 데이터를 담고 있는 객체
- onlineCtx : 온라인 컨텍스트 객체 정보
#### 응답 (객체)
- 접근 요청을 반환하는 DownloadView 객체
- 이un더 DownloadView에는 Excel 파일과 파일명이 포함되어 있음
---
## BatchController API 명세서

### POST /batch/list.xmd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 상황 정보
#### 응답 (ResponseBody)
- 배치 작업의 리스트 정보 반환

### POST /batch/delete.xmd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 상황 정보
#### 응답 (ResponseBody)
- 요청받은 배치 작업을 삭제후 결과 반환

### POST /batch/listhistory.xmd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 상황 정보
#### 응답 (ResponseBody)
- 배치 작업의 히스토리 리스트 정보 반환

### POST /batch/historyinfo.xmd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 상황 정보
#### 응답 (ResponseBody)
- 배치 작업의 히스토리 정보 반환

### POST /batch/reg.xmd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 상황 정보
#### 응답 (ResponseBody)
- 요청받은 배치 작업을 등록

### POST /batch/exec.xmd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 상황 정보
#### 응답 (ResponseBody)
- 요청받은 배치 작업을 실행 후 결과 반환

### POST /batch/refresh.xmd
#### 파라미터 정보
- requestData : IDataSet 타입의 요청 데이터
- onlineCtx : IOnlineContext 타입의 온라인 상황 정보
#### 응답 (ResponseBody)
- 새로 고침 요청에 대한 응답은 없음. 서버 측에서 변화가 있는지 확인하고 새로 고침 처리.
---
## BCLoginController API 명세서
### POST /common/BCLogin/pmLoginProjectNoInq
#### 파라미터 정보
- requestData : API의 요청 데이터

#### 응답 (JSON)
- 로그인 프로젝트 번호 조회 결과 반환

### POST /common/BCLogin/pmLoginLocaleInq
#### 파라미터 정보
- requestData : API의 요청 데이터

#### 응답 (JSON)
- 로그인 로케일 조회 결과 반환

### POST /common/BCLogin/pmUserLocaleUpt
#### 파라미터 정보
- requestData : API의 요청 데이터

#### 응답 (JSON)
- 사용자 로케일 업데이트 결과 반환

### POST /common/BCLogin/pmLogOutLogInq
#### 파라미터 정보
- requestData : API의 요청 데이터

#### 응답 (JSON)
- 로그아웃 로그 조회 결과 반환

### POST /common/BCLogin/pmLogout
#### 파라미터 정보
- 없음

#### 응답 (JSON)
- 로그아웃 처리 결과 반환

### POST /common/BCLogin/pmProjectChange
#### 파라미터 정보
- requestData : API의 요청 데이터

#### 응답 (JSON)
- 프로젝트 변경 처리 결과 반환
---
## BCMethodologyStandardLink API 명세서
### POST /common/BCMethodologyStandardLink/pmGetTailoringList
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- 요청 데이터에 해당하는 Tailoring List를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmGetTailoringListProduct
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- 요청된 데이터에 해당하는 제품의 Tailoring List를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmExcelDown
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답
- 엑셀 다운로드 뷰가 반환됩니다.

### POST /common/BCMethodologyStandardLink/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- 엑셀 업로드 결과를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmTailoringUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- Tailoring 정보 업데이트 결과를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmTailoringIns
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- 신규 Tailoring 정보 삽입 결과를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmTailoringDel
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- Tailoring 정보 삭제 결과를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmLinkProductGridUpd
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- 링크된 제품 그리드 정보 업데이트 결과를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmLinkProductGridDel
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- 링크된 제품 그리드 정보 삭제 결과를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmGetLevelList
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 상황 정보
#### 응답 (JSON)
- 요청 데이터에 해당하는 레벨 리스트를 반환합니다.

### POST /common/BCMethodologyStandardLink/pmSaveCheckPoint
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- 체크포인트 저장 결과를 반환합니다.
---
## BCSNtmLinkToolController API 명세서
### POST /common/BCSNtmLinkTool/pmApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 결과 반환

### GET /common/BCSNtmLinkTool/pmExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (File)
- 엑셀 파일 다운로드 반환

### GET /common/BCSNtmLinkTool/pmFileDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (File)
- 파일 다운로드 반환

### GET /common/BCSNtmLinkTool/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (File)
- Excel 데이터 전체 다운로드

### POST /common/BCSNtmLinkTool/pmGetprojectno
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 번호 반환

### POST /common/BCSNtmLinkTool/pmGetntmlinklist
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 Ntmlinklist 반환

### POST /common/BCSNtmLinkTool/pmInsert
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 Insert 실행 결과 반환

### POST /common/BCSNtmLinkTool/pmUpdate
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 Update 실행 결과 반환

### POST /common/BCSNtmLinkTool/pmNtmlinkDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx: 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 Ntmlink 데이터 삭제 결과 반환
---
## PUAutonumberManagerController API 명세서

### POST /common/BCAutonumberManager/pmAutoNumber
#### 파라미터 정보
- requestData : 서비스를 호출하기 위한 데이터의 집합을 담은 객체
- onlineCtx : 온라인 상에서의 컨텍스트를 담고 있는 객체
#### 응답 (IDataSet)
- 자동번호를 생성하고, 결과를 IDataSet 객체로 반환

### POST /common/BCAutonumberManager/insert
#### 파라미터 정보
- requestData : 서비스를 호출하기 위한 데이터의 집합을 담은 객체
- onlineCtx : 온라인 상에서의 컨텍스트를 담고 있는 객체
#### 응답 (IDataSet)
- 입력한 데이터를 삽입하고, 결과를 IDataSet 객체로 반환

### POST /common/BCAutonumberManager/delete
#### 파라미터 정보
- requestData : 서비스를 호출하기 위한 데이터의 집합을 담은 객체
- onlineCtx : 온라인 상에서의 컨텍스트를 담고 있는 객체
#### 응답 (IDataSet)
- 입력한 데이터를 삭제하고, 결과를 IDataSet 객체로 반환.
---
## BCGroupUserSetting API 명세서
### POST /common/BCGroupUserSetting/pmGroupUserInitSet
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 초기 사용자 그룹 설정 정보 반환

### POST /common/BCGroupUserSetting/pmGroupList
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 그룹 리스트 반환

### POST /common/BCGroupUserSetting/pmGroupSave
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 그룹 저장 결과 반환

### POST /common/BCGroupUserSetting/pmGroupDelete
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 그룹 삭제 결과 반환

### POST /common/BCGroupUserSetting/pmUserList
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 리스트 반환

### POST /common/BCGroupUserSetting/pmUserSave
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 저장 결과 반환

### POST /common/BCGroupUserSetting/pmUserDelete
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 사용자 삭제 결과 반환

### POST /common/BCGroupUserSetting/pmGroupUserList
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 그룹 사용자 리스트 반환

### POST /common/BCGroupUserSetting/pmGroupUserSave
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 그룹 사용자 저장 결과 반환
---
## SharedMailService API 명세서
### POST /common/SharedMailService/dmSendMail
#### 파라미터 정보
- requestData (IDataSet) : 메일을 전송하기 위한 데이터가 포함된 객체
- OnlineCtx (IOnlineContext) : 온라인에서 사용하는 컨텍스트를 포함

#### 응답 (JSON)
- 데이터로부터 메일을 전송하고 그 결과를 반환

### POST /common/SharedMailService/dmAddMailSendList
#### 파라미터 정보
- requestData (IDataSet) : 메일 전송 리스트를 추가하기 위한 데이터가 포함된 객체
- OnlineCtx (IOnlineContext) : 온라인에서 사용하는 컨텍스트를 포함

#### 응답 (JSON)
- 데이터로부터 메일 전송 리스트를 추가하고 그 결과를 반환

### POST /common/SharedMailService/dmTreatMailSendList
#### 파라미터 정보
- requestData (IDataSet) : 메일 전송 리스트를 관리하기 위한 데이터를 포함
- OnlineCtx (IOnlineContext) : 온라인에서 사용하는 컨텍스트를 포함

#### 응답 (JSON)
- 데이터로부터 메일 전송 리스트를 관리하고 그 결과를 반환
---
## com.skcc.pms.bizcomponent.common.bcsync API 명세서
### GET /
#### 파라미터 정보
- HttpServletResponse : 브라우저에 응답을 보낼 객체
#### 응답 (리다이렉트)
- /pms/index.html 로 리다이렉트 한다.
---
## BCSync API 명세서
### POST /common/BCSync/pmUserSYNC
#### 파라미터 정보
- HttpServletRequest requestData : HTTP 서블릿 요청 데이터
#### 응답 (IDataSet)
- 사용자 정보 동기화 결과 데이터

### POST /common/BCSync/pmPrjSYNC
#### 파라미터 정보
- HttpServletRequest requestData : HTTP 서블릿 요청 데이터
- IOnlineContext onlineCtx : 온라인 콘텍스트 정보
#### 응답 (IDataSet)
- 프로젝트 정보 동기화 결과 데이터

### POST /common/BCSync/pmPrjMemberSYNC
#### 파라미터 정보
- HttpServletRequest requestData : HTTP 서블릿 요청 데이터
- IOnlineContext onlineCtx : 온라인 콘텍스트 정보
#### 응답 (IDataSet)
- 프로젝트 팀원 정보 동기화 결과 데이터

### POST /common/BCSync/pmDeptSYNC
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
#### 응답 (IDataSet)
- 부서 정보 동기화 결과 데이터

### POST /common/BCSync/pmAll
#### 파라미터 정보
- @RequestBody IDataSet requestData : 요청 바디에 포함된 데이터 세트
- IOnlineContext onlineCtx : 온라인 콘텍스트 정보
#### 응답 (IDataSet)
- 전체 사용자, 프로젝트, 프로젝트 팀원 정보 동기화 결과 데이터

### POST /common/BCSync/pmCheckEmailYN
#### 파라미터 정보
- @RequestBody IDataSet requestData : 요청 바디에 포함된 데이터 세트
- IOnlineContext onlineCtx : 온라인 콘텍스트 정보
#### 응답 (IDataSet)
- 이메일 확인 여부 결과 데이터
---
## BCSiteUserMappingRetrieve API 명세서
### POST /common/BCSiteUserMappingRetrieve/pmUpdateUserMapping
#### 파라미터 정보
- requestData : 변경할 사용자 매핑 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 갱신된 사용자 매핑 정보

### POST /common/BCSiteUserMappingRetrieve/pmLabelInqPopup01
#### 파라미터 정보
- requestData : 조회할 라벨 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청한 라벨 정보

### POST /common/BCSiteUserMappingRetrieve/pmExcelDown
#### 파라미터 정보
- requestData : 엑셀로 다운로드 받을 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File)
- 요청한 데이터를 담은 엑셀 파일

### POST /common/BCSiteUserMappingRetrieve/pmLabelDel
#### 파라미터 정보
- requestData : 삭제할 라벨 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 삭제된 라벨 정보

### POST /common/BCSiteUserMappingRetrieve/pmExcelUpload
#### 파라미터 정보
- requestData : 업로드할 엑셀 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 업로드된 데이터 정보

### POST /common/BCSiteUserMappingRetrieve/pmLabelAdd
#### 파라미터 정보
- requestData : 추가할 라벨 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 추가된 라벨 정보

### POST /common/BCSiteUserMappingRetrieve/pmLabelInq
#### 파라미터 정보
- requestData : 조회할 라벨 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청한 라벨 정보
---
## BCUserInfoManager API 명세서
- This API provides user management functionality including querying for user info and setting access logs.

### POST /common/BCUserInfoManager/pmUserInfoList
#### 파라미터 정보
- requestBody : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 사용자 정보 목록 반환

### POST /common/BCUserInfoManager/pmCheckSyncProjectNo
#### 파라미터 정보
- requestBody : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 프로젝트 동기화 확인 반환. 마지막 프로젝트 번호와 이름이 응답에 포함됨.

### POST /common/BCUserInfoManager/pmSetAccessMenuLog
#### 파라미터 정보
- requestBody : 요청 데이터. 'menu_url' 및 'menu_name' 필드를 포함해야 함.
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 접속 메뉴 로그 설정. 

### ~~POST /common/BCUserInfoManager/pmUserInfoChange~~
#### 파라미터 정보
- ~~requestBody : 요청 데이터~~
- ~~onlineCtx : 온라인 컨텍스트 정보~~
#### 응답 (IDataSet)
- ~~사용자 정보 변경. 이 API는 취약한 암호화 알고리즘 사용으로 주석처리됨.~~

### ~~POST /common/BCUserInfoManager/pmUserPwdCheck~~
#### 파라미터 정보:
- ~~requestBody: 요청 데이터~~
- ~~onlineCtx: 온라인 컨텍스트 정보~~
#### 응답 (IDataSet)
- ~~사용자 비밀번호 확인. 이 API는 취약한 암호화 알고리즘 사용으로 주석처리됨.~~

---
## BCCheckListMgrController API 명세서
### POST /common/BCCheckListMgr/pmCheckAvailabilityYnInq
#### 파라미터 정보
- 입력 데이터 (IDataSet requestData)
- 온라인 컨텍스트 (IOnlineContext onlineCtx)
#### 응답 (IDataSet)
- 서비스의 'pmCheckAvailabilityYnInq' 메서드를 호출하고 그 결과를 반환

### POST /common/BCCheckListMgr/pmMetaDataGridSel
#### 파라미터 정보
- 입력 데이터 (IDataSet requestData)
- 온라인 컨텍스트 (IOnlineContext onlineCtx)
#### 응답 (IDataSet)
- 서비스의 'pmMetaDataGridSel' 메서드를 호출하고 그 결과를 반환

### POST /common/BCCheckListMgr/pmMetaDataGridUpd
#### 파라미터 정보
- 입력 데이터 (IDataSet requestData)
- 온라인 컨텍스트 (IOnlineContext onlineCtx)
#### 응답 (IDataSet)
- 서비스의 'pmMetaDataGridUpd' 메서드를 호출하고 그 결과를 반환

### POST /common/BCCheckListMgr/pmMetaDataGridHistorySel
#### 파라미터 정보
- 입력 데이터 (IDataSet requestData)
- 온라인 컨텍스트 (IOnlineContext onlineCtx)
#### 응답 (IDataSet)
- 서비스의 'pmMetaDataGridHistorySel' 메서드를 호출하고 그 결과를 반환

### POST /common/BCCheckListMgr/pmMetaDataHistoryUpd
#### 파라미터 정보
- 입력 데이터 (IDataSet requestData)
- 온라인 컨텍스트 (IOnlineContext onlineCtx)
#### 응답 (IDataSet)
- 서비스의 'pmMetaDataHistoryUpd' 메서드를 호출하고 그 결과를 반환

(이하 동일 방식으로 반복)
---
## BCDashboardViewManager API 명세서
### POST /common/BCDashboardViewManager/pmDashBoardBoardManager
#### 파라미터 정보
- requestData : 대시보드보드매니저 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 대시보드보드매니저 처리 결과 데이터

### POST /common/BCDashboardViewManager/pmDashboardViewManagerAdd
#### 파라미터 정보
- requestData : 대시보드뷰매니저의 데이터 추가 요청
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 대시보드뷰매니저 데이터 추가 결과

### POST /common/BCDashboardViewManager/pmDashboardViewManagerListInq
#### 파라미터 정보
- requestData : 대시보드뷰매니저의 데이터 리스트 조회 요청
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 대시보드뷰매니저 데이터 리스트 조회 결과
---
## BCSAutonumberController API 명세서
### POST /common/BCSAutonumber/pmGetAutoNumberlist
#### 파라미터 정보
- IDataSet requestData : 자동생성번호를 가져오는 데 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmGetAutoNumberlist 서비스 처리 결과 반환

### POST /common/BCSAutonumber/pmAutoNumberDel
#### 파라미터 정보
- IDataSet requestData : 자동생성번호를 삭제하는 데 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmAutoNumberDel 서비스 처리 결과 반환

### POST /common/BCSAutonumber/pmUpsert
#### 파라미터 정보
- IDataSet requestData : 자동생성번호 데이터를 업데이트 또는 삽입하는 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- pmUpsert 서비스 처리 결과 반환

### POST /common/BCSAutonumber/AutoNumberInsert
#### 파라미터 정보
- IDataSet requestData : 자동생성번호 데이터를 삽입하는 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- AutoNumberInsert 서비스 처리 결과 반환

### POST /common/BCSAutonumber/AutoNumberUpdate
#### 파라미터 정보
- IDataSet requestData : 자동생성번호 데이터를 업데이트하는 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- AutoNumberUpdate 서비스 처리 결과 반환
---
## BCMethodologyTailoringLink API 명세서

### POST /common/BCMethodologyTailoringLink/pmGetTailoringList
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 조정 목록 정보 반환

### POST /common/BCMethodologyTailoringLink/pmGetTailoringListProduct
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 제품별 조정 목록 정보 반환

### POST /common/BCMethodologyTailoringLink/pmExcelDown
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (File)
- 엑셀 다운로드

### POST /common/BCMethodologyTailoringLink/pmExcelUpload
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 엑셀 업로드 결과 반환

### POST /common/BCMethodologyTailoringLink/pmTailoringUpd
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- Tailoring 정보 업데이트 결과 반환

### POST /common/BCMethodologyTailoringLink/pmTailoringIns
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- Tailoring 정보 삽입 결과 반환

### POST /common/BCMethodologyTailoringLink/pmTailoringDel
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- Tailoring 정보 삭제 결과 반환

### POST /common/BCMethodologyTailoringLink/pmLinkProductGridUpd
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 제품 링크 그리드 업데이트 결과 반환

### POST /common/BCMethodologyTailoringLink/pmLinkProductGridDel
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 제품 링크 그리드 삭제 결과 반환

### POST /common/BCMethodologyTailoringLink/pmGetLevelList
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 레벨 목록 정보 반환

### POST /common/BCMethodologyTailoringLink/pmMethodologyFileListInq
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 방법론 파일 목록 반환

### POST /common/BCMethodologyTailoringLink/pmMethodologyFileDel
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 방법론 파일 삭제 결과 반환

### POST /common/BCMethodologyTailoringLink/pmSaveCheckPoint
#### 파라미터 정보
- requestData : 상세 정보를 요청하는 데이터 (IDataSet 타입)
- onlineCtx : 온라인 컨텍스트 (IOnlineContext 타입)
#### 응답 (JSON)
- 체크 포인트 저장 결과 반환
---
## BCUserInfomationList API 명세서
### POST /common/BCUserInfomationList/pmUserInfoListDetail
#### 파라미터 정보
- IDataSet requestData : 사용자 정보를 불러오기 위한 요청 데이터 세트입니다.
- IOnlineContext onlineCtx : 온라인 컨텍스트 요청 정보입니다.
#### 응답 (JSON)
- 사용자 상세 정보를 반환합니다. 만약 요청한 사용자의 정보가 없을 경우는 빈 데이터를 반환합니다.

### POST /common/BCUserInfomationList/pmUserInfoList
#### 파라미터 정보
- IDataSet requestData : 사용자 리스트를 불러오기 위한 요청 데이터 세트입니다.
- IOnlineContext onlineCtx : 온라인 컨텍스트 요청 정보입니다.
#### 응답 (JSON)
- 요청한 사용자 리스트 정보를 반환합니다. 만약 요청한 사용자 리스트가 없을 경우는 빈 데이터를 반환합니다.

---
## BCProductStandardList API 명세서

### POST common/BCProductStandardList/pmCheckAvailabilityYnInq
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 서비스에 따른 결과 데이터셋

### POST common/BCProductStandardList/pmMetaDataGridSel
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 메타데이터 그리드 조회 결과

### POST common/BCProductStandardList/pmMetaDataGridUpd
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 메타데이터 그리드 업데이트 결과

### POST common/BCProductStandardList/pmMetaDataGridHistorySel
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 메타데이터 그리드 히스토리 조회 결과

### POST common/BCProductStandardList/pmMetaDataHistoryUpd
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 메타데이터 히스토리 업데이트 결과

### POST common/BCProductStandardList/pmMetaDataIns
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 메타데이터 삽입 결과

### GET common/BCProductStandardList/pmMetaDataExcelDown
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 메타데이터 엑셀 파일 다운로드

### GET common/BCProductStandardList/pmFileDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 파일 다운로드

### POST common/BCProductStandardList/pmMetaDataExcelUpload
#### 파라미터 정보
- requestData : 업로드 할 엑셀 파일 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (Json)
- 메타데이터 엑셀 파일 업로드 결과

(나머지 API도 비슷한 패턴으로 서술 가능)
---
## BCDataBackupManager API 명세서
### POST /common/BCDataBackupManager/pmDataBackupExec
#### 파라미터 정보
- IDataSet requestData : 데이터 백업 실행에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 백업 실행의 결과와 관련된 데이터

### POST /common/BCDataBackupManager/pmDataBackupConfig
#### 파라미터 정보
- IDataSet requestData : 데이터 백업 설정에 필요한 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 백업 설정의 결과와 관련된 데이터

### POST /common/BCDataBackupManager/pmDataBackupFileCrt
#### 파라미터 정보
- IDataSet requestData : 데이터 백업 파일 생성에 필요한 요청 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 백업 파일 생성의 결과와 관련된 데이터

### POST /common/BCDataBackupManager/pmDataBackupHistInqList
#### 파라미터 정보
- IDataSet requestData : 데이터 백업 이력 조회에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 백업 이력 조회의 결과와 관련된 데이터
---
## BCTeamSiteForm API 명세서
### POST /common/BCTeamSiteForm/pmDuplicationCheck
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 중복 검사 결과 데이터 세트 

### POST /common/BCTeamSiteForm/pmTeamSiteFormRetrieve
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 팀 사이트 형태의 데이터 세트를 검색하여 반환

### POST /common/BCTeamSiteForm/pmTeamSiteSelectList
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 팀 사이트의 선택된 목록 데이터 세트 반환

### POST /common/BCTeamSiteForm/pmTeamSiteFormAdd
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 팀 사이트 형식의 데이터 세트 추가 결과

### POST /common/BCTeamSiteForm/pmTeamSiteFormUpload
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 팀 사이트 형식의 업로드 결과 데이터 세트 반환

### POST /common/BCTeamSiteForm/pmTeamSiteFormList
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 팀 사이트의 형식 데이터 세트 목록 반환

### POST /common/BCTeamSiteForm/pmTeamSiteFormDel
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 삭제된 팀 사이트 형식의 데이터 세트 반환

### POST /common/BCTeamSiteForm/pmTeamSiteFormDown
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 팀 사이트 형식의 다운로드링크

### POST /common/BCTeamSiteForm/pmTeamSiteFormCreate
#### 파라미터 정보
- IDataSet requestData : 요청에 대한 데이터 세트
- IOnlineContext onlineCtx : 온라인 환경 컨텍스트
#### 응답 (ResponseBody)
- 생성된 팀 사이트 형식의 데이터 세트 반환
---
## BCLinkSetupController API 명세서
### POST /common/BCLinkSetup/pmLinkSetupUpd
#### 파라미터 정보
- requestBody IDataSet requestData : 변경할 링크 설정 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 변경된 링크 설정 데이터

### POST /common/BCLinkSetup/pmProjectListInq
#### 파라미터 정보
- requestBody IDataSet requestData : 프로젝트 리스트 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 프로젝트 리스트 데이터

### POST /common/BCLinkSetup/pmSysLinkSetupListInq
#### 파라미터 정보
- requestBody IDataSet requestData : 시스템 링크 설정 리스트 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 시스템 링크 설정 리스트 데이터

### POST /common/BCLinkSetup/pmLinkSetupAdd
#### 파라미터 정보
- requestBody IDataSet requestData : 추가할 링크 설정 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 추가된 링크 설정 데이터

### POST /common/BCLinkSetup/pmLinkSetupListInq
#### 파라미터 정보
- requestBody IDataSet requestData : 링크 설정 리스트 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 링크 설정 리스트 데이터

### POST /common/BCLinkSetup/pmLinkSetupDel
#### 파라미터 정보
- requestBody IDataSet requestData : 삭제할 링크 설정 데이터 
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 삭제된 링크 설정 데이터

### POST /common/BCLinkSetup/pmNCPListInq
#### 파라미터 정보
- requestBody IDataSet requestData : NCP 리스트 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- NCP 리스트 데이터

---
## BCProgramManager API 명세서
### POST /common/BCProgramManager/pmProgramDel
#### 파라미터 정보
- requestData : 삭제할 프로그램 정보 데이터를 포함한 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 삭제 처리 결과 정보를 포함한 데이터셋

### POST /common/BCProgramManager/pmProgramUpd
#### 파라미터 정보
- requestData : 업데이트할 프로그램 정보 데이터를 포함한 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 업데이트 처리 결과 정보를 포함한 데이터셋

### POST /common/BCProgramManager/pmProgramInq
#### 파라미터 정보
- requestData : 조회할 프로그램 정보 데이터를 포함한 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 조회된 프로그램 정보를 포함한 데이터셋

### POST /common/BCProgramManager/pmProgramAdd
#### 파라미터 정보
- requestData : 추가할 프로그램 정보 데이터를 포함한 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 추가 처리 결과 정보를 포함한 데이터셋

### POST /common/BCProgramManager/pmProgramListInq
#### 파라미터 정보
- requestData : 프로그램 리스트 조회 요청 정보를 포함한 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 조회된 프로그램 리스트를 포함한 데이터셋

### POST /common/BCProgramManager/pmExcelDataAllDownload
#### 파라미터 정보
- requestData : 엑셀 파일로 다운로드할 데이터 요청 정보를 포함한 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 다운로드 가능한 엑셀 파일 정보

### POST /common/BCProgramManager/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 파일로 업로드할 데이터 요청 정보를 포함한 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 엑셀 파일 업로드 처리 결과를 포함한 데이터셋
---
## BCMethodologyTailoringAutoController API 명세서

### POST /common/BCMethodologyTailoringAuto/pmGetProjectList
#### 파라미터 정보
- requestData : 프로젝트 리스트 관련 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 프로젝트 리스트가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmGetSubProjectList
#### 파라미터 정보
- requestData : 하위 프로젝트 리스트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 하위 프로젝트 리스트가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmGetWBSList
#### 파라미터 정보
- requestData : WBS 리스트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- WBS 리스트가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmGetStandardWBSList
#### 파라미터 정보
- requestData : 표준 WBS 리스트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 표준 WBS 리스트가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmSaveWBSCase
#### 파라미터 정보
- requestData : WBS 케이스 저장 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 요청한 WBS 케이스 정보가 저장되고 그 결과가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmGetProjectStatus
#### 파라미터 정보
- requestData : 프로젝트 상태 관련 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 프로젝트 상태 정보가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmMethodologyFileListInq
#### 파라미터 정보
- requestData : 방법론 파일 리스트 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 방법론 파일 리스트가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmGetSubProjectInfo
#### 파라미터 정보
- requestData : 하위 프로젝트 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 하위 프로젝트 정보가 반환됨

### POST /common/BCMethodologyTailoringAuto/pmExcelDown
#### 파라미터 정보
- requestData : 엑셀 파일 다운로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (file)
- 요청된 엑셀 파일이 반환됨

### POST /common/BCMethodologyTailoringAuto/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 파일 업로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 업로드 요청된 파일 정보 저장 후 그 결과 반환

### POST /common/BCMethodologyTailoringAuto/pmSaveProductTailoring
#### 파라미터 정보
- requestData : 제품 맞춤화 관련 저장 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (json)
- 요청된 제품 맞춤화 정보가 저장되고 그 결과가 반환됨
---
## PUApplicationcodemanager API 명세서
### POST common/BCapplicationcodemanager/pmLabelInq
#### 파라미터 정보
- requestData : 레이블 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (IDataSet)
- pmLabelInq API 응답 반환

### POST common/BCapplicationcodemanager/pmLabelAdd
#### 파라미터 정보
- requestData : 레이블 추가를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (IDataSet)
- pmLabelAdd API 응답 반환

### POST common/BCapplicationcodemanager/pmLabelDel
#### 파라미터 정보
- requestData : 레이블 삭제를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (IDataSet)
- pmLabelDel API 응답 반환

### POST common/BCapplicationcodemanager/pmExcelDown
#### 파라미터 정보
- requestData : 엑셀 다운로드를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (DownloadView)
- 다운로드하고자 하는 파일에 대한 정보를 반환

### POST common/BCapplicationcodemanager/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 업로드를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (IDataSet)
- pmExcelUpload API 응답 반환

### POST common/BCapplicationcodemanager/pmLabelUpt
#### 파라미터 정보
- requestData : 레이블 업데이트를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (IDataSet)
- pmLabelUpt API 응답 반환

### POST common/BCapplicationcodemanager/pmUseYn
#### 파라미터 정보
- requestData : 사용여부 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (IDataSet)
- pmUseYn API 응답 반환

### POST common/BCapplicationcodemanager/pmUseupdate
#### 파라미터 정보
- requestData : 사용여부 업데이트를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보 
#### 응답 (IDataSet)
- pmUseupdate API 응답 반환
---
## BCDlgCodeController API 명세서
### POST common/BCDlgCode/pmCodeList
#### 파라미터 정보
- IDataSet requestData : 리퀘스트 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- 서비스 호출 결과

### POST common/BCDlgCode/pmCodeDel
#### 파라미터 정보
- IDataSet requestData : 리퀘스트 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- 서비스 호출 결과

### POST common/BCDlgCode/pmCodeUpd
#### 파라미터 정보
- IDataSet requestData : 리퀘스트 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- 서비스 호출 결과

### POST common/BCDlgCode/pmCodeAllPrjSetting
#### 파라미터 정보
- IDataSet requestData : 리퀘스트 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- 서비스 호출 결과

### POST common/BCDlgCode/pmCodeListInq
#### 파라미터 정보
- IDataSet requestData : 리퀘스트 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- 서비스 호출 결과
---
## BCSprintSettingController API 명세서
### POST common/bcsprintsetting/pmIssueDefectManagementList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- 결함 관리 리스트 반환

### POST common/bcsprintsetting/pmProBasisListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (JSON)
- 프로젝트 기본 리스트 조회 결과 반환

### POST common/bcsprintsetting/pmAddProSprint
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (JSON)
- 스프린트 추가 결과 반환

### POST common/bcsprintsetting/pmSprintDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (JSON)
- 스프린트 삭제 결과 반환

### POST common/bcsprintsetting/pmSprintGridUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (JSON)
- 스프린트 그리드 업데이트 결과 반환

### POST common/bcsprintsetting/pmSprintExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (Download)
- 스프린트 엑셀 다운로드

### POST common/bcsprintsetting/pmSprintExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (JSON)
- 스프린트 엑셀 업로드 결과 반환

### POST common/bcsprintsetting/pmComBackList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (JSON)
- 커뮤니케이션 백로그 리스트 반환

### POST common/bcsprintsetting/pmReviewUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 집합 
- IOnlineContext onlineCtx : 온라인 컨텍스트  

#### 응답 (JSON)
- 리뷰 업데이트 결과 반환

(나머지도 위와 같은 패턴으로 이어집니다)
---
## BCHelpManager API 명세서
### POST /common/BCHelpManager/pmHelpUpd
#### 파라미터 정보
- requestData : 사용자의 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- pmHelpUpd 결과 데이터

### POST /common/BCHelpManager/pmHelpDel
#### 파라미터 정보
- requestData : 사용자의 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- pmHelpDel 결과 데이터

### POST /common/BCHelpManager/pmHelpAdd
#### 파라미터 정보
- requestData : 사용자의 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- pmHelpAdd 결과 데이터

### POST /common/BCHelpManager/pmHelpInq
#### 파라미터 정보
- requestData : 사용자의 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- pmHelpInq 결과 데이터

### POST /common/BCHelpManager/pmHelpListInq
#### 파라미터 정보
- requestData : 사용자의 요청 데이터
- onlineCtx : 온라인 상황 정보
#### 응답 (JSON)
- pmHelpListInq 결과 데이터
---
## BCSystemCodeManagerController API 명세서
### POST /common/BCSystemCodeManager/pmSystemCodeManagerCodeExcelDownload
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (다운로드 표시)
- 엑셀 파일을 다운로드하도록 지정된 경로와 파일명의 정보를 반환

### POST /common/BCSystemCodeManager/pmSystemCodeManagerGroupExcelDownload
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (다운로드 표시)
- 그룹화된 엑셀 파일을 다운로드하도록 지정된 경로와 파일명의 정보를 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerCodeExcelUpload
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 요청 데이터를 사용하여 엑셀을 업로드하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerLUpd
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 시스템 코드를 업데이트하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerListInq
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 시스템 코드의 목록을 조회하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerAdd
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 새 시스템 코드를 추가하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerDel
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 시스템 코드를 삭제하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerExcelUpload
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 요청된 데이터를 업로드하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeManagerInq
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 시스템 코드를 조회하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerCodeListInq
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 시스템 코드 목록을 조회하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeManagerCodeInq
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 특정 시스템 코드를 조회하고 결과를 IDataSet 형태로 반환. 

### POST /common/BCSystemCodeManager/pmSystemCodeMangerCodeAdd
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 새 시스템 코드를 추가하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerCodeLUpd
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 특정 시스템 코드를 업데이트하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSystemCodeMangerCodeDel
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 특정 시스템 코드를 삭제하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmSearchType
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 시스템 코드의 특정 유형을 검색하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmgridCodeupdate
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 그리드 코드를 업데이트하고 결과를 IDataSet 형태로 반환

### POST /common/BCSystemCodeManager/pmProjectAllCopy
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답(JSON)
- 프로젝트 전체를 복사하고 결과를 IDataSet 형태로 반환
---
## BCMailSendListController API 명세서

### POST /common/BCMailSendList/pmMailSendListUpd
#### 파라미터 정보
- requestData : 업데이트할 메일 발송 리스트 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메일 발송 리스트 업데이트 결과

### POST /common/BCMailSendList/pmMailSendListDel
#### 파라미터 정보
- requestData : 삭제할 메일 발송 리스트 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메일 발송 리스트 삭제 결과

### POST /common/BCMailSendList/pmMailSendListImport
#### 파라미터 정보
- requestData : 임포트할 메일 발송 리스트 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메일 발송 리스트 임포트 결과

### POST /common/BCMailSendList/pmMailSendListInq
#### 파라미터 정보
- requestData : 조회할 메일 발송 리스트 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메일 발송 리스트 조회 결과

### POST /common/BCMailSendList/pmMailSendListImport2
#### 파라미터 정보
- requestData : 임포트할 메일 발송 리스트 데이터(버전2)
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메일 발송 리스트 임포트 결과(버전2)

### POST /common/BCMailSendList/pmMailSendListInq2
#### 파라미터 정보
- requestData : 조회할 메일 발송 리스트 데이터(버전2)
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 메일 발송 리스트 조회 결과(버전2)

### POST /common/BCMailSendList/pmMailSendListProject
#### 파라미터 정보
- requestData : 프로젝트에 대한 메일 발송 리스트 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트별 메일 발송 리스트 조회 결과

### POST /common/BCMailSendList/pmMailSendUserInfo
#### 파라미터 정보
- requestData : 사용자 정보에 대한 메일 발송 리스트 데이터
- onlineCtx : 온라인 컨텍스트 정보
- request : HTTP 요청 객체
#### 응답 (JSON)
- 사용자 정보별 메일 발송 리스트 조회 결과
---
## BCBannerManager API 명세서
### POST /common/BCBannerManager/pmBannerStatusInsert
#### 파라미터 정보
- requestData : 요청 데이터셋으로, Banner 상태 정보를 담아 전송합니다.
- onlineCtx : 온라인 컨텍스트 정보를 담은 객체로, 사용자 세션, IP, 브라우저 정보 등을 관리합니다.
#### 응답 (IDataSet)
- Banner 상태 정보를 데이터셋 형태로 리턴합니다.

### POST /common/BCBannerManager/pmBannerUrlListInq
#### 파라미터 정보
- requestData : 요청 데이터셋으로, Banner의 URL 정보를 담아 전송합니다.
- onlineCtx : 온라인 컨텍스트 정보를 담은 객체로, 사용자 세션, IP, 브라우저 정보 등을 관리합니다.
#### 응답 (IDataSet)
- Banner URL의 리스트를 데이터셋 형태로 리턴합니다.
---
## BCSysDeptManagerLocalController API 명세서
### POST /common/BCSysDeptManagerLocal/pmDeptAdd
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Department가 추가되면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmDeptDel
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Department가 삭제되면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmDeptInqList
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Department의 목록을 조회하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmDeptDetail
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- 특정 Department의 상세 내용을 조회하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmGridSave
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Grid의 데이터를 저장하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmHelpSave
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Help 데이터를 save하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmHelpDelete
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Help 데이터를 삭제하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmUpdateProjectManagerDeptCode
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Project Manager의 부서 코드를 update하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmCommitOrg
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- 조직 정보를 업데이트하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmUpdateToCurrentTimesData
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- 최신 정보로 데이터를 업데이트하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmExcelDownload
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (DownloadView)
- Excel 파일을 다운로드하면 그 결과를 반환함

### POST /common/BCSysDeptManagerLocal/pmExcelUpload
#### 파라미터 정보
- requestData : IDataSet 형태의 데이터
- onlineCtx : online context

#### 응답 (IDataSet)
- Excel 파일을 업로드하면 그 결과를 반환함
---
## BCPLAuthManager API 명세서
### POST /common/BCPLAuthManager/pmPLAuthAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 부여된 사용자 권한 추가 정보

### POST /common/BCPLAuthManager/pmAssignSubprojectDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 할당 해제 정보

### POST /common/BCPLAuthManager/pmAssignSubprojectGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 할당 정보 업데이트

### POST /common/BCPLAuthManager/pmSubProjectLeftList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 왼쪽에 있는 하위 프로젝트 목록

### POST /common/BCPLAuthManager/pmProjectOptionList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트 옵션 목록

### POST /common/BCPLAuthManager/pmSubProjectRightList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 오른쪽에 있는 하위 프로젝트 목록

### POST /common/BCPLAuthManager/pmAssignSubprojectInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 할당된 하위 프로젝트 조회 정보

### POST /common/BCPLAuthManager/pmRegisteredPgmInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 등록된 프로그램 정보 조회 결과

### POST /common/BCPLAuthManager/pmAssignSubprojectAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 할당 추가 정보
---
## BCMeetroomManagerController API 명세서
### POST common/BCMeetroomManager/pmMeetroomAdd
#### 파라미터 정보
- requestData : 회의실 등록에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet 객체)
- 회의실 등록 결과

### POST common/BCMeetroomManager/pmMeetroomDel
#### 파라미터 정보
- requestData : 회의실 삭제에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet 객체)
- 회의실 삭제 결과

### POST common/BCMeetroomManager/pmMeetroomUpd
#### 파라미터 정보
- requestData : 회의실 업데이트에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet 객체)
- 회의실 업데이트 결과

### POST common/BCMeetroomManager/pmMeetroomListInq
#### 파라미터 정보
- requestData : 회의실 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet 객체)
- 회의실 조회 결과
---
## BCLicenseManager API 명세서

### POST /common/BCLicenseManager/pmLicenseFileDown
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 다운로드 뷰를 반환해 엑셀 파일을 직접 다운로드합니다.

### POST /common/BCLicenseManager/pmLicenseHistoryListInq
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 라이선스의 히스토리 리스트를 조회합니다.

### POST /common/BCLicenseManager/pmLicenseDel
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 라이선스를 삭제합니다.
---
## BCDeptManagerController API 명세서
### POST /common/BCDeptManager/pmDeptInq 
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 데이터
#### 응답 (JSON)
- 부서 정보 조회

### POST /common/BCDeptManager/pmDeptAdd 
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 데이터
#### 응답 (JSON)
- 부서 정보 추가

### POST /common/BCDeptManager/pmDeptUpd 
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 데이터
#### 응답 (JSON)
- 부서 정보 수정

### POST /common/BCDeptManager/pmDeptDel 
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 데이터
#### 응답 (JSON)
- 부서 정보 삭제

### POST /common/BCDeptManager/pmDeptManagerTreeInq 
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 데이터
#### 응답 (JSON)
- 부서 관리 트리 조회

### POST /common/BCDeptManager/pmDeptManagerExcelUpload 
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 데이터
#### 응답 (JSON)
- 엑셀로 업로드하며 부서 관리 정보 업데이트

### POST /common/BCDeptManager/pmDeptManagerExcelDownload 
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 데이터
#### 응답 (FileDownloadView)
- 엑셀 파일로 부서 관리 정보 다운로드

---
## BCMailGroupUserManagement API 명세서
### POST /common/BCMailGroupUserManagement/pmMailGroupUserInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 사용자 이메일 그룹 조회 결과

### POST /common/BCMailGroupUserManagement/pmMailGroupUserUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 사용자 이메일 그룹 업데이트 결과

### POST /common/BCMailGroupUserManagement/pmMailGroupUserIns
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 사용자 이메일 그룹 추가 결과

### POST /common/BCMailGroupUserManagement/pmMailGroupUserExcelDwon
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (File)
- 엑셀 파일로 된 사용자 이메일 그룹 다운로드

### POST /common/BCMailGroupUserManagement/pmMailGroupUserExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 파일로 된 사용자 이메일 그룹 업로드 결과
---
## BCAlarmConfigManger 프로그램 API 명세서
### POST /common/BCAlarmConfigManager/pmAlarmPeriodUpd
#### 파라미터 정보
- requestData : 알람 설정 관련 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataset)
- 알람 설정 업데이트에 따른 데이터셋 반환

### POST /common/BCAlarmConfigManager/pmAlarmPeriodSel
#### 파라미터 정보
- requestData : 알람 설정 관련 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataset)
- 알람 설정 선택에 따른 데이터셋 반환

### POST /common/BCAlarmConfigManager/pmAlarmConfigYnInqByUnit
#### 파라미터 정보
- requestData : 알람 설정 관련 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataset)
- 단위별 알람 설정 조회에 따른 데이터셋 반환 

### POST /common/BCAlarmConfigManager/pmAlarmConfigUpd
#### 파라미터 정보
- requestData : 알람 설정 관련 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataset)
- 알람 설정 업데이트에 따른 데이터셋 반환

### POST /common/BCAlarmConfigManager/pmAlarmConfigInq
#### 파라미터 정보
- requestData : 알람 설정 관련 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataset)
- 알람 설정 조회에 따른 데이터셋 반환

### POST /common/BCAlarmConfigManager/pmAlarmConfigYnInqByUnitDetail
#### 파라미터 정보
- requestData : 알람 설정 관련 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataset)
- 단위 상세별 알람 설정 조회에 따른 데이터셋 반환
---
## PUQuickController API 명세서
### POST common/BCQuick/pulistinq
#### 파라미터 정보
- requestData : 요청 데이터셋에 대한 정보를 포함하고 있음
- onlineCtx : 사용자의 온라인 컨텍스트 정보를 포함하고 있음

#### 응답 (JSON)
- 서비스 호출의 결과를 담은 데이터셋, 예를 들면 추출된 데이터 또는 실행 상태 등에 대한 정보를 포함하고 있음
---
## BCNoticeManagerController API 명세서
### POST /common/BCNoticeManager/pmNoticeSendReceiverListInqPop
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 메세지 수신자 목록 조회 팝업 정보

### POST /common/BCNoticeManager/pmNoticeSendReceiverDetailListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 메세지 수신자 세부 목록 조회 정보

### POST /common/BCNoticeManager/pmNoticeSendReceiverListInqSelected
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 선택된 메세지 수신자 목록 조회 정보

### POST /common/BCNoticeManager/pmNotiTypeInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 유형 조회 정보

### POST /common/BCNoticeManager/pmNoticePopUp
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 팝업 알림 정보

### POST /common/BCNoticeManager/pmNoticeSendDetailListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 전송 세부 목록 조회 정보

### POST /common/BCNoticeManager/pmNoticeSendListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 전송 목록 조회 정보

### POST /common/BCNoticeManager/pmNoticeSendReceiverListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 메세지 수신자 목록 조회 정보

### POST /common/BCNoticeManager/pmNoticeSendReceiverInsert
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 새로운 메세지 수신자 삽입 정보

### POST /common/BCNoticeManager/pmNoticeReceiveUserList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 수신 사용자 목록 정보

### POST /common/BCNoticeManager/pmNoticeDelete
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 삭제 정보

### POST /common/BCNoticeManager/pmNoticePopFile
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 팝업 파일 정보

### POST /common/BCNoticeManager/pmNoticeReceiveUserListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 수신 사용자 목록 조회 정보

### POST /common/BCNoticeManager/pmNoticeReceiveGroupListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 수신 그룹 목록 조회 정보

### POST /common/BCNoticeManager/pmNoticeFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 파일 목록 조회 정보

### POST /common/BCNoticeManager/pmNoticeFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 파일 삭제 정보

### POST /common/BCNoticeManager/pmNotiStateUpdate
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataset)
- 알림 상태 업데이트 정보
---
## BCMeetroomReservManager API 명세서

### POST /common/BCMeetroomReservManager/pmResourceListInq_booked_mitting
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataSet 

### POST /common/BCMeetroomReservManager/pmResourceListInq_settimer_booked_mitting
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataSet

### POST /common/BCMeetroomReservManager/pmUserInfo
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataSet

### POST /common/BCMeetroomReservManager/pmSubListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataSet

### POST /common/BCMeetroomReservManager/pmMeetroomReservAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서비스에서 반환하는 IDataSet

(이와 같은 방식으로 계속해서 나열됨)
---
## BCProjectMove API 명세서
### POST /common/BCProjectMove/pmProjectMove
#### 파라미터 정보
- IDataSet requestData : 요청 데이터를 담고 있는 객체. 
  - chg_project_in_solution (optional) : 솔루션 내에서 직접 프로젝트를 변경했는지 여부를 나타내는 파라미터. Y로 설정하면 포탈 사용자의 last project를 변경함.
  - project_no (optional) : 변경하고자 하는 프로젝트의 번호.
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보를 가지고 있는 객체. 사용자 정보 등을 관리함.

#### 응답 (JSON)
- 요청이 정상적으로 처리되었을 경우, "MSGI4008" 메시지와 함께 성공적인 처리 결과를 반환함. 
- 잘못된 요청이나 서버 오류가 발생했을 경우, 오류 메시지와 함께 실패한 처리 결과를 반환함.
---
## BCFunctionalScoreStatement API 명세서
### POST /common/BCFunctionalScoreStatement/pmUserGroupCode
#### 파라미터 정보
- requestData : 사용자 그룹 코드 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 그룹 코드 정보 반환

### POST /common/BCFunctionalScoreStatement/pmUserLevelCode
#### 파라미터 정보
- requestData : 사용자 레벨 코드 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 레벨 코드 정보 반환

### POST /common/BCFunctionalScoreStatement/pmUserPostCode
#### 파라미터 정보
- requestData : 사용자 포스트 코드 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 포스트 코드 정보 반환

### POST /common/BCFunctionalScoreStatement/pmUserRoleCode
#### 파라미터 정보
- requestData : 사용자 역할 코드 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 역할 코드 정보 반환

### POST /common/BCFunctionalScoreStatement/pmUserNameCheck
#### 파라미터 정보
- requestData : 사용자 이름 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 이름 확인 정보 반환

### POST /common/BCFunctionalScoreStatement/pmProjectUserListInq
#### 파라미터 정보
- requestData : 프로젝트 사용자 리스트 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 프로젝트 사용자 리스트 정보 반환

### POST /common/BCFunctionalScoreStatement/pmUserDel
#### 파라미터 정보
- requestData : 사용자 삭제 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 삭제 결과 반환

### POST /common/BCFunctionalScoreStatement/pmUserInq
#### 파라미터 정보
- requestData : 사용자 조회 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 조회 결과 반환

### POST /common/BCFunctionalScoreStatement/pmUserUpd
#### 파라미터 정보
- requestData : 사용자 업데이트 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 업데이트 결과 반환

### POST /common/BCFunctionalScoreStatement/pmUserAdd
#### 파라미터 정보
- requestData : 사용자 추가 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 추가 결과 반환

### POST /common/BCFunctionalScoreStatement/pmUserUpdPw
#### 파라미터 정보
- requestData : 사용자 비밀번호 갱신 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 비밀번호 갱신 결과 반환

### POST /common/BCFunctionalScoreStatement/pmUserCheck
#### 파라미터 정보
- requestData : 사용자 확인 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 확인 결과 반환

### POST /common/BCFunctionalScoreStatement/pmUserRoleInq
#### 파라미터 정보
- requestData : 사용자 역할 조회 데이터
- onlineCtx : 온라인 컨텍스트 데이터
#### 응답 (JSON)
- 사용자 역할 조회 결과 반환

---
## BCSystemBasisFeeInfo API 명세서
### POST /common/BCSystemBasisFeeInfo/pmBasisFeeInfoExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (Json)
- 업로드된 기본 요금 정보를 반환

### POST /common/BCSystemBasisFeeInfo/pmBasisFeeInfoUpt
#### 파라미터 정보
- requestData : 요청 데이터 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (Json)
- 갱신된 기본 요금 정보를 반환

### POST /common/BCSystemBasisFeeInfo/pmBasisFeeInfoDel
#### 파라미터 정보
- requestData : 삭제할 데이터의 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (Json)
- 삭제 완료된 결과를 반환

### POST /common/BCSystemBasisFeeInfo/pmBasisFeeInfoListInq
#### 파라미터 정보
- requestData : 조회할 데이터의 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (Json)
- 조회된 기본 요금 정보 목록을 반환

### POST /common/BCSystemBasisFeeInfo/pmBasisFeeInfoSelBoxInq
#### 파라미터 정보
- requestData : 조회할 데이터의 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (Json)
- 조회된 선택 상자 정보를 반환

### POST /common/BCSystemBasisFeeInfo/pmBasisFeeInfoAdd
#### 파라미터 정보
- requestData : 추가할 데이터 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (Json)
- 추가된 기본 요금 정보를 반환

### POST /common/BCSystemBasisFeeInfo/pmBasisFeeInfoExcelDownload
#### 파라미터 정보
- requestData : 다운로드할 데이터 정보를 담고 있는 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보를 담고 있는 IOnlineContext 객체
#### 응답 (File)
- 요청한 기본 요금 정보의 엑셀 파일을 다운로드함

---
## BCMailFormManager API 명세서
### POST /common/BCMailFormManager/pmFormListInq
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋

### POST /common/BCMailFormManager/pmFormAdd
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋

### POST /common/BCMailFormManager/pmFormItemInq
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋

### POST /common/BCMailFormManager/pmFormItemSave
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋

### POST /common/BCMailFormManager/pmFormAttachInq
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋

### POST /common/BCMailFormManager/pmFormItemDel
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋

### POST /common/BCMailFormManager/puItemDel
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋

### POST /common/BCMailFormManager/pmGetKeyForNew
#### 파라미터 정보
- requestData : 요청 데이터셋
- onlineCtx : 온라인 컨텍스트
#### 응답 (json)
- 서비스에서 반환하는 데이터셋
---
## BCTeamsiteUserAuth API 명세서
### POST common/BCTeamsiteUserAuth/pmTeamsiteUserAuthAdd
#### 파라미터 정보
- requestData : 사용자 인증을 추가하는 데이터
- onlineCtx : 기타 동시 엑세스 컨텍스트 데이터
#### 응답 (IDataSet)
- 사용자 인증 여부에 따른 결과 데이터 반환

### POST common/BCTeamsiteUserAuth/pmTeamsiteUserAuthInq
#### 파라미터 정보
- requestData : 사용자 인증 조회를 위한 데이터
- onlineCtx : 기타 동시 엑세스 컨텍스트 데이터
#### 응답 (IDataSet)
- 사용자 인증 조회 결과 데이터 반환

### POST common/BCTeamsiteUserAuth/pmTeamsiteUserAuthYNUpd
#### 파라미터 정보
- requestData : 사용자 인증 상태 업데이트를 위한 데이터
- onlineCtx : 기타 동시 엑세스 컨텍스트 데이터
#### 응답 (IDataSet)
- 사용자 인증 상태 업데이트 결과 데이터 반환

### POST common/BCTeamsiteUserAuth/pmTeamsiteUserAuthAllynInq
#### 파라미터 정보
- requestData : 사용자 인증 여부 조회를 위한 데이터
- onlineCtx : 기타 동시 엑세스 컨텍스트 데이터
#### 응답 (IDataSet)
-  사용자 인증 여부 조회 결과 데이터 반환

### POST common/BCTeamsiteUserAuth/pmTeamsiteUserAuthCheckInq
#### 파라미터 정보
- requestData : 사용자 인증 확인을 위한 데이터
- onlineCtx : 기타 동시 엑세스 컨텍스트 데이터
#### 응답 (IDataSet)
- 사용자 인증 확인 결과 데이터 반환

### POST common/BCTeamsiteUserAuth/pmResourceListInq
#### 파라미터 정보
- requestData :  레포지토리 자원 조회를 위한 데이터
- onlineCtx : 기타 동시 엑세스 컨텍스트 데이터
#### 응답 (IDataSet)
- 레포지토리 자원 조회 결과 데이터 반환
---
## BCSystemDegreeManager API 명세서

### POST /common/BCSystemDegreeManager/pmSystemDegreeManagerCodeExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트 
#### 응답 (DownloadView)
- 파일 다운로드
- Excel 파일 이름
- Excel 파일 경로

### POST /common/BCSystemDegreeManager/pmSystemDegreeManagerGroupExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트 
#### 응답 (DownloadView)
- 다운로드 파일
- Excel 파일 이름
- Excel 파일 경로

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerCodeExcelUpload
#### 파라미터 정보
- IDataSet requestData : 코드 엑셀 업로드 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트 
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerLUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 셋
- IOnlineContext onlineCtx: 온라인 컨텍스트 
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerListInq
#### 파라미터 정보
- IDataSet requestData : 리스트 조회 요청 데이터 
- IOnlineContext onlineCtx: 온라인 컨텍스트 
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerAdd
#### 파라미터 정보
- IDataSet requestData : 추가 요청 데이터 
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerDel
#### 파라미터 정보
- IDataSet requestData : 삭제 요청 데이터 
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerExcelUpload
#### 파라미터 정보
- IDataSet requestData : 엑셀 업로드 요청 데이터 
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeManagerInq
#### 파라미터 정보
- IDataSet requestData : 조회 요청 데이터 
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerCodeListInq
#### 파라미터 정보
- IDataSet requestData : 코드 리스트 조회 요청 데이터 
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeManagerCodeInq
#### 파라미터 정보
- IDataSet requestData : 코드 조회 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerCodeAdd
#### 파라미터 정보
- IDataSet requestData : 코드 추가 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerCodeLUpd
#### 파라미터 정보
- IDataSet requestData : 코드 업데이트 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSystemDegreeMangerCodeDel
#### 파라미터 정보
- IDataSet requestData : 코드 삭제 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmSearchType
#### 파라미터 정보
- IDataSet requestData : 타입 검색 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmgridCodeupdate
#### 파라미터 정보
- IDataSet requestData : 코드 업데이트 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

### POST /common/BCSystemDegreeManager/pmProjectAllCopy
#### 파라미터 정보
- IDataSet requestData : 전체 프로젝트 복사 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트
#### 응답 (IDataSet)
- 서비스 응답 데이터 셋

---
## BCProjectForm API 명세서
### POST common/BCProjectForm/pmTableUpLoad
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터에 대한 처리 결과 반환

### POST common/BCProjectForm/pmTableDelete
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 삭제 결과 반환

### POST common/BCProjectForm/pmProjectFormRetrieve
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청에 따른 데이터 조회 결과 반환

### POST common/BCProjectForm/pmProjectFormAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청에 따른 데이터 추가 결과 반환

### POST common/BCProjectForm/pmProjectFormCreate
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 생성 결과를 반환

### POST common/BCProjectForm/pmProjectFormSelectList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터에 대한 선택된 리스트 결과 반환

### POST common/BCProjectForm/pmProjectSelectList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터에 대한 프로젝트 선택 리스트 결과 반환

### POST common/BCProjectForm/pmProjectFormUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 업로드 처리 결과 반환

### POST common/BCProjectForm/pmProjectFormDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 삭제 결과를 반환

### POST common/BCProjectForm/pmProjectFormDown
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 요청한 데이터 다운로드 반환

### POST common/BCProjectForm/pmDuplicationCheck
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터에 대한 중복 체크 결과 반환

### POST common/BCProjectForm/pmTableDownLoad
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 다운로드 처리 결과 반환

### POST common/BCProjectForm/pmTableTransfer
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터에 대한 이전 결과 반환

### POST common/BCProjectForm/pmProjectDataFileSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터에 대한 프로젝트 데이터 파일 선택 결과 반환

### POST common/BCProjectForm/pmProjectFormDataFileDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터에 대한 프로젝트 폼 데이터 파일 삭제 결과 반환

### POST common/BCProjectForm/pmTableUpLoad2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 업로드 처리 결과 반환

### POST common/BCProjectForm/pmTableDownLoad5
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 다운로드 처리 결과 반환

### POST common/BCProjectForm/pmTableUpLoad5
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청한 데이터 업로드 처리 결과 반환

---
## BCSysDeptManager API 명세서
### POST common/BCSysDeptManager/pmDeptAdd
#### 파라미터 정보
- requestData : 신규 부서 추가 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 부서 추가 결과 정보

### POST common/BCSysDeptManager/pmDeptDel
#### 파라미터 정보
- requestData : 삭제할 부서 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 부서 삭제 결과 정보

### POST common/BCSysDeptManager/pmDeptInqList
#### 파라미터 정보
- requestData : 부서 목록 조회에 필요한 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 부서 목록 정보

### POST common/BCSysDeptManager/pmDeptDetail
#### 파라미터 정보
- requestData : 부서 상세 조회에 필요한 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 부서 상세 정보

### POST common/BCSysDeptManager/pmGridSave
#### 파라미터 정보
- requestData : 그리드 데이터 저장에 필요한 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 그리드 데이터 저장 결과 정보

### POST common/BCSysDeptManager/pmHelpSave
#### 파라미터 정보
- requestData : 헬프 정보 저장에 필요한 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 헬프 정보 저장 결과 정보 

### POST common/BCSysDeptManager/pmHelpDelete
#### 파라미터 정보
- requestData : 헬프 정보 삭제에 필요한 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 헬프 정보 삭제 결과 정보 

### POST common/BCSysDeptManager/pmExcelDownload
#### 파라미터 정보
- requestData : 엑셀 파일 다운로드에 필요한 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (File Download)
- 다운로드 파일 정보

### POST common/BCSysDeptManager/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 파일 업로드에 필요한 정보를 담은 데이터셋
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 엑셀 파일 업로드 결과 정보

---
## BCProjectAdditionalInfo API 명세서
### POST /common/BCProjectAdditionalInfo/pmProjectListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 리스트 조회 결과

### POST /common/BCProjectAdditionalInfo/pmProjectInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 특정 프로젝트 조회 결과

### POST /common/BCProjectAdditionalInfo/pmGetprjAdditionalInfo
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 프로젝트 추가 정보 조회 결과

### POST /common/BCProjectAdditionalInfo/pmProjectUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (JSON)
- 프로젝트 업데이트 결과

### POST /common/BCProjectAdditionalInfo/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 엑셀 파일 업로드 결과

### POST /common/BCProjectAdditionalInfo/pmExcelDownloadAll
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 
#### 응답 (FILE)
- 엑셀 파일 다운로드 결과

### POST /common/BCProjectAdditionalInfo/pmGetLevelList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 레벨 리스트 정보 결과

---
## BCSitePgmMappingRetrieve API 명세서
이 API는 BCSitePgmMappingRetrieve 기능을 수행하기 위한 API 입니다.

### POST /common/BCSitePgmMappingRetrieve/pmLabelAddForMapping
#### 파라미터 정보
- requestData : 레이블 추가를 위한 요청 데이터입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 라벨 추가 결과에 대한 데이터를 반환합니다.

### POST /common/BCSitePgmMappingRetrieve/pmLabelInqForMapping
#### 파라미터 정보
- requestData : 레이블 조회를 위한 요청 데이터입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 라벨 조회 결과에 대한 데이터를 반환합니다.

### POST /common/BCSitePgmMappingRetrieve/pmExcelDown
#### 파라미터 정보
- requestData : 엑셀 다운로드를 위한 요청 데이터입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (DownloadView)
- 요청한 엑셀 파일을 다운로드합니다.

### POST /common/BCSitePgmMappingRetrieve/pmLabelDel
#### 파라미터 정보
- requestData : 레이블 삭제를 위한 요청 데이터입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 라벨 삭제 결과에 대한 데이터를 반환합니다.

### POST /common/BCSitePgmMappingRetrieve/pmExcelUpload
#### 파라미터 정보
- requestData : 엑셀 업로드를 위한 요청 데이터입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 엑셀 업로드 결과에 대한 데이터를 반환합니다.

### POST /common/BCSitePgmMappingRetrieve/pmLabelAdd
#### 파라미터 정보
- requestData : 레이블 추가를 위한 요청 데이터입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 라벨 추가 결과에 대한 데이터를 반환합니다.

### POST /common/BCSitePgmMappingRetrieve/pmLabelInq
#### 파라미터 정보
- requestData : 레이블 조회를 위한 요청 데이터입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 라벨 조회 결과에 대한 데이터를 반환합니다.
---
## BCLicenseManager2Controller API 명세서

### POST common/BCLicenseManager2/pmLicenseFileDown
#### 파라미터 정보
- requestData : 파일 다운로드에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 파일 다운로드 View를 반환합니다.

### POST common/BCLicenseManager2/pmLicenseHistoryListInq
#### 파라미터 정보
- requestData : 라이센스 히스토리 리스트 조회에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 라이센스 히스토리 리스트를 반환합니다.

### POST common/BCLicenseManager2/pmCreateLicense
#### 파라미터 정보
- requestData : 라이센스 생성에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 라이센스 생성 결과를 반환합니다.

### POST common/BCLicenseManager2/pmImportLicense
#### 파라미터 정보
- requestData : 라이센스 추가에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 추가된 라이센스의 파일 다운로드 View를 반환합니다.

### POST common/BCLicenseManager2/pmLicenseUserselect
#### 파라미터 정보
- requestData : 사용자 라이센스 선택에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 사용자 라이센스 선택 결과를 반환합니다.

### POST common/BCLicenseManager2/pmLicenseHistoryListInq_for_project
#### 파라미터 정보
- requestData : 프로젝트별 라이센스 히스토리 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 프로젝트별 라이센스 히스토리 리스트를 반환합니다.

### POST common/BCLicenseManager2/pmLicenseHistoryListInq_for_ip
#### 파라미터 정보
- requestData : IP별 라이센스 히스토리 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- IP별 라이센스 히스토리 리스트를 반환합니다.

### POST common/BCLicenseManager2/pmLicenseInq
#### 파라미터 정보
- requestData : 라이센스 정보 조회를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 라이센스 정보를 반환합니다.

### POST common/BCLicenseManager2/pmLicenseDel
#### 파라미터 정보
- requestData : 라이센스 삭제를 위한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 라이센스 삭제 결과를 반환합니다.
---
## BCSystemStatisticsController API 명세서
### POST common/BCSystemStatistics/pmGetList
#### 파라미터 정보
- requestData : 요청 데이터 세트입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 시스템 통계의 리스트 정보를 반환합니다.

### POST common/BCSystemStatistics/pmGetTabsInfo
#### 파라미터 정보
- requestData : 요청 데이터 세트입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 시스템 통계의 탭 정보를 반환합니다.

### POST common/BCSystemStatistics/pmGetColumnsInfo
#### 파라미터 정보
- requestData : 요청 데이터 세트입니다.
- onlineCtx : 온라인 컨텍스트 정보입니다.
#### 응답 (JSON)
- 시스템 통계의 컬럼 정보를 반환합니다.
---
## BCOperationManager API 명세서
### POST /common/BCOperationManager/pmMessengerAlarmSettingTestConnection
#### 파라미터 정보
- requestData : 메신저 알람 설정 테스트 연결 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 메신저 알람 설정 테스트 연결 결과

### POST /common/BCOperationManager/pmNcpInfoAdd
#### 파라미터 정보
- requestData : NCP 정보 추가 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- NCP 정보 추가 결과

### POST /common/BCOperationManager/pmSvnConfigInq
#### 파라미터 정보
- requestData : SVN 설정 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- SVN 설정 조회 결과

### POST /common/BCOperationManager/pmSvnConfigUpd
#### 파라미터 정보
- requestData : SVN 설정 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- SVN 설정 업데이트 결과

### POST /common/BCOperationManager/pmSvnTestConnection
#### 파라미터 정보
- requestData : SVN 테스트 연결 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- SVN 테스트 연결 결과

이하 동일한 형식으로 API 명세가 진행됩니다.
---
## BCMyWorkController API 명세서
### POST /common/BCMyWork/pmProgramDel
#### 파라미터 정보
- IDataSet requestData : 프로그램 삭제에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 프로그램 삭제 결과 정보


### POST /common/BCMyWork/pmProgramUpd
#### 파라미터 정보
- IDataSet requestData : 프로그램 업데이트에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 프로그램 업데이트 결과 정보


### POST /common/BCMyWork/pmProgramInq
#### 파라미터 정보
- IDataSet requestData : 프로그램 조회에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 프로그램 조회 결과 정보


### POST /common/BCMyWork/pmProgramAdd
#### 파라미터 정보
- IDataSet requestData : 프로그램 등록에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 프로그램 등록 결과 정보


### POST /common/BCMyWork/pmProgramListInq
#### 파라미터 정보
- IDataSet requestData : 프로그램 목록 조회에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 프로그램 목록 조회 결과 정보


### POST /common/BCMyWork/pmExcelDataAllDownload 
#### 파라미터 정보
- IDataSet requestData : 엑셀 데이터 전체 다운로드에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (DownloadView)
- 다운로드할 엑셀 데이터 파일 명세 정보

### POST /common/BCMyWork/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData : 엑셀 데이터 업로드에 필요한 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (IDataSet)
- 엑셀 데이터 업로드 결과 정보

---
## BCSharedIPCheckController API 명세서
### POST /common/SharedIPCheck/fmIpCheckFileSelect
#### 파라미터 정보
- requestData : IP 확인 파일 선택에 필요한 데이터 요청
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- IP 확인 파일 선택 서비스 결과

---
## BCIFProjectSiteManager API 명세서
### POST common/BCIFProjectSiteManager/pmSystemCodeManagerCodeExcelDownload
#### 파라미터 정보
- IDataSet requestData : 시스템 코드 관리 요청 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (DownloadView)
- excelFileNm에 해당하는 파일 다운로드

### POST common/BCIFProjectSiteManager/pmSystemCodeManagerGroupExcelDownload
#### 파라미터 정보
- IDataSet requestData : 시스템 코드 관리 요청 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (DownloadView)
- excelFileNm에 해당하는 파일 다운로드

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerCodeExcelUpload
#### 파라미터 정보
- IDataSet requestData : 시스템 코드 관리 엑셀 업로드 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 엑셀 업로드 처리 결과

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerLUpd
#### 파라미터 정보
- IDataSet requestData : 가져올 시스템 코드 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 업데이트된 시스템 코드

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerListInq
#### 파라미터 정보
- IDataSet requestData : 가져올 시스템 코드 리스트 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 시스템 코드 리스트

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerAdd
#### 파라미터 정보
- IDataSet requestData : 추가할 시스템 코드 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 추가된 시스템 코드 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerDel
#### 파라미터 정보
- IDataSet requestData : 삭제할 시스템 코드 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 삭제된 시스템 코드 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerExcelUpload
#### 파라미터 정보
- IDataSet requestData : 업로드할 시스템 코드 엑셀 데이터
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 엑셀 업로드 결과 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeManagerInq
#### 파라미터 정보
- IDataSet requestData : 조회할 시스템 코드 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 조회된 시스템 코드 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerCodeListInq
#### 파라미터 정보
- IDataSet requestData : 조회할 시스템 코드 리스트 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 조회된 시스템 코드 리스트 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeManagerCodeInq
#### 파라미터 정보
- IDataSet requestData : 조회할 시스템 코드 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 조회된 시스템 코드 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerCodeAdd
#### 파라미터 정보
- IDataSet requestData : 추가할 시스템 코드 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 추가된 시스템 코드 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerCodeLUpd
#### 파라미터 정보
- IDataSet requestData : 변경할 시스템 코드 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 변경된 시스템 코드 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerCodeDel
#### 파라미터 정보
- IDataSet requestData : 삭제할 시스템 코드 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 삭제된 시스템 코드 정보

### POST common/BCIFProjectSiteManager/pmSiteProjectDel
#### 파라미터 정보
- IDataSet requestData : 삭제할 프로젝트 사이트 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 삭제된 프로젝트 사이트 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerListInqSelect01
#### 파라미터 정보
- IDataSet requestData : 조회할 시스템 코드 리스트 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 조회된 시스템 코드 리스트 정보

### POST common/BCIFProjectSiteManager/pmSystemCodeMangerListInqPopup01
#### 파라미터 정보
- IDataSet requestData : 조회할 팝업 시스템 코드 리스트 정보
- IOnlineContext onlineCtx : 온라인 상황 정보
#### 응답 (IDataSet)
- 조회된 팝업 시스템 코드 리스트 정보
---
## BCBacklogRegController API 명세서
### POST /common/bcbacklogreg/pmIssueDefectManagementDel
#### 파라미터 정보
- requestData: 이슈나 결함과 관련된 제거를 위한 정보를 포함하는 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 또는 결함 관리 정보 조회 서비스의 삭제 결과를 반환

### POST /common/bcbacklogreg/pmIssueDefectManagementUpd
#### 파라미터 정보
- requestData: 이슈나 결함과 관련된 업데이트를 위한 정보를 포함하는 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 또는 결함 관리 정보 조회 서비스의 업데이트 결과를 반환

### POST /common/bcbacklogreg/pmImageInq
#### 파라미터 정보
- requestData: 이미지 조회를 위한 정보를 포함하는 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이미지 조회 결과를 반환

...

### POST /common/bcbacklogreg/pmMaxStatus
#### 파라미터 정보
- requestData: 최대 상태 조회를 위한 정보를 포함하는 데이터셋
- onlineCtx: 온라인 컨텍스트 정보
#### 응답 (JSON)
- 최대 상태 조회 결과를 반환  

주의: 위 API 명세서는 전체 메소드를 다 다루지 않았으며, 나머지 메소드들에 대해서는 같은 방식으로 명세를 작성할 수 있습니다.
---
## BCTailoringChgDelReason API 명세서

### POST /common/BCTailoringChgDelReason/pmGetSubProjectList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브 프로젝트 리스트를 반환

### POST /common/BCTailoringChgDelReason/pmGetWBS
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Work Breakdown Structure 정보를 반환

### POST /common/BCTailoringChgDelReason/pmExcelDown
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File Download View)
- 엑셀 파일 다운로드

### POST /common/BCTailoringChgDelReason/pmTailoringUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Tailoring 업데이트 결과 반환

### POST /common/BCTailoringChgDelReason/pmTailoringIns
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Tailoring 생성 결과 반환

### POST /common/BCTailoringChgDelReason/pmTailoringDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Tailoring 삭제 결과 반환

### POST /common/BCTailoringChgDelReason/pmLinkProductGridUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 링크된 제품 그리드 업데이트 결과 반환

### POST /common/BCTailoringChgDelReason/pmLinkProductGridDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 링크된 제품 그리드 삭제 결과 반환

### POST /common/BCTailoringChgDelReason/pmGetLevelList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 레벨 리스트를 반환
---
## BCLabelManager API 명세서
### POST /common/BCLabelManager/pmExcelDown
#### 파라미터 정보
- requestData : excel 파일 관련 요청 데이터
- onlineCtx : online service context 정보
#### 응답 (DownloadView)
- 엑셀 파일 다운로드 뷰 반환

### POST /common/BCLabelManager/pmLabelDel
#### 파라미터 정보
- requestData : 라벨 삭제 정보 요청 데이터
- onlineCtx : online service context 정보
#### 응답 (IDataSet)
- 라벨 삭제 결과 데이터 반환

### POST /common/BCLabelManager/pmExcelUpload
#### 파라미터 정보
- requestData : excel 파일 업로드 관련 요청 데이터
- onlineCtx : online service context 정보
#### 응답 (IDataSet)
- 엑셀 파일 업로드 결과 데이터 반환

### POST /common/BCLabelManager/pmLabelAdd
#### 파라미터 정보
- requestData : 새 라벨 관련 요청 데이터
- onlineCtx : online service context 정보
#### 응답 (IDataSet)
- 새 라벨 추가 결과 데이터 반환

### POST /common/BCLabelManager/pmLabelInq
#### 파라미터 정보
- requestData : 라벨 조회 요청 데이터
- onlineCtx : online service context 정보
#### 응답 (IDataSet)
- 라벨 조회 결과 데이터 반환

---
## BCGroupRoleManagerController API 명세서
### POST /common/BCGroupRoleManager/pmSystemGroupRoleListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 시스템 그룹 롤 리스트 조회

### POST /common/BCGroupRoleManager/pmGroupRoleListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 그룹 롤 리스트 조회

### POST /common/BCGroupRoleManager/pmGroupRoleUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 그룹 롤 업데이트

### POST /common/BCGroupRoleManager/pmExcelDown
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (DownloadView)
- 엑셀 다운로드

### POST /common/BCGroupRoleManager/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 엑셀 업로드

### POST /common/BCGroupRoleManager/pmProjectAllCopy
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 프로젝트 전체 복사
---
## BCGroupManagerController API 명세서

### POST /common/BCGroupManager/pmGroupInqList
#### 파라미터 정보
- requestBody (IDataSet) : 부하 측정 그룹 목록을 요청하는 데이터
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 부하 측정 그룹 목록 정보 반환

### POST /common/BCGroupManager/pmGroupAdd
#### 파라미터 정보
- requestBody (IDataSet) : 부하 측정 그룹 추가 요청 데이터
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 부하 측정 그룹 추가 성공 여부 반환

### POST /common/BCGroupManager/pmGroupDel
#### 파라미터 정보
- requestBody (IDataSet) : 부하 측정 그룹 삭제 요청 데이터
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 부하 측정 그룹 삭제 성공 여부 반환

### POST /common/BCGroupManager/pmGroupInq
#### 파라미터 정보
- requestBody (IDataSet) : 부하 측정 그룹 조회 요청 데이터
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 부하 측정 그룹 상세 정보 반환

### POST /common/BCGroupManager/pmGroupUpd
#### 파라미터 정보
- requestBody (IDataSet) : 부하 측정 그룹 업데이트 요청 데이터
- onlineCtx (IOnlineContext) : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 부하 측정 그룹 업데이트 성공 여부 반환
---
## BCMenuProjectManager API 명세서
### POST common/BCMenuProjectManager/pmMenuProjectUpd
#### 파라미터 정보
- requestData : 프로젝트 메뉴 업데이트 데이터가 포함된 객체
- onlineCtx : 온라인 컨텍스트에 대한 정보가 포함된 객체

#### 응답 (IDataSet)
- 서비스로부터 반환받은 처리 결과를 담은 객체를 반환합니다.

### POST common/BCMenuProjectManager/pmMenuProjectInqList
#### 파라미터 정보
- requestData : 프로젝트 메뉴 조회 리스트 데이터가 포함된 객체
- onlineCtx : 온라인 컨텍스트에 대한 정보가 포함된 객체

#### 응답 (IDataSet)
- 서비스로부터 반환받은 처리 결과를 담은 객체를 반환합니다.
---
## BCMenuManager API 명세서
### POST /common/BCMenuManager/pmMenuInqList
#### 파라미터 정보
- requestData(IDataSet) : 메뉴 조회를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmMenuUpd
#### 파라미터 정보
- requestData(IDataSet) : 메뉴 업데이트를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmMenuInq
#### 파라미터 정보
- requestData(IDataSet) : 메뉴 조회를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmMenuDel
#### 파라미터 정보
- requestData(IDataSet) : 메뉴 삭제를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmMenuAdd
#### 파라미터 정보
- requestData(IDataSet) : 메뉴 추가를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체


### POST /common/BCMenuManager/pmTopMenuInq
#### 파라미터 정보
- requestData(IDataSet) : 상단 메뉴 조회를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmLeftMenuInq
#### 파라미터 정보
- requestData(IDataSet) : 왼쪽 메뉴 조회를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmProjectAllCopy
#### 파라미터 정보
- requestData(IDataSet) : 프로젝트 전체 복사를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmGetGuideNote
#### 파라미터 정보
- requestData(IDataSet) : 가이드 노트 가져오기를 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

### POST /common/BCMenuManager/pmSetGuideNote
#### 파라미터 정보
- requestData(IDataSet) : 가이드 노트 설정을 위한 요청 데이터
- onlineCtx(IOnlineContext) : 온라인 콘텍스트

#### 응답 (JSON)
- 서비스에서 응답한 IDataSet 객체

---
## BCVacationPlan API 명세서
### POST /scope/BCVacationPlan/pmRequirementsScopeExcelUpload
#### 파라미터 정보
- requestData : 필요요건 범위 엑셀 업로드에 필요한 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 엑셀 업로드 결과를 반환

### POST /scope/BCVacationPlan/pmRequirementsScopeFileListInq
#### 파라미터 정보
- requestData : 필요요건 범위 파일 조회에 필요한 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 파일 목록 조회 결과를 반환

### POST /scope/BCVacationPlan/pmRequirementsScopeObjectUseYN
#### 파라미터 정보
- requestData : 백로그 사용 여부를 결정하는 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 백로그 사용 여부 결과를 반환

### POST /scope/BCVacationPlan/pmRequirementsScopeObjectUseYNSel
#### 파라미터 정보
- requestData : 백로그 사용 여부를 선택하는 데이터
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 백로그 사용 여부 선택 결과를 반환

### POST /scope/BCVacationPlan/pmRequirementsScopeExcelDownload
#### 파라미터 정보
- requestData : 엑셀 다운로드를 위한 필요한 요건
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 엑셀 다운로드 결과를 반환

### POST /scope/BCVacationPlan/pmVacationScopeUpd
#### 파라미터 정보
- requestData : 휴가 범위 수정에 필요한 요건
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 휴가 범위 수정 결과를 반환

### POST /scope/BCVacationPlan/pmVacationScopeAdd
#### 파라미터 정보
- requestData : 휴가 범위 추가에 필요한 요건
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 휴가 범위 추가 결과를 반환

### POST /scope/BCVacationPlan/pmVacationScopeListInq
#### 파라미터 정보
- requestData : 휴가 범위 목록 조회에 필요한 요건
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 휴가 범위 목록 조회 결과를 반환

### POST /scope/BCVacationPlan/pmRequirementsScopeFileDel
#### 파라미터 정보
- requestData : 파일 삭제를 위한 요건 
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 파일 삭제 결과를 반환

### POST /scope/BCVacationPlan/pmVacationScopeDel
#### 파라미터 정보
- requestData : 휴가 범위 삭제를 위한 요건
- onlineCtx : 온라인 콘텍스트 정보
#### 응답 (JSON)
- 휴가 범위 삭제 결과를 반환

---
## BCStateSys API 명세서

### POST /kanban/BCStateSys/pmStateSubmit
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmStateDelete
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmStateList
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmCategoryNmList
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmStateMax
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmStateCnt
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmStateDetailList
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmStateDetailCnt
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

### POST /kanban/BCStateSys/pmIssueList
#### 파라미터 정보
- requestData : API 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 결과 데이터셋

---
## BCCategorySys API 명세서
### POST /kanban/BCCategorySys/pmCategorySubmit
#### 파라미터 정보
- requestData : 개인정보 및 카테고리 정보에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 카테고리 정보의 수정 결과

### POST /kanban/BCCategorySys/pmCategoryDelete
#### 파라미터 정보
- requestData : 개인정보 및 카테고리 정보에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 카테고리의 삭제 결과

### POST /kanban/BCCategorySys/pmCategoryList
#### 파라미터 정보
- requestData : 개인정보 및 카테고리 정보에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 카테고리 목록의 조회 결과

### POST /kanban/BCCategorySys/pmCategoryMax
#### 파라미터 정보
- requestData : 개인정보 및 카테고리 정보에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 카테고리 최대값 조회 결과

### POST /kanban/BCCategorySys/pmCategoryAddList
#### 파라미터 정보
- requestData : 개인정보 및 카테고리 정보에 대한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 카테고리 추가 목록 조회 결과
---
## BCCategory API 명세서
### POST /kanban/BCCategory/pmCategorySubmit
#### 파라미터 정보
- requestdata : 요청에 대한 정보와 데이터
- IOnlineContext : 온라인 컨텍스트 객체
#### 응답 (IDataSet)
- 카테고리 제출에 대한 응답 정보를 포함

### POST /kanban/BCCategory/pmCategoryDelete
#### 파라미터 정보
- requestdata : 요청에 대한 정보와 데이터
- IOnlineContext : 온라인 컨텍스트 객체
#### 응답 (IDataSet)
- 카테고리 삭제에 대한 응답 정보를 포함

### POST /kanban/BCCategory/pmCategoryList
#### 파라미터 정보
- requestdata : 요청에 대한 정보와 데이터
- IOnlineContext : 온라인 컨텍스트 객체
#### 응답 (IDataSet)
- 카테고리 리스트에 대한 응답 정보를 포함

### POST /kanban/BCCategory/pmCategoryMax
#### 파라미터 정보
- requestdata : 요청에 대한 정보와 데이터
- IOnlineContext : 온라인 컨텍스트 객체
#### 응답 (IDataSet)
- 카테고리 최대값에 대한 응답 정보를 포함

### POST /kanban/BCCategory/pmCategoryAddList
#### 파라미터 정보
- requestdata : 요청에 대한 정보와 데이터
- IOnlineContext : 온라인 컨텍스트 객체
#### 응답 (IDataSet)
- 카테고리 추가 리스트에 대한 응답 정보를 포함
---
## BCBacklogBoardController API 명세서
이 API 명세서는 `BCBacklogBoardController`의 각 요청에 대한 설명을 나열하고 있습니다.

### POST /kanban/DUBacklogBoard/pmGeKbList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmGetGhList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmBlUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmBlUpd02
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmBlUpd03
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmBacklogList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmBindSearchTypes
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmBindSearchType02s
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmGetSt2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과

### POST /kanban/DUBacklogBoard/pmGetSt3
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 요청 데이터와 온라인 컨텍스트에 따른 결과
---
## BCWorkFlowSys API 명세서

### POST kanban/BCWorkFlowSys/pmWASubmit
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 작업 신청 결과 반환

### POST kanban/BCWorkFlowSys/pmWADelete
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 작업 삭제 결과 반환

### POST kanban/BCWorkFlowSys/pmWAListSetting
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 작업 리스트 설정 결과 반환

### POST kanban/BCWorkFlowSys/pmIssueDetailWAList
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 이슈 상세 작업 리스트 반환

### POST kanban/BCWorkFlowSys/pmStateNameList
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 상태 이름 리스트 반환

### POST kanban/BCWorkFlowSys/pmWAListSettingDetail
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 작업 리스트 상세 설정 결과 반환

### POST kanban/BCWorkFlowSys/pmWorkflowMax
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 최대 작업 흐름 반환

### POST kanban/BCWorkFlowSys/pmAuthoNameList
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 인증 이름 리스트 반환

### POST kanban/BCWorkFlowSys/pmWorkflowDelete
#### 파라미터 정보
- IDataSet requestData : 서비스 요청 데이터 셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- 작업 흐름 삭제 결과 반환
---
## BCState API 명세서
### POST /kanban/BCState/pmStateSubmit
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmStateDelete
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmStateList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmCategoryNmList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmStateMax
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmStateCnt
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmStateDetailList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmStateDetailCnt
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환

### POST /kanban/BCState/pmIssueList
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 처리결과 반환
---
## VelocityController2 API 명세서
### GET kanban/velocity2/getList
#### 파라미터 정보
- param : 메소드가 호출되면 전달되는 파라미터 값. Map 타입의 모든 데이터를 포함할 수 있습니다.

#### 응답 (JSON)
- VelocityService2의 getList 메소드를 호출하여 얻은 결과. Map<String, Object> 형태의 데이터가 반환됩니다.

### 에러 처리
#### SQL 에러
- 발생하는 SQL 에러에 대해 로그를 기록하고, "SQL ERROR" 메시지와 함께 정보를 반환합니다.

#### 기타 에러
- 기타 발생하는 모든 에러에 대해 로그를 기록하고, "system error" 메시지와 함께 정보를 반환합니다. 상세 에러 내용은 서버의 에러 로그를 확인하실 수 있습니다.
---
## KanbanController API 명세서
### GET /kanban/board/geKbList
#### 파라미터 정보
- param : Kanban 상태 조회에 필요한 정보를 담은 맵 객체입니다.
#### 응답 (JSON)
- Kanban 상태 정보를 담은 맵 객체를 반환합니다.

### GET /kanban/board/geGhList
#### 파라미터 정보
- param : Kanban 상태 조회에 필요한 정보를 담은 맵 객체입니다.
#### 응답 (JSON)
- Kanban 상태 정보를 담은 맵 객체를 반환합니다.
---
## Kanban BurnDown API 명세서
### GET /kanban/burndown/getDailyList
#### 파라미터 정보
- param (Map<String, Object>) : 요청 정보를 포함한 맵 파라미터
#### 응답 (List<Map<String, Object>>)
- 일일 목록에 대한 정보

### GET /kanban/burndown/getWeeklyList
#### 파라미터 정보
- param (Map<String, Object>) : 요청 정보를 포함한 맵 파라미터
#### 응답 (List<Map<String, Object>>)
- 주간 목록에 대한 정보

### GET /kanban/burndown/getMonthlyList
#### 파라미터 정보
- param (Map<String, Object>) : 요청 정보를 포함한 맵 파라미터
#### 응답 (List<Map<String, Object>>)
- 월간 목록에 대한 정보

### POST /kanban/burndown/register
#### 파라미터 정보
- param (Map<String, Object>) : 등록 정보를 포함한 맵 파라미터
- session (HttpSession) : 현재 세션 정보
#### 응답 (null)
- 등록 성공시, 응답은 없음. 

### 오류응답
- SQL 오류 발생 : "SQL ERROR"
- 시스템 오류 발생 : "system error" 

---
## BackLogController2 API 명세서
### GET /kanban/backlog2/getTestList
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (List<Map<String, Object>>)
- 테스트 리스트 정보를 반환

### GET /kanban/backlog2/getList
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (List<Map<String, Object>>)
- 리스트 정보를 반환

### GET /kanban/backlog2/agBackLogInit
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (List<Map<String, Object>>)
- Backlog 초기화 관련 정보를 반환

### GET /kanban/backlog2/agBackScJira
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (List<Map<String, Object>>)
- Jira와 연동의 정보를 반환

### GET /kanban/backlog2/agBackScTy
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (List<Map<String, Object>>)
- 물품 유형 관련 정보를 반환

### GET /kanban/backlog2/agBackCommon
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (Map<String, Object>)
- 공통 정보를 반환

### GET /kanban/backlog2/geAgtList
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (Map<String, Object>)
- 에이전트 리스트 정보를 반환

### GET /kanban/backlog2/agBackLogList
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
- modelMap : 모델 맵
#### 응답 (ModelAndView)
- ag 백로그 리스트 페이지로 이동

### GET /kanban/backlog2/get
#### 파라미터 정보
- param : 클라이언트가 보낸 요청 정보
#### 응답 (Map<String, Object>)
- 상세 정보를 반환

### Exception /kanban/backlog2
#### 파라미터 정보
- e(Exception) : 예외 정보
#### 응답 (ResponseData<String>)
- 에러 메시지를 반환
---
## Kanban WorkValue API 명세서
### GET /kanban/workvalue2/getDailyList
#### 파라미터 정보
- param : 일별로 필요한 파라미터 정보를 구성한 맵

#### 응답 (JSON)
- 일별 업무 리스트 정보를 반환

### GET /kanban/workvalue2/getWeeklyList
#### 파라미터 정보
- param : 주별로 필요한 파라미터 정보를 구성한 맵

#### 응답 (JSON)
- 주별 업무 리스트 정보를 반환

### GET /kanban/workvalue2/getMonthlyList
#### 파라미터 정보
- param : 월별로 필요한 파라미터 정보를 구성한 맵

#### 응답 (JSON)
- 월별 업무 리스트 정보를 반환

### POST /kanban/workvalue2/register
#### 파라미터 정보
- param : 업무를 등록하기 위한 파라미터 정보를 구성한 맵
- session : 사용자의 세션 정보

#### 응답 (JSON)
- 등록 액션이 성공적으로 처리되면, null

### POST /kanban/workvalue2/dbError
#### 파라미터 정보
- e : 발생한 예외

#### 응답 (JSON)
- SQL ERROR가 발생하면 해당 메세지 반환

### POST /kanban/workvalue2/defaultException
#### 파라미터 정보
- e : 발생한 예외

#### 응답 (JSON)
- 시스템 오류가 발생하면 해당 메세지 반환

---
## BCBackLogList API 명세서
### POST /kanban/BCBackLogList/pmGetBackLogList
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext) 
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmGetTailoringListProduct
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmExcelDown
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (File Download)
- 엑셀 파일 다운로드

### POST /kanban/BCBackLogList/pmExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmTailoringUpd
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmTailoringIns
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmTailoringDel
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmLinkProductGridUpd
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmLinkProductGridDel
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환

### POST /kanban/BCBackLogList/pmGetLevelList
#### 파라미터 정보
- requestData : 요청 데이터(IDataSet)
- onlineCtx : 온라인 컨텍스트(IOnlineContext)
#### 응답 (JSON)
- 요청된 requestData와 onlineCtx에 해당하는 데이터를 반환
---
## BCWorkFlow API 명세서

### POST /kanban/BCWorkFlow/pmWASubmit
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 작업결과 반환

### POST /kanban/BCWorkFlow/pmWADelete
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 삭제결과 반환

### POST /kanban/BCWorkFlow/pmWAListSetting
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 리스트설정 결과 반환

### POST /kanban/BCWorkFlow/pmIssueDetailWAList
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 세부이슈리스트 반환

### POST /kanban/BCWorkFlow/pmStateNameList
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 상태이름 리스트 반환

### POST /kanban/BCWorkFlow/pmWAListSettingDetail
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 리스트설정 세부정보 반환

### POST /kanban/BCWorkFlow/pmWorkflowMax
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 워크플로우 최대값 반환

### POST /kanban/BCWorkFlow/pmAuthoNameList
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 인증 이름 리스트 반환

### POST /kanban/BCWorkFlow/pmWorkflowDelete
#### 파라미터 정보
- requestData : 전송된 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- Process의 워크플로우 삭제결과 반환

---
## BCMultiBoardManager API 명세서

### POST /sample/BCMultiBoardManager/pmFileDownloadFromSVN
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터 

### POST /sample/BCMultiBoardManager/pmCheckOutDownloadHistAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터 

### POST /sample/BCMultiBoardManager/pmSvnGetLastRevision
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터 

### POST /sample/BCMultiBoardManager/pmMultiBoardManagerReplyAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터 

### POST /sample/BCMultiBoardManager/pmMultiBoardManagerCommentAdd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터 

### POST /sample/BCMultiBoardManager/pmMultiBoardXmlFormDataNoti
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터 

### POST /sample/BCMultiBoardManager/pmMultiBoardManagerReplyInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터 

### POST /sample/BCMultiBoardManager/pmMultiBoardManagerHitsUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터
...
  
### POST /sample/BCMultiBoardManager/pmStatusCdInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 서비스 결과 데이터

### 이외에도 /sample/BCMultiBoardManager라는 엔드포인트 주소를 뒤에 메소드 이름을 붙여 사용하게 되면 각 메소드의 기능과 반환값을 얻을 수 있습니다.

---
## BCExercise API 명세서
### POST /sample/BCExercise/pmGetExerciseList
#### 파라미터 정보
- requestData : 요청 정보가 포함된 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보가 포함된 IOnlineContext 객체
#### 응답 (JSON)
- 요청한 정보에 따른 운동 리스트를 반환

### POST /sample/BCExercise/pmInsertExerciseData
#### 파라미터 정보
- requestData : 삽입할 정보가 포함된 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보가 포함된 IOnlineContext 객체
#### 응답 (JSON)
- 삽입된 운동 데이터 반환

### POST /sample/BCExercise/pmUpdateExerciseData
#### 파라미터 정보
- requestData : 수정할 정보가 포함된 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보가 포함된 IOnlineContext 객체
#### 응답 (JSON)
- 갱신된 운동 데이터 반환

### POST /sample/BCExercise/pmDeleteExerciseData
#### 파라미터 정보
- requestData : 삭제할 정보가 포함된 IDataSet 객체
- onlineCtx : 온라인 컨텍스트 정보가 포함된 IOnlineContext 객체
#### 응답 (JSON)
- 삭제된 운동 데이터 반환
---
## BCCardUseMgr API 명세서
### POST /sample/BCCardUseMgr/pmProjectService
#### 파라미터 정보
- requestData : 서비스 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청한 프로젝트 서비스 관련된 데이터를 반환합니다.

### POST /sample/BCCardUseMgr/pmProjectServiceSimple
#### 파라미터 정보
- requestData : 서비스 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 요청한 프로젝트 서비스 관련된 단순화된 데이터를 반환합니다.

### POST /sample/BCCardUseMgr/pmAutoPageExcelUpload
#### 파라미터 정보
- requestData : 서비스 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 엑셀 파일 업로드와 관련된 서비스를 제공하고, 업로드 결과에 따른 데이터를 반환합니다.

### POST /sample/BCCardUseMgr/pmAutoPage
#### 파라미터 정보
- requestData : 서비스 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 자동 페이지와 관련된 데이터를 반환합니다.

### POST /sample/BCCardUseMgr/pmAutoPageExcelDownload
#### 파라미터 정보
- requestData : 서비스 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (FILE)
- 엑셀 다운로드 서비스를 제공하고, 다운로드할 파일의 정보를 반환합니다.
---
## BCVacation API 명세서
### POST /sample/BCVacation/pmGetVacationList
#### 파라미터 정보
- IDataSet requestData : 사용자로부터 받은 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 휴가 리스트 정보 반환

### POST /sample/BCVacation/pmInsertVacationData
#### 파라미터 정보
- IDataSet requestData : 사용자로부터 받은 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 휴가 정보 입력 결과 반환

### POST /sample/BCVacation/pmUpdateVacationData
#### 파라미터 정보
- IDataSet requestData : 사용자로부터 받은 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 휴가 정보 수정 결과 반환

### POST /sample/BCVacation/pmDeleteVacationData
#### 파라미터 정보
- IDataSet requestData : 사용자로부터 받은 요청 데이터
- IOnlineContext onlineCtx : 사용자 세션 정보
#### 응답 (JSON)
- 휴가 정보 삭제 결과 반환

---
## BCUserProjManagerController API 명세서
### POST /sample/BCUserPrjManager/pmUserGroupCode
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 그룹 코드 정보

### POST /sample/BCUserPrjManager/pmUserLevelCode
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 레벨 코드 정보

### POST /sample/BCUserPrjManager/pmUserPostCode
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 포스트 코드 정보

### POST /sample/BCUserPrjManager/pmUserRoleCode
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 역할 코드 정보

### POST /sample/BCUserPrjManager/pmUserExcelDownload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (파일)
- 사용자 정보 엑셀 파일 다운로드

### POST /sample/BCUserPrjManager/pmUserExcelUpload
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 엑셀 파일 업로드 결과 정보

### POST /sample/BCUserPrjManager/pmUserNameCheck
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자명 검증 결과 정보

### POST /sample/BCUserPrjManager/pmUserProjectHistory
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 프로젝트 이력 정보

### POST /sample/BCUserPrjManager/pmUserTBDChange
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 TBD 변경 결과 정보

### POST /sample/BCUserPrjManager/pmProjectUserListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 프로젝트 사용자 목록 조회 결과 정보

### POST /sample/BCUserPrjManager/pmUserListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 목록 조회 결과 정보

### POST /sample/BCUserPrjManager/pmUserDel
#### 파라미터 정보
- IDataSet requestData : 요청 데이터 세트
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보(사용자, 요청, 세션 등의 정보를 포함)

#### 응답 (JSON)
- 사용자 삭제 결과 정보

... 이와 같은 패턴으로 계속.
---
## BCUserManager API 명세서
### POST /sample/BCUserManager/pmUserGroupCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 사용자 그룹 코드 조회

### POST /sample/BCUserManager/pmUserLevelCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 사용자 레벨 코드 조회

### POST /sample/BCUserManager/pmUserPostCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 사용자 게시물 코드 조회

### POST /sample/BCUserManager/pmUserRoleCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 사용자 역할 코드 조회

### POST /sample/BCUserManager/pmUserExcelDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (DownloadView)
- 사용자 엑셀 파일 다운로드

### POST /sample/BCUserManager/pmUserExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 사용자 엑셀 파일 업로드

### POST /sample/BCUserManager/pmUserNameCheck
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- 사용자 이름 확인

...(이하 동일한 방식으로 기재)...

---
## BCSampleSourceController API 명세서
### POST /sample/BCSampleSource/pmGetSampleList
#### 파라미터 정보
- requestData : 샘플 데이터 요청 정보
- onlineCtx : 온라인 상황정보
#### 응답 (IDataSet)
- 샘플 리스트 결과 데이터

### POST /sample/BCSampleSource/pmInsertSampleData
#### 파라미터 정보
- requestData : 새로운 샘플 데이터 정보
- onlineCtx : 온라인 상황정보
#### 응답 (IDataSet)
- 새로운 샘플 데이터 등록 결과

### POST /sample/BCSampleSource/pmUpdateSampleData
#### 파라미터 정보
- requestData : 업데이트할 샘플 데이터 정보
- onlineCtx : 온라인 상황정보
#### 응답 (IDataSet)
- 샘플 데이터 업데이트 결과

### POST /sample/BCSampleSource/pmDeleteSampleData
#### 파라미터 정보
- requestData : 삭제할 샘플 데이터 정보
- onlineCtx : 온라인 상황정보
#### 응답 (IDataSet)
- 샘플 데이터 삭제 결과
---
## BCProjectCalendar API 명세서

### POST /sample/BCProjectCalendar/pmProjectCalendarInq
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 프로젝트 캘린더 조회 결과

### POST /sample/BCProjectCalendar/pmCalendarUpload
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 캘린더 업로드 결과

### POST /sample/BCProjectCalendar/pmProjectCalendarListInq
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 프로젝트 캘린더 목록 조회 결과

### POST /sample/BCProjectCalendar/pmProjectCalendarUnionListInq
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 프로젝트 캘린더 조합 리스트 조회 결과

### POST /sample/BCProjectCalendar/pmProjectCalendarHolListInq
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 프로젝트 캘린더 휴일 리스트 조회 결과

### POST /sample/BCProjectCalendar/pmCalendarMonth
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 달력 월간 데이터 조회 결과

### POST /sample/BCProjectCalendar/pmHolidayAdd
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 휴일 추가 결과

### POST /sample/BCProjectCalendar/pmHolidayUpd
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 휴일 수정 결과

### POST /sample/BCProjectCalendar/pmHolidayDel
#### 파라미터 정보
- requestBody: 요청 데이터
- IOnlineContext onlineCtx: 온라인 환경 정보
#### 응답 (JSON)
- 휴일 삭제 결과

---
## BCPracticeSourceController API 명세서

### POST /sample/BCPracticeSource/pmGetPracticeList
#### 파라미터 정보
- requestData : 웹 요청을 위한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON 형식)
- 연습 리스트 정보 반환

---

### POST /sample/BCPracticeSource/pmInsertPracticeData
#### 파라미터 정보
- requestData : 웹 요청을 위한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON 형식)
- 연습데이터 삽입 정보 반환
---

### POST /sample/BCPracticeSource/pmUpdatePracticeData
#### 파라미터 정보
- requestData : 웹 요청을 위한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON 형식)
- 연습데이터 업데이트 정보 반환
---

### POST /sample/BCPracticeSource/pmDeletePracticeData
#### 파라미터 정보
- requestData : 웹 요청을 위한 데이터 정보
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON 형식)
- 연습데이터 삭제 정보 반환
---
## BCApiUser API 명세서
### POST /api/BCApiUser/pmMakeUser
#### 파라미터 정보
- key : 애플리케이션 인증 키 정보 입니다.
- userId : 신규 생성될 사용자의 ID 입니다.
- userName : 신규 생성될 사용자의 이름 입니다.
- postName : 신규 생성될 사용자의 직급 정보 입니다.
- user_id : 조회를 진행하는 사용자의 ID 입니다.
#### 응답 (Boolean)
- 사용자 생성 성공 여부를 반환합니다.

### POST /api/BCApiUser/pmModifyUser
#### 파라미터 정보
- key : 애플리케이션 인증 키 정보 입니다.
- userId : 수정될 사용자의 ID 입니다.
- userName : 수정될 사용자의 이름 입니다.
- postName : 수정될 사용자의 직급 정보 입니다.
- user_id : 조회를 진행하는 사용자의 ID 입니다.
#### 응답 (Boolean)
- 사용자 수정 성공 여부를 반환합니다.

### POST /api/BCApiUser/pmDeleteUser
#### 파라미터 정보
- key : 애플리케이션 인증 키 정보 입니다.
- userId : 삭제될 사용자의 ID 입니다.
- user_id : 조회를 진행하는 사용자의 ID 입니다.
#### 응답 (Boolean)
- 사용자 삭제 성공 여부를 반환합니다.
---
## BCApiTmslinkController API 명세서
### GET /api/BCApiPmslink/pmGetProjectLinkYn
#### 파라미터 정보
- projectNo : 프로젝트 번호. 필수값은 아님. 

#### 응답 (JSON)
- 프로젝트 TMS연계여부를 체크하여 결과를 반환함.


### GET /api/BCApiPmslink/pmGetTestTypeAll
#### 파라미터 정보
- projectNo : 프로젝트 번호. 필수값임.
- code : 코드값. 필수값은 아님. 기본값은 "".

#### 응답 (JSON)
- 전체 유형을 동기화하여 그 결과를 반환함.
 

### GET /api/BCApiPmslink/pmGetTestScenarioAllTree
#### 파라미터 정보
- projectNo : 프로젝트 번호. 필수값임.
- code : 코드값. 필수값은 아님. 기본값은 "".

#### 응답 (JSON)
- 전체 시나리오를 동기화하여 그 결과를 반환함.


### GET /api/BCApiPmslink/pmTestTypeCode
#### 파라미터 정보
- projectNo : 프로젝트 번호. 필수값임.
- level : 레벨. 필수값임. 

#### 응답 (JSON)
- PMS유형코드를 제공함. 코드는 level에 따라 달라짐.
---
## BCApiProjectInfoController API 명세서
### GET /api/v1/data/project/delTblClearYn
#### 파라미터 정보
- projectNo : 프로젝트 번호. 필수 파라미터입니다.
#### 응답 (JSON)
- 삭제테이블 정리 여부를 반환합니다.

### GET /api/v1/data/project/delTblClearY/projects
#### 파라미터 정보
- solution : 솔루션 정보. 필수 파라미터입니다.
#### 응답 (JSON)
- 삭제테이블 정리 여부가 'Y'인 프로젝트 목록을 반환합니다.
---
## BCApiServiceController API 명세서

### GET api/BCApiService/pmGetProjectList
#### 파라미터 정보
- 없음
#### 응답 (JSON)
- 프로젝트 리스트

### GET api/BCApiService/pmGetIssueList
#### 파라미터 정보
- is_id : 이슈 아이디
- issue_name : 이슈 이름
- project_no : 프로젝트 번호
#### 응답 (JSON)
- 이슈 리스트

### GET api/BCApiService/pmGetRiskList
#### 파라미터 정보
- subject : 제목
- risl_id1 : 리스크 ID
- project_no : 프로젝트 번호
#### 응답 (JSON)
- 리스크 리스트

### GET api/BCApiService/pmGetGisulList
#### 파라미터 정보
- subject : 제목
- risk_id1 : 위험 ID
- project_no : 프로젝트 번호
#### 응답 (JSON)
- 기술 리스트

### GET api/BCApiService/pmGetNoticeList
#### 파라미터 정보
- subject : 제목
- risk_id1 : 위험 ID
- project_no : 프로젝트 번호
#### 응답 (JSON)
- 공지사항 리스트

... (위의 문서를 통해 모든 API의 명세서를 이와같이 기록한다.)
---
## BCApiQmslinkController API 명세서

### GET /api/BCApiQmslink/pmGetProgramAllList
#### 파라미터 정보
- projectNo: 메인 프로젝트 번호 (필요하지 않을 시 입력하지 않아도 됨)
- subProjectNo: 서브 프로젝트 번호 (필요하지 않을 시 입력하지 않아도 됨)
#### 응답 (JSON)
- 전체 프로그램 리스트 반환


### GET /api/BCApiQmslink/projects/{projectNo}/subProjects
#### 파라미터 정보
- projectNo: 메인 프로젝트 번호
#### 응답 (JSON)
- "total": 서브 프로젝트의 총 갯수
- "datalist": 서브 프로젝트의 상세 정보 리스트 (없을 시 null 반환)


### GET /api/BCApiQmslink/projects/{projectNo}/qmsLinkYn
#### 파라미터 정보
- projectNo: 메인 프로젝트 번호
#### 응답 (JSON)
- 프로젝트와 Quality Management System(QMS) 간 연결유무에 대한 데이터 리스트 반환

---
## BCApiITSIssueController API 명세서
### POST api/v1/BCApiITSIssue/issue/add
#### 파라미터 정보
- param : ITSIssue 정보가 담긴 Map 구조

#### 응답 (JSON)
- list_cnt : API 호출을 통해 처리된 이슈의 개수
- list : 처리된 이슈 정보에 대한 리스트
- 타입 (에러 발생시에만 존재) : 응답 메시지의 타입
- 메시지 (에러 발생시에만 존재) : 에러 메시지

### POST api/v1/BCApiITSIssue/issue/del
#### 파라미터 정보
- param : 삭제할 ITSIssue 정보가 담긴 Map 구조

#### 응답 (JSON)
- list_cnt : API 호출을 통해 처리된 이슈의 개수
- list : 처리된 이슈 정보에 대한 리스트
- 타입 (에러 발생시에만 존재) : 응답 메시지의 타입
- 메시지 (에러 발생시에만 존재) : 에러 메시지
---
## BCApiProject API 명세서

### GET /api/BCApiProject/pmGetProjectList
#### 파라미터 정보
- key : 키 확인

#### 응답 (List)
- 프로젝트 리스트

### POST /api/BCApiProject/pmMakeProject
#### 파라미터 정보
- key : 키 확인
- project_no : 프로젝트 번호
- project_name : 프로젝트 이름
- manager_id : 관리자 ID
- start_dt : 시작 날짜
- end_dt : 종료 날짜
- user_id : 사용자 ID

#### 응답 (Boolean)
- 프로젝트 등록 성공여부

### POST /api/BCApiProject/pmMakeSubProject
#### 파라미터 정보
- 동일한 프로젝트 파라미터 사용

#### 응답 (Boolean)
- 하위 프로젝트 등록 성공여부 

### POST /api/BCApiProject/pmModifyProject
#### 파라미터 정보
- 동일한 프로젝트 파라미터 사용

#### 응답 (Boolean)
- 프로젝트 수정 성공여부

### POST /api/BCApiProject/pmDeleteProject
#### 파라미터 정보
- key : 키 확인
- project_no : 프로젝트 번호
- user_id : 사용자 ID

#### 응답 (Boolean)
- 프로젝트 삭제 성공여부

### POST /api/BCApiProject/pmUserAdd
#### 파라미터 정보
- key : 키 확인
- project_no : 프로젝트 번호
- user_id : 사용자 ID
- user_name : 사용자 이름
- post_name : 게시물 이름
- user_group_code : 사용자 그룹 코드

#### 응답 (Boolean)
- 사용자 추가 성공여부 

### POST /api/BCApiProject/pmUserUpd
#### 파라미터 정보
- 동일한 사용자 파라미터 사용

#### 응답 (Boolean)
- 사용자 수정 성공여부 

### POST /api/BCApiProject/pmUserDel
#### 파라미터 정보
- key : 키 확인
- project_no : 프로젝트 번호
- user_id : 사용자 ID

#### 응답 (Boolean)
- 사용자 삭제 성공여부 

### POST /api/BCApiProject/pmAuthAdd
#### 파라미터 정보
- project_no : 프로젝트 번호
- member_id : 멤버 ID
- user_id : 사용자 ID

#### 응답 (Boolean)
- 사용자 권한 추가 성공여부 

### GET /api/BCApiProject/pmGetProjectStatus
#### 파라미터 정보
- projectNo : 프로젝트 번호

#### 응답 (List)
- 프로젝트 상태 코드 조회 결과
---
## BirtController API 명세서
### POST /report/{name}
#### 파라미터 정보
- name : 보고서 이름
#### 응답 (JSON)
- 보고서 자료 출력

### POST /report/**/{name}
#### 파라미터 정보
- name : 보고서 이름
#### 응답 (JSON)
- 보고서 자료 출력

---
## BCEvmManagerController API 명세서
### POST /evms/BCEvmManager/pmEvmListInq
#### 파라미터 정보
- requestData : 서버로 보내는 데이터
- onlineCtx : 사용자의 컨텍스트 정보
#### 응답 (JSON)
- pmEvmListInq 메서드를 호출한 결과가 반환됨
---
## BCEvmsTaskPlanController API 명세서
### POST /evms/BCTaskPlan/pmTaskPlanUpd
#### 파라미터 정보
- IDataSet requestData : 업무 계획 업데이트를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 업무 계획 업데이트 결과 

### POST /evms/BCTaskPlan/pmMppTaskInq
#### 파라미터 정보
- IDataSet requestData : MPP 업무 조회를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- MPP 업무 조회 결과

### POST /evms/BCTaskPlan/pmTaskPlanInq
#### 파라미터 정보
- IDataSet requestData : 업무 계획 조회를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 업무 계획 조회 결과

### POST /evms/BCTaskPlan/pmExcelUpload
#### 파라미터 정보
- IDataSet requestData : 엑셀 업로드를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 엑셀 업로드 결과

### POST /evms/BCTaskPlan/pmMppUpload
#### 파라미터 정보
- IDataSet requestData : MPP 업로드를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- MPP 업로드 결과

### POST /evms/BCTaskPlan/pmMppUserInq
#### 파라미터 정보
- IDataSet requestData : MPP 사용자 조회를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- MPP 사용자 조회 결과

### POST /evms/BCTaskPlan/pmSubProjectInq
#### 파라미터 정보
- IDataSet requestData : 하위 프로젝트 조회를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 하위 프로젝트 조회 결과

### POST /evms/BCTaskPlan/pmTaskPlanGridInq
#### 파라미터 정보
- IDataSet requestData : 업무 계획 그리드 조회를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- 업무 계획 그리드 조회 결과

### POST /evms/BCTaskPlan/pmExcelDownload
#### 파라미터 정보
- IDataSet requestData : 엑셀 다운로드를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (DownloadView)
- 엑셀 파일 다운로드 결과

### POST /evms/BCTaskPlan/pmMppProjectInq
#### 파라미터 정보
- IDataSet requestData : MPP 프로젝트 조회를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- MPP 프로젝트 조회 결과

### POST /evms/BCTaskPlan/pmMppPLAuthInq
#### 파라미터 정보
- IDataSet requestData : MPP PL 권한 조회를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- MPP PL 권한 조회 결과

### POST /evms/BCTaskPlan/pmMppPLAuthUpd
#### 파라미터 정보
- IDataSet requestData : MPP PL 권한 업데이트를 위한 정보
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- MPP PL 권한 업데이트 결과
---
## BCCtsManagerStatusRetrieve01 API 명세서
### POST /riskissue/BCCtsManagerStatusRetrieve01/pmIssueStatusCode
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- Issue의 상태 코드를 반환합니다.

### POST /riskissue/BCCtsManagerStatusRetrieve01/pmIssueStatusListInq02
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- Issue의 상태 리스트를 반환합니다. 

### POST /riskissue/BCCtsManagerStatusRetrieve01/pmIssueStatusListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (IDataSet)
- Issue의 상태 리스트를 조회하고 반환합니다.
---
## BCCtsManagerController API 명세서
### POST /riskissue/BCCtsManager/pmMetaDataGridSel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataGridUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataGridHistorySel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataHistoryUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataIns
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmAttchFileListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmAttchFileListDel
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataGetCtsId
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataExcelDown
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (파일 다운로드)
- 요청 데이터에 따른 Excel 파일 다운로드

### POST /riskissue/BCCtsManager/pmFileDownload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (파일 다운로드)
- 요청 데이터에 따른 파일 다운로드

### POST /riskissue/BCCtsManager/pmMetaDataExcelUpload
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환

### POST /riskissue/BCCtsManager/pmMetaDataCtsStatusCdInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 요청 데이터에 따른 처리 결과 반환
---
## BCIssueStatusManager API 명세서
### POST riskissue/BCIssueStatusManager/pmIssueStatusListInq
#### 파라미터 정보
- requestData : 이슈 상태의 리스트를 조회하는데 필요한 데이터 집합
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈의 상태와 관련된 정보 리스트를 반환한다.
---
## BCIssueManagerController API 명세서
### POST /riskissue/BCIssueManager/pmGetHistory
#### 파라미터 정보
- requestData : 이력 정보 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이력 정보

### POST /riskissue/BCIssueManager/pmDetailCodeInq
#### 파라미터 정보
- requestData : 상세 코드 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 상세 코드 정보

### POST /riskissue/BCIssueManager/pmIssueManagerDel
#### 파라미터 정보
- requestData : 이슈 관리자 삭제 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 관리자 삭제 결과

### POST /riskissue/BCIssueManager/pmIssueManagerNewPopInq
#### 파라미터 정보
- requestData : 이슈 관리자 새 팝업 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 관리자 새 팝업 정보

### POST /riskissue/BCIssueManager/pmIssueManagerUpt
#### 파라미터 정보
- requestData : 이슈 관리자 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 관리자 업데이트 결과

### POST /riskissue/BCIssueManager/pmIssueActorInq
#### 파라미터 정보
- requestData : 이슈 실행자 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 실행자 정보
  
### POST /riskissue/BCIssueManager/pmIssueManagerSavedDetailCodeInq
#### 파라미터 정보
- requestData : 이슈 관리자 저장된 상세 코드 조회 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 관리자 저장된 상세 코드 정보

### POST /riskissue/BCIssueManager/pmTranSubproject
#### 파라미터 정보
- requestData : 하위 프로젝트 전환 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 전환 결과

### POST /riskissue/BCIssueManager/pmIsTypeYn
#### 파라미터 정보
- requestData : 유형 확인 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 유형 확인 정보

### POST /riskissue/BCIssueManager/pmIssueManagerGridUpd
#### 파라미터 정보
- requestData : 이슈 관리자 그리드 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 이슈 관리자 그리드 업데이트 결과
---
## BCAlopexDashController API 명세서
### POST /riskissue/BCAlopexDash/pmGetAlopex
#### 파라미터 정보
- requestData : 조회를 위한 요청 데이터
- onlineCtx : 온라인 작업 컨텍스트 정보
#### 응답 (JSON)
- Alopex에 관한 정보를 반환합니다.

### POST /riskissue/BCAlopexDash/pmSetAlopex
#### 파라미터 정보
- requestData : 수정 또는 추가를 위한 요청 데이터
- onlineCtx : 온라인 작업 컨텍스트 정보
#### 응답 (JSON)
- Alopex 정보를 설정하거나 추가한 결과를 반환합니다.

### POST /riskissue/BCAlopexDash/pmDeleteAlopex
#### 파라미터 정보
- requestData : 삭제를 위한 요청 데이터
- onlineCtx : 온라인 작업 컨텍스트 정보
#### 응답 (JSON)
- Alopex 정보 삭제 결과를 반환합니다.

### POST /riskissue/BCAlopexDash/pmWidgetInq
#### 파라미터 정보
- requestData : 조회를 위한 요청 데이터
- onlineCtx : 온라인 작업 컨텍스트 정보
#### 응답 (JSON)
- 위젯에 대한 조회 정보를 반환합니다.

---
## BCActionItemStatusManager API 명세서
### POST /riskissue/BCActionItemStatusManager/pmActionItemStatusListInq
#### 파라미터 정보
- requestData : 요청 데이터 정보를 가진 IDataSet 타입의 객체.
- onlineCtx : 온라인 context 정보를 가진 IOnlineContext 타입의 객체.
  
#### 응답 (Json)
- 액션 아이템의 상태 리스트 정보를 반환한다.
---
## BCRiskManagerController API 명세서
### POST /riskissue/BCRiskManager/pmProjectInq
#### 파라미터 정보
- requestBody : 프로젝트 정보 호출에 필요한 정보
- onlineCtx : 온라인 컨텍스트 (session 관련 정보)
#### 응답 (JSON)
- 프로젝트 조회 결과 정보

### POST /riskissue/BCRiskManager/pmGetHistory
#### 파라미터 정보
- requestBody : 히스토리 호출에 필요한 정보
- onlineCtx : 온라인 컨텍스트 (session 관련 정보)
#### 응답 (JSON)
- 히스토리 조회 결과 정보

### POST /riskissue/BCRiskManager/pmGetActivityHistory
#### 파라미터 정보
- requestBody : 활동 히스토리 호출에 필요한 정보
- onlineCtx : 온라인 컨텍스트 (session 관련 정보)
#### 응답 (JSON)
- 활동 히스토리 조회 결과 정보

### POST /riskissue/BCRiskManager/pmFileDel
#### 파라미터 정보
- requestBody : 파일 삭제를 위한 정보
- onlineCtx : 온라인 컨텍스트 (session 관련 정보)
#### 응답 (JSON)
- 파일 삭제 결과

### POST /riskissue/BCRiskManager/pmRiskManagerUpd
#### 파라미터 정보
- requestBody : 위험 관리 업데이트를 위한 정보
- onlineCtx : 온라인 컨텍스트 (session 관련 정보)
#### 응답 (JSON)
- 위험 관리 업데이트 결과

등의 API 명세서가 있습니다. 이외에도 요청한 API 경로에 따라 다른 기능들이 존재하며 API 경로와 파라미터 정보를 통해 원하는 기능을 수행하게 됩니다.
---
## BCITSIssueLinkManager API 명세서
*****
### POST /riskissue/BCITSIssueLinkManager/pmITSLinkListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 이슈 링크 리스트 정보를 불러옵니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmSetCharger
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 이슈 담당자를 설정합니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmSetInfo
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 이슈 정보를 설정합니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmIssueLinkUpd
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 이슈 링크 정보를 업데이트합니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmSetSubPrj
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 하위 프로젝트를 설정합니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmIssuePopInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 이슈 팝업 정보를 불러옵니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmReqPopInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 요청 팝업 정보를 불러옵니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmActionItemPopInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 액션 아이템 팝업 정보를 불러옵니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmWBSListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- WBS 리스트 정보를 불러옵니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmInsertIssue
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 이슈를 등록합니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmUpdateIssue
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 이슈 정보를 업데이트합니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmFindMyTask
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 내 작업을 찾아봅니다.
*****
### POST /riskissue/BCITSIssueLinkManager/pmDoRemove
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트
#### 응답 (IDataSet)
- 정해진 작업을 삭제합니다.
---
## BCActionItemManager API 명세서

### POST /riskissue/BCActionItemManager/pmTranSubproject
#### 파라미터 정보
- requestData : 프로젝트 전송에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 서브프로젝트 전송 처리 결과

### POST /riskissue/BCActionItemManager/pmActionItemListInq
#### 파라미터 정보
- requestData : 액션아이템 목록 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 액션아이템 목록 조회 결과

### POST /riskissue/BCActionItemManager/pmActionItemUpt
#### 파라미터 정보
- requestData : 액션아이템 업데이트에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 액션아이템 업데이트 처리 결과

### POST /riskissue/BCActionItemManager/pmActionItemAdd
#### 파라미터 정보
- requestData : 액션아이템 추가에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 액션아이템 추가 처리 결과

### POST /riskissue/BCActionItemManager/pmActionItemNewPopInq
#### 파라미터 정보
- requestData : 새 액션아이템 팝업 조회에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 새 액션아이템 팝업 조회 처리 결과

### POST /riskissue/BCActionItemManager/pmActionItemDel
#### 파라미터 정보
- requestData : 액션아이템 삭제에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 액션아이템 삭제 처리 결과
  
### GET /riskissue/BCActionItemManager/pmActionItemExcelDown
#### 파라미터 정보
- requestData : 액션아이템 엑셀 다운로드 요청에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (FILE)
- 액션아이템 엑셀 파일

### POST /riskissue/BCActionItemManager/pmGetHistory
#### 파라미터 정보
- requestData : 히스토리 정보 요청에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 히스토리 조회 결과

### POST /riskissue/BCActionItemManager/pmGetComment
#### 파라미터 정보
- requestData : 댓글 정보 요청에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 댓글 조회 결과
---
## BCLegacyManager API 명세서
### POST /riskissue/BCLegacyManager/pmCheckAvailabilityYnInq
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 처리 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmMetaDataGridSel
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 메타데이터 그리드 정보를 조회한 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmMetaDataGridUpd
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 메타데이터 그리드 정보를 업데이트한 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmMetaDataGridHistorySel
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 메타데이터 그리드의 히스토리 정보를 조회한 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmMetaDataHistoryUpd
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 메타데이터의 히스토리 정보를 업데이트한 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmMetaDataIns
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 메타데이터를 새롭게 등록한 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmMetaDataUpd
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 메타데이터를 업데이트한 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmMetaDataDel
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 메타데이터를 삭제한 결과를 포함하는 IDataSet 객체 반환

### POST /riskissue/BCLegacyManager/pmDetailCdInq
#### 파라미터 정보
- requestData : 요청 데이터(IdataSet 객체)
- onlineCtx : 온라인 컨텍스트 정보(IOnlineContext 객체)
#### 응답 (JSON)
- 세부 코드를 조회한 결과를 포함하는 IDataSet 객체 반환

... 그 외 나머지 API는 동일하게 작성합니다.
---
## BCNoticeRetrieveController API 명세서
### POST /teamsite/BCNoticeRetrieve/pmNotiNoticeSend
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 알림 전송 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmNoticeMultiFile
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 멀티 파일 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmNoticeFileDown
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 공지 파일 다운로드 요청 결과(파일 이름과 경로 포함)

### POST /teamsite/BCNoticeRetrieve/pmNoticeInq
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 문의 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmNoticeFileDel
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 파일 삭제 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmNoticeListInq
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 목록 조회 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmNoticeAdd
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 추가 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmNoticeUpd
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 업데이트 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmNoticeDel
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 공지 삭제 요청 결과

### POST /teamsite/BCNoticeRetrieve/pmExcelHistoryDownload
#### 파라미터 정보
- requestData : 데이터 세트 요청 정보
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (DownloadView)
- 엑셀 이력 다운로드 요청 결과(파일 이름과 경로 포함)
---
## BCTsMenuManager API 명세서
### POST /teamsite/BCTsMenuManager/pmMenuInqList
#### 파라미터 정보
- requestData : API 호출에 사용할 데이터
- onlineCtx : 온라인 컨텍스트 상황
#### 응답 (JSON)
- 요청한 정보에 대한 리스트가 반환됩니다.

### POST /teamsite/BCTsMenuManager/pmMenuUpd
#### 파라미터 정보
- requestData : API 호출에 사용할 데이터
- onlineCtx : 온라인 컨텍스트 상황
#### 응답 (JSON)
- 업데이트된 메뉴 정보가 반환됩니다.

### POST /teamsite/BCTsMenuManager/pmMenuInq
#### 파라미터 정보
- requestData : API 호출에 사용할 데이터
- onlineCtx : 온라인 컨텍스트 상황
#### 응답 (JSON)
- 요청에 해당하는 메뉴 정보가 반환됩니다.

### POST /teamsite/BCTsMenuManager/pmMenuDel
#### 파라미터 정보
- requestData : API 호출에 사용할 데이터
- onlineCtx : 온라인 컨텍스트 상황
#### 응답 (JSON)
- 삭제된 메뉴의 정보가 반환됩니다.

### POST /teamsite/BCTsMenuManager/pmMenuAdd
#### 파라미터 정보
- requestData : API 호출에 사용할 데이터
- onlineCtx : 온라인 컨텍스트 상황
#### 응답 (JSON)
- 새롭게 추가된 메뉴 정보가 반환됩니다.

### POST /teamsite/BCTsMenuManager/pmMenuInit
#### 파라미터 정보
- requestData : API 호출에 사용할 데이터
- onlineCtx : 온라인 컨텍스트 상황
#### 응답 (JSON)
- 초기화된 메뉴 정보가 반환됩니다.
---
## BCTsGroupRoleManager API 명세서
### POST /teamsite/BCTsGroupManager/pmGroupRoleListInq
#### 파라미터 정보
- requestData : 요청 데이터를 담는 객체
- onlineCtx : 온라인 통신 관련 정보를 담는 객체
#### 응답 (JSON)
- 그룹 역할 목록 조회 결과를 반환

### POST /teamsite/BCTsGroupManager/pmGroupRoleUpd
#### 파라미터 정보
- requestData : 요청 데이터를 담는 객체
- onlineCtx : 온라인 통신 관련 정보를 담는 객체
#### 응답 (JSON)
- 그룹 역할 업데이트 처리 결과를 반환
---
## BCTsMainManager API 명세서
---
### POST /teamsite/BCTsMainManager/pmBoardColumnInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- pmBoardColumnInq 결과
---
### POST /teamsite/BCTsMainManager/pmBoardInqList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- pmBoardInqList 결과
---
### POST /teamsite/BCTsMainManager/pmSchedualYnInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- pmSchedualYnInq 결과
---
### POST /teamsite/BCTsMainManager/pmMainInqList
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- pmMainInqList 결과
---
### POST /teamsite/BCTsMainManager/pmMainAdd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- pmMainAdd 결과
---
### POST /teamsite/BCTsMainManager/pmColumnUpd
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- pmColumnUpd 결과
---
### POST /teamsite/BCTsMainManager/pmTsSelboxInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터셋
- IOnlineContext onlineCtx : 온라인 컨텍스트 

#### 응답 (JSON)
- pmTsSelboxInq 결과

---
## BCTeamSiteBuild API 명세서

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteBuildAdd
#### 파라미터 정보
- requestData : 추가할 Team Site Build 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteBuildInq
#### 파라미터 정보
- requestData : 조회할 Team Site Build 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteBuildListInq
#### 파라미터 정보
- requestData : 조회할 Team Site Build 목록 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteBuildUpd
#### 파라미터 정보
- requestData : 갱신할 Team Site Build 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteBuildDel
#### 파라미터 정보
- requestData : 삭제할 Team Site Build 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteMappingListInq
#### 파라미터 정보
- requestData : 조회할 Team Site 맵핑 목록 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteMappingAdd
#### 파라미터 정보
- requestData : 추가할 Team Site 맵핑 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmTeamSiteMappingDel
#### 파라미터 정보
- requestData : 삭제할 Team Site 맵핑 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmMapProSelList
#### 파라미터 정보
- requestData : 선택할 맵 프로세스 리스트 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmBoardSelList
#### 파라미터 정보
- requestData : 선택할 보드 리스트 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmUrlCodeList
#### 파라미터 정보
- requestData : 요청할 URL 코드 리스트 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmSortKeyDwn
#### 파라미터 정보
- requestData : 내림차순 정렬키 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환 

### POST /teamsite/BCTeamSiteBuild/pmSortKeyUpd
#### 파라미터 정보
- requestData : 정렬키 업데이트 정보가 담긴 데이터 셋
- onlineCtx : 실시간 컨텍스트

#### 응답 (JSON)
- 성공시 해당 결과 데이터셋 반환
---
## BCSchedualManager API 명세서
### POST /teamsite/BCSchedualManager/pmSchedualFileDel
#### 파라미터 정보
- requestData : 스케줄 파일 삭제에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- 스케줄 파일 삭제 결과 데이터 반환

### POST /teamsite/BCSchedualManager/pmSchedualFileDown
#### 파라미터 정보
- requestData : 스케줄 파일 다운로드에 필요한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (반환 형태: DownloadView)
- 다운로드할 스케줄 파일 정보 반환

### POST /teamsite/BCSchedualManager/pmSchedualListInq
#### 파라미터 정보
- requestData : 스케줄 리스트 조회에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- 스케줄 리스트 조회 결과 데이터 반환

### POST /teamsite/BCSchedualManager/pmSchedualUpd
#### 파라미터 정보
- requestData : 스케줄 업데이트에 필요한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- 스케줄 업데이트 결과 데이터 반환

### POST /teamsite/BCSchedualManager/pmSchedualInq
#### 파라미터 정보
- requestData : 스케줄 조회에 필요한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- 스케줄 조회 결과 데이터 반환

### POST /teamsite/BCSchedualManager/pmSchedualDel
#### 파라미터 정보
- requestData : 스케줄 삭제에 필요한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- 스케줄 삭제 결과 데이터 반환

### POST /teamsite/BCSchedualManager/pmSchedualAdd
#### 파라미터 정보
- requestData : 스케줄 추가에 필요한 요청 데이터 
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (ResponseBody)
- 스케줄 추가 결과 데이터 반환

### POST /teamsite/BCSchedualManager/pmExcelHistoryDownload
#### 파라미터 정보
- requestData : 엑셀 이력 다운로드에 필요한 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (반환 형태: DownloadView)
- 다운로드할 엑셀 이력 파일 정보 반환
---
## BCTSCfgManager API 명세서
### POST /teamsite/BCTSCfgManager/pmCfgManagerAdd
#### 파라미터 정보
- requestData : 요청 데이터, IDataSet 타입
- onlineCtx : 온라인 컨텍스트 데이터, IOnlineContext 타입
#### 응답 (Json)
- 서비스.pmCfgManagerAdd 메소드 결과 값

### POST /teamsite/BCTSCfgManager/pmCfgManagerListInq
#### 파라미터 정보
- requestData : 요청 데이터, IDataSet 타입
- onlineCtx : 온라인 컨텍스트 데이터, IOnlineContext 타입
#### 응답 (Json)
- 서비스.pmCfgManagerListInq 메소드 결과 값

### POST /teamsite/BCTSCfgManager/pmCfgManagerDel
#### 파라미터 정보
- requestData : 요청 데이터, IDataSet 타입
- onlineCtx : 온라인 컨텍스트 데이터, IOnlineContext 타입
#### 응답 (Json)
- 서비스.pmCfgManagerDel 메소드 결과 값

### POST /teamsite/BCTSCfgManager/pmCfgManagerAvailable
#### 파라미터 정보
- requestData : 요청 데이터, IDataSet 타입
- onlineCtx : 온라인 컨텍스트 데이터, IOnlineContext 타입
#### 응답 (Json)
- 서비스.pmCfgManagerAvailable 메소드 결과 값
---
## BCBusinessReport API 명세서
### POST /teamsite/BCBusinessReport/getWeeklyUserNmList
#### 파라미터 정보
- requestData : 주간 사용자 명단 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 사용자 명단을 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSYearListInq
#### 파라미터 정보
- requestData : 연간 비즈니스 목록 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 연간 비즈니스 목록을 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSReportMonthListInq
#### 파라미터 정보
- requestData : 월간 보고서 목록 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 월간 보고서 목록을 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSReportWeekListInq
#### 파라미터 정보
- requestData : 주간 보고서 목록 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 주간 보고서 목록을 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSReportDayInq
#### 파라미터 정보
- requestData : 일별 보고서 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 일별 보고서를 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSReportDayListInq
#### 파라미터 정보
- requestData : 일일 보고서 목록 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 일일 보고서 목록을 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSReportDayUpd
#### 파라미터 정보
- requestData : 일일 보고서 업데이트 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 업데이트후 결과를 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSReportDayAdd
#### 파라미터 정보
- requestData : 일일 보고서 추가 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (Json)
- 추가한 후 결과를 반환합니다.

### POST /teamsite/BCBusinessReport/pmBSReportExcelDownload
#### 파라미터 정보
- requestData : 엑셀 보고서 다운로드 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (File Download)
- 다운로드 가능한 엑셀 보고서 파일을 반환합니다.

#... 생략 가능 (위와 비슷한 설명은 생략)...


---
## BCCodeGenManager API 명세서
### POST /codegen/BCCodeGenManager/pmCodeGenerateInfo
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 정보를 담은 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 객체

#### 응답 (JSON)
- 코드 생성 정보에 대한 데이터를 반환

### POST /codegen/BCCodeGenManager/pmCodeGenerate
#### 파라미터 정보
- requestData : 요청에 필요한 데이터 정보를 담은 객체
- onlineCtx : 온라인 컨텍스트 정보를 담은 객체

#### 응답 (JSON)
- 요청한 데이터에 대한 코드 생성 결과를 반환
---
## FileController API 명세서
### POST /upload.file
#### 파라미터 정보
- HttpServletRequest request: 파일 업로드 요청 정보가 담긴 객체
- HttpServletResponse response: 요청에 대한 응답 정보를 처리하는 객체

#### 응답 (Void)
- 파일 관리 시스템(fileManager)에서 파일 업로드 관련 처리 진행

### POST /download.file
#### 파라미터 정보
- IDataSet requestData: 클라이언트로부터 받은 요청 데이터. 파일 ID나 파일 이름 정보를 가지고 있음
- IOnlineContext onlineCtx: 온라인 컨텍스트 정보. 세션, 사용자 정보 등을 담고 있음

#### 응답 (DownloadView)
- 클라이언트에게 다운로드 할 파일 정보와 파일이름을 return 함
- 파일 경로와 파일 이름을 이용해 클라이언트에게 실제 파일을 제공
---
## StandardController API 명세서
### POST /standard.cmd
#### 파라미터 정보
- nc_trId : 요청 메소드명을 포함한 클래스의 이름
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 온라인 컨텍스트 정보
#### 응답 (TextView)
- 수신된 요청 데이터를 기반으로 특정 클래스의 메소드를 호출하고, 그 결과를 반환함
---
## BCDesignProgramQuantitativeMgtPerson API 명세서

### POST /productivity/BCDesignProgramQuantitativeMgtPerson/pmChargerInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmChargerInq의 처리 결과

### POST /productivity/BCDesignProgramQuantitativeMgtPerson/pmProgramStatusGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmProgramStatusGrid의 처리 결과

### POST /productivity/BCDesignProgramQuantitativeMgtPerson/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmProgramStatusChart1의 처리 결과

### POST /productivity/BCDesignProgramQuantitativeMgtPerson/pmProgramStatusChart2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmProgramStatusChart2의 처리 결과

### POST /productivity/BCDesignProgramQuantitativeMgtPerson/pmProdectivityPersonListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmProdectivityPersonListInq의 처리 결과

### POST /productivity/BCDesignProgramQuantitativeMgtPerson/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보

#### 응답 (JSON)
- pmScopeManagerApprovalSettingInq의 처리 결과
---
## BCProdectivityPersonController API 명세서
### POST productivity/BCProductivityPerson/pmChargerInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 'pmChargerInq' 핸들러에서 반환한 데이터센터 정보

### POST productivity/BCProductivityPerson/pmProgramStatusGrid
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 'pmProgramStatusGrid' 핸들러에서 반환한 데이터센터 정보

### POST productivity/BCProductivityPerson/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 'pmProgramStatusChart1' 핸들러에서 반환한 데이터센터 정보

### POST productivity/BCProductivityPerson/pmProgramStatusChart2
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 'pmProgramStatusChart2' 핸들러에서 반환한 데이터센터 정보

### POST productivity/BCProductivityPerson/pmProdectivityPersonListInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 'pmProdectivityPersonListInq' 핸들러에서 반환한 데이터센터 정보

### POST productivity/BCProductivityPerson/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트
#### 응답 (JSON)
- 'pmScopeManagerApprovalSettingInq' 핸들러에서 반환한 데이터센터 정보
---
## BCPersonQuantitativeController API 명세서
### POST /productivity/BCPersonQuantitative/pmPersonQuantitativeListInq
#### 파라미터 정보
- requestBody : 요청 데이터를 담고 있는 IDataSet 객체
- IOnlineContext : 온라인 컨텍스트 정보를 담고 있는 객체
#### 응답 (JSON)
- pmPersonQuantitativeListInq 메소드를 통해 처리되고 반환되는 IDataSet 객체

---
## BCDesignQuantitativeMgtPerson API 명세서
### POST /productivity/BCDesignQuantitativeMgtPerson/pmChargerInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트

#### 응답 (JSON)
- IDataSet: 서비스 동작 결과 데이터
  
### POST /productivity/BCDesignQuantitativeMgtPerson/pmProgramStatusGrid
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트

#### 응답 (JSON)
- IDataSet: 서비스 동작 결과 데이터
  
### POST /productivity/BCDesignQuantitativeMgtPerson/pmProgramStatusChart1
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트

#### 응답 (JSON)
- IDataSet: 서비스 동작 결과 데이터

### POST /productivity/BCDesignQuantitativeMgtPerson/pmProgramStatusChart2
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트

#### 응답 (JSON)
- IDataSet: 서비스 동작 결과 데이터

### POST /productivity/BCDesignQuantitativeMgtPerson/pmProdectivityPersonListInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트

#### 응답 (JSON)
- IDataSet: 서비스 동작 결과 데이터

### POST /productivity/BCDesignQuantitativeMgtPerson/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- IDataSet requestData: 요청 데이터
- IOnlineContext onlineCtx: 온라인 컨텍스트

#### 응답 (JSON)
- IDataSet: 서비스 동작 결과 데이터
---
## BCDesignProdectivityPersonController API 명세서
### POST /productivity/BCDesignProductivityPerson/pmChargerInq
#### 파라미터 정보
- RequestBody : IDataSet 타입의 요청 데이터에 대한 정보 개체
- onlineCtx : 현재 온라인 세션 컨텍스트 정보
#### 응답 (IDataset)
- 요청된 요청 데이터와 세션에 대해 PM Charger 조회 결과 반환

### POST /productivity/BCDesignProductivityPerson/pmProgramStatusGrid
#### 파라미터 정보
- RequestBody : IDataSet 타입의 요청 데이터에 대한 정보 개체
- onlineCtx : 현재 온라인 세션 컨텍스트 정보
#### 응답 (IDataset)
- 요청된 요청 데이터와 세션에 대해 PM Program Status Grid 조회 결과 반환

### POST /productivity/BCDesignProductivityPerson/pmProgramStatusChart1
#### 파라미터 정보
- RequestBody : IDataSet 타입의 요청 데이터에 대한 정보 개체
- onlineCtx : 현재 온라인 세션 컨텍스트 정보
#### 응답 (IDataset)
- 요청된 요청 데이터와 세션에 대해 PM Program Status Chart1 조회 결과 반환

### POST /productivity/BCDesignProductivityPerson/pmProgramStatusChart2
#### 파라미터 정보
- RequestBody : IDataSet 타입의 요청 데이터에 대한 정보 개체
- onlineCtx : 현재 온라인 세션 컨텍스트 정보
#### 응답 (IDataset)
- 요청된 요청 데이터와 세션에 대해 PM Program Status Chart2 조회 결과 반환

### POST /productivity/BCDesignProductivityPerson/pmProdectivityPersonListInq
#### 파라미터 정보
- RequestBody : IDataSet 타입의 요청 데이터에 대한 정보 개체
- onlineCtx : 현재 온라인 세션 컨텍스트 정보
#### 응답 (IDataset)
- 요청된 요청 데이터와 세션에 대해 PM Prodectivity Person List 조회 결과 반환

### POST /productivity/BCDesignProductivityPerson/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- RequestBody : IDataSet 타입의 요청 데이터에 대한 정보 개체
- onlineCtx : 현재 온라인 세션 컨텍스트 정보
#### 응답 (IDataset)
- 요청된 요청 데이터와 세션에 대해 PM Scope Manager Approval Setting 조회 결과 반환
---
## BCInterfaceProdectivityPersonController API 명세서
### POST /productivity/BCInterfaceProductivityPerson/pmChargerInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 서비스에서 처리된 데이터 셋 응답

### POST /productivity/BCInterfaceProductivityPerson/pmProgramStatusGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 서비스에서 처리된 데이터 셋 응답

### POST /productivity/BCInterfaceProductivityPerson/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 서비스에서 처리된 데이터 셋 응답

### POST /productivity/BCInterfaceProductivityPerson/pmProgramStatusChart2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 서비스에서 처리된 데이터 셋 응답

### POST /productivity/BCInterfaceProductivityPerson/pmProdectivityPersonListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 서비스에서 처리된 데이터 셋 응답

### POST /productivity/BCInterfaceProductivityPerson/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (IDataSet)
- 서비스에서 처리된 데이터 셋 응답
---
## BCSwDevProductivity API 명세서

### POST /productivity/BCSwDevProductivity/pmColListInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트 
#### 응답 (JSON)
- 서비스를 통해 요청한 컬럼 리스트를 반환

### POST /productivity/BCSwDevProductivity/pmSwDevProductivityListInq
#### 파라미터 정보
- requestData : 요청 데이터 세트
- onlineCtx : 온라인 컨텍스트 
#### 응답 (JSON)
- 서비스를 통해 요청한 소프트웨어 개발 생산성 리스트를 반환
---
## BCDesignInterfaceQuantitativeMgtPersonController API 명세서
### POST productivity/BCDesignInterfaceQuantitativeMgtPerson/pmChargerInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 실행 문맥 정보
#### 응답 (IDataSet)
- 수행 결과 데이터

### POST productivity/BCDesignInterfaceQuantitativeMgtPerson/pmProgramStatusGrid
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 실행 문맥 정보
#### 응답 (IDataSet)
- 프로그램 상태 그리드 데이터

### POST productivity/BCDesignInterfaceQuantitativeMgtPerson/pmProgramStatusChart1
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 실행 문맥 정보
#### 응답 (IDataSet)
- 프로그램 상태 차트1 데이터

### POST productivity/BCDesignInterfaceQuantitativeMgtPerson/pmProgramStatusChart2
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 실행 문맥 정보
#### 응답 (IDataSet)
- 프로그램 상태 차트2 데이터

### POST productivity/BCDesignInterfaceQuantitativeMgtPerson/pmProdectivityPersonListInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 실행 문맥 정보
#### 응답 (IDataSet)
- 생산성 인원 목록 조회 데이터

### POST productivity/BCDesignInterfaceQuantitativeMgtPerson/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- IDataSet requestData : 요청 데이터
- IOnlineContext onlineCtx : 실행 문맥 정보
#### 응답 (IDataSet)
- 스코프 매니저 승인 설정 조회 데이터
---
## BCReqQuantitativeMgtPersonController API 명세서
### POST /productivity/BCReqQuantitativeMgtPerson/pmChargerInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PM 담당자 정보를 조회하는 API에 대한 응답 정보를 반환

### POST /productivity/BCReqQuantitativeMgtPerson/pmProgramStatusGrid
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PM 프로그램 상태 그리드 정보를 조회하는 API에 대한 응답 정보를 반환

### POST /productivity/BCReqQuantitativeMgtPerson/pmProgramStatusChart1
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PM 프로그램 상태 차트1 정보를 조회하는 API에 대한 응답 정보를 반환

### POST /productivity/BCReqQuantitativeMgtPerson/pmProgramStatusChart2
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PM 프로그램 상태 차트2 정보를 조회하는 API에 대한 응답 정보를 반환

### POST /productivity/BCReqQuantativeMgtPerson/pmProdectivityPersonListInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PM 생산성 인원 목록 조회하는 API에 대한 응답 정보를 반환

### POST /productivity/BCReqQuantitativeMgtPerson/pmScopeManagerApprovalSettingInq
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- PM 범위 관리자 승인 설정 조회 API에 대한 응답 정보를 반환
---
## BCNTMTestCaseController API 명세서
### POST /api/ntm/BCNTMTestCaseController/pmScenarioGetInNTM
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- service.pmScenarioGetInNTM(requestData, onlineCtx) 실행결과 반환

### POST /api/ntm/BCNTMTestCaseController/pmCaseGetInNTM
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- service.pmCaseGetInNTM(requestData, onlineCtx) 실행결과 반환

### POST /api/ntm/BCNTMTestCaseController/pmDefectGetInNTM
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- service.pmDefectGetInNTM(requestData, onlineCtx) 실행결과 반환

### POST /api/ntm/BCNTMTestCaseController/pmTypeSetInNTM
#### 파라미터 정보
- requestData : 요청 데이터
- onlineCtx : 온라인 컨텍스트

#### 응답 (JSON)
- service.pmTypeSetInNTM(requestData, onlineCtx) 실행결과 반환
---
## BCNTMProjectController API 명세서
### POST /api/ntm/BCNTMProjectController/pmProjectDelInNTM
#### 파라미터 정보
- requestData : 프로젝트 삭제에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트 삭제 결과를 반환 

### POST /api/ntm/BCNTMProjectController/pmSubProjectDelInNTM
#### 파라미터 정보
- requestData : 하위 프로젝트 삭제에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 삭제 결과를 반환 

### POST /api/ntm/BCNTMProjectController/pmProjectUpdInNTM
#### 파라미터 정보
- requestData : 프로젝트 업데이트에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트 업데이트 결과를 반환 

### POST /api/ntm/BCNTMProjectController/pmSubProjectUpdInNTM
#### 파라미터 정보
- requestData : 하위 프로젝트 업데이트에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 업데이트 결과를 반환 

### POST /api/ntm/BCNTMProjectController/pmProjectAddInNTM
#### 파라미터 정보
- requestData : 프로젝트 추가에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 프로젝트 추가 결과를 반환 

### POST /api/ntm/BCNTMProjectController/pmSubProjectAddInNTM
#### 파라미터 정보
- requestData : 하위 프로젝트 추가에 필요한 데이터
- onlineCtx : 온라인 컨텍스트 정보
#### 응답 (JSON)
- 하위 프로젝트 추가 결과를 반환
---
## BCNTMUserController API 명세서
### POST /api/ntm/BCNTMUserController/pmUserSyncInNTM
#### 파라미터 정보
- requestBody (IDataSet requestData) : 클라이언트에서 전달한 데이터셋 정보
- IOnlineContext onlineCtx : 온라인 환경 정보

#### 응답 (JSON)
- IDataSet : 서비스에서 처리한 데이터셋 정보를 반환

---
