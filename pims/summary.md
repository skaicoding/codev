# 파일별 기능 요약

| 파일명 | 내용 |
|---|---|
|com/skcc/pms/PmsBootApplication.java|스프링 부트를 사용한 웹 서딼스 애플리케이션을 초기화하고 실행함.|
|com/skcc/pms/EmbeddedTomcatConfiguration.java|임베디드 Tomcat 서버 설정을 커스텀화하여, 서버 구동 시 리소스를 추출하고 컨텍스트의 재로딩을 비활성화하는 기능을 수행함.|
|com/skcc/pms/BinderControllerAdvice.java|웹 요청 데이터 바인딩시 허용되지 않는 필드(class 관련 필드)를 지정함.|
|com/skcc/pms/configuration/DefaultConfiguration.java|Spring Framework의 애플리케이션 구성을 담당하는 클래스로, 서비스 시작 시 필요한 전반적인 설정을 한다. 이 클래스는 스프링 컨테이너에 로그 설정, 속성 관리, 라벨 관리, 코드 유틸리티, 파일 관리, 배치 관리, 스케줄러 설정 등의 빈을 등록하며, XssEscapeServletFilter를 사용하여 XSS 공격을 방어한다. 또한 애플리케이션의 활성화된 모드를 로그로 출력하는 역할도 수행함.|
|com/skcc/pms/configuration/IeEmulateFilter.java|사용자가 IE를 이용해 사이트에 접속했을 경우, 호환성 보기로 변경하는 기능을 가진 자바 필터 코드임.|
|com/skcc/pms/boot/config/CustomContainer.java|Tomcat 서블릿 웹 서버의 초기 설정을 사용자 지정하는 기능이 있으며, 이를 통해 "mappedfile"의 값을 "false"로 설정함.|
|com/skcc/pms/boot/config/ContextConfig.java|스프링 프레임워크에서 '/config/root-context.xml' 및 '/config/servlet-context.xml' 설정 파일을 불러오는 설정 클래스임.|
|com/skcc/pms/security/SecurityConfig.java|사용자의 인증과 인가를 관리하고, 적절한 엔드포인트의 보안을 관리하는 Spring Security 설정임. 이를 위해 Keycloak 인증 제공자를 사용하며, 특정 경로에 대한 접근 제한 및 권한 부여를 통해 보안을 강화하고 있다.|
|com/skcc/pms/security/CustomKeycloakSpringBootConfigResolver.java|Keycloak을 이용한 스프링 부트 애플리케이션의 보안 설정을 구성하는 코드임.|
|com/skcc/pms/security/controllers/JWTUtil.java|Keycloak 인증 토큰을 통해 JWT 토큰을 추출해 반환하는 기능을 수행함.|
|com/skcc/pms/security/controllers/TokenController.java|JWT 토큰을 생성하여 반환하는 엔드포인트 제공함.|
|com/skcc/pms/bizcomponent/apicall/bcapicallitslinkcontroller/BCITSLinkController.java|클라이언트로부터 받은 데이터를 이용해 이슈 업데이트, 담당자 업데이트, 이슈 상태 업데이트를 하는 REST API를 제공하고, 요청 처리 결과를 JSON 형식으로 응답함.|
|com/skcc/pms/bizcomponent/apicall/bcapicallitslinkcontroller/PUITSLink.java|HTTP 클라이언트를 활용하여 외부 API에 데이터를 전송하고 그 응답을 처리하는 기능, 또한 주어진 파라미터로 특정 SQL 쿼리를 실행하여 결과를 반환하는 기능 등을 수행함. 이러한 과정에서 발생할 수 있는 예외 상황들에 대한 처리도 구현되어 있음.|
|com/skcc/pms/bizcomponent/apicall/bcapicallitslinkcontroller/DUITSLink.java|이슈의 담당자를 업데이트하거나, IT 이슈를 업데이트하고, 이슈 상태를 업데이트하는 세 가지 기능을 가진 클래스임. 각 메소드는 인자로 받은 파라미터를 기반으로 DB에 쿼리를 수행한 후, 결과를 리스트 형태로 반환함.|
|com/skcc/pms/bizcomponent/apicall/bcapicallqmslinkcontroller/BCQmsLinkController.java|웹 요청을 처리하는 Spring 컨트롤러로서, API를 통해 QMS(품질 관리 시스템)와 정보를 교환하는 역할을 함. 이때, 'pmCheckLinkQMS', 'pmUpdateInspectionQMS', 'pmGetInspectionQMS' 세 개의 메소드가 있음. 그 중 'pmUpdateInspectionQMS'는 사용되지 않으며 'pmCheckLinkQMS'와 'pmGetInspectionQMS'는 각각 QMS와 판정을 연동하고, 검사 결과를 가져오는 기능을 수행함.|
|com/skcc/pms/bizcomponent/apicall/bcapicallqmslinkcontroller/PUQmsLink.java|해당 코드는 API를 통하여 데이터를 읽어들이고, 이를 통해 프로젝트의 질 관리 시스템(QMS) 정보를 업데이트하거나 가져오는 작업을 수행함. 또한 가져온 API 데이터를 DB에 저장하는 함수도 포함되어 있음.|
|com/skcc/pms/bizcomponent/apicall/bcapicallqmslinkcontroller/DUQmsLink.java|데이터베이스의 조회, 삽입, 업데이트, 삭제 등의 작업을 수행하며, 특히 레벨별 유형과 시나리오에 관한 데이터를 다루는 기능들을 가지고 있음. 특정 유형이나 시나리오에 대한 정보를 가져오거나, 새로운 정보를 삽입하거나 기존 정보를 수정하거나 삭제하는 등의 작업을 수행함. 주로 연결 정보를 관리하는데 사용됨.|
|com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BCTmsLinkController.java|'TMS'와 'PMS'간 테스트 유형, 시나리오, 수행 집계, 결함 집계 등을 동기화하고, 동기화 여부를 확인하는 웹 서비스를 제공함.|
|com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BatTmsTestExecProgressRepository.java|데이터베이스와 연결해 BatTmsTestExecProgress 객체를 저장하는 데 필요한 기능을 수행함. 데이터베이스에 이미 해당 객체가 존재하면 업데이트하고, 그렇지 않으면 새로운 정보를 삽입함.|
|com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/PUTmsLink.java|이 코드는 서버 클라이언트간 HTTP 통신을 수행하여 테스트 유형 동기화, 유형시나리오 동기화, 수행집계 커버리지 업데이트, 결함집계 커버리지 업데이트, 프로젝트 연계여부 확인 등의 작업을 수행하고 그 결과를 데이터베이스에 저장하는 기능을 수행함. 또한 작업 진척도를 확인하고 WBS(Work Breakdown Structure)를 설정하는 기능도 있음.|
|com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/DUTmsLink.java|데이터베이스에서 다양한 정보를 선택, 삽입, 업데이트, 삭제하는 기능을 가진 클래스임. 이 클래스는 특히 테스트 관리 시스템(TMS)와 프로젝트 관리 시스템(PMS) 인터렉션에 초점을 맞추고 있으며, 레벨 유형 관련 정보, 시나리오 관련 정보, 세부 테스트 정보, 집계 이력 등을 처리함.|
|com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BatTmsTestExecProgress.java|객체의 속성을 저장하고 조회하는 기능을 수행하는 클래스임. 그 속성들 중에는 시나리오 이름, 업데이트 날짜, 프로젝트 번호 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BatTmsTestExecProgressService.java|입력된 맵 리스트를 받아 각각의 맵을 'BatTmsTestExecProgress' 객체로 변환 후 저장하는 기능 수행함. 맵에서 정보를 추출하여 'BatTmsTestExecProgress' 인스턴스의 필드들을 설정하고, 이를 저장소에 저장함.|
|com/skcc/pms/bizcomponent/apicall/bcapicallportallinkcontroller/BCPortalLinkController.java|POST 방식으로 'api/v1/BCApiPortal/sendAlarmMessage' 요청을 받아 알람 메시지를 보낼 수 있는 기능을 가진 컨트롤러임.|
|com/skcc/pms/bizcomponent/apicall/bcapicallportallinkcontroller/PUPortalLink.java|특정 프로젝트의 알람 메시지를 Slack으로 전송하는 기능을 수행함. 지정된 포털 URL을 통해 알람 메시지, 프로젝트 번호, 발신자 ID 등의 정보를 담아 HTTP POST 요청을 보내고 해당 메시지가 성공적으로 전송되었는지 확인하는 응답을 받음.|
|com/skcc/pms/bizcomponent/tok/bctokmain/DUTokMain.java|현재 진행 중인 프로젝트 목록을 데이터베이스에서 조회하는 기능을 가짐.|
|com/skcc/pms/bizcomponent/tok/bctokmain/BCTokMainController.java|현재 진행 중인 프로젝트 목록을 조회하는 웹 서비스 기능을 제공함.|
|com/skcc/pms/bizcomponent/tok/bctokmain/PUTokMain.java|현재 프로젝트 목록 조회를 위한 처리 결과값을 반환하는 기능 수행.|
|com/skcc/pms/bizcomponent/tok/bctokboardretrieve/PUTokBoardRetrieve.java|게시판의 CRUD (생성, 조회, 수정, 삭제) 작업과 사용자 목록 조회, 프로젝트 관리 기능을 수행하는 서비스임. 이 때 각 메소드는 데이터 처리 후 처리 결과를 데이터셋으로 반환함.|
|com/skcc/pms/bizcomponent/tok/bctokboardretrieve/BCTokBoardRetrieveController.java|게시판 조회, 게시글 단일 조회, 게시글 등록, 게시글 삭제, 사용자 목록 조회, 프로젝트 관리 등의 기능을 수행하는 웹 요청을 처리함.|
|com/skcc/pms/bizcomponent/tok/bctokboardretrieve/DUTokBoardRetrieve.java|토크 보드 게시판에 대한 정보를 조회하고, 업데이트하며, 추가하고, 삭제하는 기능을 제공하는 클래스임. 또한, 사용자 목록을 조회하고 프로젝트 목록을 가져오는 기능도 포함하고 있음.|
|com/skcc/pms/bizcomponent/prdtvy/bcresourcemngr/PUResourceMngr.java|자원 관리를 위해 CRUD(Create, Read, Update, Delete)와 같은 다양한 기능을 수행하는 서비스임. 특히, 프로젝트 자원정보 조회, 저장, 사용자 조회, 기간 조회, 세부정보 조회, 이력 조회 등의 작업을 담당하고, 엑셀 파일 내보내기 및 가져오기 기능도 있음. 작업 과정에서 예외가 발생하면 적절한 예외 처리를 수행함.|
|com/skcc/pms/bizcomponent/prdtvy/bcresourcemngr/BCResourceMngrController.java|자원 관리에 관련된 여러 기능들을 제공하는 웹 컨트롤러임. 목록 조회, 저장, 사용자 조회, 엑셀 내보내기 및 가져오기, 기간 관련 조회 및 저장, 상세 정보 조회 및 저장과 같은 동작을 HTTP 요청을 통해 처리할 수 있음.|
|com/skcc/pms/bizcomponent/nexcorelink/dto/ProjectLinkMapVo.java|프로젝트와 관련된 정보(서비스 ID, 연계도구 코드, 프로젝트 코드, 프로젝트 명 등)를 저장하고, 각 정보를 불러오거나 수정하는 기능을 가진 자바 클래스임.|
|com/skcc/pms/bizcomponent/nexcorelink/dto/NciTargetVo.java|'NciTargetVo' 클래스는 NCI 타겟 정보를 저장하고 관리하기 위한 것으로, linkRowid, targetId, targetName, languageType, etc, projectNo, subProjectNo 등의 필드를 가지고 각 필드를 설정하거나 가져오는 메서드를 제공함.|
|com/skcc/pms/bizcomponent/nexcorelink/dao/NciDao.java|MyBatis와 SqlSessionTemplate를 이용해 데이터베이스에서 'nci_target'과 'nci_result' 테이블의 데이터 조회, 수정 및 추가 기능을 수행하는 DAO임.|
|com/skcc/pms/bizcomponent/nexcorelink/dao/ProjectLinkMapDao.java|MyBatis를 이용해 DB에서 'ProjectLinkMap' 관련 데이터를 조회, 추가, 수정 및 삭제하는 기능을 가진 DAO 클래스 구현임. 특정 서비스 ID와 도구 구분 코드를 가진 프로젝트 목록을 조회하는 메서드도 포함하고 있음.|
|com/skcc/pms/bizcomponent/nexcorelink/dao/AppqDao.java|MyBatis를 사용하여 데이터베이스에서 데이터의 개수를 가져오거나, 데이터를 추가하거나, 데이터를 수정하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/nexcorelink/controller/ProjectLinkMapController.java|프로젝트 링크 맵 정보를 가져오고, 리스트를 받아오며, 업데이트하고, 등록하고, 삭제하고, 링크를 해제하는 기능을 구현한 웹 서버 컨트롤러로, SQL 에러나 시스템 에러 발생 시, 적절한 에러 메시지를 반환하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/nexcorelink/controller/AppqController.java|프로젝트 데이터와 프로젝트 리스트를 동기화하는 메서드를 포함하며, 데이터베이스 오류와 시스템 에러에 대한 예외처리 기능을 가진 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/nexcorelink/service/AppqInterfaceService.java|APPQ(어플리케이션 품질) 데이터를 관리하며, 모든 APPQ 서버와 특정 서버를 동기화하고, APPQ 프로젝트 리스트와 점검결과를 동기화하는 기능을 함. 이를 통해 APPQ 데이터를 주기적으로 업데이트하고 관리함.|
|com/skcc/pms/bizcomponent/nexcorelink/service/NciInterfaceService.java|NCI 서버와 연동하는 서비스를 제공하며, 모든 NCI 서버와의 동기화, 개별 서버와의 동기화, 프로젝트 리스트 동기화, 타겟 리스트 동기화, 타겟 점검 결과 동기화 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/nexcorelink/service/ProjectLinkMapService.java|프로젝트 링크 매핑 정보를 조회, 등록, 수정, 삭제하고 특정 링크 코드를 비활성화하는 기능을 가진 서비스임.|
|com/skcc/pms/bizcomponent/progress/bcaccumprogressmanager/PUAccumProgressManager.java|스프링 프레임워크를 사용하여 요청된 정보를 처리하고 결과를 반환하며, 에러가 발생하면 로그를 작성하고 예외를 발생시키는 비즈니스 로직을 처리하는 클래스임.|
|com/skcc/pms/bizcomponent/progress/bcaccumprogressmanager/DUAccumProgressManager.java|프로젝트의 진척률 정보를 관리하는 로직들로, 주요 기능으로는 진척률 정보 조회, 조회 기간에 따른 날짜 배열 계산, 그리드 업데이트 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/progress/bcaccumprogressmanager/BCAccumProgressManagerController.java|여러 개의 프로젝트 관련 정보를 조회하고 업데이트하는 웹 API를 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/ifproject/service/ProjectInterfaceService.java|APPQ 서버와 동기화하여 프로젝트 데이터를 갱신하고, 프로젝트의 점검 결과를 동기화하는 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitybatchmanager/PUUpdatedListHistoryBatchManager.java|주어진 데이터를 받아 서로 다른 네 개의 이력(개발 생산성 이력, 월별 리소스 이력, 주별 리소스 이력, 기본 날짜 이력)을 저장하고, 이를 응답 데이터로 반환하는 기능 구현. 실패 시 비즈니스 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitybatchmanager/DUUpdatedListHistoryBatchManager.java|데이터 업데이트 이력을 관리하기 위한 메서드들을 포함하고 있는데, 요청된 데이터로 특정 이력을 삭제하고 삽입하는 기능을 수행함. 이러한 기능들은 개발자원 관리, 월 단위 리소스, 주 단위 리소스, 기준일자 등 다양한 이력을 저장할 수 있음.|
|com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitymanager/PUDevProductivityManager.java|개발 생산성 관리를 위한 다양한 기능을 포함한 스프링 서비스 클래스임. 기능에는 엑셀 데이터 업로드 및 다운로드, 개발 생산성 데이터의 조회/추가/수정/삭제, 사용자 ID조회, 프로젝트의 PL(프로젝트 리더) 정보 조회, 작업명 조회, 파일 다운로드 및 삭제 등이 있음.|
|com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitymanager/BCDevProductivityManagerController.java|프로젝트의 생산성과 관련된 데이터를 관리하는 웹 애플리케이션의 컨트롤러를 정의함. 기능으로는 엑셀 파일 다운로드, 파일 관리, 데이터 조회 및 수정, 엑셀 업로드, 탭 설정 조회 및 수정, 데이터 추가 및 삭제 등이 있음. 이러한 작업들은 특정 웹 요청에 따라 수행되며, 결과는 JSON 형식으로 반환됨.|
|com/skcc/pms/bizcomponent/scope/bcswingasispgmmanager/DUSwingAsisPgmManager.java|데이터베이스의 정보를 관리하고 엑셀 데이터를 불러오는 등 다양한 기능을 가진 소스 코드입니다. 이 코드는 데이터의 조회, 저장, 수정, 삭제, 엑셀 데이터 업로드 및 다운로드 등의 기능이 포함돼 있습니다. 또한, 이 코드는 요청 정보를 처리하고 처리 결과를 리턴하는 메소드를 제공합니다. 이를 위해 필요한 필드 정보를 가져오거나 요청 정보를 저장하는 등의 업무를 수행합니다.|
|com/skcc/pms/bizcomponent/scope/bcswingasispgmmanager/PUSwingAsisPgmManager.java|해당 코드는 요청된 데이터 셋에 따라서 데이터 조회, 저장, 수정, 삭제 기능을 제공하고 엑셀 데이터를 읽어 처리하거나 데이터를 엑셀 형식으로 제공하는 등의 엑셀 관련 기능도 수행하는 서비스입니다. 마지막으로 특정 코드를 확인하는 기능도 제공합니다.|
|com/skcc/pms/bizcomponent/scope/bcswingasispgmmanager/BCSwingAsisPgmManagerController.java|스프링 프레임워크를 이용해 웹 서버를 구현하고, 클라이언트의 요청에 따라 데이터 조회, 수정, 저장, 삭제 등을 처리하고 엑셀 데이터를 다운로드하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcsqualityimprovementtools/DUSQualityImprovementTools.java|이 코드는 데이터셋 요청 정보를 이용하여 데이터를 조회, 삽입, 업데이트, 삭제하고 엑셀 파일을 업로드하는 기능을 수행함. 또한, 여러 품질 지표에 대한 데이터를 받아서 데이터베이스에 접근하고, 해당 데이터에 대한 검증을 수행함. 그리고 특정 조건에 맞지 않는 데이터를 찾아내는 검증 코드를 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcsqualityimprovementtools/PUSQualityImprovementTools.java|프로젝트 체크, 요구사항 범위 목록 조회, 시스템 코드 추가/수정/삭제, 엑셀 업로드 등을 위한 기능을 구현하는 자바 서비스 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcsqualityimprovementtools/BCSQualityImprovementToolsController.java|웹 요청을 처리하는 여러 메소드를 가진 컨트롤러로, 이 메소드들은 엑셀 업로드, 요구사항 범위 조회, 시스템 코드 관리(추가, 업데이트, 삭제), 프로젝트 검증 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bccheckriskexecution/BCCheckRiskExecutionController.java|안전한 통신(mathod를 통해 데이터를 주고 받는)을 위한 RESTful 방식의 컨트롤러 코드로, 경로는 'scope/BCCheckRiskExecution'이며 이를 통해 데이터 조회, 업데이트, 삭제, 엑셀 파일 다운로드 및 업로드, 상세 정보 및 진행률 조회 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bccheckriskexecution/DUCheckRiskExecution.java|다양한 데이터에 대한 조회, 추가, 업데이트, 삭제 같은 기본 데이터 처리 기능 뿐만 아니라, 파일 업로드, 엑셀 파일 읽기 및 다운로드, 일괄 처리(batch) 작업 등의 데이터 관리 기능을 수행하는 Java 프로그램 코드임. 또한, 사용자 권한 검증, 데이터 포맷 검증, 에러 처리 등의 부가적인 기능도 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bccheckriskexecution/PUCheckRiskExecution.java|사용자의 요청을 받아 데이터 처리와 엑셀 작업, 파일 관리 등 다양한 기능을 수행하는 비즈니스 로직 클래스임. 이 클래스는 요구사항 범위 목록 조회, 추가, 업데이트, 그리드 업데이트, 첨부 파일 목록 조회, 삭제 등을 수행하며, 엑셀 데이터 업로드 및 다운로드, 프로그래스 레이트 조회, 엑셀 전체 다운로드 등의 역할을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcteststatusforcharger/BCTestStatusForChargerController.java|BCTestStatusForChargerController는 PUTestStatusForCharger 서비스를 이용하여 테스터를 위한 상태확인, 충전기 목록 조회, 특정 충전기의 상태확인과 같은 기능을 제공하는 웹 애플리케이션 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcteststatusforcharger/PUTestStatusForCharger.java|요청 데이터를 받아 처리 후 결과 값을 반환하며, 처리 도중 예외 상황 발생 시 해당 예외를 처리하는 기능이 포함된 서비스임. 이 서비스 내의 메소드는 각각 액션 충전기의 상태(setOkResultMessage를 이용한 메시지 저장 포함), 테스터의 상태, 충전기의 목록 조회와 관련된 로직을 실행함.|
|com/skcc/pms/bizcomponent/scope/bcteststatusforcharger/DUTestStatusForCharger.java|조치자와 테스터의 상태를 조회하고, 해당 정보에 따라 다른 차트를 생성하거나, 그리드를 조회하는 기능이 있음. 추가적으로 조치자와 테스터 목록을 조회하는 기능도 있음.|
|com/skcc/pms/bizcomponent/scope/bcprogramdevwoori/PUProgramDevWoori.java|주어진 요청에 따라 여러 데이터 조회, 수정, 삭제, 파일 업로드 및 다운로드 등 다양한 데이터 관리 작업을 수행하는 비즈니스 로직 처리 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcprogramdevwoori/BCProgramDevWooriController.java|웹 애플리케이션의 다양한 요청들을 처리하고 관련된 서비스와 통신하여 데이터를 교환하는 컨트롤러 클래스임. 이 컨트롤러는 주로 파일 다운로드/업로드, 데이터 조회 및 업데이트, 데이터 삭제 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestplanperform/DUTestPlanPerform.java|드롭된 데이터베이스 테이블에 존재하는 데이터의 조회, 생성, 수정, 삭제 작업을 수행하며 그에 대한 로직 검증과 엑셀 데이터의 처리 등의 작업을 수행하는 클래스임. 또한, 파일 업로드 기능과 이미지 관련 작업, XML 문서 처리 등의 부가적인 기능도 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestplanperform/PUTestPlanPerform.java|테스트 계획 수행과 관련된 데이터 처리를 담당하는 서비스 클래스로, 요청 정보를 받아서 리스트 조회, 테스트 계획 수행 항목 추가, 수정, 삭제, 전체 다운로드, Excel 업로드, 통합 그리드 업데이트 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestplanperform/BCTestPlanPerformController.java|테스트 계획 수행과 관련된 REST API 컨트롤러로, 테스트 계획 리스트 조회, 테스트 계획 추가, 수정, 삭제, 엑셀 데이터 다운로드, 엑셀 데이터 업로드, 테스트 계획 파일 리스트 조회, 테스트 계획 파일 조회 및 삭제, 이미지 조회 및 삭제 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bctestexecution/PUTestExecution.java|요구사항 범위 목록을 조회, 추가, 수정, 그리드 업데이트, 파일 목록 조회, 파일 삭제, 엑셀 파일 업로드 및 다운로드, 요구사항 범위 삭제, 요구사항 범위 이력 조회, 요구사항 변경 검증, 진행률 조회 등의 다양한 기능을 수행하는 코드임.|
|com/skcc/pms/bizcomponent/scope/bctestexecution/BCTestExecutionController.java|여러가지 요청(url 맵핑 주소)에 따라 실행해야 할 업무(작업 or 서비스)들을 처리하고 결과를 반환하는 웹 애플리케이션 컨트롤러 구현임.|
|com/skcc/pms/bizcomponent/scope/bctestexecution/DUTestExecution.java|Excel 파일에서 데이터를 추출하여 데이터베이스에 자료를 입력하고, 업로드된 파일의 정보를 처리하는 기능을 수행함. 또한, 엑셀 파일을 생성하거나 불러오는 기능, 파일에 대한 정보를 데이터베이스에 저장하거나 조회하는 기능도 함. Excel 파일의 정보를 데이터베이스에 업데이트하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bccheckriskplan/DUCheckRiskPlan.java|위 코드는 저장소에서 각 프로젝트의 리스크 계획을 체크하고 관리하기 위한 기능을 수행하는 클래스입니다. 이 코드는 데이터를 조회, 삽입, 업데이트, 삭제하는 등의 기능을 포함하고 있으며, 필요에 따라 파일을 업로드하거나 다운로드 할 수도 있습니다. 코드는 다국어 지원을 위해 언어 설정에 따라 다른 메시지를 출력하도록 구성되어 있습니다.|
|com/skcc/pms/bizcomponent/scope/bccheckriskplan/PUCheckRiskPlan.java|요구사항 작업 계획과 정보 업데이트, 파일 업무 로직 처리, 프로젝트 상태 관리 등을 처리하기 위한 메서드들이 포함된 서비스 클래스임. 이 서비스 클래스는 데이터 요청 정보를 데이터 집합 형식으로 받아 해당 업무 로직을 수행하고 결과 데이터 집합을 반환함.|
|com/skcc/pms/bizcomponent/scope/bccheckriskplan/BCCheckRiskPlanController.java|스프링 프레임워크를 사용하여 여러 데이터 조작 작업(조회, 추가, 수정, 삭제)을 수행하고 엑셀 파일 검색/업로드/다운로드 등의 기능을 제공하는 컨트롤러 기능 수행.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsvocscopemanager/PURequirementsVocScopeManager.java|이 코드는 요구 VOC 범위를 관리하기 위한 여러 기능을 제공하는 서비스 클래스임. 조회, 추가, 삭제, 엑셀 다운로드 및 업로드 등의 기능을 포함하며, 각 기능은 입력 데이터셋을 받아 처리 결과를 데이터셋으로 반환함. 특히, 엑셀 업로드 기능에서는 업로드된 파일을 읽어 데이터를 저장하며, 오류 발생 시 오류 메시지를 반환하도록 처리되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsvocscopemanager/DURequirementsVocScopeManager.java|사용자로부터 입력된 요청 정보를 바탕으로 데이터를 CRUD (create, read, update, delete) 하는 기능과, 실패한 데이터를 엑셀 형식으로 추출하거나, 엑셀 파일 업로드 다운로드, 요청 제기자 별 리뷰 기능 등을 관리하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsvocscopemanager/BCRequirementsVocScopeManagerController.java|요구사항 VOC 범위를 관리하기 위한 컨트롤러로, 엑셀 다운로드, VOC 범위 항목의 추가, 수정, 삭제, 엑셀 업로드, 파일 조회 및 삭제, 검토회의 목록 조회 등의 기능 제공.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerforhk/BCRequirementsScopeManagerForHKController.java|특정 프로젝트의 요구 사항 범위를 관리하기 위한 HTTP endpoint를 제공하고, 요구 사항 목록 조회, 요구 사항 추가, 업데이트, 삭제 등의 기능을 담당하며, 엑셀 파일로의 다운로드 및 업로드 기능도 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerforhk/DURequirementsScopeManagerForHK.java|이 코드는 서비스 사양에 따라 요구 사항 범위를 관리하는 등 다양한 기능을 수행하는 비즈니스 로직을 포함하고 있다. 기능들은 요구사항 범위 조회, 추가, 업데이트, 파일 업로드 및 다운로드, 요구사항 삭제 등을 포함하며, 각 요구사항에 대한 세부 정보를 조회하거나 엑셀 형식으로 다운로드할 수도 있다. 이뿐만 아니라, 요구사항의 첨부 파일 리스트 조회, 삭제, 프로그레스 비율 조회와 같은 부가적인 기능도 제공한다.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerforhk/PURequirementsScopeManagerForHK.java|사용자의 요구사항 목록 조회, 추가, 수정, 업로드, 다운로드 등의 기능을 제공하고 요구사항과 관련된 파일의 리스트 조회, 파일 삭제 등의 기능을 포함한 일련의 서비스를 제공하는 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcinterfacedevmanager/PUInterfacedevManager.java|스프링 기반의 Java 코드로, "scope.BCInterfacedevManager" 서비스를 제공하고 있으며, 주요 기능은 데이터 조회, 처리 결과 획득, 파일 업로드 및 다운로드, 엑셀 파일 관리 등이 포함됨. 또한, 특정 기능 실행 시 필요한 에러 처리도 함께 구현되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcinterfacedevmanager/BCInterfacedevManagerController.java|프로젝트 관리 서비스를 제공하는 웹 레이어 컨트롤러로, 요청에 따라 엑셀 파일 다운로드, 파일 조회, 파일 삭제, 데이터 업데이트 등 다양한 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestdefectmanagementit/PUTestDefectManagementIt.java|IT 결함 관리를 위한 다양한 기능들을 제공하는 클래스 파일로, 결함 추가, 업데이트, 삭제, 메시지 처리, 파일 업로드, 엑셀 업로드, 이미지 조회, 이미지 삭제 등 다양한 메소드를 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bctestdefectmanagementit/BCTestDefectManagementItController.java|특정 IT 시스템의 결함을 관리하기 위해 조회, 추가, 수정, 삭제 등의 기능을 제공하고, 엑셀 파일로의 다운로드 및 업로드, 이력 조회, 이미지 조회 및 삭제, 차트 및 그리드 뷰 제공 등의 여러 기능을 포함하는 웹 컨트롤러임. |
|com/skcc/pms/bizcomponent/scope/bctestdefectmanagementit/DUTestDefectManagementIt.java|엑셀 파일에 있는 결함을 관리하는 기능을 가진 프로그램 코드임. 기능에는 엑셀 파일을 읽어 결함을 관리하거나, 결함 상태를 업데이트하는 등의 기능이 있음. 첨부파일을 업로드하거나 이미지를 삭제하는 등의 추가 기능도 있음. 그 밖에도 결함 히스토리 조회, 결함 상태 그래프 조회 등의 기능을 수행할 수 있음.|
|com/skcc/pms/bizcomponent/scope/bccheckriskdashboard/DUCheckRiskDashBoardMgr.java|사용자의 요청에 따라 데이터를 조회하고 그 결과를 반환하는 기능을 수행함. 요청타입에 따라 해당 요청을 처리하며, 주로 데이터베이스에서 정보를 추출해 사용자에게 반환하는 것이 주요 업무임. 이 중에서도 "grid1_select", "grid2_select", "grid3_select" 등의 함수를 통해 특정 데이터를 조회함. 이외에도 "code_select"로 요청시 여러 개의 데이터를 조회하여 일련의 레코드셋으로 반환함.|
|com/skcc/pms/bizcomponent/scope/bccheckriskdashboard/BCCheckRiskDashBoardMgrController.java|특정 경로로의 요청을 처리해서 리스크 대시보드 관리의 품질 검사 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcrmcompletewb/DURmCompleteWB.java|입력된 코드는 다음과 같이 업무 측면에서 요청을 처리하는 기능이 구현되어 있음: * 사용자가 요구한 데이터셋에 따라 동작하는 다양한 메서드들이 포함되어 있음. * 요구사항 정의, 범위 관리, 요구사항 상태 이력, 첨부파일 정보, 마감일, 파일 업로드/다운로드 등에 관한 처리가 주요 기능으로 구현되어 있음.  * 특히, 이 광범위한 기능들 중 대부분은 데이터베이스와의 상호작용을 통해 이뤄지며, 결과는 주로 IDataSet 형태로 반환됨.  * 데이터베이스 조회, 수정, 삭제 등의 기능이 메소드 형태로 정의되어 있음.  * 스프링 프레임워크의 Repository 어노테이션이 클래스에 적용되어 있어, 스프링이 해당 클래스를 데이터 접근 계층(Component)로 인식하고 관리하도록 설정되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrmcompletewb/BCRmCompleteWBController.java|HTTP 요청에 따라 다양한 요구사항의 CRUD 작업을 처리하고, 엑셀 파일의 업로드/다운로드 기능도 제공하는 웹 서비스.|
|com/skcc/pms/bizcomponent/scope/bcrmcompletewb/PURmCompleteWB.java|사용자의 요청 정보를 기반으로, 데이터 조회, 추가, 업데이트, 삭제 등의 작업을 데이터베이스와 연동하여 처리하고, 그 결과를 반환하는 여러 메소드를 포함하고 있음. 이 메소드들은 요구 사항 리스트 조회, 요구 사항 추가, 업데이트, 엑셀 파일 업로드 및 다운로드, 그리고 요구 사항 이력 조회 등의 작업을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcproductsdefect/PUProductsDefect.java|상품 불량에 대한 정보를 조회하고, 조작하는 등에 대한 다양한 기능을 가진 클래스임. 이 중에서 특정 요구사항에 대한 목록 조회, 추가, 업데이트, 엑셀 파일의 업로드와 다운로드 등의 기능이 있음. 그 밖에도 XMPP를 통한 메시지 전송, 이미지 조회 및 삭제 등의 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcproductsdefect/DUProductsDefect.java|요구사항 관리에 필요한 다양한 CRUD 기능을 수행하는 코드임. 사용자로부터 입력받은 데이터를 데이터베이스에 등록하고, 특정 조건에 맞는 데이터를 조회하거나, 기존 데이터를 수정하거나 삭제하는 기능이 포함되어 있음. 또한 엑셀 파일을 업로드하거나 다운로드하는 기능, 알림 메시지를 전송하는 기능, 이미지를 불러오거나 삭제하는 기능 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcproductsdefect/BCProductsDefectController.java|제품 결함을 처리하는 다양한 기능을 제공하는 컨트롤러 클래스로, 결함 목록 조회, 결함 추가, 수정 및 제거, 이미지 조회 및 제거, 엑셀 파일 다운로드 및 업로드, 테스트 상태 그리드 및 차트 관련 정보 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcdesignretrievehk/BCDesignRetrieveHKController.java|웹 프로젝트 관리용 Controller에서 사용되는 여러 요청을 실행하며, 각 요청은 데이터 조회, 업데이트, 추가, 삭제 등의 기능 수행과 엑셀 파일 다운로드, 업로드 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcdesignretrievehk/DUDesignRetrieveHK.java|이 코드는 SK Telecom의 IT 프로젝트 관리 시스템인 'PMS'에서 프로젝트 요건 및 디자인 정보를 조회, 추가, 수정, 삭제하는 기능을 담당하는 클래스임. 사용자의 요청 정보를 파라미터로 받아 데이터베이스와 연동하여 필요한 정보를 처리하고 결과를 반환하는 역할을 수행함. 유효성 검사, 에러 처리, 코드 변환, 파일 업로드 및 다운로드 등을 포함하고 있으며, 데이터를 엑셀 파일로 변환하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcdesignretrievehk/PUDesignRetrieveHK.java|사용자의 요청 정보에 따른 DUDesignRetrieveHK 클래스를 통해 데이터 추출 및 변경, 혹은 서비스 제공을 수행하는 기능을 가진 클래스임. 주요 기능으로는 데이터 추출, 추가, 수정, 삭제, 엑셀 파일 업로드 및 다운로드, 이력 조회, 프로젝트 번호 얻기 등이 있음.|
|com/skcc/pms/bizcomponent/scope/bcproceedings/BCProceedingsController.java|프로젝트 조회, 엑셀 업로드, 파일 삭제, 엑셀 및 파일 다운로드, 첨부 파일 목록 조회, 레벨 목록 조회, 회의록 추가/업데이트/삭제, 회의록 히스토리 조회 등의 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcproceedings/DUProceedings.java|해당 코드는 PMS(프로젝트 관리 시스템)의 범위 관리 모듈에서 회의 프로시저를 처리하는 비즈니스 컴포넌트로, 데이터 조회, 추가, 수정, 삭제, 첨부파일 업로드 및 다운로드, 데이터 엑셀 업로드 및 다운로드 등의 기능을 담당하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcproceedings/PUProceedings.java|프로젝트의 범위 관리를 위한 서비스를 제공하며, 엑셀 파일의 업로드/다운로드, 수준 목록 조회, 프로젝트 및 첨부 파일 처리, 재판매 및 재판매 이력 관리 등의 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcchangelistmanagement/PUChangeListManagement.java|변경 목록 관리를 위한 비즈니스 로직을 처리하는 서비스로, 그리드 데이터를 처리하고, 엑셀 파일을 다운로드하며, 데이터를 삭제하고, 구분 코드를 검색하는 기능이 있다.|
|com/skcc/pms/bizcomponent/scope/bcchangelistmanagement/DUChangeListManagement.java|데이터 관리와 관련된 업무를 수행하는 클래스로, 특정 데이터의 그리드 화면 조회, 엑셀 다운로드, 삭제, 코드 검색 등의 함수를 제공함.|
|com/skcc/pms/bizcomponent/scope/bcchangelistmanagement/BCChangeListManagementController.java|클라이언트의 요청을 처리하여 관련 정보를 반환하고, 서비스에서 제공하는 기능을 이용하여 변경 목록을 관리하며, 엑셀 파일을 다운로드하는 기능을 포함한 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcrmtracemain/PURmTraceMain.java|여러 요청에 따라 데이터를 관리하고 엑셀 파일을 다운로드하거나 업로드하는 등의 기능을 수행하는 클래스임. 또한, 데이터를 검색, 추가, 업데이트, 삭제하는 메소드도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrmtracemain/DURmTraceMain.java|지정된 데이터 세트를 바탕으로 데이터 구조를 조회, 수정, 추가, 삭제하는 기능을 수행하는 코드로, 이를 이용해 요구사항 추적 테이블, 요구사항 상세 정보 등을 관리하고 특정 조건에 따른 조건 목록을 조회하거나 엑셀 파일을 생성하고 업로드하는 기능을 지원함.|
|com/skcc/pms/bizcomponent/scope/bcrmtracemain/BCRmTraceMainController.java|웹 요청에 따라 요구사항 추적 정보를 조회, 수정, 삭제, 추가, 엑셀 다운로드, 엑셀 업로드 하는 서비스를 제공하며, 부가적으로 팝업 창에서 사용되는 콤보박스 정보를 불러오는 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrmmanagementverbalagreement/PURmManagementVerbalAgreement.java|SKCC 프로젝트의 요구사항 범위 관리 모듈에서 사용되는 여러가지 기능을 구현한 코드임. 코드 내용을 살펴보면 주요 기능으로 설계 단계 조회, 요구사항 범위 추가, 삭제, 업데이트, 엑셀 다운로드, 엑셀 업로드, 파일 리스트 조회 등이 포함되어 있음. 이 외에도 각 요구사항에 대한 상세 정보 조회나 동시성 체크 등의 부가 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrmmanagementverbalagreement/BCRmManagementVerbalAgreementController.java|사용자 요청에 따라 다양한 동작 수행을 위한 컨트롤러로, 요구사항 범위 관리, 파일 업로드 및 다운로드, 검색, 이력 조회, 프로젝트 조회와 같은 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcrmmanagementverbalagreement/DURmManagementVerbalAgreement.java|사용자에게 데이터셋 객체 요청 정보를 받아 처리하고 처리 결과를 반환하는 다양한 기능들을 포함하는 자바 코드임. 이 기능들은 파일 업로드, 엑셀 파일다운로드, 요구사항 조회, 요구사항 추가, 삭제, 업데이트 등을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcprogramdevretrievewoori/NTMInfomation.java|데이터베이스 연결 설정 정보를 관리하고, 연결 URL을 생성하고, 연결 설정에 필요한 정보를 requestData에 설정하는 기능을 가짐.|
|com/skcc/pms/bizcomponent/scope/bcprogramdevretrievewoori/BCProgramDevRetrieveWooriController.java|사용자의 요청을 처리하고 관련 데이터를 반환하는 여러 웹 서비스를 제공하는 컨트롤러로, 엑셀 업로드 및 다운로드, 스코프 추가, 업데이트, 삭제, 업무명 조회, 사용자 ID 코드 조회, 승인 설정 조회 등의 기능이 존재함.|
|com/skcc/pms/bizcomponent/scope/bcprogramdevretrievewoori/PUProgramDevRetrieveWoori.java|프로젝트 범위 관리와 관련된 다양한 기능을 수행하는 서비스 클래스임. 엑셀 파일을 업로드하여 데이터를 등록하거나, 특정 프로젝트의 범위를 조회하고, 프로젝트 사용자 아이디 코드를 찾는 기능이 포함되어 있음. 또한, 프로젝트 진행상황을 확인하거나, 이슈를 관리하고, 작업을 할당하고, 승인설정, 작업일수 조회, 프로젝트 범위 추가/수정/삭제 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingexecution/PUCheckCascadingExecution.java|요구사항 범위의 목록 조회, 추가, 수정, 그리드 업데이트, 파일 목록 조회, 파일 삭제, 범위 삭제, 엑셀 다운로드, 엑셀 업로드, 진도률 조회 등의 기능을 수행하는 비즈니스 서비스 클래스임. 각 기능은 대응하는 메서드를 통해 수행되며, 각 메서드는 요청 정보를 매개변수로 받아 처리 결과를 반환함.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingexecution/DUCheckCascadingExecution.java|사용자가 요청한 정보를 받아 데이터베이스에 저장하거나 데이터베이스에서 정보를 읽어 사용자에게 전달하는 기능을 수행하는 다양한 메소드들로 구성된 클래스임. 주요 기능으로는 요구사항 확인, 요구사항 저장, 요구사항 삭제, 엑셀 파일 다운로드, 엑셀 파일 업로드 등이 있음.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingexecution/BCCheckCascadingExecutionController.java|프로젝트 요구사항의 조회, 추가, 수정, 파일 삭제 등의 CRUD 동작들을 처리하고 이력을 확인하며, 엑셀 파일을 업로드/다운로드 하고 조건에 따른 세부 코드를 선택하는 등의 기능들을 가진 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcrmtracesetting/DURmTraceSettingMgt.java|사용자 요청 정보와 상황에 따라 데이터를 저장, 수정, 삭제 등 다양한 작업을 수행하는 데이터 유닛 관리 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcrmtracesetting/PURmTraceSettingMgt.java|요청 정보를 받아 처리 후 결과를 반환하며, 처리 과정에서 발생하는 비즈니스 예외나 일반 예외를 적절히 처리하는 기능을 담당하는 클라스임.|
|com/skcc/pms/bizcomponent/scope/bcrmtracesetting/BCRmTraceSettingMgtController.java|웹 요청을 처리하고, "pmRmTraceSettingMgt" 이라는 이름의 서비스를 호출하여로 요청 데이터를 관리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bccsrdefectmanager/BCCsrDefectManagerController.java|웹 요청에 따라 다양한 기능을 제공하는 컨트롤러를 구현한 코드임. 이 컨트롤러는 결함 목록 조회, 결함 추가, 수정, 삭제, 엑셀 파일 다운로드, 업로드 등 다양한 기능을 제공하며, 주로 프로젝트의 요구사항과 관련된 정보를 처리함.|
|com/skcc/pms/bizcomponent/scope/bccsrdefectmanager/PUCsrDefectManager.java|요청된 데이터에 따라 여러가지 작업을 수행하는 서비스 클래스로, 특히 이력 조회, 결함 관리, 목록 조회, 파일 업로드/다운로드, 결함 추가/수정/삭제, 진척률 조회, 엑셀 업로드 등의 기능 수행 가능.|
|com/skcc/pms/bizcomponent/scope/bctestplanobjectselection/BCTestPlanObjectSelectionController.java|프로젝트 관리에 필요한 CRUD(Create, Read, Update, Delete) 작업을 수행하고, 엑셀 파일을 관리하며, 테스트 상태에 관한 다양한 기능들을 제공하는 컨트롤러임. 이 기능들에는 요구사항 목록조회, 추가, 수정, 엑셀 파일 다운로드 및 업로드, 테스트 상태 확인, 테스트 플랜에 관한 조회 및 업데이트, 서브 프로젝트 번호 가져오기 등이 포함됨.|
|com/skcc/pms/bizcomponent/scope/bctestplanobjectselection/PUTestPlanObjectSelection.java|해당 코드는 테스트 계획 및 요구사항의 범위를 관리하는 서비스 클래스로, 각 메서드가 데이터의 조회, 추가, 업데이트, 삭제, 엑셀 파일 다운로드/업로드, 파일 관리, 테스트 상태 및 진척도 상태 조사 등 다양한 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestsetting/BCTestSettingController.java|HTTP 요청에 따른 서비스 메소드를 연동하고, 그 결과를 반환하는 컨트롤러 역할을 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestsetting/DUTestSetting.java|입력된 테스트 정보를 관리하는 데이터 단위를 제공하는 자바 클래스로, 테스트 유형, 테스트 시퀀스를 추가, 조회, 삭제하는 기능을 가지고 있음. 추가로 'dmgetLinkYN'과 'dmTestSetting_confirm' 함수를 통해 테스트의 링크 정보를 가져오고, 선택된 항목이 체크된 테스트 항목인지 확인하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bctestsetting/PUTestSetting.java|요청 정보와 함께 'pmTestSetting', 'pmgetLinkYN', 'pmTestSetting_confirm' 세 가지 메서드를 수행하여 각각에 대한 처리 결과를 반환함. 이 과정에서 비즈니스 예외 또는 일반 예외가 발생하면 이를 캐치하여 처리함.|
|com/skcc/pms/bizcomponent/scope/bctestplanintegrated/DUTestPlanIntegrated.java|데이터베이스를 통해 테스트 계획을 생성, 조회, 수정, 삭제하고, 엑셀 파일을 읽어 데이터를 처리하는 등 다양한 기능을 수행하는 자바 코드임. 이 중에서 테스트 계획에 관련된 데이터를 처리하는 기능이 대부분임.|
|com/skcc/pms/bizcomponent/scope/bctestplanintegrated/PUTestPlanIntegrated.java|테스트 계획 관련 정보를 조회, 추가, 수정, 삭제하고, 엑셀 파일을 업로드, 다운로드하며, 특정 사용자의 정보를 조회하는 등의 기능을 수행하는 클래스임.|
|com/skcc/pms/bizcomponent/scope/bctestplanintegrated/BCTestPlanIntegratedController.java|모듈 테스트 계획과 관련된 다양한 REST API를 제공하는 Spring 컨트롤러인데, 해당 테스트 계획의 추가, 수정, 삭제, 엑셀 파일 다운로드, 파일 관리, 요구 사항 조회, 테스트 시퀀스 조회, 이미지 관리 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager7/BCSwingDevPgmManager7Controller.java|사용자 ID 코드 조회, 프로젝트 범위 리스트 조회, 리스트 삭제 및 편집, 엑셀 파일 업로드 및 다운로드 등의 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager7/PUSwingDevPgmManager7.java|엑셀 데이터를 다운로드하고 처리하며, 범위 목록을 처리(저장, 삭제, 수정, 조회, 엑셀 관련 작업)를 위한 로직을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager7/DUSwingDevPgmManager7.java|사용자가 업로드한 엑셀 파일에 작성된 프로그램 관리 정보를 읽어 데이터베이스에 저장하거나, 저장된 정보를 엑셀 파일로 다운로드 받을 수 있게 하는 기능을 가진 자바 코드임. 또한, 프로그램 관리 정보를 추가, 수정, 삭제하는 기능과 프로그램 목록을 조회하는 기능도 포함돼 있음. 해당 코드는 프로그램 ID, 담당자, 기획 및 개발 일정, 비고 등의 정보를 처리함.|
|com/skcc/pms/bizcomponent/scope/bcmappingdesign/PUMappingdesign.java|Spring 프레임워크를 이용한 Java 게시글 관리 시스템으로, 게시글을 추가, 조회, 업데이트, 삭제하는 기능과 사용자 정보를 가져오고, 특정 게시글 ID를 이용하여 파일을 업로드하고, 다운로드 하는 등의 파일 관련 기능이 구현되어 있음. 또한, 엑셀 파일 업로드 및 데이터 분석 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcmappingdesign/BCMappingdesignController.java|웹 기반의 프로젝트 매니징 시스템 컨트롤러로, 사용자의 요청에 따른 다양한 기능을 제공하는 API 엔드포인트 통신을 담당함. 이 통신에는 요청 처리, 파일 다운로드, 데이터 조회, 데이터 수정 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcswingdevdashboard/BCSwingDevDashboardController.java|여러 웹 요청을 처리하여 해당하는 서비스를 호출하고, 그 결과 데이터를 반환하는 컨트롤러 구현임.|
|com/skcc/pms/bizcomponent/scope/bcswingdevdashboard/PUSwingDevDashboard.java|요청된 데이터를 바탕으로 다양한 조회를 수행하고 그 결과를 반환하는 여러 메소드를 포함하고 있는 서비스 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcswingdevdashboard/DUSwingDevDashboard.java|데이터를 요청하고, 데이터베이스에서 데이터를 검색해서 반환하는 다양한 메소드들이 포함된자바 리포지토리 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcswingpgmmapping/BCSwingPgmMappingController.java|스프링프레임워크에 기반한 웹 서비스 컨트롤러로써, 특정 서비스 호출에 맞게 기능을 제공하며 주요 기능으로는 데이터의 조회, 수정, 삭제, 저장, 엑셀 데이터 다운로드가 있음.|
|com/skcc/pms/bizcomponent/scope/bcswingpgmmapping/PUSwingPgmMapping.java|스프링 기반의 서비스 클래스로, 범위 정보 조회, 저장, 편집, 삭제 등의 기능을 제공하고, 엑셀 데이터를 처리하고, 코드 정보를 반환하는 메소드를 포함하고 있음. 모든 메소드에서 비즈니스 예외가 발생하면 로그를 기록하고 해당 예외를 다시 던져줌.|
|com/skcc/pms/bizcomponent/scope/bcswingpgmmapping/DUSwingPgmMapping.java|사용자 요청에 따라 데이터를 조회, 저장, 편집, 삭제, 엑셀로 업로드 및 다운로드하는 기능이 포함된 특정 비즈니스 컴포넌트에 대한 코드임.|
|com/skcc/pms/bizcomponent/scope/issuedefectmanagement/BCIssueDefectManagementController.java|이슈 및 결함 관리에 관련된 엑셀 업로드, 파일 조회, 파일 삭제, 파일 추가, 이미지 조회, 히스토리 조회 등을 수행하는 컨트롤러 클래스임.|
|com/skcc/pms/bizcomponent/scope/issuedefectmanagement/DUIssueDefectManagement.java|요청된 데이터셋에 따라 이슈 및 결함 관리 리스트를 조회하거나, 이슈 및 결함을 관리하기 위한 추가, 수정, 삭제 등의 처리를 수행하는 코드임. 또한, 엑셀 파일을 읽어 데이터를 처리하거나, 엑셀로 데이터를 내보내는 기능도 포함하고 있음. 첨부파일과 관련된 처리와 로그를 남기는 기능도 함께 수행함.|
|com/skcc/pms/bizcomponent/scope/issuedefectmanagement/PUIssueDefectManagement.java|이 코드는 이슈 및 결함 관리를 위한 기능을 수행하며, 이 기능은 목록 조회, 추가, 수정, 삭제, 엑셀 다운로드 및 업로드, 관련 파일 조회 및 삭제, 이미지 조회 및 삭제 등을 포함함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager/PUDesignProgramManager.java|프로젝트에 대한 여러 기능들을 다루는 코드로, 사용자 ID 조회, 프로그레스 확인, 작업명 조회, 범위 추가/수정/삭제/조회, 엑셀 파일 업로드/다운로드, 인증 관리, 디자인 함수 선택, 범위 객체 사용여부 조회 등 프로젝트 관리에 필요한 다양한 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager/BCDesignProgramManagerController.java|여러 가지 기능을 가진 웹 컨트롤러로, 공통적으로 사용되는 데이터를 요청받고, 서비스를 호출하여 요청한 데이터 세트를 반환하거나, 파일을 다운로드하는 역할을 수행함. 특히 엑셀 파일 다운로드, 파일리스트 조회, 파일 삭제, 데이터 수정/삭제/추가, 사용자 정보 확인, 비율 확인 등 다양한 엔드포인트를 정의하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager6/BCSwingDevPgmManager6Controller.java|웹 요청에 따라 다양한 서비스 기능을 제공하는 컨트롤러임. 접속자의 아이디 코드 조회, 프로젝트 진척률, 목록 조회, 엑셀 업로드 및 다운로드, 파일 삭제 및이미지 조회 및 삭제, 승인 설정 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager6/PUSwingDevPgmManager6.java|사용자의 프로젝트 범위를 관리하고, 엑셀 업로드/다운로드, 파일 업로드/다운로드, 범위 추가/수정/삭제 등 다양한 작업을 수행하는 서비스임. 사용자의 요청에 따라 적절한 데이터를 반환하거나 필요한 비즈니스 로직을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcscopemanager/PUScopeManager.java|SQL Injection 필터링 처리 및 프로젝트 계획 및 관리, 사용자 정보 관리, 파일 업로드 및 다운로드와 같은 다양한 비즈니스 로직을 처리하는 스프링 기반의 비즈니스 컴포넌트임.|
|com/skcc/pms/bizcomponent/scope/bcscopemanager/BCScopeManagerController.java|여러 프로젝트의 스코프를 관리하고, 이를 엑셀 파일로 다운로드하거나 업로드하고, 서브 프로젝트의 시작 및 종료 날짜를 검색하는 등 다양한 웹 요청을 처리하는 스프링 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/squalityimprovementdashboard/DUSQualityImprovementDashboardMgr.java|품질향상 대시보드의 관리를 위한 여러 기능을 포함하고 있는데, 대시보드의 관리(생성, 조회, 업데이트, 삭제)와 관련 데이터 조회, 메일 발송에 필요한 테이블 생성 등의 작업을 처리함. 코드 및  사용자 정보를 검색하거나, 데이터셋에 레코드를 저장하는 등의 세부적인 작업도 수행함.|
|com/skcc/pms/bizcomponent/scope/squalityimprovementdashboard/BCSQualityImprovementDashboardMgrController.java|스프링 프레임워크를 사용하여 웹 요청을 처리하고, 특히 'scope/SQualityImprovementDashboard/dmCheckQualityDashBoardMgr' 주소로 들어오는 요청을 'DUSQualityImprovementDashboardMgr' 서비스의 'dmCheckQualityDashBoardMgr' 메소드로 전달하는 웹 컨트롤러입니다.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager1/BCSwingDevPgmManager1Controller.java|다양한 요청에 대한 처리를 위해 다양한 메서드를 가진 컨트롤러 클래스로, 사용자 아이디 조회, 프로젝트 비율 조회, 스코프 목록 조회, 스코프 수정, 스코프 추가, 작업 작성, 파일 업로드 및 삭제, 승인 설정 조회, 작업일 조회, 이미지 삭제 등의 기능 포함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager1/PUSwingDevPgmManager1.java|이 코드는 Spring Framework를 사용하여 개발된 비즈니스 로직을 처리하는 JAVA 클래스로, 사용자의 요청에 따른 데이터 처리 후 결과를 반환하는 서비스 역할을 수행함. 서비스의 기능에는 사용자 정보조회, 데이터 업로드, 다운로드, 이미지 조회 및 삭제, 엑셀 데이터 처리 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcmodeldesign/PUModeldesign.java|사용자에게 요청받은 정보를 바탕으로 요구 사항 목록 조회, 프로젝트 담당자 정보, 승인 정보 조회, 엑셀 데이터 업로드 및 다운로드, 첨부파일 정보 처리 등 다양한 기능을 제공하는 웹 서비스임.|
|com/skcc/pms/bizcomponent/scope/bcmodeldesign/DUModeldesign.java|이 코드는 스프링 프레임워크를 사용하는 자바 서버에서 동작하며, 범위 관리와 관련된 여러 업무 처리를 담당하는 레파지토리임. 업무 처리의 예로는 범위 리스트 조회, 프로그램 레이트 조회, 작업자 코드 조회, 일정 조회, 범위 추가, 범위 업데이트 등이 있음. 이 클래스는 또한 파일 업로드, 엑셀 파일 다운로드 등의 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcmodeldesign/BCModeldesignController.java|스코프 관리와 관련된 정보를 불러오고, 업데이트하고, 삭제하는 등의 여러 기능을 수행하는 컨트롤러임. 또한, 파일의 업로드, 다운로드 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrequirementstaskchartmanager/PURequirementsTaskChartManager.java|요구사항과 관련된 목록 조회, 추가, 업데이트, 삭제 등의 기능을 제공하며, 파일 업로드, 엑셀 다운로드 등의 부가적인 기능도 지원함. 이 과정에서 예외 상황에 대해 처리하는 부분도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrequirementstaskchartmanager/BCRequirementsTaskChartManagerController.java|요구사항과 관련된 데이터 조회, 추가, 수정, 삭제, 파일 다운로드 및 업로드, 그리고 특정 정보 확인 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcrequirementstaskchartmanager/DURequirementsTaskChartManager.java|해당 코드는 한 개의 클래스를 사용해 여러 데이터베이스 쿼리를 수행하고, 엑셀 파일을 관리하며, 해당 파일들을 다루는 동작을 수행함. 또한, 각 동작들의 결과에 따라 오류 메시지를 생성하거나 로깅을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcproductsplan/DUProductsPlan.java|이 코드는 데이터베이스에서 정보를 읽어오고 업데이트하는 일련의 작업을 수행하는 역할을 합니다. 주로 산출물 계획과 관련한 작업들이 포함되어 있으며, 산출물의 조회, 추가, 수정, 삭제, 엑셀 파일 업로드 및 다운로드, 산출물 진행률 조회 등의 작업을 수행하고 있습니다.|
|com/skcc/pms/bizcomponent/scope/bcproductsplan/PUProductsPlan.java|사용자의 요청에 따라 제품의 계획, 요구 사항, 테스트 등의 정보를 조회, 수정, 추가, 삭제하는 기능을 가진 비즈니스 서비스 클래스임. 이 클래스는 Excel 데이터의 업로드 및 다운로드, 그리드 리턴, 차트 생성 등 다양한 기능을 제공하며, 모든 메소드에서 예외 처리가 이루어짐.|
|com/skcc/pms/bizcomponent/scope/bcproductsplan/BCProductsPlanController.java|Spring MVC를 사용한 컨트롤러 클래스로, 제품 계획 및 테스트와 관련된 여러 웹 요청을 처리하며, 각 요청은 서비스 계층의 특정 메소드를 호출하고 처리 결과를 반환함. 이에는 제품 계획 목록 조회, 추가, 업데이트, 삭제, 엑셀 파일 다운로드 및 업로드, 테스트 계획 및 상태 조회, 웹 페이지 그리드 업데이트 등이 포함됨.|
|com/skcc/pms/bizcomponent/scope/bcrmcompletehk/BCRmCompleteHKController.java|프로젝트의 요구사항에 대한 CRUD 기능을 실행하고, 엑셀 파일을 다운로드하거나 업로드하고, 특정 조건에 맞는 데이터를 조회하고, 진행률을 조회하는 등의 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcrmcompletehk/PURmCompleteHK.java|사용자의 요청 정보(DataSet 객체)와 같은 데이터를 처리하거나 관리하는 다양한 메소드들을 모아놓은 클래스임. 이 클래스는 파일 업로드와 엑셀 처리, 데이터 조회, 추가, 갱신, 삭제 등의 기능을 수행하며, 각각의 처리 결과를 DataSet 객체로 반환함.비즈니스 예외 발생 시 해당 예외를 처리함.|
|com/skcc/pms/bizcomponent/scope/bcrmcompletehk/DURmCompleteHK.java|이 코드는 사용자가 요청한 정보를 통해 데이터베이스의 여러 테이블을 조회, 삽입, 업데이트, 삭제를 하고, 데이터를 엑셀 파일로 업로드, 다운로드, 압축, 암호화 및 복호화 하는 기능을 수행하며, 일부 데이터의 중복성과 오류를 확인하는 등의 업무 관리 시스템 비즈니스로직 작업을 수행함.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingdashboard/DUCheckCascadingDashBoardMgr.java|다양한 데이터베이스 쿼리를 수행하여 대시보드 관리에 필요한 정보를 조회, 저장, 업데이트하는 Spring Service임. 또한 여러 가지 조건에 따라 서로 다른 데이터베이스 쿼리를 수행하며, 특정 조건에 따라 HTML테이블 형태로 데이터를 조합하여 응답 데이터에 추가함.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingdashboard/BCCheckCascadingDashBoardMgrController.java|스프링 프레임워크를 사용하여 HTTP 요청을 처리하고, 'CheckCascadingDashBoardMgr' 서비스를 호출하여 결과를 반환하는 기능을 처리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcdesignas/PUDesignASManagerController.java|여러 개의 API 요청을 처리하고, 그에 따른 비즈니스 로직을 처리하는 Spring controller임. 각 API 요청은 특정 작업(예: 파일 업로드, 스코프 조회, 작업자 ID 코드 조회 등)을 실행하며, 각각의 API 요청은 특정 데이터 요청과 온라인 컨텍스트를 받아 처리결과를 반환함.|
|com/skcc/pms/bizcomponent/scope/bcdesignas/DUDesignASManager.java|사용자가 입력한 코드를 통해, 프로그램 과제 및 업무 범위를 관리하며, 사용자가 엑셀 파일로 과제 대상 리스트를 업로드 혹은 다운로드할 수 있도록 지원하고, 각 과제에 대한 분석서, 담당자 관리 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcdesignas/PUDesignASManager.java|서비스 클래스로 각 메소드마다 요청 데이터를 읽어 처리한 후 그 결과를 반환하는 역할을 수행함. 처리 내용은 주로 데이터의 조회, 업데이트, 삭제 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager6/BCDesignProgramManager6Controller.java|다양한 데이터 조회, 업데이트, 파일 다운로드, 파일 업로드 등의 기능을 담당하는 스프링 웹 애플리케이션 컨트롤러 임.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager6/PUDesignProgramManager6.java|스프링 프레임워크를 이용한 자바 서비스 클래스로, 데이터셋 요청 정보를 받아 그에 따른 다양한 데이터 처리를 도와주는 기능들을 제공함. 이는 정보 조회, 엑셀 업로드, 다운로드, 사용자 정보 코드 확인, 요청 정보 기반 분석 및 기능 선택 등 다양한 서비스를 포함하며, 모든 메소드에서 비즈니스 예외를 handle함.|
|com/skcc/pms/bizcomponent/scope/bcteststatusforunit/BCTestStatusForUnitController.java|프로젝트의 단위 테스트 상태를 관리하는 컨트롤러로, 테스터용 상태, 담당자 목록 조회, 행동 담당자용 상태를 요청하고 받음.|
|com/skcc/pms/bizcomponent/scope/bcteststatusforunit/PUTestStatusForUnit.java|요청된 데이터 셋을 처리하여 반환하고, 오류 발생 시 해당 오류 메시지를 발생시키는 역할을 수행함. 여기에는 액션 충전장에 대한 상태, 테스터에 대한 상태 및 충전기 목록 조회라는 세 가지 메서드가 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcteststatusforunit/DUTestStatusForUnit.java|사용자의 요청에 따라 테스트 상태를 조회하여 결과를 반환하는 기능을 수행하는 클래스임. 이는 담당자 별 테스트 상태, 테스터 별 테스트 상태, 그리고 테스터 목록 또는 조치자 목록을 조회할 수 있음. 이 때, 각 상태 및 목록은 사용자의 요청에 따라 다른 쿼리를 사용해 데이터베이스에서 조회함.|
|com/skcc/pms/bizcomponent/scope/bcasismapping/PUAsisMapping.java|요청된 데이터 세트와 온라인 컨텍스트를 받아서 처리 결과를 반환하는 두 가지 메소드(pmAsisList, pmGetExcel)를 포함하고 있는 서비스 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcasismapping/DUAsisMapping.java|사용자 요청 데이터에 따라 데이터베이스에서 정보를 조회하여 제공하거나, 데이터를 엑셀 파일로 추출하여 제공하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcasismapping/BCAsisMappingController.java|스프링 프레임워크를 사용해 만든 웹 컨트롤러로, 사용자의 요청에 따라 엑셀 파일 다운로드를 제공하고, 특정 데이터 목록을 가져오는 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestsettingintegrated/PUTestSettingIntegrated.java|요청 정보를 입력받아 테스트 세팅을 진행하고 결과를 반환하는 서비스 로직을 수행하며, 이 과정에서 에러가 발생할 경우 예외 처리를 수행함.|
|com/skcc/pms/bizcomponent/scope/bctestsettingintegrated/DUTestSettingIntegrated.java|테스트 설정과 관련된 정보를 데이터베이스와 상호작용하여 관리하는 기능을 수행하는 코드임. 주요 기능으로는 테스트 유형 및 차수의 등록, 수정, 삭제, 조회 등이 있음. 등록 및 수정 시에는 중복된 키가 있는지 확인하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bctestsettingintegrated/BCTestSettingIntegratedController.java|웹 요청을 처리하고 클라이언트로부터 받은 IDataSet형태의 요청 데이터와 IOnlineContext라는 컨텍스트 정보를 가지고 "pmTestSetting"라는 메소드를 처리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bccheckqualityexecution/DUCheckQualityExecution.java|사용자의 요구사항 범위를 관리하고, 엑셀 파일을 업로드/다운로드 하며, 진행률 및 항목을 조회/수정하며, 파일을 업로드/삭제하고, 히스토리를 조회하는 기능을 가진 코드임. AI 모델 테스트용 데이터로 실제 코드의 동작과는 다를 수 있음.|
|com/skcc/pms/bizcomponent/scope/bccheckqualityexecution/BCCheckQualityExecutionController.java|프로젝트의 요구사항 범위, 계획 진행률, 테스트 실행 등에 관한 기능들을 다루고 있으며, 이러한 데이터는 엑셀로 다운로드하거나 업로드할 수 있음. 또한, 요구사항의 추가, 업데이트, 삭제와 같은 CRUD 작업도 수행가능함.|
|com/skcc/pms/bizcomponent/scope/bccheckqualityexecution/PUCheckQualityExecution.java|프로젝트의 요구사항 범위를 관리하기 위한 여러 기능을 가진 서비스 클래스임. 기능에는 요구사항 범위 조회, 추가, 업데이트, 삭제, 엑셀 업로드 및 다운로드, 진행률 조회 등이 포함되어 있음. 예외처리 기능과 각 메소드에서 반환하는 정보에 대한 메시지 처리 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcdesigninterfacemanagerwoori/PUDesignInterfaceManagerWoori.java|스프링 기반의 서버 서비스로, 데이터 셋을 이용해 엑셀 파일 업로드, 다운로드, 데이터 조회, 수정, 삭제 등의 다양한 데이터 관리 기능을 제공함. 로깅과 에러 처리도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcdesigninterfacemanagerwoori/BCDesignInterfaceManagerWooriController.java|웹 애플리케이션에서 다양한 요청을 처리해서 서비스로 전달하고 결과를 반환하는 Controller 클래스로, 엑셀 파일 다운로드 및 업로드, 특정 정보의 조회, 업데이트, 삭제 등의 함수를 제공함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager7/PUDesignProgramManager7.java|스프링 프레임워크를 사용해 작성된 이 코드는 다양한 데이터 처리 기능들을 담당하는 클래스에 속함. 요청받은 데이터 세트를 처리하고, 데이터를 조회, 삽입, 업데이트, 삭제 하는 기능이 구현되어 있으며, 파일 업로드, 다운로드 및 엑셀 데이터 처리 등의 기능도 포함되어 있음. 로깅 처리와 예외처리 작업도 함께 수행함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager7/BCDesignProgramManager7Controller.java|잘 짜여진 RESTful 웹 서비스 컨트롤러로, DB에서 원하는 데이터를 조회하거나 수정, 삭제 등 다양한 요청을 처리하는 메소드가 많이 구현되어 있음. 파일 업로드, 다운로드 관련 기능, 특정 정보 검색, 승인 설정 조회 등의 기능이 구현되어 있고, 모든 요청 처리는 해당 서비스 클래스에 위임함.|
|com/skcc/pms/bizcomponent/scope/bcservicerequestmanagement/BCServiceRequestManagementController.java|스프링 프레임워크를 이용하여 서비스 요청 관리에 관련된 여러 작업을 수행하는 웹 컨트롤러 기능을 표현함. 서비스 요청의 업로드, 다운로드, 추가, 삭제, 업데이트 등을 처리하는 엔드포인트를 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcservicerequestmanagement/PUServiceRequestManagement.java|서비스 요청 관리를 위한 다양한 기능을 제공하는 클래스임. 관련 데이터를 조회, 업데이트, 추가, 삭제 할 수 있으며, Excel 다운로드 및 업로드, 히스토리 조회, 파일 리스트 조회 등의 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrmtrackingwb/BCRmTrackingWBController.java|웹 요청을 통해 테이블 정보를 조회하고, 엑셀 파일을 다운로드하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcrmtrackingwb/PURmTrackingWB.java|요청된 데이터로 추적 테이블 정보 조회와 엑셀 다운로드를 처리하고 그 결과를 반환하는 기능을 포함한 서비스임.|
|com/skcc/pms/bizcomponent/scope/bcrmtrackingwb/DURmTrackingWB.java|사용자로부터 받은 요청 정보를 바탕으로 데이터를 조회하거나 엑셀 파일을 생성하여 다운로드하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcproductsexecution/BCProductsExecutionController.java|여러 웹 요청을 처리하여 제품 실행 관련 업무 로직을 수행하는 컨트롤러임. 요구사항 범위 조회, 추가, 수정, 파일 삭제, 진행률 조회, 엑셀 다운로드 및 업로드 등의 기능을 담당하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcproductsexecution/DUProductsExecution.java|상품 실행 요구사항을 관리하는 기능을 제공하며, 요구사항 목록 조회, 추가, 수정, 업로드, 다운로드 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcproductsexecution/PUProductsExecution.java|프로젝트 요구사항의 조회, 추가, 업데이트, 삭제, 파일 목록 조회/삭제, 엑셀 다운로드/업로드, 진행률 조회 등 다양한 기능을 처리하는 서비스 클래스임.|
|com/skcc/pms/bizcomponent/scope/bccheckriskdefect/BCCheckRiskDefectController.java|프로젝트 범위 관리, 결함 상태, 테스트 유형, 서브 프로젝트 정보 등에 대한 조회, 추가, 업데이트, 삭제 등의 기능을 실행하고, 필요한 정보를 엑셀 파일로 다운로드하거나 업로드하는 기능을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bccheckriskdefect/DUCheckRiskDefect.java|이 코드는 데이터베이스에서 사용자가 요청한 정보를 조회하거나, 특정 데이터를 분석하여 결과를 반환하거나, 사용자가 입력한 데이터를 데이터베이스에 저장하는 등의 기능을 수행하는 서비스를 제공하는 예외처리 및 로직 처리를 제공합니다. 이 서비스는 주로 프로그램의 비즈니스 로직을 수행하는데 사용됩니다. 이 코드에는 결함 관리, 결함 상태 조회, 서브 프로젝트 정보 조회, 첨부 이미지 삭제 등 다양한 기능이 포함되어 있습니다.|
|com/skcc/pms/bizcomponent/scope/bccheckriskdefect/PUCheckRiskDefect.java|프로젝트 요구사항과 결함 상태를 관리하고, 해당 정보를 조회, 업데이트, 엑셀 업로드/다운로드 기능 등을 제공하는 서비스임. 추가로 XMPP 프로토콜을 통한 채팅 메시지 전송, 이미지 조회 및 삭제, 테스트 종류, 순서 조회 등의 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingplan/BCCheckCascadingPlanController.java|이 코드는 컨트롤러 클래스로서, 필요한 데이터를 처리하고 조회하거나 업데이트, 삭제 등의 역할을 하며, 액셀 파일 업로드/다운로드와 같은 기능 또한 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingplan/DUCheckCascadingPlan.java|이 코드는 웹 애플리케이션에서 데이터를 처리하거나 이를 데이터베이스와 연결하는 등의 업무를 처리합니다. 그러한 처리 업무에는 데이터 조회, 데이터 변경, 데이터 삭제, 데이터 삽입 등이 포함됩니다. 데이터를 파일로 업로드하거나 다운로드하는 기능도 제공합니다. 이 외에도 여러 고급 기능들을 제공하는데, 그 중 일부는 주어진 조건을 기반으로 특정 필드를 일괄적으로 변경하는 일괄 처리, 데이터 테이블에 기록된 내용을 엑셀 파일로 변환하여 다운로드하는 등입니다. 많은 라이브러리와 프레임워크를 활용하여 전반적인 기능을 제공합니다.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingplan/PUCheckCascadingPlan.java|요구사항 범위에 대해 추가, 업데이트, 삭제, 조회 등의 작업을 수행하고, 파일 업로드, 다운로드 기능을 제공하는 서비스 클래스임. 또한, Excel 파일을 읽고 쓰는 기능과 예외 처리 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcasismappingprogram/BCAsisMappingProgramController.java|사용자의 요청에 따라 'pmGetExcel'은 Excel 파일을 다운로드 받고, 'pmAsisList'는 특정 데이터를 조회해 반환하는 웹 컨트롤러 기능 수행함.|
|com/skcc/pms/bizcomponent/scope/bcasismappingprogram/PUAsisMappingProgram.java|요청 정보를 바탕으로 데이터 처리를 하고, 그 결과를 반환하며, 처리 도중 예외가 발생하면 해당 예외를 다시 던지는 서비스 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcasismappingprogram/DUAsisMappingProgram.java|데이터베이스에서 접근하여 웹 요청에 따라서 데이터를 가져오거나 엑셀을 생성하여 반송하는 기능 수행.|
|com/skcc/pms/bizcomponent/scope/bcmobileinfo/PUMobileInfo.java|다양한 메소드를 포함한 PUMobileInfo 클래스로, 이를 통해 핸드폰 정보를 확인하거나 시스템 코드를 추가, 업데이트, 삭제하고 작업 코드 엑셀 업로드와 요구사항 범위 리스트 조회 등의 기능을 수행할 수 있음.|
|com/skcc/pms/bizcomponent/scope/bcmobileinfo/DUMobileInfo.java|데이터베이스와의 상호작용을 통해 프로젝트 검사, 엑셀 업로드, 시스템 코드 관리(추가, 업데이트, 삭제), 계획 진행률 조회 등의 작업을 수행하는 기능 제공.|
|com/skcc/pms/bizcomponent/scope/bcmobileinfo/BCMobileInfoController.java|다양한 요청을 처리하여 특정 서비스를 호출하고 그 결과를 반환하는 웹 컨트롤러의 기능을 가지고 있음. 이 컨트롤러는 프로젝트 목록 조회, 시스템 코드 추가, 시스템 코드 업데이트, 엑셀 업로드 등 다양한 작업을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager/BCSwingDevPgmManagerController.java|다양한 정보의 조회, 업데이트, 추가, 삭제 등을 위한 웹 요청을 처리하는 컨트롤러를 설정하는 자바 Spring MVC 코드임.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager/PUSwingDevPgmManager.java|요청 정보를 받아 데이터를 처리하고 관리하는 다양한 기능들을 가진 서비스 클래스임. 이 클래스는 다양한 메소드들을 통해 데이터셋 객체를 생성, 수정, 삭제하고, 엑셀 파일 관리, 스코프, 작업일 조회, 사용자 ID 확인, 프로그램 매핑 등의 역할을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcInterfaceDevWB/BcInterfaceApplicationWBDao.java|데이터베이스에서 L2, L3, L4 목록을 조회하고, 해당 목록을 전부 조회하는 기능, 애플리케이션을 삽입하고 수정하며, 애플리케이션 목록을 조회하는 기능을 가진 자바 리포지토리임.|
|com/skcc/pms/bizcomponent/scope/bcInterfaceDevWB/BcInterfaceDevWBDao.java|데이터베이스와 상호 작용하여 인터페이스 개발 정보를 가져오거나 업데이트하고, 엑셀 파일을 업로드하거나 다운로드하는 여러 메소드를 제공하는 DAO 클래스임. 사용자 및 프로젝트 정보를 조회하거나, 인터페이스를 삽입하거나 갱신하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcInterfaceDevWB/BcInterfaceDevWBController.java|웹 애플리케이션에서 리스트 조회, 레이아웃 설정, 프로젝트 번호 변경, 인터페이스 추가 및 수정, 애플리케이션 추가 및 수정, 애플리케이션 리스트 조회, 프로그램 조회, 사용자 조회, 초기화, 엑셀 파일 다운로드 및 업로드 등의 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcInterfaceDevWB/ExcelDetail.java|Excel 데이터를 벨리데이션하는 기능을 수행하는 클래스임. 각 필드의 값이 null인지, 최대 문자 길이를 초과하는지, 올바른 날짜 형식인지 검사하고, 해당 필드의 실제 값이나 이름, SQL 이름을 반환함. 또한, 주어진 Map에 특정 코드가 존재하는지 확인하는 기능도 수행함.|
|com/skcc/pms/bizcomponent/scope/bcInterfaceDevWB/BcInterfaceDevWBService.java|Spring 프레임워크를 사용하여 개발된 BcInterfaceDevWBService는 인터페이스 개발 워크북의 주요 서비스를 제공하는데, 이에는 리스트 조회, 새 프로젝트 생성, 애플리케이션 추가 및 업데이트, 상호작용 추가 및 업데이트, 유저 정보 조회 등의 기능이 포함되어 있으며, 데이터는 IDataSet 형태로 주고 받음.하나는 엑셀 파일 다운로드와 업로드 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bccheckqualityplan/PUCheckQualityPlan.java|입력 정보 조회, 추가, 업데이트, 삭제, 파일 목록 조회, 파일 삭제 등 다양한 데이터 조작 관련 작업을 수행하며, 엑셀 파일 업로드 및 다운로드, 차트와 그리드에 대한 정보를 구성하고 관리하는 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bccheckqualityplan/BCCheckQualityPlanController.java|프로젝트의 요구 사항 범위, 테스트 계획, 테스트 상태 등에 관한 다양한 동작을 처리하고, 이에 따른 엑셀 파일 다운로드 및 업로드 기능을 수행하며, 이를 클라이언트에 반환하는 기능 구현임.|
|com/skcc/pms/bizcomponent/scope/bccheckqualityplan/DUCheckQualityPlan.java|이 코드는 데이터를 관리하고, 엑셀 파일 업로드 및 다운로드, 파일 저장 및 삭제, 텍스트 정보를 관리하면서 디비 쿼리를 수행하는 등의 기본적인 CRUD 작업과 데이터 검증 작업을 수행하는 기능들이다. 또한, 자동 채번, 의견 관리, 테스트 시나리오 등 비즈니스 특성에 따른 여러 상세 기능들을 수행한다.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerwb2/PURequirementsScopeManagerWB2.java|프로젝트의 범위 관리를 위한 여러 기능을 제공하는 서비스로서, 데이터 쿼리, 엑셀 업로드 및 다운로드, 파일 다운로드, 특정 사용자 ID 조회, 작업목록 조회, 범위 추가/수정/삭제 등 다양한 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerwb2/BCRequirementsScopeManagerWB2Controller.java|웹 요청 URL(예: 'pmUserIdCode', 'pmProRate', 'pmScopeListInq' 등)에 따라 다양한 서비스 기능(예: UserId에 관한 코드 조회, 프로젝트 비율 조회, Scope 목록 조회 등)을 제공하고, 일부 기능에서는 파일 업로드 및 다운로드 기능을 포함하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcproductsplantailoring/DUProductsPlanTailoring.java|이 코드는 SKCC 표준 프레임워크에 대한 산출물 계획 테일러링과 같은 핵심 비즈니스 로직을 수행하는 모듈임. 사용자 요청에 따라 특정 데이터를 조회하거나, 데이터를 데이터베이스에 저장하거나, 데이터를 수정, 삭제하는 등의 기능을 제공함. 선택적으로 XML 문서를 생성하거나 파일을 업로드 하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcproductsplantailoring/BCProductsPlanTailoringController.java|웹 요청을 처리하는 컨트롤러로, 상품 생성 계획에 대한 정보 조회, 생성, 업데이트, 그리드 업데이트, 파일 삭제, 삭제, 알림 전송, 프로그레스 비율 조회, 이력 조회 등 다양한 기능을 제공함. 또한, 이를 엑셀 파일로 다운로드 또는 업로드 가능하고, 이미지 조회 및 삭제를 지원함. 끝으로, 세부 코드 관련 조회 및 사용 여부 확인, 테스트 관련 정보 조회 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcproductsplantailoring/PUProductsPlanTailoring.java|상품 계획에 대한 사용자 요구 사항을 조회, 추가, 수정, 삭제하는 기능과, 해당 요구 사항에 대한 파일을 조회, 삭제하는 기능, 그리고 엑셀 파일 업로드 및 다운로드, XMPP 메시지 전송, 관련 테스트 진행률 조회, 이미지 조회 및 삭제 등 다양한 작업을 처리하는 기능들을 제공하는 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcrequirementscustomermanager/PURequirementsCustomerManager.java|이 코드는 사용자의 요청을 바탕으로 정보를 추가, 삭제, 업데이트하거나 조회하는 이용자 관리 도구를 제공함. 또한 엑셀파일 업로드와 다운로드, 레포트 작성 등의 기능도 포함하고 있음. 이 때, 요청 처리 결과에 따라 메시지를 반환하고 오류 시 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/scope/bcrequirementscustomermanager/DURequirementsCustomerManager.java|상세한 요구사항 관리, 파일 업로드 및 다운로드, 엑셀 데이터 처리를 포함한 다양한 요구사항에 관한 관리 작업을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcrequirementscustomermanager/BCRequirementsCustomerManagerController.java|프로젝트 요구사항을 관리하는 웹 서비스 컨트롤러로, 요구사항 리스트 조회, 추가, 업데이트, 삭제, 엑셀 파일 다운로드 및 업로드 등 다양한 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingdefect/DUCheckCascadingDefect.java|이 코드는 결함 및 요구사항을 확인하고, 내용을 업데이트하거나 삭제하는 기능을 가진 애플리케이션을 생성하는 일련의 메소드와 함수로 구성되어 있습니다. 이 애플리케이션은 데이터베이스로부터 데이터를 읽어오고, 처리한 후 다시 데이터베이스에 저장하는 기능을 포함하며, 엑셀 파일을 생성하거나 파싱하는 기능도 포함하고 있습니다. 같은 기능을 지원하는 UI와 연동하기 위한 기능들도 구현되어 있습니다. 이런 과정을 통해 사용자는 결함 및 요구사항을 쉽게 관리할 수 있게 됩니다.   이 클래스의 주요 메소드는 각각 다음과 같은 기능을 수행합니다:  - dmRequirementsScopeListInq: 요청된 데이터 셋에 따라 요구사항의 목록을 조회합니다. - dmRequirementsScopeAdd: 요구사항을 추가합니다. - dmRequirementsScopeUpd: 요구사항을 업데이트 합니다. - dmRequirementsScopeGridUpd: 그리드 형태의 요구사항 리스트를 업데이트 합니다. - dmRequirementsScopeDel: 요구사항을 삭제합니다.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingdefect/PUCheckCascadingDefect.java|사용자의 요청 정보를 받아 각기 다른 기능을 수행하는 여러 메서드들(프로젝트의 요구사항 조회, 추가, 업데이트, 엑셀 업로드, 다운로드 등)을 포함하는 자바 서비스 클래스임.|
|com/skcc/pms/bizcomponent/scope/bccheckcascadingdefect/BCCheckCascadingDefectController.java|HTTP 요청을 처리하여 프로젝트 범위 및 결함 상태 관련 데이터를 조회, 추가, 수정, 삭제하고, 파일 다운로드, 이미지 처리, XMPP 알림 발송 등의 작업을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bccorrectivactionwb/PUCorrectiveActionWB.java|해당 코드는 사용자의 요청에 따라 서로 다른 요구사항을 처리하기 위한 서비스 클래스를 구현한 것이며, 각 메소드는 요구사항 조회, 추가, 업데이트, 엑셀 업로드, 이력 조회 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bccorrectivactionwb/BCCorrectiveActionWBController.java|스프링 프레임워크를 사용한 웹 애플리케이션 컨트롤러로, 요구사항 범위, 이력, 파일 리스트 조회, 엑셀 업로드 및 다운로드, 요구사항 범위 추가, 업데이트, 삭제 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bccorrectivactionwb/DUCorrectiveActionWB.java|서버 서비스에서 사용되는 데이터를 관리하고, 파일을 취급하는 등 다양한 기능을 가진 클래스로, 데이터 조회, 추가, 갱신, 삭제 등의 기본적인 데이터베이스 조작 기능을 포함하고 있으며, 파일 업로드 및 다운로드, 압축 파일 처리, Excel 파일 읽기 및 쓰기 등의 파일 관련 기능이 구현되어 있음. 주요 사용처는 요구사항 범위 관리, 데이터셋 추출, 엑셀 관리 등으로, 웹 기반 프로젝트 관리 시스템에서 사용됨.|
|com/skcc/pms/bizcomponent/scope/bctestdefectmanagement/BCTestDefectManagementController.java|다양한 요청에 대해 서비스 메서드를 호출하는 웹 요청 핸들링을 처리함. 이는 프로젝트의 불량 관리, 요구사항 범위 조회 및 관리, 파일 업로드 및 다운로드, 테스트 결함 관리 히스토리 조회 등이 포함됨.|
|com/skcc/pms/bizcomponent/scope/bctestdefectmanagement/PUTestDefectManagement.java|이 코드는 여러 기능을 수행하는 웹 서비스를 제공하는데, 해당 기능들은 테스트 결함 관리, 요구 사항 범위 조회, 추가, 업데이트, 파일 업로드 및 다운로드, XMPP 통신 기반의 알림 서비스, 및 다양한 조회 및 분석 작업 등이 포함되어있다.|
|com/skcc/pms/bizcomponent/scope/bcproductssetting/DUProductsSetting.java|프로젝트 관리에 필요한 기능들을 제공하는 코드임. 테스트 유형과 순서의 추가, 조회, 삭제 기능을 제공하고, 이에 따른 데이터 변경을 관리함. 또한 프로젝트에 필요한 산출물과 이에 연관된 파일, 결함 리스트 등을 관리하는 기능이 포함되어 있음. 이를 통해 효율적인 프로젝트 관리를 지원함.|
|com/skcc/pms/bizcomponent/scope/bcproductssetting/PUProductsSetting.java|요청 정보를 받아서 DUProductsSetting의 dmProductsSetting 메소드를 호출하고, 그 결과를 반환하는 기능을 가짐. 만약 처리 중 예외가 발생하면 BizRuntimeException을 던짐.|
|com/skcc/pms/bizcomponent/scope/bcproductssetting/BCProductsSettingController.java|상품 설정에 관련된 정보를 처리하고 반환하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcswingsystemscopemanage/DUSwingSystemScopeManage.java|여러가지 데이터 관리 기능을 수행하는 데이터 유닛 관리 클래스임. 구체적으로는 데이터 조회, 저장, 편집, 삭제, 엑셀로 레코드셋 변환, 데이터 검증 기능 등을 제공하며, 각 함수는 입력된 요청 정보와 관련된 결과 데이터셋 객체를 반환함. 코드 다운로드, 전체 다운로드 등의 엑셀 관련 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcswingsystemscopemanage/BCSwingSystemScopeManageController.java|웹 어플리케이션에서 스코프 시스템을 관리하는 기능을 제공하며, 이를 통해 목록 조회, 엑셀 데이터 전체 다운로드, 리스트 삭제, 리스트 글 엑셀 작성, 목록 수정, 목록 저장 및 코드 조회 기능을 실행할 수 있음.|
|com/skcc/pms/bizcomponent/scope/bcswingsystemscopemanage/PUSwingSystemScopeManage.java|범위 관리를 위한 서비스를 제공하며, 특정 요청에 따른 범위 목록을 조회, 저장, 편집, 삭제하는 기능과 엑셀 데이터를 가져오는 기능, 엑셀 데이터를 다운로드하는 기능 등을 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcproductsstatusforcharger/PUProductsStatusForCharger.java|요청받은 데이터를 처리하여 결과를 반환하는 세 가지 메서드(pmStatusForActionCharger, pmStatusForTester, pmChargerListInq)를 가진 서비스 클래스임. 각 메서드는 요청 정보를 파라미터로 받아 처리 후, 처리 결과를 DataSet 객체로 반환하며, 실행 중 예외가 발생하면 BizRuntimeException을 발생시킴.|
|com/skcc/pms/bizcomponent/scope/bcproductsstatusforcharger/DUProductsStatusForCharger.java|지정된 차트 형식(grid_type)에 따라 데이터를 조회하고, 해당 데이터를 내보내는 기능이 있고, 유저 정보에 따라 locale을 설정하며, 요청된 charger_type에 따라 다른 DB 쿼리로 데이터를 가져오는 기능까지 포함하고 있다. 이는 전체적으로 데이터 유닛의 명세 및 처리 결과 데이터를 조회하고 다루는 역할을 담당하는 클래스이다.|
|com/skcc/pms/bizcomponent/scope/bcproductsstatusforcharger/BCProductsStatusForChargerController.java|테스터의 상태 확인, 충전기 목록 조회, 액션 충전기의 상태 확인을 위한 서비스를 호출하는 컨트롤러 구현임.|
|com/skcc/pms/bizcomponent/scope/bcrequestreviewplanwb/PURequestReviewPlanWB.java|요청된 데이터를 받아 처리 후 결과를 반환하는 역할을 수행하는 다양한 메서드를 포함하는 PURequestReviewPlanWB라는 서비스 클래스임. 이 서비스는 범위 관리 및 리뷰 계획과 관련된 기능을 제공하며, 데이터 조회, 추가, 업데이트, 삭제, 파일 관리, 엑셀 업로드 및 다운로드 등 다양한 기능을 포함함.|
|com/skcc/pms/bizcomponent/scope/bcrequestreviewplanwb/DURequestReviewPlanWB.java|본 코드는 Spring Framework 기반의 Java 어플리케이션에서 요구사항 관리 모듈의 데이터 처리를 담당하는 클래스입니다. 주요 기능으로는 요구사항의 조회, 저장, 수정, 삭제, 첨부파일 관리 등이 구현되어 있습니다. 또한, 엑셀로부터 데이터를 가져와서 처리하거나, 조회 결과를 엑셀로 만들어 다운로드하는 기능도 포함되어 있습니다. 삭제되었거나 변경된 요구사항에 대한 히스토리 관리 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcrequestreviewplanwb/BCRequestReviewPlanWBController.java|여러 요구사항 범위(예: 엑셀 업로드, 파일 목록 조회, 역사조회 등) 관련 기능을 서비스한다. 이 기능에는 파일 업로드, 다운로드, 더블 체크, 업데이트, 추가, 삭제 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcsinstitutionexistingreportplan/BCInstitutionPlanController.java|프로젝트 관리, 작업 코드 관리, 시스템 코드 관리, 요구 사항 목록 조회, 서비스 요청 관리 등을 하는 웹 서비스 컨트롤러를 정의하고 있음. 이름에 'pm'이 붙은 메소드들은 각각 다른 HTTP 요청을 처리하며, 요청 데이터를 받아서 서비스 레이어로 전달하고 결과를 반환함. 또한 'pmServiceRequestManagementExceldownload' 메소드는 서비스 요청 관리에 대한 정보를 엑셀 파일로 다운로드하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/scope/bcsinstitutionexistingreportplan/DUInstitutionPlan.java|사용자의 요청 정보를 받아 데이터베이스에서 데이터를 조회, 삽입, 수정, 삭제하는 기능을 수행하고, 결과를 반환하는 역할을 수행하는 서버 측 코드임. 추가로, Excel 파일을 읽고 생성하는 기능, 업로드된 파일의 용량을 체크하는 기능, Zip 파일을 생성하는 기능 등도 포함하고 있음. 단순 CRUD(Create, Read, Update, Delete) 외에도 특정 조건에 따라 예외를 발생시키며, 중복 체크, 공백 검사 등 다양한 유효성 검사를 진행하여 사용자로부터 전달받은 정보의 안정성을 확보함.|
|com/skcc/pms/bizcomponent/scope/bcsinstitutionexistingreportplan/PUInstitutionPlan.java|사용자의 요청 정보를 바탕으로 서로 다른 작업을 수행하고 그 결과를 반환하는 여러 메소드를 포함한 서비스 클래스임. 작업에는 프로젝트 확인, 엑셀 파일 업로드, 시스템 코드 관리 삭제 및 추가, 요구 사항 범위 리스트 조회 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/srdefectmanagement/PUSrDefectManagement.java|사용자의 요청에 대한 정보를 관리하고 처리하는 서비스를 제공하며, 결함 관리에 대한 추가, 삭제, 업데이트 및 가져오기, 그리고 파일과 이미지 업로드, 다운로드, 삭제 기능을 포함한 여러 액션을 처리하는 기능을 지원하는 서비스임. 게다가, 이력 관리 및 그리드 업데이트 기능도 지원함.|
|com/skcc/pms/bizcomponent/scope/srdefectmanagement/DUSrDefectManagement.java|파일 업로드, 다운로드를 관리하고, 이슈 정보를 조회, 수정, 삭제하는 등의 기능을 수행하는 코드임. 또한, 문서 엑셀 업로드 및 다운로드 기능과 이력 정보 조회 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/srdefectmanagement/BCSrDefectManagementController.java|디펙트 관리를 위한 여러 기능을 제공하는 웹 컨트롤러로, 엑셀 파일 업로드, 파일 리스트 조회, 엑셀 파일 다운로드, 디펙트 관리 정보의 추가/수정/삭제, 이미지 조회 및 삭제, 히스토리 조회 등의 기능을 포함함.|
|com/skcc/pms/bizcomponent/scope/bccheckqualitydefect/DUCheckQualityDefect.java|사용자가 입력한 정보에 따라 결함관리 데이터를 조회, 등록, 수정, 삭제하는 등의 기능을 제공하고, 사용자의 요청에 따라 Excel 파일로 데이터를 다운로드하거나 업로드하는 등의 기능도 수행함.|
|com/skcc/pms/bizcomponent/scope/bccheckqualitydefect/BCCheckQualityDefectController.java|프로젝트 요구사항 및 결함 상태에 대한 조회, 추가, 수정, 삭제, 파일 다운로드 및 업로드, 알림 전송, 히스토리 확인, 이미지 조회 및 삭제, 차트 데이터 조회, 상세 코드 조회, 테스트 시퀀스 및 ID 목록 조회 등의 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bccheckqualitydefect/PUCheckQualityDefect.java|프로젝트의 품질 결함 체크와 관련된 다양한 작업을 수행하는 자바 클래스를 정의하는 코드임. 클래스 내부에는 품질 결함의 조회, 추가, 업데이트, 엑셀 업로드/다운로드, 그리드 업데이트, 파일 조회/삭제, XMPP 메시지 보내기 등의 메서드가 포함되어 있음. 각 메서드는 서비스 단에서 요청 정보를 받아 처리하고, 처리 결과를 반환함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager4/PUSwingDevPgmManager4.java|프로젝트의 범위를 관리하는 서비스를 제공하며, 범위 목록 조회, 범위 정보 추가, 수정, 삭제, 엑셀 업로드 및 다운로드, 이미지 조회와 삭제, 중복 프로그램 ID 체크, 모듈 리더 여부 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager4/BCSwingDevPgmManager4Controller.java|다양한 기능을 수행하는 웹 컨트롤러로, 사용자 ID 코드 요청, 프로젝트 비율 요청, 범위 리스트 조회, 범위 기록 조회, 범위 추가/수정/삭제, 엑셀 파일 업로드/다운로드, 분석 데이터 요청 등의 API 엔드포인트를 제공함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager3/BCSwingDevPgmManager3Controller.java|요청에 대한 다양한 처리를 제공하는 BCSwingDevPgmManager3Controller 클래스로, 사용자 ID 코드 조회, 프로젝트 비율 조회, 스코프 목록 조회, 역사 조회, 테스트 ID 및 이름 목록 조회, 업데이트, 추가, 삭제 등의 기능을 포함하며, 파일 업로드, 다운로드 및 삭제, 이미지 조회 및 삭제, 승인 설정, 근무일 조회, 첨부 파일 리스트 조회 등의 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager3/PUSwingDevPgmManager3.java|사용자의 요청정보를 처리하고, 요청에 따라 특정 데이터를 검색, 추가, 수정, 삭제하는 역할을 수행하는 서비스 클래스임. 예외가 발생하면 예외 메시지를 출력하고, 에러 로깅을 수행함. 특히, 'dmPIGridUpdate', 'dmChangeId', 'dmImageDelete' 같은 메소드들은 각각 그리드 정보 업데이트, ID 변경, 이미지 삭제 등 각각의 작업을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanager1/BCRequirementsScopeManager1Controller.java|프로젝트의 요구사항 관련 정보를 조회하고, 추가하고, 업데이트하고, 삭제하는 등의 기능을 제공하는 컨트롤러임. 또한 엑셀 파일 다운로드 및 업로드 기능과 프로젝트의 상세 코드 사용 여부, 진행률, 서브 프로젝트 번호 조회 기능 등을 포함함.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanager1/PURequirementsScopeManager1.java|사용자의 요청에 따라 사양 범위(Requirements Scope)를 관리하고, 엑셀 파일 업로드 및 다운로드, 상세 코드 조회, 서브 프로젝트 번호 조회 등 다양한 기능을 수행하는 비즈니스 로직 처리 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcstorechecklist/PUStoreCheckList.java|프로젝트의 요구사항과 관련된 정보를 처리하는 서비스로, 요구사항의 조회, 추가, 업데이트, 엑셀 업로드/다운로드 등 다양한 기능을 수행함. 또한 필요에 따라 요구사항의 히스토리 정보를 조회하거나 파일의 추가/삭제 등 조작을 수행함. 분석과 계획에 대한 진행률 조회 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcstorechecklist/BCStoreCheckListController.java|스프링 프레임워크를 사용하여 작성된 컨트롤러 클래스에서는, 요구사항과 관련된 여러 정보를 검색, 업데이트, 삭제하거나 엑셀 파일 다운로드 및 업로드를 수행하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcstorechecklist/DUStoreCheckList.java|입력된 코드는 작업 관리를 위한 코드로 보입니다. MySQL처럼 릴레이션 데이터베이스에 전송된 요청 정보를 사용하여 쿼리를 작성하고, 요청 및 응답 데이터를 관리합니다. 또한 해당 코드는 파일 업로드, 다운로드 및 데이터 엑셀로의 변환, 압축 파일에서 엑셀 파일 추출 같은 다양한 기능을 제공합니다. 이외에도 코드 내에서 사용할 지역, 언어 설정에 따른 로케일 설정과 에러 메시지 처리 등도 포함합니다.|
|com/skcc/pms/bizcomponent/scope/bcdesignmanager/BCDesignManagerController.java|여러 가지 웹 요청을 처리하기 위해 다양한 API 엔드포인트를 제공하는 컨트롤러임. 이 컨트롤러가 제공하는 기능은 엑셀 파일 다운로드, 첨부 파일 목록 조회, 파일 다운로드, 파일 삭제, 그리드 업데이트, 작업일 조회 등 다양함.|
|com/skcc/pms/bizcomponent/scope/bcdesignmanager/PUDesignManager.java|JDK 기능을 이용해 업로드 되는 파일에 대해 처리 및 관리하고, 이를 통해 받아온 데이터를 데이터셋 객체로 반환하는 일련의 과정을 진행하는 서비스 코드임. 해당 코드에는 파일 업로드, 자동 파일 번호 생성, 엑셀 파일에서 레코드셋 가져오기, 파일 다운로드 등의 기능이 포함되어 있음. 동시에 데이터셋을 이용한 CRUD 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager5/BCSwingDevPgmManager5Controller.java|여러 상황에서 요청을 받아 처리하는 컨트롤러 역할 수행함. 각각의 메서드가 HTTP 요청을 받아 서비스 로직으로 전달하고 결과를 반환하며, 요청 내용에 따라 사용자 ID 코드 조회, 프로젝트 비율 조회, 파일 업로드 등 다양한 기능을 실행함.|
|com/skcc/pms/bizcomponent/scope/bcswingdevpgmmanager5/PUSwingDevPgmManager5.java|이 코드는 스윙 프로젝트의 범위를 관리하는 서비스로, 사용자의 요청을 받아 해당하는 동작을 수행하고 결과를 반환함. 다양한 조작들, 예를 들어 요청 데이터 조회, 다운로드, 업로드, 업데이트, 삭제 등이 가능함. 또한, 이외에도 일부 동작들은 데이터 검증이나 각종 예외 처리를 지원함.|
|com/skcc/pms/bizcomponent/scope/bcasisobjectmanagement/BCAsisObjectManagementController.java|프로젝트의 요구사항 범위와 관련된 기능들을 제공하는 컨트롤러로, 요구사항 범위 조회, 추가, 수정, 그리드 업데이트, 파일 삭제, 범위 삭제 과 같은 기능을 포함하고 있으며, 해당 범위에 대한 엑셀 파일 업로드 및 다운로드 기능도 제공함. 또한 프로젝트 진행률 조회, 요구사항 범위 이력 조회, 파일 리스트 조회 등의 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcasisobjectmanagement/PUAsisObjectManagement.java|프로젝트의 요구 사항, 진행률, 파일 관리 등을 처리하는 기능이 포함된 서비스 클래스임. 이 클래스에는 요구 사항 리스트 조회, 추가, 수정, 삭제, 엑셀 다운로드, 업로드, 상태 조회 등의 메소드가 있음.|
|com/skcc/pms/bizcomponent/scope/bcasisobjectmanagement/DUAsisObjectManagement.java|다양한 유형의 데이터를 관리하고 처리하는 방법을 제공하며, 서버에서 실행되고 데이터베이스와 사용자 인터페이스와 연동하여 작동하는 업무용 로직을 제공함. 이는 코드 내의 주석에 포함된 설명을 통해 작성된 코드의 구체적인 활동을 다룸. 주요 기능으로는 데이터 조회, 추가, 삭제, 업데이트, 엑셀 파일 다운로드 및 업로드, 요구사항 관리 등이 있음.|
|com/skcc/pms/bizcomponent/scope/bccorrectiveactionhk/DUCorrectiveActionHK.java|해당 코드는 기능 검토 관련 정보를 데이터베이스에서 조회, 수정, 추가, 삭제 하는 등 많은 기능을 수행하는 비즈니스 로직을 포함하고 있으며, 이를 위해 SQL 쿼리를 실행하는 기능과 엑셀 파일을 입력받아 데이터베이스에 저장하는 기능 등이 포함되어 있음. 또한, 엑셀 파일 다운로드 및 압축 파일 생성 등의 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bccorrectiveactionhk/PUCorrectiveActionHK.java|SKCC 프로젝트의 스코프 관리를 위한 서비스이며, 서비스는 각각의 요청 정보를 인자로 받아, 문제 해결 액션 목록 조회, 액션 추가, 액션 업데이트, 요구 사항 스코프 그리드 업데이트, 액션 파일 리스트 조회, 액션 파일 삭제, 액션 삭제 등 여러 연산을 수행하는 기능들을 포함하고 있음. 추가로, 요구 사항 스코프 리포트 생성, 엑셀 업로드 및 다운로드, 프로그레스 레이트 조회, 상세 코드 사용 여부 조회 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bccorrectiveactionhk/DUCorrectiveActionHK2.java|이 코드는 긴 텍스트 분석을 위한 클래스 DUCorrectiveActionHK2를 정의하고, 이 클래스에 속하는 메소드들이 구현되어 있음. 메소드들은 주로 데이터 검색, 데이터 삽입, 데이터 업데이트 등의 역할을 수행하며, 각각의 메소드는 요청정보 DataSet 객체와 Request 정보를 매개변수로 받음. 각각의 메소드는 해당하는 SQL 쿼리를 실행하여 데이터를 검색하거나 삽입하거나 업데이트하고 처리결과를 반환하는 역할을 함. 이 클래스는 데이터베이스와 관련된 업무처리를 담당하며, 각각의 메소드 내부에는 주로 SQL 쿼리를 실행하는 코드가 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bccorrectiveactionhk/BCCorrectiveActionHKController.java|웹 요청에 따라 특정 기능을 수행하는 컨트롤러로, 각 함수는 요구사항 스코프, 정정 작업, 플랜 진행률, 요구사항 상세 코드, 엑셀 다운로드, 엑셀 업로드 등에 관련된 서비스를 호출하여 데이터를 처리하고 응답함.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanager0/BCRequirementsScopeManager0Controller.java|프로젝트의 요구사항과 관련된 CRUD 작업을 수행하고, 요구사항 관련 파일 업로드, 다운로드, 상세코드 조회 등의 기능을 담당하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanager0/PURequirementsScopeManager0.java|요구사항 범위를 관리하기 위한 다양한 기능을 제공하는 Java 클래스임. 이 클래스는 요구사항 범위를 조회, 추가, 업데이트, 삭제하며, 엑셀 파일로부터 정보를 가져오거나 엑셀 파일로 내보내는 기능도 있음. 또한 프로그레스 진행율을 조회하고, 세부사항 코드를 체크하거나 사용여부를 확인하는 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcdesigninterfacemanager/BCDesignInterfaceManagerController.java|온라인 컨텍스트와 요청 데이터셋에 따라서 여러 가지 웹 리퀘스트 요청을 처리하고 관련된 서비스를 호출하여 엑셀 파일 다운로드, 파일 관리, 데이터 조회 및 업데이트 등의 작업을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcdesigninterfacemanager/PUDesignInterfaceManager.java|프로젝트의 구성 요소(스코프)를 관리하는 기능을 가진 PUDesignInterfaceManager 클래스가 포함된 코드임. 이 클래스는 기능을 추가, 조회, 업데이트, 삭제하는 여러 메소드(pmScopeListInq, pmUserIdCode, pmProRate 등)를 포함하고 있으며, 파일 처리 기능(pmExcelUpload, pmFileDel 등)도 포함되어 있음. 사용 계정과 연결된 모든 정보를 처리하는데 이 클래스가 핵심 역할을 함.|
|com/skcc/pms/bizcomponent/scope/bctestmanagerfortms/PUTestManagerforTMS.java|테스트 상황 관리나 테스트 상태의 조회, 추가, 수정, 삭제 등과 같은 기능을 담당하는 자바 서비스 코드임. 또한, 엑셀 파일 업로드, 엑셀 다운로드 등의 기능을 포함하고 있으며, 부모 정보 업데이트, 테스트 현황 차트 그리드, 테스트 연동 코드 리스트 조회, 검증 환경 설정들을 관리하는 기능들도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bctestmanagerfortms/BCTestManagerforTMSController.java|Spring 프레임워크를 사용하여 구현된 웹 애플리케이션의 컨트롤러로, 테스트 관리 시스템(TMS)에 대한 다양한 기능들을 요청에 따라 처리하고 그 결과를 반환함. 이 기능들은 테스트 목록 조회, 테스트 관리자 추가, 업데이트, 삭제, 엑셀 파일 다운로드 및 업로드, 스코프 및 매핑 정보 조회 및 수정, 차트 데이터 조회, 웹 페이지 데이터 조회 등을 포함함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager5/PUDesignProgramManager5.java|주어진 정보를 기준으로 일련의 데이터 처리 작업을 수행하는 인터페이스 제공, 데이터 조회, 업데이트, 삭제 및 파일 관리 기능을 포함하는 여러 메소드가 정의되어 있는 프로젝트 관리 서비스임.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager5/BCDesignProgramManager5Controller.java|스프링 프레임워크를 이용해 웹 서비스를 제공하는 컨트롤러로써, 주로 프로젝트 승인, 엑셀 파일 다운로드, 프로젝트 범위 조회 및 삭제, 요청 확인, 파일 삭제, 업데이트, 추가 등 다양한 업무 처리를 담당하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager2/PUDesignProgramManager2.java|스프링 프레임워크를 사용하여 작성된 여러 가지 업무 관련 기능들을 제공하는 서비스임. 기능들에는 지정된 요청 정보를 기반으로 데이터 조회, 데이터 수정, 데이터 삭제, 파일 업로드 및 다운로드, 엑셀 파일 처리 등이 포함되어있음. 에러 발생 시 사용자 정의 예외를 발생시키며, 에러 메시지를 관리함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager2/BCDesignProgramManager2Controller.java|HTTP 요청을 처리하고 데이터를 추가, 조회, 업데이트, 삭제하는 여러 웹 API를 제공하는 컨트롤러 클래스 구현임.   이때, 처리할 데이터에는 스코프 리스트, 스코프 오브젝트의 사용 여부, 파일 다운로드,  엑셀 파일 다운로드 및 업로드, 작업 이름 조회, 스코프 추가 및 업데이트 및 삭제 등 다양한 작업이 포함됨.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanager1forfinnq/PURequirementsScopeManager1ForFinnq.java|사용자의 요구사항 관리를 위한 서비스로, 요구사항 목록 조회, 추가, 수정, 삭제, 파일 업로드/다운로드 및 엑셀 업로드/다운로드를 지원함.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanager1forfinnq/DURequirementsScopeManager1ForFinnq.java|이 코드는 요구사항 범위를 관리하는 기능이 구현되어 있으며, 기능 목록으로는 요구사항 범위 목록 조회, 요구사항 범위 추가, 업데이트, 삭제, 엑셀 업로드 및 다운로드 등을 수행 가능한 기능으로 구성되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanager1forfinnq/BCRequirementsScopeManager1ForFinnqController.java|이 코드는 웹 요청에 따라 서비스 메서드를 연결시키고 결과를 반환하는 컨트롤러 역할을 수행함. 많은 서비스 메서드들이 있지만, 그 중 몇 가지는 Excel 파일을 다운로드 받거나 업로드하는 기능, 요구 사항의 목록을 조회하거나 추가, 업데이트, 삭제하는 기능을 제공함. 이 외에도 프로젝트의 진척률 조회, 파일 리스트 조회 등의 기능도 제공함.|
|com/skcc/pms/bizcomponent/scope/bcitestmanaget/DUITestManager.java|사용자의 프로젝트 관리에 필요한 데이터를 조회, 추가, 수정, 삭제하는 등의 기능을 수행하기 위한 코드임. 주요 기능으로는 테스트 관리자 목록 조회, 테스트 담당자 ID 조회, 테스트 관리자 엑셀 다운로드, 테스트 관리자 추가, 테스트 관리자 업데이트, 테스트 관리자 엑셀 업로드 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcitestmanaget/PUITestManager.java|테스트 관리와 관련된 다양한 기능을 수행하는 서비스로, 요청 데이터를 기반으로 테스트 목록을 조회하고, Excel 파일을 다운로드하거나 업로드하는 기능, 테스트 관리자의 추가, 수정, 삭제 기능 및 이에 대한 보고서 생성 기능을 제공함.|
|com/skcc/pms/bizcomponent/scope/bcitestmanaget/BCITestManagerController.java|웹에서 엑셀 파일 다운로드, 데이터 추가/수정/삭제/조회, 엑셀 업로드, 리포트 생성, 링크 조회, 테스터 ID 조회 등의 기능을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/bcdesigndevmanager/BCDesignDevManagerController.java|스프링 프레임워크를 이용한 웹 애플리케이션에서 다양한 요청에 대해 엑셀 다운로드, 파일 관리, 데이터 조회 및 업데이트 등의 기능을 수행하는 컨트롤러 역할을 함.|
|com/skcc/pms/bizcomponent/scope/bcdesigndevmanager/PUDesignDevManager.java|프로젝트의 범위 및 설계 개발 관련 기능들을 제공하는 서비스로, 프로젝트 관련 정보 조회, 사용자 ID와 코드 조회, 프로젝트 등록, 삭제, 수정, 파일 업로드 및 다운로드, Excel 데이터 처리 등의 기능이 있음.|
|com/skcc/pms/bizcomponent/scope/squalityimprovementdashboard2/BCSQualityImprovementDashboard2Controller.java|프로젝트 관리에 필요한 기능들(리스트 조회, 추가, 업데이트, 파일 삭제 및 다운로드, 엑셀 업로드/다운로드, 테스트 계획, 상태 조회 등)을 웹 요청을 통해 처리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/scope/squalityimprovementdashboard2/PUSQualityImprovementDashboard2.java|프로젝트의 요구사항 관리, 테스트 계획과 상태, 파일 관리 등 다양한 기능을 수행하는 클래스임. 주요 기능으로는 요구사항이 성공적으로 적용되었는지 확인, 요구사항 항목 추가/삭제/갱신, 파일 조회/삭제, Excel 업로드/다운로드, 테스트 계획 및 상태 확인등이 포함됨.|
|com/skcc/pms/bizcomponent/scope/squalityimprovementdashboard2/DUSQualityImprovementDashboard2.java|이 코드는 사용자의 요청에 따라 파일 업로드, 다운로드, 데이터베이스 쿼리 실행 등 다양한 기능을 수행하는 AI 비서로, 특히 SKCC 회사의 품질향상 대시보드 및 요구사항 범위를 관리하는 비즈니스 로직을 처리하는 작업을 담당하고 있다. 또한, 이 코드는 오류 처리와 사용자 정보 관리 등의 기능도 포함하고 있다.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager3/PUDesignProgramManager3.java|프로젝트 관리를 위한 함수들을 모아놓은 클래스로, 각 함수별로 업무 그룹 조회, 사용자 ID 코드 조회 및 설정, 파일 업로드 및 다운로드, 엑셀 데이터 다운로드 등의 여러 기능들을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager3/BCDesignProgramManager3Controller.java|웹 요청을 처리하는 컨트롤러로, 사용자 아이디, 작업 이름, 프로젝트 범위 추가/수정/삭제/조회, 파일 업로드/삭제, 데이터 엑셀 다운로드 등 다양한 기능을 수행하도록 도와줌.|
|com/skcc/pms/bizcomponent/scope/bcrmmanagementwb/PURmManagementWB.java|요구사항 범위를 관리하고 해당 내용을 엑셀에 저장하거나 불러올 수 있는 기능을 제공하며, 이를 위해 데이터셋을 추가, 업데이트, 삭제하고, 요구사항 범위 히스토리 조회, 리포트 생성, 엑셀 업로드, 다운로드 등 다양한 작업을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcrmmanagementwb/DURmManagementWB.java|사용자의 요청에 따라 데이터베이스로부터 데이터를 조회하거나 업데이트, 삽입 등의 작업을 수행하는 자바 기반 코드임. 스프링 프레임워크와 MyBatis 등을 활용해 조직의 업무 관리를 위한 데이터를 처리하고 있음. 이 데이터는 주로 요구사항, 범위 관리, 업무 상태 등과 관련된 정보를 다루고 있음. 또한, 엑셀 파일을 업로드하여 데이터를 일괄 처리하는 기능도 포함하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcrmmanagementwb/BCRmManagementWBController.java|프로젝트 관리에 필요한 서비스를 수행하기 위한 여러 웹 방식 요청(RequestMapping) 처리를 목적으로 하는 컨트롤러임. 예를 들어요구사항 범위 수정, 엑셀 파일 업로드 및 다운로드, 중복 체크, 파일 삭제, 목록 조회 등의 작업을 포함함.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager4/PUDesignProgramManager4.java|주어진 데이터셋 객체와 요청 정보를 바탕으로, 데이터 추가, 수정, 삭제, 엑셀 등록, 엑셀 다운로드, 파일 다운로드 및 삭제, 사용자 ID 및 정보 조회, 작업이름 조회 등을 수행하는 다양한 기능을 가진 스프링 서비스 클래스임.|
|com/skcc/pms/bizcomponent/scope/bcdesignprogrammanager4/BCDesignProgramManager4Controller.java|Excel 파일 다운로드, 파일 내역 조회, 파일 다운로드, 파일 삭제, 그리드 업데이트, 작업일 조회, 데이터 조회 및 다운로드 등 다양한 웹 요청을 처리하는 컨트롤러로 동작함.|
|com/skcc/pms/bizcomponent/scope/bcchangemanager/DUChangeManager.java|이 코드는 '변경 관리' 모듈과 관련된 기능들을 제공하는 클래스임. 사용자가 요청한 데이터를 바탕으로 DB에서 데이터를 조회, 추가, 수정, 삭제하는 기능을 수행하고 반환한다. 특히, 엑셀 파일을 읽고 쓰는 등의 파일 관련 작업도 수행함.|
|com/skcc/pms/bizcomponent/scope/bcchangemanager/PUChangeManager.java|다양한 기능을 가진 비즈니스 서비스를 제공하는데, 그 중에는 파일 업로드, 지정된 레코드셋의 요청 데이터 처리, 액셀 데이터 처리, 검색 작업, 데이터 추가 및 수정, 사용자 정보 조회 및 다운로드, 데이터 삭제 등이 있음. 해당 서비스는 데이터 처리 중에 발생할 수 있는 예외 상황에 대비하여 예외 처리 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/scope/bcchangemanager/BCChangeManagerController.java|여러 가지 웹 요청을 처리하고 반환값을 제공하는 스프링 기반의 웹 컨트롤러임. 각각의 요청은 로그인 사용자 정보 조회, 변경 리스트 조회 및 삭제, 사용자 리스트 검색, 엑셀 다운로드 및 업로드, 변경 기록 추가 및 조회, 파일 리스트 조회 및 삭제 등 다양한 기능을 수행함.|
|com/skcc/pms/bizcomponent/scope/bcsinstitutionexistingreportact/DUInstitutionAct.java|이 코드는 HiPMS/범위관리 업무를 처리하는 자바 패키지로, 보고서 작성, 데이터 셋 요청 및 처리, SQL 쿼리를 통한 DB를 CRUD하는 로직, 엑셀 파일 생성 및 다운로드, 엑셀 파일 업로드 및 데이터 유효성 검사 등의 기능을 구현하고 있음.|
|com/skcc/pms/bizcomponent/scope/bcsinstitutionexistingreportact/PUInstitutionAct.java|이 코드는 다양한 데이터 조작 메소드를 포함하고 있는 서비스 클래스다. 요청받은 데이터 처리를 위해 연산을 수행하고, 처리된 결과 데이터 셋을 반환한다. 또한 엑셀 파일 업로드 및 다운로드도 지원한다. 가능한 에러를 잡아내고 다루도록 구현되어 있다.|
|com/skcc/pms/bizcomponent/scope/bcsinstitutionexistingreportact/BCInstitutionActController.java|스프링 프레임워크를 사용한 웹 애플리케이션으로서, 특정 URL 요청마다 데이터 처리 작업을 수행하고 그 결과를 반환함. 작업들은 프로젝트의 검사, 엑셀 파일 업로드, 시스템 코드 관리(추가, 수정, 삭제), 요구사항 범위 조회, 서비스 요청 관리를 위한 엑셀 파일 다운로드 및 업로드 등 다양함.|
|com/skcc/pms/bizcomponent/scope/bccheckqualitdashboard/BCCheckQualityDashBoardMgrController.java|웹 요청을 처리하고 데이터를 반환하는 컨트롤러임. 'dmCheckQualityDashBoardMgr'라는 요청이 들어오면, 이에 대한 처리를 'service'에게 위임하고 그 결과를 반환함.|
|com/skcc/pms/bizcomponent/scope/bccheckqualitdashboard/DUCheckQualityDashBoardMgr.java|다양한 데이터를 관리하고, 요청에 따라 데이터를 검색, 생성, 업데이트, 삭제하는 기능들을 처리하는 자바 클래스임. 이 클래스는 주로 퀄리티 대시보드의 관리 작업에 사용되며, 각 상세 기능들은 요청 데이터의 'crud' 필드를 이용해 분기처리됨. 'code_select' 함수를 통해 다양한 코드를 조회하고, 이메일 테이블 생성에 필요한 데이터를 관리하는 기능도 포함하고 있음.|
|com/skcc/pms/bizcomponent/blog/blogboard/PUBlogBoard.java|블로그 게시판의 정보를 받아오고 상태 메시지를 설정하는 세 가지 메소드(pmBlogBoardList, pmBlogBoardName, pmBlogBoardInfo)를 포함한 서비스 클래스임.|
|com/skcc/pms/bizcomponent/blog/blogboard/DUBlogBoard.java|블로그 게시판의 리스트, 이름, 정보를 데이터베이스에서 조회하여 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/blog/blogboard/BCBlogBoard.java|블로그 게시판의 리스트를 가져오고, 게시판의 이름과 정보를 조회하는 웹 서비스를 제공함.|
|com/skcc/pms/bizcomponent/blog/blogcmt/BCBlogCmt.java|블로그 댓글의 생성, 수정, 삭제, 리스트 조회, 특정 댓글 조회 기능을 담당하는 웹 컨트롤러 기능이 있음.|
|com/skcc/pms/bizcomponent/blog/blogcmt/DUBlogCmt.java|블로그 댓글 관련 데이터를 처리하는 기능으로, 댓글 삽입, 수정, 삭제, 목록 조회, 댓글 정보 조회 기능이 있음.|
|com/skcc/pms/bizcomponent/blog/blogcmt/PUBlogCmt.java|블로그 댓글에 대한 CRUD(생성, 업데이트, 삭제, 조회)와 댓글 정보 조회 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/blog/blogboardmgr/BCBoardMgr.java|블로그 게시판 관리와 관련된 서비스로, 게시글을 제출, 삭제, 목록을 조회하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/blog/blogboardmgr/DUBoardMgr.java|사용자의 블로그 게시판 관리에 필요한 동작들을 수행하는 클래스로, 게시판 글 제출, 삭제 및 리스트 조회 기능을 포함하고 있음. 게시글 제출과 삭제를 수행할 때는 XML 형식의 요청 데이터를 파싱하여 데이터베이스에 적용하고, 게시글 리스트 조회는 데이터베이스에서 레코드 세트를 가져와 반환함.|
|com/skcc/pms/bizcomponent/blog/blogboardmgr/PUBoardMgr.java|블로그 게시판 관리를 위해 게시글을 제출하고, 삭제하고, 게시글 목록을 조회하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/blog/bloguser/PUBlogUser.java|블로그 사용자 정보를 관리하고, 블로그 게시글 작성, 답변, 체크, 사용자 정보 조회 등의 메소드를 포함하는 블로그 서비스 클래스임.|
|com/skcc/pms/bizcomponent/blog/bloguser/BCBlogUser.java|블로그 사용자와 관련된 기능들을 제공하는 컨트롤러로, 블로그 글 작성, 답변 확인, 사용자 정보 확인 등의 기능을 실행함.|
|com/skcc/pms/bizcomponent/blog/bloguser/DUBlogUser.java|블로그 사용자에 관련된 데이터를 데이터베이스에 삽입, 업데이트, 선택하는 기능을 제공하는 데이터 유닛 클래스임. 이 클래스에는 블로그 정보를 데이터베이스에 삽입하는 메소드, 블로그 답변을 데이터베이스에 업데이트하는 메소드, 시스템 날짜를 업데이트하는 메소드, 블로그 정보를 데이터베이스에서 조회하는 메소드 등이 있음. |
|com/skcc/pms/bizcomponent/blog/blogquiz/DUBlogQuiz.java|블로그 퀴즈 데이터 조회를 위한 메서드를 포함한 레포지트리임.|
|com/skcc/pms/bizcomponent/blog/blogquiz/BCBlogQuiz.java|스프링 프레임워크를 활용해 블로그 퀴즈 관련 요청을 처리하고, 해당 요청에 대한 서비스 로직을 호출하는 컨트롤러 역할을 함.|
|com/skcc/pms/bizcomponent/blog/blogquiz/PUBlogQuiz.java|블로그 퀴즈의 요청 데이터를 처리하고 응답 데이터를 반환하며, 성공/실패 관련 메시지도 처리하는 역할을 하는 자바 서비스임.|
|com/skcc/pms/bizcomponent/blog/blogarticle/DUBlogArticle.java|블로그 게시글에 관한 데이터를 삽입, 수정, 삭제, 조회, 태그 또는 내용 검색 등의 기능을 데이터베이스와 연동하여 처리하는 기능을 담당함.|
|com/skcc/pms/bizcomponent/blog/blogarticle/PUBlogArticle.java|블로그 게시글에 대한 여러 작업을 처리하는 기능으로, 게시글 삽입, 댓글 수 증가, 읽은 수 증가, 좋아요 수 증가 및 감소, 게시글 정보 업데이트, 게시글 삭제, 모든 게시글 조회, 특정 게시글 리스트 조회, 게시글 상세 정보 조회, 게시판 번호 찾기, 태그 관련 리스트 조회, 게시글 검색 등의 행위를 수행함.|
|com/skcc/pms/bizcomponent/blog/blogarticle/BCBlogArticle.java|블로그 게시글 관련 여러 기능(게시글 추가, 댓글 수 증가, 좋아요 수 증가/감소, 게시글 업데이트, 삭제, 전체 게시글 조회, 태그 리스트 조회 등)을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/blog/bloglikecheck/DUBlogLikeCheck.java|블로그 좋아요 체크 관련 기능을 수행하는데, 좋아요 추가, 삭제, 그리고 확인을 위한 쿼리를 수행함.|
|com/skcc/pms/bizcomponent/blog/bloglikecheck/PUBlogLikeCheck.java|블로그의 '좋아요' 관련 기능을 수행하는 서비스로, '좋아요' 체크, 추가, 삭제 기능을 제공하며 각 기능 수행 중 발생할 수 있는 예외를 처리하는 기능이 있음.|
|com/skcc/pms/bizcomponent/blog/bloglikecheck/BCBlogLikeCheck.java|블로그 게시물의 '좋아요' 기능에 관련된 서비스를 관리하며, '좋아요' 기능을 추가, 삭제, 확인하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/agile/dto/AgVersion.java|프로젝트 번호, 버전 ID, 버전 이름, 시작 일자, 종료 일자, 상태, 버전 정렬 순서, 생성자 ID, 수정자 ID를 가진 '버전정보' 객체를 생성하고 조작하는 기능 수행.|
|com/skcc/pms/bizcomponent/agile/dto/AgBacklogType.java|백로그 유형 정보를 저장하고, 반환하는 클래스 기능을 수행함. 해당 정보에는 프로젝트 번호, 백로그 타입, 타입명, 설명, 비고, 사용할 워크플로우 번호, 생성자, 수정자, Jira 프로젝트 키 등이 포함됨.|
|com/skcc/pms/bizcomponent/agile/dto/AgWorkflowStep.java|AgWorkflowStep 클래스는 JIRA의 워크플로우 스텝에 대한 정보를 포함하고 있으며, 해당 정보들을 가져오거나 설정하는 여러 가지 getter와 setter 메소드를 제공함.|
|com/skcc/pms/bizcomponent/agile/dto/AgWip.java|'AgWip' 클래스는 애자일 프로젝트 설정에 관련된 정보를 담고 관리하는 클래스로, 프로젝트의 다양한 속성들과 메시지 리스트를 가지고 있으며, 이에 대한 getter, setter 메소드와 메시지를 추가하는 append 메소드를 제공함.|
|com/skcc/pms/bizcomponent/agile/dto/AgWorkflow.java|프로젝트 정보, 워크플로우 정보, 생성/수정자 정보 등을 관리하는 'AgWorkflow' 클래스를 정의하고, 각 정보에 대한 getter, setter 메소드를 제공함.|
|com/skcc/pms/bizcomponent/agile/dto/AgProjectConfig.java|Agile 프로젝트 설정 정보인 프로젝트 번호와 storypoint 설정 필드를 저장하고, 이를 불러오거나 변경할 수 있는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/agile/dto/AgWorkflowStepCategory.java|프로젝트 번호, 카테고리 번호, 카테고리 명, 워크플루 레벨, 생성자 ID, 수정자 ID, Jira 프로젝트 키 등의 정보를 가진 AgWorkflowStepCategory 클래스 정의와 해당 정보들의 getter, setter 메소드 구현으로 결정되어 있음.|
|com/skcc/pms/bizcomponent/agile/dto/AgUser.java|사용자의 프로젝트 번호, 사번, 사용자명, PMS 아이디, 사용자 유형, 연락처, 이메일, 회사명, 생성사번, 수정사번 등의 정보를 관리하고 반환하는 기능이 있음.|
|com/skcc/pms/bizcomponent/agile/dto/AgCommonCode.java|프로젝트 번호, 코드 그룹, 코드 상세, 코드명, 코드 설명, 기타 기술 사항, 점수와 같은 속성을 가진 'AgCommonCode'라는 클래스를 정의하고, 이들 각각에 대한 getter와 setter 메서드를 제공함.|
|com/skcc/pms/bizcomponent/agile/dao/AgListDao.java|MyBatis의 SqlSessionTemplate을 사용하여 데이터베이스에서 질의하여 정보를 가져오거나, 정보를 추가하거나, 정보를 수정하거나, 정보를 삭제하는 기능을 수행하는 DAO클래스임.|
|com/skcc/pms/bizcomponent/agile/dao/ProjectDashboardDao.java|데이터베이스로부터 프로젝트 정보, 스토리포인트 총합, 벨로시티를 조회하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/agile/dao/ChartDao.java|사용자의 백스토리 정보를 가져오고, 버드다운 차트의 데이터를 조회하는 두 가지 메소드를 가진 Dao 클래스임.|
|com/skcc/pms/bizcomponent/agile/dao/UserDao.java|프로젝트의 멤버 리스트를 MyBatis를 사용하여 데이터베이스에서 조회하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/agile/dao/CommonCodeDao.java|공통 코드(List, get, 수량 확인 등)을 다루는 기능을 SQL 명령을 통해 제공하며, 공통 코드에 대한 추가, 수정 작업도 가능함.|
|com/skcc/pms/bizcomponent/agile/dao/SprintDao.java|스프링트(Sprint) 관련 정보를 처리하기 위한 DAO 클래스로, 스프링트 리스트 조회, 특정 스프링트 조회, 스프링트 개수 조회, 스프링트 추가, 수정, 삭제, 특정 스프링트 외 삭제, 닫힌 스프링트 개수 조회, 닫힌 스프링트 추가, 수정, 닫힌 스프링트 외 삭제 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/agile/dao/BackLogDao.java|Mybatis를 이용해 데이터베이스와 상호작용하는 기능을 하는 DAO 클래스임. 이 클래스는 주로 어자일 백로그를 생성, 삭제, 업데이트 및 조회하는 역할을 수행하며, 사용자, 스프린트, 이슈의 정보를 가져오는데 쓰임. 또한, 특정 링크타입의 수, EPIC 마킹, 백로그 타입 등의 추가적인 조회 및 업데이트 기능도 제공함.|
|com/skcc/pms/bizcomponent/agile/dao/WorkValueDao.java|MyBatis와 함께 사용되는 SqlSessionTemplate을 이용하여 Agile 워크 벨류 데이터에 대해 일별, 주별, 월별 목록을 조회하고, 추가 및 삭제하는 기능을 수행하는 데이터 액세스 객체임.|
|com/skcc/pms/bizcomponent/agile/dao/VelocityDao.java|MyBatis를 사용해 데이터베이스에서 정보를 조회하여 리스트 형태로 반환하는 기능을 가진 클래스 정의임.|
|com/skcc/pms/bizcomponent/agile/dao/WipDao.java|MyBatis의 SqlSessionTemplate를 이용해 필요한 SQL 질의를 실행하고, Agile WIP(Work in Progress)에 대한 데이터를 추가, 조회하는 기능을 담당하는 DAO(데이터 접근 객체)임.|
|com/skcc/pms/bizcomponent/agile/dao/VersionDao.java|MyBatis를 이용해 데이터베이스와 연동하고, 프로젝트의 버전 정보를 조회, 추가, 업데이트하며, 'BacklogVersion'에 관련된 정보를 조회, 추가, 삭제하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/agile/dao/BackLogDashBoardDao.java|다양한 조회, 생성, 수정, 삭제 기능을 가진 'Backlog'를 관리하기 위한 데이터 접근 객체(DAO)임. 이는 맵 형태의 파라미터를 인자로 받아서 특정 쿼리에 맵핑되는 데이터를 SQL 데이터베이스에서 가져오거나 업데이트하거나 삭제하는 역할을 담당함. 또한, Agile 방식의 프로젝트 관리에 필요한 'Backlog', 'Sprint', 'Release' 등의 데이터를 처리함.|
|com/skcc/pms/bizcomponent/agile/dao/WorkFlowDao.java|MyBatis와 연동하여 작업흐름, 작업흐름 단계, 작업흐름 단계 분류와 관련된 CRUD 작업(생성, 읽기, 업데이트, 삭제)을 수행하는 Data Access Object임. 또한, 이러한 객체들의 목록을 조회하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/agile/dao/ReportDao.java|사용자별 단계 요약을 가져오는 기능을 수행함.|
|com/skcc/pms/bizcomponent/agile/dao/ProjectConfigDao.java|Mybatis를 이용하여 데이터베이스에서 Agile 프로젝트 설정을 가져오거나 변경(update), 추가(insert), 삭제하는 기능을 가진 Dao 클래스임.|
|com/skcc/pms/bizcomponent/agile/dao/AgileUserDao.java|Mybatis를 사용해 데이터베이스에 사용자를 추가하고, 사용자의 수를 세는 기능을 수행함.|
|com/skcc/pms/bizcomponent/agile/controller/CommonCodeController.java|공통 코드 리스트를 받아오고, 여러 공통 코드를 등록하는 등 공통 코드와 관련된 작업을 수행하며, 발생할 수 있는 SQL 오류와 시스템 오류를 처리하는 컨트롤러 기능 수행.|
|com/skcc/pms/bizcomponent/agile/controller/RedmineInterfaceController.java|Redmine과의 인터페이스를 관리하는 컨트롤러로, 특정 사용자의 프로젝트 리스트, 이슈 리스트를 동기화하거나 Redmine 프로젝트를 수동으로 업데이트하고, Jql 쿼리의 유효성을 확인하는 기능이 있으며, SQL 예외와 일반적인 예외 처리도 수행함.|
|com/skcc/pms/bizcomponent/agile/controller/JiraInterfaceController.java|JIRA 인터페이스에 대한 동기화 작업을 처리하고, SQL 오류나 시스템 오류 발생 시 해당 오류 정보를 반환하는 기능 수행.|
|com/skcc/pms/bizcomponent/agile/controller/BackLogController.java|특정 Agile 기능에 연관된 요청 처리를 위한 컨트롤러로, SQL 오류와 시스템 오류에 대한 예외처리를 포함하고 있음. 또한 테스트 리스트, 백로그 초기화, 백로그와 관련된 일반적인 요청 등 여러 URL 요청 처리를 포함하고 있음.|
|com/skcc/pms/bizcomponent/agile/controller/ChartController.java|사용자의 백로그 스토리를 가져오고 번 다운 차트를 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/agile/controller/WipController.java|Spring Framework에서 웹 요청 처리를 위한 컨트롤러 클래스로, "getList"와 "get"의 요청을 처리하여 WipService로부터 데이터를 가져오고, 발생하는 예외를 처리하는 기능이 있음.|
|com/skcc/pms/bizcomponent/agile/controller/BackLogDashBoardController.java|요청을 받아 다양한 서비스를 실행하고 그 결과를 반환하는 웹 컨트롤러 기능을 수행함. 이 때, 데이터베이스 오류나 시스템 에러 등 예외 상황이 발생하면 관련 에러 메시지를 반환하도록 구현되어 있음.|
|com/skcc/pms/bizcomponent/agile/controller/VelocityController.java|VelocityController 클래스는 사용자로부터의 요청을 받아 Agile 관련 데이터를 가져오는 기능과 예외 처리 기능을 제공함. 특히, 'getList' 메소드를 통해 'agile/velocity'으로 들어오는 요청에 대해 리스트 정보를 반환함. 그리고 발생할 수 있는 SQL 오류와 기타 시스템 오류를 처리함. |
|com/skcc/pms/bizcomponent/agile/controller/SprintController.java|스프링 프레임워크를 사용하여 웹애플리케이션의 스프린트 관리 부분을 담당하는 컨트롤러로, 주어진 매개변수를 통해 스프린트 목록을 받아오는 기능, 특정 스프린트 정보를 조회하는 기능, 새로운 스프린트를 추가하는 기능, 스프린트 정보를 업데이트하는 기능, 스프린트를 삭제하는 기능이 구현되어 있으며, SQL 오류와 일반적인 예외처리 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/agile/controller/ProjectDashboardController.java|프로젝트 대시보드 정보를 받아오는 기능과 예외 처리를 담당하는 컨트롤러이며, SQL 에러와 시스템 에러에 대해 로그를 출력하고 전달함.|
|com/skcc/pms/bizcomponent/agile/controller/AgListController.java|Agile 관련 등록, 리스트 조회 등의 웹 요청을 처리하고, 요청 도중 발생할 수 있는 SQL 예외와 일반 예외에 대한 처리를 포함하고 있음.|
|com/skcc/pms/bizcomponent/agile/controller/WorkValueController.java|Agile 작업의 일일, 주간, 월간 목록을 조회하고, 사용자의 등록 작업을 처리하는 컨트롤러 기능 제공 및 PostgreSQL 예외와 기본 예외를 핸들링하는 기능이 있음.|
|com/skcc/pms/bizcomponent/agile/controller/ProjectConfigController.java|Http 요청에 대한 응답을 처리하는 컨트롤러로, 프로젝트 설정 서비스에서 리스트를 가져오는 기능, 검색 리스트를 가져오는 기능, 새로운 정보를 등록하는 기능을 지원하며, 데이터베이스 에러와 일반적인 시스템 에러를 처리하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/agile/controller/ReportController.java|사용자별 Step 요약 정보를 가져오는 웹 요청을 제어하는 기능이 있음.|
|com/skcc/pms/bizcomponent/agile/controller/UserController.java|사용자 정보를 받아 특정 프로젝트의 멤버 리스트를 반환하고, SQL 오류 혹은 일반적인 시스템 오류가 발생하면 오류 메시지를 반환하는 기능을 담당하는 스프링 기반 컨트롤러임.|
|com/skcc/pms/bizcomponent/agile/service/ReportService.java|사용자에 의한 단계별 요약 정보를 가져오는 기능 수행|
|com/skcc/pms/bizcomponent/agile/service/WorkValueService.java|일별, 주별, 월별 데이터 조회, 작업값 등록 및 작업값 추가, 삭제에 대한 기능 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/agile/service/AgListService.java|다양한 데이터 조회, 추가, 업데이트, 삭제와 같은 CRUD 작업을 수행하는 서비스 로직 처리. 특히, JIRA 프로젝트 목록, 스프린트 목록, 에픽 목록 등의 상세 목록을 가져오는 기능을 제공하며, 사용자 로그인 ID를 이용하여 리스트를 등록하거나, sprint와 release 타입에 따라서 상세 목록을 등록하는 기능도 수행함.|
|com/skcc/pms/bizcomponent/agile/service/WipService.java|WipDao를 활용하여 WIP(Work In Progress) 정보를 추가(고유 ID 생성 포함), 조회하는 서비스를 제공함.|
|com/skcc/pms/bizcomponent/agile/service/CommonCodeService.java|특정 파라미터를 받아 데이터베이스에서 리스트를 불러오거나, 일련의 매개 변수와 함께 주어진 로그인 아이디를 사용하여 새로운 항목을 추가하거나 기존 항목을 업데이트하는 기능이 있음.|
|com/skcc/pms/bizcomponent/agile/service/UserService.java|주어진 파라미터를 이용해 프로젝트 멤버의 목록을 가져오는 기능을 제공함.|
|com/skcc/pms/bizcomponent/agile/service/BackLogService.java|다양한 메소드를 통해 BackLogDao의 함수를 호출하여 맵이나 리스트 형태의 데이터를 반환하며, 주로 진행 상태, 이슈 유형, 사용자, 스프린트, 에픽, 배포 등의 정보를 조회하거나, 테스트 리스트, 백로그 리스트 조회등의 기능을 가진 서비스임.|
|com/skcc/pms/bizcomponent/agile/service/SprintService.java|스프링트(Sprint) 서비스로, 데이터를 리스트로 검색하거나, 가져오는 기능, 새로운 데이터를 추가하는 기능, 기존 데이터를 수정하거나 삭제하는 기능이 있음. 추가, 수정, 삭제 기능은 모두 데이터베이스 트랜잭션을 관리함.|
|com/skcc/pms/bizcomponent/agile/service/BackLogDashBoardService.java|여러 가지 데이터를 조회하고, 특정 로직에 따라 수정하는 기능이 구현된 서비스 클래스임. 이 클래스는 테스트 리스트, 일반 리스트, 호환성 초기화 및 Jira, 포함된 상자 등을 가져오고, 다양한 사용자 사용에 맞는 리스트를 반환할 수 있음. 또한 진행 상태에 따라 상태 코드를 변환하는 기능도 제공하며, 백로그 정보를 가져오는 메소드도 포함되어 있음.|
|com/skcc/pms/bizcomponent/agile/service/RedmineInterfaceService.java|이 코드는 Redmine 프로젝트의 정보를 동기화하고, 특정 기준에 따라 프로젝트의 이슈 목록을 업데이트하는 등 다양한 기능을 수행하는 서비스를 제공함.|
|com/skcc/pms/bizcomponent/agile/service/ProjectConfigService.java|데이터베이스에서 프로젝트 설정 목록을 조회, 검색하고, 시스템에 설정 값을 추가하거나 업데이트하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/agile/service/VelocityService.java|입력 매개변수를 사용하여 데이터베이스에서 리스트를 가져와 처리 작업을 수행하고, 그 결과를 맵 형식으로 반환하는 기능을 수행함. 이 때, 리스트의 각 항목은 개별로 수집하며, 특히 "rnk"와 "cnt" 값이 일치하는 항목을 찾아 처리하며, 제공된 날짜 정보를 사용하여 반복적인 작업을 수행함. 이 정보는 최종적으로 정리된 리스트와 함께 반환됨. |
|com/skcc/pms/bizcomponent/agile/service/AgLogService.java|입력된 로그, 날짜, 모드, 메시지를 특정한 포맷으로 변환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/agile/service/ChartService.java|사용자의 백로그 스토리를 반환하고, 버튼다운 차트 데이터를 반환하는 기능을 가짐.|
|com/skcc/pms/bizcomponent/agile/service/JiraInterfaceService.java|이 코드는 JIRA 인터페이스를 이용해 협업 도구 JIRA 에서 데이터를 가져와서, 해당 기업의 프로젝트 관리 시스템에 종합적으로 업데이트하거나 동기화하는 기능을 제공함. 동기화 대상은 프로젝트, 이슈 목록, 작업상태, 워크플로우, 사용자, 스프린트 등이 있음. 이 과정에서 발생하는 모든 로그 정보를 관리하며, AI 비서를 통해 여러 사용자와 협업이 가능함.|
|com/skcc/pms/bizcomponent/agile/service/ProjectDashboardService.java|프로젝트 정보와 이야기 점수 합계, 벨로시티를 조회하는 기능을 제공하는 봇 서비스임.|
|com/skcc/pms/bizcomponent/cmnsvc/dto/IFServiceVo.java|연계 서비스 정보를 표현하는 객체를 생성하고 수정하는 기능을 가진 클래스임. 필드 값으로 서비스 ID, 서비스 유형, 사이트명, IP, 포트, 웹경로, 계정ID, 키 등을 가지며, 이들 필드 값에 대한 Getter, Setter 메소드를 제공함. 또한 전체 경로 정보를 반환하는 메소드도 포함됨.|
|com/skcc/pms/bizcomponent/cmnsvc/dto/ResponseData.java|HTTP 응답 데이터를 관리하는데 사용되는 클래스로, 유형(성공 또는 오류), 메시지, 전체 건수, 데이터 본문 등을 저장하고, 각 항목에 대한 getter, setter 메서드가 있는 구조임.|
|com/skcc/pms/bizcomponent/cmnsvc/dao/IFServiceDao.java|데이터베이스에 있는 외부 인터페이스 서비스 계정 정보를 관리(추가, 변경, 삭제)하고 조회하는 기능을 수행하는 DAO임.|
|com/skcc/pms/bizcomponent/cmnsvc/dao/IFServiceConfigDao.java|'IFServiceConfigDao' 클래스는 MyBatis를 이용한 DB 조회, 수정, 추가 기능을 지원하는 DAO임. 외부 인터페이스 서비스 계정에 대한 정보를 관리하고, 특정 정보를 가져오거나, 전체 목록을 가져오거나, 특정 조건에 맞는 목록을 가져오며, 정보를 수정하거나 추가하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/cmnsvc/dao/ProjectDao.java|매개변수로 받은 파라미터를 활용해 특정 프로젝트의 수를 조회하거나 프로젝트 목록을 조회하는 기능을 가진 DAO 클래스임.|
|com/skcc/pms/bizcomponent/cmnsvc/controller/IFServiceConfigController.java|해당 코드는 인터페이스 서비스 구성에 관한 내용을 처리하는 컨트롤러 기능을 제공하는데, 특정 파라미터를 가진 데이터 조회, 목록 조회, 검색 내역 조회, 데이터 등록 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/cmnsvc/controller/IFServiceController.java|웹 서비스를 제공하는 컨트롤러에서, 리스트를 불러오는 기능, 특정 정보를 추가하거나 업데이트하는 기능, 특정 정보를 삭제하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/cmnsvc/controller/ProjectController.java|클라이언트로부터 들어오는 요청에 대해 프로젝트 목록을 조회해서 응답하는 서버 컨트롤러 기능을 수행함.|
|com/skcc/pms/bizcomponent/cmnsvc/common/ServiceHttpClient.java|HTTP 클라이언트를 통해 외부 서비스에 로그인하고 JSON 요청을 설정한 후, HTTP 메서드를 실행하여 원격 서버와의 통신 처리 및 에러 핸들링을 수행함.|
|com/skcc/pms/bizcomponent/cmnsvc/common/HttpResposeWork.java|HTTP 응답을 처리하는 메소드를 가진 인터페이스임.|
|com/skcc/pms/bizcomponent/cmnsvc/service/ProjectService.java|주어진 매개변수를 기반으로 DAO로부터 데이터를 조회하여 항목 수를 반환하고, 목록을 가져오는 기능이 있음.|
|com/skcc/pms/bizcomponent/cmnsvc/service/IFServiceConfigService.java|특정 데이터베이스와 관련된 조회, 등록, 갱신 기능들을 수행하는 서비스 컴포넌트임.|
|com/skcc/pms/bizcomponent/cmnsvc/service/IFServiceService.java|IFServiceDao를 통해 인터페이스 서비스 목록을 조회하고, 새로운 인터페이스 정보를 추가하며, 해당 정보를 업데이트하고, 삭제하는 기능 수행함.|
|com/skcc/pms/bizcomponent/project/bcdesignprogramprogress/PUDesignProgramProgress.java|개발 진행 상황에 대한 데이터를 조회하고 처리하는 서비스를 제공하는 기능을 가짐. 세부적으로는 특정 컬럼의 개발 진행 상황 조회, 전체 개발 진행 상황 조회, 작업 이름 별 개발 진행 상황 조회 등의 기능을 구현하고 있음.|
|com/skcc/pms/bizcomponent/project/bcdesignprogramprogress/BCDesignProgramProgressController.java|프로젝트의 개발 진행 상황을 조회하는 세 가지의 요청 URI("pmDevProgressListInq", "pmDevProgressColListInq", "pmDevProgressWorkNameListInq")를 처리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcdesignprogramprogress/DUDesignProgramProgress.java|데이터베이스에서 프로젝트의 개발 진행 상태를 조회하고, 그 결과를 가공하여 반환하는 기능이 구현되어 있음. 'dmDevProgressColListInq', 'dmDevProgressListInq', 'dmDevProgressWorkNameListInq' 3가지 메소드를 통해 각각 개발 프로그램의 진척 추이 컬럼 정보, 그리드 데이터, 작업명 목록을 조회할 수 있음. 각 조회는 주어진 기간에 따라(주차, 일자, 월별) 결과를 달리하고, 결과 데이터는 누적 계산을 통해서 제공됨. 'isEar'과 'chint' 메소드를 사용해 검증 및 변환 작업도 수행함.|
|com/skcc/pms/bizcomponent/project/bctaskplanup/PUTaskPlanUp.java|엑셀 파일 업로드, 검색, 업데이트, 엑셀 파일 다운로드, MPP 파일 관련 처리 등, 프로젝트에 관한 다양한 기능을 담당하는 클래스임. 프로젝트 태스크 계획, 서브 프로젝트 조회, 역할 및 프로젝트 정보 업데이트 등 프로젝트 관리에 필요한 기능을 제공하며 오류 발생 시 로깅하고 예외를 처리함.|
|com/skcc/pms/bizcomponent/project/bctaskplanup/BCTaskPlanUpController.java|프로젝트의 태스크 계획과 관련된 데이터를 조회, 업데이트, 엑셀 다운로드, 엑셀 업로드 등을 수행하는 컨트롤러 클래스임.|
|com/skcc/pms/bizcomponent/project/bcrealbudgetstatcalcucommon/BCRealBudgetStatCalcuController.java|웹 요청을 처리하여 실제 예산 통계를 계산하는 서비스를 호출해 결과 데이터를 반환하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/project/bcrealbudgetstatcalcucommon/DURealBudgetStatCalcu.java|주어진 조건에 따라 실제 예산 계산을 수행하고, 데이터베이스에 업데이트 혹은 삽입하는 기능을 제공함. 이 프로그램은 노무비, 경비, 재료비 등 여러 가지 항목을 고려하여 계산을 수행하고, 검사를 통해 입력 가능한 범위를 초과하는 값이 있는지 확인함. 결과적으로, 이 코드는 프로젝트 예산의 관리 및 계산에 사용됨.|
|com/skcc/pms/bizcomponent/project/bcrealbudgetstatcalcucommon/PURealBudgetStatCalcu.java|실제 예산 통계 계산 로직을 처리하는 서비스로, 예산 통계를 계산한 후 그 결과를 DataSet으로 반환함.|
|com/skcc/pms/bizcomponent/project/bcprojectbasisfeeinfo/DUProjectBasisFeeInfo.java|프로젝트 기본 수수료 정보를 관리하는 기능을 수행하는데, 이는 사용자 정보 조회, 엑셀 업로드 및 다운로드, 정보 수정 및 삭제가 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectbasisfeeinfo/BCProjectBasisFeeInfoController.java|프로젝트의 기본 요금 정보에 대한 엑셀 업로드, 업데이트, 삭제, 목록 조회, 그리고 엑셀 다운로드 기능을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcprojectbasisfeeinfo/PUProjectBasisFeeInfo.java|프로젝트의 기본 비용 정보를 처리하는 서비스를 제공하는 클래스로, 필요한 요청 정보를 받아 해당 요청에 맞는 데이터를 검색, 업로드, 삭제, 수정, 다운로드 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/project/bcresultmanager/PUResultManager.java|프로젝트 결과 관리를 위한 여러 기능을 제공하는 서비스로, 데이터셋 요청을 받아 결과 목록 조회, 결과 업데이트, 팝업 결과 조회, 팝업 결과 업데이트, 마일스톤 리셋 등의 작업을 처리할 수 있는 메소드를 포함함.|
|com/skcc/pms/bizcomponent/project/bcresultmanager/DUResultManager.java|요청된 데이터에 따라 특정 프로젝트의 결과 정보를 질의, 업데이트하거나 마일스톤을 초기화하는 기능을 수행하는 클래스임.|
|com/skcc/pms/bizcomponent/project/bcresultmanager/BCResultManagerController.java|자바 스프링 프레임워크를 사용한 웹 애플리케이션에서 특정 프로젝트의 결과를 관리하는 컨트롤러로, '마일스톤 리셋', '팝업 업데이트', '팝업 조회', '결과 리스트 조회', '결과 업데이트' 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/project/bcprogressratecalculview/BCProgressRateCalculViewController.java|프로젝트의 진행률을 계산하고 해당 결과를 사용자에게 보여주는 웹 애플리케이션 컨트롤러임. 여러 메소드를 통해 진행률 정보를 요청받고, 해당 정보를 계산하여 돌려주는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/project/bcprogressratecalculview/DUProgressRateCalculView.java|HTTP 요청 데이터를 받아서 로그인 사용자가 해당 프로젝트에 접근 권한이 있는지 확인하고, 사용자의 프로젝트 진행률을 계산하는 기능을 수행함. 또한 서브 프로젝트 그룹의 사용 여부를 검사하고, 특정 날짜를 기준으로 이전, 현재, 다음 날짜의 진행율 정보를 제공함. 만약 사용자가 권한이 없을 경우 오류 메시지를 반환함. 이 클래스의 모든 메서드는 단일 스레드 환경에서 수행되며, 동시성 문제를 일으킬 수 있음.|
|com/skcc/pms/bizcomponent/project/bcprogressratecalculview/PUProgressRateCalculView.java|프로젝트 진행률을 계산하고, 계산된 데이터를 보여주는 뷰에 관련된 리스트를 얻거나, 요청 정보를 가진 데이터 세트를 통해 리스트를 처리하고, 인증 오류가 발생하면 실패 메시지를 설정, 그 외의 경우에는 성공 메시지를 설정하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcdevelopmentprogress/DUDevelopmentProgress.java|프로젝트의 개발 진척 단계에 관한 정보를 조회하고 관리하는 기능을 제공한다. 주요 기능으로는 개발 프로그램의 진척 추이를 조회하는 함수, 특정 프로젝트의 주차별 또는 월별 진척 상태를 조회하는 함수, 특정 작업의 이름 목록을 조회하는 함수 등이 있다.|
|com/skcc/pms/bizcomponent/project/bcdevelopmentprogress/BCDevelopmentProgressController.java|프로젝트의 개발 진행 상황을 조회하는 웹 컨트롤러 기능을 담당하며, 세 가지 메소드를 통해 개발 진행 목록, 진행 칼럼 목록, 작업 이름 목록을 각각 조회할 수 있음.|
|com/skcc/pms/bizcomponent/project/bcdevelopmentprogress/PUDevelopmentProgress.java|주어진 요청 정보를 바탕으로 개발 진행 상황에 대한 정보를 조회하고 처리 결과를 반환하는 기능 수행함.|
|com/skcc/pms/bizcomponent/project/bcdesignprogress/PUDesignProgress.java|프로젝트의 개발 진행 상태에 대한 정보를 조회하고, 그 결과를 보여주는 기능을 가진 서비스임. 특정 컬럼 목록 조회(pmDevProgressColListInq), 전체 리스트 조회(pmDevProgressListInq), 작업명 리스트 조회(pmDevProgressWorkNameListInq) 등의 메소드를 제공함.|
|com/skcc/pms/bizcomponent/project/bcdesignprogress/DUDesignProgress.java|주어진 요청 정보에 따라 다양한 데이터 조회를 수행하여 그 결과를 반환하는 기능을 담당하는 데이터 관리 클래스임. 특정 시기별(월, 주, 일) 개발 프로그램 진척 추이 값을 조회하고, 그에 따른 컬럼 정보를 반환하거나, 그리드 데이터를 조회하는 등의 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/project/bcdesignprogress/BCDesignProgressController.java|웹 요청을 처리하는 컨트롤러로, PM Dev 진행 상황 리스트, PM Dev 진행 열 리스트, 그리고 PM Dev 진행 작업 이름 리스트를 조회하는 기능 갖춤.|
|com/skcc/pms/bizcomponent/project/bcplanbudgetstatmanager/PUPlanBudgetStatManager.java|프로젝트의 예산 관련 데이터를 관리하며, 데이터를 조회, 저장하고 상태 정보를 업데이트하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/project/bcplanbudgetstatmanager/BCPlanBudgetStatManagerController.java|프로젝트의 예산 계획 및 통계에 관련된 여러 종류의 요청을 처리하는 웹 컨트롤러 기능 제공함. 구체적으로 예산 계획 트리 조회, 예산 통계 목록 조회, 년도별 예산 통계 조회, 예산 저장 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcplanbudgetstatmanager/DUPlanBudgetStatManager.java|입력된 코드는 Java로 작성되었으며, 'DUPlanBudgetStatManager'라는 클래스를 이용하여 프로젝트의 예산 및 통계정보를 관리하고 manipulating 하는 기능을 가진 비즈니스 로직임. 'dmPlanBudgetStatManager'라는 메소드는 특정 단위에 맞는 금액을 단위로 변환 후, 변환된 값을 반환함. 'dmPlanBudgetTreeInq'라는 메소드는 특정 프로젝트의 상태 정보와 데이터를 DB에서 조회해 반환함. 'dmPlanBudgetStatYearInq'는 년도별 예산 통계 정보를 가져오는 역할을 하며, 'dmPlanBudgetIdrtSave' 메소드는 코스트와 관련된 정보를 갱신하거나, 새로운 정보를 생성하여 DB에 저장하는 기능을 수행함. 마지막으로 'getXmlDocument' 메소드는 XML 형식의 스트링 정보를 DOM Document 객체로 변환하는 과정을 수행함.|
|com/skcc/pms/bizcomponent/project/bcapprovalprocess/BCApprovalProcessController.java|프로젝트의 승인 과정을 다루는 여러 기능들을 제공하는 컨트롤러임. 특정 항목들의 승인, 복원, 조회, 수정 등 다양한 작업에 대한 요청을 처리할 수 있음.|
|com/skcc/pms/bizcomponent/project/bcapprovalprocess/PUApprovalProcess.java|프로젝트의 각 단계(기획, 개발, 테스트 등)체계의 심사 및 관리를 지원하는 비지니스 로직 처리 기능 제공. 이는 특정 프로젝트의 기획 상세 조회, 기획 승인, 기획 복구, 기획 수행 리스트 조회, 기획 프로그램 승인 등을 실행할 수 있음. 이 외에도 프로젝트 수정, 개발, 테스트, 프로그램등록 등의 승인 및 복구 기능도 제공함.|
|com/skcc/pms/bizcomponent/project/bcinterfacedevperformancemanager/BCInterfaceDevPerformancemanagerController.java|웹 요청을 처리하고 서비스에서 받은 데이터를 반환하는 기능을 가진 컨트롤러임. pmSubProjectUserInq, pmDevelopmentPerformanceListInq, pmDevelopmentPerformanceCountInq 메소드를 통해 각각 하위 프로젝트 유저 조회, 개발 성능 리스트 조회, 개발 성능 카운트 조회를 수행하도록 구현되어 있음.|
|com/skcc/pms/bizcomponent/project/bcinterfacedevperformancemanager/PUInterfaceDevPerformancemanager.java|프로젝트의 개발 성능에 대한 정보를 요청하면, 전체 프로그램 정량적 관리 정보, 개발 프로그램 정량적 관리 정보의 개수, 하위 프로젝트 사용자 정보를 조회하고 결과를 반환하는 서비스를 수행함. 이 과정에서 발생하는 예외는 모두 처리하고, 예외 발생 시 로그를 기록함.|
|com/skcc/pms/bizcomponent/project/bcinterfacedevperformancemanager/DUInterfaceDevPerformancemanager.java|해당 코드는 프로젝트의 개발 성과 관리를 위해 사용하는 기능으로, 개발 성과목록 조회, 개발 성과 카운트 조회, 서브 프로젝트 사용자 조회 등의 기능을 포함하고 있다. 각 기능은 입력된 데이터를 바탕으로 DB 데이터를 조회하고, 그 결과를 반환하는 로직을 포함하고 있다.|
|com/skcc/pms/bizcomponent/project/bcrequestperformancemanager/PURequestPerformancemanager.java|요청에 따른 성능 카운트 조회, 성능 목록 조회, 그리고 하위 프로젝트 사용자 조회를 수행하는 기능을 제공하며, 이 과정에서 발생하는 예외를 핸들링함.|
|com/skcc/pms/bizcomponent/project/bcrequestperformancemanager/DURequestPerformancemanager.java|주어진 요청에 맞춰 데이터를 조회하고 반환하는 여러 메서드들을 포함한 클래스임. 이 클래스는 사용자의 인증 정보를 활용하여 특정 조건에 따라 프로젝트 성능 요청을 관리하고 조회하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/project/bcrequestperformancemanager/BCRequestPerformancemanagerController.java|서브 프로젝트의 유저 조회, 요청 성능 리스트 조회, 요청 성능 수 조회 등의 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcwidjetmanagerretrieve/PUWidjetManagerRetrieve.java|위젯 관리를 위한 여러 메소드를 포함한 자바 서비스 클래스임. 위젯 목록 조회, 동작 확인, 삭제, 업데이트, 삽입, 선택 등의 기능을 수행하며, 비즈니스 예외를 처리하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcwidjetmanagerretrieve/DUWidjetManagerRetrieve.java|XML 형식의 데이터를 이용해서 데이터베이스 조회, 입력, 수정, 삭제 작업을 수행하고, 해당 작업의 결과를 리턴하는 기능을 가진 클래스임.|
|com/skcc/pms/bizcomponent/project/bcresourceresultmanager/BCResourceResultManagerController.java|프로젝트 리소스 결과 관련 데이터를 조회, 추가, 업데이트, 삭제하며, 엑셀 파일로 업로드 및 다운로드를 도와주는 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcresourceresultmanager/DUResourceResultManager.java|사용자의 입력 (작업명, 작업일, 작업시간 등)을 기반으로 데이터를 저장, 갱신, 삭제하고, 이를 다시 검색하여 결과를 반환하며, 엑셀 파일로 결과를 다운로드하거나 업로드하는 기능을 수행하는 코드임.|
|com/skcc/pms/bizcomponent/project/bcresourceresultmanager/PUResourceResultManager.java|사용자의 요청 정보에 따라 작업 관련 결과를 조회, 추가, 업데이트, 삭제를 수행하고, 휴일을 확인하는 등의 작업자 자원 결과를 관리하는 기능을 수행함. 또한, 엑셀 파일을 업로드하여 데이터를 추가하거나, 작업 결과를 엑셀 파일로 다운로드하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/project/bcrealbudgetstatmanager/PURealBudgetStatManager.java|실시간 예산 통계 정보를 조회하거나 저장하는 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/project/bcrealbudgetstatmanager/BCRealBudgetStatManagerController.java|실제 예산 통계 관리를 위한 웹 컨트롤러로, 예산 통계 데이터를 저장하고 조회하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/project/bcrealbudgetstatmanager/DURealBudgetStatManager.java|입력받은 'unit_cd' 값을 바탕으로 정해진 돈의 단위('moneyUnit')를 결정하고, 이를 이용해 데이터베이스에서 정보를 조회하거나 저장하는 기능을 가진 객체의 생성 및 관리를 담당함.|
|com/skcc/pms/bizcomponent/project/bcprdtratiomanager/PUPrdtRatioManager.java|프로젝트를 관리하는 여러 기능을 포함한 클래스로서, 프로젝트 정보 조회, 엑셀 데이터 업로드 및 다운로드, 프로젝트 연도 정보 조회, 제품 코드 조회 등의 기능이 있음.|
|com/skcc/pms/bizcomponent/project/bcprdtratiomanager/DUPrdtRatioManager.java|이 코드는 특정 프로젝트의 데이터 관리를 위한 기능들을 구현한 자바 코드임. 이 기능에는 데이터 조회, 추가, 업로드, 다운로드 등이 포함되어 있으며, 각각의 작업은 특정 데이터셋을 인자로 받아 처리하고, 처리 결과를 데이터셋 형태로 반환함.|
|com/skcc/pms/bizcomponent/project/bcprdtratiomanager/BCPrdtRatioManagerController.java|웹 프로젝트에서 상품 비율 관리와 관련된 다양한 HTTP 요청을 처리하며, 프로젝트 조회, 엑셀 파일 다운로드, 상품 코드 조회, 엑셀 업로드, 상품 비율 관리 조회 또는 추가, 프로젝트 연도 조회 등의 작업을 수행함.|
|com/skcc/pms/bizcomponent/project/bcprogressbasismanager/BCProgressBasisManagerController.java|프로젝트의 승인, 진행 기준 조회, 롤 확인, 프로젝트 기본 사항 추가, 링크 코드 조회, 업데이트 등 다양한 웹 요청을 처리하는 컨트롤러 역할을 함.|
|com/skcc/pms/bizcomponent/project/bcprogressbasismanager/DUProgressBasisManager.java|데이터베이스와 연동하여 서로 다른 진행 방식에 대한 정보를 관리, 쿼리하고, 업데이트하는 기능을 제공하는 업무 컴포넌트임. 프로젝트 진행 기본 설정, 승인자 설정, 역할 설정 등의 관리를 수행함.|
|com/skcc/pms/bizcomponent/project/bcprogressbasismanager/PUProgressBasisManager.java|프로젝트의 진행 상황을 관리하는 클래스로, 프로젝트의 리스트 조회, 링크 코드 처리, 추가, 업데이트, 그룹 추가, 조회 등의 기능들을 제공하는 비즈다.|
|com/skcc/pms/bizcomponent/project/bcprogressratecalcul/DUProgressRateCalcul.java|서브프로젝트의 진척률을 계산하며, 각각의 task 별로 계획진척률과 실적진척률을 계산하여 데이터베이스에 업데이트하는 기능을 가지고 있다. 또한, 프로젝트의 예외일을 설정하고, 모든 서브프로젝트에 대해 최종 계획진척률과 달성률을 계산하여 제공한다.|
|com/skcc/pms/bizcomponent/project/bcprogressratecalcul/PUProgressRateCalcul.java|프로젝트의 진행률을 계산하고, 이를 통해 프로젝트의 관리 및 진행 상황을 체크할 수 있는 기능을 가진 클래스임. 이 클래스는 프로젝트의 진척율 리스트를 조회하거나, 특정 프로젝트의 진척율을 계산하거나, 모든 프로젝트의 진척율을 계산하거나, 지정된 날짜에 대한 진척율을 계산하는 메소드를 가지고 있음.|
|com/skcc/pms/bizcomponent/project/bcprogressratecalcul/BCProgressRateCalculController.java|프로젝트의 진척률을 계산하고 조회하는 기능을 제공하는 컨트롤러임. 특정 프로젝트의 진척률을 계산하거나, 모든 프로젝트의 진척률을 계산하고, 진척율 목록을 조회하거나, 지정된 날짜에 대한 진척률을 계산할 수 있음.|
|com/skcc/pms/bizcomponent/project/bcresourceassigncommon/DUResourceAssign.java|자원 배정과 관련하여 이용자의 동작을 데이터베이스에 저장하고 관리하는 기능을 수행함. 주요 기능은 자원에 대한 운용계획 추가, 자원 배정 관리, 자원 실적에 사용자 추가, 프로젝트 시작일과 서브 프로젝트 시작일 정보 조회, 전체 일한 시간 계산 등임.|
|com/skcc/pms/bizcomponent/project/bcplanbudgetstatcalcucommon/DUPlanBudgetStatCalcu.java|해당 코드는 특정 시점의 프로젝트 예산 통계를 계산하고, 계산된 결과를 'tb_evms_plan_stat'라는 이름의 테이블에 저장하는 기능을 수행한다. 또한, 예산 통계의 계산은 각 단위 작업의 비용을 직접 계산하거나 간접적으로 계산하는데 비용 계산 유형에는 재료비, 인건비, 경비 등이 포함되어 있다.|
|com/skcc/pms/bizcomponent/project/bcplanbudgetstatcalcucommon/PUPlanBudgetStatCalcu.java|프로젝트의 예산 계획에 대한 통계를 계산하는 기능을 수행함. 입력된 요청 데이터를 이용해 계산을 진행하고, 이 과정에서 발생할 수 있는 예외 상황을 처리할 수 있도록 예외 처리 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcplanbudgetstatcalcucommon/BCPlanBudgetStatCalcuController.java|프로젝트의 예산 계획과 통계 계산을 관리하는 컨트롤러로, POST 요청을 통해 'pmPlanBudgetStatCalcu'라는 서비스를 수행하며 이에 대한 결과를 반환하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/project/bctaskplanagile/PUTaskPlanAgile.java|Spring Framework를 사용하여 프로젝트의 서브 프로젝트 정보 조회, 작업 계획 업로드, 엑셀 업로드 및 다운로드, 사용자 정보 조회 등의 기능을 제공하는 비즈니스 컴포넌트 클래스임.|
|com/skcc/pms/bizcomponent/project/bctaskplanagile/BCTaskPlanAgileController.java|여러 가지 프로젝트 관련 정보 조회, 엑셀 파일 다운로드 및 업로드, MPP 업로드, 프로젝트 계획 업데이트 등의 기능을 처리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcprojectlist/PUProjectList.java|spring framework에서 사용하는 서비스 클래스로서, NCI 프로젝트 목록을 가져오는 기능을 담당하고 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectlist/DUProjectList.java|사용자의 요청에 따라 다양한 조건으로 NCI 프로젝트를 검색하고 그 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcprojectlist/BCProjectListController.java|서비스에서 가져온 NCI 프로젝트 리스트를 응답으로 반환하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcresourceplanmanager/PUResourcePlanManager.java|프로젝트의 구성원 명단, 일정, 리소스 계획, 업무 분배 등을 조회, 업데이트 하거나, 이들 데이터를 엑셀 파일로 업로드/다운로드 하는 등의 기능을 수행하는 여러 메서드를 포함하고 있는 클래스임.|
|com/skcc/pms/bizcomponent/project/bcresourceplanmanager/DUResourcePlanManager.java|이 코드는 프로젝트에 대한 자원 계획을 관리하는 기능을 수행하며, 데이터를 조회, 업데이트, 엑셀 파일 업로드 등 다양한 작업을 수행할 수 있음. 자원 계획 생성, 자원 정보 검색, 프로젝트 기간 조회, 월별 근무시간 조회, 일별 근무시간 업데이트 등의 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/project/bcresourceplanmanager/BCResourcePlanManagerController.java|프로젝트 리소스 관련 정보 조회, 엑셀 파일 다운로드 및 업로드, 프로젝트 기간, 리소스 계획 업데이트와 조회 등의 다양한 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcresourceretrieve/BCResourceRetrieveController.java|프로젝트 리소스 조회를 위한 웹 요청을 처리하고, 서비스 메서드를 호출하여 프로젝트 기간 조회, 리소스 리스트 조회, 리소스 결과 컬럼 리스트 조회, 하위 프로젝트 기간 조회 및 프로젝트 휴일 체크 기능 제공함.|
|com/skcc/pms/bizcomponent/project/bcresourceretrieve/DUResourceRetrieve.java|사용자의 요청 정보를 바탕으로 데이터를 조회하고, 결과를 반환하는 여러가지 함수들을 포함한 자바 클래스임. 주요 기능으로는 월별 또는 일별 리소스 조회, 서브 프로젝트 기간 조회, 프로젝트 휴일 확인 등이 있음.|
|com/skcc/pms/bizcomponent/project/bcresourceretrieve/PUResourceRetrieve.java|데이터 요청을 받고 처리 결과를 반환하는 여러 메소드를 포함한 클래스임. 이 클래스는 '자원 결과 컬럼 리스트 조회', '자원 검색 리스트 조회', '프로젝트 기간 조회', '하위 프로젝트 기간 조회', 그리고 '프로젝트 휴일 체크' 기능을 수행함. 처리 중 예외가 발생하면 비즈니스 예외를 발생시키며, 처리가 성공하면 상태 메시지와 함께 결과 데이터셋을 반환함.|
|com/skcc/pms/bizcomponent/project/bcdevprogressretrieve2woori/PUdevprogressretrieve2woori.java|개발 진행 상태를 조회하며, 각각의 메소드는 특정 조건에 따라 데이터셋을 반환하고, 요청받은 정보를 기반으로 검색 작업 수행 결과를 데이터셋에 담아 리턴함.|
|com/skcc/pms/bizcomponent/project/bcdevprogressretrieve2woori/PUdevprogressretrieve2wooriController.java|웹 요청을 처리하여 프로젝트 개발 진행 상황 정보를 반환하는 컨트롤러 클래스임. 여기에는 기본 정보 조회, 목록 조회, 작업 이름 목록 조회 등의 메소드가 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcdevprogressretrieve2woori/DUdevprogressretrieve2woori.java|해당 코드는 사용자로부터 요청받은 정보에 기반하여 데이터베이스의 특정 데이터를 조회하고 처리하는 기능을 수행함. 대표적으로 개발 진척도를 주별, 월별, 일별로 조회하고, 진척 상태에 따른 작업이름을 조회하는 기능이 포함되어 있음. 내부에 있는 여러 메소드들은 각각 다른 조건과 방식으로 데이터베이스를 조회하며, 조회된 결과를 기반으로 처리된 데이터를 반환함. 또한 해당 컴포넌트는 조회된 데이터의 값에 따라 특정한 규칙으로 데이터를 합산하거나 변경하는 역할도 수행함.|
|com/skcc/pms/bizcomponent/project/bcprojectexpoert/FTPRecvMonitor.java|FTP에서 받은 로그 데이터를 DB에 저장하고, 이에 대한 에러 핸들링, 시작/종료 정보 등을 로깅하는 작업을 수행함. 또한, CSV 작업 시작/종료, Real Table 반영 시작/종료 및 I/F Mapping 시작/종료 등의 세부 작업 로깅도 지원함.|
|com/skcc/pms/bizcomponent/project/bcprojectexpoert/BCProjectExpoertController.java|프로젝트의 정보를 조회하고, 프로젝트 정보를 엑셀 파일로 내보내는 기능, 엑셀 파일의 프로젝트 정보를 가져와 데이터로 추가하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcprojectexpoert/ExportService.java|FTP를 이용하여 서버에서 송수신한 프로젝트 정보 및 첨부 파일을 다루는 여러 기능을 가진 서비스 클래스임. 프로젝트 정보를 조회, 수출, 수입하는 기능과 첨부파일을 다운로드하는 기능, 배치 작업을 수행하는 기능이 포함되어 있음. 또한 프로젝트 정보를 압축 및 압축 해제하고, 이를 이용하여 프로젝트를 등록 및 수정하는 작업을 수행하며, 이 과정에서 발생하는 에러를 로그에 남김.|
|com/skcc/pms/bizcomponent/project/bcdesigndevprogress/DUDesignDevProgress.java|데이터베이스에서 특정 정보를 조회하는 데 사용되는 여러 메소드들이 포함된 자바 클래스임. 특히 개발 프로그램의 진척 상황을 조회하고 이를 분석하는데 사용됨. 평가 기간(일별, 주별, 월별)에 따른 진척도, 특정 작업 이름의 목록 조회 등 여러 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/project/bcdesigndevprogress/BCDesignDevProgressController.java|프로젝트의 디자인과 개발 진행 상황을 조회하는 컨트롤러로, 전체 진행 상황, 칼럼별 상황, 작업명별 상황을 조회하는 기능 있음.|
|com/skcc/pms/bizcomponent/project/bcdesigndevprogress/PUDesignDevProgress.java|개발 진행 상황을 조회하고, 그 결과를 반환하는 서비스 로직을 포함하고 있는 클래스임. 특히 요청 정보에 따라 개발 진행 상황의 리스트, 작업 이름 리스트, 그리고 콜럼 리스트를 조회하는 기능이 제공됨.|
|com/skcc/pms/bizcomponent/project/bcprojectservice/DUProjectService.java|다른 외부 데이터를 사용하여 게시판 데이터를 관리하고, 사용자의 요청에 따른 데이터를 다양한 방법으로 검색하여 가져오는 역할을 함. 게시판 데이터를 생성, 수정, 삭제, 또는 인터넷에서 다운로드하여 데이터베이스에 업로드하는 데 필요한 메소드를 가지고 있음. 외부 데이터 파일에 대한 정보를 저장하거나 파일을 업로드하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectservice/PUProjectService.java|프로젝트 데이터를 처리하는 비즈니스 로직을 담당하는 서비스 클래스로, 데이터셋을 이용해 생성, 수정 등의 작업을 수행하고 결과를 반환함. 엑셀 업로드 관련한 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectservice/BCProjectServiceController.java|프로젝트 서비스를 제공하는 REST API를 정의하며, 각각 서비스 호출 및 업데이트, 엑셀 업로드와 다운로드 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcprojectmanagerdetail/BCProjectManagerDetailController.java|프로젝트 관리 상세 페이지에서의 여러 기능을 제공하는 컨트롤러로, 그 기능들로는 프로젝트 관련 정보 조회, 엑셀 다운로드, 유사 프로젝트 생성, 체크 리스트 복사, 프로젝트 삭제, 업데이트 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectmanagerdetail/DUProjectManagerDetail.java|해당 코드는 PM 일정, 본부QA 일정, 전사QM 일정, 본부KIP 일정, EWS 등 다양한 프로젝트 관리 작업에 대한 데이터베이스 처리를 포함하고 있음. 프로젝트의 추가, 조회, 삭제, 업데이트 등에 대한 기능을 제공하며, 비용 관리, 주요일정 설정, 주관 조직 코드 조회 등 다양한 부가 기능 제공함. 엑셀 파일의 읽기 및 쓰기, 프로젝트 파일 업로드/다운로드 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectmanagerdetail/PUProjectManagerDetail.java|프로젝트 정보를 조회, 이력관리, 수정, 삭제, 엑셀 파일 다운로드 및 업로드 등 다양한 프로젝트 관리 기능을 수행하는 클래스임.|
|com/skcc/pms/bizcomponent/project/bcdesigninterfaceprogress/BCDesignInterfaceProgressController.java|개발 진행 상황에 대한 목록, 거래 항목 목록, 작업 이름 목록을 조회하는 기능을 가진 웹 서버 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcdesigninterfaceprogress/PUDesignInterfaceProgress.java|사용자로부터 데이터를 받아 처리한 후 응답을 보내는 웹 서비스 기능을 구현하고 있음. 이 서비스는 개발 진행 상황에 대한 조회, 작업명 조회 등의 기능을 가지고 있으며, 에러 발생 시 로그를 남기고 예외를 발생시키도록 처리하였음.|
|com/skcc/pms/bizcomponent/project/bcdesigninterfaceprogress/DUDesignInterfaceProgress.java|개발 프로그램의 진척 상태를 조회하고, 해당 정보를 바탕으로 시간 단위(일, 주, 월)로 진척 추이를 계산하고, 결과를 반환하는 기능을 수행함. 또한, 각 프로그램의 이름을 조회하고, 모든 프로그램 진척 상태의 합계를 계산하는 기능도 포함하고 있음.|
|com/skcc/pms/bizcomponent/project/bcinterfacedevprogress/BCInterfaceDevProgressController.java|서버 측에서 프로젝트의 개발 진행 상태 정보를 조회하는 역할을 하는 컨트롤러로 'pmDevProgressListInq', 'pmDevProgressColListInq', 'pmDevProgressWorkNameListInq' 세 가지 방법을 제공함.|
|com/skcc/pms/bizcomponent/project/bcinterfacedevprogress/DUInterfaceDevProgress.java|해당 코드는 SKCC 프로젝트의 개발 진척도를 조회하는 기능을 가진 클래스로, 주단위, 일단위, 월단위로 데이터를 검색하고, 특정 작업의 이름을 조회할 수 있음. 이 외에도 프로젝트 시작일과 종료일을 기반으로 월별 순서를 계산하는 기능도 있음.|
|com/skcc/pms/bizcomponent/project/bcinterfacedevprogress/PUInterfaceDevProgress.java|개발 진행 상황에 대한 정보를 요청하고 응답하는 기능을 수행함. 이 기능은 컬럼 목록 조회, 진행 목록 조회, 작업 이름 목록 조회를 포함함. |
|com/skcc/pms/bizcomponent/project/bcresourcemanager/BCResourceManagerController.java|프로젝트 리소스 관리 관련 기능을 처리하는 컨트롤러로, 리소스 결과를 초기화하거나, 작업을 조회하거나, 리소스를 다중으로 등록하거나 조회하며, 엑셀을 이용해 여러 리소스 결과를 업로드하는 기능이 있음.|
|com/skcc/pms/bizcomponent/project/bcresourcemanager/DUResourceManager.java|이 코드는 여러 기능을 담고 있는데, 주요 기능으로는 request 정보를 받아 데이터셋을 처리하고 반환하는 것이다. 이 기능들은 사내 프로젝트에서 리소스 관리 분야에서 필요한 것으로 보인다. 특정 사용자의 요청 정보를 받아 데이터셋 객체를 생성하고, 이를 통해 데이터베이스에서 데이터를 조회하거나, 엑셀 데이터를 업로드 하는 기능, 리소스를 재설정하는 기능 등을 포함하고 있다. 이러한 처리 결과는 모두 데이터셋 객체로 반환된다.|
|com/skcc/pms/bizcomponent/project/bcresourcemanager/PUResourceManager.java|프로젝트 관련 정보를 처리하는 기능들을 포함하며, 특정 프로젝트의 여러 리소스에 대한 정보 조회, 태스크 조회, 리소스 추가, 엑셀 파일을 통한 다중 업로드, 리소스 정보 초기화 등의 처리과정을 지원하는 코드임.|
|com/skcc/pms/bizcomponent/project/bcresourcewbs/PUResourceWBS.java|사용자의 요청 정보를 바탕으로 다양한 종류의 요청을 처리하는 기능이 포함된 서비스 클래스임. 이 클래스는 견적 작업 분류(WBS) 리스트 조회, 회원 코드 조회, WBS 업데이트, 코멘트 리스트 조회, 실적 초기화, 역사적인 변경사항 조회 등의 기능을 제공함. 각 메소드는 주어진 요청 정보를 처리하고 처리 결과를 DataSet 객체 형태로 반환함.|
|com/skcc/pms/bizcomponent/project/bcresourcewbs/DUResourceWBS.java|해당 코드는 실적 관리 작업, 자원 관리 및 백업 작업에 대한 서버 사이드 로직을 처리하는 역할을 수행함. 이에는 쿼리를 이용한 데이터 조회 및 업데이트, 엑셀 파일과 ZIP 파일을 이용한 데이터 처리, 제출된 작업에 대한 상태 정보 업데이트, 실적 진척률에 따른 상태 변경 등 다양한 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcresourcewbs/BCResourceWBSController.java|프로젝트의 각종 정보를 다루기 위한 컨트롤러로, 프로젝트에 대한 업데이트, 조회, 삭제, 사용자 코드 조회, 엑셀 파일 다운로드, 권한 확인 등의 기능을 지원함.|
|com/skcc/pms/bizcomponent/project/bcdesignprogramperformancemanager/DUDesignProgramPerformanceManager.java|서브 프로젝트의 개발 성과를 조회하고, 각 일자별, 주차별, 월별 성과를 집계하는 기능을 수행함. 쿼리를 통해 계획본수, 완료본수, 잔여본수, 계획생산성, 실적생산성, 필요생산성 등을 조회하며, 해당 정보를 레코드셋으로 반환함. 또한, 프로젝트 담당자 조회 기능도 수행함.|
|com/skcc/pms/bizcomponent/project/bcdesignprogramperformancemanager/PUDesignProgramPerformanceManager.java|프로그램의 성능 관리를 위한 기능을 담당하며, 데이터 집합 객체를 요청하여 개발 성능 목록을 조회하고 전체 개발 프로그램의 성능 관리 개수를 확인하는 업무 처리를 수행함. 또한, 하위 프로젝트 사용자 정보를 조회하는 기능을 포함함.|
|com/skcc/pms/bizcomponent/project/bcdesignprogramperformancemanager/BCDesignProgramPerformanceManagerController.java|웹 요청을 처리하여 서브 프로젝트의 사용자 조회, 개발 성능 리스트 조회, 개발 성능 카운트 조회 기능을 수행해주는 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bccodeinspectionmanager/BCCodeInspectionManagerController.java|코드 검사 관리를 담당하는 서비스의 컨트롤러로, 코드 삭제, 파일 타입 선택, 코드 검사 목록 조회, 코드 검사 정보 삽입, 전체 엑셀 다운로드, 엑셀 업로드 등의 기능 제공함.|
|com/skcc/pms/bizcomponent/project/bccodeinspectionmanager/PUCodeInspectionManager.java|코드 검사 관리자 클래스로서, 파일 작성자 선택, 파일 타입 선택, 코드 검사 리스트 조회, 코드 검사 내용 삽입, 코드 삭제, 모든 결과를 엑셀로 다운로드, 코드 검사 결과를 엑셀로 업로드 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bccodeinspectionmanager/DUCodeInspectionManager.java|파일 저자를 선택하고, 파일 타입을 선택하며, 코드 검사 리스트를 가져오고, 코드 검사를 삽입하고, 코드를 삭제하고, 코드의 엑셀 다운로드를 지원하며, 코드 검사의 엑셀 업로드를 지원하는 기능이 포함된 데이터 관리를 위한 자바 패키지임.|
|com/skcc/pms/bizcomponent/project/bcdesigndevperformancemanager/BCDesignDevPerformancemanagerController.java|설계 및 개발 성과를 관리하는 웹 컨트롤러로, 서브 프로젝트 사용자 조회, 개발 성과 리스트 조회, 개발 성과 개수 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcdesigndevperformancemanager/PUDesignDevPerformancemanager.java|프로젝트의 성능 관리를 위해 개발 성능 목록 조회, 개발 성능 개수 조회, 하위 프로젝트 사용자 조회 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/project/bcdesigndevperformancemanager/DUDesignDevPerformancemanager.java|이 코드는 프로젝트의 개발 성능을 관리하는 로직을 구현하고 있다. 일정 기간 동안의 프로젝트 계획, 완료, 잔여 본수 등을 디비에서 불러와 정보를 처리하고, 권한에 따라서 프로젝트 담당자를 조회하는 기능도 포함되어 있다.|
|com/skcc/pms/bizcomponent/project/bcdevprogressretrievewoori/DUDevProgressRetrieveWoori.java|개발 프로그램의 진척 추이를 조회하는 기능, 진척률에 관한 컬럼 정보, 작업 이름 등을 데이터베이스에서 조회하고, 조회된 정보를 조작하여 원하는 결과값을 반환함.|
|com/skcc/pms/bizcomponent/project/bcdevprogressretrievewoori/PUDevProgressRetrieveWoori.java|해당 코드는 요청받은 데이터를 토대로 개발 진행 상황을 조회하고, 리턴하는 기능을 수행하는 비즈니스 컴포넌트임. 이 때, 개발 진행 컬럼 목록, 개발 진행 목록, 개발 진행 작업이름 목록을 각각 조회하도록 구현되어 있음. 이 과정에서 예외 상황 발생시 적절한 예외를 발생시키는 로직이 적용되어 있음.|
|com/skcc/pms/bizcomponent/project/bcdevprogressretrievewoori/PUDevProgressRetrieveWooriController.java|프로젝트의 개발 진행 상황을 조회하고 그 결과를 반환하는 컨트롤러임. 여기서는 개발 진행률 컬럼 목록 조회, 개발 진행률 목록 조회, 작업 이름 목록 조회 세 가지 기능을 제공함.|
|com/skcc/pms/bizcomponent/project/bcdesigninterfaceperformancemanager/DUDesignInterfacePerformanceManager.java|서브 프로젝트의 성과를 관리하고 사용자 정보를 조회하는 기능을 지원하는 클래스임. 이 클래스는 프로젝트의 성과(계획과 실적)를 달력 기준(일, 주, 월)으로 조회하고, 입력된 요청 정보에 따라 프로젝트의 성과를 개수로 산출함. 또한, 요청된 사용자 정보를 조회하는 기능을 지원함.|
|com/skcc/pms/bizcomponent/project/bcdesigninterfaceperformancemanager/BCDesignInterfacePerformanceManagerController.java|사용자의 요청(request)에 따른 서브 프로젝트 사용자 조회, 개발 성능 리스트 조회, 개발 성능 카운트 조회 기능을 제공하는 Spring 기반의 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcdesigninterfaceperformancemanager/PUDesignInterfacePerformanceManager.java|서브 프로젝트의 개발 성능 정보 조회, 개발 성능 정보의 개수 계산, 서브 프로젝트의 사용자 정보 조회 등을 수행하는 여러 메소드를 포함하는 서비스 클래스를 구현함.|
|com/skcc/pms/bizcomponent/project/bctaskplan/PUTaskPlan.java|프로젝트 계획과 일정을 관리하기 위한 여러 기능을 가진 서비스 컴포넌트로, 엑셀 업로드/다운로드, 업무 관련 정보 조회/수정, MPP 업로드 등의 기능이 존재함. 사용자 정보 조회와 특정 작업을 직접 추가하는 등의 추가 기능도 제공되고 있음.|
|com/skcc/pms/bizcomponent/project/bctaskplan/BCTaskPlanController.java|프로젝트의 관리작업(엑셀 다운로드, 업로드, 글로벌 인증 검색, 업데이트 등)을 수행할 수 있는 웹 서비스를 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcworkcodemanager/PUWorkCodeManager.java|프로젝트의 작업 코드를 관리하고, 조회, 수집, 추가, 제거 시 운영해 주는 클래스임. 이 클래스는 현재 작업 코드를 불러오거나 엑셀 파일로 업로드 또는 다운로드하고, 코드 리스트를 조회하고, 코드를 추가하거나 업데이트 하거나 삭제, 그리고 특정 코드 유형을 검색하는 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/project/bcworkcodemanager/BCWorkCodeManagerController.java|프로젝트의 작업 코드를 관리하는 컨트롤러로, 작업 코드의 조회, 추가, 수정, 삭제, 엑셀 업로드 및 다운로드를 처리하는 기능들이 구현되어 있음.|
|com/skcc/pms/bizcomponent/project/bcworkcodemanager/DUWorkCodeManager.java|주어진 데이터 세트를 다루는 다양한 함수들로 구성된 프로젝트 코드 관리 클래스임. 주요 기능으로는 코드 관리자 조회, 코드 추가, 코드 업로드, 코드 엑셀 업로드, 코드 엑셀 다운로드, 코드 수정, 코드 삭제 등이 있음.|
|com/skcc/pms/bizcomponent/project/bcagileinfomapping/BCAgileInfoMappingController.java|스프링 프레임워크를 이용해 웹 어플리케이션에 Agile 프로젝트 정보를 가져오고, 매핑하며, 동기화하는 일련의 기능을 수행함. 또한, API를 통해 Agile Sprint 정보를 설정하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/project/bcagileinfomapping/PUAgileInfoMapping.java|Agile 프로젝트 매핑 정보를 관리하며, 하위 프로젝트 매핑 정보 조회, 하위 프로젝트 매핑, Agile 동기화 기능 수행과 Agile 스프린트 정보 설정 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/project/bcagileinfomapping/DUAgileInfoMapping.java|애자일 프로젝트 정보를 관리하는 기능들을 제공하는데, 이 기능들에는 서브 프로젝트와 애자일 정보 매핑, 서브 프로젝트의 매핑 정보 가져오기, 애자일 데이터와 동기화하기 등이 포함되어 있음. 추가로 XML 문자열을 이용해 DOM문서를 생성하고, 애자일 스프린트 정보를 설정하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/project/bcgoalresultinput/DUGoalResultInput.java|이 코드는 프로젝트의 목표 성과정보 조회 및 업데이트를 담당하는 Java 클래스다. 'dmGoalResultInputListInq'메서드는 금액 단위 처리와 평가방법 변수, 마일스톤명 변수 등을 설정하고, DB에서 필요한 정보를 조회한다. 그 다음으로, 평가방법에 따른 데이터를 변경하고 확정하는 로직을 수행한다. 'dmGoalResultInputUpd' 메서드는 사용자가 수정한 프로젝트의 목표 성과정보를 DB에 반영한다. 또한, 평가방법이 'Milestone'이나 'Milestone with Complete'인 경우에는 별도의 DB 테이블에 데이터를 저장한다. 이 클래스는 Spring의 Repository로 등록되어 있어, 비즈니스 로직 수행에 필요한 데이터 접근을 담당한다.|
|com/skcc/pms/bizcomponent/project/bcgoalresultinput/PUGoalResultInput.java|해당 코드는 Spring 프레임워크를 사용하여 'pmGoalResultInputListInq'와 'pmGoalResultInputUpd' 두 가지의 서비스를 제공함. 'pmGoalResultInputListInq'는 요청 정보를 이용하여 데이터를 조회하고, 'pmGoalResultInputUpd'는 요청 정보를 이용하여 데이터를 수정하는 기능을 가지고 있음. 각 서비스는 성공적으로 처리될 시 결과 메시지를 반환하며, 예외 상황 발생 시 적절한 예외를 던짐.|
|com/skcc/pms/bizcomponent/project/bcgoalresultinput/BCGoalResultInputController.java|프로젝트 목표 결과를 업데이트하고 조회하는 웹 컨트롤러 기능을 가진 클래스임.|
|com/skcc/pms/bizcomponent/project/bcresourceassignmanager/DUResourceAssignManager.java|이 코드는 프로젝트의 자원 배정 관리를 하는 기능을 수행하며, 속한 사용자, 역할, 기술 등급 등의 정보를 입력, 조회, 삭제, 수정하고, 엑셀 파일로 업로드 및 다운로드하는 기능을 지원함. 각 사용자가 역할에 따라 제한된 권한을 가지고 있는 것을 확인하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcresourceassignmanager/PUResourceAssignManager.java|프로젝트의 자원 할당 관련하여 조회, 추가, 삭제, 엑셀 업로드 및 다운로드 등의 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/project/bcresourceassignmanager/BCResourceAssignManagerController.java|프로젝트의 리소스 할당 관리를 위해, 리소스 추가, 부프로젝트 조회, 결과 추가, 엑셀 업로드/다운로드, 리소스 전체 업로드, 리소스 조회 및 삭제, 리소스 목록 조회 등 다양한 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcdesignperformancemanager/DUDesignPerformanceManager.java|서브 프로젝트의 성과를 관리하고, 프로젝트의 월, 주, 일에 따른 성과를 계산하며, 개발 프로그램의 정량적 관리를 위한 카운트를 제공하고, 사용자 인증 유틸리티를 통해 프로젝트 그룹 코드를 검색하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcdesignperformancemanager/PUDesignPerformanceManager.java|프로젝트 성과 관리에 필요한 데이터를 조회하는 세 가지 메소드(pmDevelopmentPerformanceListInq, pmDevelopmentPerformanceCountInq, pmSubProjectUserInq)를 가진 클래스임. 각 메소드는 개발 프로그램의 전체 성과, 개수, 서브 프로젝트 사용자 정보를 조회함.|
|com/skcc/pms/bizcomponent/project/bcdesignperformancemanager/BCDesignPerformanceManagerController.java|프로젝트의 디자인 성능 관리를 담당하고, 웹 요청을 통해 부프로젝트 사용자 조회, 개발 성능 리스트 조회, 개발 성능 갯수 조회를 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcrewardratioretrieve/PURewardRatioretrieve.java|프로젝트 보상 비율 관리에 대한 여러 기능들을 제공하는 비즈니스 서비스로, 보상 비율 추가, 조회, 프로젝트 연도 및 코드 조회, 엑셀 파일 업로드 및 다운로드 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcrewardratioretrieve/DURewardRatioretrieve.java|데이터베이스에서 프로젝트 보상비율 정보를 조회하고, 엑셀 파일을 업로드 및 다운로드하는 기능을 수행함. 해당 정보를 데이터베이스에 삽입, 삭제, 조회하는 등의 작업을 처리함.|
|com/skcc/pms/bizcomponent/project/bcrewardratioretrieve/BCRewardRatioretrieveController.java|프로젝트 보상 비율 조회를 위한 컨트롤러로, 프로젝트 연도, 프로젝트 자체, 보상 비율 관리 추가, 보상 코드 조회, 엑셀 업로드 및 다운로드 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/project/bcdevelopmentperformancemanager/PUDevelopmentPerformancemanager.java|개발 성과 관리를 위한 기능들을 제공하며, 프로그램 정량적 관리, 개발 프로그램 정량적 관리 카운트, 소 프로젝트 사용자 조회 등의 메소드를 포함하고 있음.|
|com/skcc/pms/bizcomponent/project/bcdevelopmentperformancemanager/BCDevelopmentPerformancemanagerController.java|서브 프로젝트 사용자 조회, 개발 성능 목록 조회, 개발 성능 카운트 조회 기능을 서버에서 클라이언트로 연결해주는 프로젝트 개발 성과 관리 컨트롤러임.|
|com/skcc/pms/bizcomponent/project/bcdevelopmentperformancemanager/DUDevelopmentPerformancemanager.java|여러 성능 지표(계획본수, 완료본수, 잔여본수 등)를 바탕으로 프로젝트의 개발 성과를 관리하고 분석하기 위한 데이터를 조회하고 처리하는 기능을 제공함. 해당 기능은 검색 조건(기간, 담당자 등)에 따라 세부적인 정보를 제공하며, 사용자의 권한에 따라 접근 가능한 사용자 목록을 제공하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcresourcenewresultmanager/BCResourceNewResultManagerController.java|프로젝트 자원 관리를 위한 서비스로, 리소스 정보 조회, 프로젝트 기간 조회, 조회 된 자원 정보 엑셀 파일 다운로드,자원 결과 리스트 조회 및 업데이트, 엑셀 업로드, 자원 할당 서브 프로젝트 리스트 조회 등의 기능 제공함.|
|com/skcc/pms/bizcomponent/project/bcresourcenewresultmanager/PUResourceNewResultManager.java|각각의 메서드가 프로젝트 자원에 대한 새로운 결과를 조회, 업데이트, 엑셀 업로드, 다운로드 등을 수행하는 자바 클래스임.|
|com/skcc/pms/bizcomponent/project/bcresourcenewresultmanager/DUResourceNewResultManager.java|해당 코드는 한 프로젝트에 배정된 자원에 대한 시간과 스케줄을 관리하는 역할을 하며, 이를 다루기 위한 데이터베이스 조회, 수정, 업로드 등의 작업을 수행한다. 엑셀 파일로 시간과 스케줄 정보를 받아올 수 있고, 이를 수정하거나 초기화하는 기능도 제공한다. 추가로, 특정 자원의 근무일자를 조회하거나 근무 시간을 업데이트하는 기능도 있다.|
|com/skcc/pms/bizcomponent/project/bcmultiboardformmanager/PUMultiBoardFormManager.java|여러 게시판의 폼을 관리하는 서비스를 제공하며, 특히 게시판 폼 조회, 삭제, 파일 다운로드 기능을 제공함.|
|com/skcc/pms/bizcomponent/project/bcmultiboardformmanager/DUMultiBoardFormManager.java|프로젝트 관련 정보를 데이터베이스에서 조회, 삭제, 파일 다운로드를 가능하게 하는 기능을 가진 클래스임.|
|com/skcc/pms/bizcomponent/project/bcmultiboardformmanager/BCMultiBoardFormManagerController.java|다중 게시판 양식 관리를 위해, 사용자로부터 입력 받은 데이터를 바탕으로 파일 다운로드, 삭제, 조회 기능을 수행하는 기능 구현임.|
|com/skcc/pms/bizcomponent/project/bcprojectmanager/BCProjectManagerController.java|프로젝트 관리 범위에 대한 여러 HTTP 요청을 처리하고, 해당 요청에 맞는 서비스를 호출하여 결과를 반환하는 기능을 수행함. 요청 처리 기능으로는 프로젝트 번호와 이름 체크, 프로젝트의 가중치 합산, 엑셀 업로드, 프로젝트 리스트 조회, 프로젝트 추가, 업데이트, 삭제 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectmanager/PUSubProjectManager.java|프로젝트 관리 시스템의 서브 프로젝트를 관리하기 위한 기능들을 제공하는 JAVA 클래스임. 이 클래스 내에서는 서브 프로젝트 조회, 추가, 수정, 삭제, 정보 조회, 가중치 합계 조회 등의 메서드가 구현되어 있음. 또한, 파일로부터 데이터를 불러오는 메서드, 메소드명 검사, 마일스톤 조회, 상세 코드 조회 등의 유틸리티 메서드도 포함되어 있음.|
|com/skcc/pms/bizcomponent/project/bcprojectmanager/PUProjectManager.java|자바 프로그래밍 언어로 작성된 코드로, 프로젝트 관련 정보를 조회(Inquiry), 추가(Add), 수정(Update), 삭제(Delete), 체크(Check) 하는 등의 기능을 수행함. 또한, 서브프로젝트 관련 정보를 처리하며, 엑셀 파일을 읽어 프로젝트 정보를 업데이트하거나, 특정 프로젝트에 등록된 사용자에게 권한을 부여하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/project/bcprojectmanager/DUSubProjectManager.java|이 코드는 SK CC의 프로젝트 관리 시스템에 사용될 서브프로젝트 관리 로직을 처리함. 서브프로젝트의 조회, 등록, 수정, 삭제 기능을 수행하며, 방법론 및 작업 권한 등록, 산출물 생성 및 삭제, 필수 산출물 확인 등의 세부 처리 로직을 포함함. 또한, 방법론 결정, 마일스톤 조회, 서브프로젝트 PL 변경 등의 기능도 포함됨.|
|com/skcc/pms/bizcomponent/project/bcprojectmanager/BCSubProjectManagerController.java|서브 프로젝트 관리를 위해 세부 정보 조회, 프로젝트 정보 조회, 서브 프로젝트의 추가, 삭제, 업데이트, 가중치 합산, 방법론 업로드, 방법론 조회, 이름 체크 등의 기능을 제공하는 REST API를 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcalopexintegrateddash/BCAlopexIntegratedDashController.java|스프링 프레임워크를 사용하여 대시보드 관련 여러 API(데이터 조회, 설정, 삭제 및 위젯 조회 기능)를 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcalopexintegrateddash/DUAlopexIntegratedDash.java|데이터베이스에서 정보를 조회, 수정, 삭제하고 결과를 반환하는 기능을 담당함. 부가적으로, 특정 쿼리를 실행한 결과가 없을 경우, 새로운 데이터를 삽입하고 다시 해당 정보를 조회하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcalopexintegrateddash/PUAlopexIntegratedDash.java|Alopex 관련 데이터를 조회(Get), 수정(Set), 삭제(Delete), 위젯 조회(Widget Inquiry)하는 네 가지 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bcissuedefectstatus/PUIssueDefectStatus.java|대시보드에 사용되는 이슈 및 결함 상태 정보를 관리하며, 대시보드 그리드 리스트, 담당자 리스트 조회, 코드 조회 기능을 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcissuedefectstatus/BCIssueDefectStatusController.java|다음 세 가지 API 요청에 따라 각각 대시보드 그리드 리스트, 담당자 리스트 문의, 코드 문의 서비스를 제공하는 스프링 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcissuedefectstatus/DUIssueDefectStatus.java|데이터 대시보드의 그리드 조회, 담당자 조회, 그리고 코드 조회 등의 기능들을 담당하는 클래스임.|
|com/skcc/pms/bizcomponent/dashboard/bcissueprogressretrive/DUIssueProgressRetrive.java|해당 코드는 사용자로부터 받은 요청 정보를 통해 데이터를 조회하고, 처리 결과를 반환하는 역할을 함. 월, 주, 일에 따른 이슈 진행 상태를 확인할 수 있으며, 이슈의 진행된 컬럼 리스트를 반환하거나, 상세한 이슈 진행 목록을 조회하는 등의 기능을 지원함. 마지막으로, 이슈 진행에 대한 요약 정보를 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcissueprogressretrive/PUIssueProgressRetrive.java|이슈의 진행 상황을 조회하는 세가지 메소드를 포함한 서비스를 제공하고, 각 메소드가 요청된 데이터와 요청 정보를 입력받아 처리 결과를 반환하는 기능을 가짐.|
|com/skcc/pms/bizcomponent/dashboard/bcissueprogressretrive/BCIssueProgressRetriveController.java|사용자로부터 요청을 받아 이슈 진행 상황에 관한 정보를 조회하여 리턴하는 웹 컨트롤러 기능이 구현되어 있음. 이때, 이슈 전체 리스트 조회, 칼럼별 리스트 조회, 이슈 진행 요약 정보 조회 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisreportretrieve/PUAnalysisReportRetrieve.java|가져온 데이터를 분석하여 보고서를 생성하거나, 이력을 조회, 추가하고 계정 정보를 조회하는 등의 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisreportretrieve/BCAnalysisReportRetrieveController.java|대시보드에서 보고서에 대한 기록을 추가하고, 조회하는 등의 기능을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisreportretrieve/DUAnalysisReportRetrieve.java|분석 리포트를 조회하고, 년도와 월을 조회하며, 리포트 히스토리를 리스트 조회하고 추가하는 등 대시보드 관련 데이터를 관리하고 연산을 수행하는 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcactionitemprogressretrive/DUActionItemProgressRetrive.java|사용자의 요청 정보를 기반으로 DB에서 일정 상태의 데이터를 시간 단위(월, 주, 일)로 조회하고, 그 결과를 반환하는 기능을 제공하는 클래스임. 조회된 데이터는 새로운 일정과 종료된 일정의 누적 카운트를 처리한 후 반환됨.|
|com/skcc/pms/bizcomponent/dashboard/bcactionitemprogressretrive/BCActionItemProgressRetriveController.java|두 가지 웹 요청('pmActionItemProgressColListInq'와 'pmActionItemProgressListInq')을 처리하여 각각의 서비스 메서드를 호출하여 대시보드의 '액션 아이템 진행 상태'를 조회하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcactionitemprogressretrive/PUActionItemProgressRetrive.java|서브 프로젝트 번호와 기간을 입력받아 액션 아이템의 진행상황을 조회하고, 해당 결과를 DataSet 객체로 반환함. 검색 결과가 없을 경우에는 에러 메시지를 반환하고, 런타임 예외가 발생하면 예외 처리를 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcretrievedevprogramdawoori/PURetrieveDevProgramDevDaWoori.java|사용자의 프로젝트 번호에 따라 다른 정보를 가져와 처리 후 반환하는 기능을 가진 비즈니스 로직임.|
|com/skcc/pms/bizcomponent/dashboard/bcretrievedevprogramdawoori/DURetrieveDevProgramDevDaWoori.java|데이터베이스에서 특정 데이터를 추출하고, 요청 데이터에 따라 다양한 방식으로 데이터를 가공, 반환하는 클래스 구현체임.|
|com/skcc/pms/bizcomponent/dashboard/bcretrievedevprogramdawoori/BCRetrieveDevProgramDevDaWooriController.java|Spring Framework를 이용해 개발된 대우리 프로그램 데이터를 요청받아 리턴하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcrmtracestatus/PURmTraceStatus.java|요청받은 정보에 따라 다양한 서비스 기능을 실행하고, 그 결과를 반환하는 기능 수행함. 이는 상황에 따라 개인의 생산성 조회, 프로그램 상태 차트 생성, 충전기 조회, 프로그램 상태 그리드 조회, 스코프 관리자 승인 설정 조회 등 여러 가지 상황에 대응 가능함.|
|com/skcc/pms/bizcomponent/dashboard/bcrmtracestatus/DURmTraceStatus.java|데이터베이스에서 데이터를 조회하여 특정 형식으로 가공하는 기능을 수행하는 레포지토리 클래스임. 다양한 메서드를 통해 검색 조건(월별, 주별, 프로그램별 등)에 따른 데이터 조회, 차트 데이터 조회, 합계 계산 등의 기능을 포함하고 있음. 또한, 에러 메시지 처리 또한 함께 구현되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcrmtracestatus/BCRmTraceStatusController.java|웹 요청을 처리하고 서비스 클래스에 접근하여 데이터를 반환하는 컨트롤러 클래스임. 다양한 요청 경로를 가진 메서드들이 있으며, 대부분의 요청은 데이터셋과 온라인 컨텍스트를 인자로 받고, 처리된 데이터셋을 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigntabledashboard/PUTableDashBoardWooriController.java|대시보드에 대한 다양한 요청을 처리하는 웹 컨트롤러 기능을 제공함. 특히, pmChart1, pmChart2, pmGrid1, pmFunctionNameLevel4Inq, pmApprovalSettingInq에 대한 요청을 각각 대응하는 서비스로 연결해 결과를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigntabledashboard/PUTableDashBoardWoori.java|대시보드를 위한 차트 및 그리드 데이터를 생성하고, 검색, 조회작업을 하여 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigntabledashboard/DUTableDashBoardWoori.java|대시보드의 다양한 차트 및 그리드 정보를 조회하고, 특정 탭 정보를 설정해주고, 프로젝트 예외 처리를 수행하며, 함수 수준 조회와 승인 설정 조회를 수행하는 기능을 가지고 있는 클래스임.|
|com/skcc/pms/bizcomponent/dashboard/sinstitutionexistingreportdashboard/PUInstitutionDashBoard.java|프로젝트 관리 대시보드 화면에 관련된 데이터를 조회하고 관리하기 위한 클래스로, 로그인 사용자에 따른 대시보드 뷰 설정 조회, 여러가지 상태별 프로젝트/프로그램/사용자 정보 조회, 공지사항과 일정 등을 조회하는 기능들을 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/sinstitutionexistingreportdashboard/DUInstitutionDashBoard.java|요청된 데이터와 상황에 따라 프로젝트의 다양한 정보를 조회하고 집계한 뒤 반환하는 기능을 수행함. 이는 프로젝트의 대시보드 화면에 필요한 정보를 제공하기 위한 것으로, 프로젝트의 일정, 진행 상황, 공지사항, 일정 관리, 팀원 상태 등 다양한 정보를 조회함.|
|com/skcc/pms/bizcomponent/dashboard/sinstitutionexistingreportdashboard/BCInstitutionDashBoardController.java|여러 프로젝트 관리 대시보드에 대한 데이터를 요청하고 내보내는 웹 기반 서비스를 제공하는 컨트롤러임. 각 요청은 특정 대시보드의 데이터를 조회하기 위한 서비스 메소드로 연결됨. 프로그램 상태 정보를 포함한 엑셀 파일을 다운로드하는 기능 또한 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesignprogramdashboard/PUDesignProgramDashBoard.java|사용자의 요청정보를 처리하고 다른 클래스의 메서드를 호출하여 데이터를 가져와 성공 여부를 메시지로 반환하는 여러 메서드들을 제공하는 클래스임. |
|com/skcc/pms/bizcomponent/dashboard/bcdesignprogramdashboard/BCDesignProgramDashBoardController.java|웹 요청을 처리하여 대시보드 관련 특정 서비스 로직을 수행하고 결과 데이터를 반환하는 컨트롤러 역할.|
|com/skcc/pms/bizcomponent/dashboard/bcdesignprogramdashboard/DUDesignProgramDashBoard.java|대시보드의 차트와 그리드에 데이터를 제공하기 위해 여러 조건에 따라 데이터베이스로부터 필요 정보를 조회하고 처리하는 기능을 수행하며, 특정 프로젝트에 대한 예외 처리 등도 함께 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcinterfacedevdashboard/DUInterfaceDevDashBoard.java|이 코드는 데이터베이스에서 다양한 데이터를 가져와서 웹사이트나 어플리케이션에 보여주는 역할을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcinterfacedevdashboard/PUInterfaceDevDashBoard.java|사용자 요청에 따라 다양한 쿼리를 실행하고, 그 결과를 반환하며, 오류 처리를 수행하는 업무 로직을 담당하는 JAVA 클래스임.|
|com/skcc/pms/bizcomponent/dashboard/bcinterfacedevdashboard/BCInterfaceDevDashBoardController.java|프로젝트의 상황을 관리하는 대시보드에 여러 정보를 제공하는 컨트롤러로, 해당 정보는 프로젝트의 상태, 스케줄, 가이드, 공지, 차트 등 다양한 정보를 요청하고 응답받는 기능을 가짐.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard4/DUDesignDashBoard4.java|다음의 기능을 수행하는 저장소 클래스임: 탭 정보 설정, 두 개의 차트와 그리드 생성, 특정 기능 조회, 결제 설정 조회. 동시성 문제를 일으키지 않도록 Singleton 객체로 실행되며, 특정 프로젝트에 대한 예외 처리 로직을 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard4/BCDesignDashBoard4Controller.java|클라이언트의 요청에 따른 데이터셋을 반환하는 웹 요청 핸들러들을 정의하고 있음. 요청의 종류에 따라 데이터셋을 그리드1, 차트1, 차트2, 승인 설정 조회, 4단계 함수 이름 조회로 처리할 수 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard4/PUDesignDashBoard4.java|요청 정보를 기반으로 특정 데이터를 시각화한 차트 정보와 그리드 정보를 생성하여 제공하며, 또한 레벨4 함수 정보를 조회하고, 승인 설정 정보를 조회하는 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard3/DUDesignDashBoard3.java|데이터베이스에서 차트와 그리드 데이터를 조회하고, 사용자 요청에 따라 해당 데이터를 수정 및 반환하는 등의 다양한 기능을 수행하는 서비스 임.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard3/BCDesignDashBoard3Controller.java|스프링 프레임워크를 사용한 웹 애플리케이션에서, 대시보드 관련 정보를 요청받아 처리하고 응답을 반환하는 컨트롤러 역할을 수행함. 다섯 가지 웹 요청 경로(pmGrid1, pmChart2, pmChart1, pmApprovalSettingInq, pmFunctionNameLevel4Inq)에 대한 처리를 정의하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard3/PUDesignDashBoard3.java|다수의 차트와 그리드 생성, 그리고 다른 기능들을 처리한 결과를 가져오는 메서드들과 함께, 요청받은 데이터를 처리하고, 예외 처리를 하는 장치가 부착된 스프링 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputstatusaccum/BCManHourInputStatusAccumController.java|웹 요청을 처리하여 사용자에게 man-hour 입력 상태의 누적 목록을 반환하는 컨트롤러 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputstatusaccum/PUManHourInputStatusAccum.java|사용자의 요청 정보를 기반으로 'dmManHourInputStatusAccumListInq' 메소드를 호출하여 결과 데이터를 얻고, 이를 반환하는 기능 수행. 그 과정에서 발생하는 예외 상황에 대해 처리하고, 각 상황에 맞는 메시지를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputstatusaccum/DUManHourInputStatusAccum.java|프로젝트와 서브 프로젝트 번호를 기반으로 특정 일자에 상하기만 하면되는 정보를 수집하여 인력 입력 상황을 모니터링하는 정보를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard2/DUDesignDashBoard2.java|프로젝트 대시보드를 관리하는 DAO 클래스다. 데이터베이스로부터 차트 데이터, 그리드 데이터 등을 조회하고, 여러 항목에 대한 정보 설정 기능을 가지고 있다. 특정 예외 처리 (예: 특정 프로젝트에 대한 예외)도 함께 구현돼 있다. 또한 특정 탭 아이디에 대해 계획 종료 날짜와 실제 종료 날짜를 설정하고 관리하는 메소드도 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard2/BCDesignDashBoard2Controller.java|대시보드 관련 서비스를 제공하는 웹 컨트롤러로, pmGrid1, pmChart1, pmChart2, pmApprovalSettingInq, pmFunctionNameLevel4Inq와 같은 다양한 요청을 처리함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard2/PUDesignDashBoard2.java|데이터셋 요청 정보를 가져와서 여러 차트 및 그리드를 생성하고, 특정 기능 이름을 조회하며 승인 설정을 조회하는 기능을 가진 서비스임. 실패 경우에는 로그를 남기고, 비즈니스 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/dashboard/bcprogramdashboard/PUProgramDashBoard.java|대시보드에 대한 여러 가지 기능을 제공하는 코드로, 그 중 문자열 검색, 각종 데이터 조회, 데이터 처리 결과 반환 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcprogramdashboard/BCProgramDashBoardController.java|다양한 프로젝트 관리 정보 조회를 판에 그릴 수 있도록 Spring Framework를 이용해 웹 서비스 메소드들을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcprogramdashboard/DUProgramDashBoard.java|이 코드는 프로젝트 대시보드 관련 기능을 수행하는 클래스로, 프로젝트의 일정, 멤버 상태, 공지사항, 기술 지원, 개발 가이드 등의 정보를 조회, 엑셀 다운로드 등을 지원함.|
|com/skcc/pms/bizcomponent/dashboard/bcriskprogressretrive/BCRiskProgressRetriveController.java|웹 애플리케이션에서 두 가지 리스크 진행상황 조회 요청('pmRiskProgressInq', 'pmRiskProgressRetrieve')을 처리하고, 해당 요청에 대한 응답을 반환해주는 기능을 가짐.|
|com/skcc/pms/bizcomponent/dashboard/bcriskprogressretrive/DURiskProgressRetrive.java|데이터 리스크의 진행 상황을 검색하고, 사용자의 요청을 기반으로 월별, 주별 또는 일별 수준에서 리스크 상황을 조회하는 기능을 제공함. 또한 프로젝트 번호, 하위 프로젝트 번호를 기반으로 필요한 데이터를 획득하고, 이에 따른 결과를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcriskprogressretrive/PURiskProgressRetrive.java|위험 진행 상황을 조회하는 서비스를 제공하며, 'pmRiskProgressRetrieve' 메서드를 통해 위험 진행 정보를 가져오고, 'pmRiskProgressInq' 메서드를 통해 기록된 위험 진행 수를 조회할 수 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcimportant/BCImportantDashboardController.java|웹 요청을 처리하고, 서비스 메소드를 호출하여 정보를 반환하는 컨트롤러로, 대시보드에 사용자, 기간, 차트, 그리드, 추세 그래프 및 추세 그리드에 대한 정보를 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcimportant/PUImportantDashboard.java|사용자의 대시보드를 관리하기 위한 서비스로, 대시보드에서 사용자 정보를 가져오거나, 특정 기간을 설정하고, 특정 차트를 생성하며, 특정 그리드를 생성하고, 추세 차트를 생성하고, 추세 그리드를 생성하는 기능이 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcimportant/DUImportantDashboard.java|중요한 대시보드 데이터를 제공하는 코드로, 사용자 정보, 기간, 차트, 그리드, 트렌드 차트 및 트렌드 그리드를 가져오는 기능과 데이터를 셋팅하고 처리하는 여러 메소드가 존재함. 난이도 및 중요도에 따른 항목을 추출하여 처리하고, 계산된 결과를 데이터셋으로 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndevprogramdawoori/BCDesignDevProgramDaWooriController.java|사용자의 요청에 따라 'pmListAll', 'pmModelListAll', 'pmMappingListAll' 세 가지 방법을 통해 정보를 조회하고 반환하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndevprogramdawoori/PUDesignDevProgramDaWoori.java|데이터 요청과 함께 모든 이름 목록, 모델 이름 목록, 매핑 이름 목록을 반환하는 세 가지 메소드를 제공하는 서비스 클래스임. 각 메소드는 오류 발생 시 예외 처리 및 상황 로깅을 함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndevprogramdawoori/DUDesignDevProgramDaWoori.java|데이터베이스에서 특정 정보를 추출하고 처리하는 기능을 수행하는 여러 메서드들로 구성된 저장소 클래스임. 특히 dmListAll, dmModelListAll, dmMappingListAll 메서드를 통해 요청받은 정보를 바탕으로 데이터를 가져와 처리하고 결과를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcevstateretrieve/BCEvStateRetrieveController.java|사용자의 요청을 받아 해당 서비스를 실행하여 결과를 반환하는 웹서비스 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcevstateretrieve/PUEvStateRetrieve.java|주어진 요청 정보를 이용해 특정 상태의 리스트를 불러오고, 이를 처리해서 다시 데이터셋 형태로 반환하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcevstateretrieve/DUEvStateRetrieve.java|주어진 요청 정보(프로젝트 번호, 시작 날짜, 종료 날짜 등)를 가지고 데이터베이스에서 특정 부분 프로젝트의 EVM(Event-Value Management) 상태 리스트를 가져와 반환하는 기능을 수행함. 이때, 'checked'가 월 혹은 주일 경우에 따라 각각 다른 쿼리를 통해 데이터를 가져오며, 그 결과에 따라 bac의 최대값 + 1 값을 총 레코드 수로 설정함.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputstatusgrade/DUManHourInputStatusGrade.java|사용자의 요청 정보를 기반으로 한 프로젝트의 시간 계획과 실적 정보를 쿼리하여 반환하되, 그 결과를 여러 방식으로 정제하고 정렬하는 자바 기반의 코드입니다. 결과 데이터는 테이블 형태로 반환되며, 엑셀 파일로 다운로드 가능합니다.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputstatusgrade/PUManHourInputStatusGrade.java|스프링 기반의 서비스 클래스로, ManHourInputStatusGrade라는 대시보드를 관리하는 서비스를 제공하는데, 이 클래스는 세 가지의 메소드(pmManHourInputStatusGradeListInq, pmManHourInputStatusGradePivotdown, pmManHourInputStatusGradeListInqDynamic)를 통해 데이터 조회와 데이터 처리를 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputstatusgrade/BCManHourInputStatusGradeController.java|사용자의 요청에 따라 인력 투입 상태 등급 데이터를 조회하거나 엑셀 파일로 다운로드 할 수 있게 해주는 기능을 담은 스프링 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcinspectionperformretrieve/BCInspectionPerformRetrieveController.java|방문 검사 성능 조회를 위한 종합적인 웹 컨트롤러로 대시보드에 표시할 데이터들을 반환하는 다양한 API를 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcinspectionperformretrieve/DUInspectionPerformRetrieve.java|'inspection'이라는 데이터를 조회하고, 관리하고, 처리하는 로직을 담고 있는 자바 클래스임. 데이터 조회 기능, 개발자 조회 기능, 예외처리 기능 등이 구현되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcinspectionperformretrieve/PUInspectionPerformRetrieve.java|사용자로부터 데이터를 받아 검사 수행 상황, 결함 및 밀도율, 집계 상황을 검색하고, 개발자 정보를 조회하며, 인스펙션의 승인 설정 상황을 확인하고, 인스펙션을 수행한 마지막 날짜를 조회하는 기능 존재.|
|com/skcc/pms/bizcomponent/dashboard/bcdashboard/PUDashBoard.java|자바를 사용한 Spring 프레임워크 기반의 대시보드 서비스 클래스로서, 다양한 조회 기능을 제공함. 이 클래스에서는 데이터셋을 요청받아 예외 처리를 수행하고, 추출된 결과를 다시 데이터셋으로 감싸 반환하는 것을 반복하는 메소드들로 구성되어 있음. 이러한 과정을 통해 개발 이벤트 리스트, 프로젝트 진행 현황, 공지사항 등 다양한 데이터를 조회하고 처리하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcdashboard/BCDashBoardController.java|다양한 프로젝트 및 팀 데이터 조회 요청을 처리하는 웹 컨트롤러임. 각 요청은 프로젝트 상태, 일정, 공지사항, 자원 상태 등 다양한 측면의 정보를 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcdashboard/DUDashBoard.java|이 코드는 다양한 기능을 수행하는 대시보드 관련 클래스로 이벤트 또는 계획 조회, 프로그램 상태 목록 조회, 공지사항 상세 조회, 스케줄 상세 조회, 부서 조회, 아이디로 사용자 정보 조회 등을 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard/BCDesignDashBoardController.java|스프링 프레임워크를 사용해 웹 요청을 처리하고, 그 요청에 따라 다양한 데이터 집합을 반환하는 컨트롤러 기능 구현.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard/PUDesignDashBoard.java|차트와 그리드 데이터를 만들어주고, 특정 기능의 레벨을 조회하거나 승인 설정을 조회하는 기능이 담긴 서비스를 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboard/DUDesignDashBoard.java|대시보드 관리를 위한 여러 데이터 조회와 처리 기능을 포함하는 클래스임. 이 클래스의 기능은 100% 탭 정보 설정, 차트 데이터 조회, 그리드 데이터 조회, 함수명 레벨, 승인 설정 조회 등임. 특히, 각 탭에 맞게 데이터 필드를 설정하는 'setEndDt' 함수와 각각의 차트와 그리드를 위한 데이터를 조회하는 'dmChart'와 'dmGrid' 함수, 그리고 승인 설정과 함수명 레벨을 조회하는 'dmFunctionNameLevel4Inq', 'dmApprovalSettingInq' 함수 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcSbNtmPerDashBoard/BCSBNtmPerDAO.java|SKCC의 대시보드 관리를 위한 코드로, 프로그램 상태에 대한 차트와 그리드를 생성하고 관리하는 기능 수행함. 이러한 차트와 그리드는 테스트 케이스 관련 정보 또한 포함하고 있음. 여기에 추가로, 사용자의 요청에 따라 다른 인덱스를 생성할 수 있도록 하는 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcSbNtmPerDashBoard/BCSBNtmPerController.java|웹에서 요청을 받아 서비스와 연결해주는 컨트롤러 기능을 가진 클래스로, 프로그램의 상태를 나타내는 그리드 및 차트 정보를 생성하고, 이에 대한 테스트 케이스도 관리함.|
|com/skcc/pms/bizcomponent/dashboard/bcSbNtmPerDashBoard/BCSBNtmPerService.java|프로그램의 상태를 그리드 및 차트 형태로 보여주고, 테스트 케이스에 대한 상태도 같은 형식으로 보여주는 기능을 수행함. 이 때 서비스 로직 상 예외가 발생하면 예외를 잡아내어 비즈니스 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboardwoori/BCDesignDashBoardWooriController.java|웹 요청에 따라 서비스를 호출하여 결과를 반환하는 컨트롤러 클래스 작동임. 특히 'pmApprovalSettingInq', 'pmFunctionNameLevel4Inq', 'pmGrid1', 'pmChart2', 'pmChart1' 등의 요청에 대한 처리가 가능함. 이들 요청은 각각 입력된 데이터와 온라인 컨텍스트에 따라 처리되며, 각각에 해당하는 서비스를 호출하여 그 결과를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboardwoori/DUDesignDashBoardWoori.java|대시보드의 여러 차트 및 그리드 정보를 조작하고 관리하는 기능이 구현되어 있음. |
|com/skcc/pms/bizcomponent/dashboard/bcdesigndashboardwoori/PUDesignDashBoardWoori.java|대시보드를 위한 차트와 그리드를 구성하고, 데이터를 조회하는 서비스를 제공하는 함수들을 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcSbNtmDashBoard/BCSBNtmDAO.java|주어진 데이터에 따라 각각 다른 쿼리를 실행하여 결과를 반환하는 다양한 데이터베이스 조회 기능을 제공함. 이 기능들은 데이터가 들어온 상태에 따라 분기하여 처리하며, 예외 발생시 해당 오류 메시지를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcSbNtmDashBoard/BCSBNtmlService.java|데이터베이스의 다양한 정보를 요청 데이터와 온라인 컨텍스트를 조건으로 조회하는 메소드를 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bcSbNtmDashBoard/BCSBNtmController.java|여러 가지 요청에 따른 서비스를 제공하는 스프링 컨트롤러임. 전체 케이스, 포스트, 시나리오 조회, 테스트 케이스, 시나리오, 결함 상태, 결함 타입, 구분 코드, 대시보드 관련 HTTP 요청 처리를 담당하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndevdashboard/DUDesignDevDashBoard.java|이 코드는 대시보드를 관리하는 프로젝트의 메소드들을 정의하고 있으며, 클래스, 메소드, 변수, 쿼리 등의 정보와 대시보드의 상태를 확인하고 관리하는데 사용함. 대시보드에 필요한 데이터를 조회하거나 업데이트, 테크니컬 지원 리스트 조회, 알림 조회, 스케쥴 조회, 자원 활용 상태 조회, 프로그램 상태 조회 등의 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndevdashboard/PUDesignDevDashBoard.java|사용자의 요청에 따라 차트, 그리드, 데이터 검색 등 다양한 프로젝트 정보를 조회하고 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigndevdashboard/BCDesignDevDashBoardController.java|프로젝트의 다양한 정보들을 조회하는 엔드포인트를 관리하는 스프링 컨트롤러임. 이 컨트롤러를 이용하여 프로젝트 상황, 일정, 기술 지원 정보, 개발 가이드, 회원 정보 리스트 등을 요청하고, 해당 정보를 반환 받을 수 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputprogressretrive/DUManHourInputProgressRetrive.java|프로젝트의 일자를 조회하고, 해당 프로젝트의 차트에 표시될 월, 주, 일별 입력 진행 상황의 데이터를 검색해 내보내는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputprogressretrive/BCManHourInputProgressRetriveController.java|웹 서비스를 위한 컨트롤러로, 사용자의 요청에 따라 사용자의 입력 진행 상황, 프로젝트 날짜, 입력 진행 열 리스트를 조회하여 반환해주는 기능이 있는 웹서비스 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcmanhourinputprogressretrive/PUManHourInputProgressRetrive.java|프로젝트의 날짜 정보와 맨 시간 입력 진척도에 관련된 데이터를 조회하고 반환하는 세 가지 메소드를 포함한 서비스 클래스임.|
|com/skcc/pms/bizcomponent/dashboard/bcsrequirementsprogressretrive/PURequirementsProgressRetrieve.java|요구사항 진행 상황을 조회하는 서비스이며, 프로젝트 번호, 하위 프로젝트 번호, 기간, 시작 및 종료일, 총 검색 개수와 같은 정보를 데이터셋으로 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcsrequirementsprogressretrive/DURequirementsProgressRetrieve.java|사용자의 요청에 따라 프로젝트 진행 상황을 주별 또는 월별로 검색하고, 각 프로젝트의 계획과 실적을 비교 분석하는 기능을 수행함. 또한 전체 시간대를 클릭하면 특정 기간의 시작일과 종료일을 검색하고, 이를 이용해 기간별 프로젝트 진행상황을 확인할 수 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcsrequirementsprogressretrive/BCRequirementsProgressRetrieveController.java|사용자의 요청에 따른 요구사항 진행 상황을 조회하고 결과를 반환하는 웹 어플리케이션 컨트롤러 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcriskstateretrieve/PURiskStateRtrieve.java|위험 상태를 조회하는 세 가지 메서드(pmRiskStateList, pmRiskStateChart, pmRiskStateSummary)를 포함하고 있는 서비스 클래스임. 각 메서드는 요청 정보를 매개변수로 받아 처리 결과를 반환함. 오류 발생시 예외 처리도 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcriskstateretrieve/DURiskStateRtrieve.java|위험 상태에 관한 보고서를 조회하고 차트를 생성하며 요약 정보를 제공하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcriskstateretrieve/BCRiskStateRtrieveController.java|사용자의 데이터 요청을 받아 위험 상태에 대한 리스트, 차트, 요약 정보를 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigninterfacedashboardwoori/DUDesignInterfaceDashBoardWoori.java|대시보드 상의 다양한 차트 및 그리드를 생성하고 관리하는 기능을 수행함. 이에는 여러 탭에 대한 정보 설정, 각 차트의 데이터 조회 및 그리드 정보 조회 등이 포함되며, 특정 프로젝트의 예외처리도 다루고 있음. 각 기능은 받은 요청 정보에 따라 처리결과를 반환하며, 필요한 데이터가 없을 경우 에러 메세지를 발생시킴.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigninterfacedashboardwoori/BCDesignInterfaceDashBoardWooriController.java|Spring 프레임워크를 사용하여 구현된 컨트롤러 클래스에서는, HTTP 요청을 처리하고 그에 따른 서비스 로직을 호출하여 데이터를 반환하는 역할을 수행함. 클래스에서 정의된 각 메소드는 서로 다른 요청을 처리하며, 이들은 모두 input으로 받은 데이터와 컨텍스트 정보를 서비스 로직에 전달하고 그 결과를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigninterfacedashboardwoori/PUDesignInterfaceDashBoardWoori.java|대시보드 차트 및 그리드에 대한 데이터 처리와 4단계 함수 조회, 승인 설정 조회 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bccorrectiveactiondashboardwoori/PUCorrectiveActionDashBoardWoori.java|주어진 요청 정보와 Request 정보를 바탕으로 다양한 대시보드 정보를 조회, 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bccorrectiveactiondashboardwoori/DUCorrectiveActionDashBoardWoori.java|직교 액션 대시보드 월별 정보를 조회하고, 관련된 정보를 저장하고, 업데이트하는 등의 기능을 제공함|
|com/skcc/pms/bizcomponent/dashboard/bccorrectiveactiondashboardwoori/PUCorrectiveDashBoardWooriController.java|다양한 프로젝트 관리 대시보드 데이터 조회 기능을 담당하는 컨트롤러임. 프로젝트 목록, 리소스 상태, 프로젝트 진행 상황, 공지사항, 일정, 구성원 정보, 프로젝트 결과 등에 대한 정보를 요청하고 결과를 반환하는 기능을 포함함.|
|com/skcc/pms/bizcomponent/dashboard/bcntmtestdashboardwoori/DUTestProgramDashBoardWoori.java|대시보드를 관리하기 위한 클래스로, 대시보드의 데이터 조회, 엑셀 파일 저장, 데이터 삽입 등 다양한 기능을 제공함. 특히 아이템의 index나 요청 정보에 따라 다른 쿼리 실행이 가능하며, 통합 테스트 관련 데이터를 요청하는 등의 특수한 기능도 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcntmtestdashboardwoori/PUTestProgramDashBoardWooriController.java|웹 요청을 처리하고 서비스 메소드를 통해 데이터를 취득 및 처리한 뒤, 그 결과를 반환하는 컨트롤러 클래스임. 'pmList', 'pmntmInsertData', 'pmGetCoverage', 'pmflawManager', 'pmlastlist', 'pmlastexcel', 'IntegTestProg', 'IntegTestOuter', 'IntegTestThird' 등의 요청 처리기능이 있음. 특히 'pmlastexcel'은 엑셀 파일 다운로드 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcntmtestdashboardwoori/PUTestProgramDashBoardWoori.java|데이터를 요청받아 처리하고 그 결과를 리턴하는 다양한 메소드를 포함하고 있는 클래스임. 각 메소드는 오류가 발생할 경우 BizRuntimeException 을 던지고, 정상적으로 작동하면 처리 결과를 담은 IDataSet 객체를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcrmdashboardwb/DURmDashBoardWb.java|Spring 프레임워크를 사용하여 대시보드의 차트 및 그리드 정보를 조회하고, 새로운 정보를 설정하거나 승인 설정을 조회하는 기능을 제공하는 클래스임. 특정 tab 정보에 따라 다른 데이터를 조회하도록 분기처리가 되어 있으며, 문제 발생 시 사용자 정의 비즈니스 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/dashboard/bcrmdashboardwb/PURmDashBoardWb.java|대시보드에 관련된 차트와 그리드 생성, 함수명 레벨 4 조회, 승인 설정 조회 등의 기능을 수행하고, 그 결과를 데이터셋 객체로 반환하는 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bcrmdashboardwb/BCRmDashBoardWbController.java|스프링 프레임워크를 이용해 웹 컨트롤러로 동작하며, 주소가 "dashboard/BCRmDashBoardWB"로 요청된 경우, 서비스에서 제공하는 다양한 차트 및 그리드 데이터와 함수 수준 정보, 승인 설정 정보를 조회하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bclinkedproject/BCLinkedProjectController.java|프로젝트 목록을 가져오고 업데이트하는 서비스를 웹에서 요청을 받아 처리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/dashboard/bclinkedproject/DULinkedProject.java|프로젝트 리스트를 조회하고 업데이트하는 기능이 구현되어 있음. 'dmGetProjectList' 메소드는 데이터베이스에서 프로젝트 목록을 조회하고, 'dmUpdateProjectList' 메소드는 제공된 JSON 데이터를 파싱하여 데이터베이스에 프로젝트 정보를 업데이트함.|
|com/skcc/pms/bizcomponent/dashboard/bclinkedproject/PULinkedProject.java|프로젝트 리스트를 가져오고 업데이트하는 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisstatusretrieve/BCAnalysisStatusRetrieveController.java|웹상에서 사용자의 요청에 따라 여러 종류의 PM(프로젝트 관리) 분석 조회(월별, 연별, 차트, 목록 등)를 처리하고 결과를 반환하는 컨트롤러 기능이 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisstatusretrieve/PUAnalysisStatusRetrieve.java|프로젝트 진척률 분석 관련 정보를 요청 정보에 따라 체계적으로 검색하여 반환하는 서비스를 가지고 있는 클래스임. 해당 월별 계획예산, 실비용, 실적성과 등의 데이터 분석을 수행하고, 분석 결과를 다양한 형태로 제공함. 이 외에도 일정에 따른 성과지수를 계산하거나, 원래대로 표현한 숫자의 지수표현, 프로젝트의 리스크 상태 등에 대한 정보도 검색이 가능함.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisstatusretrieve/BCPjAnalysisStatusRetrieveController.java|프로젝트 분석 상태를 조회하는 컨트롤러로, 'pmPjAnalysisTotalInq' 메서드는 전체 프로젝트 분석 정보를, 'pmPjAnalysisChartInq' 메서드는 프로젝트 분석 차트 정보를 각각 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisstatusretrieve/DUPjAnalysisStatusRetrieve.java|데이터베이스에서 프로젝트 분석 상태를 조회하여 결과 데이터를 반환하는 역할을 수행하는 함수들을 포함한 repository 클래스임. 함수들은 각각 연도별 분석, 전체 분석, 차트 조회, 날짜별 차트 조회에 사용됨.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisstatusretrieve/PUPjAnalysisStatusRetrieve.java|프로젝트 분석 상태를 조회하는 기능을 수행하며, 프로젝트의 예산, 계획, 실적, 분석 차트 등을 계산하고 조회하는 역할을 함. 프로젝트의 총 예산, 실적, 비용 등에 대해 요청 정보를 기반으로 계산 후, 그 결과를 반환하는 기능과 더불어 매달 프로젝트 분석 차트를 구성하기 위한 데이터를 조회하는 기능을 수행함. 또한, 특정 값에 대한 반올림 처리를 수행하는 메서드를 가지고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcanalysisstatusretrieve/DUAnalysisStatusRetrieve.java|여러 비즈니스 분석 상태를 조회하는 리포지토리로 각각의 메소드는 다른 특정 상태를 조회하고 그 결과를 DataSet으로 반환함. 질의 기능에 따라 조회 대상이 변경되며, 특히 입력으로 받은 "unit_cd"에 따라 화폐 단위를 결정하는 로직이 존재함.|
|com/skcc/pms/bizcomponent/dashboard/bcnci/PUNCI.java|DUNCI 클래스에서 반환된 결과를 가져오고, 이를 포함한 파라미터를 통해 특정 업무의 결과와 목표를 반환하는 두 가지 메소드를 가진 빈즈로, PUNCI에 대한 서비스를 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcnci/DUNCI.java|다양한 기간(월, 주, 일)에 따른 점검결과를 조회하는 기능과 점검목록을 조회하는 기능을 제공하는 데이터 유닛임.|
|com/skcc/pms/bizcomponent/dashboard/bcnci/BCNCIController.java|스프링 프레임워크를 사용하여 BCNCIController 클래스를 작성하였으며, 이 클래스는 클라이언트의 요청을 받아 PUNCI 서비스의 'pmGetResult' 및 'pmGetTarget' 메소드를 호출하여 결과를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcsinstitutionexistinguserdashboard/BCSInstitutionExistingUserDashboardController.java|작업 코드 관리, 시스템 코드 관리, 엑셀 업로드/다운로드, 요구사항 범위 조회, 서비스 요청 관리, 팀 사이트 링크 등 여러 기능을 담당하는 웹 컨트롤러임. 각 기능은 별도의 요청 매핑을 가지고 있고, 작업 내용은 모두 별도의 서비스 객체에 위임함.|
|com/skcc/pms/bizcomponent/dashboard/bcsinstitutionexistinguserdashboard/PUSInstitutionDashboard.java|주어진 데이터를 여러 가지 방식으로 처리하고 관리하는 기능을 가진 클래스임. 예를 들어, 프로젝트 확인, 엑셀 파일 업로드, 시스템 코드 관리 등 다양한 요청에 대한 처리를 수행함. 동시에 오류가 발생했을 때는 적절한 예외 처리도 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcsinstitutionexistinguserdashboard/DUSInstitutionDashboard.java|이 코드는 업로드된 파일의 정보를 읽어 처리하고, 데이터베이스에 저장하고, 특정 계산 및 검증을 수행하고, 화면에 표시하기 위한 데이터 묶음을 생성하거나 불러오고, 엑셀 파일을 다운로드하고, 업로드된 엑셀 파일의 데이터를 처리하고 저장하는 등 여러 작업을 처리하는 기능을 가지고 있음. 또한, 파일과 데이터베이스에서 발생하는 오류를 다루기 위한 로직이 여럿 포함되어 있음. 이러한 작업들은 조직 내 정보 시스템 관리에 사용되며, 이들은 주로 웹 애플리케이션에서 비즈니스 로직 구현을 담당함.|
|com/skcc/pms/bizcomponent/dashboard/bcdevelopmentperformancesituation/PUDevelopmentPerformanceSituation.java|서비스 개발 진행 상황에 대한 데이터 조회 기능 제공함. 주요 기능으로는 개발 성능 상황 조회, 개인별 개발 성능 상황 조회, 작업일 조회, 진행 담당자 이름 목록 조회 등이 포함되어 있음.   |
|com/skcc/pms/bizcomponent/dashboard/bcdevelopmentperformancesituation/BCDevelopmentPerformanceSituationController.java|개발 성능 상황을 조회하는 여러 기능을 제공하는 웹 컨트롤러임. 이 컨트롤러는 개발 성능의 일반적인 목록 조회, 개인화된 목록 조회, 열 목록 조회, 워크데이 조회, 그리고 진행 상태 담당자 이름 목록 조회 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdevelopmentperformancesituation/DUDevelopmentPerformanceSituation.java|코드는 SKCC의 대시보드를 렌더링하기 위한 데이터 쿼리와 처리 로직을 담당하며, 일주일, 월, 일 단위별 개발 성과 상황 및 작업일수 데이터 조회와 처리, 총 검색조건을 기준으로 작업자 이름을 조회하는 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/progressrateretrieve/DUProgressRateRetrieve.java|프로젝트의 진척률을 계산하고 관리하는 코드임. 주어진 계획대로 진행되고 있는지 확인하고, 엑셀 파일로 결과를 다운로드하기도 함. 또한, 사용자의 권한에 따라 보여지는 정보를 다르게 설정함.|
|com/skcc/pms/bizcomponent/dashboard/progressrateretrieve/PUProgressRateRetrieve.java|Spring framework를 이용하여 진행률 정보를 요청받아 해당 정보를 검색하고 결과를 반환하는 서버 사이드의 비즈니스 로직 처리임.|
|com/skcc/pms/bizcomponent/dashboard/progressrateretrieve/BCProgressRateRetrieveController.java|Spring framework를 사용하여, 프로젝트의 진행률 조회 요청을 처리하고, 조회된 진행률 정보를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcprdtvy/BCPrdtvyDashboardController.java|웹 요청을 처리하고, 목록 조회, 기간 조회, 차트 출력, 그리드 출력 등의 동작을 수행하는 컨트롤러 기능을 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcprdtvy/DUPrdtvyDashboard.java|사용자의 요청에 따라 데이터 집합을 생성하며, 시스템 간 데이터 송수신과 데이터 처리, 계산을 합니다. 표시 계획, 실제 수행 횟수, 남은 기간, 지연 시간 등을 계산해 차트나 그리드에 표시할 데이터를 생성하며, 이러한 데이터를 요약하여 대시보드에 제공하도록 작성된 코드입니다.|
|com/skcc/pms/bizcomponent/dashboard/bcprdtvy/PUPrdtvyDashboard.java|프로젝트의 대시보드를 관리하는 클래스로, 특정 프로젝트나 하위 프로젝트에 대한 사용자 정보, 기간, 기본 날짜에 따른 기간, 프로그램 진행 차트, 프로그램 진행 그리드, 프로그램 진행 이력 차트, 프로그램 진행 이력 그리드 등의 정보를 조회하는 기능이 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcappq/PUAppQ.java|Spring Framework를 이용해 '대시보드' 업무 그룹에 속하는 서비스를 제공하는 클래스로, 'pmGetQualityList' 메소드를 통해 특정 데이터의 품질 정보 리스트를 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcappq/DUAppQ.java|주어진 요청 정보(DataSet 객체)와 온라인 컨텍스트를 입력으로 받아, 월, 주, 날짜에 따라 다른 쿼리를 실행하여 품질 정보를 조회하고 결과를 DataSet 객체 형태로 반환하는 기능 수행.|
|com/skcc/pms/bizcomponent/dashboard/bcappq/BCAppQController.java|웹 통신을 통해 사용자의 요청을 받으면 'pmGetQualityList' 메서드를 호출해 품질 리스트 정보를 반환하는 웹 컨트롤러 기능이 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigninterfacedashboard/BCDesignInterfaceDashBoardController.java|대시보드 디자인을 관리하는 서비스에서, 웹 요청을 처리하여 각 요청에 해당하는 서비스 함수를 실행하고 그 결과를 반환하는 컨트롤러 모듈임.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigninterfacedashboard/PUDesignInterfaceDashBoard.java|해당 코드는 대시보드를 구성하며, 차트 및 그리드 생성과 관련된 메소드로 정보를 요청, 처리하고 그 결과를 반환하는 서비스임. 또한, 함수이름과 승인 설정에 대한 조회도 제공함. 이 모든 과정에서 예외 발생시 예외를 처리하고 기록함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesigninterfacedashboard/DUDesignInterfaceDashBoard.java|다중 쿼리를 이용해 데이터를 조회하고 적절하게 필드를 설정하고 다루는 여러 기능들을 포함한 대시보드 디자인 인터페이스에 관련된 기능 구현임.|
|com/skcc/pms/bizcomponent/dashboard/bccsrdefectstatus/DUCsrDefectStatus.java|데이터베이스에서 월별 또는 주별로 데이터를 조회하고 프로그램 상태, 개발자, 범위 관리 승인 설정 등에 대한 다양한 정보를 조회하는 자바 클래스임.|
|com/skcc/pms/bizcomponent/dashboard/bccsrdefectstatus/PUCsrDefectStatus.java|Spring framework를 활용해 생성한 서비스 클래스로, 여러가지 기능을 가지고 있다. 개발 차트, 점유율 인보, 요청 정보 등을 그래프로 생성하고, 도메인에 따라 검색하여 그 결과를 전송하는 기능이 있으며, 에러가 발생할 경우 예외 처리 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bccsrdefectstatus/BCCsrDefectStatusController.java|클라이언트의 HTTP 요청들을 처리하고 그에 대한 응답을 제공하는 컨트롤러임. 여기에는 프로젝트 관리자 조회, 고객 상태 그리드, 프로그램 상태 차트, 생산성 인원 목록 조회, 범위 관리자 승인 설정 조회 등의 기능이 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcfunctionpointreport/DUFunctionPointReport.java|특정 대시보드에 대한 기능점 주제 보고서를 조회, 추가, 삭제, 업데이트하는 기능이 구현되어 있음. XML 형태의 데이터를 파싱하여 수정 또는 삭제를 처리하는 로직도 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcfunctionpointreport/PUFunctionPointReport.java|함수 지표 보고서를 조회, 추가, 삭제, 업데이트하는 기능을 가진 클래스임. 각 메서드는 요청 정보를 받아서 응답 데이터를 반환하며, 모든 과정에서 발생할 수 있는 예외를 처리하고 로깅함.|
|com/skcc/pms/bizcomponent/dashboard/bcfunctionpointreport/BCFunctionPointReportController.java|데이터셋 요청을 처리하고 그에 따른 응답을 반환하는 기능을 처리하는 공통 컴포넌트의 Restful API 콘트롤러임. 여기에는 보고서 조회, 추가, 삭제, 업데이트 등 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcsinstitutionexistinguserdashboard2/BCSInstitutionExistingUserDashboardController2.java|다양한 데이터 처리 서비스를 제공하는 웹 컨트롤러임. 그 내부에는 프로젝트 검증, 엑셀 업로드, 시스템 코드 관리 수정/삭제/추가등의 메서드들과 요구사항 범위 조회라는 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcsinstitutionexistinguserdashboard2/DUInstitutionDashboard2.java|업로드된 파일 정보를 가져오고, 다양한 데이터베이스 작업(데이터 삽입, 업데이트, 삭제, 조회)을 수행하며, 엑셀 파일 업로드를 처리하는 클래스임. 따라서 주로 데이터 관리 대시보드의 역할을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcsinstitutionexistinguserdashboard2/PUInstitutionDashboard2.java|request 정보를 받아 처리하고, 그 결과를 반환하는 여러 기능들을 포함한 클래스임. 이 기능들에는 프로젝트 확인, 엑셀 업로드, 시스템 코드 관리자 삭제, 시스템 코드 관리자 갱신, 시스템 코드 관리자 추가, 요구사항 범위 리스트 조회 등이 포함됨.|
|com/skcc/pms/bizcomponent/dashboard/bcdesignprogramdashboardwoori/DUProgramDashBoardWoori.java|데이터 대시보드의 기능을 구현한 코드로, 데이터 세트를 요청하고, 각 요청에 대한 처리 결과를 반환하는 기능뿐만 아니라 특정 탭의 정보를 설정하거나 차트 데이터를 조회하는 기능 등 다양한 데이터 처리 메소드를 포함하고 있음.|
|com/skcc/pms/bizcomponent/dashboard/bcdesignprogramdashboardwoori/PUProgramDashBoardWoori.java|주로 대시보드에 그래픽 요소(차트와 그리드)를 표시하고, 기능 수준 데이터를 조회하며, 승인 설정을 조회하는 역할을 수행함. 예외 처리를 통해 비즈니스 런타임에 대한 예외 상황을 처리함.|
|com/skcc/pms/bizcomponent/dashboard/bcdesignprogramdashboardwoori/PUProgramDashBoardWooriController.java|특정 대시보드 서비스를 제공하는 웹 컨트롤러로, 다수의 API 엔드포인트(차트 정보 불러오기, 그리드 불러오기, 기능명 레벨4 조회, 승인 설정 조회 등)를 제공함.|
|com/skcc/pms/bizcomponent/dashboard/bcchangestateretrieve/DUChangeStateRetrieve.java|데이터베이스에서 "DUChangeStateRetrieve.S001" 쿼리를 실행하고 그 결과를 "rsOut"라는 이름의 레코드 세트로 반환함.|
|com/skcc/pms/bizcomponent/dashboard/bcchangestateretrieve/PUChangeStateRetrieve.java|변경 관리 현황을 조회하여 상태 보고서를 생성하고 처리 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/dashboard/bcchangestateretrieve/BCChangeStateRetrieveController.java|웹 요청에 따른 대시보드의 상태 변경 정보를 반환하는 컨트롤러 역할을 함.|
|com/skcc/pms/bizcomponent/dashboard/bctestintegrateddashboard/BCTestIntegratedController.java|집합화 테스트 대시보드의 기능으로, 클라이언트 요청에 따른 데이터셋을 반환하는 여러 매핑 함수들이 정의되어 있음.|
|com/skcc/pms/bizcomponent/dashboard/bctestintegrateddashboard/DUTestIntegrated.java|각종 데이터를 조회하고 그 결과를 반환하는 여러 메소드들을 정의한 자바 클래스임.|
|com/skcc/pms/bizcomponent/dashboard/bctestintegrateddashboard/PUTestIntegrated.java|사용자로부터 요청 데이터를 받아서 각기 다른 세 가지 메서드(pmListInq, pmListInq2, pmTestStatusRightChart)를 통해 이 데이터를 처리하고 그 결과를 반환하는 기능을 가진 클래스임.|
|com/skcc/pms/bizcomponent/system/bcmonitoring/PUMonitoring.java|로그인 사용자의 세션 정보를 조회하고 해당 정보(사용자 ID, 이름, IP, 로그인 시간, 마지막 사용 시간 등)를 기록하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/system/bcmonitoring/BCMonitoringController.java|웹 요청을 처리하기 위한 컨트롤러 역할을 수행하며, 특히 'system/BCMonitoring' 경로로 들어오는 요청 중 'pmLoginList' 요청에 대해서는 service 객체의 'pmLoginList' 메소드를 부르는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/system/bcadhocquerymanager/BCAdhocQueryManagerController.java|임의의 질의를 실행하는 컨트롤러로, 요청받은 데이터를 가지고 서비스의 pmQueryExec 메서드를 호출해 결과 데이터를 반환함.|
|com/skcc/pms/bizcomponent/system/bcadhocquerymanager/PUAdhocQueryManager.java|사용자가 제공한 데이터 쿼리를 실행하고 결과를 반환하는 퍼블릭 유틸리티 클래스임. 예외 처리 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/system/bcadhocquerymanager/DUAdhocQueryManager.java|조회 쿼리를 실행하여 결과를 리턴하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/system/bclogmanager/DULogManager.java|로그 데이터를 관리하는데 사용되며, 로그 데이터의 추가, 로그 데이터 개수 확인, 그리고 로그 데이터 갱신 기능을 제공함.|
|com/skcc/pms/bizcomponent/system/bclogmanager/PULogManager.java|로거 관리를 위한 다양한 기능을 제공하는 클래스로, 로그 파일 목록 조회, 특정 로그 파일 내용 조회, 로그 파일 초기화, 액세스 로그 등록 등의 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/system/bclogmanager/BCLogManagerController.java|웹 요청을 처리하기 위한 로그 정보 조회, 로그 파일 다운로드, 로그 정보 추출, 로그 삭제 등의 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/system/bcuserlogin/PUUserLogin.java|사용자 검색을 위한 로그인 요청을 처리하고 그 결과를 리턴해주는 기능을 함.|
|com/skcc/pms/bizcomponent/system/bcuserlogin/BCUserLoginBean.java|문자열로 된 날짜를 Date 타입으로 변환하고, 두 날짜 간의 차이를 일 단위로 계산해주는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/system/bcuserlogin/DUUserLogin.java|사용자의 로그인 정보를 데이터베이스에서 검색하고, 검색된 정보를 통해 특정 기간동안의 사용자 로그인 정보를 생성하여 제공하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/system/bcuserlogin/BCUserLoginController.java|사용자 로그인 관련 정보를 처리하는 컨트롤러로, 'system/BCUserLogin' 경로에 대한 요청을 처리하며, 'pmUserSearch' 요청을 통해 사용자 검색을 수행함.|
|com/skcc/pms/bizcomponent/system/bcpropertiesmanager/PUPropertiesManager.java|속성 관리를 위해 속성 정보를 저장, 검색 및 목록화하는 기능을 수행하며, 주어진 로그 파일 이름에 대한 전체 경로를 반환함.|
|com/skcc/pms/bizcomponent/system/bcpropertiesmanager/BCPropertiesManagerController.java|웹 상에서 시스템 프로퍼티 리스트 조회, 다운로드, 상세정보 확인, 저장 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/system/bctestfileupload/BCTestFileUploadController.java|파일 업로드와 관련된 특정 서비스를 제공하는 엔드포인트들을 노출하는 웹 컨트롤러를 정의함. 이 컨트롤러에는 pmList와 pmRegister라는 두 가지 웹 요청 처리 메서드가 있음.|
|com/skcc/pms/bizcomponent/system/bctestfileupload/PUTestFileUpload.java|파일 업로드를 관리하는 클래스로, 파일 목록 조회(pmList), 파일 등록(pmRegister), 파일 삽입(pmInsert), 파일 업데이트(pmUpdate) 기능을 가짐.|
|com/skcc/pms/bizcomponent/system/bctestfileupload/DUTestFileUpload.java|테스트 파일을 업로드하고, 해당 파일의 메타데이터를 데이터베이스에 추가하는 기능들을 가진 코드임.|
|com/skcc/pms/bizcomponent/common/bcsiteifmoniteringretrieve/BCSiteIFMoniteringRetrieveController.java|웹 요청을 처리하고, 해당 요청을 서비스 레이어로 라우팅하여 데이터를 가져오는 스프링 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcsiteifmoniteringretrieve/DUSiteIFMoniteringRetrieve.java|사용자의 요청에 따라 상황별로 데이터베이스를 조회하고 조회 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcsiteifmoniteringretrieve/PUSiteIFMoniteringRetrieve.java|로그를 조회하고 그 결과를 반환하며, 모든 과정에서 발생하는 예외를 기록하고 처리하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcdblog/BCDbLogController.java|BCDbLogController라는 컨트롤러를 통해 RESTful API를 제공하며, 클라이언트의 요청을 service 클래스의 pmDbLogInq(), pmServerLogInq() 메소드로 전달하는 기능 수행함.|
|com/skcc/pms/bizcomponent/common/bcdblog/DUDbLog.java|요청 정보에 따른 데이터베이스 로그 조회 결과를 반환함.|
|com/skcc/pms/bizcomponent/common/bcdblog/PUDbLog.java|데이터베이스 로그 정보와 서버 로그 정보를 각각 조회하고, 그 정보를 데이터셋 객체로 반환하는 기능을 수행함. 또한 원하는 파일의 내용을 읽어오는 기능도 있음.|
|com/skcc/pms/bizcomponent/common/bcfavoritprj/PUFavoritPrj.java|사용자의 즐겨찾기 프로젝트 관련 정보를 읽어오고, 업데이트하며, 시퀀스 값을 받아오는 기능을 제공하며, 이 모든 기능 수행 과정에서 발생하는 예외 상황을 처리함.|
|com/skcc/pms/bizcomponent/common/bcfavoritprj/DUFavoritPrj.java|사용자의 관심 프로젝트를 관리하고 조회하며, 관심 프로젝트를 업데이트하는 기능인 '좋아요'와 '순서'를 조절하거나 XML 문자열을 파싱하는 등의 작업을 수행하는 Java 클래스임.|
|com/skcc/pms/bizcomponent/common/bcfavoritprj/BCFavoritPrjController.java|사용자의 프로젝트 즐겨찾기 관련 정보를 처리하는 웹 컨트롤러임. 기능으로는 사용자의 프로젝트 즐겨찾기 조회, 즐겨찾기 그리드 업데이트, 즐겨찾기 순서변경 등이 있음.|
|com/skcc/pms/bizcomponent/common/paymentmanagement/PUPayment.java|결제 정보를 조회, 삽입, 업데이트, 삭제하는 기능을 제공하는 서비스를 구현함. 각 메소드는 사용자의 요청 데이터를 받아 처리 후 처리 결과물을 리턴함. 또한, 작업 도중 오류 발생 시 사용자 정의 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/common/paymentmanagement/DUPayment.java|결제 데이터를 조회, 삽입, 업데이트, 삭제하는 기능과 XML 문자열을 DOM 문서로 변경하는 기능을 제공하는 클래스임.|
|com/skcc/pms/bizcomponent/common/paymentmanagement/BCPaymentController.java|결제 정보를 조회, 삽입, 업데이트, 삭제하는 기능을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcmessengerlink/ProcessUtil.java|사용자가 입력한 명령어(cmd)를 운영체제에 따라 실행시키고, 이 과정에서 발생하는 성공 메시지나 오류 메시지를 수집하여 출력하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcmessengerlink/DUMessengerLink.java|사용자 요청에 따라 액션을 수행하는 다양한 기능을 가진 메시지 링크 클래스임. 사용자 정보 및 데이터셋 객체 요청에 응답하며, 필요한 데이터를 데이터베이스에서 받아올 수 있다. 때때로 요청된 데이터에 더하여 필드를 추가하거나, 데이터셋을 새로 만들거나, 고유한 로그를 생성하기도한다. 또한 Openfire 메신저의 사용자 정보 테이블을 동기화하는 기능을 제공하고, 예외 처리도 수행함.|
|com/skcc/pms/bizcomponent/common/bcmessengerlink/PUMessengerLink.java|Messenger 링크 관련 데이터를 추가, 조회, 배치 실행, 삭제하는 주요 기능들을 제공하는 클래스임.|
|com/skcc/pms/bizcomponent/common/bcmessengerlink/BCMessengerLinkController.java|배치 실행, 데이터 삭제, 메신저 링크 수 조회, 메신저 링크 추가 등의 기능을 제공하는 웹 서비스 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcncimanager/BCNciManagerController.java|HTTP 요청에 따라 다양한 기능들을 수행하는 미들웨어 역할을 하는 컨트롤러 생성과 관리임. 각 기능은 특정 데이터셋을 요청하고, 데이터셋을 적절한 서비스 객체에 전달하여 결과를 반환함.|
|com/skcc/pms/bizcomponent/common/bcncimanager/PUNciManager.java|DB 커넥션을 맺고 SQL 쿼리를 수행하여 그 결과를 사용자에게 제공하는 여러 메소드들을 가진 클래스임. 이 클래스에서 제공하는 각각의 메소드는 DB에서 가져오는 데이터의 역할/종류에 따라 나뉘어져 있어 특정 정보를 받아오는 것을 지원, 예외 처리도 포함되어 있음.|
|com/skcc/pms/bizcomponent/common/bcncimanager/DUNciManager.java|입력된 요청 정보(DataSet 객체)를 이용해 데이터 조회, 업데이트, 추가, 삭제, 초기화 등 다양한 데이터베이스 조작을 수행하는 메소드들을 가진 클래스임.|
|com/skcc/pms/bizcomponent/common/bcsystemstatisticsmonitoring/BCSystemStatisticsMonitoringController.java|시스템 통계 정보를 모니터링하고 조회하며, 엑셀 파일을 다운로드하는 기능 제공.|
|com/skcc/pms/bizcomponent/common/bcsystemstatisticsmonitoring/DUSystemStatisticsMonitoring.java|선택된 탭에 따라 프로젝트 목록, 일정 실적, 개별 공정과 이슈 / 위험 / 작업 항목의 사용 현황, 승인 사용 현황, 팀 사이트 사용 현황 등을 조회하고, 해당 정보를 엑셀 파일로 다운로드하는 기능을 제공함. 또한 문자열을 정수로 변환하는 함수도 포함됨.|
|com/skcc/pms/bizcomponent/common/bcsystemstatisticsmonitoring/PUSystemStatisticsMonitoring.java|시스템 통계 모니터링 목록을 반환하고, 해당 데이터를 엑셀로 다운로드하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/BatchService.java|배치 작업의 생성, 수정, 삭제, 일시 정지, 재시작 등의 기능을 수행하는 BatchService 클래스를 구현한 코드임. 이 클래스는 배치 작업의 상태를 조회하고, 관련 트리거의 등록 및 비활성화, 이력 정보 조회, 그리고 실제 배치 작업의 실행 등을 제어함. 각 메서드는 매개변수로 IDataSet 객체를 받아 작업 수행 후의 결과를 다시 IDataSet 객체로 반환함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/BatchController.java|배치 서비스의 목록, 삭제, 히스토리, 정보, 등록, 실행 등의 작업을 처리하고 ApplicationContext를 새로 고침하는 웹 컨트롤러 기능을 가짐.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/SchedulerFactoryBeanWrapper.java|스케줄러 초기화 및 종료 시 진행중인 작업 처리, 배치작업 실행 및 로깅, 환경변수에 따른 조건부 작업 수행 등을 수행하는 클래스임.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/BatchDAO.java|배치 작업에 관련된 데이터베이스 조작(선택, 삽입, 수정, 삭제)를 수행하는 기능이다. DB에 배치 작업을 선택, 추가, 업데이트 하는 함수입니다. 또한 특정 배치 작업을 삭제하는 기능을 담당하는 함수도 포함되어 있습니다.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/MybatisHotswap.java|Mybatis 매퍼 및 Bean의 변경사항을 감지하여 자동으로 재로드하는 기능을 가진 코드임. 이 기능을 사용하면 시스템 재시작 없이 변경된 Mybatis 매퍼 또는 Bean을 자동으로 갱신할 수 있음. 주기적으로 Mybatis 매퍼 파일 및 Bean의 수정 시간을 확인하여 수정이 감지되면 해당 매퍼 또는 Bean을 다시 로드함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/progress/RedmineWorkValueDaily.java|일일 업무치와 관련된 데이터를 받아와서 처리하고, 각 프로젝트의 작업 값과 일치하는지 여부를 확인하는 작업을 수행하는 배치 작업임.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/progress/AgileWorkValueDaily.java|주어진 매개변수로 일일 소스 목록을 가져온 후 각각의 원소에 대해 'workValueService'의 'registerBy' 함수를 실행하고 진행 상황을 갱신하는 자동화 배치 작업을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/progress/SumUpProgressRateProject.java|주어진 프로젝트에 대해 전체, 서브 프로젝트 별로 진척률을 계산하고 집계하는 기능을 수행함. 이는 프로젝트 일자별, 서브 프로젝트 별로 반복되어 계산되며, 결과는 데이터베이스에 업데이트하거나 삽입됨. 작업 중 발생하는 예외 상황에 대해서도 처리하여 오류 메시지를 로깅함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/progress/SumUpProgressRate.java|프로젝트의 진행률을 조회하고 업데이트하는 기능을 가진 자바 클래스임. 프로젝트의 상세 정보(서브 프로젝트, 진척률 등)를 데이터베이스로부터 조회하고 계산한 후, 최신의 진행률 정보를 다시 데이터베이스에 업데이트함. 또한 Agile 서비스와 통신하여 특정 프로젝트의 Agile 진척 정보를 동기화하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/progress/JiraWorkValueDaily.java|매일 JIRA에서 특정 작업 값을 가져와서 등록하는 배치 작업을 수행함. 이 때, 작업 처리 상황을 실시간으로 표시하며, 작업 중간에 문제가 발생하면 해당 문제를 메시지에 기록하고 오류 메시지를 업데이트함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/bank/ProjectDailyBatchSB.java|일일 프로젝트 배치 작업을 수행하는데, 주요 작업은 프로젝트의 목록을 조회하고, 각 프로젝트에 대해 특정 정보(NTM 정보, 데이트 등)를 가져오고, 프로젝트와 관련된 테스트 케이스, 시나리오, 게시물, 디자인, 상태 등을 디비에 삽입하며, 예전 테스트 케이스를 삭제하고, 새로운 테스트 케이스를 삽입한 후, 특정 작업을 업데이트하는 기능임.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/bank/ProjectDailyBatchWB2.java|현재 날짜를 기준으로 데이터베이스에서 프로젝트 정보를 가져온 후, 프로젝트별로 DB link를 업데이트하고, 마지막에 DB 연결을 해제하는 일련의 배치 작업을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/bank/ProjectDailyBatchWB.java|매일 실행되는 배치 작업으로, 현재 날짜를 받아와 해당 날짜에 해당하는 프로젝트 리스트를 조회하고 각 프로젝트의 정보를 업데이트하는 기능이다. 또한 데이터베이스 연결과 해제도 수행한다.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/scope/ScopeTestDefectBatch3.java|현재 날짜를 기반으로 프로젝트 리스트를 조회하여 각 프로젝트에 대한 기관 현황 조사 배치를 실행하고, 그 정보를 데이터베이스에 저장하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/scope/ScopeTestDefectBatch2.java|현재 날짜를 가져와서 프로젝트 리스트를 조회한 후, 각 프로젝트에 대해 품질 검사와 EWS 작업을 수행하는 배치 작업임.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/scope/ScopeTestDefectBatch.java|현재 날짜를 기준으로 프로젝트 리스트를 조회하고, 각 프로젝트에 대해 산출물 관련 정보와 테스트 결함 관련 정보를 데이터베이스에 삽입하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/scope/UpdatedListHistoryBatch.java|배치 작업을 수행하여 완료된 프로젝트를 업데이트하고, 그 과정에서 발생하는 에러를 기록하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/JiraSync.java|Jira와 로컬 시스템 간에 'UPDATED' 상태의 프로젝트 정보를 동기화하는 배치 작업을 수행함. 작업 중 발생할 수 있는 오류를 잡아내어 메시지로 전달하고, 작업 진행 상황을 지속적으로 업데이트함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/SyncDeleteTblClearBatch1.java|데이터베이스의 삭제 테이블을 정리하고, 해당 테이블과 연계된 프로젝트가 있을 경우 '유형동기화'와 '시나리오동기화'를 수행하는 배치 작업을 구현함. 만약 연계 프로젝트가 존재하지 않을 경우, 로그에 해당 사항을 출력함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/TmsLinkSyncBatch.java|일정 시간마다 데이터베이스에서 프로젝트 번호를 가져와 해당 프로젝트의 테스트 유형과 시나리오를 동기화하는 배치 작업을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/QmsLinkInspectionBatch.java|스케줄링된 작업을 실행하고, QMS(Quality Management System) 링크 검사를 위한 배치 작업을 수행하는 기능이다. 서비스 ID와 프로젝트 번호를 정의하고, QMS 링크의 연결을 확인하고 업데이트하며, 모든 작업이 완료되면 로그에 종료 메시지를 남긴다.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/QmsLinkDataBatch.java|QMS(품질 관리 시스템)와의 연계 데이터를 동기화하는 배치 처리를 구현해둔 것으로, 데이터베이스에서 프로젝트 번호를 가져와 해당 프로젝트의 검사 정보를 가져오고, 진행 상황을 업데이트하는 작업을 수행함. 에러 발생 시 로그를 남기고, 연계할 프로젝트가 없는 경우에도 해당 정보를 로그에 기록함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/PortalSyncBatch.java|포털 동기화 배치 작업을 수행하며, 사용자 정보 설정, 서비스 아이디 셋팅 후, 부서, 사용자, 프로젝트, 팀 멤버를 전체 동기화하는 기능을 실행하며, 동기화 과정에서 오류 발생 시 로그를 출력하고 해당 오류 메시지를 출력함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/NexcoreLink.java|모든 서버와 동기화를 진행하는 배치 작업을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/TmsLinkProgressBatch.java|배치 작업을 수행하여 TMS와 연계하는 프로젝트가 있는지 확인하고, 존재하는 경우 각 프로젝트에 대해 테스트 시퀀스를 가져와 성능 테스트를 실행하고, 작업이 끝나면 관련 테이블을 정리하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/RedmineSync.java|주어진 조건에 따라 Redmine(프로젝트 관리 툴)과 Jira(이슈 추적 시스템)의 프로젝트 데이터를 동기화하는 작업을 수행함. 동기화 과정에서 오류가 발생하면 그 오류 메시지를 저장하고, 작업 진행 상황을 실시간으로 업데이트함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/ScopeToTmsSyncBatch.java|데이터베이스에서 전체 레코드를 검색하여 각 레코드에 대해 'project_no' 데이터를 바탕으로 프로젝트 공정 동기화 작업을 진행하고, 진행 상황과 오류 메시지를 로깅하는 기능을 가진 배치 작업을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/ProjectLinkExport.java|일정한 작업 상태 맥락(context)에서 프로젝트의 연결 정보를 배치 및 내보내는 기능을 담당하되, 처리 도중 발생하는 예외 상황을 잘 처리하고, 작업 상태를 메시지로 업데이트해주는 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/TmsLinkSyncBatch2.java|'PUTmsLink' 및 'DUTestManagerforTMS' 빈을 이용해 TMS(테스트 관리 시스템)와 동기화를 수행하며, 이는 TMS의 실적 프로그램, 설계 및 인터페이스에 대한 정보를 업데이트하거나 집계함. 만일 TMS와 연계하는 프로젝트가 없는 경우, 해당 정보를 로그에 출력함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/PortalSyncLatestBatch.java|사용자, 프로젝트, 팀 멤버의 정보를 동기화하는 배치 작업을 수행함. 실패 시 실패 로그를 출력함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/ProjectLinkImport.java|프로젝트 링크를 가져오는 배치 작업을 수행하며, 이 과정에서 오류가 발생할 경우 오류 메시지를 출력하고, 작업이 성공적으로 완료되면 완료 메시지를 출력하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/TmsLinkSyncBatch3.java|PMS와 TMS간의 연계 프로젝트를 조회하여 각 프로젝트의 일별 진척률을 집계, 계산하는 배치 작업을 수행함. 만약 연계 프로젝트가 없으면, 해당 사실을 로그로 기록함.|
|com/skcc/pms/bizcomponent/common/bcbatchmgr/job/link/SyncDeleteTblClearBatch2.java|종료된 프로젝트의 삭제 테이블 정리여부를 확인하고, TMS와 연계하는 프로젝트가 있으면 해당 프로젝트의 유형과 시나리오를 동기화하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/sharedcompress/FUSharedCompress.java|주어진 파일 또는 디렉토리를 압축하거나 압축 해제하는 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bclogin/DULogin.java|사용자의 로그인과 비밀번호 초기화, 프로젝트 변경 등을 관리하는 DULogin 클래스의 다양한 기능들을 제공함.|
|com/skcc/pms/bizcomponent/common/bclogin/BCLoginController.java|사용자의 로그인, 로그인 관련 정보 조회, 로케일 변경, 프로젝트 변경, 로그아웃 등의 기능을 처리하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bclogin/PULogin.java|사용자의 로그인, 로그아웃, 비밀번호 변경, 프로젝트 변경 등의 인증 관련 기능을 수행하는 클래스임. 주요 메소드로는 pmLoginProjectNoInq, pmLoginLocaleInq, pmUserLocaleUpt, pmLogOutLogInq, pmCrowdLogin, pmProjectChange 등이 있음.|
|com/skcc/pms/bizcomponent/common/bcmethodologystandardlink/DUMethodologyStandardLink.java|이 코드는 데이터베이스에서 정보를 쿼리하여 기형적인 작업을 처리하고, 사용자로부터 받은 쿼리 파라미터를 통해 특정 조건에 따라 정보를 수정, 추가, 조회, 삭제하는 기능을 수행함. 또한, 사용자로부터 받은 데이터를 엑셀 파일로 변환하거나, 엑셀 파일을 파싱하여 데이터를 처리하는 기능을 제공함. 직접적으로 다양한 데이터를 다루기 때문에 DB 관리 및 데이터 처리 로직에 중점을 둠.|
|com/skcc/pms/bizcomponent/common/bcmethodologystandardlink/BCMethodologyStandardLinkController.java|여러가지 기능의 태일러링 리스트 조회, 엑셀 파일 다운로드 및 업로드, 태일러링 업데이트/삽입/삭제, 제품 그리드 업데이트/삭제, 레벨 리스트 조회, 체크 포인트 저장 등의 웹 요청을 처리하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcmethodologystandardlink/PUMethodologyStandardLink.java|제공된 Java 코드는 서버의 기능을 담당하는 클래스로, 특정 정보를 가져오거나 엑셀 파일을 업로드 및 다운로드, 데이터를 업데이트, 삭제, 저장하는 등 다양한 데이터 관리 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/common/bcsntmlinktool/PUSNtmLinkTool.java|여러 서비스 기능을 제공하며, 주요 기능으로는 엑셀 파일 업로드 및 다운로드, 요청 정보 조회, 데이터 추가, 변경, 삭제 등 데이터 관련 처리를 수행하는 클래스임.|
|com/skcc/pms/bizcomponent/common/bcsntmlinktool/BCSNtmLinkToolController.java|웹에서 제공되는 여러 API 엔드포인트를 통해 업무 승인 설정 조회, 엑셀 파일 다운로드, 파일 다운로드, 프로젝트 번호 조회, Ntm 링크 리스트 조회, 데이터 삽입, 업데이트, Ntm 링크 삭제 등의 기능을 처리하는 웹 서비스 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcautonumbermanager/DUAutonumberManager.java|입력받은 데이터에 대해 자동 채번 체계를 관리하고, 특정 프로젝트에 대한 자동 채번 초기 정보 확인, 생성, 삭제 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/common/bcautonumbermanager/PUAutonumberManagerController.java|자동 번호 생성, 추가 및 삭제 기능을 처리하는 웹 서비스임.|
|com/skcc/pms/bizcomponent/common/bcautonumbermanager/PUAutonumberManager.java|자동 번호 생성, 삽입, 삭제 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcgroupusersetting/DUGroupUserSetting.java|사용자 그룹 설정을 관리하는 몇 가지 기능들을 제공하는 클래스임. 그룹 및 사용자 CRUD(Create, Read, Update, Delete) 기능과 같이, 그룹 및 사용자 목록을 가져오거나, 그룹 및 사용자를 저장하거나 삭제하는 기능 등을 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcgroupusersetting/BCGroupUserSettingController.java|사용자와 그룹을 관리하는 웹 컨트롤러로, 초기 설정, 목록 조회, 정보 저장, 정보 삭제 등의 기능을 담당함.|
|com/skcc/pms/bizcomponent/common/bcgroupusersetting/PUGroupUserSetting.java|사용자, 그룹, 그룹 사용자의 정보를 초기 설정, 리스트 출력, 저장, 삭제 기능을 수행하는 역할임.|
|com/skcc/pms/bizcomponent/common/sharedmailservice/DUMailSerivce.java|해당 코드는 사용자의 입력에 따라 이메일을 생성하고 발송하는 기능을 수행하며, 이메일 발송을 위한 정보를 데이터베이스에 추가하거나 이메일 발송 대기 목록을 처리하는 기능도 포함되어 있음. 이메일 본문, 첨부파일, 이미지 등을 지원하고, 송신자, 수신자, 참조자와 같은 이메일 인수를 관리함.|
|com/skcc/pms/bizcomponent/common/sharedmailservice/BCSharedMailServiceController.java|메일 서비스 관리를 위한 컨트롤러로, 메일 발송, 메일 발송 리스트 추가, 메일 발송 리스트 처리 기능을 구현함.|
|com/skcc/pms/bizcomponent/common/bcsync/DUSync.java|PMS(Project Management System) 사용자 및 프로젝트 정보의 동기화를 위한 기능을 제공하는 코드임. 사용자의 생성, 업데이트, 삭제, 프로젝트 및 프로젝트 멤버의 생성, 업데이트, 삭제, 그리고 부서 생성, 삭제, 백업 등에 대한 처리를 수행함.|
|com/skcc/pms/bizcomponent/common/bcsync/IndexController.java|HTTP 요청이 들어오면 '/pms/index.html'로 리다이렉트하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/common/bcsync/PUSync.java|사용자, 프로젝트, 팀 멤버, 부서 정보를 포털 사이트와 동기화하고, 이메일 유무를 체크하는 기능이 포함되어 있음. 동기화는 특정 시간 동안 변경된 정보만 가져오거나 전체 정보를 가져오는 두 가지 방식을 사용함. 정보가 변경되면 기존 정보를 업데이트하거나 새로운 정보를 추가함. 필요한 경우 기존 정보를 삭제하는 작업도 수행함. 이메일 유무를 체크하는 기능은 사용자의 이메일이 등록되어 있는지 확인함.|
|com/skcc/pms/bizcomponent/common/bcsync/BCSyncController.java|서버에서 HTTP 요청을 통해 사용자, 프로젝트, 프로젝트 팀원, 부서 정보를 동기화하거나 해당 사용자의 이메일 확인 여부를 확인하는 작업을 실행해주는 웹 컨트롤러 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcsiteusermappingretrieve/DUSiteUserMappingRetrieve.java|SKCC 플랫폼 관리 시스템에 적용된, 사용자 인터페이스와 데이터베이스 사이에서 작동하는 여러 데이터 처리 기능을 제공하는 자바 클래스임. 사용자 정보와 사이트에 대한 조회, 수정, 삭제와 추가 기능, 사이트와 사용자 매핑 정보의 엑셀 파일 업로드 및 다운로드 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcsiteusermappingretrieve/BCSiteUserMappingRetrieveController.java|사이트 사용자 매핑 정보를 조회, 추가, 삭제, 엑셀 파일 업로드 및 다운로드, 레이블 관련 작업 등을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcsiteusermappingretrieve/PUSiteUserMappingRetrieve.java|사용자 정보 조회, 레이블 추가, 삭제, Excel 파일 다운로드와 업로드, 사용자 매핑 업데이트 등의 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcuserinfomanager/DUUserInfoManager.java|사용자 정보를 관리하는 기능으로, 이메일 유효성 검사, 사용자 정보 목록 조회, 특정 프로젝트에 사용자가 포함되어 있는지 조회하는 기능이 있음. 안전한 암호화 알고리즘 사용과 관련하여 몇몇 기능들은 주석 처리되어서 현재 사용되지 않음.|
|com/skcc/pms/bizcomponent/common/bcuserinfomanager/BCUserInfoManagerController.java|사용자 정보를 관리하고, 해당 사용자의 마지막 프로젝트 정보를 체크하며, 사용자가 액세스한 메뉴에 대한 로그를 생성하는 기능이 있음. 또한, 일부 불안정한 알고리즘을 사용한 코드는 주석처리되어 있음.|
|com/skcc/pms/bizcomponent/common/bcuserinfomanager/PUUserInfoManager.java|사용자 정보를 관리하는 기능을 수행하며, 사용자의 정보목록을 조회하거나 프로젝트 번호의 동기화 상태를 확인하는 기능 등이 있다. 사용자 비밀번호 변경 메소드나 비밀번호 확인 메소드는 취약한 암호화 알고리즘을 사용하게 되어 현재는 주석 처리되어 있다. 또한, 비밀번호 유효성 확인을 위한 메소드도 존재한다.|
|com/skcc/pms/bizcomponent/common/bcchecklistmgr/DUCheckListMgr.java|이 코드는 사용자가 입력한 데이터를 기반으로 체크리스트를 생성하고 관리하는 기능을 제공하는 자바 언어로 작성된 비즈니스 컴포넌트임. 체크리스트 등록, 수정, 조회, 삭제와 함께 첨부파일 관리, 체크리스트 항목 엑셀 업로드 등의 기능을 제공하고 있음.|
|com/skcc/pms/bizcomponent/common/bcchecklistmgr/BCCheckListMgrController.java|사용자의 요청에 따라 다양한 CRUD(Create, Read, Update, Delete) 연산을 수행하고, 파일 다운로드 및 업로드, 엑셀 파일 관리 등의 역할을 하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcchecklistmgr/PUCheckListMgr.java|사용자의 입력값에 따라 체크리스트 조회, 수정, 삭제, 파일 업로드 및 다운로드 등의 동작이 정의된 서비스 클래스임.|
|com/skcc/pms/bizcomponent/common/bcdashboardviewmanager/PUDashboardViewManager.java|대시보드 뷰 관련 데이터를 관리하는 기능을 제공하는 데, 리스트 조회, 추가 그리고 대시보드 보드 데이터의 관리 기능이 있음. 각 기능 수행 후에는 처리 결과를 DataSet 형태로 반환함.|
|com/skcc/pms/bizcomponent/common/bcdashboardviewmanager/DUDashboardViewManager.java|대시보드 뷰를 관리하는 기능을 수행하는데, 이를 쿼리 조회, 데이터 추가 및 삭제, 그리고 대시보드 조작 등 다양한 방식으로 처리하며 필요한 데이터를 XML 형식으로 변환하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/common/bcdashboardviewmanager/BCDashboardViewManagerController.java|다음 세 가지의 기능을 하는 웹 서버를 배포하기 위한 스프링 프레임워크 컨트롤러를 제공함: 개인 사용자 대시보드 관리, 대시보드 뷰 추가, 들어온 대시보드 뷰 목록 질의 처리.|
|com/skcc/pms/bizcomponent/common/bcsautonumber/BCSAutonumberController.java|자동 번호 생성, 업데이트, 삭제 등의 기능을 하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcsautonumber/DUSAutonumber.java|자동 번호 생성 및 관리에 대한 다양한 기능을 수행하는 클래스임. 주요 메서드로는 자동 번호 목록 조회, 프로젝트 넘버와 이름 생성, 입력된 XML 데이터를 활용한 데이터 업데이트 등이 있으며, 특정 프로젝트나 코드의 삭제, 자동 번호의 추가 및 업데이트 등을 지원함.|
|com/skcc/pms/bizcomponent/common/bcsautonumber/PUSAutonumber.java|자동 번호리스트 조회(pmGetAutoNumberlist), 자동 번호리스트 수정(pmUpsert), 자동 번호리스트 삭제(pmAutoNumberDel), 자동 번호 생성(AutoNumberInsert), 자동 번호 업데이트(AutoNumberUpdate)를 관리하는 서비스임. 각 메소드는 입력과 가상 컨텍스트를 사용하며, 문제가 생길 경우 비즈니스 런타임 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/common/bcmethodologytailoringlink/BCMethodologyTailoringLinkController.java|해당 코드는 REST API를 통해 다양한 기능들을 제공하는 컨트롤러 역할을 수행함. 특히, 기능으로는 엑셀 파일 다운로드/업로드, 데이터 조회, 수정, 삭제, 연계 상품 그리드 업데이트/삭제, 레벨 리스트 조회, 방법론 파일 리스트 조회/삭제, 체크포인트 저장 등이 포함되어 있음.|
|com/skcc/pms/bizcomponent/common/bcmethodologytailoringlink/PUMethodologyTailoringLink.java|다양한 기능을 수행하는 데이터 관리 서비스로, 데이터의 조회, 수정, 삭제, 엑셀 파일 다운로드 및 업로드, 거래처 정보 저장 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcmethodologytailoringlink/DUMethodologyTailoringLink.java|프로젝트의 특성에 따른 맞춤 방법론(Tailoring)을 관리하는 기능을 수행하는 코드임. 이러한 방법론은 직접 추가, 수정, 삭제하는 기능과 엑셀 파일 업로드를 통한 일괄 처리 기능을 지원함. 외에도 부가적으로 검색 기능이나 데이터의 엑셀 다운로드, 첨부 파일 관리 등의 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/common/bcuserinfomationlist/PUUserInfomationList.java|사용자 정보 리스트를 제공하며, 요청 받은 requestData에 따라 사용자의 전체 정보 혹은 상세한 정보를 제공하고, 처리 도중 에러가 발생하면 로그를 기록하고 에러 메시지를 출력하는 기능 있음.|
|com/skcc/pms/bizcomponent/common/bcuserinfomationlist/BCUserInfomationListController.java|사용자 정보 목록과 상세 정보를 조회하는 컨트롤러로 동작하는 자바 웹 애플리케이션임.|
|com/skcc/pms/bizcomponent/common/bcuserinfomationlist/DUUserInfomationList.java|사용자 정보를 조회하며 전체 사용자 목록과 사용자의 상세 정보를 가져올 수 있는 기능을 가진 클래스임. 또한 요청된 사용자의 로그인 ID와 세션의 로그인 ID, 프로젝트 역할 코드, 사용자 역할 코드를 확인하고 로깅하는 기능이 있음.|
|com/skcc/pms/bizcomponent/common/bcproductstandardlist/DUProductStandardList.java|이 코드는 빌트인 함수들을 이용하여 사용자가 데이터를 생성, 조회, 수정, 삭제하는 CRUD 기능을 수행하는 자바 클래스임. 작업할 데이터는 주로 테이블 이름, 표준 방법론, 상세 방법론, 단계 이름, 업무명, 활동명, 필수 여부, 적용 유무, 산출물, 체크 포인트 등이며 엑셀 파일도 이용할 수 있음. 이 클래스는 또한 로그 기록, 예외 처리 등을 포함하며, 파일 업로드와 다운로드, 이미지 조회 및 삭제 등의 기능도 제공함.|
|com/skcc/pms/bizcomponent/common/bcproductstandardlist/BCProductStandardListController.java|상품 표준 리스트에 관련된 정보를 조회, 등록, 수정, 삭제하고, 엑셀 파일로 데이터를 다운로드 및 업로드하며, 이미지 조회 및 삭제, 파일 다운로드와 같은 다양한 서비스를 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcproductstandardlist/PUProductStandardList.java|다양한 기능의 데이터 관리를 위한 서비스를 제공하는 클래스로, 데이터의 조회, 추가, 수정, 삭제 기능 외에도 사용 가능한지 확인, 메타데이터 그리드 선택, 파일 다운로드 및 업로드, 프로젝트 사용자 리스트 조회 등의 기능을 포함함.|
|com/skcc/pms/bizcomponent/common/bcdatabackupmanager/BCDataBackupManagerController.java|데이터 백업 관련 기능을 수행하는 Spring MVC 컨트롤러로, 데이터 백업 실행, 백업 설정, 백업 파일 작성, 백업 이력 조회의 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcdatabackupmanager/DUDataBackupManager.java|데이터 백업 내역을 조회하고 추가하는 기능을 가진 클래스임.|
|com/skcc/pms/bizcomponent/common/bcdatabackupmanager/PUDataBackupManager.java|PostgreSQL 데이터베이스의 데이터를 백업하고, 백업 파일 생성에 관한 이력을 관리하는 기능을 수행함. 수동 또는 자동으로 데이터 백업을 실행하고, 해당 백업 파일의 정보(이름, 경로, 크기 등)를 기반으로 백업 이력을 생성하고 관리함.|
|com/skcc/pms/bizcomponent/common/bcteamsiteform/PUTeamSiteForm.java|이 코드는 팀 사이트 폼의 생성, 삭제, 업로드, 다운로드 등의 기능을 관리하는 서비스 클래스임. 기능별 메소드가 각각 있으며, 요청정보를 받아 처리 후 결과 데이터셋을 반환하는 구조임.|
|com/skcc/pms/bizcomponent/common/bcteamsiteform/DUTeamSiteForm.java|팀 사이트 양식을 관리하기 위한 클래스로, 해당 양식의 조회, 선택, 추가, 업로드, 중복 체크, 삭제, 다운로드, 생성 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcteamsiteform/BCTeamSiteFormController.java|웹 서비스를 위한 자바 컨트롤러로써, 팀 사이트 양식(pmTeamSiteForm)과 관련된 CRUD(Create, Read, Update, Delete) 작업 및 중복 체크, 선택된 목록 보여주기, 다운로드 관련 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bclinksetup/BCLinkSetupController.java|웹 요청에 따라 서비스를 호출하여 필요한 데이터를 처리하고 결과를 반환하는 Controller임.|
|com/skcc/pms/bizcomponent/common/bclinksetup/PULinkSetup.java|설정된 링크를 관리(조회, 업데이트, 추가, 삭제)하고, NCP 목록, 프로젝트 목록, 시스템 링크 설정 목록을 조회하는 기능을 가진 서비스임. 이 때, 각 기능 수행 후에는 처리 결과에 관한 메시지를 반환함.|
|com/skcc/pms/bizcomponent/common/bclinksetup/DULinkSetup.java|데이터 베이스에서 링크 설정에 대한 조회, 추가, 업데이트, 삭제 등의 기능을 수행하는 기능들을 가진 클래스임. 이 클래스는 DB를 관리하는 함수들과 XML 중심의 데이터 파싱, 서브 프로젝트 및 프로젝트에 대한 정보 조회 등 여러 기능들을 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcprogrammanager/DUProgramManager.java|데이터 베이스에 접속하여 프로그램 관리기능(프로그램 목록 조회, 개수 분석, 프로그램 추가, 업데이트, 삭제 등)을 수행하고, 엑셀 파일로 해당 결과를 내보내거나, 엑셀 파일을 업로드하여 데이터를 추가 및 업데이트하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/common/bcprogrammanager/BCProgramManagerController.java|프로그램 관리와 관련된 기능(추가, 수정, 삭제, 조회, 엑셀 업로드 및 다운로드 등)을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcprogrammanager/PUProgramManager.java|프로그램 정보를 조회, 추가, 수정, 삭제하는 기능과 엑셀 데이터를 다운로드하고 업로드하는 기능을 가진 비즈니스 로직 처리를 담당하는 클래스임.|
|com/skcc/pms/bizcomponent/common/bcmethodologytailoringauto/BCMethodologyTailoringAutoController.java|프로젝트목록 조회, 하위프로젝트목록 조회, WBS목록 조회, 표준 WBS목록 조회, WBS 케이스 저장, 프로젝트 상태 조회, 방법론 파일리스트 조회, 하위프로젝트 정보 조회, 엑셀 다운로드, 엑셀 업로드, 제품별 맞춤형 정보 저장 등 다양한 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcmethodologytailoringauto/DUMethodologyTailoringAuto.java|사용자가 입력한 기능에 대해 관련 데이터를 조회하고, 해당 데이터를 Excel로 내보내는 기능, 엑셀 파일 데이터를 DB에 저장하는 기능, 그리고 특정 방법론에 따라 작업을 실행하고 그 결과를 반환하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcmethodologytailoringauto/PUMethodologyTailoringAuto.java|프로젝트 관련 정보를 검색, 저장 및 업데이트하고, 엑셀 파일을 다운로드하거나 업로드하는 기능을 수행함. 이는 프로젝트 리스트, 하위 프로젝트 리스트, WBS 리스트 등 다양한 요소를 관리하고 있음.|
|com/skcc/pms/bizcomponent/common/bcapplicationcodemanager/PUApplicationcodemanager.java|데이터 라벨 조회, 추가, 삭제, 업데이트, 엑셀 파일 다운로드 및 업로드, 사용 여부 확인, 업데이트 등의 기능을 처리하는 비즈니스 로직 구현체임.|
|com/skcc/pms/bizcomponent/common/bcapplicationcodemanager/PUApplicationcodemanagerController.java|웹 요청에 따라 label 추가, 삭제, 조회, 업데이트 등의 기능을 수행하고, 엑셀 파일을 다운로드하거나 업로드하는 역할을 함. 또한 특정 항목의 사용 여부를 결정하고 업데이트하는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/common/bcapplicationcodemanager/DUApplicationcodemanager.java|싱글톤 객체로 동작하는 데이터 유닛 관리 클래스로, 주로 엑셀 파일 업로드 및 다운로드, 데이터 조회, 입력, 수정, 삭제 등의 업무를 처리하는 기능을 가지고 있음. 또한, HTML, XML 파일에 대하여 자유롭게 처리할 수 있으며, 서로 다른 국가의 언어를 지원하기 위해 한국어, 영어, 일본어, 중국어를 설정할 수 있음. 그리고 각종 문법 및 값 오류 등에 대해 검증하여 예외 상황을 처리할 수 있음.|
|com/skcc/pms/bizcomponent/common/bcdlgcode/DUDlgCode.java|주어진 XML 포맷의 데이터를 통해 데이터베이스의 코드 리스트 조회, 삭제, 업데이트, 프로젝트 설정하는 등의 기능을 수행하는 클래스임. 기능에 맞는 SQL문을 실행해 해당 작업을 처리함.|
|com/skcc/pms/bizcomponent/common/bcdlgcode/PUDlgCode.java|해당 코드는 사용자의 요청에 따라 코드 관련 목록을 조회하거나, 코드를 삭제하거나, 코드를 업데이트, 프로젝트 설정 변경에 대한 기능을 제공하고, 각기 다른 일을 처리한 결과의 응답을 반환하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcdlgcode/BCDlgCodeController.java|스프링 프레임워크를 사용하여 pmCodeList, pmCodeDel, pmCodeUpd, pmCodeAllPrjSetting, pmCodeListInq에 대한 웹 요청에 대응하는 API를 제공하는 웹 컨트롤러 구현임.|
|com/skcc/pms/bizcomponent/common/bcsprintsetting/DUSprintSetting.java|스프린트 설정을 관리하는 웹 애플리케이션의 기능으로, 스프린트의 목록 보기, 스프린트의 추가, 수정, 삭제 및 엑셀 다운로드 및 업로드 기능을 수행하고, 스프린트 별 이슈 리스트와 회고 나열 및 업데이트 기능 등을 수행함.|
|com/skcc/pms/bizcomponent/common/bcsprintsetting/BCSprintSettingController.java|스프링 프레임워크를 사용하여 스프린트(프로젝트의 작은 부분)을 관리하는 웹 애플리케이션 개발에 필요한 컨트롤러 역할을 수행함. 이 컨트롤러에서는 스프린트의 생성, 삭제, 수정, 엑셀 파일 다운로드 및 업로드, 프로젝트 일반 정보 조회 등 다양한 요청 처리 기능이 정의되어 있음.|
|com/skcc/pms/bizcomponent/common/bcsprintsetting/PUSprintSetting.java|스프링트 관리 서비스를 제공하는데, 이는 이슈 및 결함 관리 리스트, 프로젝트 기초 정보 조회, 스프링트 추가, 제거, 그리드 업데이트, 엑셀 다운로드 및 업로드, 뒤로가기 리스트, 리뷰 업데이트, 스프링트 새로 추가, 리뷰 상세값, 스프링트 관련 리뷰 삭제, 스프링트 업데이트, 스프링트 순서 리스트, 최대 스프링트 순서, 프로젝트 날짜 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bchelpmanager/BCHelpManagerController.java|웹 요청에 따라 도움말 데이터를 추가, 삭제, 수정, 조회하는 컨트롤러 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/common/bchelpmanager/PUHelpManager.java|도움말 관련 데이터를 추가, 조회, 수정, 삭제하는 기능을 제공하는 서비스 클래스임. 도움말 데이터는 트리 형태로 관리되며, 각 메서드는 요청 데이터셋과 온라인 컨텍스트를 입력으로 받아 처리 결과를 데이터셋 형태로 반환함. 각 도움말 데이터에 대한 상세 정보 조회, 리스트 조회, 레벨(depth) 조회 등의 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/common/bchelpmanager/DUHelpManager.java|도움말 관리 기능이 구현된 코드로, 도움말의 조회, 추가, 수정, 삭제, 도움말 코드 생성, 도움말 리스트 조회, 도움말의 최대 레벨 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcsystemcodemanager/DUSystemCodeManager.java|코드(ID, 이름 등) 관리를 위한 다양한 기능을 제공하는 클래스로서, 코드 업로드, 추가, 변경, 삭제, 조회 등의 기능을 포함하고 있음. 또한, 엑셀 파일로부터 코드들을 불러와 데이터베이스에 저장하거나 데이터베이스의 코드를 엑셀 파일로 다운로드할 수 있는 기능도 있음.|
|com/skcc/pms/bizcomponent/common/bcsystemcodemanager/PUSystemCodeManager.java|시스템 코드 관리를 위한 기능들을 제공하는 코드로, 새로운 시스템 코드 추가, 조회, 수정, 삭제, 엑셀 업로드, 엑셀 다운로드 등의 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcsystemcodemanager/BCSystemCodeManagerController.java|시스템 코드를 관리하는 기능을 제공하는 컨트롤러로, 엑셀 다운로드, 업로드, 코드 조회, 추가, 수정, 삭제 등의 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcmailsendlist/PUMailSendList.java|메일 발송 목록을 관리하는 클래스로, 메일 목록 조회, 메일 목록 업로드, 메일 목록 삭제, 메일 목록 업데이트 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcmailsendlist/BCMailSendListController.java|메일 전송 리스트와 관련된 업데이트, 삭제, 조회, 불러오기 등의 함수를 수행하는 스프링 프레임워크 기반의 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcmailsendlist/DUMailSendList.java|메일 전송을 위한 정보를 조회, 삭제, 수정하고, 이를 데이터베이스에 저장하는 함수들을 포함한 클래스임. 또한, 메일의 내용을 만들고, 양식을 가져오며, 이를 대기열에 추가하는 기능도 수행함. |
|com/skcc/pms/bizcomponent/common/bcbannermanager/BCBannerManagerController.java|스프링 프레임워크를 이용해 배너 상태를 삽입하고 배너 URL 목록을 조회하는 컨트롤러를 정의한 코드임.|
|com/skcc/pms/bizcomponent/common/bcbannermanager/DUBannerManager.java|배너 상태를 데이터베이스에 삽입하거나 업데이트하고, 배너 URL 목록을 조회하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/common/bcbannermanager/PUBannerManager.java|배너의 상태를 삽입하고 배너 URL 리스트를 조회하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcsysdeptmanagerlocal/PUSysDeptManagerLocal.java|부서 추가, 삭제, 목록 조회, 상세 조회, 그리드 저장, 도움말 저장 및 삭제, 프로젝트 매니저 부서 코드 업데이트, 조직 커밋, 현재 타임스 데이터로 업데이트 등의 기능을 수행하며, Excel 파일 다운로드와 업로드 기능도 지원하는 Java 클래스임.|
|com/skcc/pms/bizcomponent/common/bcsysdeptmanagerlocal/BCSysDeptManagerLocalController.java|서버 측에서 부서 관리를 위한 상호작용 로직을 처리하며, 부서 추가, 삭제, 목록 조회, 세부 사항 조회, 그리드 저장, 도움말 저장 및 삭제, 프로젝트 매니저의 부서 코드 업데이트, 조직 커밋, 현재 시간 데이터로 업데이트, 엑셀 다운로드 및 업로드 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcsysdeptmanagerlocal/DUSysDeptManagerLocal.java|조직 관리자의 기능을 수행하는 Java 클래스로, 데이터베이스에서 부서 정보를 추가, 삭제, 조회, 상세 조회, 수정하고, 조직 정보를 엑셀 파일로 다운로드하거나 업로드하는 등의 작업을 진행함. 외부 웹 사이트에서 직원 정보를 크롤링하여 부서 정보를 업데이트하는 기능도 포함됨.|
|com/skcc/pms/bizcomponent/common/bcplauthmanager/BCPLAuthManagerController.java|전체적으로 BCPL인증 매니저의 웹 요청을 처리하고 응답하는 서버 사이드 컨트롤러 기능을 담당하며, 추가(AssignSubprojectAdd, PLAuthAdd), 삭제(AssignSubprojectDel), 업데이트(AssignSubprojectGridUpd), 조회(RegisteredPgmInq, AssignSubprojectInq, SubProjectRightList, ProjectOptionList, SubProjectLeftList) 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcplauthmanager/DUPLAuthManager.java|데이터베이스에 연결하여 프로젝트 관련 정보를 조회, 추가, 수정, 삭제하는 어플리케이션 로직 처리를 담당하는 클래스임.|
|com/skcc/pms/bizcomponent/common/bcplauthmanager/PUPLAuthManager.java|주요 프로젝트 및 하위 프로젝트의 리스트를 제공하고, 프로그램에서 권한을 추가, 조회하며, 하위 프로젝트를 추가, 삭제, 업데이트하는 기능과 관련된 비즈니스 로직을 처리하는 일련의 서비스를 제공함.|
|com/skcc/pms/bizcomponent/common/bcmeetroommanager/PUMeetroomManager.java|회의실 관리와 관련된 정보를 추가, 조회, 삭제, 업데이트하는 기능을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcmeetroommanager/DUMeetroomManager.java|회의실을 관리하는 기능을 포함한 자바 클래스임. 회의실 조회, 추가, 삭제, 업데이트 기능들이 제공되며, 각 메소드는 데이터 셋을 요청 정보로 받아 처리 결과를 데이터 셋으로 반환함.|
|com/skcc/pms/bizcomponent/common/bcmeetroommanager/BCMeetroomManagerController.java|회의실을 관리하기 위한 컨트롤러로, 회의실 추가, 삭제, 업데이트, 목록 조회 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bclicensemanager/PULicenseManager.java|사용자의 요청을 받아 라이센스 히스토리 목록 조회, 라이센스 파일 다운로드, 라이센스 제거 등의 기능을 수행하는 클래스임. 대부분의 메소드는 요청 정보와 함께 실행된 후 처리 결과를 반환하며, 오류가 발생할 경우 예외를 던짐.|
|com/skcc/pms/bizcomponent/common/bclicensemanager/BCLicenseManagerController.java|라이선스 파일을 다운로드하고, 라이선스의 히스토리를 조회하며, 라이선스를 삭제하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bclicensemanager/DULicenseManager.java|라이센스 파일의 생성, 조회, 이력 관리, 삭제 등을 관리하는 기능과, 인증서를 체크하고, 암호화/복호화 처리를 지원하는 기능을 포함하고 있음. 또한, XML 스트링을 DOM 문서로 변환하거나, 두 날짜 사이의 일수를 계산하는 유틸리티 기능도 지원하고 있음.|
|com/skcc/pms/bizcomponent/common/bcdeptmanager/BCDeptManagerController.java|부서 관리를 위한 웹 컨트롤러로, 부서 조회, 추가, 수정, 삭제 기능과 부서 매니저 트리 조회, 엑셀 업로드, 다운로드 뷰를 제공함.|
|com/skcc/pms/bizcomponent/common/bcdeptmanager/DUDeptManager.java|해당 코드는 부서 관리 기능을 수행하는 JAVA Repository입니다. 트리 구조를 표현하는 부서 관계 정보 조회, 부서 조직 데이터의 엑셀 업로드와 다운로드, 부서 정보 생성 및 업데이트, 삭제 기능을 담당하고 있습니다. 기능별로 데이터를 DB에서 조회하거나 갱신하는 작업을 수행합니다.|
|com/skcc/pms/bizcomponent/common/bcdeptmanager/PUDeptManager.java|조직 트리 정보를 조회하고, 조직 정보 엑셀 업로드 및 다운로드를 제공하며, 개별 조직에 대한 상세 정보를 조회하고, 추가, 수정, 삭제 처리를 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcmailgroupusermanagement/BCMailGroupUserManagementController.java|메일 그룹 사용자 관리의 조회, 업데이트, 삽입, 엑셀 파일 다운로드 및 업로드 등의 기능을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcmailgroupusermanagement/PUMailGroupUserManagement.java|메일 그룹 사용자 관리를 위한 서비스를 제공하며, 사용자 조회(pmMailGroupUserInq), 수정(pmMailGroupUserUpd), 추가(pmMailGroupUserIns), 엑셀 다운로드(pmMailGroupUserExcelDwon), 엑셀 업로드(pmMailGroupUserExcelUpload) 등의 기능이 있음.|
|com/skcc/pms/bizcomponent/common/bcmailgroupusermanagement/DUMailGroupUserManagement.java|메일 그룹 사용자를 관리하는 기능을 담당하는 코드로, 주로 조회, 업데이트, 추가, 엑셀다운로드, 엑셀업로드 등의 작업을 처리함. 사전에 설정된 데이터베이스에서 메일 그룹 사용자 관련 정보를 불러오는 역할을 수행하며, 사용자의 요청에 따라서 특정 메일 그룹 사용자의 정보를 수정하거나 삭제하는 기능도 담당함. 또한 엑셀 파일로 메일 그룹 사용자를 일괄 업로드하거나 다운로드 받을 수 있도록 관련 함수를 제공함.|
|com/skcc/pms/bizcomponent/common/bcalarmconfigmanager/BCAlarmConfigMangerController.java|알람 설정에 관련된 다양한 기능을 제공하는 REST API 컨트롤러 서비스임. 이 기능에는 알람 기간 업데이트, 알람 기간 조회, 유닛 별 알람 설정 여부 조회, 알람 설정 업데이트, 알람 설정 조회, 유닛 별 알람 설정 상세 조회 등이 포함되어있음.|
|com/skcc/pms/bizcomponent/common/bcalarmconfigmanager/PUAlarmConfigManager.java|알람 설정에 관련된 조회, 수정 등의 기능을 제공하는 서비스임. 데이터 요청에 따라 각각의 알람 설정을 조회하거나 업데이트하고 결과를 반환함. 여기에는 단위별 알람 설정 조회, 알람 주기 선택 및 업데이트 등의 메소드가 포함되어 있음. 모든 메소드는 요청 데이터와 온라인 컨텍스트를 인자로 받아 처리 결과를 리턴함.|
|com/skcc/pms/bizcomponent/common/bcalarmconfigmanager/DUAlarmConfigManager.java|알람 설정을 관리하는 코드로, 알람 설정 정보를 조회하거나 업데이트하는 함수들을 포함하고 있으며, 그들은 알람 유형이나 주기, 알람에 관련된 메뉴 등의 정보를 처리함. 또한, XML 데이터 처리를 위한 도우미 함수들도 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcquick/PUQuickController.java|웹 요청을 처리하여 'pulistinq' 서비스를 호출하고 그 결과를 반환하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcquick/PUQuick.java|요청된 데이터를 받아 데이터 검색 작업을 수행하고, 그 결과를 반환하는 기능을 가지고 있음. 동시에 검색 작업 중 발생하는 예외 상황도 처리함.|
|com/skcc/pms/bizcomponent/common/bcquick/DUQuick.java|데이터베이스에서 정보를 조회하여 결과를 반환하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/common/bcfilemanager/DUFileManager.java|요청 정보를 받아 파일의 조회, 추가, 수정, 삭제, 도움말 코드 생성, 파일 목록 조회, 최대 레벨 조회 등의 여러 가지 기능을 수행하는 파일 관리 클래스임.|
|com/skcc/pms/bizcomponent/common/bcfilemanager/PUFileManager.java|파일 생성, 삭제, 수정, 상세 조회 및 목록 조회 같은 기본적인 파일 관리 기능을 제공하는 비즈니스 컴포넌트임.|
|com/skcc/pms/bizcomponent/common/bcnoticemanager/PUNoticeManager.java|사용자의 요청 정보를 이용해 알림을 보내거나, 알림 목록, 상세 내용, 수신자 목록을 조회하고, 파일 등에 대한 작업(조회, 삭제 등)을 진행하는 다양한 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcnoticemanager/DUNoticeManager.java|알림 메시지를 관리하는 기능 구현으로, 받은 알림과 보낸 알림의 조회, 삭제, 업데이트 등을 담당하고 있으며, 파일 첨부 관리, 팝업 알림 처리, 알림 타입 조회, 알림 상태 업데이트 등 다양한 알림 관련 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcnoticemanager/BCNoticeManagerController.java|공지 관련 정보를 조회하고, 삭제하며, 상태를 업데이트하는 웹 서비스를 제공하는 자바 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcmeetroomreservmanager/PUMeetroomReservManager.java|회의실 예약 관리를 위한 기능을 수행하는 코드로, 회의실 예약 등록, 수정, 삭제, 상세조회, 파일 다운로드 등 다양한 기능을 제공함. 또한, 참석자 목록 조회, 안내 메시지 발송, 리소스 목록 조회 등의 추가 기능도 지원함.|
|com/skcc/pms/bizcomponent/common/bcmeetroomreservmanager/BCMeetroomReservManagerController.java|회의실 예약 관리를 위한 여러 기능이 구현되어 있음. 예약된 회의 목록 조회, 예약 시간 설정, 사용자 정보 조회, 회의실 예약 추가/삭제/업데이트, 회의실 정보 조회, 층별 회의실 예약 목록 조회, 회의실 예약 상세 정보 조회, 파일 리스트 조회, 파일 다운로드 및 삭제, 참석자 및 참석 그룹 목록 조회 등의 기능이 있음.|
|com/skcc/pms/bizcomponent/common/bcmeetroomreservmanager/DUMeetroomReservManager.java|이 코드는 "BCMeetroomReservManager"라는 패키지에 포함된 클래스 파일로서, 회의실 예약 시스템을 관리하는 기능을 수행한다. 주요 기능으로는 회의실 예약 추가, 수정, 삭제, 조회 등을 O&M 기반에 따라 처리하며, 예약 내역과 연계된 파일 관리 기능도 포함되어 있다. 또한 이 예약 시스템은 반복 예약 및 회의실 예약과 팀 사이트 일정 관리 시스템 간의 연동 기능도 지원한다.|
|com/skcc/pms/bizcomponent/common/bcprojectmove/BCProjectMoveController.java|사용자가 웹 포털에서 프로젝트를 이동시키면, 해당 사용자의 마지막으로 사용한 프로젝트 정보를 업데이트하며, 이 과정에서 오류가 발생하면 '서버와 연결할 수 없음'이라는 메시지가 출력되는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcprojectmove/DUProjectMove.java|프로젝트 이동을 관리하는 자바 클래스로, 사용자의 최근 프로젝트를 변경하고, 세션에 현재 프로젝트를 변경하며, 프로젝트에 등록된 성명으로 세션을 변경하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcprojectmove/PUProjectMove.java|사용자의 호스트에 따른 서비스 번호를 분배하고 프로젝트를 이동하는 기능 및 메뉴 권한을 설정하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcfunctionalscorestatement/PUFunctionalScoreStatement.java|사용자 리스트 조회, 사용자 추가, 수정, 삭제 및 복원, 엑셀 데이터 다운로드 및 업로드, 시스템 조회, 넘버링 추가 및 삭제 등의 기능을 수행하는 데 사용되는 여러 메소드들을 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcfunctionalscorestatement/DUFunctionalScoreStatement.java|엑셀 파일을 통한 기능점수 입력, 수정, 삭제 등을 지원하는 시스템에 대한 자바 코드임. 또한 해당 시스템 데이터를 엑셀 파일로 내려받는 기능도 제공하고 있으며, 엑셀 템플릿 체크 로직을 사용해 엑셀 데이터의 유효성을 검사합니다. 대/중/소 분류, 입력/수정/삭제 데이터 등을 처리하고 있습니다.  |
|com/skcc/pms/bizcomponent/common/bcfunctionalscorestatement/BCFunctionalScoreStatementController.java|사용자 정보를 관리하고, 엑셀 데이터 업로드/다운로드, 프로젝트 정보 조회, 이력 가져오기, 시스템 조회, 번호링 추가/삭제 등의 기능을 담당하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcsystembasisfeeinfo/PUSystemBasisFeeInfo.java|기준 요금 정보를 관리하고 그에 따른 업데이트, 삭제, 추가, 엑셀 업로드 및 다운로드 등의 기능을 수행하는 서비스임. 이 부분은 데이터베이스와 통신하여 정보를 주고 받음.|
|com/skcc/pms/bizcomponent/common/bcsystembasisfeeinfo/DUSystemBasisFeeInfo.java|해당 코드는 데이터 조회, 업데이트, 삭제, 엑셀 업로드 및 다운로드 등 다양한 데이터 관리 작업을 수행하는 'DUSystemBasisFeeInfo' 라는 클래스를 구현한 것이다. 특히, 데이터를 엑셀 파일로 업로드하고 다운로드하는 기능을 제공한다.|
|com/skcc/pms/bizcomponent/common/bcsystembasisfeeinfo/BCSystemBasisFeeInfoController.java|웹의 요청을 처리하는 컨트롤러로, 엑셀 업로드, 업데이트, 삭제, 목록조회, 선택항목 조회, 데이터 추가, 엑셀 다운로드 등 기본비용 정보 관련 다양한 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcmailformmanager/PUMailFormManager.java|이메일 양식 처리에 대해 수행하는 여러 기능들을 포함하고 있으며, 각 메서드는 폼을 추가, 폼목록 조회, 첨부파일 조회, 폼항목 저장, 폼항목 조회 등을 담당하고 있음. 각 메서드에서는 입력 데이터 검증, DB 액션 진행, 예외 처리 등을 수행하며, 각 액션의 결과를 데이터 세트 형태로 반환함. 이 클래스는 서비스 레이어 위에 위치해 있으며, 데이터의 상태를 변경하거나 DB 작업을 수행하는 DU 클래스를 호출함.|
|com/skcc/pms/bizcomponent/common/bcmailformmanager/DUMailFormManager.java|메일 양식을 관리하는 기능을 가진 클래스로, 특정 메일 양식의 추가, 수정, 조회, 삭제, 첨부파일 관리, XML 스트링을 활용한 DOM Document 생성 등의 작업을 수행함. 또한 사용자 정보를 기반으로 폼 항목의 정보를 저장하거나 조회하는 기능도 있음.|
|com/skcc/pms/bizcomponent/common/bcmailformmanager/BCMailFormManagerController.java|메일 폼 관리를 위한 컨트롤러로, 폼 리스트 조회, 폼 추가, 폼 항목 조회, 폼 항목 저장, 폼 첨부파일 조회, 폼 항목 삭제, 새로운 폼을 위한 키 생성 등의 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/common/bcteamsiteuserauth/BCTeamsiteUserAuthController.java|팀사이트 사용자의 인증과 관련된 여러 API를 제공하는 스프링 컨트롤러임. 이 컨트롤러를 통해 사용자 인증 추가, 조회, 업데이트, 체크 조회 등의 기능을 수행 가능함.|
|com/skcc/pms/bizcomponent/common/bcteamsiteuserauth/DUTeamsiteUserAuth.java|사용자 인증 정보를 처리하기 위한 기능이 포함된 클래스임. 사용자 인증 정보 조회, 추가, 업데이트, 삭제 등의 기능을 수행하며, 각 기능은 DB 쿼리와 웹 데이터로 작동함. 특히 복잡한 XML 데이터 파싱 및 변환 기능이 포함되어 있으며, 이를 통해 데이터 베이스에 정보를 입력하거나 업데이트함.|
|com/skcc/pms/bizcomponent/common/bcteamsiteuserauth/PUTeamsiteUserAuth.java|사용자 인증 관련 데이터를 조회, 추가, 수정하는 여러 메서드들을 포함하고 있는 서비스 클래스임.|
|com/skcc/pms/bizcomponent/common/sharedmenumanager/SharedMenuAuth.java|사용자의 권한과 프로젝트 상태에 따라 시스템 메뉴를 설정하고, 이에 따라 사용자 인터페이스를 조정하는 자바 코드임. 사용자의 로그인, 프로젝트의 상태, 팀 사이트 설정 등에 관련된 메소드들로 구성되어 있음.|
|com/skcc/pms/bizcomponent/common/bcsystemdegreemanager/PUSystemDegreeManager.java|프로젝트와 관련된 그룹 코드 정보를 추가, 조회, 업데이트, 삭제하는 기능을 수행하고, 각각의 작업 결과를 DataSet 객체 형태로 반환하며, 엑셀 파일을 업로드하여 그룹 코드 정보를 업데이트하거나 엑셀 파일을 다운로드하는 기능도 수행함. 또한, 프로젝트 복사 기능도 제공하고 있음.|
|com/skcc/pms/bizcomponent/common/bcsystemdegreemanager/BCSystemDegreeManagerController.java|시스템 차수 관련 데이터를 관리하기 위한 항목추가, 업로드, 삭제, 업데이트, 조회 등의 기능을 수행하며, 엑셀파일 업로드 및 다운로드 기능까지 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcsystemdegreemanager/DUSystemDegreeManager.java|본 코드는 비즈니스 컴포넌트 시스템 관리를 위한 다양한 기능을 수행하며, 기능들은 주석으로 설명되어 있음. 기능에는 엑셀의 업로드 및 다운로드, 데이터 관리 및 삭제, 코드 리스트 조회, 코드 추가 및 업데이트, 시스템 관리에 필요한 코드 조회 등이 포함됨.|
|com/skcc/pms/bizcomponent/common/bcprojectform/PUProjectForm.java|프로젝트 파일의 업로드, 다운로드, 생성, 검색, 삭제 등에 대한 다양한 기능을 제공하는 클래스임. 해당 기능들은 주로 프로젝트 관리 목적으로 사용되며, 파일은 DB에 저장되고 압축 및 압축 해제 기능도 제공함.|
|com/skcc/pms/bizcomponent/common/bcprojectform/DUProjectForm.java|프로젝트 형식 관련 파일 관리, 데이터 조회, 등록, 삭제 등의 기능을 수행하는 Java 클래스임. 특정 형식의 프로젝트를 관리하거나, 데이터를 데이터베이스에 추가, 조회, 삭제하거나, 프로젝트를 업로드, 다운로드하거나, 프로젝트를 생성하거나, 중복 체크하거나 특정 테이블을 다운로드, 업로드, 삭제한 후 폐기하는 등 여러 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcprojectform/BCProjectFormController.java|프로젝트 형식 데이터를 업로드, 삭제, 검색, 추가, 생성, 중복확인 등의 기능을 수행하며, 다운로드 뷰를 제공하여 파일을 다운로드 받을 수 있는 기능도 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcsysdeptmanager/BCSysDeptManagerController.java|프로젝트 관리 시스템의 부서 정보를 관리하기 위한 여러 기능을 제공하는 컨트롤러임. 부서 추가, 삭제, 목록조회, 세부 정보 조회, 그리드 정보 저장, 도움말 저장 및 삭제, 프로젝트 관리자의 부서 코드 업데이트, 조직 백업 및 커밋, 현재 시간 데이터 업데이트, 포털로 현재 시간 데이터 업데이트, 엑셀 파일 다운로드 및 업로드, 포털을 위한 현재 부서 데이터 조회 등의 API를 제공함.|
|com/skcc/pms/bizcomponent/common/bcsysdeptmanager/DUSysDeptManager.java|조직 관리 시스템을 위한 코드로서 데이터베이스와 연결하여 조직 추가, 삭제, 조회, 업데이트 등의 기능을 제공하며, 엑셀 업로드 및 다운로드, 조직 관련 정보를 HTML로 제공하는 등의 기능이 있다. 해당 시스템은 조직 템플릿 체크, 데이터 싱크, 현재 상태를 기준으로 데이터 업데이트 등의 세부 기능도 포함되어 있다.|
|com/skcc/pms/bizcomponent/common/bcsysdeptmanager/PUSysDeptManager.java|부서 관련 데이터의 추가, 삭제, 조회, 상세 조회, 그리드 저장, 헬프 메시지 저장/삭제, 프로젝트 매니저 부서 코드 업데이트, 조직 백업 및 커밋, 데이터 시간 현재화 및 포털 업데이트, 엑셀 다운로드/업로드 등 다양한 기능을 수행하는 부서 관리 서비스임.|
|com/skcc/pms/bizcomponent/common/bcprojectaddtionalinfo/PUProjectAdditionalInfo.java|프로젝트 관련 정보들을 조회, 수정, 추가하는 기능과 함께, 특정 정보를 엑셀 파일로 업로드하고 다운로드 받을 수 있는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/common/bcprojectaddtionalinfo/BCProjectAdditionalInfoController.java|프로젝트의 추가 정보를 관리하는 컨트롤러로서, 프로젝트 리스트 조회, 개별 프로젝트 조회, 프로젝트 추가 정보 조회, 프로젝트 업데이트, 엑셀 파일 업로드, 엑셀 파일 다운로드, 레벨 리스트 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcprojectaddtionalinfo/DUProjectAdditionalInfo.java|프로젝트 추가 정보 처리를 위한 기능들을 제공하는 클래스로, 특정 프로젝트와 서브 프로젝트의 조회, 업데이트, Excel 파일 업로드 및 다운로드 등의 기능을 수행함. 프로젝트 및 서브프로젝트의 리스트 조회, 특정 프로젝트의 상세 정보 조회, 프로젝트의 추가 정보 조회, 레벨 리스트 조회, 특정 프로젝트 정보의 업데이트 등의 메소드가 있음. 또한, Excel 파일을 통해 데이터를 업로드하거나 다운로드 받을 수 있는 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/common/bcsitepgmmappingretrieve/DUSitePgmMappingRetrieve.java|다국어 지원하는 웹 페이지의 메뉴를 관리하고, 새로운 메뉴를 추가, 삭제, 조회하며, 엑셀 파일로 메뉴 정보를 다운로드하고 업로드하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcsitepgmmappingretrieve/BCSitePgmMappingRetrieveController.java|웹 요청에 따라 데이터 매핑 작업을 수행하고, 엑셀 파일을 다운로드하거나 업로드하는 기능을 제공하는 컨트롤러임. 동시에 라벨 조회, 추가, 삭제도 처리함.|
|com/skcc/pms/bizcomponent/common/bcsitepgmmappingretrieve/PUSitePgmMappingRetrieve.java|사용자의 요청에 따라 레이블 조회, 추가, 삭제 기능을 제공하며 엑셀 파일의 다운로드와 업로드 기능, 레이블 조회 및 추가를 위한 매핑 기능을 지원하는 프로그램임.|
|com/skcc/pms/bizcomponent/common/bclicensemanager2/BCLicenseManager2Controller.java|라이선스 파일을 다운로드하고, 라이선스의 생성, 불러오기, 삭제, 사용자 선택 등의 기능을 제공하고, 프로젝트별, IP별, 라이선스 이력 조회 등의 라이선스 정보 조회 기능을 제공하는 웹 서버 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bclicensemanager2/DULicenseManager2.java|고객, IP, 프로젝트 정보를 등록, 수정, 삭제하고, 라이선스를 생성, 조회, 삭제하는 기능을 가진 클래스임. 라이선스 생성 시에는 암호화 기법을 이용하며, 특정 서버에서만 라이선스를 발급할 수 있도록 제한함. 또한 엑셀 파일을 다운로드 할 수 있는 기능도 있음.|
|com/skcc/pms/bizcomponent/common/bclicensemanager2/PULicenseManager2.java|라이선스 관리와 관련된 기능을 제공하는 클래스로, 라이선스 생성, 라이선스 이력 조회, 사용자 선택에 대한 라이선스 조회, 라이선스 파일 다운로드, 라이선스 삭제, 라이선스 가져오기 등의 메소드를 포함하고 있음.|
|com/skcc/pms/bizcomponent/common/bcsystemstatistics/PUSystemStatistics.java|시스템 통계 정보 조회를 위해 리스트 정보, 탭 정보, 칼럼 정보를 가져오는 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcsystemstatistics/DUSystemStatistics.java|이 코드는 데이터베이스의 정보를 조회하거나 수정하는 데 필요한 기능을 제공하며, 특히 시스템 통계 정보를 처리할 수 있도록 설계된 Java 클래스임.|
|com/skcc/pms/bizcomponent/common/bcsystemstatistics/BCSystemStatisticsController.java|웹 요청에 따라 시스템 통계 정보를 반환하는 컨트롤러임. 각각의 요청마다 목록, 탭 정보, 컬럼 정보를 제공함.|
|com/skcc/pms/bizcomponent/common/bcoperationmanager/DUOperationManager.java|다수의 메서드를 포함하는 관리자 설정 클래스로, 로그인 세션 관리, 서브그룹 사용 여부, 대시보드 필드의 사용 여부, IP 설정 등 다양한 관리자 설정에 대한 정보를 읽고 저장하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/common/bcoperationmanager/BCOperationManagerController.java|주요 기능으로는 메신저 알람 설정, SVN 설정 및 테스트 연결, 프로젝트 일주일 설정 저장/업데이트, 대시보드 필드 사용 여부 선택/업데이트, 개인 정보 관리 등을 웹에서 요청을 받아 처리하고 데이터를 반환하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcoperationmanager/PUOperationManager.java|SVN 설정 업데이트, 조회, 테스트 커넥션, 대시보드, 프로젝트 설정, IP 설정 등의 여러 관리 기능을 수행하며, 발생하는 예외 상황에 대한 로깅 처리도 포함하는 Spring 부트 서비스 클래스임.|
|com/skcc/pms/bizcomponent/common/bcmywork/PUMyWork.java|프로그램 목록 조회, 프로그램 추가, 프로그램 조회, 프로그램 업데이트, 프로그램 삭제 기능과, 엑셀 데이터 다운로드 및 엑셀 데이터 업로드 기능을 제공하는 클래스임.|
|com/skcc/pms/bizcomponent/common/bcmywork/DUMyWork.java|프로그램 정보를 관리하는 데이터베이스 작업을 수행하는 다양한 기능을 제공하는 클래스임. 프로그램의 목록 조회, 개수 조회, 추가, 업데이트, 삭제 그리고 엑셀 파일로 데이터 다운로드 및 업로드 등의 기능 포함.|
|com/skcc/pms/bizcomponent/common/bcmywork/BCMyWorkController.java|프로그램에 대한 추가, 삭제, 조회, 업데이트 기능을 제공하며, 프로그램 목록 조회 및 엑셀 데이터의 전체 다운로드 및 업로드 기능을 가진 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/sharedipcheck/FUIPCheck.java|사용자의 IP 주소를 확인하여 특정 IP 범위 내에 있는지 확인하고, IP가 허용된 범위 내에 있는지 확인하여 파일 업로드 및 다운로드 제한 여부를 판단하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/sharedipcheck/BCSharedIPCheckController.java|웹 리퀘스트를 통해 들어온 IP 체크 요청을 처리하고 결과를 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/sharedipcheck/DUIPCheck.java|요청된 데이터셋과 요청 정보를 받아, IP 차단 파일, 업로드 차단 파일, 다운로드 차단 파일을 조회하여 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/common/bcifprojectsitemanager/PUIFProjectSiteManager.java|프로젝트 사이트 관리를 위한 서비스를 제공하며, 기능으로는 프로젝트 및 코드 그룹 추가, 수정, 조회, 삭제 기능과 엑셀 파일 업로드 및 다운로드 기능 등이 있음.|
|com/skcc/pms/bizcomponent/common/bcifprojectsitemanager/DUIFProjectSiteManager.java|데이터 유닛을 관리하고 검증하는 기능을 가진 API 새트임. 엑셀파일로 부터 정보를 받아 데이터 유닛 조작(업데이트, 삭제, 추가)을 하며, 필요한 검증(정규표현식 체크, 중복체크 등)과 에러처리도 수행함. 또한, 데이터 유닛에 대한 검색 기능도 제공함.|
|com/skcc/pms/bizcomponent/common/bcifprojectsitemanager/BCIFProjectSiteManagerController.java|프로젝트 관리 사이트에서 시스템 코드의 조회, 업로드, 다운로드, 추가, 수정, 삭제 등을 처리하는 API를 제공하는 Spring Controller임.|
|com/skcc/pms/bizcomponent/common/bcbacklogreg/DUBacklogReg.java|코드는 소프트웨어의 요구사항 관리, 결함 관리, 요구사항 유효성 검사, 스프린트 관리 등에 대한 다양한 역할에 대한 데이터베이스 조회, 삽입, 업데이트, 삭제 등의 데이터베이스 관련 기능을 제공하고 있다.|
|com/skcc/pms/bizcomponent/common/bcbacklogreg/BCBacklogRegController.java|웹사이트의 이슈 및 결함 관리, 스프린트 조회, 엑셀 파일 다운로드 및 업로드, 프로젝트 관리 등의 기능을 컨트롤하는 역할을 가진 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcbacklogreg/PUBacklogReg.java|이 코드는 요청된 데이터를 기반으로 데이터베이스와 상호작용하며 여러 기능을 수행하는 것을 담당하는 서비스 클래스임. 주요 기능들로는 레코드셋을 관리하고, 에러를 처리하며, 이미지를 조회하고, 엑셀 파일을 다운로드 및 업로드하고, 대량의 데이터 수집 및 관리를 위한 그리드를 수정하는 등 다양한 업무를 처리함.|
|com/skcc/pms/bizcomponent/common/bctailoringchgdelreason/PUTailoringChgDelReason.java|서브프로젝트 리스트 조회, WBS 조회, 엑셀 다운로드, 테일러링 업데이트/삽입/삭제, 상품 그리드 업데이트/삭제, 레벨 리스트 조회 등의 작업을 수행하는 서비스 로직이 구현되어 있음.|
|com/skcc/pms/bizcomponent/common/bctailoringchgdelreason/BCTailoringChgDelReasonController.java|서브 프로젝트 리스트 조회, WBS 조회, 엑셀 다운로드, 테일러링 업데이트, 테일러링 인서트, 테일러링 삭제, 제품 그리드 업데이트, 제품 그리드 삭제, 레벨 리스트 조회 등의 CRUD 작업을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bctailoringchgdelreason/DUTailoringChgDelReason.java|프로젝트의 관리를 위해 필요한 몇 가지 DB를 호출하고 데이타를 처리하는 메소드를 제공하는 클래스임. 주요 기능으로는 프로젝트 리스트 조회, 프로젝트 워크브레이크다운(WBS) 조회, 레벨별 리스트 조회, DB 업데이트, DB 입력, DB 삭제 등을 포함하며 이를 이용해 프로젝트의 레벨 및 세부 사항을 조정하고, 프로젝트 상태를 업데이트함. 게다가 엑셀로 데이터를 다운로드받거나 엑셀 데이터를 처리하는 기능도 가능함.|
|com/skcc/pms/bizcomponent/common/bclabelmanager/DULabelManager.java|라벨 관리자 클래스로, 라벨을 조회, 추가, 삭제하는 기능과 라벨을 엑셀 파일로 다운로드하거나 엑셀 파일로부터 업로드하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/common/bclabelmanager/BCLabelManagerController.java|사용자 요청에 따라 라벨 관리 기능을 제공하는 웹 API 컨트롤러로, 라벨 추가, 삭제, 조회, 엑셀 파일 업로드 및 다운로드 기능을 구현하고 있음.|
|com/skcc/pms/bizcomponent/common/bclabelmanager/PULabelManager.java|레이블 조회, 추가, 삭제와 엑셀 파일의 다운로드 및 업로드와 관련된 기능을 처리하는 서비스임. 각 메소드를 통해 요청된 데이터를 처리하고, 해당 결과를 반환함.|
|com/skcc/pms/bizcomponent/common/bcgroupmanager/BCGroupRoleManagerController.java|그룹과 역할을 관리하는 기능 및 엑셀 다운로드, 업로드, 프로젝트 복사 등을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcgroupmanager/BCGroupManagerController.java|사용자 그룹에 관련된 조회, 추가, 삭제, 업데이트 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/common/bcgroupmanager/PUGroupManager.java|그룹 관리를 위한 여러 기능을 제공하는 클래스로, 그룹 추가(pmGroupAdd), 삭제(pmGroupDel), 조회(pmGroupInq), 업데이트(pmGroupUpd), 그리고 리스트 조회(pmGroupInqList) 기능을 포함하고 있음. 이 모든 메서드들은 그룹에 관한 정보들을 매개변수로 받아 해당 기능을 수행하고 결과를 반환함.|
|com/skcc/pms/bizcomponent/common/bcgroupmanager/PUGroupRoleManager.java|Spring Framework 기반으로 그룹 및 역할을 관리할 수 있고, 엑셀 파일을 업로드 하여 정보를 등록하거나 다운로드할 수 있는 기능뿐만 아니라, 프로젝트 데이터를 복사하는 기능 등을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/common/bcgroupmanager/DUGroupRoleManager.java|해당 코드는 사용자의 권한 관리에 대한 기능을 수행하는 클래스로, 사용자의 시스템에 대한 접근 권한 관리, 엑셀 업로드 및 다운로드, 그룹화된 권한 제어 등의 기능이 구현되어 있음. 이 코드가 동작하는 동안 사용자의 기능나 시스템 접근 권한에 대한 정보를 수집, 수정하고, 저장하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/common/bcgroupmanager/DUGroupManager.java|프로젝트 그룹을 생성, 수정, 삭제, 조회하는 기능과 그룹 목록, 그룹 메뉴 복사, 그룹 메뉴 삭제, 그룹 시퀀스 조회 등의 기능을 수행하는 코드임.|
|com/skcc/pms/bizcomponent/common/bcmenumanager/PUMenuProjectManager.java|데이터셋 객체를 이용해 메뉴 프로젝트의 조회 및 수정 처리를 수행함.|
|com/skcc/pms/bizcomponent/common/bcmenumanager/BCMenuProjectManagerController.java|웹 서비스로서 pmMenuProjectUpd와 pmMenuProjectInqList 두 가지 기능을 제공하는 컨트롤러임. pmMenuProjectUpd는 특정 프로젝트 메뉴를 업데이트하고, pmMenuProjectInqList는 프로젝트 메뉴 목록을 조회하는 기능을 가짐.|
|com/skcc/pms/bizcomponent/common/bcmenumanager/DUMenuManager.java|사용자의 요청에 따라 메뉴 추가, 삭제, 수정 및 조회 등을 수행하는 Java 코드임. 이를 통해 상위 메뉴와 하위 메뉴의 관리가 가능하며, 권한에 따른 메뉴 접근 권한 메소드를 가지고 있음. 또한, 메뉴의 이름이나 사용 가능 여부 등을 프로젝트에 일괄적용하는 기능 및 가이드 노트에 대한 조회 및 수정 기능도 제공함.|
|com/skcc/pms/bizcomponent/common/bcmenumanager/PUMenuManager.java|이 코드는 스프링 기반의 JAVA 어플리케이션에서 메뉴를 관리하는 기능을 구현하고 있음. 여기에는 메뉴 추가, 삭제, 조회, 수정 등의 기능이 포함되며, 각 메서드는 요청 정보를 받아 메뉴를 관리하고 그 결과를 반환하는 역할을 수행함. 또한 프로젝트 전체 복사, 가이드 노트 조회 및 설정 등의 기능도 포함되어 있음. 모든 메서드는 비즈니스 예외를 처리하며, 상세한 로깅과 함께 이를 배포함. |
|com/skcc/pms/bizcomponent/common/bcmenumanager/DUMenuProjectManager.java|사용자의 요청에 따라 메뉴 조회와 메뉴 수정 기능을 수행하며, DB 연결을 통해 데이터 조회와 조작을 진행해주는 클래스임. 각 메뉴 간의 관계는 트리구조로 나타나며, 이를 XML 포맷으로 변환하여 구현하였음.|
|com/skcc/pms/bizcomponent/common/bcmenumanager/BCMenuManagerController.java|서버의 메뉴 관리를 담당하는 컨트롤러로, 메뉴를 조회, 업데이트, 삭제, 추가하는 기능과 상단 메뉴 조회, 왼쪽 메뉴 조회, 프로젝트 전체 복사, 가이드 노트를 가져오거나 설정하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/vacation/bcvacation/DUVacationPlan.java|데이터베이스에 있는 휴가 계획 정보를 조회, 생성, 수정, 삭제, 엑셀 다운로드 등의 업무를 처리하는 역할을 함.|
|com/skcc/pms/bizcomponent/vacation/bcvacation/BCVacationPlanController.java|사용자의 휴가 계획을 관리하는 웹 애플리케이션 컨트롤러로, 휴가 계획의 Excel 업로드, 파일 목록 조회, 사용 여부 설정, 파일 다운로드, 계획 수정, 추가, 조회, 삭제 등 다양한 기능 수행 가능임. 데이터셋과 온라인 컨텍스트를 인자로 받아 처리하며, 파일 다운로드 관련 메소드에서는 다운로드 뷰를 반환함.|
|com/skcc/pms/bizcomponent/vacation/bcvacation/PUVacationPlan.java|사용자의 요청에 따라 휴가 계획과 관련된 데이터의 조회, 추가, 업데이트, 삭제 등을 수행하고, 요구사항 범위에 관한 정보를 엑셀 파일로 다운로드하거나 업로드할 수 있도록 하는 기능을 제공함. 또한 진행률 조회, 테스트 실행 배치, 중복 체크 등 추가적인 기능도 지원함.|
|com/skcc/pms/bizcomponent/kanban/dto/KanbanDaoType.java|KanbanDaoType 클래스는 프로젝트번호, 유형 이름, 유형 설명, 비고, 사용할 Workflow번호 등을 포함하는 Kanban 카드에 대한 정보를 관리하고, 각 속성의 getter 및 setter 메소드를 통해 해당 정보에 접근 혹은 수정할 수 있음.|
|com/skcc/pms/bizcomponent/kanban/stateSys/PUStateSys.java|상태(State)를 관리하기 위한 기능들을 제공하는 서비스로, 주요 기능으로는 상태 제출, 상태 삭제, 상태목록 조회, 카테고리명 조회, 최대 상태값 조회, 상태의 총 개수 조회, 상태 상세목록 조회, 상태 상세 개수 조회, 이슈 목록 조회 등이 존재함. 각 기능은 필요에 따라 예외 처리를 포함함.|
|com/skcc/pms/bizcomponent/kanban/stateSys/BCStateSys.java|칸반 시스템에서 상태제출, 상태삭제, 상태 리스트 확인, 카테고리 이름 리스트 확인, 최대 상태, 상태 개수, 상태 상세 리스트, 상태 상세 개수, 이슈 리스트 등을 관리하는 컨트롤러 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/kanban/stateSys/DUStateSys.java|XML 문자열을 파싱하여 프로젝트의 상태를 관리하는 데이터를 데이터베이스에 제출, 삭제, 조회하는 기능을 수행함. 상세하게는, 각 프로젝트의 상태를 제출, 변경, 삭제하고 XML에서 원하는 데이터를 추출하여 데이터베이스에서 해당 정보를 조회할 수 있음. 추가적으로 캔반 상태 리스트, 카테고리명 리스트, 상태 최대값, 상태 개수, 상세 상태 리스트, 상태 디테일 개수, 이슈 리스트에 대한 정보를 데이터베이스에서 조회할 수 있는 기능도 제공함.|
|com/skcc/pms/bizcomponent/kanban/categorySys/BCCategorySys.java|카테고리 시스템에 관한 웹 요청을 처리하여 카테고리의 제출, 삭제, 목록 확인, 최대치 확인, 추가 목록 확인 기능을 제공함.|
|com/skcc/pms/bizcomponent/kanban/categorySys/PUCategorySys.java|칸반 시스템의 카테고리를 관리하는 기능을 수행하며, 카테고리의 제출, 삭제, 리스트 조회, 최대값 조회, 추가 리스트 조회 기능을 제공함.|
|com/skcc/pms/bizcomponent/kanban/categorySys/DUCategorySys.java|칸반 시스템에서 카테고리와 관련된 기능(카테고리 추가, 삭제, 목록 보기 등)을 제공하며, UI로부터 요청을 받아 데이터를 처리하는 역할 수행함.|
|com/skcc/pms/bizcomponent/kanban/category/BCCategory.java|칸반 보드의 카테고리에 관한 요청을 처리하여 카테고리 추가, 삭제, 업데이트, 리스트 조회, 최대 카테고리 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/kanban/category/DUCategory.java|XML 형식의 데이터를 받아서 범주(category)를 생성, 수정, 삭제하거나 범주 목록과 관련된 데이터를 얻는 기능을 수행함. 또한, 프로젝트 및 하위 프로젝트의 정보에 대해 데이터베이스와 상호작용하고, 오류가 발생할 경우 로깅하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/kanban/category/PUCategory.java|칸반 시스템의 카테고리 관련 기능(제출, 삭제, 목록 조회, 최대값 조회, 목록 추가)을 제공하며, 각 기능 실행 중 예외가 발생한 경우 로그를 생성하고 예외를 다시 던짐.|
|com/skcc/pms/bizcomponent/kanban/board/PUBacklogBoard.java|스프링 프레임워크를 이용해 구현된 "PUBacklogBoard" 라는 서비스 클래스로, 다양한 메소드를 통해 요청된 데이터 셋을 처리하고 결과를 반환하는 기능이 있음.|
|com/skcc/pms/bizcomponent/kanban/board/DUBacklogBoard.java|일감 목록을 조회하고, 일감유형을 조회해 카운트하며, 우선순위를 조회해 카운트하는 기능을 포함하며, 요청 정보에 따라서 관리자 권한에 대한 분기 처리를 통해 다른 데이터를 반환하고, 결함 관리를 위해 데이터를 업데이트하며, 팀 멤버에 대한 정보를 처리하고, 상태를 조회하는 기능들을 지원하는 레포지토리임.|
|com/skcc/pms/bizcomponent/kanban/board/BCBacklogBoardController.java|칸반 보드 관련 데이터를 처리하는 여러 웹 요청을 처리하는 스프링 컨트롤러임.|
|com/skcc/pms/bizcomponent/kanban/workflowSys/BCWorkFlowSys.java|주어진 데이터에 따른 워크플로우 시스템의 이슈 디테일, 상태 명, 권한 명단 등의 조회 및 워크플로우의 제출, 삭제, 리스트 설정 등의 관리 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/kanban/workflowSys/PUWorkFlowSys.java|원하는 데이터를 제출하거나 삭제하고, 작업 흐름, 이슈 상세, 상태 이름, 권한 명 등의 정보를 가져오거나, 최대 작업 흐름을 확인하는 등의 기능을 수행하는 비즈니스 로직 처리 서비스임.|
|com/skcc/pms/bizcomponent/kanban/workflowSys/DUWorkFlowSys.java|워크플로우 시스템 관리와 관련된 여러 기능을 수행하는 코드로, 워크플로우와 권한의 추가, 수정, 삭제, 전체 목록 조회, 설정, 특정 이슈 정보 조회, 상세목록 조회 및 설정, 권한 이름 목록 조회, 상태 이름 목록 조회, 워크플로우 최대값과 검색 결과의 갯수 조회와 같은 기능을 수행함.|
|com/skcc/pms/bizcomponent/kanban/dao/BackLogDao2.java|MyBatis를 사용하여 데이터베이스와 연동하는 다양한 기능을 제공하는 DAO 클래스임. 이 클래스의 메소드들은 'kanban.backlog' 네임스페이스 아래의 SQL 쿼리들을 실행하며, Backlog에 관련된 조회, 추가, 수정, 삭제 기능을 포함하고 있음.|
|com/skcc/pms/bizcomponent/kanban/dao/BurnDownDao.java|MyBatis를 사용하여 데이터베이스에 접근하고, 여러 쿼리를 실행하여 일일, 주간, 월간 데이터 목록을 가져오고, 일일 데이터를 추가하거나 삭제하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/kanban/dao/WorkValueDao2.java|MyBatis를 통해 DB에 접근하여 주간, 일간, 월간 데이터를 조회하고 일간 데이터를 추가하거나 삭제하는 기능을 담당하는 DAO임.|
|com/skcc/pms/bizcomponent/kanban/dao/VelocityDao2.java|주어진 매개변수를 통해 'kanban.velocity.getList' 쿼리를 실행하고, 그 결과를 리스트 형태로 반환하는 기능이 있음.|
|com/skcc/pms/bizcomponent/kanban/dao/KanbanDao.java|MyBatis를 사용하여 데이터베이스에서 칸반 보드 관련 정보(Kanban board)와 Github 리스트(Gh List)를 조회하는 두 개의 메소드를 가진 Dao 클래스임.|
|com/skcc/pms/bizcomponent/kanban/dao/KanbanBoardDao.java|MyBatis를 이용해 데이터베이스에서 정보를 추가, 삭제, 업데이트하거나 가져오는 다양한 데이터베이스 연산을 수행하는 DAO 클래스임.|
|com/skcc/pms/bizcomponent/kanban/state/BCState.java|스프링 프레임워크를 사용한 웹 애플리케이션 컨트롤러로, 각종 상태(state)에 관련된 처리 요청(제출, 삭제, 조회 등)을 서비스로부터 전달받아 처리해주는 역할을 수행함.|
|com/skcc/pms/bizcomponent/kanban/state/DUState.java|요청받은 데이터를 기반으로 DB에서 각각 다른 정보를 조회하거나 수정하는데 사용되는 여러 메서드들로 구성된 Java 클래스임. 데이터 제출, 삭제, 리스트 표시, 상세 조회 등의 작업을 수행하며, 필요에 따라 XML 데이터 처리 또는 String 처리 등도 수행함.|
|com/skcc/pms/bizcomponent/kanban/state/PUState.java|사용자의 요청에 따라, 이슈의 상태 제출, 삭제, 리스트 조회, 카테고리 이름 리스트 조회, 최대 상태 조회, 상태 개수 조회, 상태 상세 리스트 조회, 상태 상세 개수 조회, 이슈 리스트 조회 등의 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/kanban/controller/VelocityController2.java|프로젝트 관리 시스템에서 칸반 기능의 일부를 관리하는 컨트롤러 역할로, 리스트 조회 기능과 Postgre SQL 오류 처리, 그리고 일반적인 시스템 오류 처리 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/kanban/controller/KanbanController.java|칸반 보드의 리스트를 가져오는 기능과 GitHub의 리스트를 가져오는 기능을 제공하는 서버 사이드 컨트롤러임.|
|com/skcc/pms/bizcomponent/kanban/controller/BurnDownController.java|사용자의 요청에 따라 일일, 주간, 월간 리스트를 가져오고, 정보를 등록하는 캔반 보드의 터닝다운 컨트롤러로, 등록 시 사용자 세션에서 ID 정보를 가져오고 정상작동하지 않는 경우 SQL 오류나 시스템 오류에 대해 처리하는 기능이 있는 컨트롤러임.|
|com/skcc/pms/bizcomponent/kanban/controller/BackLogController2.java|사용자의 HTTP 요청에 따라 BackLogService2 서비스를 통해 비즈니스 로직을 수행하고, 이에 대한 응답을 반환하는 Controller 클래스의 구현과, SQL 예외와 기본 예외를 처리하는 기능이 있다.|
|com/skcc/pms/bizcomponent/kanban/controller/WorkValueController2.java|웹 요청을 처리하고 해당하는 서비스를 호출하여 daily, weekly, monthly 리스트를 반환하거나, 사용자 정보를 등록하는 기능을 담당하고, SQL 오류나 시스템 오류가 발생하면 로그를 출력하고 에러 메시지를 반환하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/kanban/backloglist/BCBackLogListController.java|다음 기능을 가진 컨트롤러 클래스임: 백로그 리스트 조회, 테일러링 리스트 상품 조회, 엑셀 파일 다운로드 및 업로드, 테일러링 업데이트, 테일러링 입력 및 삭제, 연결된 상품 그리드 업데이트 및 삭제, 레벨 리스트 조회 등 작업에 대한 요청 처리.|
|com/skcc/pms/bizcomponent/kanban/backloglist/PUBackLogList.java|각종 BackLog 리스트를 반환하고, 각종 리스트를 엑셀로 다운로드하거나 엑셀파일을 업로드할 수 있는 기능, Tailoring 관련 각종 CRUD 기능, 그리드 데이터에 대한 업데이트 또는 삭제 기능, 레벨 리스트를 반환하는 기능 등을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/kanban/backloglist/DUBackLogList.java|프로젝트의 백로그 리스트를 관리하고, 엑셀 파일로 백로그 리스트 데이터를 다운로드하거나 업로드하며, 데이터를 수정, 삭제하는 기능을 수행함. 또한, 연관된 제품의 그리드 테이블을 업데이트하거나 삭제하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/kanban/workflow/PUWorkFlow.java|워크플로우 관련된 작업들을 수행하는 클래스인데, 제출(submit), 삭제(delete), 목록 설정(list setting), 이슈 상세 목록(issue detail list), 상태 이름 목록(state name list), 목록 설정 상세(list setting detail), 최대 워크플로우(workflow max), 인증자 이름 목록(autho name list), 워크플로우 삭제(workflow delete) 등의 기능을 포함하고 있음. 각 기능은 예외가 발생할 경우 로그를 남기고, 비즈니스 예외를 던짐.|
|com/skcc/pms/bizcomponent/kanban/workflow/BCWorkFlow.java|웹 요청에 따라 다양한 작업 흐름(Worflow) 관련 서비스(작업 제출, 삭제, 목록 설정, 이슈 상세, 상태 이름 목록 등)를 처리하는 컨트롤러 기능 구현.|
|com/skcc/pms/bizcomponent/kanban/workflow/DUWorkFlow.java|워크플로우, 권한 변경, 삭체 및 이슈 목록 설정을 관리하는 자바 프로그램임. 데이터셋 기반으로 웹을 통해 외부에서 입력 받은 정보를 가지고 데이터베이스에 저장, 수정, 삭제 작업을 수행하며, 워크플로우 상태, 권한 이름 등의 정보를 조회해 결과를 반환함. 그룹별 작업 삭제 등의 기능도 있음.|
|com/skcc/pms/bizcomponent/kanban/kbmylyn/BacklogView.java|HTTP 응답에 XML 형태의 작업 목록을 작성하여 전송하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/kanban/service/WorkValueService2.java|주어진 매개변수를 통해 일일, 주간, 월간 목록을 조회하며, 데이터를 등록하고 삭제하는 기능을 가진 서비스임. 이는 WorkValueDao2 인스턴스와 WipService 인스턴스를 사용함. 또한, 등록 과정에서 예외가 발생할 경우, 예외 정보를 로깅하고 상태를 '실패'로 설정함.|
|com/skcc/pms/bizcomponent/kanban/service/BurnDownService.java|BurnDownService는 주어진 파라미터('gubun', 'wv_type', 'all_dt')에 따라 다른 메소드를 실행하여 일, 주, 월별 대시보드의 정보를 조회하고, 이를 반환하며, 데이터를 등록하거나 삭제하는 서비스를 제공함.|
|com/skcc/pms/bizcomponent/kanban/service/BackLogService2.java|데이터베이스와 연동하여 Backlog와 관련된 다양한 요청들을 처리하고, 결과를 Map 형태로 반환하는 기능을 담당하고 있음. 이 중에서도, 테스트 목록, 지정된 요구사항 검색, 백로그 초기화 및 제이라, 타입 등 각각의 명세에 대한 백로그를 검색하고, 유저, 스프린트, 에픽, 타입 등 공통 검색 조건에 대한 결과를 반환함.|
|com/skcc/pms/bizcomponent/kanban/service/KanbanBoardService.java|칸반 보드 리스트와 게토리어보드(GH) 리스트를 구성하여 반환하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/kanban/service/VelocityService2.java|주어진 매개변수를 바탕으로 데이터 리스트를 받아와서 그 중 우선순위가 가장 높은 데이터를 분석한 후, 이름과 날짜 정보를 가공하여 다시 리스트에 추가하고, 그 결과를 마지막에 두 개의 맵에 담아 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/sample/bcmultiboardmanager/PUMultiBoardManager.java|다중 게시판 관리 기능을 제공하는 클래스로, 게시판 조회, 게시판 추가, 게시판 수정, 게시판 삭제, 게시판 컬럼 조회, 게시판 유형 코드 조회, 게시판 유형 서식 목록 조회 등의 기능을 수행함. 게시판에 대한 다양한 변경 사항들은 SVN(SVNHook라는 클래스를 사용해 커밋과 지정된 버전의 내용 다운로드 가능)으로 관리됨.|
|com/skcc/pms/bizcomponent/sample/bcmultiboardmanager/BCMultiBoardManagerController.java|다양한 기능을 지원하는 웹 컨트롤러로, 멀티 보드에 관련된 CRUD 연산 (생성, 읽기, 업데이트, 삭제), 파일 다운로드/업로드, 엑셀 파일 관리, SVN과 연동된 기능, 댓글 및 답글 추가, 메인 보드 리스트 조회, 검색 옵션 조회 등의 작업을 처리함.|
|com/skcc/pms/bizcomponent/sample/bcexercise/DUExerciseSource.java|운동 관련 데이터를 조회, 삽입, 수정, 삭제하는 기능을 하는 자바 코드임. 추가로, XML 스트링을 이용해 DOM 문서를 생성하는 메소드도 포함되어 있음.|
|com/skcc/pms/bizcomponent/sample/bcexercise/BCExerciseController.java|웹에서 요청이 오면 이에 따라 운동 관련 데이터를 조회, 삽입, 업데이트, 삭제하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/sample/bcexercise/PUExercise.java|운동 데이터를 조회, 삽입, 수정, 삭제하는 기능을 포함한 서비스를 제공함.|
|com/skcc/pms/bizcomponent/sample/bccardusemgr/BCCardUseMgrController.java|사용자의 요청을 받아 비즈니스 로직을 실행하고 결과를 반환하는 서버 컨트롤러 클래스임. 또한, 특정 메서드를 통해 엑셀 파일을 다운로드 할 수도 있음.|
|com/skcc/pms/bizcomponent/sample/bccardusemgr/DUCardUseMgr.java|엑셀 파일을 입력하여 데이터를 버퍼링하고 엑셀에서 읽어온 데이터를 기반으로 데이터베이스에 저장 및 업데이트하는 기능을 수행하며, 이를 통해 프로젝트 서비스, 게시판 정보 조회, 게시판 정보 업데이트 등의 작업을 처리함. 또한, File 컬럼을 처리하여 파일 또한 업로드 및 다운로드 가능하며, 검색 조건에 따라 자동으로 검색 및 페이지 생성이 가능함. 이 외에도 시각적인 요소로 표 형식 디스플레이 지원과 오류 발생 시 오류 메시지를 만드는 역할도 수행함.|
|com/skcc/pms/bizcomponent/sample/bccardusemgr/PUCardUseMgr.java|주어진 요청 정보를 처리하고 결과를 반환하는 여러 메소드가 포함된 자바 서비스 클래스임. 이 서비스 클래스는 싱글톤 객체로 동작하며, 특히 pmAutoPageExcelUpload 메소드에서는 엑셀 파일을 업로드하고, 파일로부터 레코드를 추출한 후 요청 데이터에 추가하는 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/sample/bcvacation/BCVacationController.java|웹 요청을 처리하여 휴가 리스트를 가져오고, 휴가 데이터를 삽입, 업데이트, 삭제하는 컨트롤러 기능 수행.|
|com/skcc/pms/bizcomponent/sample/bcvacation/PUVacation.java|휴가 데이터를 조회, 추가, 업데이트, 삭제하는 기능을 수행하는 서비스 클래스이며, 각 작업 시 발생하는 예외 처리를 함.|
|com/skcc/pms/bizcomponent/sample/bcvacation/DUVacationSource.java|휴가 데이터에 대한 CRUD(Create, Read, Update, Delete) 연산을 수행하는 기능이 구현되어 있음. 특히, 휴가 리스트 조회, 데이터 삽입, 수정, 삭제 기능을 담당하는 메서드들이 포함되어 있음. 추가적으로, XML 문자열을 DOM Document로 변환하는 private 메서드도 존재함.|
|com/skcc/pms/bizcomponent/sample/bcuserprjmanager/DUUserProjManager.java|사용자 정보를 관리하는 프로그램으로, 사용자의 프로젝트별 정보 조회, 사용자 추가, 정보 업데이트, 삭제와 같은 기능을 포함하며, 각 사용자의 사번, 성명, 회사, 부서, 직위, 권한 등 다양한 정보를 관리하고 특정 프로젝트에 대한 배정 및 권한 변경 등을 수행한다. 또한, 엑셀 파일로 사용자 정보를 일괄 업로드 및 다운로드하는 기능도 포함되어 있다.|
|com/skcc/pms/bizcomponent/sample/bcuserprjmanager/BCUserProjManagerController.java|사용자 프로젝트 정보를 관리하기 위한 여러 기능들(사용자 추가, 수정, 삭제, 이름 확인, 엑셀 다운로드 및 업로드, 사용자 역할 조회 등등)을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/sample/bcuserprjmanager/PUUserProjManager.java|사용자 정보를 관리하고, 업데이트하며, 엑셀 다운로드 및 업로드 기능을 수행하는 클래스임. 사용자 정보 조회, 추가, 업데이트, 삭제 기능도 제공함. 또한, 엑셀 데이터를 기반으로 사용자 정보를 일괄 업데이트하고, 그 결과를 엑셀 파일로 다운로드하는 기능을 포함함.|
|com/skcc/pms/bizcomponent/sample/bcusermanager/DUUserManager.java|사용자의 정보를 관리하고, 사용자의 권한을 부여하고, 사용자의 정보를 조회하며, 사용자 정보를 생성, 수정, 삭제하는 기능을 수행하는 클래스임. 또한 유저의 패스워드를 암호화하며, 엑셀 파일로 유저 정보를 입출력하고, 유저의 프로젝트 리스트를 조회하는 기능도 지원함.|
|com/skcc/pms/bizcomponent/sample/bcusermanager/PUUserManager.java|사용자의 정보를 관리하고, 사용자의 리스트 조회, 사용자 추가, 사용자 업데이트, 사용자 삭제 등의 기능을 제공하는 서비스임. 또한 모든 사용자 정보를 Excel로 다운로드하거나, Excel 파일을 이용해서 한 번에 여러 사용자의 정보를 업로드하는 기능도 제공함. 이외에도 특정 사용자의 권한 체크, 사용자 비밀번호 업데이트, 코드 리스트 조회, 코드 상세 조회, 코드 삭제, 코드 업데이트 등의 기능도 제공함.|
|com/skcc/pms/bizcomponent/sample/bcusermanager/BCUserManagerController.java|사용자 관리, 엑셀 다운로드 및 업로드, 사용자 이름 확인, 사용자 삭제, 업데이트, 추가 등과 관련된 기능들을 처리하는 웹 애플리케이션 컨트롤러임.|
|com/skcc/pms/bizcomponent/sample/bcsamplesource/DUSampleSource.java|데이터 유닛인 'DUSampleSource'에 대한 CRUD 기능을 수행하는 기능이 있음. 'dmGetSampleList' 메소드는 샘플 데이터의 목록을 조회하고, 'dmInsertSampleData' 메소드는 샘플 데이터를 삽입하며, 'dmUpdateSampleData' 메소드는 샘플 데이터를 업데이트하고, 'dmDeleteSampleData' 메소드는 샘플 데이터를 삭제함. 이 코드에는 또한 'getXmlDocument' 메소드가 있어 XML 문자열을 DOM Document 로 변환하는 기능도 함.|
|com/skcc/pms/bizcomponent/sample/bcsamplesource/BCSampleSourceController.java|웹 주소가 'sample/BCSampleSource'로 요청이 들어오는 경우에 대해 샘플 리스트를 조회, 샘플 데이터를 삽입, 갱신, 삭제하는 기능을 제공하는 기능 구현.|
|com/skcc/pms/bizcomponent/sample/bcsamplesource/PUSampleSource.java|데이터 획득, 삽입, 업데이트, 삭제를 위한 메소드를 가진 서비스 클래스임. 각각의 메소드는 요청 데이터를 입력 받아 샘플 데이터를 조작하고, 이 과정에서 발생하는 예외를 처리함.|
|com/skcc/pms/bizcomponent/sample/bcprojectcalendar/BCProjectCalendarController.java|프로젝트 캘린더와 관련된 다양한 서비스를 제공하며, 특히 캘린더 조회, 업로드, 목록 조회, 휴일 추가, 수정, 삭제 등의 기능을 담당함.|
|com/skcc/pms/bizcomponent/sample/bcprojectcalendar/PUProjectCalendar.java|프로젝트의 달력과 관련된 정보를 관리하는 클래스로, 달력 항목 조회, 휴일 추가, 수정, 삭제, 달력 업로드, 프로젝트 달력 조회, 프로젝트 달력 유니온 리스트 조회, 프로젝트 달력 휴일 리스트 조회, 달력 월별 조회 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/sample/bcprojectcalendar/DUProjectCalendar.java|프로젝트 캘린더에 대한 다양한 기능을 수행하는 코드로, 어떤 프로젝트가 선택되었는지 확인하고 해당 프로젝트의 휴무 목록, 작업 시간, 휴무 여부 등을 조회하고 관리함. 또한, 특정 날짜가 프로젝트 일정에 포함되는지 확인하며, 캘린더를 업로드 하는 기능도 있음. 에러 처리 및 사용자 예외 시스템을 구현하고 있어 안정성을 보장함.|
|com/skcc/pms/bizcomponent/sample/bcpracticesource/DUPracticeSource.java|데이터 유닛을 조회, 삽입, 업데이트, 삭제하는 기능이 구현되어 있으며, XML 스트링을 이용해 DOM 문서를 생성하는 메서드가 함께 포함되어 있음.|
|com/skcc/pms/bizcomponent/sample/bcpracticesource/PUPracticeSource.java|사용자의 요청 데이터를 이용해 연습 리스트를 가져오고, 연습 데이터를 삽입, 업데이트, 삭제하는 총 4가지 기능을 제공함.|
|com/skcc/pms/bizcomponent/sample/bcpracticesource/BCPracticeSourceController.java|스프링 프레임워크를 이용해 웹 애플리케이션을 생성하며, 특정 연습 데이터를 가져오거나, 삽입, 수정, 삭제하는 기능을 담당하는 컨트롤러를 정의함.|
|com/skcc/pms/bizcomponent/api/bcapiusercontroller/BCApiUserController.java|사용자를 생성, 수정, 삭제하는 기능을 수행하는 REST API 컨트롤러임.|
|com/skcc/pms/bizcomponent/api/bcapiusercontroller/PUApiUser.java|사용자를 생성, 수정, 삭제하는 기능을 제공하는 Java 서비스 코드임.|
|com/skcc/pms/bizcomponent/api/bcapiusercontroller/DUApiUser.java|사용자 아이디를 매개변수로 받아서 해당 사용자의 데이터를 데이터셋으로 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/api/bcapitmslinkcontroller/PUApiTmslink.java|웹 요청을 처리하여 테스트 시나리오 정보를 조회하고, 프로젝트 연계 여부를 확인하며, 테스트 유형 정보를 1레벨, 2레벨, 전체로 조회하고 삭제된 테스트 유형 정보와 시나리오 정보도 함께 조회하는 등의 다양한 기능을 수행하는 서비스임. 그 외에도 테스트 시나리오 정보를 트리 형태로 조회하거나 테스트 유형 코드를 조회하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/api/bcapitmslinkcontroller/BCApiTmslinkController.java|Spring Framework를 기반으로 한 웹 애플리케이션에서 프로젝트의 TMS연계여부 확인, 전체 유형 동기화, 전체 시나리오 동기화, 특정 레벨에 대한 PMS유형코드 제공 등의 기능을 수행하는 API 컨트롤러임.|
|com/skcc/pms/bizcomponent/api/bcapitmslinkcontroller/DUApiTmslink.java|특정 프로젝트의 테스트와 관련된 정보(테스트 일정 관리 시나리오, 프로젝트 연계 여부, 테스트 유형 정보 등)를 데이터베이스에서 조회하고 삭제 대상을 조회, 삭제하는 기능을 가진 메소드들로 구성된 자바 클래스임.|
|com/skcc/pms/bizcomponent/api/bcapiprojectcontroller/PUApiProjectInfo.java|프로젝트의 삭제 테이블 정리 여부를 조회하고, 삭제 테이블 정리 여부가 'Y'인 프로젝트 목록을 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/api/bcapiprojectcontroller/DUApiProjectInfo.java|주어진 프로젝트 번호를 바탕으로, 프로젝트의 연계가 가능한지 조회하고, 삭제테이블의 정리 여부가 Y(Yes)인 프로젝트 목록을 조회하는 기능을 담당함.|
|com/skcc/pms/bizcomponent/api/bcapiprojectcontroller/BCApiProjectInfoController.java|특정 프로젝트의 삭제 테이블 정리 여부를 조회하고, 삭제 테이블 정리 여부가 'Y'인 프로젝트 목록을 조회하는 기능을 제공함.|
|com/skcc/pms/bizcomponent/api/bcapiservicecontroller/DUApiService.java|프로젝트의 요구사항, 이슈, 테스크, 리스크 등을 관리하고, 이를 바탕으로 프로젝트 진행 상태를 조회하거나 분석하는 데 필요한 기능을 제공하는 코드임. 이를 위해 데이터베이스에서 적절한 쿼리를 실행하고 결과를 처리함.|
|com/skcc/pms/bizcomponent/api/bcapiservicecontroller/PUApiService.java|주어진 정보를 기반으로 다양한 프로젝트 관리에 필요한 리스트를 생성하거나 조회하는 작업을 수행함. 이러한 작업에는 프로젝트 리스트, 이슈 리스트, 진행 상태 조회, 디자인 요구사항, 개발 목록, 테스트 리스트 등이 포함되며, 각각의 작업은 고유의 입력 파라미터를 받아 처리하고 결과를 반환함.|
|com/skcc/pms/bizcomponent/api/bcapiservicecontroller/BCApiServiceController.java|프로젝트 관리에 관련된 다양한 정보(프로젝트 목록, 이슈 목록, 위험 목록 등)을 서비스로 제공하는 웹 API를 구현한 코드임.|
|com/skcc/pms/bizcomponent/api/bcapiqmslinkcontroller/PUApiQmslink.java|전체 프로그램 목록을 제공하고, 서브 프로젝트를 조회하며, 프로젝트의 연계 유무를 확인하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/api/bcapiqmslinkcontroller/BCApiQmslinkController.java|프로젝트와 서브 프로젝트 정보를 관리하고, QMS링크의 여부를 조회하는 기능이 포함된 API 컨트롤러임.|
|com/skcc/pms/bizcomponent/api/bcapiqmslinkcontroller/DUApiQmslink.java|PMS 프로그램의 전체 목록을 조회하고, 서브 프로젝트들을 확인하며, 특정 프로젝트와 연계 여부를 조회하는 기능을 수행하는 클래스임.|
|com/skcc/pms/bizcomponent/api/bcapiitscontroller/BCApiITSIssueController.java|주어진 매개변수를 이용해 이슈를 추가하거나 삭제하는 기능을 수행하고, 그 결과를 JSON 형태로 반환하는 웹 API를 제공함.|
|com/skcc/pms/bizcomponent/api/bcapiitscontroller/PUApiITSIssue.java|IT 문제를 추가하는 'pmInsertITSIssue' 함수와 제거하는 'pmDeleteITSIssue' 함수를 포함한 서비스를 제공함. 'key' 파라미터가 '?IS?!KEY'와 일치할 때만 해당 함수들은 각각 'InsertITSIssue', 'DeleteITSIssue' 메소드를 호출하여 결과를 반환하며, 오류 시 예외 처리를 통해 로그를 출력하고 에러 메시지를 전송함.|
|com/skcc/pms/bizcomponent/api/bcapiitscontroller/DUApiITSIssue.java|해당 데이터 유닛에서 ITSIssue를 삽입하고 삭제하는 메서드를 가지는 클래스임. 삽입 메서드에서는 DB에 새 이슈를 추가하고, 삭제 메서드에서는 링크된 문제, 액션 아이템, 요구사항 등이 있는지 확인하고 있다면 이를 삭제하며, 마지막으로 이슈 자체를 삭제함.|
|com/skcc/pms/bizcomponent/api/bcapicontroller/PUApiProject.java|프로젝트 관리에 관련된 여러 기능(프로젝트의 생성, 수정, 삭제 및 사용자 추가, 업데이트, 삭제 등)을 수행하는 API 컨트롤러임. 이 컨트롤러는 로그인 사용자 정보를 세션에서 가져오며 HttpServletRequest를 통해 서블릿 API에 접근할 수 있음. 또한 프로젝트의 상태 코드를 조회하는 기능도 있음.|
|com/skcc/pms/bizcomponent/api/bcapicontroller/DUApiProject.java|데이터베이스에서 프로젝트 리스트, 특정 사용자 데이터, 특정 프로젝트 데이터, 전체 사용자 데이터, 프로젝트 상태코드를 조회하는 메소드들을 포함하는 데이터 단위 클래스임.|
|com/skcc/pms/bizcomponent/api/bcapicontroller/BCApiProjectController.java|프로젝트와 관련된 CRUD 작업을 수행하며, 사용자 추가, 수정, 삭제, 권한 추가 등의 기능을 제공하는 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/report/birt/BirtController.java|주어진 이름의 리포트를 생성하고, 요청과 응답 객체를 이용해 사용자에게 전달하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/report/birt/BirtService.java|BIRT 보고서 생성을 담당하는 서비스이며, 보고서를 로드, 실행, 렌더링하고 웹 응답으로 반환해주는 기능을 수행함.|
|com/skcc/pms/bizcomponent/evms/bcevmmanager/DUEvmManager.java|검색된 일정과 비용 데이터를 통해 일정 지수(SPI)와 비용 지수(CPI)를 계산하고, 이를 바탕으로 프로젝트의 상태(일정 지연, 원가 초과 등)를 판단하여 메세지를 생성하고 반환하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/evms/bcevmmanager/PUEvmManager.java|요청 정보를 기반으로 한 데이터셋을 반환하며, 그 과정에서 발생하는 예외 상황을 처리하는 비즈니스 로직을 수행함. 또한 이 과정에서 특정 메소드를 호출하여 반환된 정보를 다시 처리하고 결과값을 반환함.|
|com/skcc/pms/bizcomponent/evms/bcevmmanager/BCEvmManagerController.java|웹 요청을 처리하고, 협업 업무 관리(EVM) 서비스의 특정 목록 조회 기능을 실행시키는 웹 컨트롤러의 구현임.|
|com/skcc/pms/bizcomponent/evms/bctaskplan/PUEvmsTaskPlan.java|업로드된 엑셀 파일에서 데이터를 추출하고, 이를 통해 여러 비즈니스 로직을 수행하는 기능을 구현한 JAVA 클래스임. 각 메서드들은 엑셀 파일 업로드, 프로젝트 정보 조회, MPP 파일 업로드 등의 다양한 서비스를 제공하며, 각각의 작업에 따라 적절한 응답 메시지를 반환함.|
|com/skcc/pms/bizcomponent/evms/bctaskplan/BCEvmsTaskPlanController.java|작업 계획 업데이트, 엑셀 업로드, 부프로젝트 조회 등의 업무 관련 함수를 웹에서 요청하면 해당 기능을 처리해주는 컨트롤러 역할 수행함.|
|com/skcc/pms/bizcomponent/riskissue/bcctsmanagerstatusretrieve01/DUCtsManagerStatusRetrieve01.java|데이터베이스로부터 이슈의 상태를 쿼리하는 여러 메서드를 가진 Spring Repository 클래스를 정의하는 기능이 있음.|
|com/skcc/pms/bizcomponent/riskissue/bcctsmanagerstatusretrieve01/BCCtsManagerStatusRetrieve01Controller.java|위험 문제 관련 매니저의 상태를 조회하고, 특정 이슈의 상태 코드를 조회하며, 그룹별 이슈 상태 목록과 이슈 상태 전체 목록을 조회하는 기능이 제공됨.|
|com/skcc/pms/bizcomponent/riskissue/bcctsmanagerstatusretrieve01/PUCtsManagerStatusRetrieve01.java|요청정보를 기반으로 이슈의 상태를 조회하는 세 가지 메소드('pmIssueStatusListInq', 'pmIssueStatusListInq02', 'pmIssueStatusCode')가 존재하는 클래스이며, 각 메소드는 처리 결과를 DataSet로 반환함.|
|com/skcc/pms/bizcomponent/riskissue/bcctsmanager/DUCtsManager.java|파일 업로드, 다운로드, 엑셀 파일 읽고 쓰기 등을 할 수 있는 코드임. 서버에서 엑셀 파일을 읽어 데이터를 파싱한 후 데이터베이스에 저장하고, 요청에 따라 해당 데이터를 엑셀 파일로 제공하는 기능도 수행할 수 있음. 또한 업로드한 파일의 정보를 데이터베이스에 저장하고, 필요에 따라 파일을 다운로드할 수 있게 하는 기능도 있음. 이 외에도 시스템 시스템, 요청 유형, 상태 코드 등의 데이터를 관리하고 조회하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/riskissue/bcctsmanager/PUCtsManager.java|주요 리스크와 이슈를 관리하고 생성, 수정, 삭제 등으로 변경된 메타데이터를 업로드하며, 메타데이터의 일련번호를 가져오고, 특정 상태 코드를 조회하는 등의 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/riskissue/bcctsmanager/BCCtsManagerController.java|웹 요청을 처리하여 메타데이터 (선택, 업데이트, 삭제, 히스토리 검색, 히스토리 업데이트 등), 파일 목록 조회, 파일 목록 삭제, Cts 식별자 가져오기, 엑셀 다운로드 및 업로드, 파일 다운로드, Cts 상태 코드 조회 등의 작업을 수행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/riskissue/bcissuestatusmanager/PUIssueStatusManager.java|요청된 정보를 바탕으로 이슈 현황을 조회하고, 각 이슈의 상태별로 카운트를 집계한 뒤, 결과를 반환하는 기능을 수행함. 오류 발생 시에는 비즈니스 예외를 발생시킴.|
|com/skcc/pms/bizcomponent/riskissue/bcissuestatusmanager/DUIssueSatusManager.java|사용자의 지역 설정에 맞춰 요청받은 데이터를 바탕으로 이슈 상태를 확인하고, 각 상태별 이슈 수를 계산한 후 결과를 반환하는 기능을 수행함. 이때, 병렬 처리가 이루어지지 않도록 Singleton 객체로 작동하도록 설계되어있음.|
|com/skcc/pms/bizcomponent/riskissue/bcissuestatusmanager/BCIssueStatusManagerController.java|웹 요청을 처리하고 위험문제 상태 매니저의 목록 조회 서비스를 호출하여 결과 데이터를 반환하는 컨트롤러 기능이 있음.|
|com/skcc/pms/bizcomponent/riskissue/bcissuemanager/BCIssueManagerController.java|리스크 이슈 관리를 위한 컨트롤러로, 이슈 관리 기록 조회, 디테일 코드 조회, 이슈 매니저 관련 추가, 삭제, 업데이트, 엑셀 업로드, 파일 다운로드 및 관련 리스트 조회 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/riskissue/bcissuemanager/PUIssueManager.java|해당 코드는 이슈 관리를 위한 기능을 포함하고 있는 클래스를 정의하고 있음. 자세히 보면 이슈 추가, 삭제, 엑셀 다운로드, 이슈 정보 조회, 새 이슈 조회, 이슈 업데이트, 파일 다운로드, 담당자 조회, 엑셀 업로드, 파일 리스트 조회, 파일 삭제, 파일 다운로드 기능 등이 있음. 또한 이슈 관련 상세 코드 조회, 이력 조회, 부프로젝트 이전, 이슈 타입 확인 등의 기능이 포함되어 있음. 이때 각 기능은 메소드로 정의되어 있음.|
|com/skcc/pms/bizcomponent/riskissue/bcissuemanager/DUIssueManager.java|사용자가 웹사이트에서 이슈 트래킹과 관리를 할 수 있게 해주는 자바 기반의 코드로, 데이터베이스에 접근하여 이슈 정보를 확인, 수정, 추가할 수 있게 제공하는 기능이 있음. 이 기능들은 이슈 ID 생성, 이슈 추가, 삭제, 업데이트, 엑셀 업로드와 다운로드, 첨부 파일 업로드와 다운로드, 이슈 상세 정보 조회 등을 포함함. 또한 이슈 관리자가 이슈 리스트를 조회하고, 이슈의 상태를 업데이트하거나 상세 정보를 조회할 수 있는 기능도 함께 제공함.|
|com/skcc/pms/bizcomponent/riskissue/bcalopexdash/DUAlopexDash.java|Alopex Dashboard와 관련된 정보를 조회, 삽입, 수정, 삭제하는 기능을 수행하는 데이터 처리 단위임.|
|com/skcc/pms/bizcomponent/riskissue/bcalopexdash/PUAlopexDash.java|사용자의 요청 데이터를 받아 Alopex 데이터를 가져오거나 설정하고, 삭제하고, 위젯 정보를 조회하는 기능을 제공함. 또한, 각 작업에서 발생하는 예외 상황을 처리함.|
|com/skcc/pms/bizcomponent/riskissue/bcalopexdash/BCAlopexDashController.java|RESTful API를 제공하여 클라이언트로부터 Alopex 관련 데이터를 조회, 저장, 삭제하고, 위젯 정보를 조회하는 기능 수행.|
|com/skcc/pms/bizcomponent/riskissue/bcactionitemstatusmanager/PUActionItemStatusManager.java|요청 정보를 받아 액션 아이템의 상태를 조회하고, 전체 아이템 수, 제안 수, 진행 중인 아이템 수, 지연된 아이템 수, 종료된 아이템 수를 계산해 결과 데이터에 넣어 반환하는 기능 수행.|
|com/skcc/pms/bizcomponent/riskissue/bcactionitemstatusmanager/DUActionItemStatusManager.java|사용자의 언어 세팅에 맞게 Action item의 상태를 조회하고, 해당 정보를 데이터 셋으로 반환하는 기능을 가지고 있음. 사전에 설정된 데이터베이스 쿼리를 통해 프로젝트와 하위 시스템의 상태 정보를 가져오며, 결과값을 'rsOut'과 'rsOut2' 두개의 레코드셋으로 분리해서 반환함.|
|com/skcc/pms/bizcomponent/riskissue/bcactionitemstatusmanager/BCActionItemStatusManagerController.java|리스크 이슈에 대한 액션 아이템 상태를 관리하는 웹 요청을 처리하며, 액션 아이템의 상태 목록을 조회하는 기능을 수행함.|
|com/skcc/pms/bizcomponent/riskissue/bcriskmanager/BCRiskManagerController.java|스프링 프레임워크를 이용해 리스크 관리와 관련된 다양한 HTTP 요청을 처리하는 컨트롤러 구현체임. 이 컨트롤러는 프로젝트 조회, 히스토리 조회, 파일 관리, 리스크 관리 데이터 CRUD 등을 처리하는 메소드를 포함하며, 각 요청별로 서비스 계층의 메소드를 호출하여 작업을 수행함.|
|com/skcc/pms/bizcomponent/riskissue/bcriskmanager/PURiskManager.java|프로젝트의 위험요소와 이슈를 관리하는 기능을 수행하는 서비스 클래스임. 프로젝트 정보 조회, 위험 요소 추가, 파일 다운로드, 위험 요소 업데이트, 위험 요소 삭제, 엑셀 다운로드 등 다양한 함수들로 구성되어 있음. 사용자 요청에 따른 비즈니스 로직을 처리하고, 이에 따른 결과 데이터를 반환함.|
|com/skcc/pms/bizcomponent/riskissue/bcriskmanager/DURiskManager.java|이 코드는 특정 프로젝트의 리스크 이슈를 관리하기 위한 기능들을 제공하는 클래스임. 리스크 이슈를 추가, 업데이트, 삭제, 조회 등을 수행할 수 있고, 또한 엑셀 파일을 통해 일괄 등록이나 다운로드도 가능함. 첨부파일 처리 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/riskissue/bcitsissuelinkmanager/BCITSIssueLinkManagerController.java|여러 종류의 요청을 처리하여 데이터셋을 반환하는 컨트롤러임. 서비스 객체를 이용해 업무 관리지와 이슈 링크에 대한 정보 조회, 업무 담당자 설정, 정보 설정, 이슈 링크 업데이트, 하위 프로젝트 설정, 이슈, 요청, 액션 항목, WBS리스트 조회, 이슈 추가, 이슈 업데이트, 자신의 업무를 찾아주는 작업, 엔티티 제거 등의 작업을 수행함.|
|com/skcc/pms/bizcomponent/riskissue/bcitsissuelinkmanager/DUITSIssueLinkManager.java|사용자가 요청한 정보를 가지고 데이터베이스 조회, 업데이트, 삭제 등의 기능을 수행하고 결과를 반환하는 여러 메소드를 포함하는 Java 클래스임. 특히, 이슈 링크 관리와 관련된 작업을 주로 처리함.|
|com/skcc/pms/bizcomponent/riskissue/bcitsissuelinkmanager/PUITSIssueLinkManager.java|프로젝트의 위험과 문제점에 관련된 정보를 요청하고, 응답한 데이터를 처리하는 기능을 가진 클래스임. 처리 기능에는 문제점과 관련된 인식자 설정, 업데이트, 검색, 삭제 등이 포함돼 있음.|
|com/skcc/pms/bizcomponent/riskissue/bcactionitemmanager/DUActionItemManager.java|이 코드는 미리 지정된 프로젝트 상황에 따라 이미지를 관리, 업로드, 다운로드하고, 데이터셋을 가져오거나 관리하는 등의 기능을 포함하는 자바 코드임. 또한, 데이터셋에 대한 CRUD 작업이 가능하도록 지원하며, 서브시스템 코드 생성, 이슈 ID 중복 체크 등의 특화된 기능도 제공함.|
|com/skcc/pms/bizcomponent/riskissue/bcactionitemmanager/BCActionItemManagerController.java|다양한 요청 라우팅을 처리하는 웹 어플리케이션 컨트롤러로, 액션 아이템 관리에 필요한 기능들(추가, 삭제, 업데이트, 조회 등)과 파일 다운로드, 업로드, 삭제, 그리고 일부 시스템 설정 조회 및 업데이트 등의 기능 제공이 포함됨.|
|com/skcc/pms/bizcomponent/riskissue/bcactionitemmanager/PUActionItemManager.java|이 코드는 고객을 위한 서비스 로직을 관리하는 클래스로, CRUD(Create-읽기, Read-읽기, Update-갱신, Delete-삭제) 작업을 수행할 수 있는 메소드를 제공하고 기타 필요한 기능, 예를 들어 액셀파일 업로드 및 다운로드, 서브시스템 이관, 코멘트 및 히스토리 조회 등을 포함하고 있음.|
|com/skcc/pms/bizcomponent/riskissue/bclegacymanager/BCLegacyManagerController.java|RESTful API를 통해 데이터 조회, 변경, 삭제, 파일 업로드 및 다운로드 등의 기능을 제공하는 웹 서비스를 구현함.|
|com/skcc/pms/bizcomponent/riskissue/bclegacymanager/PULegacyManager.java|해당 코드는 프로젝트 사용자, 업무명, 기능명 조회, 파일 다운로드 / 업로드, 메타데이터 조회 / 추가 / 수정 / 삭제 등의 기능을 관리하는 비즈니스 로직을 가지고 있는 자바 서비스 클래스임.|
|com/skcc/pms/bizcomponent/teamsite/bcnoticeretrieve/PUNoticeRetrieve.java|공지사항에 대한 CRUD(Create, Read, Update, Delete) 기능을 수행하며 이에 대한 알림 전송, 첨부파일 다운로드와 삭제, 여러 파일 처리, 엑셀 이력 다운로드 기능 등을 제공하는 서비스임.|
|com/skcc/pms/bizcomponent/teamsite/bcnoticeretrieve/DUNoticeRetrieve.java|사용자의 역할에 따른 게시물 목록 조회, 생성, 수정, 삭제기능을 제공하고, 게시물 본문에 포함된 특수문자를 처리하며, 게시글에 첨부된 파일의 다운로드, 업로드, 삭제 기능을 제공하는 기능을 가지고 있다. 또한 고유 번호를 통한 개별 게시물 조회, 엑셀 파일로 데이터를 추출하는 기능도 포함하고 있다.|
|com/skcc/pms/bizcomponent/teamsite/bcnoticeretrieve/BCNoticeRetrieveController.java|공지사항을 불러오는 기능, 공지사항에 첨부된 다중 파일을 처리하는 기능, 공지사항 첨부 파일을 다운로드하는 기능, 공지사항을 조회하는 기능, 공지사항 첨부 파일을 삭제하는 기능, 공지사항 목록을 조회하는 기능, 공지사항을 추가하는 기능, 공지사항을 업데이트하는 기능, 공지사항을 삭제하는 기능, 엑셀 이력을 다운로드하는 기능 등을 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/teamsite/bctsmenumanager/DUTsMenuManager.java|사용자의 요청에 따라 팀 사이트의 메뉴를 생성, 삭제, 수정, 조회하는 기능을 제공하는 클래스임. 각 기능은 데이터베이스로 부터 데이터를 추출하거나 데이터베이스에 입력하는 형태로 동작하며, 메뉴 생성 및 조회 시 초기 메뉴 설정도 함께 수행함.|
|com/skcc/pms/bizcomponent/teamsite/bctsmenumanager/PUTsMenuManager.java|메뉴 관리를 위한 여러 기능을 가진 클래스로, 메뉴 추가(pmMenuAdd), 삭제(pmMenuDel), 조회(pmMenuInq, pmMenuInqList), 업데이트(pmMenuUpd), 초기화(pmMenuInit) 기능을 제공함. 각 메소드는 입력 데이터와 연결된 컨텍스트를 받아 처리 후 결과 데이터를 반환함.|
|com/skcc/pms/bizcomponent/teamsite/bctsmenumanager/BCTsMenuManagerController.java|웹 요청에 따라 메뉴 목록 조회, 메뉴 업데이트, 특정 메뉴 조회, 메뉴 삭제, 메뉴 추가, 메뉴 초기화 등의 기능을 수행하는 컨트롤러 역할.|
|com/skcc/pms/bizcomponent/teamsite/bctsgroupmanager/DUTsGroupRoleManager.java|데이터 유닛에서 그룹 역할과 관련된 정보를 처리하고, 그룹 역할 검색(Inquiry)과 업데이트(Update) 기능을 수행하는 코드임. 동시에, XML을 분석하여 트리 그리드에 사용할 데이터를 생성하고, 돔(DOM) 문서를 생성하는 메소드가 포함되어 있음.|
|com/skcc/pms/bizcomponent/teamsite/bctsgroupmanager/BCTsGroupRoleManagerController.java|사용자의 요청에 따라 Group Role 목록 조회와 업데이트 작업을 수행하는 서버 측 컨트롤러 역할 수행함.|
|com/skcc/pms/bizcomponent/teamsite/bctsgroupmanager/PUTsGroupRoleManager.java|그룹 역할에 관한 정보를 조회하고 업데이트하는 서비스를 제공함.|
|com/skcc/pms/bizcomponent/teamsite/bctsmainmanager/BCTsMainManagerController.java|웹 애플리케이션에서 게시물 조회(PM 보드 열 조회, PM 보드 목록 조회, PM 일정 여부 조회, PM 메인 목록 조회 등), 동적 셀렉트 박스 조회, 기능 추가, 열 업데이트 등을 처리하는 여러 HTTP 요청을 라우팅하는 컨트롤러 클래스임.|
|com/skcc/pms/bizcomponent/teamsite/bctsmainmanager/DUTsMainManager.java|사용자의 온라인 요청 정보를 기반으로 게시판 정보 조회, 게시판 목록 조회, 게시판 추가, 칼럼 정보 조회 및 업데이트, 선택 박스 조회, 게시판의 일정 표시 여부 조회와 같은 기능을 수행하는 클래스임.|
|com/skcc/pms/bizcomponent/teamsite/bctsmainmanager/PUTsMainManager.java|이 코드는 게시판 정보 조회, 메인 페이지 추가, 메인 페이지 조회, 게시판 컬럼 조회, 컬럼 업데이트, 셀렉트 박스 조회, 스케줄 조회와 같은 다양한 기능을 제공하는 웹 서비스를 구현하고 있음. 또한, 로깅과 예외 처리를 수행하며, 요청 데이터를 처리한 후 처리 결과를 반환하는 역할을 담당하고 있음.|
|com/skcc/pms/bizcomponent/teamsite/bcteamsitebuild/DUTeamSiteBuild.java|팀 사이트의 빌드와 관련된 조작(생성, 삭제, 조회, 업데이트)을 수행하도록하며 특정 테이블에서 데이터를 선택하고 디버그 로그를 출력하는 등의 역할을 수행함. 팀 사이트와 프로젝트 간의 맵핑을 추가하거나 삭제하고, 정렬 순서를 변경하는 기능도 포함함.|
|com/skcc/pms/bizcomponent/teamsite/bcteamsitebuild/PUTeamSiteBuild.java|이 코드는 웹사이트 팀 사이트를 생성, 조회, 수정, 삭제하는 기능과, 팀 사이트와 프로젝트를 매핑하거나 매핑 정보를 조회, 추가, 삭제하는 기능, 그리고 특정 팀 사이트의 정렬 순서를 업데이트하는 등의 특성화된 기능들을 제공하는 서비스를 구현한 것임.|
|com/skcc/pms/bizcomponent/teamsite/bcteamsitebuild/BCTeamSiteBuildController.java|팀 사이트 구축 관련 서비스를 제공하는 웹 컨트롤러로, 팀 사이트의 추가, 조회, 목록 조회, 업데이트, 삭제, 매핑 목록 조회, 매핑 추가, 매핑 삭제, 맵 프로 불러오기, 게시판 불러오기, URL 코드 불러오기, 정렬 키 다운로드, 정렬 키 업데이트 기능을 수행함.|
|com/skcc/pms/bizcomponent/teamsite/bcschedualmanager/DUSchedualManager.java|프로젝트 일정 관리를 위한 코드로, 일정의 조회, 생성, 수정, 삭제 기능을 수행하며 매일, 매주, 매월, 매년 등 일정의 반복설정을 지원함. 또한, 일정에 첨부파일을 추가하거나 삭제하는 기능, 일정의 Excel 파일 다운로드 기능도 포함되어 있음.|
|com/skcc/pms/bizcomponent/teamsite/bcschedualmanager/PUSchedualManager.java|스케줄 정보를 확인하고, 추가, 수정, 삭제하는 기능을 가진 서비스 클래스임. 파일 업로드 및 다운로드, 파일 삭제 기능도 포함하고 있고, Excel 히스토리 다운로드 기능 역시 지원함.|
|com/skcc/pms/bizcomponent/teamsite/bcschedualmanager/BCSchedualManagerController.java|스케줄 관리 서비스를 제공하는 컨트롤러로, 스케줄을 추가, 삭제, 업데이트, 조회할 수 있고, 엑셀 파일 다운로드 및 엑셀 이력 파일 다운로드 기능도 제공함.|
|com/skcc/pms/bizcomponent/teamsite/bctscfgmanager/PUTSCfgManager.java|데이터셋을 요청 정보로 받아 다양한 관리 작업(리스트 조회, 추가, 삭제, 사용가능 여부 확인)을 수행하며, 각 작업 후 처리 결과를 데이터셋 객체로 반환하는 기능 수행함.|
|com/skcc/pms/bizcomponent/teamsite/bctscfgmanager/DUTSCfgManager.java|사용자의 요청 정보를 바탕으로 데이터 조회, 삽입, 업데이트 기능을 수행하는 기능이 구현되어 있음.|
|com/skcc/pms/bizcomponent/teamsite/bctscfgmanager/BCTSCfgManagerController.java|웹 요청을 받아 해당하는 서비스를 실행하고 그 결과를 반환하는 컨트롤러임. 특정 구성 관리(추가, 조회, 삭제, 사용 가능 여부 확인)에 대한 메서드를 갖추고 있음.|
|com/skcc/pms/bizcomponent/teamsite/bcbusinessreport/BCBusinessReportController.java|회사 비즈니스 보고서 데이터를 조회, 추가, 업데이트, 삭제하고, 주간 및 월간 보고서 파일을 다운로드하거나 삭제하는 역할을 하는 웹 컨트롤러 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/teamsite/bcbusinessreport/PUBusinessReport.java|사용자로부터 입력 받은 요청 정보를 바탕으로 데이터를 조회, 추가, 업데이트, 삭제하는 여러 기능들을 캡슐화한 비즈니스 보고서 클래스임. 또한, 데이터를 엑셀로 다운로드 받는 작업도 수행함.|
|com/skcc/pms/bizcomponent/teamsite/bcbusinessreport/DUBusinessReport.java|해당 자바 코드는 기업 보고서(일일, 주간, 월간) 조회, 수정, 삭제, 엑셀 다운로드 등의 기능을 제공하는 비즈니스 로직을 담고 있음. 기능 단위로 나누어져 있어 각 매서드가 특정 기능을 수행하게 구현되어 있음. 주간보고, 월간보고 조회조건 초기화 기능도 포함되어 있음. 또한, 일일보고, 주간보고, 월간보고 엑셀 파일을 생성하여 다운로드하는 기능도 제공하고 있음.|
|com/skcc/pms/bizcomponent/base/CodeReader.java|Mybatis를 활용하여 데이터베이스에서 특정 프로젝트와 관련된 코드 그룹을 가져오는 기능을 가진 클래스임.|
|com/skcc/pms/bizcomponent/base/BizDataDirectReader.java|사용자의 키워드를 바탕으로 유저를 검색하거나, под프로젝트를 불러오거나 배정하고, 특정 프로젝트에 참여 중인 팀 멤버를 조회하거나, 팀 사이트를 불러오는 등의 기능을 하는 클래스임.|
|com/skcc/pms/bizcomponent/base/BizDataUtil.java|사용자의 키워드를 통해 사용자 리스트를 가져오고, 특정 프로젝트의 하위 프로젝트 번호를 찾아오며, 특정 프로젝트의 진행률과 팀 멤버, 팀 사이트를 조회하는 기능을 수행함. 또한, 모든 하위 프로젝트 또는 설정에 따른 하위 프로젝트를 가져오고, 설정 체크를 수행함.|
|com/skcc/pms/bizcomponent/base/CodeHtmlUtil.java|다양한 형태의 HTML 스크립트(리스트 박스, 체크 박스, 라디오 버튼 등)를 생성하여 반환하는 기능을 제공함. 선택한 옵션이나 값에 따라 HTML의 구조가 결정됨.|
|com/skcc/pms/bizcomponent/base/CodeUtils.java|주어진 프로젝트 ID와 그룹 ID로 데이터베이스에서 코드 그룹을 조회하고, 각 코드를 지역별로 구분해 리스트로 반환하는 기능을 수행함. 또한, 특정 프로젝트 ID, 그룹 ID, 코드 ID를 사용하여 특정 코드를 찾는 기능도 포함하고 있음. 이 외에도 지원되는 로캘을 반환하는 메소드도 포함함.|
|com/skcc/pms/bizcomponent/base/codegen/DUCodeGenManager.java|자동 생성된 페이지 정보를 복사하고 해당 정보를 반환하는 기능을 갖춘 클래스임.|
|com/skcc/pms/bizcomponent/base/codegen/CodeGenController.java|코드 생성 관리를 위한 스프링 컨트롤러로, 코드 정보를 조회하고 실제 코드를 생성하는 두 가지 기능이 있음.|
|com/skcc/pms/bizcomponent/base/codegen/PUCodeGenManager.java|템플릿을 사용하여 코드를 생성하는 기능을 가진 클래스를 정의함. 생성되는 코드는 JSP, 컨트롤러, 서비스, DAO, XML 쿼리 등 다양하며, 생성의 경로나 파일의 명칭 등이 런타임시에 결정됨. 종류에 따라 새로 생성하거나 기존의 코드를 복사하는 기능도 제공함.|
|com/skcc/pms/bizcomponent/base/controller/FileController.java|파일을 업로드하고 다운로드하는 기능을 가진 웹 컨트롤러임.|
|com/skcc/pms/bizcomponent/base/controller/StandardController.java|리퀘스트 데이터와 온라인 컨텍스트를 받아, 해당 데이터에서 nc_trId 필드를 추출하여 클래스 이름과 메소드 이름으로 분할한 후, 동적으로 해당 메소드를 호출하고 결과를 반환하는 기능이 있음.|
|com/skcc/pms/bizcomponent/productivity/bcdesignprogramquantitativemgtperson/BCDesignProgramQuantitativeMgtPersonController.java|프로그램 설계 분량 관리를 위해 각각의 URL 매핑에 따른 서비스 로직을 실행하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/productivity/bcdesignprogramquantitativemgtperson/DUDesignProgramQuantitativeMgtPerson.java|주어진 입력에 대해 데이터를 조회하고, 월별 혹은 주별 기준으로 분류하여 그 결과를 반환하는 기능이 있고, 특정 프로젝트의 상태를 차트나 그리드로 보여주는 기능, 담당자의 정보를 조회하거나 범위 관리자의 승인 설정 상태를 조회하는 기능 등이 구현되어 있음.|
|com/skcc/pms/bizcomponent/productivity/bcdesignprogramquantitativemgtperson/PUDesignProgramQuantitativeMgtPerson.java|서비스 클래스로, 프로젝트 생산성과 관련된 데이터를 조회하고 결과 값을 반환하는 여러 메소드를 포함하고 있음. 다양한 요청에 따라 개인별 생산성 검색, 프로그램 상태 차트 생성, 담당자 조회, 프로그램 상태 그리드 생성, 스코프 관리자 승인 설정 조회 등의 기능을 제공함. 메소드는 요청 정보를 받아 처리한 후 처리 결과를 담은 데이터 세트를 반환함.|
|com/skcc/pms/bizcomponent/productivity/bcproductivityperson/DUProdectivityPerson.java|사용자의 요청 정보(IDataSet requestData)를 바탕으로 주어진 데이터베이스에서 원하는 정보를 조회하고 결과를 리턴하는 데이터 유닛 함수들로 이루어진 자바 코드임. 월별/주별 조회, 다양한 차트 데이터 조회, 그리드 합계 및 조회, 스코프 매니저 승인 설정 조회 등의 기능을 포함하고 있으며, 조회된 결과는 IDataSet 타입으로 반환됨.|
|com/skcc/pms/bizcomponent/productivity/bcproductivityperson/BCProdectivityPersonController.java|웹 요청을 처리하고 응답을 반환하는 컨트롤러로서, 다양한 웹 요청에 대해 상황에 맞는 서비스 메서드를 호출하여 데이터세트를 반환함. 서비스 요청에는 프로젝트 매니저 조회, 프로그램 상태 그리드, 프로그램 상태 차트, 생산성 인물 목록 조회, 범위 관리자 승인 설정 조회 등이 포함됨.|
|com/skcc/pms/bizcomponent/productivity/bcproductivityperson/PUProdectivityPerson.java|사용자의 요청 정보를 기반으로 여러 가지 데이터 처리(개인 생산성 목록 조회, 프로그램 상태 차트 생성, 프로그램 상태 그리드 생성 등)를 수행하고 결과를 반환하는 기능을 수행하는 서비스임.|
|com/skcc/pms/bizcomponent/productivity/bcpersonquantitative/DUPersonQuantitative.java|요청된 데이터(term, division)에 따라서 프로그램이나 요구사항을 월별 또는 주별로 조회하는 기능을 수행함. 결과 데이터는 responseData에 저장되어 반환됨.|
|com/skcc/pms/bizcomponent/productivity/bcpersonquantitative/PUPersonQuantitative.java|요청된 정보(DataSet 객체)를 받아 각각의 프로젝트에 대한 개인의 생산성 정량적 리스트를 조회하고 이에 대한 처리 결과를 반환하는 기능이 있음. 이 때, 'DUPersonQuantitative' 클래스의 'dmPersonQuantitativeListInq' 메서드를 사용하여 데이터를 조회하며, 성공하면 성공 메세지를, 실패하면 예외를 반환하며, 이 클래스는 싱글턴 객체로 동시성 문제를 일으킬 수 있음을 주의하라는 주석이 함께 있다.|
|com/skcc/pms/bizcomponent/productivity/bcpersonquantitative/BCPersonQuantitativeController.java|웹 요청을 처리하고 "pmPersonQuantitativeListInq" 서비스를 요청하여 데이터셋을 반환하는 Spring 웹 컨트롤러를 구현하고 있음.|
|com/skcc/pms/bizcomponent/productivity/bcdesignquantitativemgtperson/BCDesignQuantitativeMgtPersonController.java|사용자의 요청을 처리하고, 그 결과를 반환하는 웹 컨트롤러임. 웹 요청을 통해 프로젝트 매니저 정보 조회, 프로그램 상태 그리드, 프로그램 상태 차트1, 프로그램 상태 차트2, 생산성 개인 목록 조회, 범위 관리자 승인 설정 조회 등의 기능을 제공함.|
|com/skcc/pms/bizcomponent/productivity/bcdesignquantitativemgtperson/DUDesignQuantitativeMgtPerson.java|주어진 요청에 따라 데이터를 조회하고 그 결과를 반환하는 여러 기능을 가진 데이터 관리 클래스임. 특정 기간, 프로그램, 담당자, 프로젝트 상태 등에 따라 데이터를 조회하고, 그 결과를 데이터 세트 형태로 반환함. 이 중 특정 프로젝트("NG-PMS-0001")에 대해서는 예외 처리를 통해 다른 방식으로 데이터를 조회함.|
|com/skcc/pms/bizcomponent/productivity/bcdesignquantitativemgtperson/PUDesignQuantitativeMgtPerson.java|사용자의 요청 정보(DataSet 객체)를 입력으로 받아 성과 측정인원의 목록 조회, 프로그램 상태 차트1과 2 생성, 담당자 조회, 프로그램 상태 그리드 생성, 스코프 매니저의 승인 설정 조회 등의 기능을 수행하고 그 결과를 반환하는 기능들을 포함하는 비즈니스 컴포넌트임.|
|com/skcc/pms/bizcomponent/productivity/bcdesignproductivityperson/BCDesignProdectivityPersonController.java|웹 요청을 처리하여 다양한 서비스(프로젝트 관리자 조회, 프로그램 상태 그리드, 프로그램 상태 차트1, 프로그램 상태 차트2, 생산성 담당자 목록 조회, 범위 관리자 승인 설정 조회)를 제공하는 컨트롤러임.|
|com/skcc/pms/bizcomponent/productivity/bcdesignproductivityperson/PUDesignProdectivityPerson.java|사용자의 요청을 받아 처리하고 결과를 반환하는 여러 가지 메소드들을 가지고 있는 서비스 클래스임. 대표적으로 프로젝트의 생산성, 프로그램의 상태, 담당자 조회, 승인 설정 등에 관한 정보를 처리하고 반환하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/productivity/bcdesignproductivityperson/DUDesignProdectivityPerson.java|사용자의 요청 정보(DataSet 객체)를 기반으로 데이터베이스의 다양한 정보를 조회하고 가공하는 기능을 수행함. 이 기능들은 상세하게는 월별/주별 데이터 조회, 차트 데이터 조회, 그리드 합계 조회, 스코프 관리자 승인 설정 조회 등 다양한 데이터 처리를 포함함.|
|com/skcc/pms/bizcomponent/productivity/bcinterfaceproductivityperson/DUInterfaceProdectivityPerson.java|사용자로부터 요청 정보를 받아 데이터베이스를 조회하고, 결과를 처리하여 다양한 정보들을 조회 및 제공하는 기능들을 구현한 자바 클래스임.|
|com/skcc/pms/bizcomponent/productivity/bcinterfaceproductivityperson/PUInterfaceProdectivityPerson.java|프로젝트 관련 여러가지 정보(프로젝트 능률, 차트, 책임자 등)를 조회하여 제공하고, 강제 종료가 발생할 경우 예외 처리를 통해 안전하게 종료하는 기능을 가지고 있음.|
|com/skcc/pms/bizcomponent/productivity/bcinterfaceproductivityperson/BCInterfaceProdectivityPersonController.java|웹 요청을 처리하여 미리 정의된 서비스 함수를 호출하고 그 결과를 반환하는 컨트롤러 클래스임.|
|com/skcc/pms/bizcomponent/productivity/bcswdevproductivity/BCSwDevProductivityController.java|스프링 프레임워크를 활용하여 웹 요청을 처리하는 컨트롤러로, "pmColListInq"와 "pmSwDevProductivityListInq" 라는 두 개의 요청을 받아 각각 'service.pmColListInq'와 'service.pmSwDevProductivityListInq' 메서드를 호출하고 결과를 반환함.|
|com/skcc/pms/bizcomponent/productivity/bcswdevproductivity/PUSwDevProductivity.java|요청 정보를 받아서 'dmColListInq'와 'dmSwDevProductivityListInq' 메소드를 이용해 처리 결과를 반환하는 서비스를 제공함. 이 때, 비즈니스로직 에러와 일반적인 예외를 처리할 수 있도록 설계되어 있음.|
|com/skcc/pms/bizcomponent/productivity/bcswdevproductivity/DUSwDevProductivity.java|사용자의 요청에 따라 데이터를 조회하여 응답하는 데이터 조회 기능을 제공함. 이 기능은 세부 정보에 따라 다른 쿼리를 사용하며, 사전에 정의된 데이터베이스 쿼리를 통해 월별로 행을 처리하거나, 하나의 레코드에서 계획 데이터를 조회하거나 실적 데이터를 조회할 수 있음.|
|com/skcc/pms/bizcomponent/productivity/bcdesigninterfacequantitativemgtperson/BCDesignInterfaceQuantitativeMgtPersonController.java|스프링 프레임워크를 이용하여, PM(Program Manager)의 역할과 생산성에 대한 여러 웹 요청을 처리하고, 서비스를 호출하여 데이터를 반환하는 컨트롤러임. 이에는 PM의 업무 담당자 조회, 프로그램 상태 그리드, 프로그램 상태 차트, 생산성 관련 인물 목록 조회, 스코프 관리자 승인 설정 조회 등의 기능이 포함되어 있음.|
|com/skcc/pms/bizcomponent/productivity/bcdesigninterfacequantitativemgtperson/DUDesignInterfaceQuantitativeMgtPerson.java|사용자의 요청을 기반으로 데이터베이스 조회를 수행하고 그 결과를 DataSet 형태로 반환하는 메소드들을 포함한 자바 클래스임. 사용자의 요청은 주로 프로젝트 정보 조회, 책임자 조회, 스코프 매니저 승인 설정 조회 등으로, 필요시 동적 쿼리 실행을 통해 데이터를 가져옴.|
|com/skcc/pms/bizcomponent/productivity/bcdesigninterfacequantitativemgtperson/PUDesignInterfaceQuantitativeMgtPerson.java|Spring Boot를 이용한 서비스 클래스에서 사용자의 데이터 요청에 따른 처리 결과를 반환하는 메소드들을 포함하고 있음. 각 메소드는 데이터의 조회, 차트 생성, 승인 설정 조회 등의 기능을 수행함.|
|com/skcc/pms/bizcomponent/productivity/bcreqquantitativemgtperson/PUReqQuantitativeMgtPerson.java|요청된 데이터를 처리하여 결과 데이터를 반환하는 서비스를 제공하며, 개별 함수들은 회원 목록 조회, 개발 차트 제작, 담당자 조회, 승인 설정 조회 등의 역할을 수행함.|
|com/skcc/pms/bizcomponent/productivity/bcreqquantitativemgtperson/DUReqQuantitativeMgtPerson.java|기능 요구 관리를 위한 데이터를 요청이 들어오는 대로 데이터베이스에서 조회한 후 반환하는 여러 메소드가 포함된 자바 클래스임. 각 메소드는 특정 주제에 대한 정보를 요구하는 'requestData'를 인자로 받아 데이터베이스에서 그에 해당하는 정보를 조회하고, 이를 'responseData' 객체에 저장하여 반환하는 역할을 수행함.|
|com/skcc/pms/bizcomponent/productivity/bcreqquantitativemgtperson/BCReqQuantitativeMgtPersonController.java|웹 리퀘스트를 처리하여 다양한 정보를 조회하는 기능을 제공하는 컨트롤러임. 이는 프로제트 매니저 정보 조회, 프로그램 상태 그리드 및 차트 조회, 생산성 관리자 목록 조회, 스코프 관리자 승인 설정 조회 등을 처리함.|
|com/skcc/pms/support/listener/LoginListener.java|HTTP 세션 바인딩 이벤트에 따라 로그인 사용자의 세션 정보를 관리하고, 세션 정보를 가져올 수 있는 기능을 제공함.|
|com/skcc/pms/support/bizcommon/ProcessUnit.java|'FunctionUnit'을 상속받아서 확장하는 추상 클래스 'ProcessUnit' 선언임.|
|com/skcc/pms/support/bizcommon/DBLog.java|데이터베이스에서 데이터를 조회, 삽입, 삭제, 업데이트하는 기능을 구현하며, 이러한 작업에 대한 로그 레코드를 생성하고 데이터베이스에 삽입함. 이 클래스는 사용자의 ID, 행위, IP 주소 등의 정보를 각 로그 레코드에 포함시킴.|
|com/skcc/pms/support/bizcommon/DataUnit.java|데이터베이스의 CRUD 작업을 처리하는 기능을 가진 클래스임. 쿼리 아이디와 파라미터를 인자로 받아 단건 쿼리 실행, 다건 쿼리 실행, 조회, 등록, 수정, 삭제 작업을 수행하고, 작업 내용을 로깅함.|
|com/skcc/pms/support/bizcommon/FunctionUnit.java|빈 이름이나 클래스로 DataUnit과 FunctionUnit를 ApplicationContext에서 검색하여 반환하는 기능 수행.|
|com/skcc/pms/support/bizcommon/BaseBizUnit.java|데이터베이스에 접근하여 로그를 추출하고 추출된 로그를 바탕으로 비즈니스 로직을 처리하는 기능 수행.|
|com/skcc/pms/support/util/LocaleUtils.java|문자열 형태의 지역 설정 정보를 Locale 객체로 변환하는 기능 수행.|
|com/skcc/pms/support/util/ExcelDownloadStringAdder.java|엑셀 다운로드에 필요한 헤더명, DB 필드명, 셀 형식을 설정하고, 추가하며, 이를 반환하는 기능을 가진 클래스 정의임.|
|com/skcc/pms/support/util/StringUtils.java|주어진 코드는 문자열 관련 유틸리티를 제공하는 클래스임. 문자열을 주어진 조건에 따라서 변경하거나, 특정 패턴에 따라 분리하거나, 특정 문자나 패턴을 이용해 문자열을 조합하거나, 문자열을 특정 포맷에 맞추는 등의 기능 구현이 포함되어 있음.|
|com/skcc/pms/support/util/ExceptionUtil.java|주어진 예외에 대한 스택 추적을 문자열로 반환하고, 특정 예외형을 처리하는 기능을 가진 유틸리티 클래스 구현임. 이 클래스에서는 주어진 호출의 근본 원인과 관련된 예외를 조사하고, 예외 스택에서 처음 발견된 SQLException도 반환함.|
|com/skcc/pms/support/util/Base64.java|Base64 인코딩과 디코딩을 수행하는 클래스임. 내용에는 문자열이나 바이트 배열 등 다양한 형태의 데이터를 인코딩하고 디코딩하는 메서드가 포함되어 있음. 또한, 필요에 따라 라인 구분자를 추가하여, 결과물을 예쁘게 형태를 유지할 수 있도록 함. 이 클래스는 표준 Base64 인코딩 및 디코딩을 수행하는 것 외에도, 성능을 향상시키기 위해 잘 형식화된 데이터에 대해 더 빠른 디코딩 메소드도 제공함.|
|com/skcc/pms/support/util/UUID.java|표준 Java UUID 클래스를 확장하여, 글로벌 고유 식별자(UUID)의 생성, 비교, 해싱, 출력을 할 수 있는 도구를 제공하며, 특히 무작위(UUID 타입 4) 및 이름 기반(UUID 타입 3) UUID를 생성할 수 있음.|
|com/skcc/pms/support/util/JdomUtil.java|입력 스트림, XML 문자열, Reader, 또는 XML 파일로부터 JDOM 문서를 생성하고, 해당 JDOM 문서를 문자열화 된 XML로 반환하는 유틸리티 메소드를 제공하는 클래스함.|
|com/skcc/pms/support/util/AppUtils.java|환경 변수를 사용해 응용 프로그램 설정 정보를 관리하고, 이를 동적으로 캐싱하여 제공하는 유틸리티 클래스임. 캐시는 어플리케이션 실행 도중 재설정이 가능함.|
|com/skcc/pms/support/util/SVNSimpleClient.java|SVN 서버와 연동하여 버전 관리 기능을 수행하는 코드임. 파일의 업로드, 다운로드, 삭제, 디렉토리 생성 등의 기능과 파일의 역사를 확인하는 기능, SVN 인증 등을 수행할 수 있음.|
|com/skcc/pms/support/util/FileUtil.java|입력받은 경로의 이름으로 폴더를 생성하고, 폴더 내의 모든 하위요소(파일, 서브 폴더 등)를 삭제하는 기능을 수행함.|
|com/skcc/pms/support/util/StringEscapeUtil.java|XML 문자열에서 특별한 문자들("&", "<", ">", "'", '"')을 이스케이프 문자로 치환하는 기능 있음.|
|com/skcc/pms/support/util/CSVExportJob.java|입력된 레코드 세트의 헤더와 데이터를 csv 파일로 내보내는 기능이 있음. 또한, 데이터가 없으면 파일을 생성하지 않음. 새로운 데이터가 들어올 경우에는 파일에 추가되며, 첫 번째 데이터일 경우에만 헤더 정보가 추가로 인쇄됨. 함수가 수행된 후에는 처리된 레코드 세트의 레코드 개수를 반환함.|
|com/skcc/pms/support/util/LabelUtils.java|사용자 세션에 관한 정보를 기반으로 다국어 지원 기능을 처리하는 클래스임. 특정 키를 입력하면, 해당 키와 연관된 특정 지역의 메시지나 이름(label)을 반환함. 또한, 모든 데이터를 새로 고침하는 기능도 제공함.|
|com/skcc/pms/support/util/ExcelExport.java|엑셀 파일을 생성하고 다운로드하는데 필요한 제목, 필드, 포맷을 추가하고, 해당 정보를 기반으로 실제 엑셀 파일을 저장하는 기능을 가진 클래스임.|
|com/skcc/pms/support/util/ExcelUtil.java|다양한 날짜 형식의 문자열을 받아 "yyyy-MM-dd" 형식으로 변환하는 기능이 있음. 이때, 입력 문자열이 숫자일 경우 1900-01-01부터 숫자만큼 날짜를 더하고, 입력 문자열에 년도 데이터가 없을 경우 현재 년도를 사용함.|
|com/skcc/pms/support/util/BaseUtils.java|프로퍼티 파일을 읽어서 그 내용을 다양한 방법으로 활용하는 역할을 하는 유틸리티 클래스임. ApplicationContext에서 필요한 빈을 가져와서 정보를 얻거나, 특정 key에 해당하는 메시지를 가져와서 반환하거나, 특정 지역의 언어로 메시지를 반환하는 기능을 지원함. 또한, 파일 이름과 인코딩을 입력받아 프로퍼티 파일을 읽어들이는 기능을 가지고 있음.|
|com/skcc/pms/support/util/SoftcampUtil.java|파일을 암호화하고 복호화하는 기능을 수행하며, 소프트캠프 사용 유무를 확인하는 기능을 제공함.|
|com/skcc/pms/support/util/DataSetUtils.java|컬렉션, 맵, 객체 등을 IRecordSet으로 변환하는 유틸리티 기능, 문자열이나 숫자를 특정 데이터 타입으로 변환하는 기능, 값 검증 기능, CLOB, BLOB 변환 기능, IRecordSet 출력 기능 등을 제공하는 유틸리티 클래스임. 입력 데이터에 따라 상호 변환하는 다양한 메소드를 포함함.|
|com/skcc/pms/support/util/SqlInjectionFilter.java|사용자 입력 값이 SQL 삽입 공격에 취약한 특수 문자나 금지어를 갖고 있는지 확인하고, 그 결과에 따라 유효한 입력인지 아닌지를 판단하는 기능을 수행함.|
|com/skcc/pms/support/util/AuthUtil.java|권한과 메뉴 정보를 관리하며 사용자의 동작에 따른 접근 권한을 체크하는 기능을 수행하는 클래스임. 여러 서비스의 사용 여부와 연결 주소를 관리하며, 이를 바탕으로 사용자의 권한을 확인하여 충족해야 하는 액션을 결정함. 팀사이트와 게시판의 메뉴 구조와 권한을 관리하고 사용자가 특정 작업을 수행할 수 있는지 여부를 판단하는 메서드도 포함되어 있음.|
|com/skcc/pms/support/util/DateUtils.java|해당 코드는 날짜 및 시간에 관련된 다양한 유틸리티 기능을 제공하는 클래스임. 달력 변환, 날짜 형식 검증, 주어진 날짜 또는 시간에 특정 시간을 더하거나 빼는 등의 기능이 구현되어 있음.|
|com/skcc/pms/support/util/ByteArrayWrap.java|바이트 배열을 보다 효율적으로 재사용하기 위해 만들어진 'ByteArrayWrap' 클래스로, 바이트 배열, 시작 위치, 길이 정보를 저장하고 있으며, 이를 복제하거나 문자열로 반환하는 기능을 제공함.|
|com/skcc/pms/support/util/ExcelUploadValidator.java|엑셀 파일을 업로드할 때 필수 입력 텍스트, 텍스트 길이, 날짜 등을 검증하고 그 결과를 리스트로 제공하는 기능을 처리함. 또한, 유효하지 않은 데이터에 대해 오류 메시지를 생성하고 실패 목록에 추가함.|
|com/skcc/pms/support/util/JDBCUtil.java|사용자가 지정한 SQL 쿼리를 실행하여 데이터베이스에서 정보를 검색하거나 업데이트하는 기능을 제공하는 유틸리티 클래스임. 날짜 변환 기능도 포함되어 있음.|
|com/skcc/pms/support/util/JsonUtils.java|JSON 데이터를 더 효율적으로 관리하고 처리하는 다양한 함수를 포함한 유틸리티 클래스임. 이 클래스를 통해 특정 키에 해당하는 값들을 불러올 수 있으며, 문자열, 정수, 실수, 불린형으로 변환 가능함. 추가로 JSON 객체나 배열을 가져오거나, 특정 경로에 대한 값들을 반환하거나, 유효한 JSON 요소인지 검증하는 기능까지 제공함.|
|com/skcc/pms/support/util/WebUtils.java|HTTP 요청의 다양한 정보와 상태를 관리하고, HTTP 응답에 필요한 정보를 세팅하는 유틸리티 메소드의 모음임. 이는 서블릿 경로 반환, 요청 및 응답의 속성 조회 및 설정, 세션 관련 정보 처리, 파라미터나 쿠키의 정보 조회 등의 기능을 포함하고 있음.|
|com/skcc/pms/support/mvc/LoginInterceptor.java|키클록(Keycloak)을 통해 사용자가 로그인하고 일부 정보를 동기화하는 기능이 제공됨. 사용자의 세션 정보를 관리하고, 기록을 남기며, 만약 인증이 만료되었다면 사용자를 로그아웃 시키는 기능도 수행함. 그 외에도 사용자의 마지막 프로젝트 번호를 업데이트하는 코드도 포함되어 있음.|
|com/skcc/pms/support/mvc/FormMappingIDataSet2HttpMessageConverter.java|HTTP 메시지를 IDataSet 객체로 변환하고 해당 객체의 정보를 꺼내 사용할 수 있도록 하는 기능을 수행함.|
|com/skcc/pms/support/mvc/GlobalExceptionHandler.java|전역 예외 처리를 위한 클래스로, 모든 예외에 대해서 처리하며, 비즈니스 런타임 예외인 경우 에러 정보를 저장하고 반환함. 다른 예외의 경우에는 그대로 다시 던져줌.|
|com/skcc/pms/support/mvc/MappingIDataSet2HttpMessageConverter.java|HTTP 메시지를 IData형태로 읽어오고, IData를 다시 HTTP 메시지로 출력하는 기능을 수행하며, 사용자 정보를 세션에서 가져오거나 새로 세팅하는 기능도 있음. 추가적으로, HTTP 요청을 가져오는 기능과, IDataSet과 IOnlineContext를 쓰레드 로컬에 저장하거나 가져오는 기능이 있음.|
|com/skcc/pms/support/mvc/IDataSetArguemtResolver.java|스프링 MVC에서 요청 파라미터를 미리 정의된 IDataSet이나 IOnlineContext 객체로 변환하는 역할을 함.|
|com/skcc/pms/support/file/ExcelManager.java|엑셀 파일과 관련된 다양한 작업을 하는 코드임. 패키지에는 엑셀 파일을 읽고, 쓰고, 변환하거나 저장하고, 다운로드하는 기능 등이 포함되어 있음. 엑셀 파일의 셀들은 원하는 포맷으로 관리할 수 있고, 레코드처럼 처리되며, 원하는 형태로 데이터를 추출하거나 변환할 수 있음. 크게 엑셀 파일로의 데이터 변환, 엑셀 파일에서 레코드셋으로의 데이터 변환, 엑셀 파일 다운로드 기능 등이 포함되어 있음.|
|com/skcc/pms/support/file/MultipartRequestWrapper.java|웹 서버로 들어오는 multipart 데이터를 해석하고 처리하며, 업로드된 파일의 임시 저장 경로, 최대 사이즈 등을 설정하고, 파일 또는 폼 데이터를 파싱하여 보관하는 기능을 수행함.|
|com/skcc/pms/support/file/FileResource.java|파일 업로드 정보를 관리하며, 업로드 된 파일의 원본 이름, 저장된 경로 및 이름, 파일 크기, 타입 등의 정보를 설정하고 불러올 수 있는 기능을 제공함.|
|com/skcc/pms/support/file/FileResourceManager.java|파일 업로드, 다운로드, 삭제, 변환 등의 파일 관리 기능을 수행하는 클래스임. 주요 기능으로는 파일 크기, 업로드 패스, 다운로드 버퍼 크기, 인코딩 등을 설정하는 데 필요한 메서드들과 어플리케이션 정보, 작업 날짜를 기준으로 파일을 업로드하거나 다운로드하는 메서드 등이 있음. 클래스의 모든 메서드는 정적(static)이므로 인스턴스를 생성하지 않고 사용할 수 있음.|
|com/skcc/pms/support/file/FileManager.java|HTTP 요청을 통해 전송된 파일들을 관리하는데, 다운로드, 삭제, 업로드가 가능하고, 각 동작 후에 결과 데이터를 생성하여 XML 형식으로 반환함.|
|com/skcc/pms/support/codegen/JSPGeneration.java|특정 파라미터에 따라 JSP 파일을 생성하고, 주어진 템플릿에 따라 서치박스와 caution 정보를 적용하여 웹 페이지를 만들어내는 기능 수행함.|
|com/skcc/pms/support/manager/LabelManager.java|데이터베이스로부터 레이블과 메시지 데이터를 읽어와 각각의 데이터를 HashMap에 저장하고, 받아온 키 값으로 해당 메시지와 레이블을 각각 검색하여 반환하는 기능을 수행함. 또한 레이블 정보를 새로고침하는 기능도 있음.|
|com/skcc/pms/support/manager/PropertiesManager.java|스프링 애플리케이션 환경 설정 파일의 속성들을 다루는 기능을 담당하는 클래스임. 이 클래스는 초기화작업을 수행하고, 설정 파일의 속성 목록을 가져오며, 특정 속성 정보를 조회하고, 속성을 저장하는 역할을 함.|
|com/skcc/pms/support/batch/listener/ScheduleLoggingTriggerHistoryPlugin.java|배치 작업에 대한 트리거 기록을 로깅하는 기능을 수행함. 트리거는 스케줄에 따라 실행되며, 트리거가 발동될 때, 실수로 늦게 발동될 때, 그리고 완료될 때 로깅 메시지를 작성하고 버퍼를 만듬. 이런 정보들은 배치 관리자를 통해 로그에 작성됨.|
|com/skcc/pms/support/batch/util/TriggerUtil.java|특정한 이름과 크론 표현식을 이용해 크론 트리거를 생성하거나, 트리거의 이름과 지연 시간을 이용해 단발성 트리거를 생성하는 기능을 가진 유틸리티 클래스 생성.|
|com/skcc/pms/support/batch/util/JobDetailUtil.java|주어진 클래스이름, 작업 이름, 데이터를 바탕으로 Quartz의 JobDetail 객체를 생성하고, 특정 메서드를 호출하는 JobDetail도 생성하는 유틸리티 클래스임.|
|com/skcc/pms/support/batch/manager/AbstractBatchInvoke.java|배치 작업의 시작, 종료, 에러 발생, 취소 시 배치 작업에 대한 정보를 데이터베이스에 기록하는 기능을 수행함.|
|com/skcc/pms/support/batch/manager/AbstractBatch.java|배치 작업을 관리하고, 해당 작업의 시작, 종료, 에러, 취소 상태를 데이터베이스에 기록하며, 작업 중에 에러가 발생한 경우 에러 메시지를 기록하도록 되어 있음. 또한, 실행 중인 작업을 중단하는 기능도 제공함.|
|com/skcc/pms/support/batch/manager/BatchManager.java|배치 작업 관리를 위한 코드로, 작업 스케줄링, 작업 시작, 중단, 삭제, 일시 정지 등의 배치 작업의 생명 주기를 관리하고, 그 작업의 로그를 작성하도록 설정됨.|
|com/skcc/pms/support/view/TextView.java|HTTP 응답으로 XML 형식의 텍스트 데이터를 반환하는 자바 웹 뷰 클래스임.|
|com/skcc/pms/support/view/TempView.java|입력받은 리스트에 있는 데이터를 XML 형식으로 출력하는 기능 수행함. 출력하는 XML에는 issue 태그가 있고, 이 안에는 안에는 bl_no, bl_nm, ty_nm, step_nm, assignee_name, priority_nm, epic, feature_name와 같은 정보가 들어있음.|
|com/skcc/pms/support/view/DownloadView.java|특정 파일을 다운로드할 수 있게 해주는 기능이 있으며, 이를 위해 파일의 경로와 이름, 그리고 내용 유형을 설정하고, 클라이언트에게 제공하며, 캐시 사용을 방지함.|
|com/skcc/pms/support/log/LogManager.java|다양한 종류의 로거를 관리하고, 필요에 따라 적절한 로거를 반환하는 기능을 제공하는 클래스임. 이중에서 개발 로거와 프레임워크 로거를 관리하며, 각 로거는 사용자가 지정한 식별자에 따라 생성되거나 가져올 수 있음. 또한, 온라인 컨텍스트에 등록된 로거를 반환하는 기능도 있음.|
|com/skcc/pms/support/log/DevLogExtension.java|개발자가 로그에 부가적인 정보(RequestId)를 남길 수 있게 확장한 클래스로, 두 가지 로깅 프레임워크(org.apache.commons.logging.Log, org.apache.log4j.Logger)를 지원하며, 추가로 debug, error, fatal, info, trace, warn 등 다양한 로그 수준에 따른 메시지를 작성하고 출력하는 기능이 있음.|
|com/skcc/pms/support/log/LoggableStatement.java|데이터베이스 연결과 SQL 문자열을 사용해 LoggableStatement를 생성하고 SQL 쿼리를 수행하는 기능을 가진 클래스이며, JDBC PreparedStatement에 추가적인 로깅 기능을 제공함. 각각의 SQL 행동(addBatch, cancel, execute 등) 이후의 상태를 로깅하고, 쿼리 문자열이나 대체 문자를 캐시함.|
|com/skcc/pms/support/log/TailLog.java|특정 로그 파일의 내용을 로드하고, 해당 로그 파일에 새로운 메시지를 작성하고, 또한 로그 파일의 전체 로그 또는 특정 범위의 로그를 가져올 수 있는 기능을 수행함.|
|com/skcc/pms/support/aspect/PmsAdvice.java|주석 처리된 메소드 내에서 로깅을 활용하여 com.skcc.pms.bizcomponent.agile 패키지 내의 모든 메소드 실행 전에 해당 메소드의 시그니처와 파라미터들을 로그로 남기는 기능이 있었음.|
|com/skcc/pms/support/data/DataSet.java|데이터 전송 객체(Data Transfer Object, DTO)의 기능을 표현하는 코드로, 각 필드에 대해 여러가지 데이터 타입(문자열, 정수, 실수 등)을 받아서 저장하고, 해당 데이터를 받아오는 등의 기능을 수행함. 또한 메시지를 설정하고 받아오기, 레코드 세트를 가져오거나 설정하는 기능도 함께 가지고 있음. 이번 코드는 한 클래스에서 다양한 기능들을 수행하도록 설계되어 있음.|
|com/skcc/pms/support/data/ResultSetColumnNameHelper.java|데이터베이스 조회 결과를 처리하기 위해 ResultSetMetaData를 가져오고 설정하며, ThreadLocal을 사용해 쓰레드별로 독립적인 데이터를 저장하는 기능을 제공함.|
|com/skcc/pms/support/data/IRecordHeader.java|레코드셋의 헤더 정보를 표현하고 관리하는 인터페이스로, 헤더의 이름, 레이블, 타입을 가져오고 설정하며, 헤더의 복제본을 생성하는 기능이 있음.|
|com/skcc/pms/support/data/IMessageCoded.java|메시지 아이디를 반환하고, 메시지 생성을 위한 파라미터를 반환하는 인터페이스를 정의함.|
|com/skcc/pms/support/data/IRecordSetMetaData.java|레코드형 데이터의 메타정보를 관리하는 인터페이스로, 아이디 값 반환, 예상 레코드 수 표시, 필드형 데이터의 메타데이터 목록 가져오기, 레코드의 수를 필드 값으로 받기, 암호화 필드 존재 여부 확인 등의 기능들을 담당하고 있음.|
|com/skcc/pms/support/data/OnlineContextIncludedDataSetMap.java|데이터 세트와 온라인 컨텍스트를 포함하는 맵 인터페이스를 구현하는 클래스로, 데이터 세트의 필드를 읽고, 수정하고, 추가하고, 제거하는 등의 기능이 있음.|
|com/skcc/pms/support/data/IPagination.java|페이지 리스트를 렌더링 할 수 있는 데이터 표준 포맷을 정의하고, 사용자 화면의 레코드 세트 번호 인덱스, 레코드 개수, 총 데이터 개수, 페이지 조회 여부, 다음 페이지 존재 여부를 반환하는 인터페이스를 제공하는 역할을 함.|
|com/skcc/pms/support/data/RecordSet.java|레코드셋(RecordSet) 관리와 조작에 필요한 기능을 제공하는 클래스임. 주요 기능으로는 헤더와 레코드 추가, 특정 헤더 또는 레코드 제거, 레코드셋 복제, 레코드셋 내의 데이터 정렬 등이 있음. 레코드셋 클론, 레코드 제거, 컬럼 데이터 추가 및 제거, 레코드셋 초기화 등 다양한 기능을 제공함. 외부 API를 통해 데이터를 쉽게 추가, 가져오고 수정할 수 있음.|
|com/skcc/pms/support/data/RecordHeader.java|헤더의 이름, 레이블, SQL 타입을 저장하고 처리하는 RecordHeader 클래스 구현체임. 생성자를 이용해 이를 초기화하고, 각각의 값을 가져오거나 설정하는 메소드가 있음. 또한, 헤더의 이름을 비교하는 equals 메소드와 자신의 복제본을 생성하는 clone 메소드도 포함되어 있음.|
|com/skcc/pms/support/data/JdomProcessor.java|XML 문서를 처리하고, JSONObject와 DataSet을 주고받으며 기록하고 분석하는 코드임. 주로 XML validation, 작성 및 해석 업무를 수행하고, 각 속성과 태그명을 처리하는 역할을 담당함.|
|com/skcc/pms/support/data/ResultMessage.java|서버 측 업무 수행 결과를 메시지 형태로 표현하며, 메시지 ID, 파라미터, 상태, 타이틀, 예외 등의 정보를 상태별로 저장하고, 필요에 따라 추가적인 메시지도 저장할 수 있게 하는 클래스임. 또한, DB 조작에 대한 정보(변경된 행 수, 관련 레코드 셋 ID와 레코드 ID 등)도 저장하고 관리함.|
|com/skcc/pms/support/data/IResultMessage.java|서버 측 업무 결과 메시지를 표현하는 인터페이스로, 실행 상태 코드, 타이틀, 예외 객체를 저장하고 관리하며 DB 조작과 관련된 데이터와 오류 추적을 돕는 여러 메소드를 제공함.|
|com/skcc/pms/support/data/ResultRowHandler.java|IBatis의 ResultHandler를 커스터마이징하여 Result Set에서 필요한 데이터를 추출하고, 이를 Record Set 형태로 관리하는 기능을 수행함. 또한 Clob와 Blob 타입의 데이터를 처리하는 메소드를 제공하고 있음.|
|com/skcc/pms/support/data/IRecordSet.java|이 코드는 레코드 셋(2차원 테이블 데이터)를 관리하기 위한 인터페이스로, 레코드의 추가, 삭제, 조회, 변환 등과 같은 기능을 제공하고, IEnumerator를 이용한 순회, 페이지네이션, 레코드셋 복제, 특정 컬럼 기준으로 정렬 등 다양한 기능이 포함되어 있음.|
|com/skcc/pms/support/data/OnlineContextIncludedMap.java|OnlineContext를 포함하는 Map 객체를 구현하고, 내부에 포함된 Map 객체에 적용 가능한 메소드들을 제공함. 이를 통해 Map에 데이터를 저장, 조회, 삭제 등의 기능 수행 가능함.|
|com/skcc/pms/support/data/IOnlineContextIncluded.java|인터페이스로 'IOnlineContextIncluded'를 정의하고, 이를 활용해 'onlineContext'를 가져오고 설정하는 동작을 담당함.|
|com/skcc/pms/support/data/Code.java|다국어 지원을 위한 속성 정보를 관리하고, 해당 속성 정보(아이디, 그룹 아이디, 별칭, 값, 특성 등)를 다루는 가져오거나 설정하는 메소드를 제공함. 또한 특정 날짜가 유효한 사용 가능 기간인지를 판단하는 함수도 존재함.|
|com/skcc/pms/support/data/IOnlineContext.java|온라인 컨텍스트에 대한 인터페이스로, 트랜잭션 정보를 가져오는 기능, 사용자 정보를 가져오는 기능, 로케이션 정보를 가져오는 기능, 그리고 특정 키에 대한 속성 값을 가져오거나 설정하는 기능이 있음.|
|com/skcc/pms/support/data/Record.java|기본적으로 IRecord 레코드를 구현한 Record 클래스로, String, Integer, Short, Long, Float, Double 등의 다양한 데이터 타입을 처리한다. 값들을 ArrayList에 저장하며, 필요에 따라 레코드 세트를 추가, 제거, 검색하고 대체하는 등의 기능이 있다. 다음과 같은 기능들이 있다: 개별 레코드 값 추가, 레코드 세트 추가 및 제거, 레코드 값 조회 및 조작, 레코드 유효성 검증, 빈 레코드 여부 확인 등.|
|com/skcc/pms/support/data/BDate.java|문자열 형태의 날짜 데이터를 받아 다양한 형태로 변환, 연산하는 기능을 제공하는 클래스임. 오늘의 날짜 정보를 가진 개체를 생성하고, 이를 이용해 특정 날짜로 설정하거나, 특정 기간만큼의 날짜를 더하거나 뻄. 또한, 날짜 형식에 맞게 문자열로 변환하거나, 주어진 날짜가 해당 달의 몇 번째 주에 속하는지 계산하는 기능을 제공함. 주어진 날짜의 요일을 반환하거나, 날짜 문자열의 유효성을 검사하는 등 관련된 다양한 함수를 제공함.|
|com/skcc/pms/support/data/ITransaction.java|트랜잭션 ID를 가져오고 설정하는 메소드를 가진 인터페이스 정의임.|
|com/skcc/pms/support/data/OnlineContext.java|사용자 정보와 거래 정보를 저장 및 관리하고, 사용자의 로캘 정보를 반환하거나, 특정 키에 대한 속성 값을 가져오거나 설정하는 기능을 가진 'OnlineContext' 클래스임.|
|com/skcc/pms/support/data/IDataSet.java|주어진 키(key)에 대응하는 값을 불러오거나 설정하는 등, 데이터를 관리하고 전달하는 기능을 수행하는 인터페이스임. 이때, 데이터는 필드, 레코드셋, 메시지 등 여러 형태로 관리됨.|
|com/skcc/pms/support/data/Constants.java|당신의 프로젝트에 필요한 다양한 상수들을 선언하는 클래스임. 상수들은 세션 키, 사용자 정보 속성 키, 사용자 및 프로젝트 권한 코드, 진행 상태 코드, 호스트 정보, 라이선스 생성 키, 역할 코드 등 다양한 부분에 사용됨. 모든 상수들은 프로젝트 전반에 걸쳐 반복적으로 사용되는 고정된 값을 저장하기 위한 것임.|
|com/skcc/pms/support/data/Transaction.java|UUID를 이용해 고유한 요청 ID를 생성하고, 그 ID와 거래 ID를 관리하는 'Transaction' 클래스 구현임.|
|com/skcc/pms/support/data/user/UserInfo.java|사용자 정보를 저장하고, 사용자 계정 정보, IP 주소, 로그인 시간, 사용자 그룹 등과 같은 사용자 관련 정보를 설정하고 가져오는 기능을 제공하는 클래스임.|
|com/skcc/pms/support/data/user/IUserInfo.java|사용자 정보를 가져오고 설정하는 여러가지 메소드를 제공하는 인터페이스임.|
|com/skcc/pms/support/exception/BizRuntimeException.java|비즈니스 로직 수행 중 발생한 예외를 처리하기 위한 사용자 정의 RuntimeException을 구현하고, 메시지 ID와 파라미터를 관리함.|
|com/skcc/pms/api/ntm/bctestcase/BCNTMTestCaseController.java|스프링 프레임워크를 사용하여 작성된 웹 어플리케이션 컨트롤러로, 네트워크 테스트 방법론에서 상황, 사례, 결함 조회 및 타입 설정에 관한 웹 요청을 처리하고 이에 대한 응답을 생성하는 기능 수행.|
|com/skcc/pms/api/ntm/bctestcase/PUNTMTestCase.java|해당 코드는 테스트 시나리오, 테스트 케이스, 결함 목록을 가져오고, 테스트 타입과 하위 시스템을 설정하는 기능이 구현되어 있는 서비스입니다. 이러한 요청은 NTM (Network and Test Management) 시스템에 API 요청을 통해 수행되며, 각 Request는 '프로젝트 번호'를 기반으로 수행됩니다.|
|com/skcc/pms/api/ntm/bcproject/BCNTMProjectController.java|프로젝트와 하위 프로젝트를 추가, 업데이트, 삭제하는 API 기능을 제공하는 컨트롤러임.|
|com/skcc/pms/api/ntm/bcproject/Service.java|Service라는 이름의 어노테이션을 정의함.|
|com/skcc/pms/api/ntm/bcproject/PUNTMProject.java|주어진 프로젝트와 서브프로젝트에 대해 NTM (Network Traffic Manager) 시스템에 추가, 수정, 삭제 요청을 보내는 기능을 수행함. 각 요청은 서버에 전달되는 맵 형태의 데이터를 포함하며, 이 데이터는 각각의 프로젝트 및 서브프로젝트 정보로 이루어져 있음. 처리 결과는 IDataSet 객체로 반환됨.|
|com/skcc/pms/api/ntm/bcuser/PUNTMUser.java|사용자 리스트를 가져와 NTM에 동기화하고, 각 사용자를 특정 프로젝트에 맵핑하는 기능을 수행함. 이 과정 중에 오류가 발생하면 예외를 발생시킨다. 이 때 사용자 아이디의 길이가 4글자 이상인 경우에만 동기화와 맵핑을 진행함.|
|com/skcc/pms/api/ntm/bcuser/BCNTMUserController.java|스프링 프레임워크를 사용해 BCNTMUserController라는 이름의 컨트롤러를 정의하고, URL 매핑 '/api/ntm/BCNTMUserController'로 연결하며, 'pmUserSyncInNTM'이라는 메소드를 통해 'PUNTMUser' 서비스를 호출하는 기능 수행.|
