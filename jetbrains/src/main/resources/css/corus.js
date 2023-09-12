function copyCode(index) {
    var codeBlocks = document.getElementsByClassName('code-block');
    var codeBlock = codeBlocks[index];
    var textArea = document.createElement('textarea');
    textArea.value = codeBlock.textContent;
    document.body.appendChild(textArea);
    textArea.select();
    document.execCommand('copy');
    document.body.removeChild(textArea);
    alert(codeBlock.textContent);
}