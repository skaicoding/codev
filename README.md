# SKCC Codev Update Site

SKCC Codev의 업데이트 사이트에 오신 것을 환영합니다. 
이 프로젝트는 Eclipse 플러그인의 업데이트 사이트로 사용되며, GitHub Pages 웹호스팅 서비스를 이용하여 `update-site-url` 용도로 활용됩니다.

## 프로젝트 구조

- **features**: 플러그인의 기능과 관련된 내용을 담고 있는 폴더입니다.
- **plugins**: 플러그인 모듈과 관련된 내용을 담고 있는 폴더입니다.
- **downloads**: 사용자가 ZIP 파일로 플러그인을 다운로드하고 설치할 수 있게 제공하는 폴더입니다.
- **artifacts.jar & content.jar**: 업데이트 사이트의 메타데이터와 관련된 파일입니다.
- **index.html**: GitHub Pages를 호스팅할 때 사용자에게 보여지는 초기 페이지의 내용입니다.

## Update-Site-URL 설치 지침

1. Eclipse IDE를 실행하세요.
2. 'Help' > 'Install New Software...'로 이동하세요.
3. 'Work with:'에 다음의 URL을 입력하세요: `https://skaicoding.github.io/codev/`
4. 설치하려는 컴포넌트를 선택하세요.
5. 'Next'를 클릭하고 설치 지침을 따르세요.

**참고:** 설치 과정에서 보안 경고나 서명되지 않은 내용과 관련된 문제가 발생할 경우 아래의 추가 단계를 따라 문제를 해결하세요:
1. 'Install' 대화 상자에서 'Available Software Sites' 링크를 클릭하세요.
2. 'Contact all update sites during install to find required software' 옵션의 체크를 해제하세요.
3. 'OK'를 클릭하고 설치를 계속 진행하세요.

## 업데이트 지침

1. Eclipse IDE를 실행하세요.
2. 'Help' > 'Check for Updates'로 이동하세요.
3. 플러그인에 대한 업데이트가 있으면 목록에 표시됩니다.
4. 업데이트를 완료하기 위한 안내를 따르세요.

추가 도움이나 피드백이 필요하시면 [GitHub issues 페이지](https://github.com/skaicoding/codev/issues/new?assignees=&labels=&projects=&template=bug_report.md&title=)
