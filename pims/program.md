# 프로그램 명세서

## com/skcc/pms/PmsBootApplication.java
### PMS 시작 프로그램

#### 개요
- 클래스 : PmsBootApplication
- 스프링 부트 애플리케이션을 초기화하고 시작하는 메인 클래스다. 이 클래스는 SpringBootServletInitializer를 확장하여 웹 애플리케이션으로서 작동한다.

#### 메소드
##### main
- 프로그램의 시작점이다. SpringApplication.run 메소드를 호출하여 애플리케이션을 실행한다.
  
##### configure
- 애플리케이션의 설정 정보를 제공한다. SpringApplicationBuilder를 이용하여 소스 클래스로 'PmsBootApplication.class'를 사용하도록 설정한다.

#### 관련 클래스
- SpringApplication
- SpringApplicationBuilder
- SpringBootServletInitializer

#### 클래스 사용 방법
PmsBootApplication 클래스의 main 메소드를 호출하여 애플리케이션을 실행할 수 있다. configure 메소드는 애플리케이션의 설정을 변경하는데 사용할 수 있다.
---
## com/skcc/pms/EmbeddedTomcatConfiguration.java
### 내장 톰캣 설정 프로그램

#### 개요
- 클래스 : EmbeddedTomcatConfiguration
- 본 클래스는 스프링 부트 애플리케이션 내에서 내장된 톰캣 서버를 구성하고 커스터마이징하는 데 사용되는 Configuration 클래스입니다.

#### 메소드

##### tomcatFactory()
- 전용 톰캣 서버 웹 팩토리를 생성하고 설정된 컨텍스트를 후처리하는 기능입니다. ExtractingRoot와 같은 자원들을 컨텍스트 리소스로 설정합니다.

##### servletContainerCustomizer()
- 톰캣 서버 웹 팩토리를 커스터마이징하는 기능입니다. 이 메소드를 통해 톰캣 컨텍스트의 reloadable 속성을 false로 설정하므로, 자동 리로드 기능을 비활성화합니다.

#### 관련 클래스
- TomcatServletWebServerFactory
- ExtractingRoot
- WebServerFactoryCustomizer
- TomcatContextCustomizer

#### 클래스 사용 방법
해당 클래스는 spring boot 안에 내장된 톰캣 설정을 담당합니다. 해당 클래스 인스턴스를 생성하는 대신, Spring Boot 애플리케이션의 어떤 부분에서든지 클래스를 직접 참조해야합니다.
해당 클래스는 @Configuration 애너테이션이 지정되어 있으므로, Spring Boot가 실행될 때 자동으로 인정되고 해당 구성이 주입됩니다.
따라서 사용자가 명시적으로 인스턴스를 생성하거나 호출할 필요는 없습니다. 이 클래스의 정의와 설정된 애너테이션이 Spring Boot에 의해 자동 관리됩니다.
---
## com/skcc/pms/BinderControllerAdvice.java
### 바인더 컨트롤러 어드바이스

#### 개요
- 클래스 : BinderControllerAdvice
- 스프링 프레임워크에서 데이터 바인딩에 사용됩니다. 이 클래스는 공통적으로 적용되는 바인더 설정을 정의하고 있으며, 데이터를 바인딩할 때 특정 필드들의 접근을 제한하는 역할을 합니다.

#### 메소드
##### setAllowedFields
- setAllowedFields 메소드는 WebDataBinder 객체에 접근을 금지할 필드 목록을 설정합니다. class 혹은 Class로 시작하거나 class나 Class를 포함하는 필드 이름에 대해 접근을 차단합니다.

#### 관련 클래스
- WebDataBinder
- ControllerAdvice
- Order
- InitBinder

#### 클래스 사용 방법
BinderControllerAdvice 클래스는 @ControllerAdvice 어노테이션과 함께 사용되어, 프로젝트내의 모든 컨트롤러에 영향을 미칠 수 있는 전역 설정을 주는데 사용됩니다. 이 클래스를 통해 특정 필드에 대한 접근 제어를 할 수 있습니다. 이 클래스는 인스턴스로 생성된 후 setAllowedFields 메소드를 호출하여 접근 제어가 필요한 필드를 설정합니다.
---
## com/skcc/pms/configuration/DefaultConfiguration.java
### DefaultConfiguration 프로그램 명세서

#### 개요
- 클래스 : DefaultConfiguration
- 프로젝트의 기본 설정을 관리하는 클래스이며, 여러 Bean을 등록하고 설정하는 역할을 한다.

#### 메소드

##### initConfig()
- 프로그램의 초기 설정을 수행한다.

##### propertiesManager()
- PropertiesManager객체를 Bean으로 등록한다.

##### labelManager()
- LabelManager 객체를 Bean으로 등록한다.

##### labelUtils()
- LabelUtils 객체를 Bean으로 등록한다.

##### baseUtils()
- BaseUtils 객체를 Bean으로 등록한다.

##### codeUtils()
- CodeUtils 객체를 Bean으로 등록

##### bizDataUtil()
- BizDataUtil 객체를 Bean으로 등록한다.

##### fileManager()
- FileManager 객체를 Bean으로 등록한다.

##### batchManager()
- BatchManager 객체를 Bean으로 등록한다.

##### schedulerFactoryBean()
- SchedulerFactoryBeanWrapper 객체를 Bean으로 등록한다.

##### loginListener()
- LoginListener 객체를 Bean으로 등록한다.

##### jDBCUtil()
- JDBCUtil 객체를 Bean으로 등록한다.

##### getFilterRegistrationBean()
- 필터 설정을 담당하며 XssEscapeServletFilter 객체를 필터로 등록한다.

#### 관련 클래스
- PropertiesManager
- LabelManager
- LabelUtils
- BaseUtils
- CodeUtils
- BizDataUtil
- FileManager
- BatchManager
- SchedulerFactoryBeanWrapper
- LoginListener
- JDBCUtil
- XssEscapeServletFilter

#### 클래스 사용 방법
- DefaultConfiguration 클래스는 Bean 등록과 설정을 담당한다.
- 각 메소드를 호출하여 필요한 서비스 클래스를 Bean으로 등록하고 동일한 이름으로 불러와 사용할 수 있다.
- getFilterRegistrationBean() 메소드를 이용해서 필터 설정을 할 수 있다.
- 별도의 사용자 인터페이스는 제공하지 않으며 Spring 설정 파일에서 사용한다.
---
## com/skcc/pms/configuration/IeEmulateFilter.java
### IE호환성 보기 필터

#### 개요
- 클래스 : IeEmulateFilter
- 이 프로그램은 사용자의 브라우저가 인터넷 익스플로러일 경우, 호환성 보기 설정을 자동으로 변경하는 기능을 제공합니다. 그리고 엣지 모드로 설정하여 최신 웹페이지 기능을 사용할 수 있도록 돕습니다.

#### 메소드
##### destroy
- 필터가 웹 컨테이너에서 해제될 때 호출되는 메소드입니다.
##### doFilter
- 실제 필터로직이 수행되는 메소드입니다. 클라이언트의 요청을 받아 User-Agent 헤더를 확인하고, 만약 IE일 경우(즉 User-Agent가 "MSIE"나 "Trident"를 포함하고 있다면), 응답 헤더를 "X-UA-Compatible" 이하 "IE=Edge" 로 설정함.
##### init
- 서블릿 필터가 웹 컨테이너에 의해 인스턴스화 될 때 호출되는 메소드입니다.

#### 관련 클래스
- Filter, FilterChain, FilterConfig, ServletException, ServletRequest, ServletResponse, HttpServletRequest, HttpServletResponse, StringUtils

#### 클래스 사용 방법
이 클래스를 사용하려면 웹 애플리케이션에 필터로 등록해야 합니다. 해당 필터는 모든 요청("/*")에 적용됩니다. 클라이언트가 요청을 보내면, 이 필터는 클라이언트의 브라우저가 IE인지 확인하고, 만약 IE라면 호환성 보기를 자동으로 변경합니다.
---
## com/skcc/pms/boot/config/CustomContainer.java
### 커스텀 컨테이너 설정

#### 개요
- 클래스 : CustomContainer
- 이 클래스는 TomcatServletWebServerFactory를 커스터마이즈하는 컴포넌트입니다. 즉, TomcatServletWebServerFactory의 설정을 원하는 대로 변경할 수 있습니다.

#### 메소드
##### customize()
- 이 메소드는 TomcatServletWebServerFactory의 설정을 변경하는 역할을 합니다. factory의 jsp 초기 설정 파라미터에 'mappedfile'을 'false'로 설정합니다. 이는 파일 매핑을 비활성화하는 설정입니다.

#### 관련 클래스
- TomcatServletWebServerFactory
- WebServerFactoryCustomizer

#### 클래스 사용 방법
이 클래스는 '@Component' 어노테이션이 붙어있어서 Spring이 자동으로 빈으로 관리합니다. 따라서 별도의 사용 방법은 없고, Spring Boot 애플리케이션에 포함되어 있으면 Spring이 알아서 사용합니다. TomcatServletWebServerFactory 설정 변경이 필요한 경우 이 클래스 안에서 원하는 설정을 바꿀 수 있습니다.
---
## com/skcc/pms/boot/config/ContextConfig.java
### 컨텍스트 설정 프로그램

#### 개요
- 클래스 : ContextConfig
- 이 클래스는 다른 XML 설정 파일들을 임포트하여 전체 애플리케이션에 공유되는 bean의 설정을 제공하는 역할을 합니다.

#### 메소드
해당 클래스에서는 Spring Framework의 어노테이션들을 사용하기 때문에 기본적으로 상속받는 어노테이션들을 제외하면 별도의 메소드를 가지고 있지 않습니다.

##### 관련 클래스
- @Configuration: 클래스가 하나 이상의 @Bean 메소드를 제공하며, 런타임에 Spring 컨테이너가 Bean 정의를 생성하고 서비스 요청을 위해 이를 관리하게 됨을 나타내는 클래스 레벨 어노테이션
- @ImportResource: 클래스패스 또는 파일 시스템에서 하나 이상의 XML 구성 파일을 가져오는데 사용

#### 클래스 사용 방법
1. 해당 클래스를 스프링 프로젝트의 구성 파일 중 하나로 추가합니다.
2. 필요로 하는 XML 구성 파일을 @ImportResource 어노테이션의 값으로 추가합니다.
3. 스프링 프로젝트가 시작될 때, 설정된 XML들이 임포트되며, 해당 XML에 명시된 Bean이 생성되어 사용 가능하게 됩니다.
---
## com/skcc/pms/security/SecurityConfig.java
### 보안 설정 프로그램

#### 개요
- 클래스 : SecurityConfig
- Keycloak 기반의 보안 설정 프로그램. KeycloakAuthenticationProvider를 인증 관리자에서 사용하여 인증 처리를 하게 하고, Keycloak 설정을 사용한다. HTTP 보안설정을 통해 각 경로의 접근 권한을 설정한다.

#### 메소드
##### configureGlobal
- KeycloakAuthenticationProvider를 등록하여 인증을 처리한다.
##### sessionAuthenticationStrategy
- 세션 인증 전략을 반환한다.
##### keycloakConfigResolver
- application.properties의 프로퍼티를 사용하여 Keycloak 설정을 반환한다.
##### configure
- 인증 요청 및 인증 제외 항목을 설정한다. 또한 Cross Site Request Forgery(CSRF), Cross-Origin Resource Sharing(CORS) 설정, 헤더 설정 등의 보안 설정을 진행한다.

#### 관련 클래스
- KeycloakAuthenticationProvider
- AuthenticationManagerBuilder
- SessionAuthenticationStrategy
- HttpSecurity
- WebSecurity

#### 클래스 사용 방법
- SecurityConfig 클래스는 애플리케이션의 보안 설정을 담당하는 클래스이다. 이 클래스를 사용하기 위해서는 Keycloak 인증 제공자를 설정하고, 세션 인증 전략을 설정하는 등의 과정이 필요하다. 각 URL 경로에 대한 접근 권한 설정 등의 보안 설정을 통해 애플리케이션의 보안을 유지할 수 있다.
---
## com/skcc/pms/security/CustomKeycloakSpringBootConfigResolver.java
### 보안 설정 프로그램

#### 개요
- 클래스 : CustomKeycloakSpringBootConfigResolver
- 이 클래스는 Keycloak의 Spring Boot 구성을 더욱 자동화하고 개별화하기 위한 기능을 제공한다. CustomKeycloakSpringBootConfigResolver 클래스는 KeycloakSpringBootConfigResolver를 상속받으며, KeycloakSpringBootProperties를 명시적으로 불러올 수 있게 해준다.

#### 메소드
##### CustomKeycloakSpringBootConfigResolver
- 이 메소드는 KeycloakSpringBootProperties를 인자로 받아 KeycloakDeployment를 생성한다. KeycloakDeploymentBuilder를 통해 KeycloakSpringBootProperties의 구성값을 기반으로 KeycloakDeployment를 빌드한다.

##### resolve
- 이 메소드는 KeycloakDeployment 객체를 반환한다. 인자로 HttpFacade.Request 객체를 받아 처리한다. 

#### 관련 클래스
- KeycloakSpringBootConfigResolver
- KeycloakSpringBootProperties
- KeycloakDeploymentBuilder
- KeycloakDeployment
- HttpFacade

#### 클래스 사용 방법
CustomKeycloakSpringBootConfigResolver 클래스는 Spring Boot 애플리케이션의 보안 설정에 사용된다. Keycloak인증을 위한 설정을 KeycloakSpringBootProperties를 인자로 받아서 빌드한다. 이를 통해 KeycloakDeployment 인스턴스를 만들어낸다. 이 인스턴스는 HTTP 요청을 처리하는데 사용될 수 있다.
---
## com/skcc/pms/security/controllers/JWTUtil.java
### JWT 토큰 추출기

#### 개요
- 클래스 : JWTUtil
- 이 클래스는 JWT 토큰을 추출하여 반환하는 기능을 수행합니다.

#### 메소드
##### getJWTToken
- 현재를 인증 정보에서 JWT 토큰을 가져와 문자열로 반환합니다.

##### 관련 클래스
- KeycloakAuthenticationToken
- KeycloakPrincipal
- KeycloakSecurityContext

#### 클래스 사용 방법
JWT 토큰을 가져오려면 `getJWTToken` 메소드를 호출하면 됩니다. 이 메소드는 현재 인증 토큰에서 JWT 토큰을 가져와 해당 토큰 값을 문자열로 반환합니다. 
예) `String token = JWTUtil.getJWTToken();`
---
## com/skcc/pms/security/controllers/TokenController.java
### 토큰 생성기

#### 개요
- 클래스 : TokenController
- 이 클래스는 JWT 토큰을 생성하여 반환하는 역할을 하는 컨트롤러입니다.

#### 메소드
##### getToken()
- 이 메소드는 JWT 토큰을 반환합니다. 이 메소드는 '/token' URL로 요청이 왔을 때 실행됩니다.

##### 관련 클래스
- JWTUtil

#### 클래스 사용 방법
이 클래스를 사용하는 방법은 간단합니다. 이 클래스는 Spring Framework의 컨트롤러이므로 웹서버에 배포 후, 클라이언트는 '/token' URL로 GET 요청을 보냅니다. 그러면 서버는 JWT 토큰을 생성하여 클라이언트에게 반환합니다. 이 JWT 토큰은 향후 서버에 요청을 보낼 때 인증 정보로 사용될 수 있습니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicallitslinkcontroller/BCITSLinkController.java
### IT 이슈 관리 프로그램

#### 개요
- 클래스 : BCITSLinkController
- IT 이슈에 대해 관리하는 API를 제공하는 컨트롤러 클래스

#### 메소드
##### pmUpdateITSIssue
- 이슈 정보를 갱신하는 Method. 입력 파라미터를 받아 이슈 정보를 업데이트한다.

##### pmChargerUpd
- 이슈 담당인 업데이트를 담당하는 Method. 입력 파라미터를 이용해 이슈 담당인을 업데이트한다. 

##### pmIssueStateUpd
- 이슈 상태 업데이트를 담당하는 Method. 입력 파라미터를 받아 이슈의 상태를 업데이트한다.

#### 관련 클래스
- PUITSLink service

#### 클래스 사용 방법
- 이 클래스는 API 요청을 받아서 로직을 실행하고 결과를 반환하는 역할을 한다. 
- 각 메서드는 Map<String, String> 타입의 파라미터를 입력 받아서 요청을 처리하고, 결과 정보를 Map 형태로 반환한다.
- 각 메소드느 ResponseEntity를 반환하여 HTTP 요청에 대한 응답을 커스텀하게 설정하고 있다. 
- 이 클래스를 사용하려면 해당 API를 호출하는 클라이언트 애플리케이션 또는 시스템이 필요하며, API 요청 시 필요한 파라미터를 설정해야 한다. 

---
## com/skcc/pms/bizcomponent/apicall/bcapicallitslinkcontroller/PUITSLink.java
### 이슈 링크 업데이트

#### 개요
- 클래스 : PUITSLink
- 이 클래스는 서버 요청에 응답하여, 이슈 상태 업데이트, 이슈 진행율 업데이트, 이슈 완료 업데이트 등의 기능을 지원하는 IT 서비스 링크 업데이트 클래스입니다.

#### 메소드
##### pmUpdateProgressIssue
- 이 메소드는 특정 이슈의 진행 상황을 업데이트합니다.
##### pmUpdateCompleteIssue
- 이 메소드는 특정 이슈의 완료 상태를 업데이트합니다.
##### pmChargerUpd
- 이 메소드는 담당자 정보를 업데이트합니다.
##### pmUpdateITSIssue
- 이 메소드는 IT 이슈를 업데이트합니다.
##### pmIssueStateUpd
- 이 메소드는 이슈의 상태를 업데이트합니다.

#### 관련 클래스
- Class DUITSLink: 해당 클래스를 통해 DB 작업을 처리합니다.

#### 클래스 사용 방법
이 클래스는 주로 이슈의 상태를 업데이트하는 데 사용됩니다. 각 메소드에는 이슈 관련 정보를 담고 있는 매개변수가 있습니다. 가령, 'pmUpdateProgressIssue' 메소드의 경우 requestData와 onlineCtx 두 개의 매개변수를 가지고 있으며, requestData에는 업데이트할 이슈의 정보가, onlineCtx에는 유저 정보가 들어있습니다. 또한, 클래스 내부에서는 DB 작업을 처리하는 DUITSLink 클래스를 통해 필요한 데이터를 가져오거나 업데이트하는 작업을 수행합니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicallitslinkcontroller/DUITSLink.java
### 프로그램명: DUITSLink 

#### 개요
- 클래스 : DUITSLink
- 이 클래스는 특정 이슈를 업데이트하고 관리하는 역할을 하는 클래스입니다. 주요 기능으로는 이슈 업데이터, 이슈 업데이트 상태 변경 등이 있습니다.

#### 메소드
##### ChargerUpd
- 입력 매개변수 중 "issue_id", "project_no", "deop_task_assignee"를 이용하여 이슈 관리자 업데이트를 수행합니다.

##### UpdateITSIssue
- 여러 입력 매개변수를 이용하여 IT 이슈를 업데이트합니다. 이 메소드는 이슈의 상세 내용, 이슈의 주인, 예정된 시작 및 종료 날짜, 우선순위, 스프린트 아이디 등을 업데이트한다.

#### 관련 클래스
- DataUnit
- HttpServletRequest
- List, Map, HashMap
- SimpleDateFormat

#### 클래스 사용 방법
1. DUITSLink 객체를 생성합니다.
2. 파라미터로 HashMap을 사용하는 이슈 업데이트 메소드를 호출하여 이슈를 업데이트 합니다.
3. 반환된 결과를 확인합니다.
  
참고: 이 클래스는 레파지토리로 선언되어 있으므로, 해당 클래스를 스프링 빈에 주입하여 사용할 수 있습니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicallqmslinkcontroller/BCQmsLinkController.java
### QMS 링크 컨트롤러

#### 개요
- 클래스 : BCQmsLinkController
- 본 클래스는 Spring에서 사용되는 컨트롤러로 하나의 웹 요청을 처리하는 역할을 수행합니다. BCQmsLinkController는 Quality Management System(QMS)의 링크를 관리하며, 이를 처리하는 메소드를 포함하고 있습니다.

#### 메소드
##### pmCheckLinkQMS
- 이 메소드는 QMS 링크가 정상적으로 작동하는지 확인하기 위해 사용됩니다.

##### pmUpdateInspectionQMS
- 해당 메소드는 권장되지 않으며, 종래의 검사 정보를 업데이트하는 데 사용되었습니다. 이제는 pmGetInspectionQMS 메소드를 사용해 직접 호출되지 않습니다.

##### pmGetInspectionQMS
- 이 메소드는 QMS에서 PMS로 검사 결과를 가져오는 역할을 수행합니다.

#### 관련 클래스
- PUQmsLink

#### 클래스 사용 방법
이 클래스는 Spring Framework에서 사용하는 Controller로, @Controller 어노테이션을 이용하여 등록됩니다. @RequestMapping 어노테이션을 통해 요청 URL과 연결되고, 각 메소드는 요청을 처리하는 역할을 수행합니다. 데이터를 받아서 처리하려면 @RequestBody 어노테이션이 필요하며, 해당 메소드의 요청이 오면 연결된 서비스의 메소드를 실행하여 결과를 반환합니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicallqmslinkcontroller/PUQmsLink.java
### QMS 연계 컨트롤러

#### 개요
- 클래스 : PUQmsLink
- API를 통해 데이터를 가공하고 DB와 연계하는 기능을 담고있는 클래스

#### 메소드
##### pmCheckLinkQMS
- API로부터 받아온 데이터를 DB에 저장하는 메소드
##### pmUpdateInspectionQMS
- 질서 보장 검사(QMS) 정보를 업데이트하는 메소드
##### pmGetInspectionQMS
- 질서 보장 검사(QMS) 정보를 불러오는 메소드

#### 관련 클래스
- DUQmsLink
- IFServiceDao
- IFServiceVo
- ServiceHttpClient
- HttpResposeWork
- GetMethod
- PostMethod
- IDataSet
- IOnlineContext

#### 클래스 사용 방법
- pmCheckLinkQMS 메소드는 API로부터 받아온 데이터를 DB에 저장하기 위해 사용하고, 이와 관련된 세부 작업은 DUQmsLink 클래스와의 연계로 처리한다.
- pmUpdateInspectionQMS 메소드는 QMS의 검사 정보를 업데이트하기 위해 사용한다. 업데이트 내용은 API에서 제공받은 정보를 바탕으로 한다.
- pmGetInspectionQMS 메소드는 QMS의 검사 정보를 요청하는데 사용한다. 요청 정보는 API를 통해 받아온다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicallqmslinkcontroller/DUQmsLink.java
### 프로그램 명세서

#### 개요
- 클래스 : DUQmsLink
- DUQmsLink 클래스는 데이터베이스와 연관된 여러 가지 메소드를 포함하여 구성되어 있습니다. 이는 데이터베이스에서 레코드를 가져오거나, 데이터베이스의 레코드를 수정, 등록, 삭제하는 등의 다양한 연산을 수행하게 됩니다. 

#### 메소드
##### getLv1TypeNameCount
- 레벨1 유형 이름 개수를 반환합니다.
##### getLv1TypeCodeByParentTypeName
- 부모 이름으로 레벨1 유형 시퀀스를 반환합니다.
##### getLv1TypeTotalCnt
- 레벨1 유형의 전체 개수를 반환합니다.
##### getLv2TypeCntByLv1Code
- 레벨1 유형 코드를 가지고 있는 레벨2 유형의 개수를 반환합니다.
... (나머지 메소드는 양식에 맞게 반복)

#### 관련 클래스
- DataUnit
- IOnlineContext
- IRecordSet

#### 클래스 사용 방법
DUQmsLink 클래스의 메소드들은 주로 dbSelect, dbInsert, dbUpdate, dbDelete 등의 메소드를 사용하여 데이터베이스와 상호작용을 합니다. 이를 통해 데이터베이스에서 정보를 가져오거나, 데이터베이스에 정보를 입력/수정/삭제하는 등의 작업을 수행합니다.

예를 들어, getLv1TypeNameCount 메소드는 다음과 같이 이용됩니다.
```java
DUQmsLink duQmsLink = new DUQmsLink();
Map<String, Object> paramMap = new HashMap<>();
paramMap.put("key", "value");
IOnlineContext onlineCtx = getOnlineContext();
int count = duQmsLink.getLv1TypeNameCount(paramMap, onlineCtx);
```

이 코드는 paramMap에 key-value 쌍을 추가하고, DUQmsLink의 getLv1TypeNameCount 메소드를 이용해 레벨1 유형 이름의 개수를 가져옵니다. IOnlineContext는 현재 라이브 버전에서의 컨텍스트 정보를 반환하는 메소드입니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BCTmsLinkController.java
### 동기화 API 콘트롤러

#### 개요
- 클래스 : BCTmsLinkController
- 본 클래스는 TMS(Link Test Management System)를 위한 함수들을 포함하고 있는 컨트롤러로, 요청 데이터를 처리하고 정보들을 동기화하는 역할을 합니다.

#### 메소드
##### pmTestTypeSyncTMS
- 유형 동기화를 처리하는 메소드입니다.
##### pmTestSceSyncTMS
- 유형-시나리오 동기화를 처리하는 메소드입니다.
##### pmTestSceSyncByTypeTMS
- 유형별 유형-시나리오 동기화를 처리하는 메소드입니다.
##### pmTestExecCoverageTMS
- 수행집계 동기화를 처리하는 메소드입니다.
##### pmTestDefectCoverageTMS
- 결함집계 동기화를 처리하는 메소드입니다.
##### pmTestScePMS
- 시나리오 정보 접근을 위한 메소드입니다.
##### pmTestTypePMS
- 유형 정보 접근을 위한 메소드입니다.
##### pmTestSyncYNPMS
- 동기화 여부를 확인하는 메소드입니다.

##### 관련 클래스
- PUTmsLink

#### 클래스 사용 방법
클래스 인스턴스를 생성한 뒤, 각 메소드를 호출하여 원하는 동기화 작업을 수행합니다. 각 메소드는 요청 데이터(`requestData`)와 온라인 콘텍스트(`onlineCtx`)를 인자로 받으며, 동기화 처리 결과를 `IDataSet` 형태로 반환합니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BatTmsTestExecProgressRepository.java
### TMS 테스트 진행상황 관리 프로그램

#### 개요
- 클래스 : BatTmsTestExecProgressRepository
- BatTmsTestExecProgressRepository 클래스는 TMS 테스트의 진행 상황을 저장하고 관리하는 역할을 한다. 

#### 메소드
##### save
- BatTmsTestExecProgress 객체와 IOnlineContext 객체를 매개변수로 받아 update와 insert 작업을 수행한다. "DUTmslink.U001_tb_bat_tms_testexecprogess"를 추가로 매핑하고, 만약 update 결과가 없을 경우에는 "DUTmslink.I001_tb_bat_tms_testexecprogess"를 매핑하여 insert 작업을 수행한다.

#### 관련 클래스
- BatTmsTestExecProgress
- IOnlineContext

#### 클래스 사용 방법
먼저 BatTmsTestExecProgressRepository 인스턴스를 생성한다. 이후 save 메소드를 통해 BatTmsTestExecProgress 객체와 IOnlineContext 객체를 매개변수로 넘겨주면 된다. 이때 update 작업이 실패하면 insert 작업이 수행되므로 테스트 진행 상황 정보가 안전하게 저장된다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/PUTmsLink.java
### 테스트 관리 프로그램

#### 개요
- 클래스 : PUTmsLink

이 프로그램은 테스트 유형 동기화에 대한 구현 및 테스트 결과에 대한 동기화를 실행하는 기본 클래스입니다.

#### 메소드
##### pmTestTypeSyncTMS
- TMS(test management system)에서 받은 테스트 유형 데이터에 대해 동기화를 진행합니다.
  
##### pmTestTypeSyncByCodeTMS
- 코드를 기준으로 TMS에서 받은 테스트 유형 데이터에 대한 동기화를 진행합니다. 

##### pmTestSceSyncTMS
- 테스트 시나리오에 대한 동기화를 진행합니다.

##### pmTestSceSyncByTypeTMS
- 테스트 유형별 시나리오에 대한 동기화를 진행합니다.

##### pmTestExecCoverageTMS
- 테스트 수행 집계에 대한 커버리지를 업데이트합니다.

##### pmTestDefectCoverageTMS
- 결함 집계에 대한 커버릿지를 업데이트합니다.

##### pmProjectSyncTMS
- 프로젝트의 연계여부를 확인합니다.

##### pmTestScePMS
- PMS에 테스트 시나리오를 저장합니다.

또한, 추가적으로 테스트 유형 검색, 동기화 확인 등의 메소드를 제공하며, 이러한 메소드는 테스트 데이터 관리 및 테스트 실행 상황을 동기화 하는데 사용됩니다.

#### 관련 클래스
- DUTmsLink
- DUTestManagerforTMS
- IFServiceDao

#### 클래스 사용 방법
주어진 메소드를 호출하여 TMS와의 테스트 데이터 동기화를 진행합니다. 예를 들어 pmTestTypeSyncTMS 메소드는 TMS로부터 테스트 유형 데이터를 동기화하려할 때 사용됩니다. 이러한 메소드 호출에 필요한 매개 변수는 테스트 유형 또는 테스트 시나리오 등 동기화하려는 테스트 데이터에 따라 결정됩니다. 클래스 내부에서는 주로 TMS 데이터를 처리하고 동기화하는데 필요한 기능이 구현되어 있으며, 이를 통해 TMS의 테스트 데이터를 다루는 과정을 단순화할 수 있습니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/DUTmsLink.java
### TMS 링크 프로그램

#### 개요
- 클래스 : DUTmsLink
- 이 클래스는 TMS(Test Management System)와 PMS(Project Management System)의 정보를 연동하고 관리하는 기능을 구현한 것입니다. 

#### 메소드
##### getLv1TypeNameCount
- 레벨1 유형 이름의 개수를 가져옵니다.

##### getLv1TypeCodeByParentTypeName
- 부모 이름으로 레벨1 유형의 시퀀스를 가져옵니다.

##### getLv1TypeTotalCnt
- 레벨1 유형의 전체 개수를 가져옵니다.

##### getLv2TypeCntByLv1Code
- 레벨1 유형 코드를 가진 레벨2 유형의 개수를 가져옵니다.

##### getLv1TypeNameByTmsUid
- 레벨1 TMSUID를 가진 PMS 유형 이름을 가져옵니다.

##### getLv2TypeSequenceByTmsUid
- 레벨2 TMSUID를 가진 PMS 유형의 시퀀스를 가져옵니다.

##### getCodeByLv1CodeAndTypeName
- 레벨1 유형 코드와 코드 이름이 같은 유형 코드를 가져옵니다.

##### getCodeInfo
- 유형 코드와 코드 이름이 같은 코드 정보를 가져옵니다.

##### selectTestTypeSequenceSetting
- 테스트 타입 시퀀스 설정을 조회합니다.

##### insertTestTypeSetting
- 테스트 타입 설정을 삽입합니다.

##### updateTestTypeSetting
- 테스트 타입 설정을 업데이트합니다.

##### getNewSceUidOfTestforsce
- 테스트 시나리오에 대한 새로운 sce_uid를 생성합니다.

##### getParentUidByTmsParentId
- TMS 부모 ID로 PMS 부모 UID를 가져옵니다.

##### getTestfortmsCountByTmsId
- TMS ID를 통해 testfortms에 등록된 데이터가 있는지 확인합니다.

##### getTestTypeSequenceByTmsTypeId
- TMS 타입 UID로 test_type_sequence_setting에 test_sequence 값을 가져옵니다.

##### getTestforsceByTmsSceUid
- TMS 시나리오 UID로 sce_uid 정보를 가져옵니다.

##### getWBSRecursiveInfo
- WBS 재귀 정보를 가져옵니다.

##### updateTestfortms
- testfortms 정보를 수정합니다.

##### insertTestfortms
- testfortms 테이블에 정보를 입력합니다.

##### deleteTestfortms
- testfortms 테이블 정보를 삭제합니다.

##### settingWBS
- WBS 설정을 수행합니다.

##### excuteFunctionTmsSync
- TMS 동기화 기능을 실행합니다.

##### 기타 다수의 메소드
- TMS 및 PMS 관련 정보 조회, 수정, 삭제, 생성 등의 작업을 수행하는 메소드들이 포함되어 있습니다.

#### 관련 클래스
- DataUnit
- IOnlineContext
- IRecordSet

#### 클래스 사용 방법
본 클래스는 TMS와 PMS의 연동 및 관리에 필요한 메소드와 기능을 포함하고 있습니다. 메소드를 이용하여 TMS와 PMS 사이의 데이터를 동기화하거나, 특정 데이터를 조회, 수정, 삭제하거나 새로운 데이터를 생성할 수 있습니다. 각 메소드는 파라미터로 Map<String,Object> 타입의 paramMap과 IOnlineContext 타입의 onlineCtx를 받아 사용합니다. 사용 예시는 아래와 같습니다.

```
// DUTmsLink 인스턴스 생성
DUTmsLink duTmsLink = new DUTmsLink();

// 메소드를 사용하여 원하는 작업 수행
int lv1TypeNameCount = duTmsLink.getLv1TypeNameCount(paramMap, onlineCtx);
```
추가적으로, 필요에 따라 각 메소드의 반환값을 변수에 저장하여 사용할 수 있습니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BatTmsTestExecProgress.java
### 테스트 실행 진행 정보

#### 개요
- 클래스 : BatTmsTestExecProgress
- 이 클래스는 테스트 실행 진행 정보를 저장하며, 모든 필드에 대해 getter 및 setter 메서드를 포함하고 있습니다.

#### 메소드
##### getId, setId
- id 필드를 읽거나 설정하는 데 사용됩니다.
##### getIdGroup, setIdGroup
- idGroup 필드를 읽거나 설정하는 데 사용됩니다.
##### getIdGroupTime, setIdGroupTime
- idGroupTime 필드를 읽거나 설정하는 데 사용됩니다.
##### getCrtr_id, setCrtr_id
- crtr_id 필드를 읽거나 설정하는 데 사용됩니다.
##### getCrtr_dt, setCrtr_dt
- crtr_dt 필드를 읽거나 설정하는 데 사용됩니다.
...(위 메소드 설명에 대한 패턴을 나머지 모든 get,set 메소드에 적용)

##### 관련 클래스
- ZonedDateTime : 날짜와 시간을 표현하는 클래스입니다.

#### 클래스 사용 방법
객체를 생성한 후 원하는 필드에 대해 getter 및 setter 메소드를 호출하여 필드 값을 읽거나 설정할 수 있습니다.
```java
BatTmsTestExecProgress execProgress = new BatTmsTestExecProgress();
execProgress.setId("testId");
String id = execProgress.getId(); // "testId"
```

---
## com/skcc/pms/bizcomponent/apicall/bcapicalltmslinkcontroller/BatTmsTestExecProgressService.java
### 테스트 진행 관리 프로그램

#### 개요
- 클래스 : BatTmsTestExecProgressService
- 이 클래스는 테스트 관리 시스템(TMS)의 테스트 실행 진행 상황을 관리하는 서비스를 제공합니다. 주요 기능은 저장 및 엔티티 변환이며, 저장은 일련의 요소를 받아서 양식에 맞게 저장하는 기능이고, 엔티티 변환은 주어진 맵을 TMS 테스트 실행 진행 상황 클래스로 변환하는 기능입니다.

#### 메소드
##### saveFromMapList
- 이 메소드는 맵 리스트를 받아 UUID와 타임스탬프 정보를 첨부하여 TMS 테스트의 실행 진행 상황을 데이터베이스에 저장합니다.
##### mapToYourEntity
- 이 메소드는 주어진 맵을 TMS 테스트 실행 진행 상황 클래스 인스턴스로 반환합니다.
##### convertToString
- 이 메소드는 값의 널 여부를 확인하고, 해당 값을 문자열 형태로 변환합니다.

##### 관련 클래스
- BatTmsTestExecProgress
- BatTmsTestExecProgressRepository

#### 클래스 사용 방법
- BatTmsTestExecProgressService 클래스는 스프링의 서비스로, Autowired 어노테이션을 통해 스프링 IoC 컨테이너에서 자동으로 주입될 수 있습니다.
- saveFromMapList 메소드를 사용하여 데이터를 저장할 수 있고, mapList 파라미터에 저장할 데이터의 맵을 넘겨주어야 합니다. 
- 세부적인 데이터 변환은 mapToYourEntity 메소드를 통해 수행되며, 이 메소드는 직접 호출하는 대신 saveFromMapList 메소드에 의해 내부적으로 호출됩니다.
- convertToString 메소드는 데이터를 문자열로 변환해주는 부수적인 메소드로, mapToYourEntity 메소드에서 내부적으로 사용됩니다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicallportallinkcontroller/BCPortalLinkController.java
### API 포털 링크 컨트롤러

#### 개요
- 클래스 : BCPortalLinkController
- 이 클래스는 Spring에서 Controller 역할을 하는 클래스로, 알람 메시지 전송 기능을 가진 웹 API를 제공한다.

#### 메소드
##### sendAlarmMessage
- 이 메소드는 알람 메시지를 전송하는 메소드입니다. 인자로 프로젝트 번호(projectNo), 전송 메시지(snd_msg), 전송 요청 아이디(snd_req_id), 서비스 제공 유저 아이디(sp_uid), 태그(tag)를 요구하고, 이를 기반으로 알람 메시지를 전송한다.

#### 관련 클래스
- PUPortalLink : 주입된 서비스 클래스로 'sendAlarmMessageById' 메서드를 통해 메시지 전송 기능을 수행한다.

#### 클래스 사용 방법
객체를 생성한 후 sendAlarmMessage 메소드를 호출하여 알람 메시지를 전송한다. 이때 메소드에는 해당 프로젝트의 번호, 알람 메시지, 요청 아이디, 사용자 아이디, 태그를 파라미터로 전달해야 한다.
---
## com/skcc/pms/bizcomponent/apicall/bcapicallportallinkcontroller/PUPortalLink.java
### 포탈 링크 제어

#### 개요
- 클래스 : PUPortalLink
- 이 클래스는 프로젝트에서 사용하는 포탈 링크를 제어합니다. 서비스에서 필요한 환경변수를 설정하고 알림 메시지를 전송합니다.

#### 메소드
##### sendAlarmMessageById
- 특정 프로젝트의 요청자 ID에로 알람 메시지를 전송하는 기능입니다. 서비스 포탈 UID와 관련태그를 포함하여 메시지를 보내는 경우에 사용됩니다.
##### sendAlarmMessage
- 프로젝트 번호, 전송 메시지, 요청자 ID, 서비스 포탈 UID, 관련태그를 인자로 받아, 해당 프로젝트에 알람 메시지를 전송하는 기능입니다. 이 메소드는 알람 메시지가 Slack 방식으로 전송되도록 구성되어 있습니다.

##### 관련 클래스
- DUITSLink
- Environment
- RestTemplate

#### 클래스 사용 방법
1. 우선 PUPortalLink 객체를 생성합니다.
2. 필요한 경우, setEnvironment 메소드를 사용하여 환경변수를 설정합니다.
3. 알람 메시지를 전송하려면 sendAlarmMessage 또는 sendAlarmMessageById 메소드를 사용합니다.
4. 전송에 필요한 파라미터로는 프로젝트 번호, 알림 메시지, 요청자 ID, 서비스 포탈 UID, 관련 태그가 있습니다.
5. 메시지 전송 결과는 Map 형태로 반환되며 상태값과 메시지 본문을 포함하고 있습니다.
---
## com/skcc/pms/bizcomponent/tok/bctokmain/DUTokMain.java
### 프로젝트 목록 조회

#### 개요
- 클래스 : DUTokMain
- 프로젝트 목록 조회 관련 기능을 제공하는 클래스로, 데이터베이스에서 실행 중인 프로젝트 목록을 조회하는 기능을 포함하고 있다.

#### 메소드
##### dmCurrentProjectListInq
- requestData와 onlineCtx를 입력받아, 현재 실행 중인 프로젝트 목록을 데이터베이스에서 조회하여 반환한다.

##### 관련 클래스
- IDataSet
- IOnlineContext

#### 클래스 사용 방법
DUTokMain 클래스의 인스턴스를 생성한 후, dmCurrentProjectListInq 메소드를 호출하여 현재 실행 중인 프로젝트 목록을 확인할 수 있다. 이때, 메소드에는 requestData와 onlineCtx 두 가지 인자가 필요하다.
---
## com/skcc/pms/bizcomponent/tok/bctokmain/BCTokMainController.java
### 프로젝트 관리 컨트롤러

#### 개요
- 클래스 : BCTokMainController
- 스프링 프레임워크 기반으로 개발한 웹 어플리케이션의 컨트롤러로, 웹 요청 및 응답을 관리하며, 비즈니스 로직 호출 작업을 수행한다. 

#### 메소드
##### pmCurrentProjectListInq
- 요청 데이터와 컨텍스트 정보를 기반으로 현재 진행 중인 프로젝트 리스트를 조회하는 서비스 메소드를 호출하고, 그 결과를 반환한다.

##### 관련 클래스
- PUTokMain : 서비스 메소드 호출을 위한 클래스, BCTokMainController의 의존성으로 주입받는다.

#### 클래스 사용 방법
'@Autowired' 어노테이션을 사용하여 PUTokMain 서비스를 주입받고, 이를 이용해 'pmCurrentProjectListInq' 메소드를 호출한다. 이때, HTTP 요청 바디로부터 받은 요청 데이터와 온라인 컨텍스트를 파라미터로 전달한다. 서비스 메소드의 반환 값은 콘트롤러를 통해 사용자에게 반환된다.
---
## com/skcc/pms/bizcomponent/tok/bctokmain/PUTokMain.java
### 프로젝트 관리 시스템

#### 개요
- 클래스 : PUTokMain
- 이 클래스는 데이터베이스에서 사용 가능한 프로젝트 목록을 요청하고 그 결과를 반환하는 역할을 합니다. 

#### 메소드
##### pmCurrentProjectListInq
- 이 메소드는 현재 사용 가능한 프로젝트 리스트를 조회하는데 사용됩니다. 입력 파라미터는 사용자 요청 데이터(requestData)와 온라인 컨텍스트 정보(onlineCtx)입니다. 처리 결과는 responseData에 담겨 반환됩니다. 

#### 관련 클래스
- DUTokMain

#### 클래스 사용 방법
PUTokMain 객체를 생성하고, pmCurrentProjectListInq 메소드를 호출하여 사용할 수 있다. 메소드 호출 시 IRequestData와 IOnlineContext 인스턴스를 인자로 전달해야 한다. 전달 받은 메소드가 처리된 후, 그 결과는 IDataSet 형태로 반환된다. 사용 예는 다음과 같다.
```java
IDataset requestData = new Dataset();
IOnlineContext onlineCtx = new OnlineContext();
PUTokMain puTokMain = new PUTokMain();
IDataSet resultData = puTokMain.pmCurrentProjectListInq(requestData, onlineCtx);
```
---
## com/skcc/pms/bizcomponent/tok/bctokboardretrieve/PUTokBoardRetrieve.java
### 게시판 관리 프로그램

#### 개요
- 클래스 : PUTokBoardRetrieve
- 이 프로그램은 게시판 데이터 검색, 조회, 등록, 삭제 등의 기능을 제공합니다. 또한 사용자 리스트 조회 및 프로젝트 관리 기능도 포함하고 있습니다.

#### 메소드
##### pmBoardListInq
- 요청된 정보에 대한 데이터를 검색하여 반환합니다.

##### pmBoardInq
- 요청된 정보를 기반으로 데이터를 조회합니다.

##### pmBoardReg
- 요청된 정보를 기반으로 데이터를 등록합니다.

##### pmBoardDel
- 요청된 정보를 기반으로 데이터를 삭제합니다.

##### pmUserListInq
- 사용자 리스트를 조회하고 반환합니다.

##### pmProjectManagement
- 요청된 정보를 기반으로 프로젝트를 관리합니다.

#### 관련 클래스
- DUTokBoardRetrieve
- DataSet
- IDataSet
- IOnlineContext
- IRecord
- IRecordSet
- UserInfo
- BizRuntimeException
- FileResourceManager
- ExceptionUtil
- StringUtils

#### 클래스 사용 방법
예를 들어 게시판 리스트를 조회할 때는 `pmBoardListInq` 메소드에 `requestData`와 `onlineCtx` 두 가지 파라미터를 전달해야 합니다. 이 메소드는 검색된 결과를 `responseData`라는 이름의 `IDataSet` 객체로 반환합니다. 다른 메소드들도 마찬가지로 요청 데이터와 로그인 정보를 파라미터로 받고 처리 결과를 반환합니다. 해서, 이 클래스를 사용하려면 먼저 관련 클래스를 임포트 후 해당 객체를 생성하고 필요한 파라미터를 설정하여 메소드를 호출하면 됩니다.
---
## com/skcc/pms/bizcomponent/tok/bctokboardretrieve/BCTokBoardRetrieveController.java
### 게시판 관리 프로그램

#### 개요
- 클래스 : BCTokBoardRetrieveController
- 봄 프레임워크를 사용한 웹 애플리케이션으로, 게시판 조회, 등록, 삭제 기능과 사용자 조회, 프로젝트 관리 기능을 수행합니다.

#### 메소드
##### pmBoardListInq
- 게시판 목록을 조회하는 메소드입니다.
##### pmBoardInq
- 특정 게시물을 조회하는 메소드입니다.
##### pmBoardReg
- 게시물을 등록하는 메소드입니다.
##### pmBoardDel
- 게시물을 삭제하는 메소드입니다.
##### pmUserListInq
- 사용자 목록을 조회하는 메소드입니다.
##### pmProjectManagement
- 프로젝트 관리 기능을 수행하는 메소드입니다.

#### 관련 클래스
- PUTokBoardRetrieve 

#### 클래스 사용 방법
- BCTokBoardRetrieveController 클래스를 사용하여 게시판의 CRUD 및 사용자 조회, 프로젝트 관리 등의 작업을 수행할 수 있습니다.
- 각 메소드는 @RequestBody IDataSet requestData, IOnlineContext onlineCtx를 파라미터로 받아 동작합니다.
- 원하는 기능의 메소드를 호출하고 requestData에 필요한 정보를 담아 전송하면, 해당 기능의 작업을 수행한 후 IDataSet 형태로 결과를 반환합니다.
---
## com/skcc/pms/bizcomponent/tok/bctokboardretrieve/DUTokBoardRetrieve.java
### 게시판 관리

#### 개요
- 클래스 : DUTokBoardRetrieve
- 이 클래스는 데이터 유닛과 관련된 영역으로, 토크 게시판과 관련된 기능을 관리하는 클래스입니다.

#### 메소드
##### dmBoardListInq
- 게시판의 목록을 요청 정보에 따라 조회하는 메소드입니다.
##### dmBoardTotCntInq
- 게시판에 등록된 글의 총 개수를 조회하는 메소드입니다.
##### dmBoardInq
- 특정 게시글의 세부 정보를 조회하는 메소드입니다.
##### dmBoardUpd
- 특정 게시글의 정보를 업데이트하는 메소드입니다.
##### dmBoardAdd
- 새로운 게시글을 추가하는 메소드입니다.
##### dmBoardDel
- 특정 게시글을 삭제하는 메소드입니다.
##### dmUserListInq
- 사용자 목록을 요청 정보에 따라 조회하는 메소드입니다.
##### dmUserTotCntInq
- 사용자의 총 개수를 조회하는 메소드입니다.
##### dmProjectListInq
- 프로젝트 목록을 요청 정보에 따라 조회하는 메소드입니다.

#### 관련 클래스
- DataUnit

#### 클래스 사용 방법
- 이 클래스의 메소드들은 각각 게시판 리스트, 게시판 글 수, 게시글 조회, 게시글 업데이트, 게시글 추가 및 삭제, 사용자 목록 및 수, 프로젝트 목록 조회 기능을 제공합니다.
- 요청 정보(IDataSet)와 Request 정보(IOnlineContext)를 매개변수로 받아 처리하고 결과를 반환합니다.
- 각 기능은 해당 메소드를 호출하면서 필요한 정보를 전달하시면 됩니다.
---
## com/skcc/pms/bizcomponent/prdtvy/bcresourcemngr/PUResourceMngr.java
### 리소스 관리자 

#### 개요
- 클래스 : PUResourceMngr
- 이 클래스는 리소스 관리 시스템의 메인 이며 인력 관리, 월별/장기 기간 관리, 프로젝트 자세한 이력 및 산출물 등을 처리하는 메소드를 포함하고 있다.

#### 메소드
##### pmResourceMngrListInq
- 이 메소드는 요청 정보를 입력받아 처리 결과를 반환한다.

##### pmResourceMngrSave
- 이 메소드는 요청 정보를 저장하고 처리 결과를 반환한다.

##### pmResourceMngrGetUsers
- 이 메소드는 요청 정보를 입력받아 사용자 정보를 반환한다.

##### pmResourceMngrGetPeriod
- 이 메소드는 요청 정보를 입력받아 기간을 반환한다.

##### pmResourceMngrGetDetail
- 이 메소드는 요청 정보를 입력받아 프로젝트 일정에 대한 세부 정보를 반환한다.

##### pmResourceMngrGetHistory
- 이 메소드는 요청 정보를 입력받아 프로젝트의 히스토리를 반환한다.

##### pmResourceMngrSavePeriod
- 이 메소드는 요청 정보를 입력받아 기간을 저장하고 처리 결과를 반환한다.

##### pmResourceMngrSaveDetailPerson
- 이 메소드는 요청 정보를 입력받아 개인 정보를 저장하고 처리 결과를 반환한다.

##### pmResourceMngrSaveDetailGrid
- 이 메소드는 요청 정보를 입력받아 그리드 정보를 저장하고 처리 결과를 반환한다.

##### pmResourceMngrExcelExport
- 이 메소드는 요청 정보를 입력받아 엑셀 파일을 내보내고 처리 결과를 반환한다.

##### pmResourceMngrExcelImport
- 이 메소드는 요청 정보를 입력받아 엑셀 파일을 가져와 저장하고 처리 결과를 반환한다.

#### 관련 클래스
- DUResourceMngr
- IDataSet
- IOnlineContext
- DataSet

#### 클래스 사용 방법
- 인스턴스를 생성하고 필요한 메소드를 호출하여 처리 결과를 받아본다. 아래는 'pmResourceMngrSaveDetailPerson' 메소드를 호출하는 예시다.
```
PUResourceMngr resourceManager = new PUResourceMngr();
IDataSet requestData = new DataSet();
IOnlineContext onlineCtx = new OnlineContext();
resourceManager.pmResourceMngrSaveDetailPerson(requestData, onlineCtx);
```
---
## com/skcc/pms/bizcomponent/prdtvy/bcresourcemngr/BCResourceMngrController.java
### 자원 관리 프로그램

#### 개요
- 클래스 : BCResourceMngrController
- 이 클래스는 자원 관리 프로그램의 컨트롤러로써, 서비스의 각 메소드를 호출하고 그 결과를 반환합니다. 

#### 메소드
##### pmResourceMngrListInq
- 자원 관리항목 목록 조회 메서드
##### pmResourceMngrSave
- 자원 관리 정보 저장 메서드
##### pmResourceMngrGetUsers
- 사용자 정보 조회 메서드
##### pmResourceMngrExcelExport
- 자원 관리 정보 엑셀 파일 출력 메서드
##### pmResourceMngrExcelImport
- 엑셀 파일로부터 자원 관리 정보를 가져와 저장하는 메서드
##### pmResourceMngrGetPeriod
- 기간 정보 조회 메서드
##### pmResourceMngrGetDetail
- 자원 관리 상세 정보 조회 메서드
##### pmResourceMngrGetHistory
- 변경 이력 조회 메서드
##### pmResourceMngrSavePeriod
- 기간 정보 저장 메서드
##### pmResourceMngrSaveDetailPerson
- 사용자 별 상세 정보 저장 메서드
##### pmResourceMngrSaveDetailGrid
- 그리드에 대한 상세 정보 저장 메서드

#### 관련 클래스
- PUResourceMngr

#### 클래스 사용 방법
BCResourceMngrController 클래스의 메소드를 호출하여 필요한 기능을 실행시킬 수 있습니다. 각 메소드는 지정된 서비스 메소드를 호출하여 동작하며, 메소드마다 필요한 매개변수를 전달받습니다. 반환되는 결과는 그 메소드의 역할에 따라 다르며, 대부분의 경우는 IDataSet 형태로 데이터를 반환합니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/dto/ProjectLinkMapVo.java
### 프로젝트 연계 정보 시스템

#### 개요
- 클래스 : ProjectLinkMapVo
- 프로젝트 연계 정보에 대한 상세 정보들을 담고 있는 클래스로, 기본적인 프로젝트 정보와 연결도구 코드, 연계 시스템의 프로젝트 코드 등 연계에 필요한 정보들을 저장하고 있다.

#### 메소드
##### getCanRegist
- 수정 및 삭제 가능 여부를 반환하는 메소드
##### setCanRegist
- 수정 및 삭제 가능 여부를 설정하는 메소드
##### getLinkFilter
- 연계 시 사용되는 Filter 값을 반환하는 메소드
##### setLinkFilter
- 연계 시 사용되는 Filter 값을 설정하는 메소드
##### getDelYn
- 프로젝트 삭제 여부를 반환하는 메소드
##### setDelYn
- 프로젝트 삭제 여부를 설정하는 메소드
##### getServiceId
- 서비스ID를 반환하는 메소드
##### setServiceId
- 서비스ID를 설정하는 메소드
##### getLinkCode
- 연계도구코드를 반환하는 메소드
##### setLinkCode
- 연계도구코드를 설정하는 메소드
##### getLinkProjectNo
- 연계시스템의 프로젝트 코드를 반환하는 메소드
##### setLinkProjectNo
- 연계시스템의 프로젝트 코드를 설정하는 메소드
##### getLinkProjectName
- 연계시스템의 프로젝트명을 반환하는 메소드
##### setLinkProjectName
- 연계시스템의 프로젝트명을 설정하는 메소드
##### getLinkRowId
- 연계시스템의 프로젝트 ID를 반환하는 메소드
##### setLinkRowId
- 연계시스템의 프로젝트 ID를 설정하는 메소드
##### getProjectNo
- PMS 프로젝트No를 반환하는 메소드
##### setProjectNo
- PMS 프로젝트No를 설정하는 메소드
##### getProjectName
- PMS 프로젝트명을 반환하는 메소드
##### setProjectName
- PMS 프로젝트명을 설정하는 메소드
##### getProjectEndYn
- PMS 프로젝트 상태를 반환하는 메소드
##### setProjectEndYn
- PMS 프로젝트 상태를 설정하는 메소드
##### getProjectStatusName
- PMS 프로젝트 상태명을 반환하는 메소드
##### setProjectStatusName
- PMS 프로젝트 상태명을 설정하는 메소드
##### getManagerId
- 관리자사번을 반환하는 메소드
##### setManagerId
- 관리자사번을 설정하는 메소드
##### getManagerName
- 관리자명을 반환하는 메소드
##### setManagerName
- 관리자명을 설정하는 메소드

#### 클래스 사용 방법
ProjectLinkMapVo 클래스는 프로젝트와 연계 시스템의 매핑 정보를 기록 및 관리하는데 사용됩니다. 필요에 따라 반환 메소드를 통해 각 필드의 값을 가져오거나 설정 메소드를 사용해 필드 값을 설정할 수 있습니다. 또한 수정/삭제 가능 여부 및 프로젝트 삭제 여부를 확인하고 설정하는 메소드를 제공합니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/dto/NciTargetVo.java
### NCI 타겟 정보

#### 개요
- 클래스 : NciTargetVo
- NCI 타겟 정보를 관리하는 VO(Value Object) 클래스입니다. 'linkRowid', 'targetId', 'targetName', 'languageType', 'etc', 'projectNo', 'subProjectNo' 등의 정보를 가지고 있습니다.

#### 메소드
##### getLinkRowid
- linkRowid 값을 반환하는 메소드입니다.
##### setLinkRowid
- linkRowid 값을 설정하는 메소드입니다.
##### getTargetId
- targetId 값을 반환하는 메소드입니다.
##### setTargetId
- targetId 값을 설정하는 메소드입니다.
##### getTargetName
- targetName 값을 반환하는 메소드입니다.
##### setTargetName
- targetName 값을 설정하는 메소드입니다.
##### getLanguageType
- languageType 값을 반환하는 메소드입니다.
##### setLanguageType
- languageType 값을 설정하는 메소드입니다.
##### getEtc
- etc 값을 반환하는 메소드입니다.
##### setEtc
- etc 값을 설정하는 메소드입니다.
##### getProjectNo
- projectNo 값을 반환하는 메소드입니다.
##### setProjectNo
- projectNo 값을 설정하는 메소드입니다.
##### getSubProjectNo
- subProjectNo 값을 반환하는 메소드입니다.
##### setSubProjectNo
- subProjectNo 값을 설정하는 메소드입니다.

#### 클래스 사용 방법
- 해당 클래스를 사용하는 방법은 인스턴스를 생성한 후, setter 메소드를 통해 속성값을 설정하고, getter 메소드를 통해 속성값을 읽어 올 수 있습니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/dao/NciDao.java
### 타겟 관리 프로그램

#### 개요
- 클래스 : NciDao
- 목표를 관리하고, 결과를 업데이트하고, 추가하는 기능이 있는 레포지토리.

#### 메소드
##### getTargetCnt
- 목표 수를 가져오는 메소드
##### updateTarget
- 목표를 업데이트하는 메소드
##### addTarget
- 새로운 목표를 추가하는 메소드
##### getTargetList
- 목표 목록을 가져오는 메소드
##### getResultCnt
- 결과 수를 가져오는 메소드
##### updateResult
- 결과를 업데이트하는 메소드
##### addResult
- 결과를 추가하는 메소드

#### 관련 클래스
- NciTargetVo

#### 클래스 사용 방법
이 클래스는 MyBatis의 SqlSessionTemplate를 사용하여 데이터베이스와 상호작용한다. Spring의 `@Autowired` 어노테이션을 사용하여 SqlSessionTemplate를 자동 주입하며, 다양한 CRUD 작업을 위한 메소드를 제공한다. 각 메소드는 필요에 따라 매개변수로 Map 또는 NciTargetVo 객체를 받아, 특정 SQL 쿼리를 실행한다. 결과 값 형태는 메소드에 따라 다르지만, 대체로 목표나 결과의 수(int) 또는 목표 목록(List<NciTargetVo>)을 반환한다.
---
## com/skcc/pms/bizcomponent/nexcorelink/dao/ProjectLinkMapDao.java
### 프로젝트 링크 매핑

#### 개요
- 클래스 : ProjectLinkMapDao
- ProjectLinkMapDao 클래스는 사용자 정의 도구과 notcorelink 프로젝트 간의 매핑을 위한 메소드를 제공합니다. 이 클래스는 SQL 세션 템플릿을 사용하여 nexcorelink.projectlinkmap 쿼리를 실행하며, 프로젝트 리스트의 조회, 리스트 업데이트, 맵핑된 프로젝트 리스트의 조회, 링크 코드 업데이트 및 삭제 등의 기능을 제공합니다.

#### 메소드
##### getList
- 지정된 매개변수를 사용하여 projectlinkmap 목록을 조회합니다.

##### update
- 지정된 매개변수를 사용하여 projectlinkmap을 업데이트합니다.

##### getProjectLinkMapCnt
- 지정된 매개변수를 사용하여 projectlinkmap 카운트를 반환합니다.

##### updateProjectLinkMap
- 지정된 매개변수를 사용하여 projectlinkmap을 업데이트합니다.

##### deleteProjectLinkMap
- 지정된 매개변수를 사용하여 projectlinkmap을 삭제합니다.

##### getProjectLinkMapsForBatch
- 배치 작업을 위한 projectlinkmap 목록을 조회합니다.

##### getProjectListMapped
- 지정된 서비스ID와 링크 코드를 사용하여 매핑된 프로젝트 리스트를 가져옵니다.

##### updateLinkCode
- 지정된 매개변수를 사용하여 링크 코드를 업데이트합니다.

##### deleteLinkCode
- 지정된 매개변수를 사용하여 링크 코드를 삭제합니다.

##### 관련 클래스
- ProjectLinkMapVo
- SqlSessionTemplate

#### 클래스 사용 방법
- 사용자 정의 도구와 notcorelink 프로젝트 간의 매핑을 관리하려면 ProjectLinkMapVo 객체를 생성하고 필요한 파라미터를 정의해야 합니다. 이후 ProjectLinkMapDao 클래스의 메소드를 호출하여 기대하는 동작을 수행합니다.
- 예를 들어 매핑된 프로젝트 리스트를 조회하려면 getProjectListMapped 메소드를 호출하되 서비스ID와 링크 코드를 매개변수로 전달해야 합니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/dao/AppqDao.java
### 애플리케이션 품질 데이터 관리

#### 개요
- 클래스 : AppqDao
- NexCoreLink 시스템에서 애플리케이션의 품질 정보를 관리하는 클래스입니다. 각 애플리케이션의 품질 정보 조회, 추가, 업데이트 기능을 제공합니다.

#### 메소드
##### getDataCnt
- 애플리케이션 품질 정보의 개수를 조회하는 메소드입니다.
##### addData 
- 새로운 애플리케이션 품질 정보를 추가하는 메소드입니다.
##### updateData
- 기존의 애플리케이션 품질 정보를 업데이트하는 메소드입니다.

#### 관련 클래스
- SqlSessionTemplate : MyBatis 데이터 매핑 프레임워크의 핵심 클래스로, SQL 쿼리 실행을 담당합니다.
    
#### 클래스 사용 방법
1. 애플리케이션 품질 관련 정보를 맵 형태로 담아 getDataCnt(), addData(), updateData() 메소드를 각각 호출해 해당 기능을 수행할 수 있습니다.
2. getDataCnt() : 품질 정보의 개수를 조회
3. addData() : 품질 정보 추가
4. updateData() : 품질 정보 업데이트
5. 아래 예시는 품질 정보를 추가하는 방법을 보여줍니다.
```java
Map<String, Object> param = new HashMap<String, Object>();
param.put("data", "new data"); 
int result = AppqDao.addData(param);
```
---
## com/skcc/pms/bizcomponent/nexcorelink/controller/ProjectLinkMapController.java
### 프로젝트 링크 맵 관리

#### 개요
- 클래스 : ProjectLinkMapController
- 이 클래스는 프로젝트와 해당 프로젝트와 연결된 링크 맵을 관리하는 컨트롤러입니다. 이 컨트롤러를 통해 링크 맵이나 프로젝트 전체를 조회하고, 갱신하고, 등록하고, 삭제하고, 연결 해제하는 동작을 제공합니다.

#### 메소드
##### getProjectLinkMaps
- 전체 프로젝트 링크 맵 목록을 조회합니다.
##### getList
- 특정 기준에 따라 프로젝트 링크 맵 목록을 조회합니다.
##### update
- 특정 정보를 기반으로 프로젝트 링크 맵을 갱신합니다.
##### regist
- 새 프로젝트 링크 맵을 등록합니다.
##### remove
- 특정 프로젝트 링크 맵을 삭제합니다.
##### removes
- 주어진 리스트에 포함된 모든 프로젝트 링크 맵을 삭제합니다.
##### unlink
- 특정 프로젝트와 해당 링크 맵의 연결을 해제합니다.
##### dbError 
- 데이터베이스 오류시 리스폰스 데이터를 반환합니다.
##### defaultException
- 모든 예외 상황에 대해 예외 처리를 합니다.

#### 관련 클래스
- ProjectLinkMapService
- ProjectLinkMapVo
- ResponseData
- UserInfo
- Constants

#### 클래스 사용 방법
이 클래스는 Spring Framework의 일부로서 웹 애플리케이션에 사용됩니다. 원하는 HTTP 메소드와 매핑을 형성하여 웹 요청이 이 클래스의 메소드에 도달하도록 설정할 수 있습니다.
- getProjectLinkMaps 메소드를 호출하여 전체 프로젝트 링크 맵 목록을 탐색합니다.
- getList, remove, regist, update, unlink 메소드는 매개변수로 Map<String, Object> 객체를 사용하여 특정 작업을 수행합니다.
- 또한 특정 메소드는 사용자 세션에서 정보를 검색합니다. 이는 사용자 특정 작업(갱신, 연결 해제 등)을 수행하는데 사용되며 "loginId" 속성으로 사용자 식별 정보를 포함합니다.
- 예외 처리를 위해 dbError 메소드와 defaultException 메소드는 ExceptionHandler 어노테이션으로 표시되어 있습니다. 이들은 데이터베이스 오류와 시스템 오류를 포착하고 적절한 에러 메시지를 반환합니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/controller/AppqController.java
### 프로젝트 연결 컨트롤러

#### 개요
- 클래스 : AppqController
- 프로젝트 연계를 위한 서비스와 메소드를 제공하는 컨트롤러 클래스

#### 메소드
##### synchProjectData
- 프로젝트 데이터를 동기화하는 메소드.
- 파라미터로 전달 받은 서비스 ID를 통해 서비스 정보를 가져와 데이터 유효성을 확인한 후, 연결된 프로젝트를 검색하고 프로젝트 데이터를 동기화합니다.
- 필요한 인자로는 `serviceId`, `linkCode`, `linkProjectNo`, `projectNo` 이런 것들이 필요합니다.

##### synchProjectList
- 전체 프로젝트 리스트를 동기화하는 메소드.
- 파라미터로 전달 받은 서비스 ID를 통해 서비스 정보를 가져와 데이터 유효성을 확인한 후, 전체 프로젝트 리스트를 동기화합니다.
- 필요한 인자로는 `serviceId`가 필요합니다.

##### dbError
- 데이터 베이스 오류 핸들링 메소드. 
- SQL 오류 발생 시, 오류 메시지를 기록하고 오류 메시지를 응답합니다.

##### defaultException
- 기본 예외 처리 메소드.
- 예외 발생 시, 예외 메시지를 기록하고 시스템 오류 메시지를 응답합니다.

#### 관련 클래스
- IFServiceDao
- ProjectLinkMapService
- AppqInterfaceService
- ServiceHttpClient

#### 클래스 사용 방법
- `AppqController` 클래스는 Spring 프레임워크의 `Controller` 어노테이션으로 선언되어 있어 요청 경로를 설정하고 HTTP 요청을 처리할 수 있습니다.
- `/nexcorelink/appq/synchProjectData`와 `/nexcorelink/appq/synchProjectList` 경로로 요청이 들어온 경우 각각 `synchProjectData` 메소드와 `synchProjectList` 메소드를 실행시킵니다.
- 오류 발생 시 `dbError`와 `defaultException` 메소드를 통해 예외 처리를 수행합니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/service/AppqInterfaceService.java
### AppQ 인터페이스 서비스

#### 개요
- 클래스 : AppqInterfaceService
- 이 서비스는 AppQ(실제로는 Sonarqube)의 REST 데이터를 연동하는 클래스입니다. 여러 메소드들을 통해 APPQ 서버와의 데이터 동기화, 프로젝트 리스트 동기화 등을 수행합니다.

#### 메소드
##### synchAllServer()
- 모든 APPQ 서버와 데이터를 동기화하는 메소드입니다.

##### synchServer(IFServiceVo serviceVo)
- 하나의 APPQ 서버와 데이터를 동기화하는 메소드입니다.

##### synchProjectList(IFServiceVo serviceVo, ServiceHttpClient loginedClient)
- APPQ 프로젝트의 리스트를 동기화하는 메소드입니다. 

##### synchProjectData(IFServiceVo serviceVo, ProjectLinkMapVo mapVo, ServiceHttpClient loginedClient)
- APPQ의 특정 프로젝트에 대한 데이터를 동기화하는 메소드입니다.

##### converToDouble(String val)
- 문자열을 실수로 변환하는 보조 메소드입니다. 에러 발생시 0을 반환합니다.

##### 관련 클래스
- IFServiceDao
- ProjectLinkMapDao
- AppqDao

#### 클래스 사용 방법
AppqInterfaceService 클래스는 @Service 어노테이션이 붙어 있어서, 스프링의 빈으로 등록되어 애플리케이션 전역에서 자유롭게 주입받아 사용할 수 있습니다. 여러 메소드들은 APPQ 서버와의 데이터 동기화를 수행하기 위해 사용됩니다. 예를 들어, synchAllServer() 메소드를 호출하면 모든 APPQ 서버와의 데이터 동기화가 수행됩니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/service/NciInterfaceService.java
### NCI 인터페이스 서비스

#### 개요
- 클래스 : NciInterfaceService
- 이 클래스는 NCI 서버와의 동기화 작업을 수행하는 서비스입니다. 종합적으로 '모든 서버 동기화', '단일 서버 동기화', '프로젝트 리스트 동기화', '타겟 리스트 동기화', 그리고 '결과 리스트 동기화'의 기능을 가지고 있습니다.

#### 메소드
##### synchAllServer
- 모든 NCI 서버와 동기화를 진행합니다.
##### synchServer
- 특정 서비스 정보를 갖는 단일 NCI 서버와 동기화를 진행합니다.
##### synchProjectList
- 주어진 서비스 정보와 로그인된 HttpClient에 따라 NCI 프로젝트 리스트와 동기화를 진행합니다.
##### synchTargetList
- 주어진 서비스 정보와 로그인된 HttpClient에 따라 NCI 타겟 리스트와 동기화를 진행합니다.
##### synchResultList
- 주어진 서비스 정보와 로그인된 HttpClient에 따라 NCI 점검 결과 리스트와 동기화를 진행합니다.

##### 관련 클래스
- IFServiceDao
- ProjectLinkMapDao
- NciDao

#### 클래스 사용 방법
NciInterfaceService 클래스는 주로 NCI 서버와의 동기화 작업을 수행하는데 사용됩니다. 서비스 DAO 클래스와 연계하여 사용됩니다. NCI 서버와 연동하여 최신 정보를 동기화하거나, 필요한 데이터를 수집하는 등의 가변적인 동기화 작업을 수행할 때 사용됩니다. 이 클래스의 메서드는 주로 서버와의 동기화 작업을 위해 스프링 서비스에서 호출됩니다.
---
## com/skcc/pms/bizcomponent/nexcorelink/service/ProjectLinkMapService.java
### 프로젝트 연계 맵 서비스

#### 개요
- 클래스 : ProjectLinkMapService
- 이 서비스 클래스는 프로젝트와 외부 시스템(예: JIRA, REDMINE)을 연계하고 관리하는 기능을 담당합니다. 이를 위해, 프로젝트와 외부 시스템을 연계하는 링크 맵을 생성, 수정, 조회, 삭제하는 기능과 관련된 목록을 관리하는 여러 메소드를 포함하고 있습니다.

#### 메소드
##### getProjectLinkMaps
- 이 메소드는 주어진 매개변수를 이용해 연계 맵 목록을 조회합니다.
##### getList
- 이 메소드는 주어진 매개변수를 이용해 회차 목록을 조회합니다.
##### update
- 이 메소드는 주어진 매개변수를 이용해 연계 맵 정보를 갱신합니다.
##### regist
- 이 메소드는 주어진 매개변수를 이용해 연계 맵을 등록합니다.
##### remove
- 이 메소드는 주어진 매개변수를 이용해 연계 맵을 삭제합니다.
##### unlink
- 이 메소드는 주어진 매개변수를 이용해 연계를 해제합니다. JIRA나 REDMINE과 같이 연계된 외부 시스템의 경우, 해당 연계코드의 사용을 중지하게됩니다.
##### getCnt
- 이 메소드는 주어진 매개변수를 이용해 연계 맵의 개수를 조회합니다.

#### 관련 클래스
- ProjectLinkMapDao, BackLogDao, AgListDao, ProjectConfigDao

#### 클래스 사용 방법
- 이 클래스는 서비스 클래스로서, 다른 클래스에서 해당 서비스를 이용할 수 있습니다. 이를 이용하기 위해선 먼저 클래스 인스턴스를 생성하고, 필요한 메소드를 호출하여 사용하면 됩니다.
---
## com/skcc/pms/bizcomponent/progress/bcaccumprogressmanager/PUAccumProgressManager.java
### 누적 프로그레스 관리자

#### 개요
- 클래스 : PUAccumProgressManager
- PUAccumProgressManager 클래스는 프로젝트의 진행상태를 관리하는 데 사용하는 메소드들의 모음입니다. 이 클래스는 요청받은 정보를 바탕으로 가공된 결과를 반환합니다.

#### 메소드
##### pmAccumProListInq
- 이 메소드는 요청된 데이터를 기반으로 진행상태 목록을 조회합니다.

##### pmAccumProListInqPhase
- 이 메소드는 요청된 데이터를 기반으로 진행상태(단계별) 목록을 조회합니다.

##### pmAccumProColListInq
- 이 메소드는 요청된 데이터를 기반으로 색인된 진행상태 목록을 조회합니다.

##### pmAccumProGridUp
- 이 메소드는 요청된 데이터를 기반으로 Grid 시스템의 진행상태를 업데이트합니다.

#### 관련 클래스
- DUAccumProgressManager

#### 클래스 사용 방법
1. 다음과 같이 인스턴스를 생성합니다: `PUAccumProgressManager manager = new PUAccumProgressManager();`
2. 필요한 메소드를 호출합니다. 예를 들어, 진행상태 목록을 조회하려면 다음과 같이 호출합니다: `manager.pmAccumProListInq(requestData, onlineCtx);` 여기서 `requestData`는 요청데이터를, `onlineCtx`는 요청정보를 나타냅니다.
---
## com/skcc/pms/bizcomponent/progress/bcaccumprogressmanager/DUAccumProgressManager.java
### 누적 진척 관리 시스템

#### 개요
- 클래스 : DUAccumProgressManager
- 이 클래스는 프로젝트의 누적 진척 상태를 관리하는 기능을 구현한다. 일별, 주별, 월별로 진척도를 관리하고 이를 시각적으로 표현한다. 또한, 실시간 진척 상태를 업데이트하고 조회할 수 있는 기능을 제공한다. 

#### 메소드
##### dmAccumProListInq
- 진척 상태 목록을 조회한다.

##### dmAccumProListInqPhase
- 프로젝트 단계별 진척 상태를 조회한다.

##### _getMonthArray
- 월별 진척 상태를 배열로 조회한다.

##### _getWeekArray
- 주별 진척 상태를 배열로 조회한다.

##### _getDateArray
- 일별 진척 상태를 배열로 조회한다.

##### dmAccumProColListInq
- 시간별 진척 상태 목록을 조회한다.

##### dmAccumProGridUp
- 진척 상태를 업데이트한다. 

##### 관련 클래스
- DataSet, IDataSet, IOnlineContext, IRecordSet, IRecord, IRecordHeader

#### 클래스 사용 방법
1. DUAccumProgressManager 클래스의 인스턴스를 생성한다.
2. 필요에 따라 dmAccumProListInq, dmAccumProListInqPhase, dmAccumProColListInq, dmAccumProGridUp 등의 메소드를 호출하여 진척 상태를 조회하거나 업데이트한다.
3. _getMonthArray, _getWeekArray, _getDateArray 메소드를 사용하여 월별, 주별, 일별 진척 상태를 배열로 조회할 수 있다. 
---
## com/skcc/pms/bizcomponent/progress/bcaccumprogressmanager/BCAccumProgressManagerController.java
### 누적진행상황 관리

#### 개요
- 클래스 : BCAccumProgressManagerController
- 이 클래스는 누적 진행 상황에 관한 정보를 관리하며, 그에 해당하는 요청을 처리한다.

#### 메소드
##### pmAccumProListInq
- 이 메소드는 누적 진행 상황 목록을 조회하는 요청을 처리한다.
##### pmAccumProListInqPhase
- 이 메소드는 누적 진행 상황 페이즈별 목록을 조회하는 요청을 처리한다.
##### pmAccumProColListInq
- 이 메소드는 누적 진행 상황 컬럼 목록을 조회하는 요청을 처리한다.
##### pmAccumProGridUp
- 이 메소드는 누적 진행 상황 그리드 업데이트 요청을 처리한다.

#### 관련 클래스
- PUAccumProgressManager : 이 클래스는 비즈니스 로직을 처리한다.

#### 클래스 사용 방법
- `BCAccumProgressManagerController` 클래스를 인스턴스화 한 후, 각 메소드(pmAccumProListInq, pmAccumProListInqPhase, pmAccumProColListInq, pmAccumProGridUp)를 호출하여 사용한다. 각 메소드는 `IDataSet`과 `IOnlineContext`를 인자로 받는다. 이 때, `IDataSet`에는 요청 데이터가, `IOnlineContext`에는 온라인 컨텍스트 정보가 포함되어 있다. 각 메소드의 반환값은 여러 데이터를 포함한 `IDataSet` 형태이다.
---
## com/skcc/pms/bizcomponent/ifproject/service/ProjectInterfaceService.java
### 프로젝트 인터페이스 서비스

#### 개요
- 클래스 : ProjectInterfaceService
- 이 클래스는 프로젝트 인터페이스 서비스를 담당하며, APPQ(Sonarqube)의 프로젝트 관련 데이터를 동기화하고 관리하는 역할을 합니다.

#### 메소드
##### synchAllServer()
- 모든 APPQ 서버를 동기화하는 메소드입니다.
##### synchServer(IFServiceVo serviceVo)
- 특정 APPQ 서버를 동기화하는 메소드입니다.
##### synchProjectList(final IFServiceVo serviceVo, final ServiceHttpClient loginedClient)
- APPQ 서버에서 프로젝트 리스트를 동기화하는 메소드입니다.
##### synchProjectData(final IFServiceVo serviceVo, final ProjectLinkMapVo mapVo, final ServiceHttpClient loginedClient)
- 특정 APPQ 프로젝트의 점검 결과를 동기화하는 메소드입니다.
##### converToDouble(String val)
- 입력 문자열 값을 실수 값으로 변환하는 메소드입니다.

#### 관련 클래스
- ServiceHttpClient : 서비스 용 HTTP 클라이언트 클래스
- IFServiceDao : 인터페이스 서비스 데이터 접근 객체 클래스
- ProjectLinkMapDao : 프로젝트 링크 맵 데이터 접근 객체 클래스
- AppqDao : APPQ 데이터 접근 객체 클래스
- IFServiceVo : 인터페이스 서비스 값 객체 클래스
- ProjectLinkMapVo : 프로젝트 링크 맵 값 객체 클래스

#### 클래스 사용 방법
- ProjectInterfaceService 클래스는 주로 APPQ 서버의 프로젝트 데이터 동기화를 위해 사용됩니다.
- 먼저, synchAllServer() 메소드를 호출하여 모든 서버를 동기화합니다.
- 특정 서버만 동기화하려면 synchServer() 메소드를 특정 서비스 정보를 파라미터로 사용하여 호출합니다.
- 프로젝트 리스트를 동기화하려면 synchProjectList() 메소드를 호출하여 서비스 정보와 로그인된 클라이언트 정보를 전달합니다.
- 각 프로젝트의 점검 결과를 동기화하려면 synchProjectData() 메소드를 호출하여 서비스 정보, 프로젝트 링크 맵 정보, 로그인된 클라이언트 정보를 전달합니다.
- converToDouble() 메소드는 입력 문자열을 실수로 변환하는 데 사용됩니다.
---
## com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitybatchmanager/PUUpdatedListHistoryBatchManager.java
### 이력 저장 메니저

#### 개요
- 클래스 : PUUpdatedListHistoryBatchManager
- 개발자원 관리 이력과 관련된 다양한 정보를 데이터베이스에 저장하는 기능을 담당하는 클래스입니다.

#### 메소드
##### pmInsertPrdtvtHistory
- 개발자원 관리 이력 정보를 데이터베이스에 저장하는 메소드입니다.
  
##### pmInsertResourceMonthHistory
- 매월 개발자원 이력 정보를 데이터베이스에 저장하는 메소드입니다.
  
##### pmInsertResourceWeekHistory
- 매주 개발자원 이력 정보를 데이터베이스에 저장하는 메소드입니다.

##### pmInsertBaseDtHistory
- 기준일자 이력 정보를 데이터베이스에 저장하는 메소드입니다.  

##### 관련 클래스
- DUUpdatedListHistoryBatchManager

#### 클래스 사용 방법
- PUUpdatedListHistoryBatchManager 클래스의 메소드는 각기 다양한 종류의 이력 정보를 데이터베이스에 저장하는 작업을 수행합니다. 이를 사용하려면 먼저 이 클래스의 인스턴스를 생성한 후, 필요한 이력 정보(IDataSet 타입)를 메소드의 인자로 전달하여 호출하면 됩니다. 메소드 호출 결과는 IDataSet 타입으로 반환됩니다. 각 메소드는 데이터를 성공적으로 저장하면 "MSGI4006" 메시지를 반환하며, 예외가 발생한 경우에는 BizRuntimeException을 발생시킵니다.
---
## com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitybatchmanager/DUUpdatedListHistoryBatchManager.java
### 개발자원 이력관리 시스템

#### 개요
- 클래스 : DUUpdatedListHistoryBatchManager
- 이 클래스는 개발자원 이력을 저장하는 기능을 담고 있습니다. 운영 환경에서 꾸준히 데이터를 기록하기 위해 구현되었으며, Batch 작업으로 이력 관리가 가능하도록 디자인되었습니다.

#### 메소드
##### dmInsertPrdtvtHistory
- 요청된 데이터 세트를 기반으로 개발자원관리 이력을 저장합니다. 저장을 원하는 테이블에 대해 초기화(삭제 후 삽입) 작업을 수행하며, 데이터 세트에서 batch 작업 표시를 찾아 해당 작업을 수행합니다.

##### dmInsertResourceMonthHistory
- 요청된 데이터 세트를 기반으로 월별 개발자원 이력을 저장합니다. tb_pj_resource_month_dev 테이블에 대해 초기화 작업을 수행합니다.

##### dmInsertResourceWeekHistory
- 요청된 데이터 세트를 기반으로 주별 개발자원 이력을 저장합니다. tb_pj_resource_week_dev 테이블에 대해 초기화 작업을 수행합니다.

##### dmInsertBaseDtHistory
- 요청된 데이터 세트를 기반으로 기본 날짜 이력을 저장합니다. tb_pj_prdtvt_base_dt 테이블에 대해 초기화 작업을 수행합니다.

#### 관련 클래스
- DataUnit: 데이터를 관리하기 위한 기본 단위입니다.
- IDataSet: 데이터 셋을 관리하기 위한 인터페이스입니다.
- DataSet: IDataSet 인터페이스를 구현한 클래스로, 데이터 셋을 조작하기 위한 기능을 제공합니다.

#### 클래스 사용 방법
이 클래스는 Spring Bean으로 등록되어 있으므로, 사용하려면 우선 스프링 컨테이너에서 해당 Bean을 참조해야 합니다. 참조 후에는 각 메소드에 필요한 IDataSet 데이터를 생성하여 메소드를 호출합니다. 각 메소드는 요청된 데이터를 기반으로 이력 정보를 데이터베이스에 저장하고, 저장 결과를 IDataSet 형태로 반환합니다. 이 클래스를 사용하면 개발자원 이력 정보를 꾸준히 유지할 수 있습니다.
---
## com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitymanager/PUDevProductivityManager.java
### "개발 생산성 관리"

#### 개요
- 클래스 : PUDevProductivityManager
- 개발 생산성 관리를 위한 서버 사이드 비즈니스 로직을 처리하는 클래스.


#### 메소드
##### pmDevProductivityListInq
- 개발 생산성 리스트를 조회하는 메소드입니다.

##### pmUserIdCode
- 유저 ID 코드를 반환하는 메소드입니다.

##### pmProRate
- 개발 생산성 프로그램의 진행율을 반환하는 메소드입니다.

##### pmTaskName
- 개발 생산성 태스크 이름을 반환하는 메소드입니다.

##### pmDevProductivityAdd
- 개발 생산성 정보를 추가하는 메소드입니다.

##### pmDevProductivityUpd
- 개발 생산성 정보를 업데이트하는 메소드입니다.

##### 관련 클래스
- DUAutonumberManager
- DUQmsLink
- DUDevProductivityManager

#### 클래스 사용 방법
상위 메소드를 이용하여 생산성 관련 데이터를 조회하거나 업데이트하는 등의 작업을 수행할 수 있습니다. 예를 들어, pmDevProductivityAdd 메소드를 이용하여 새로운 개발 생산성 데이터를 추가하거나, pmDevProductivityUpd 메소드를 이용하여 기존의 데이터를 업데이트 할 수 있습니다. 각 메소드는 requestData, onlineCtx 두 개의 파라미터를 받으며, 이를 통해 요청에 맞는 데이터를 처리합니다. 결과 데이터는 IDataSet 형태로 반환 됩니다.
---
## com/skcc/pms/bizcomponent/devprdtvt/bcdevproductivitymanager/BCDevProductivityManagerController.java
### 개발 생산성 관리자 

#### 개요
- 클래스 : BCDevProductivityManagerController
- 이 클래스는 개발 생산성에 대한 다양한 기능을 관리하기 위한 컨트롤러 클래스입니다. 파일 다운로드 및 업로드, 정보 조회, 정보 업데이트, 파일 삭제 등의 메소드를 제공합니다.

#### 메소드
##### pmExcelDownload
- 엑셀 파일 다운로드 기능을 제공합니다.
##### pmAttchFileListInq
- 첨부파일 리스트를 조회합니다.
##### pmFileDownload
- 파일 다운로드 기능을 제공합니다.
##### pmFileDel
- 파일 삭제 기능을 제공합니다.
##### pmSubProjectStartEndDateInq
- 하위 프로젝트의 시작과 종료 날짜를 조회합니다.
##### pmDevProductivityGridUpd
- 생산성 그리드 데이터를 업데이트 합니다.
##### pmWorkingdayInq
- 근무일을 조회합니다.
##### pmExcelDataAllDownload
- 모든 엑셀 데이터를 다운로드합니다.
##### pmDevProductivityObjectUseYN
- 개발 생산성 객체의 사용 여부를 확인합니다.
##### pmDevProductivityObjectUseYNSel
- 개발 생산성 객체의 사용 여부를 선택합니다.
##### pmExcelUpload2
- 엑셀 파일을 업로드합니다.
##### pmExcelUpload
- 엑셀 파일을 업로드합니다.
  
.... (중략)

#### 관련 클래스
- PUDevProductivityManager
- PUUpdatedListHistoryBatchManager

#### 클래스 사용 방법
- 해당 클래스의 각 메소드는 개발 생산성 관련 다양한 기능을 수행합니다. 각 기능에 따라 해당 메소드를 호출하고 필요한 파라미터를 전달하면 됩니다. 예를 들어, 파일을 다운로드하려면 'pmExcelDownload' 메소드를 호출하고 필요한 정보를 IDataSet 타입의 RequestData로 전달하세요. 대부분의 메소드는 리턴값으로 IDataSet을 반환하며, 이를 통해 처리 결과 참조할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcswingasispgmmanager/DUSwingAsisPgmManager.java
### 스윙시스템 프로그램 관리자

#### 개요
- 클래스 : DUSwingAsisPgmManager
- 이 클래스는 프로그램 정보를 조회, 저장, 편집, 삭제하는 기능을 수행합니다.

#### 메소드
##### dmScopeListInq
- 요청된 정보를 기반으로 프로그램 리스트를 조회합니다.
##### dmScopeListSave
- 요청된 정보를 기반으로 프로그램을 저장합니다.
##### dmScopeListEdit
- 요청된 정보를 기반으로 프로그램 정보를 편집합니다.
##### dmScopeListDel
- 요청된 정보를 기반으로 프로그램을 삭제합니다.
##### dmScopeListExcel
- 요청된 정보를 기반으로 프로그램 리스트를 엑셀 형식으로 출력합니다.
##### dmScopeListCode
- 요청된 정보를 기반으로 프로그램 코드를 조회합니다.
##### dmExcelDataAllDownload
- 요청된 정보를 기반으로 프로그램 데이터를 모두 엑셀 형식으로 다운로드합니다.
##### dmScopeListCode02
- 요청된 정보를 기반으로 프로그램 코드를 조회합니다.

#### 관련 클래스
- DataUnit
- LoggerFactory
- BizRuntimeException
- IDataSet
- IOnlineContext
- UserInfo
- FileResourceManager
- ExcelManager

#### 클래스 사용 방법
 이 클래스는 사용자의 요청 정보를 인자로 받아서 각 메소드를 실행합니다. 사용자가 프로그램 조회, 저장, 편집, 삭제, 엑셀 다운로드 등의 작업을 요청하면 해당 메소드를 호출하여 작업을 수행하고, 결과를 IDataSet 형식으로 반환합니다. 호출할 메소드와 요청 정보는 사용자의 요청에 따라 달라집니다.
---
## com/skcc/pms/bizcomponent/scope/bcswingasispgmmanager/PUSwingAsisPgmManager.java
### 프로그램 명세서

### 범위 관리 프로그램

#### 개요
- 클래스 : PUSwingAsisPgmManager
- 이 클래스는 범위 관리 시스템의 비즈니스 로직을 관리한다. 주요 기능으로는 범위 리스트 조회, 예외 처리, 범위 리스트 저장, 범위 리스트 수정, 범위 리스트 삭제, 엑셀 데이터 처리 등이 있다.

#### 메소드
##### pmScopeListInq
- 범위 리스트를 조회하는 메소드
##### pmScopeListSave
- 범위 리스트를 저장하는 메소드
##### pmScopeListEdit
- 범위 리스트를 수정하는 메소드
##### pmScopeListDel
- 범위 리스트를 삭제하는 메소드
##### pmScopeListExcel
- 엑셀 데이터를 처리하는 메소드
##### pmScopeListCode
- 범위 리스트 코드를 조회하는 메소드
##### pmExcelDataAllDownload
- 엑셀 데이터 다운로드 처리를 수행하는 메소드
##### pmScopeListCode02
- 범위 리스트 코드를 조회하는 다른 메소드

#### 관련 클래스
- DUSwingAsisPgmManager

#### 클래스 사용 방법
이 클래스는 스프링 프레임워크의 서비스 클래스로 별도의 생성 없이 Autowired 어노테이션을 통해 주입 받아 사용한다. 각 메소드는 요청 정보 DataSet 객체와 온라인 컨텍스트 정보를 파라미터로 받아 처리하며, 처리 결과값은 responseData 객체에 넣어서 리턴한다. 처리 중 오류가 발생할 경우, 적절한 예외 처리 메커니즘을 통해 에러 로그를 생성하고, 사용자에게 에러 메시지를 전달한다.
---
## com/skcc/pms/bizcomponent/scope/bcswingasispgmmanager/BCSwingAsisPgmManagerController.java
### 프로그램 관리 컨트롤러

#### 개요
- 클래스 : BCSwingAsisPgmManagerController
- 이 클래스는 특정 프로그램의 목록 조회, 삭제, 편집, 저장, 코드 조회, 엑셀 데이터 다운로드 등의 기능을 수행하는 Controller 클래스입니다.

#### 메소드
##### pmScopeListInq
- 프로그램의 목록을 조회하는 메서드입니다.

##### pmExcelDataAllDownload
- 엑셀 데이터 전체를 다운로드하는 메서드입니다.

##### pmScopeListDel
- 프로그램의 목록을 삭제하는 메서드입니다.

##### pmScopeListExcel
- 프로그램의 목록을 엑셀로 조회하는 메서드입니다.

##### pmScopeListEdit
- 프로그램의 목록을 편집하는 메서드입니다.

##### pmScopeListSave
- 편집한 프로그램의 목록을 저장하는 메서드입니다.

##### pmScopeListCode
- 특정 프로그램의 코드를 조회하는 메서드입니다.

##### pmScopeListCode02
- 또 다른 프로그램의 코드를 조회하는 메서드입니다.

##### 관련 클래스
- PUSwingAsisPgmManager

#### 클래스 사용 방법
@Autowired를 사용하여 PUSwingAsisPgmManager 서비스를 주입하고, 각 요청 별로 명시된 메서드를 호출하여 사용하실 수 있습니다. 특정 프로그램의 상세 정보를 추가, 수정, 조회하거나 엑셀 파일로 다운로드 할 수 있습니다.

---
## com/skcc/pms/bizcomponent/scope/bcsqualityimprovementtools/DUSQualityImprovementTools.java
### 품질개선 도구

#### 개요
- 클래스 : DUSQualityImprovementTools
- 품질개선 도구 관련 기능을 제공하는 클래스입니다.

#### 메소드
##### dmChckprojects
- 요청된 정보를 바탕으로 처리결과를 반환합니다.

##### dmPlanProgressRateInq
- 요청된 정보를 바탕으로 계획 진행률을 조회합니다.

##### dmSystemCodeMangerAdd
- 요청된 정보를 바탕으로 시스템 코드를 추가합니다.

##### dmSystemCodeMangerLUpd
- 요청된 정보를 바탕으로 시스템 코드를 업데이트합니다.

##### dmSystemCodeMangerLUpd02
- 요청된 정보를 바탕으로 대시보드에서 시스템 코드를 업데이트합니다.

##### dmSystemCodeMangerDel
- 요청된 정보를 바탕으로 시스템 코드를 삭제합니다.

##### dmWorkCodeMangerExcelUpload
- 요청된 정보를 바탕으로 엑셀을 업로드합니다.

#### 관련 클래스
- DataUnit

#### 클래스 사용 방법
클래스의 메소드를 호출하여 원하는 기능을 사용할 수 있습니다. 각 메소드는 요청 정보(DataSet)를 입력받고, 수행 결과를 반환합니다. 

예시) 
```java
IDataSet requestData = new DataSet();
requestData.putField("project_no", "123");
IOnlineContext onlineCtx = new OnlineContext();
DUSQualityImprovementTools qualityTools = new DUSQualityImprovementTools();
IDataSet responseData = qualityTools.dmChckprojects(requestData, onlineCtx);
```
---
## com/skcc/pms/bizcomponent/scope/bcsqualityimprovementtools/PUSQualityImprovementTools.java
### 프로그램 명세서

#### 개요
- 클래스 : PUSQualityImprovementTools
- 이 클래스는 SK의 품질 개선 도구와 관련된 다양한 기능들을 제공합니다. 이 클래스는 서비스를 제공하며, 주로 사용자의 요청에 대한 처리를 담당합니다. 

#### 메소드
##### pmChckprojects
- 이 메소드는 프로젝트를 체크하는 기능을 수행합니다. 요청 정보를 받아 처리하고 그 결과를 반환합니다.

##### pmRequirementsScopeListInq
- 이 메소드는 요구 사항 범위 목록을 조회하는 기능을 수행합니다. 요청 정보를 전달받아 처리하고 그 결과를 반환합니다.

##### pmSystemCodeMangerAdd
- 이 메소드는 시스템 코드를 추가하는 기능을 수행합니다. 요청 정보를 받아 처리하고 그 결과를 반환합니다.

##### pmSystemCodeMangerLUpd
- 이 메소드는 시스템 코드를 업데이트하는 기능을 수행합니다. 요청 정보를 받아 처리하고 그 결과를 반환합니다.

##### pmSystemCodeMangerLUpd02
- 이 메소드는 시스템 코드를 대시보드에서 업데이트하는 기능을 제공합니다. 요청 정보를 받아 처리하고 그 결과를 반환합니다.

##### pmSystemCodeMangerDel
- 이 메소드는 시스템 코드를 삭제하는 기능을 수행합니다. 요청 정보를 받아 처리하고 그 결과를 반환합니다.

##### pmWorkCodeMangerExcelUpload
- 이 메소드는 Excel 파일을 업로드하여 작업 코드를 관리하는 기능을 제공합니다. 요청 정보를 받아 처리하고 그 결과를 반환합니다.

##### 관련 클래스
- DUSQualityImprovementTools

#### 클래스 사용 방법
- 이 클래스를 사용하려면 먼저 해당 클래스를 인스턴스화해야 합니다. 그런 다음 원하는 메서드를 호출하고, 이때 필요에 따라 요청 정보를 인자로 제공해야 합니다. 메서드는 처리 결과를 반환하며, 이는 IDataSet 타입이며, 이를 통해 결과를 확인할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcsqualityimprovementtools/BCSQualityImprovementToolsController.java
### 품질 개선 도구 컨트롤러

#### 개요
- 클래스 : BCSQualityImprovementToolsController
- 이 클래스는 품질 개선 도구에 관련된 여러 메소드를 제공하는 컨트롤러이며, 엑셀 업로드, 요구 사항 목록 조회, 시스템 코드 관리 등의 기능을 제공한다.

#### 메소드
##### pmWorkCodeMangerExcelUpload
- 요청받은 데이터를 기반으로 엑셀 업로드를 실행하는 메소드 생성

##### pmRequirementsScopeListInq
- 요구사항 목록을 조회하는 메소드

##### pmSystemCodeMangerLUpd
- 시스템 코드를 업데이트 하는 메소드

##### pmSystemCodeMangerAdd
- 시스템 코드를 추가하는 메소드

##### pmSystemCodeMangerLUpd02
- 시스템 코드를 업데이트하는 또다른 메소드

##### pmChckprojects
- 프로젝트를 확인하는 메소드

##### pmSystemCodeMangerDel
- 시스템 코드를 삭제하는 메소드

#### 관련 클래스
- PUSQualityImprovementTools

#### 클래스 사용 방법
이 클래스를 사용하려면 해당 메소드에 요구되는 데이터를 제공하고 호출하면 된다. 메소드는 다음과 같이 데이터를 요청하고 그에 따라 결과를 반환한다. 사용하려는 메소드에 따라서 필요한 요청 데이터가 달라진다. 
예를 들어 pmWorkCodeMangerExcelUpload 메소드의 경우 엑셀 데이터를 요청하고 필요한 결과를 반환한다.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskexecution/BCCheckRiskExecutionController.java
### 위험실행 체크 컨트롤러

#### 개요
- 클래스 : BCCheckRiskExecutionController
- 위험실행을 체크하는 컨트롤러

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 리스트 조회 메소드
#### 메소드
##### pmRequirementsScopeAdd
- 요구사항 범위 추가 메소드
##### pmRequirementsScopeUpd
- 요구사항 범위 업데이트 메소드
##### pmRequirementsScopeGridUpd
- 요구사항 범위 그리드 업데이트 메소드
##### pmRequirementsScopeFileDel
- 요구사항 범위 파일 제거 메소드
##### pmRequirementsScopeDel
- 요구사항 범위 삭제 메소드
##### pmRquirementsScopeReport
- 요구사항 범위 리포트 메소드
##### pmPlanProgressRateInq
- 계획 진행율 조회 메소드
##### pmRequirementsScopeHistory
- 요구사항 범위 히스토리 메소드
##### pmExcelDownloadAll
- 전체 엑셀 다운로드 메소드
##### pmRequirementsScopeFileListInq
- 요구사항 범위 파일 리스트 조회 메소드
##### pmRequirementsScopeExcelDownload
- 요구사항 범위 엑셀 다운로드 메소드
##### pmRequirementsScopeExcelUpload
- 요구사항 범위 엑셀 업로드 메소드
##### pmDetailCodeSel
- 상세 코드 선택 메소드
##### pmDetailCodeUseYn
- 상세 코드 사용 여부 메소드
##### pmTestIdNameListInq
- 테스트 ID 이름 리스트 조회 메소드
##### pmTestExecutionBatch
- 테스트 실행 배치 메소드
##### pmRequirementsL4Inq
- 요구사항 L4 조회 메소드
##### pmProgressRateInq
- 진행율 조회 메소드
##### pmRequirementsScopeObjectUseYN
- 요구사항 범위 객체 사용 여부 확인 메소드
##### pmRequirementsScopeObjectUseYNSel
- 요구사항 범위 객체 사용 여부 선택 메소드

#### 관련 클래스
- PUCheckRiskExecution

#### 클래스 사용 방법
- BCCheckRiskExecutionController 클래스는 위의 메소드들을 통해 위험실행 체크를 진행합니다. 각 메소드는 요구사항 범위, 계획의 진행도, 엑셀 파일 다운로드/업로드 등의 기능을 수행합니다. 이 클래스는 스프링 프레임워크의 @Controller 어노테이션을 이용해 웹 애플리케이션의 컨트롤러로 동작합니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskexecution/DUCheckRiskExecution.java
### 프로그램 소스 코드 분석

#### 개요
- 클래스 : DUCheckRiskExecution
- 해당 클래스는 SKCC의 온라인 비즈니스 컴포넌트의 일부로 비즈니스 로직을 실행하는 역할을 함

#### 메소드
##### dmRequirementsScopeListInq
- 요청된 데이터 세트를 기반으로 정보를 조회하는 역할을 함

##### dmRequirementsScopeAdd
- 요청된 데이터 세트를 바탕으로 새로운 기록을 추가하는 기능을 수행

##### dmRequirementsScopeInq
- 기존 이력의 상세 내용을 조회하는 기능 수행

##### dmRequirementsScopeUpd
- 해당 메소드는 요청된 데이터 세트를 이용해 계정 정보를 업데이트함

##### dmRequirementsScopeDel
- 요구된 데이터 세트를 사용해 기록을 삭제하는 기능 수행

#### 관련 클래스
- DataUnit, LoggerFactory, ParserConfigurationException, SAXException, DataSet, IDataSet, IOnlineContext 등의 클래스와 연관성이 있음

#### 클래스 사용 방법
- 각 메소드는 사용자의 요청에 따라 데이터를 조회, 생성, 업데이트, 삭제하는 역할을 수행함
- 메소드 사용 시에는 매개변수로 요청 정보가 들어있는 DataSet 객체와 Request 정보를 전달해줘야 함
- 각 메소드 별로 이용 방법은 메소드 내부에 기재된 주석을 참고하면 되며, 사용자 입력에 따라 적절한 로직을 실행하도록 설계되어 있음.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskexecution/PUCheckRiskExecution.java
### 위험 확인 실행

#### 개요
- 클래스 : PUCheckRiskExecution
- 위험 검사 실행에 관한 로직을 수행하는 클래스입니다. 위험성을 검토하고, 요구사항의 범위를 조회, 추가, 업데이트, 삭제하는 등의 메소드로 구성되어 있습니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 목록을 조회하는 메소드입니다.
##### pmRequirementsScopeAdd
- 요구사항 범위를 추가하는 메소드입니다.
##### pmRequirementsScopeUpd
- 요구사항 범위를 업데이트하는 메소드입니다.
##### pmRequirementsScopeGridUpd
- 요구사항의 범위 그리드를 업데이트하는 메소드입니다.
##### pmRequirementsScopeFileListInq
- 요구사항 범위 파일 목록을 조회하는 메소드입니다.
##### pmRequirementsScopeFileDel
- 요구사항 범위 파일을 삭제하는 메소드입니다.
##### pmRequirementsScopeDel
- 요구사항 범위를 삭제하는 메소드입니다.
##### pmRequirementsScopeExcelDownload
- 요구사항 범위를 엑셀 파일로 다운로드하는 메소드입니다.
##### pmRquirementsScopeReport
- 요구사항 범위에 관한 보고서를 생성하는 메소드입니다.
##### pmRequirementsScopeExcelUpload
- 엑셀 파일로 요구사항 범위를 업로드하는 메소드입니다.
##### pmProgressRateInq
- 진행률을 조회하는 메소드입니다.
##### pmPlanProgressRateInq
- 계획된 진행률을 조회하는 메소드입니다.
##### pmExcelDownloadAll
- 모든 데이터를 엑셀 파일로 다운로드하는 메소드입니다.
##### pmRequirementsScopeHistory
- 요구사항 범위의 히스토리를 조회하는 메소드입니다.
##### pmRequirementsL4Inq
- L4 요구사항 범위를 조회하는 메소드입니다.
##### pmRequirementsScopeObjectUseYN
- 오브젝트 사용 여부를 확인하는 메소드입니다.
##### pmRequirementsScopeObjectUseYNSel
- 오브젝트 사용 여부를 선택하는 메소드입니다.
##### pmDetailCodeSel
- 세부 코드를 선택하는 메소드입니다.
##### pmDetailCodeUseYn
- 세부 코드의 사용 여부를 확인하는 메소드입니다.
##### pmTestExecutionBatch
- 테스트 실행 배치를 처리하는 메소드입니다.
##### pmTestIdNameListInq
- 테스트 아이디의 이름 목록을 조회하는 메소드입니다.

#### 관련 클래스
- DUCheckRiskExecution
- IDataSet
- IOnlineContext
- IRecord
- IRecordSet
- DataSet
- BizRuntimeException
- ExcelManager
- FileResourceManager
- BaseUtils
- UserInfo
- LoggerFactory
- Logger
- File

#### 클래스 사용 방법
주요 메소드는 요구사항의 범위를 관리하는 데 사용되며, 이러한 메소드를 사용하려면 먼저 인스턴스를 생성하고 해당 메소드를 호출해야 합니다. 각 메소드는 필요한 매개변수를 가지며, 일부는 요청 정보 또는 사용자 정보를 포함하는 여러 데이터 집합을 요구합니다. 매개변수를 제공하고 메소드를 호출하면, 메소드는 요청을 처리하고 결과를 반환합니다. 결과는 일반적으로 처리 결과, 오류 메시지 또는 조작된 데이터의 형태로 반환됩니다.
---
## com/skcc/pms/bizcomponent/scope/bcteststatusforcharger/BCTestStatusForChargerController.java
### 충전기상태검사 프로그램

#### 개요
- 클래스 : BCTestStatusForChargerController
- 이 프로그램은 충전기의 상태를 관리하고 조회하는 기능을 제공합니다. 추상화를 통해 테스터의 상태와 동작을 체크하고, 충전기의 리스트를 확인하는 메소드를 구현하였습니다.

#### 메소드
##### pmStatusForTester
- 테스터의 상태를 조회하는 메소드입니다. 해당 메소드는 IDataSet 형식의 요청 데이터와 IOnlineContext 형식의 온라인 컨텍스트 데이터를 입력 받아 실행됩니다.

##### pmChargerListInq
- 충전기의 목록을 조회하는 메소드입니다. 해당 메소드는 IDataSet 형식의 요청 데이터와 IOnlineContext 형식의 온라인 컨텍스트 데이터를 입력 받아 실행됩니다.

##### pmStatusForActionCharger
- 동작하는 충전기의 상태를 조회하는 메소드입니다. 해당 메소드는 IDataSet 형식의 요청 데이터와 IOnlineContext 형식의 온라인 컨텍스트 데이터를 입력 받아 실행됩니다.

#### 관련 클래스
- PUTestStatusForCharger
- IDataSet 
- IOnlineContext

#### 클래스 사용 방법
해당 클래스를 사용하기 위해서는 PUTestStatusForCharger 서비스가 Autowired 되어있는 것이 필요합니다. 특정 메소드를 사용하려면 해당 메소드가 요구하는 요청 데이터(Request Body)와 온라인 컨텍스트를 제공해야합니다. 메소드는 요청 데이터와 온라인 컨텍스트를 가지고 서비스 클래스의 메소드를 실행하며, 그 결과를 IDataSet 형태로 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bcteststatusforcharger/PUTestStatusForCharger.java
### 충전기 상태 검사

#### 개요
- 클래스 : PUTestStatusForCharger
- 이 클래스는 충전기의 상태와 관련된 메소드를 캡슐화합니다. 동작 상태 조회, 테스터 상태 조회, 충전기 리스트 조회 등의 기능이 구현되어 있습니다.

#### 메소드
##### pmStatusForActionCharger
- 요청된 정보를 바탕으로 충전기의 동작 상태를 조회하고 결과를 반환합니다.
##### pmStatusForTester
- 요청된 정보를 바탕으로 테스터의 상태를 조회하고 결과를 반환합니다.
##### pmChargerListInq
- 요청된 정보를 바탕으로 충전기의 리스트를 조회하고 결과를 반환합니다.

##### 관련 클래스
- DUTestStatusForCharger

#### 클래스 사용 방법
PUTestStatusForCharger 클래스는 Service로 선언되어 있으므로, Autowired 어노테이션을 통해 빈을 주입받아 사용할 수 있습니다. 해당 클래스의 메소드는 IDataSet 타입의 요청 데이터와 IOnlineContext 타입의 요청 정보를 파라미터로 받아 요청에 해당하는 처리를 수행한 후 그 결과를 IDataSet 객체로 반환합니다.

---
## com/skcc/pms/bizcomponent/scope/bcteststatusforcharger/DUTestStatusForCharger.java
### 테스트 상태 조회

#### 개요
- 클래스 : DUTestStatusForCharger
- 테스트 상태와 관련된 정보를 조회하기 위한 서비스를 제공한다.

#### 메소드
##### dmStatusForActionCharger
- 요청받은 정보를 바탕으로 상태에 따른 결제기 정보를 조회한다.
- grid의 종류에 따라 서로 다른 조회를 수행한다. (상단 왼쪽/오른쪽 차트 등)
- 테스트 비율(test_rate)에 따라서도 다른 쿼리를 수행한다.

##### dmStatusForTester
- 요청받은 정보를 바탕으로 테스터의 상태를 조회하는 메소드이다.
- grid의 종류에 따라 서로 다른 조회를 수행한다. (상단왼쪽/오른쪽 차트 등)
- 테스트 비율(test_rate)에 따라서도 다른 쿼리를 수행한다.

##### dmChargerListInq
- 요청받은 정보를 바탕으로 테스터 또는 충전기의 목록을 조회한다.
- 충전기 유형(charger_type)에 따라 다른 쿼리를 수행한다.

#### 관련 클래스
- DataUnit
- IOnlineContext
- IDataSet
- IRecordSet
- IRecord
- DataSet

#### 클래스 사용 방법
- 이 클래스는 Singleton으로 수행되며, 여기에 필드를 선언하여 사용하면 동시성 문제를 일으킬 수 있다.
- requestData를 통해 요청 정보를 입력받고, 이 정보를 바탕으로 해당 메소드를 호출하여 원하는 정보를 조회할 수 있다.
- 조회한 정보는 IDataSet, IRecordSet, IRecord 등의 형태로 반환된다. 이를 통해 필요한 정보를 얻을 수 있다.
---
## com/skcc/pms/bizcomponent/scope/bcprogramdevwoori/PUProgramDevWoori.java
### 프로그램 개발 관리

#### 개요
- 클래스 : PUProgramDevWoori
- 프로그램 개발 카테고리에서 범위 관리에 대한 연산을 처리하는 클래스다.

#### 메소드
##### pmScopeListInq
- 요청된 정보 기반으로 범위 목록을 조회한다.

##### pmUserIdCode 
- 요청된 정보 기반으로 사용자 ID 코드를 관리한다.

##### pmProRate
- 요청된 정보 기반의 프로젝트의 진행률 정보를 관리한다.

##### pmTaskName
- 요청된 정보 기반으로 작업명을 관리한다.

##### pmScopeAdd
- 범위 추가 기능을 처리한다.

##### pmScopeUpd
- 범위 업데이트 기능을 처리한다.

##### pmScopeDel
- 범위 삭제 기능을 처리한다.

##### pmScopeGridUpd
- 요청된 정보를 기반으로 범위 그리드를 업데이트한다.

##### pmScopeInq
- 범위 조회 기능을 처리한다.

##### pmPlInfoInq
- 플랫폼 정보 조회 기능을 처리한다.

##### pmConfirmInq
- 확인 조회 기능을 처리한다.

#### 관련 클래스
- DUProgramDevWoori

#### 클래스 사용 방법
특정 범위 목록을 가져오려면 해당 범위 정보를 담은 'requestData'와 'onlineCtx'를 'pmScopeListInq' 메서드에 전달한다. 이 메서드는 처리된 결과를 IDataSet 형태로 반환한다. 이와 비슷한 방법으로 다른 메서드들도 사용할 수 있다.
---
## com/skcc/pms/bizcomponent/scope/bcprogramdevwoori/BCProgramDevWooriController.java
### 프로그램 관리 시스템

#### 개요
- 클래스 : BCProgramDevWooriController
- 이 프로그램은 사용자의 요청 데이터를 처리하고 응답을 생성하는 여러 메소드로 구성된 컨트롤러 클래스입니다. 각 메소드는 서비스 클래스인 PUProgramDevWoori에 요청을 포워딩하고, 처리된 결과를 반환합니다.

#### 메소드

##### pmUserIdCode
- 요청 데이터에 따른 사용자 ID 코드를 조회하는 메소드입니다.

##### pmProRate
- 프로젝트의 진척률을 조회하는 메소드입니다.

##### pmApprovalSettingInq
- 승인 설정을 조회하는 메소드입니다.

##### pmExcelDownload
- Excel 파일을 다운로드하는 메소드입니다.

##### pmExcelUpload
- Excel 파일을 업로드하는 메소드입니다.

##### pmScopeUpd
- 프로젝트 범위를 업데이트하는 메소드입니다.

##### pmScopeDel
- 프로젝트 범위를 삭제하는 메소드입니다.

##### pmScopeAdd
- 프로젝트 범위를 추가하는 메소드입니다.

##### pmTaskName
- 작업 이름을 조회하는 메소드입니다.

##### pmScopeInq
- 프로젝트 범위를 조회하는 메소드입니다.

##### pmScopeListInq
- 프로젝트 범위 리스트를 조회하는 메소드입니다.

#### 관련 클래스
- PUProgramDevWoori

#### 클래스 사용 방법
이 클래스의 메소드들은 클라이언트의 요청을 처리하고, 요청된 작업을 수행한 후 결과를 반환합니다. 각 메소드는 @RequestMapping 어노테이션이 붙은 URL에 대한 요청을 처리하며, @ResponseBody 어노테이션이 붙어 있어 반환값이 HTTP 응답 본문에 직접 쓰여집니다. 따라서 이 클래스의 메소드들은 HTTP 요청과 함께 들어온 데이터를 IDataSet 형태로 받아 해당 작업을 수행하고, 결과를 IDataSet 형태로 반환하거나, 특정 파일을 다운로드 가능한 형태로 제공합니다.
---
## com/skcc/pms/bizcomponent/scope/bctestplanperform/DUTestPlanPerform.java
### 테스트 계획 수행 관리

#### 개요
- 클래스 : DUTestPlanPerform
- 테스트 계획과 수행 관리를 진행하는 시스템

#### 메소드
##### getFileUploadRootPath
- 파일 업로드 Root를 반환

##### getImageUploadRootPath
- 이미지 업로드 Root를 반환

##### dmListInq
- 요청 정보를 사용하여 데이터를 조회

##### dmTestPlanPerformAdd
- 테스트 계획 수행 정보를 추가

##### dmTestPlanPerformUpd
- 테스트 계획 수행 정보를 업데이트

##### dmTestPlanPerformDel
- 테스트 계획 수행 정보를 삭제

##### dmExcelDataAllDownload
- 엑셀 데이터를 일괄 다운로드

##### dmExcelUpload
- 엑셀 데이터를 일괄 업로드

##### dmTestPlanPerformFileDel
- 테스트 계획 수행 파일을 삭제

##### dmTestPlanPerformInqCase
- 테스트 계획 수행 정보를 조회

##### dmTestPlanPerforml4Inq
- 테스트 계획 수행 관련 정보를 조회

##### dmTestDefectManagementHistory
- 테스트 결과 관련 히스토리 정보를 조회

##### dmIntegratedHistory
- 통합 히스토리 정보를 조회

##### dmTestPlanPerformFileListInq
- 테스트 계획 수행 관련 파일 리스트 조회

##### dmTestPlanPerformFile
- 테스트 계획 수행 관련 파일 정보 처리

##### dmImageInq
- 이미지 정보 조회

##### dmTestPlanPerformFileListInq
- 테스트 계획 수행 관련 파일 리스트 조회

#### 관련 클래스
- LoggerFactory
- Map
- BaseUtils
- DataUnit
- IOnlineContext
- Base64
- Constants
- DateUtils

#### 클래스 사용 방법
- 이 클래스는 테스트 계획의 실행과 관리를 위한 여러 기능을 제공합니다. 필요한 기능에 따라 해당 메소드를 호출하여 사용합니다.
---
## com/skcc/pms/bizcomponent/scope/bctestplanperform/PUTestPlanPerform.java
### 테스트 계획 수행 관리

#### 개요
- 클래스 : PUTestPlanPerform
- 본 클래스는 테스트 계획 및 그에 따른 실행을 관리하기 위한 소스 코드이다. 여러가지 메소드를 통해 데이터의 조회, 추가, 갱신, 삭제 등을 진행하며, 연관된 클래스를 통해 특정 데이터 또는 결과를 반환한다.

#### 메소드
##### pmListInq
- 요청된 데이터를 바탕으로 특정 리스트를 조회하는 메소드
##### pmTestPlanPerformAdd
- 테스트 계획을 새로 추가하는 메소드
#####  pmTestPlanPerformUpd
- 테스트 계획을 갱신하는 메소드
##### pmTestPlanPerformDel
- 테스트 계획을 삭제하는 메소드
##### pmExcelDataAllDownload
- 엑셀 데이터 전체를 다운로드하는 메소드
  
이외에도 다양한 메소드가 존재한다.

##### 관련 클래스
- DUTestPlanPerform

#### 클래스 사용 방법
1. PUTestPlanPerform 클래스를 생성한다.
2. 해당 클래스의 메소드를 호출하여 원하는 기능을 수행한다. 
   예를 들어 테스트 계획을 추가하려면 pmTestPlanPerformAdd 메소드를 사용한다.
3. 각 메소드는 요청 데이터와 일부 기타 정보를 입력값으로 받으며, 결과값으로 DataSet 객체를 반환한다.
4. 반환된 DataSet 객체를 통해 원하는 정보를 얻을 수 있다.
---
## com/skcc/pms/bizcomponent/scope/bctestplanperform/BCTestPlanPerformController.java
### 테스트 계획 수행 관리 시스템

#### 개요
이 시스템은 테스트 계획의 수행에 관한 다양한 기능을 담당하며, 이를 위해 RESTful API를 제공하는 웹 서버 베이스의 어플리케이션입니다.

#### 메소드
##### pmListInq
- 테스트 계획의 리스트를 조회하는 메소드입니다.
##### pmTestPlanPerformAdd
- 테스트 계획을 추가하는 메소드입니다.
##### pmTestPlanPerformUpd
- 테스트 계획을 수정하는 메소드입니다.
##### pmTestPlanPerformDel
- 테스트 계획을 삭제하는 메소드입니다.
##### pmExcelDataAllDownload
- 엑셀 형태로 데이터 전체를 다운로드하는 메소드입니다.
##### pmExcelUpload
- 엑셀 형태의 데이터를 업로드하는 메소드입니다.
##### pmTestPlanIntegratedGridUpd
- 테스트 계획 통합 그리드를 업데이트하는 메소드입니다.
##### pmTestIdNameListInq
- 테스트 아이디 명단을 조회하는 메소드입니다.
##### pmProjectUserListInq
- 프로젝트 사용자 명단을 조회하는 메소드입니다.
##### pmTestPlanPerformFileListInq
- 테스트 계획 수행에 관련된 파일 리스트를 조회하는 메소드입니다.
##### pmTestPlanPerformFile
- 테스트 계획 수행에 관련된 파일을 조회하는 메소드입니다.
##### etc..

#### 관련 클래스
- PUTestPlanPerform

#### 클래스 사용 방법
이 클래스는 주로 테스트 계획의 수행을 관리하기 위해 사용됩니다. 각각의 메소드는 특정한 기능을 수행하며, 대부분 데이터 조회, 생성, 수정, 삭제와 같은 CRUD 연산을 수행합니다. HttpRequest를 통해 요청되는 데이터(@RequestBody IDataSet requestData)와 IOnlineContext를 매개변수로 각 메소드가 호출됩니다.
---
## com/skcc/pms/bizcomponent/scope/bctestexecution/PUTestExecution.java
### 테스트 실행

#### 개요
이 프로그램은 테스트 실행과 관련된 다양한 기능을 제공합니다. 테스트 요구사항의 범위 조사, 요구사항 범위 추가, 요구사항 범위 수정, 요구사항 범위 그리드 업데이트, 요구사항 범위 파일 목록 조회, 요구사항 범위 파일 삭제, 요구사항 범위 삭제, 요구사항 범위 엑셀 업로드, 요구사항 범위 엑셀 다운로드, 요구사항 범위 관련 보고서 작성 등의 기능을 제공합니다.

#### 메소드
##### pmRequirementsScopeListInq
- 테스트 요구사항의 범위를 조사합니다.
##### pmRequirementsScopeAdd
- 테스트 요구사항 범위를 추가합니다.
##### pmRequirementsScopeUpd
- 테스트 요구사항 범위를 수정합니다.
##### pmRequirementsScopeGridUpd
- 테스트 요구사항 범위의 그리드를 업데이트합니다.
##### pmRequirementsScopeFileListInq
- 테스트 요구사항 범위에 관련된 파일 목록을 조회합니다.
##### pmRequirementsScopeFileDel
- 테스트 요구사항 범위에 관련된 파일을 삭제합니다.
##### pmRequirementsScopeDel
- 테스트 요구사항 범위를 삭제합니다.
##### pmRequirementsScopeExcelDownload
- 테스트 요구사항 범위 정보를 엑셀 파일로 다운로드합니다.
##### pmRquirementsScopeReport
- 테스트 요구사항 범위에 관련된 보고서를 생성합니다.
##### pmRequirementsScopeExcelUpload
- 엑셀 파일의 테스트 요구사항 범위 정보를 업로드합니다.
##### pmProgressRateInq
- 진행률을 조회합니다.
##### pmPlanProgressRateInq
- 계획 진행률을 조회합니다.
##### pmExcelDownloadAll
- 테스트 요구사항 범위 전체 데이터를 엑셀로 다운로드합니다.
##### pmRequirementsScopeHistory
- 테스트 요구사항 범위의 변경 이력을 조회합니다.
##### pmRequirementsL4Inq
- L4 요구사항을 조회합니다.
##### pmRequirementsScopeObjectUseYN
- 요구사항 범위의 사용 여부를 조회합니다.
##### pmRequirementsScopeObjectUseYNSel
- 요구사항 범위의 사용 여부를 선택하여 조회합니다.
##### pmDetailCodeSel
- 세부 코드를 선택하여 조회합니다.
##### pmDetailCodeUseYn
- 세부 코드의 사용 여부를 확인합니다.
##### pmTestExecutionBatch
- 테스트 실행 배치를 수행합니다.
##### pmTestIdNameListInq
- 테스트 ID 및 이름을 조회합니다.
##### pmImageInq
- 이미지를 조회합니다.
##### pmTestExcutionHistory
- 테스트 실행의 이력을 조회합니다.

##### 관련 클래스
- DUTestExecution

#### 클래스 사용 방법
- 이 클래스는 Singleton 객체로 수행됩니다. 필드를 선언하여 사용하면 동시성 문제를 일으킬 수 있습니다.
- 각 메소드를 통해 테스트 실행과 관련된 다양한 작업을 수행할 수 있습니다: 요구사항 범위 조회, 요구사항 범위 추가, 요구사항 범위 수정, 요구사항 범위 그리드 업데이트, 파일 목록 조회, 파일 삭제, 범위 삭제, 엑셀 업로드, 엑셀 다운로드 등을 수행할 수 있습니다.
- 각 메소드는 요청 정보 DataSet 객체와 Request 정보, 두 가지 매개변수를 가져야합니다. 처리 결과는 DataSet 객체로 반환됩니다.
- 요청 정보 DataSet 객체는 요청에 필요한 데이터를 포함합니다.
- 모든 메소드가 BizRuntimeException을 throw할 수 있으며, 이는 비즈니스 로직 실행 중 문제가 발생했음을 나타냅니다.
---
## com/skcc/pms/bizcomponent/scope/bctestexecution/BCTestExecutionController.java
### 테스트 실행 컨트롤러

#### 개요
테스트 실행과 관련된 내용들을 정의해놓은 컨트롤러입니다. 사용자의 요청에 따라 서비스를 호출하고 결과를 반환합니다.

#### 메소드

##### pmRequirementsScopeListInq
- 요구사항 범위 목록 조회

##### pmRequirementsScopeAdd
- 요구사항 범위 추가

##### pmRequirementsScopeUpd
- 요구사항 범위 업데이트

##### pmRequirementsScopeGridUpd
- 요구사항 범위 그리드 업데이트

##### pmRequirementsScopeFileDel
- 요구사항 범위 파일 삭제

##### pmRequirementsScopeDel
- 요구사항 범위 삭제

##### pmRquirementsScopeReport
- 요구사항 범위 리포트

##### pmPlanProgressRateInq
- 계획 진행률 조회

##### pmRequirementsScopeHistory
- 요구사항 범위 이력

##### pmImageInq
- 이미지 조회

##### pmExcelDownloadAll
- 엑셀 전체 다운로드

##### pmRequirementsScopeFileListInq
- 요구사항 범위 파일 목록 조회

##### pmRequirementsScopeExcelDownload
- 요구사항 범위 엑셀 다운로드

##### pmRequirementsScopeExcelUpload
- 요구사항 범위 엑셀 업로드

##### pmDetailCodeSel
- 세부 코드 선택

##### pmDetailCodeUseYn
- 세부 코드 사용 여부

##### pmTestIdNameListInq
- 테스트 ID 이름 목록 조회

##### pmTestExecutionBatch
- 테스트 실행 배치

##### pmRequirementsL4Inq
- 4단계 요구사항 조사

##### pmProgressRateInq
- 진행률 조회

##### pmRequirementsScopeObjectUseYN
- 요구사항 범위 객체 사용 여부

##### pmRequirementsScopeObjectUseYNSel
- 요구사항 범위 객체 사용 여부 선택

##### pmTestExcutionHistory
- 테스트 실행 이력

#### 관련 클래스
- PUTestExecution

#### 클래스 사용 방법
이 클래스의 메소드는 대부분 웹 API 엔드포인트로 작동되며, 웹 요청을 수신하면 서버에서 해당 메소드를 호출합니다. 각 메소드는 입력 파라미터를 받아 처리하고, 처리 결과를 반환합니다. 입력 파라미터와 반환 타입은 메소드마다 다르며, 주로 IDataSet을 사용합니다. IDataSet은 데이터 집합을 나타내는 인터페이스로, 부가적인 정보와 결과 데이터를 포함합니다. IOnlineContext는 세션 정보, 사용자 정보, 트랜잭션 정보 등 온라인 처리에 필요한 정보를 제공합니다.
---
## com/skcc/pms/bizcomponent/scope/bctestexecution/DUTestExecution.java
### 테스트 실행 관리

#### 개요
테스트 실행 관리 모듈의 소스 코드입니다. 프로그램은 테스트 케이스 또는 테스트 시나리오를 실행하고, 진행 상황을 추적하고, 생성된 결과를 보고하는 기능을 수행합니다.

#### 메소드
###### dmRequirementsScopeListInq
- 요구사항의 목록을 조회합니다.
###### dmRequirementsScopeAdd
- 새로운 요구사항을 추가합니다.
###### dmRequirementsScopeUpd
- 기존의 요구사항을 업데이트합니다.
###### dmRequirementsScopeDel
- 선택한 요구사항을 삭제합니다.
###### dmRequirementsScopeExcelDownload
- 요구사항 목록을 엑셀 파일로 다운로드합니다.
###### dmRequirementsScopeExcelUpload
- 엑셀 파일로부터 요구사항 목록을 업로드합니다.

#### 관련 클래스
- AuthUtil: 사용자 인증을 관리하는 유틸리티
- FileResourceManager: 파일 리소스 관리를 담당하는 클래스
- Jsoup: HTML 문서 파싱과 관련된 클래스
- ZipFile: 압축 파일 생성 및 관리를 담당하는 클래스

#### 클래스 사용 방법
클래스는 주로 비즈니스 로직 수행을 위해 사용됩니다. 각 메소드는 특정 작업을 수행하기 위해 필요한 요청 데이터(IDataSet)와 요청 컨텍스트(IOnlineContext)를 매개 변수로 받습니다. 메소드의 반환값은 처리 결과를 포함하는 IDataSet 객체입니다. 메소드가 호출되면 요청 데이터를 기반으로 적절한 비즈니스 로직을 수행하고, 결과를 IDataSet 객체에 담아 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskplan/DUCheckRiskPlan.java
### 리스크 체크 플랜 관리

#### 개요
이 프로그램은 산출물에 대한 리스크 체크 계획 생성, 수정, 조회, 삭제 기능을 제공합니다.

#### 메소드
##### dmRequirementsScopeListInq
- 요구 사항 범위 목록 조회를 위한 메소드입니다.

##### dmRequirementsScopeAdd
- 요구 사항 범위 추가를 위한 메소드입니다.

##### dmRequirementsScopeUpd
- 요구 사항 범위 업데이트를 위한 메소드입니다.

##### dmRequirementsScopeGridUpd
- 요구 사항 범위 그리드 업데이트를 위한 메소드입니다.

##### dmRequirementsScopeDel
- 요구 사항 범위 삭제를 위한 메소드입니다.

##### dmRequirementsScopeExcelDownload
- 요구 사항 범위 엑셀 다운로드를 위한 메소드입니다.

#### 관련 클래스
- DUCheckRiskPlan

#### 클래스 사용 방법
선택한 산출물에 대한 리스크 체크 계획을 생성하거나 기존의 리스크 체크 계획을 수정하거나 삭제할 수 있습니다.
또한 생성된 리스크 체크 계획 정보를 CSV 파일로 다운로드할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskplan/PUCheckRiskPlan.java
### 위험계획 체크 프로그램 (Risk Plan Check Program)

#### 개요
이 프로그램은 위험계획을 체크하고 관리하는데 사용됩니다. 복잡한 작업을 효율적으로 수행하기 위해 여러가지 메소드를 포함하고 있습니다.

#### 메소드
##### pmRequirementsScopeListInq()
- 요구사항 범위 목록을 조회하는 메소드입니다.

##### pmRequirementsScopeAdd()
- 요구사항 범위를 추가하는 메소드입니다.

##### pmRequirementsScopeUpd()
- 요구사항 범위를 업데이트하는 메소드입니다.

##### pmRequirementsScopeFileListInq()
- 요구사항 범위에 속한 파일 목록을 조회하는 메소드입니다.

##### pmRequirementsScopeFileDel()
- 요구사항 범위에 속한 파일을 삭제하는 메소드입니다.

##### pmRequirementsScopeDel()
- 요구사항 범위를 삭제하는 메소드입니다.

##### pmRequirementsScopeExcelDownload()
- 요구사항 범위를 엑셀로 다운로드하는 메소드입니다.

##### pmRquirementsScopeReport()
- 요구사항 범위에 대한 보고서를 생성하는 메소드입니다.

##### pmRequirementsScopeExcelUpload()
- 엑셀에서 요구사항 범위를 업로드하는 메소드입니다.

#### 관련 클래스
- DUCheckRiskPlan: 위험계획 체크에 필요한 데이터를 처리하는 클래스입니다.

#### 클래스 사용 방법
서비스 클래스로서, 스프링의 @Autowired 어노테이션을 통해 스프링 컨테이너에서 자동으로 주입받아 사용합니다. 각 메소드들은 요청 정보와 히트 정보를 파라미터로 받아 처리 후, 처리한 결과 정보를 반환합니다. 각 메소드 내부에서는 DUCheckRiskPlan 클래스의 메소드를 호출하여 실제로 데이터를 처리합니다. 매개변수는 IDataSet 객체로, 요청 정보를 담고 있으며, 반환형은 IDataSet으로 처리 결과 정보를 값으로 가집니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskplan/BCCheckRiskPlanController.java
### 위험계획 확인 컨트롤러 (BCCheckRiskPlanController)

#### 개요
본 프로그램은 위험 계획을 관리하고 확인을 위한 컨트롤러 역할을 수행합니다. 계획의 요구사항 목록, 계획 삭제, 테스트 ID 이름 조회 등 기능을 제공합니다.

#### 메소드

##### pmRequirementsScopeListInq
- 요구사항 범위 목록 조회

##### pmRequirementsScopeAdd
- 요구사항 범위 추가

##### pmRequirementsScopeUpd
- 요구사항 범위 업데이트

##### pmRequirementsScopeGridUpd
- 요구사항 그리드 업데이트

##### pmRequirementsScopeFileDel
- 요구사항 파일 삭제

##### pmRequirementsScopeDel
- 요구사항 범위 삭제

##### pmPlanProgressRateInq
- 계획 진행률 조회

##### pmRequirementsScopeFileListInq
- 요구사항 파일 목록 조회

##### pmTestIdNameListInq
- 테스트 ID 이름 목록 조회

##### pmRequirementsL4Inq
- L4 요구사항 조회

##### pmTestStatusLeftChart
- 테스트 상태 왼쪽 차트 조회

##### pmTestPlanGridRight
- 테스트 계획 그리드 오른쪽 조회

##### pmTestPlanSceInq
- 테스트 계획 장면 조회

##### TestStatusGrid
- 테스트 상태 그리드 조회

##### pmTestPlanGridLeft
- 테스트 계획 그리드 왼쪽 조회

##### pmTestCaseDefectStatus
- 테스트 케이스 결함 상태 조회

##### pmTestSequenceInq
- 테스트 순서 조회

##### pmTestGetObject
- 테스트 객체 가져오기

##### pmTestGetLinkCode
- 테스트 링크 코드 가져오기

##### pmChangeFieldBatch
- 필드 배치 변경

##### pmDashboard3OpinionFileListInq
- 대시보드 분석 파일 목록 조회

##### 관련 클래스
- PUCheckRiskPlan

#### 클래스 사용 방법
클래스의 각 메서드를 이용하여 특정 요청에 대응되는 서비스를 호출하고, 그 결과를 반환함으로써 클라이언트에 정보를 제공하는 역할을 수행합니다. 따라서 사용자는 해당 메서드 호출을 통해 필요한 기능을 사용하거나 정보를 가져올 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcrequirementsvocscopemanager/PURequirementsVocScopeManager.java
### 요구사항 VOC 범위 관리 프로그램

#### 개요
이 프로그램은 요구사항의 VOC 범위를 관리하는 프로그램으로, 각종 CRUD 기능, 파일 업로드/다운로드 기능과 엑셀 다운로드/업로드 기능을 포함하고 있다. 사용자는 해당 프로그램을 통해 요구사항의 VOC 범위와 관련된 작업을 수행할 수 있다.

#### 메소드
##### pmRequirementsVocScopeListInq
- 요구사항의 VOC 범위의 목록을 조회하는 메소드
##### pmRequirementsVocScopeAdd
- 요구사항의 VOC 범위를 추가하는 메소드
##### pmRequirementsVocScopeDel
- 요구사항의 VOC 범위를 삭제하는 메소드
##### pmRequirementsVocScopeUpd
- 요구사항의 VOC 범위를 업데이트하는 메소드
##### pmRequirementsVocScopeExcelDownload
- 요구사항의 VOC 범위를 엑셀 형식으로 다운로드하는 메소드
##### pmRequirementsVocScopeExcelUpload
- 엑셀 형식의 요구사항 VOC 범위를 업로드하는 메소드
##### pmRequirementsVocScopeFileListInq
- VOC 범위와 관련된 파일 목록을 조회하는 메소드
##### pmRequirementsVocScopeFileDel
- VOC 범위와 관련된 파일을 삭제하는 메소드
##### pmExcelDownloadAll
- 모든 데이터를 엑셀 파일로 다운로드하는 메소드
##### pmExcelReportDownload
- 보고서를 엑셀 파일로 다운로드하는 메소드
##### pmRequirementsVocScopeReviewListInq
- VOC 범위 리뷰 목록을 조회하는 메소드
##### pmRequirementsVocScopeReviewDel
- VOC 범위 리뷰를 삭제하는 메소드

#### 관련 클래스
- DURequirementsVocScopeManager
- IDataSet
- IOnlineContext
- IRecord
- IRecordSet

#### 클래스 사용 방법
첫째, 이 클래스는 스프링 빈으로 등록되어 있으며, Autowired를 통해 필요한 서비스나 DAO를 주입받아 사용한다. 둘째, 이 클래스의 각 메소드는 주로 요청 정보를 입력받아 처리하고 결과를 반환하는 형태로 동작한다. 셋째, 입력받은 요청 정보는 주로 IDataSet 인터페이스를 구현한 객체를 통해 전달되며, 이 객체는 다양한 형태의 데이터를 쉽게 다룰 수 있는 메소드를 제공한다. 넷째, 각 메소드마다 예외 처리가 되어있으며, 비즈니스 로직 처리 중 발생하는 예외는 BizRuntimeException을 통해 처리된다.
---
## com/skcc/pms/bizcomponent/scope/bcrequirementsvocscopemanager/DURequirementsVocScopeManager.java
### 요구사항 VOC 범위 관리

#### 개요
이 프로그램은 SK C&C의 요구사항 Vocal of Customers(VOC) 범위 관리에 사용되는 프로그램으로 주로 검색, 추가, 업데이트, 삭제 등의 기능을 수행하도록 구현되어 있다. 여기에는 표준 데이터 입력 및 검색을 위한 도구로 사용되는 IDataSet 및 IRecordSet 클래스와 상황별 데이터 처리를 위한 BizRuntimeException 클래스 등이 포함되어 있다.

#### 메소드
##### dmRequirementsVocScopeExcelDownload
- 요청 정보를 통해 VOC 범위 데이터를 엑셀 파일로 다운로드한다.

##### dmRequirementsVocScopeListInq
- 요청 정보를 받아 VOC 범위 목록을 조회한다.

##### dmRequirementsVocScopeAdd
- 요청 정보를 받아 새로운 VOC 범위를 추가한다.

##### dmRequirementsVocScopeFileListInq
- 요청 정보를 이용해 VOC 범위에 관련된 파일 목록을 조회한다.

##### dmRequirementsVocScopeDel
- 요청 정보를 이용해 VOC 범위 정보를 삭제한다.

#### 관련 클래스
- IDataSet: 데이터 조각을 관리하고 데이터 셋을 얻거나 관리하는 클래스
- IRecordSet: IDataSet에서 얻은 데이터셋에서 개별 레코드를 참조하거나 관리하는 클래스
- BizRuntimeException: 비즈니스 예외 처리를 위한 클래스

#### 클래스 사용 방법
각 메소드는 IDataSet와 IOnlineContext 두 가지 인자를 받는다. IDataSet는 요청 데이터를 담는 인터페이스로 이 클래스의 getField 혹은 getRecordSet 메소드를 이용해 필요한 데이터를 얻을 수 있다. IOnlineContext는 요청 정보가 저장된 객체로 디버그 로깅, 사용자 정보 조회 등의기능을 제공한다. 

예시로 dmRequirementsVocScopeAdd 메소드를 사용하는 경우:
- IDataSet에 필요한 입력 정보(요건ID, 요건제기부서, 차세대팀 등)를 저장하고 메소드를 호출한다.
- 메소드가 실행되면, 입력된 정보에 따라 새로운 요구사항 VOC 범위가 데이터베이스에 추가된다. 

위와 같은 방식으로 각 메소드를 사용하며, 각 메소드는 목적에 따라 데이터를 삽입, 조회, 업데이트, 삭제 등 다양한 동작을 수행한다. 위 클래스의 메소드에 알맞은 요청 정보를 담아 사용하면, 복잡한 데이터 처리 없이도 원하는 동작을 수월하게 수행할 수 있다.
---
## com/skcc/pms/bizcomponent/scope/bcrequirementsvocscopemanager/BCRequirementsVocScopeManagerController.java
### 요구사항 범위 관리 

#### 개요
이 프로그램은 Voc 요구사항 범위를 관리하는 서비스를 제공하는 컨트롤러입니다. 파일 다운로드, 업로드, 제거, 수정, 의뢰, 검토 목록 조회 등 다양한 기능을 제공합니다.

#### 메소드
##### pmExcelDownloadAll
- 모든 데이터를 엑셀 파일로 다운로드하는 메소드입니다.

##### pmRequirementsVocScopeDel
- 요구사항 범위를 삭제하는 메소드입니다.

##### pmRequirementsVocScopeUpd
- 요구사항 범위를 업데이트하는 메소드입니다.

##### pmRequirementsVocScopeFileDel
- 요구사항 범위 파일을 삭제하는 메소드입니다.

##### pmRequirementsVocScopeAdd
- 요구사항 범위를 추가하는 메소드입니다.

##### pmRequirementsVocScopeListInq
- 요구사항 범위 리스트를 조회하는 메소드입니다.

##### pmExcelReportDownload
- 보고서를 엑셀 파일로 다운로드하는 메소드입니다.

##### pmRequirementsVocScopeExcelDownload
- 요구사항 범위 데이터를 엑셀 파일로 다운로드하는 메소드입니다.

##### pmRequirementsVocScopeFileListInq
- 요구사항 범위 파일 리스트를 조회하는 메소드입니다.

##### pmRequirementsVocScopeExcelUpload
- 요구사항 범위 데이터를 엑셀 파일로 업로드하는 메소드입니다.

##### pmRequirementsVocScopeReviewListInq
- 요구사항 범위 리뷰 리스트를 조회하는 메소드입니다.

##### pmRequirementsVocScopeReviewDel
- 요구사항 범위 리뷰를 삭제하는 메소드입니다.

#### 관련 클래스
- PURequirementsVocScopeManager
- IDataSet
- IOnlineContext
- DownloadView

#### 클래스 사용 방법
위의 메소드를 호출하여 요구사항 범위 관리 기능을 이용할 수 있습니다. 각 메소드는 필요에 따라 요청 데이터와 온라인 컨텍스트를 인자로 받습니다. 메소드의 반환 값은 일반적으로 서비스에서 처리된 결과 데이터 셋입니다. 경우에 따라서는 파일 다운로드 뷰를 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerforhk/BCRequirementsScopeManagerForHKController.java
### 요구사항 관리 프로그램

#### 개요
이 프로그램은 SKCC에서 사용하는 요구사항 관리 소프트웨어 컨트롤러의 일부입니다. 본 프로그램이 제공하는 기능에는 요구사항 범위 조회, 요구사항 추적, 요구사항 등록, 요구사항 업데이트, 요구사항 삭제 및 관련 파일의 이력 조회 등이 포함됩니다. 또한 해당 요구사항에 대한 상세 코드를 조회하고 사용할 수 있는 여부를 확인할 수도 있습니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 조회를 위한 메소드
##### pmRequirementsScopeAdd
- 새로운 요구사항을 등록하기 위한 메소드
##### pmRequirementsScopeUpd
- 이미 등록된 요구사항을 업데이트 하기 위한 메소드
##### pmRequirementsScopeDel
- 존재하는 요구사항을 삭제하기 위한 메소드
##### pmRquirementsScopeReport
- 요구사항 범위보고서를 생성하고, 이를 다운로드할 수 있는 경로를 제공하는 메소드

##### 관련 클래스
- PURequirementsScopeManagerForHK
  - 앞서 언급한 여러 요구사항에 대한 처리를 수행하는 서비스 클래스
- IDataSet
  - 데이터의 구조 및 영역을 정의하는 클래스
- IOnlineContext
  - 현재 사용자의 작업 및 상태에 대한 정보를 제공하는 클래스
- DownloadView
  - 파일 다운로드를 위한 뷰를 반환하는 클래스

#### 클래스 사용 방법
BCRequirementsScopeManagerForHKController 클래스를 사용하기 위해서는 먼저 해당 클래스의 인스턴스를 생성해야 한다. 그리고 가장 중요한 건, 이 클래스를 사용하기 위해 필요한 매개변수를 전달하는 것이다(예: 요구사항 등록을 위해서는 요구사항에 대한 정보를 가진 IDataSet 인스턴스와 사용자의 상황을 알려주는 IOnlineContext 인스턴스가 필요하다). 각 메소드 호출은 요구사항에 대한 특정 동작을 수행하며, 이에 따라 IDataSet을 반환한다.

---
## com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerforhk/DURequirementsScopeManagerForHK.java
### 요구사항 범위 관리 클래스

#### 개요
해당 클래스는 요구사항 범위를 관리하는 다양한 기능을 수행합니다. 예를 들어, 요구사항의 리스트 조회, 추가, 수정, 엑셀업로드, 검사 등의 기능을 제공합니다.

#### 메소드
##### dmRequirementsScopeListInq
- 요청 정보 DataSet을 기반으로 요구사항 리스트를 조회합니다.

##### dmRequirementsScopeAdd
- 요청 정보 DataSet을 기반으로 요구사항을 추가합니다.

##### dmRequirementsScopeUpd
- 요청 정보 DataSet을 기반으로 요구사항을 수정합니다.

##### dmRequirementsScopeGridUpd
- 요청 정보 DataSet을 기반으로 Grid 내의 요구사항을 업데이트합니다.

##### dmRequirementsScopeDel
- 요구사항을 삭제합니다.

##### dmRequirementsScopeFileListInq
- 요구사항과 연계된 파일 리스트를 조회합니다.

##### dmRequirementsScopeFileDel
- 요구사항과 연계된 파일을 삭제합니다.

##### dmRequirementsScopeExcelDownload
- 요구사항 리스트를 엑셀파일로 다운로드합니다.

##### dmRequirementsScopeExcelUpload
- 엑셀파일로 요구사항을 업로드합니다.

#### 관련 클래스
- com.skcc.pms.bizcomponent.scope.bctestmanagerfortms.DUTestManagerforTMS: 테스트 관리 기능을 수행하는 클래스
- com.skcc.pms.support.file.ExcelManager: 엑셀 관련 처리를 수행하는 클래스
- com.skcc.pms.support.file.FileResourceManager: 파일 리소스 관리를 수행하는 클래스

#### 클래스 사용 방법
해당 클래스의 메소드를 호출하며, 각 메소드의 파라미터에는 요구사항 관련 정보를 담고 있는 DataSet 객체와 온라인 컨텍스트를 전달합니다. 메소드는 처리 결과를 담고 있는 DataSet 객체를 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bcrequirementsscopemanagerforhk/PURequirementsScopeManagerForHK.java
### 요구사항 범위 관리
#### 개요
이 프로그램은 요구사항의 범위를 관리하는 기능을 수행합니다. 요구사항 목록 조회, 추가, 수정, 삭제, 파일 리스트 조회, 파일 삭제, 요구사항 범위 엑셀 다운로드, 요구사항 범위 리포트, 요구사항 범위 엑셀 업로드 등의 기능을 지원합니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 목록 조회
##### pmRequirementsScopeAdd
- 요구사항 범위 추가
##### pmRequirementsScopeUpd
- 요구사항 범위 수정
##### pmRequirementsScopeDel
- 요구사항 범위 삭제
##### pmRequirementsScopeFileListInq
- 요구사항 범위 파일 목록 조회
##### pmRequirementsScopeFileDel
- 요구사항 범위 파일 삭제
##### pmRequirementsScopeExcelDownload
- 요구사항 범위 엑셀 다운로드
##### pmRequirementsScopeExcelUpload
- 요구사항 범위 엑셀 업로드
##### pmProgressRateInq
- 진행률 조회
##### pmPlanProgressRateInq
- 계획 진행률 조회
##### pmExcelDownloadAll
- 전체 엑셀 다운로드
##### pmRequirementsScopeHistory
- 요구사항 범위 히스토리 조회
##### pmRequirementsScopeL4Check
- 요구사항 범위 L4 확인
##### pmDetailCodeUseYn
- 상세 코드 사용 여부 확인
##### pmRequirementsDetailCodeInq
- 요구사항 상세 코드 조회
##### pmGetSubProjectNo
- 하위 프로젝트 번호 가져오기
##### pmGetReqmStatus
- 요구사항 상태 가져오기

#### 관련 클래스
- DURequirementsScopeManagerForHK
- PUITSIssueLinkManager
- DUAutonumberManager

#### 클래스 사용 방법
이 클래스는 주로 요구사항의 범위에 대해 조회, 추가, 수정, 삭제하는 메소드를 제공하며, 각 메소드는 requestData와 onlineCtx 파라미터를 받는다. requestData는 요청에 대한 정보를 담고 있는 DataSet 객체이고, onlineCtx는 요청에 대한 정보를 담고 있는 IOnlineContext 객체이다. 각 메소드는 처리 결과를 IDataSet 객체에 담아 반환한다. 

예를 들어, 요구사항 범위 중에서 특정 요구사항을 조회하려면 pmRequirementsScopeListInq 메소드를 사용하고, 요구사항을 추가하려면 pmRequirementsScopeAdd 메소드를 사용한다. 이와 같은 방식으로 각 메소드를 호출하면 해당하는 기능을 수행할 수 있다.

---
## com/skcc/pms/bizcomponent/scope/bcinterfacedevmanager/PUInterfacedevManager.java
### 프로그램 관리
#### 개요
- Spring 기반의 프로그램 관리를 위한 클래스입니다.
- 파일 업로드 및 엑셀 일괄 처리 등의 기능을 제공합니다.
- exceldownload, filedelete, scoperetrieve 등의 메서드가 제공됩니다.

#### 메소드
##### pmScopeListInq
- 요청 정보에 따른 리턴 데이터셋을 반환합니다.

##### pmUserIdCode
- 프로젝트 번호와 하위 프로젝트 번호를 입력값으로 받아서 처리 결과를 반환합니다.

##### pmProRate
- 요청 정보를 받아서 진행 상황을 반환합니다.

##### pmTaskName
- 요청 정보를 받아서 작업 이름을 반환합니다.

##### 관련 클래스
- DUInterfacedevManager
- DUAutonumberManager

#### 클래스 사용 방법
1. 필요한 메서드를 호출하여 특정 작업을 수행합니다.
2. 메서드의 요청 정보(IDataSet)을 가지고 각 메서드를 사용합니다.
3. 각 메서드는 처리 결과를 IDataSet 형태로 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bcinterfacedevmanager/BCInterfacedevManagerController.java
### 인터페이스 개발 관리자 컨트롤러

#### 개요
이 프로그램은 여러 행동들을 처리하는 인터페이스 개발 관리자 컨트롤러입니다.

#### 메소드
##### pmExcelDownload
- 엑셀 파일 다운로드를 위한 메소드입니다.
##### pmAttchFileListInq
- 첨부 파일 목록 조회를 위한 메소드입니다.
##### pmFileDownload
- 파일 다운로드를 위한 메소드입니다.
##### pmFileDel
- 파일 삭제를 위한 메소드입니다.

(중략...)

##### pmGetSubProjectNo
- 하위 프로젝트 번호를 얻기 위한 메소드입니다.
##### getList
- 그리드를 반환하기 위한 메소드입니다.

#### 관련 클래스
- PUInterfacedevManager

#### 클래스 사용 방법
이 클래스는 웹 요청을 처리하고 웹 페이지를 반환하는 컨트롤러입니다. 사용자의 요청에 따라 각 메소드가 실행되며, 결과 데이터를 사용자에게 반환합니다. 스프링 MVC 패턴을 따르는 웹 애플리케이션에서 주로 사용되며, REST API를 제공하여 사용자의 요청을 처리합니다. 각 메소드는 `@RequestMapping` 어노테이션에 정의된 경로로 접근할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bctestdefectmanagementit/PUTestDefectManagementIt.java
### IT 결함 관리 테스트 프로그램

#### 개요
이 프로그램은 IT 시스템에서 발생하는 결함을 테스트하고 관리하는 서비스를 제공한다. 프로그램은 쿼리, 업데이트, 추가, 삭제 작업을 지원한다. 또한, 특정 결함의 상세 정보를 제공하며, 대응 조치의 이력을 추적한다. 엑셀 파일 업로드와 다운로드 기능도 지원하며, 첨부 파일이 있을 경우에는 파일 관리 기능도 지원한다.

#### 메소드
##### pmTestDefectManagementItInq
- 결함 정보 조회를 지원하는 메소드이다.
##### pmTestDefectManagementItAdd
- 새로운 결함 정보를 추가하는 메소드이다.
##### pmTestDefectManagementItUpd
- 기존 결함 정보를 갱신하는 메소드이다.
##### pmTestDefectManagementItGridUpd
- 그리드 형태에서 결함 정보를 갱신하는 메소드이다.
##### pmTestDefectManagementItDel
- 결함 정보를 삭제하는 메소드이다.
##### pmTestTypeSequenceInq
- 테스트 유형 순서를 조회하는 메소드이다.
##### pmTestIdNameListInq
- 테스트 ID 리스트 명을 조회하는 메소드이다.
##### pmDetailCodeSel
- 상세 코드를 선택하는 메소드이다.
##### pmExcelDownloadAll 
- 모든 결함 정보를 엑셀 파일로 다운로드하는 메소드이다.
##### pmTestSequenceInq
- 테스트 시퀀스를 조회하는 메소드이다.
##### pmTestDefectManagementItFileListInq2
- 결함 관리 파일 리스트를 조회하는 메소드이다.
##### pmExcelUpload
- 엑셀 파일을 업로드해 결함 정보를 갱신하는 메소드이다.
##### pmTestDefectManagementItHistory
- 결함 관리 기록을 조회하는 메소드이다.
##### pmImageInq
- 이미지 정보를 조회하는 메소드이다.
##### pmRequirementsScopeHistory
- 요구사항 범위의 연혁을 조회하는 메소드이다.
##### pmTestPlanDefectFileDel
- 결함 파일을 삭제하는 메소드이다.
##### pmImageDelete
- 이미지를 삭제하는 메소드이다.
##### pmDefectStatusLeftChart
- 결함 상태를 나타내는 왼쪽 차트를 생성하는 메소드이다.
##### pmDefectStatusRightChart
- 결함 상태를 나타내는 오른쪽 차트를 생성하는 메소드이다.
##### pmDefectStatusGrid
- 결함 상태 그리드를 생성하는 메소드이다.
##### pmTestExtinctChartGrid
- 테스트 소멸 차트 그리드를 생성하는 메소드이다.

#### 관련 클래스 
- DUTestDefectManagementIt : 테스트 결함 관리 관련 데이터 처리를 담당하는 데이타 유틸리티 클래스
- Logger : 로그 관리를 위한 클래스
- FileResourceManager : 파일 정보 관리를 위한 클래스
- ExcelManager : 엑셀 파일을 다루는 클래스
- ExceptionUtil : 예외 처리를 담당하는 클래스
- BizRuntimeException : 비즈니스 예외 처리를 담당하는 클래스
- IDataSet, IOnlineContext : 처리 결과와 요청 정보를 가지고 있는 인터페이스
- UserInfo : 사용자 정보를 가지고 있는 클래스

#### 클래스 사용 방법
- 각 메소드는 요청정보 DataSet 객체와 Request 정보를 파라미터로 받는다.
- 반환값으로 처리 결과 DataSet 객체를 반환한다. 이 객체에는 메소드 실행 후 결과 및 관련 메시지 정보가 포함되어 있다.
- 예외 발생 시, BizRuntimeException을 통해 처리한다.
- 각 메소드는 주로 du 클래스의 메소드를 호출하여 구현된다. 이때, 처리 결과를 DataSet 객체로 받아 다음 처리 단계로 전달하거나 반환한다.
- 엑셀 관련 기능은 FileResourceManager와 ExcelManager 클래스를 사용한다.
- 각 메소드는 일반적으로 작업 수행 후, "MSGI4008"과 같은 메시지 코드와 함께 성공 메시지를 설정하여 반환한다. 오류 발생 시에는 "MSGE0000"과 같은 메시지 코드와 함께 예외를 던진다.
- 로그 기록은 Logger 클래스를 사용하며, 로그 레벨에 따라 다른 메소드를 사용하여 로그를 기록한다.
- UserInfo 클래스를 통해 사용자 정보를 얻는다. 이 정보는 요청의 context에서 얻는다.
---
## com/skcc/pms/bizcomponent/scope/bctestdefectmanagementit/BCTestDefectManagementItController.java
### 결함 관리 컨트롤러

#### 개요
해당 프로그램은 결함 관리를 위한 여러 기능들을 포함한 컨트롤러입니다.

#### 메소드
##### pmTestDefectManagementItInq
- 결함 관리 데이터 조회 메소드
##### pmTestDefectManagementItAdd
- 결함 관리 데이터를 추가하는 메소드
##### pmTestDefectManagementItUpd
- 결함 관리 데이터를 수정하는 메소드
##### pmTestDefectManagementItGridUpd
- 결함 관리 데이터 그리드를 수정하는 메소드 
##### pmTestDefectManagementItDel
- 결함 관리 데이터를 삭제하는 메소드
##### pmTestTypeSequenceInq
- 테스트유형 시퀀스 조회 메소드
##### pmTestIdNameListInq
- 테스트 ID 목록 조회 메소드
##### pmDetailCodeSel
- 상세 코드 조회 메소드
##### pmExcelDownloadAll
- 모든 데이터를 엑셀로 다운로드하는 메소드 
##### pmTestSequenceInq
- 테스트 시퀀스 조회 메소드
##### pmTestDefectManagementItFileListInq2
- 결함 관리 파일 리스트 조회 메소드
##### pmExcelUpload
- 엑셀 파일 업로드 메소드
##### pmTestDefectManagementItHistory
- 결함 관리 이력 조회 메소드
##### pmRequirementsScopeHistory
- 요구사항 범위 이력 조회 메소드
##### pmTestPlanDefectFileDel
- 테스트 계획 결함 파일 삭제 메소드
##### pmImageInq
- 이미지 조회 메소드
##### pmImageDelete
- 이미지 삭제 메소드
##### pmDefectStatusLeftChart
- 결함 상태(왼쪽) 차트 조회 메소드
##### pmDefectStatusRightChart
- 결함 상태(오른쪽) 차트 조회 메소드
##### pmDefectStatusGrid
- 결함 상태 그리드 조회 메소드
##### pmTestExtinctChartGrid
- 테스트 소멸 차트 그리드 조회 메소드

#### 관련 클래스
- PUTestDefectManagementIt
- IDataSet
- IOnlineContext
- ExcelManager
- DownloadView
- File
- HttpServletResponse

#### 클래스 사용 방법
Controller가 정의된 이 클래스는 결함 관리에 대한 요청을 처리하고, 응답을 반환합니다. 각 메소드는 특정 기능을 수행하며, 적절한 파라미터를 받아서 서비스 클래스의 메소드를 호출하고 결과를 반환합니다.
다양한 기능들 중 필요한 기능의 메소드를 호출하여 사용합니다.

---
## com/skcc/pms/bizcomponent/scope/bctestdefectmanagementit/DUTestDefectManagementIt.java
### 결함관리 전문가 시스템

#### 개요
결함관리 전문가 시스템은 소프트웨어의 버그 및 결함을 관리하는 시스템이다.


#### 메소드
##### dmTestDefectManagementItInq
- 사용자가 입력한 요청 데이터를 바탕으로 결함을 조회한다.
##### dmTestDefectManagementItAdd
- 사용자가 입력한 요청 데이터로 결함을 추가한다.
##### dmTestDefectManagementItUpd
- 사용자가 입력한 요청 데이터로 결함을 업데이트한다.
##### dmTestDefectManagementItDel
- 사용자가 입력한 요청 데이터로 결함을 삭제한다.
##### dmTestIdNameListInq
- 시스템은 사용자가 입력한 요청 데이터로 결함명을 조회한다.
##### dmRequirementsScopeL4Check
- 시스템은 사용자가 입력한 요청 데이터로 요구사항 범위를 확인한다.
##### dmExcelDownloadAll
- 시스템은 사용자가 입력한 요청 데이터로 엑셀 파일을 다운로드한다.
##### dmExcelUpload
- 시스템은 사용자가 업로드한 엑셀 파일을 바탕으로 데이터를 추가하거나 업데이트한다.
##### dmTestTypeSequenceInq
- 시스템은 사용자가 입력한 요청 데이터로 테스트 유형 순서를 조회한다.
##### dmTestDefectManagementItGridUpd
- 사용자가 입력한 요청 데이터로 그리드 형태의 결함 정보를 업데이트한다.
##### dmTestDefectManagementItFileListInq2
- 시스템은 사용자가 입력한 요청 데이터를 바탕으로 결함 파일 목록을 조회한다.

#### 관련 클래스
- DUTestDefectManagementIt

#### 클래스 사용 방법
- 각 메소드는 사용자가 입력한 요청 데이터(IDataSet)와 온라인 컨텍스트(IOnlineContext)를 인자로 받아 시스템에서 필요한 작업을 수행한 후, 처리 결과를 IDataSet 객체 형태로 리턴한다.
- 메소드의 기능에 따라 요청 데이터의 필드와 값이 다르며, 작업 성공 여부는 리턴된 IDataSet의 필드와 값으로 확인할 수 있다.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskdashboard/DUCheckRiskDashBoardMgr.java
### 위험 대시보드 검사 관리

#### 개요
이 프로그램은 HiPMS 범위관리 시스템의 일부로서, 사용자의 요청 정보를 바탕으로 위험 관련 대시보드를 검사하는 기능을 수행합니다. 요청 정보에 따라 코드 조회, 그리드 생성 등 다양한 함수를 제공하며, 기능별로 데이터베이스 조회하여 필요한 정보를 제공합니다.

#### 메소드
##### dmCheckQualityDashBoardMgr
- requestData 요청 정보와 onlineCtx Request 정보를 받아 처리 결과를 DataSet 객체로 반환합니다. crud 값에 따라 코드 조회, 그리드 생성 등의 다양한 작업이 수행됩니다.

##### code_select
- requestData 요청 정보, onlineCtx Request 정보, 그리고 responseData라는 DataSet 객체를 매개변수로 받아 상세 코드 조회를 수행합니다. 단계 코드, 연계 코드 등을 조회하고 이를 반환합니다.

#### 관련 클래스
- DataUnit
- IDataSet
- IOnlineContext
- IRecordSet
- IResultMessage

#### 클래스 사용 방법
사용자는 요청 정보인 requestData(IDataSet 타입)와 onlineCtx(IOnlineContext 타입)를 이 클래스의 메소드에 전달하고, 이에 따라 반환되는 DataSet 객체를 통해 데이터를 얻을 수 있습니다. 요청 정보 내에 'crud' 필드를 통하여 어떤 작업을 수행할지 결정할 수 있으며, 'function' 필드로 코드 조회 또는 화면 내 그리드 데이터 조회 등 각각의 기능을 수행할 수 있습니다. 또한, 그리드 조회 결과로 여러 개의 IRecordSet을 사용할 수 있으며, 이 결과는 어떤 요청인지에 따라 달라집니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckriskdashboard/BCCheckRiskDashBoardMgrController.java
### 위험 대시보드 관리

#### 개요
위험 대시보드를 관리하기 위한 컨트롤러 클래스입니다. 위험 대시보드를 체크하고 대시보드의 품질을 확인하는 기능을 제공합니다.

#### 메소드
##### dmCheckQualityDashBoardMgr
- 요청 된 데이터와 온라인 컨텍스트를 받아 대시보드의 품질을 확인하고 결과를 반환하는 메소드입니다.

#### 관련 클래스
- DUCheckRiskDashBoardMgr: 위험 대시보드 관련 서비스를 제공하는 클래스입니다.

#### 클래스 사용 방법
BCCheckRiskDashBoardMgrController 클래스의 인스턴스 생성 후, dmCheckQualityDashBoardMgr 메소드를 호출하여 대시보드의 품질을 확인할 수 있습니다. 이때, 요청 데이터와 온라인 컨텍스트를 인자로 전달해야 합니다.
---
## com/skcc/pms/bizcomponent/scope/bcrmcompletewb/DURmCompleteWB.java
### 요구사항 범위 관리

#### 개요
이 프로그램은 요구사항의 범위를 관리하기 위해 작성되었습니다.

#### 메소드
##### dmRequirementsScopeListInq
- 요청정보를 파라미터로 받아 해당 요구사항의 범위 목록을 조회합니다.

##### dmRequirementsScopeAdd
- 요구사항 범위를 추가하는 기능을 제공합니다.

##### dmRequirementsScopeUpd
- 요구사항 범위를 수정하는 기능을 제공합니다.

##### dmRequirementsScopeGridUpd
- 요구사항 범위를 일괄 수정하는 기능을 제공합니다.

##### dmRequirementsScopeDel
- 요구사항 범위를 삭제하는 기능을 제공합니다.

#### 관련 클래스
- DataUnit: 데이터 처리를 위한 기본 클래스입니다.

#### 클래스 사용 방법
이 클래스의 메소드를 호출하여 요구사항의 범위를 관리합니다. 각 메소드는 특정 작업(조회, 추가, 수정, 삭제 등)을 수행합니다. Ex) dmRequirementsScopeAdd() 메소드를 호출하여 요구사항 범위를 추가합니다.
---
## com/skcc/pms/bizcomponent/scope/bcrmcompletewb/BCRmCompleteWBController.java
###  요구사항 관리 컨트롤러

#### 개요
스프링 기반의 웹 어플리케이션에서 사용자 요구사항을 관리하는 요구사항 관리 컨트롤러입니다.

#### 메소드
##### pmRmIdListInq
- 사용자 요구사항 ID를 조회하는 메소드

##### pmRequirementsScopeFileDel
- 요구사항 범위 파일을 삭제하는 메소드

##### pmRequirementsScopeDel
- 요구사항 범위를 삭제하는 메소드

##### pmRquirementsScopeReport
- 요구사항 범위 리포트를 생성하는 메소드

##### pmPopupSearchStep
- 팝업 검색 단계를 처리하는 메소드

##### pmRequirementsScopeGridUpd
- 요구사항 범위 그리드를 갱신하는 메소드

##### pmRequirementsScopeUpd
- 요구사항 범위를 갱신하는 메소드

##### pmRequirementsScopeAdd
- 요구사항 범위를 추가하는 메소드

##### pmRequirementsScopeListInq
- 요구사항 범위 리스트를 조회하는 메소드

##### pmExcelDownloadAll
- 모든 요구사항을 엑셀로 다운로드하는 메소드

##### pmRequirementsScopeHistory
- 요구사항 범위 이력을 조회하는 메소드

##### pmRequirementsL4Inq
- Level 4 요구사항을 조회하는 메소드

##### pmDetailCodeUseYn
- 세부 코드 사용 여부를 확인하는 메소드

##### pmReqIdDupCheck
- 요구사항 ID의 중복을 확인하는 메소드

##### pmRequirementsScopeFileListInq
- 요구사항 범위 파일 리스트를 조회하는 메소드

##### pmRequirementsScopeExcelUpload
- 요구사항 범위를 엑셀로 업로드하는 메소드

##### pmRequirementsScopeObjectUseYN
- 요구사항 범위 오브젝트 사용 여부를 확인하는 메소드

##### pmRequirementsScopeExcelDownload
- 요구사항 범위를 엑셀로 다운로드하는 메소드

##### pmRequirementsScopeObjectUseYNSel
- 요구사항 범위 오브젝트 사용 여부를 선택하는 메소드

##### pmTestExecutionBatch
- 테스트 실행 배치를 처리하는 메소드

##### pmGetInfoAboutReqId
- 요구사항 ID에 대한 정보를 얻는 메소드

##### pmPlanProgressRateInq
- 계획 진행률을 조회하는 메소드

#### 관련 클래스
- PURmCompleteWB
- IDataSet
- IOnlineContext
- ExcelManager
- DownloadView

#### 클래스 사용 방법
해당 클래스는 컨트롤러로서 웹 요청을 처리하고, 요구사항과 관련된 서비스를 호출하여 반환값을 반환합니다. 각 메소드는 특정 작업을 수행하며, 대부분의 메소드는 웹 요청의 본문을 IDataSet 객체로 받아들이고, 처리 결과를 IDataSet 객체로 반환합니다. 일부 메소드는 DownloadView 객체를 반환하여 파일 다운로드를 가능하게 합니다. 메소드를 호출하기 위해선 적절한 파라미터를 함께 전달해야 합니다.

---
## com/skcc/pms/bizcomponent/scope/bcrmcompletewb/PURmCompleteWB.java
### 완료작업범위 관리 프로그램

#### 개요
완료작업범위 관리 프로그램은 업무 그룹명이 HiPMS/범위관리로 생성된 프로그램입니다. 프로그램 명세서는 기존에 생성된 소스 코드를 기반으로 작성되어 있습니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요청 정보 DataSet 객체를 input으로 받아 처리한 결과를 Data Set으로 반환하는 메소드입니다.

##### dmRequirementsScopeListInq
- 요청 정보와 기존 정보를 판별하여 처리한 결과를 반환하거나, 예외를 던지는 메소드입니다.

#### 관련 클래스
- PURmCompleteWB
- DURmCompleteWB

#### 클래스 사용 방법
프로그램은 스프링 프레임워크를 기반으로 동작합니다. '@Autowired' 어노테이션을 사용하여 DURmCompleteWB 클래스를 PURmCompleteWB 클래스에 주입하여 사용합니다.

각 메소드는 처리를 위한 요청 정보 DataSet 객체를 인자로 받아 처리 결과 DataSet 객체를 반환하는 형태로 동작합니다.

오류 발생 시, BizRuntimeException을 throw하여 해당 오류를 처리합니다.

기능에 따라 필요한 메소드를 호출하여 사용합니다. 예를 들면, 요구사항 목록 조회를 위해서는 `pmRequirementsScopeListInq` 메소드를 사용하고, 요구사항을 추가할 때는 `pmRequirementsScopeAdd` 메소드를 사용합니다.
---
## com/skcc/pms/bizcomponent/scope/bcproductsdefect/PUProductsDefect.java
### 제품 결함 관리 

#### 개요
이 프로그램은 제품의 결함에 대한 정보를 관리하기 위해 사용되는 시스템입니다. 사용자는 이 프로그램을 통해 제품 결함을 등록, 수정, 조회, 삭제할 수 있습니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 리스트를 조회하는 메소드입니다.
##### pmRequirementsScopeAdd
- 요구사항 범위를 추가하는 메소드입니다.
##### pmRequirementsScopeUpd
- 요구사항 범위를 업데이트하는 메소드입니다.
##### pmRequirementsScopeGridUpd
- 요구사항 범위 그리드를 업데이트하는 메소드입니다.
##### pmRequirementsScopeFileListInq
- 요구사항 범위 파일 리스트를 조회하는 메소드입니다.

#### 관련 클래스
- DUProductsDefect 

#### 클래스 사용 방법
1. 먼저, DUProductsDefect 클래스를 통해 제품 결함 정보를 불러옵니다.
2. 그 후 각각의 메소드를 사용하여 제품 결함 정보를 관리합니다.
3. 예를 들어, pmRequirementsScopeListInq 메소드를 통해 요구사항 범위 리스트를 조회하고, pmRequirementsScopeAdd 메소드를 요구사항 범위를 추가할 수 있습니다.
4. 또한, 파일 관련 조회는 pmRequirementsScopeFileListInq 메소드를 통해 가능합니다.
---
## com/skcc/pms/bizcomponent/scope/bcproductsdefect/DUProductsDefect.java
### 결함 관리 프로그램

#### 개요
결함을 발생 시킬 수 있는 소스 코드를 관리하고, 그에 따른 산출물을 만드는 프로그램입니다.

#### 메소드
##### getFileUploadRootPath()
- 파일 업로드를 위한 루트 경로를 가져옵니다.
##### dmRequirementsScopeListInq(IDataSet requestData, IOnlineContext onlineCtx)
- 요청 정보 데이터셋 객체를 이용해 요청 정보를 조회
##### dmRequirementsScopeAdd(IDataSet requestData, IOnlineContext onlineCtx)
- 요청 정보 데이터셋 객체를 이용해 요청 정보를 추가
##### 관련 클래스
- IDataSet
- AuthUtils
- DateUtils
- IOnlineContext

#### 클래스 사용 방법
1. 클래스를 생성하고 각 메소드를 호출하여 원하는 기능을 수행합니다.
2. 필요한 데이터는 IDataSet 객체를 통해 전달하고, 결과는 동일한 IDataSet 객체를 통해 받습니다.
3. AuthUtils와 DateUtils를 사용하여 데이터 처리를 수행합니다.
4. onlineCtx를 사용하여 요청 정보를 관리합니다.
---
## com/skcc/pms/bizcomponent/scope/bcproductsdefect/BCProductsDefectController.java
### 제품 결함 컨트롤러

#### 개요
제품 결함과 관련된 컨트롤러로 사용자의 요구사항에 따른 제품 결함의 조회, 추가, 삭제, 업데이트 등을 관리하는 클래스입니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항에 따른 제품 결함 목록을 조회하는 메소드
##### pmRequirementsScopeAdd
- 요구사항에 따른 제품 결함을 추가하는 메소드
##### pmRequirementsScopeUpd
- 요구사항에 따른 제품 결함을 업데이트하는 메소드
##### pmRequirementsScopeDel
- 요구사항에 따른 제품 결함을 삭제하는 메소드
##### pmRequirementsScopeGridUpd
- 요구사항에 따른 제품 결함의 목록을 업데이트하는 메소드
##### pmRequirementsScopeFileDel
- 요구사항에 따른 제품 결함을 파일로 삭제하는 메소드
##### pmRquirementsScopeReport, pmExcelDownloadAll, pmRequirementsScopeExcelDownload
- 요구사항에 따른 제품 결함을 리포트 형태로 또는 엑셀 파일로 다운로드하는 메소드들
##### pmPlanProgressRateInq, pmRequirementsScopeHistory, pmDefectStatusGrid
- 프로젝트 진행률 조회, 제품 결함의 이력 조회, 결함 상태를 그리드 형태로 조회하는 메소드들
##### pmDefectStatusRightChart, pmTestExtinctChartGrid
- 제품 결함의 상태를 차트 형태로 보여주는 메소드들
##### pmDetailCodeSel, pmDetailCodeUseYn, pmRequirementsDetailCodeInq, pmTestIdNameListInq
- 세부 코드의 조회 및 사용 여부 확인 메소드들
  
#### 관련 클래스
- PUProductsDefect: 제품 결함과 관련된 메소드를 모아둔 서비스 클래스

#### 클래스 사용 방법
해당 클래스는 Spring Framework의 Controller 클래스이며 사용자 요청에 따른 제품 결함에 대한 관리(조회, 유지 보수 등)를 담당합니다. 각 메소드에 @RequestMapping 어노테이션에 정의된 URL로 요청을 보낼 경우 해당 메소드가 실행되며 제품 결함에 대한 작업을 수행합니다. 해당 메소드는 @RequestBody로 요청 들어온 IDataSet requestData와 IOnlineContext onlineCtx를 파라미터로 받습니다.
---
## com/skcc/pms/bizcomponent/scope/bcdesignretrievehk/BCDesignRetrieveHKController.java
### PM 프로그램 명세서

#### 개요
이 PM 프로그램은 다양한 요구사항 및 설계를 조회, 추가, 수정, 삭제하는 기능을 제공하며, 요구사항 및 설계에 대한 다양한 리포트를 생성하는 데 사용됩니다. 이 프로그램은 주로 프로젝트의 공정도를 관리하고, 요구사항과 설계의 현황을 파악하는 역할을 합니다.

#### 메소드
##### pmDesignRetrieveListInq
- 설계 정보를 조회하는 메소드입니다.
##### pmDesignRetrieveAdd
- 새로운 설계를 추가하는 메소드입니다.
##### pmDesignRetrieveUpd
- 기존 설계를 업데이트하는 메소드입니다.
##### pmDesignRetrieveDel
- 기존 설계를 삭제하는 메소드입니다.
##### pmRequirementsScopeGridUpd
- 요구사항 범위를 업데이트하는 메소드입니다.
##### pmRquirementsScopeReport
- 요구사항 범위에 대한 리포트를 생성하는 메소드입니다.
##### pmPlanProgressRateInq
- 계획 진행률을 조회하는 메소드입니다.
##### pmRequirementsScopeHistory
- 요구사항 범위의 이력을 조회하는 메소드입니다.
##### pmExcelDownloadAll
- 모든 데이터를 엑셀로 다운로드하는 메소드입니다.

#### 관련 클래스
- BCDesignRetrieveHKController
- PUDesignRetrieveHK
- PUITSIssueLinkManager
- DataSet
- IDataSet
- IOnlineContext
- ExcelManager
- DownloadView

#### 클래스 사용 방법
입력 데이터(requestData)와 온라인 컨텍스트(onlineCtx)를 사용하는 각 메소드를 호출하여 원하는 기능을 실행할 수 있습니다. 
예를 들어, 설계 리스트를 조회하려면 pmDesignRetrieveListInq 메소드를 사용하고, 새로운 설계를 추가하려면 pmDesignRetrieveAdd 메소드를 사용하며, 여기에 필요한 데이터는 요청 데이터에 포함되어야 합니다. 모든 메소드는 예외 처리를 하며, 필요한 경우 파일 다운로드 기능을 제공합니다.

---
## com/skcc/pms/bizcomponent/scope/bcdesignretrievehk/DUDesignRetrieveHK.java
### 테스트 관리 시스템

#### 개요
이 프로그램은 테스트 관리 시스템에서 사용되는 다양한 클래스와 메소드를 이용해 조직의 테스트 및 결과 값들에 대한 관리와 조회, 업데이트 등의 작업을 수행합니다.

#### 메소드
##### dmDesignRetrieveListInq
- 요청 정보 데이터셋을 사용하여 테스트 관리 시스템에서 디자인 검색 목록을 조회합니다.
##### dmDesignRetrieveAdd
- 요청 정보 데이터셋을 사용하여 테스트 관리 시스템에 새로운 디자인 정보를 등록합니다.
##### dmDesignRetrieveUpd
- 요청 정보 데이터셋을 사용하여 테스트 관리 시스템에서 디자인 정보를 업데이트합니다.
##### dmRequirementsScopeGridUpd
- 요청 정보 데이터셋을 사용하여 테스트 관리 시스템에서 요구사항의 범위에 대한 정보를 업데이트 합니다.

#### 관련 클래스
- DataUnit: 비즈니스 로직을 수행하는 기본 클래스입니다.
- DUTestManagerforTMS: 테스트 관리 시스템에서 테스트 관련 정보를 관리하는 클래스입니다.

#### 클래스 사용 방법
1. 테스트 관리 시스템에서 필요한 데이터를 요청 정보 데이터셋을 이용하여 조회, 추가 또는 업데이트 합니다.
2. 테스트 관리 시스템의 기능 관련 메소드를 호출하여 원하는 기능을 수행합니다.
3. 테스트 관리 시스템의 정보를 가공하거나 출력하는 등의 기능을 수행합니다.

---
## com/skcc/pms/bizcomponent/scope/bcdesignretrievehk/PUDesignRetrieveHK.java
### "디자인 대조표 관리 시스템"

#### 개요
이 프로그램은 사용자가 등록한 정보를 바탕으로 디자인 대조표를 관리하는 시스템입니다.

#### 메소드
##### pmDesignRetrieveListInq
- 데이터셋 요청 정보를 바탕으로 동일한 이름의 Design List를 조회합니다.
  
##### pmDesignRetrieveAdd
- 입력받은 정보를 바탕으로 디자인 대조표에 새로운 항목을 추가합니다.
  
##### pmDesignRetrieveUpd
- 요청된 데이터를 사용하여 디자인 대조표의 항목을 수정합니다.

##### pmRequirementsScopeGridUpd
- 사용자가 입력한 정보를 바탕으로 대조표 Grid를 업데이트합니다.

##### pmRequirementsScopeFileListInq
- 요청된 정보에 해당하는 파일 목록을 조회합니다.

##### pmDesignRetrieveDel
- 사용자가 선택한 디자인 대조표의 항목을 삭제합니다.

##### pmDesignRetrieveExcelDownload
- 디자인 대조표의 내용을 엑셀로 다운로드합니다.

##### pmDesignRetrieveExcelUpload
- 엑셀 파일의 데이터를 이용해 디자인 대조표를 업데이트합니다.

##### pmProgressRateInq
- 디자인 대조표의 작업 진행 상황을 조회합니다.

##### pmPlanProgressRateInq
- 디자인 대조표의 계획된 작업 진행 상황을 조회합니다.

- ... 등등

#### 관련 클래스
- DUDesignRetrieveHK : 디자인 대조표 데이터를 관리하는데 사용되는 클래스입니다.
- PUITSIssueLinkManager : 이슈 링크를 관리하는데 사용되는 클래스입니다.
- DUAutonumberManager : 자동으로 번호를 관리하는데 사용되는 클래스입니다.

#### 클래스 사용 방법
이 시스템은 여러 메소드를 통해 사전 정의된 기능을 수행합니다. 각 메소드는 요청 정보나 상황에 따라 필요한 기능을 수행하여 시스템의 각종 데이터를 관리하는데 사용됩니다. 예를 들어, `pmDesignRetrieveListInq` 메소드는 사용자가 입력한 정보를 바탕으로 디자인 대조표를 조회하고, `pmDesignRetrieveAdd` 메소드는 사용자가 입력한 정보를 바탕으로 디자인 대조표에 새로운 항목을 추가하는 등의 기능을 할 수 있습니다. 사용자는 필요에 따라 각 메소드를 사용하며, 각 메소드의 동작 방식과 기능은 메소드 내 주석 등을 참고해 사용할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcproceedings/BCProceedingsController.java
### 사업 관리 컨트롤러

#### 개요
사업 관리 컨트롤러는 어떠한 프로젝트의 실행 상황 관리를 주로 담당합니다. 특히, 엑셀 데이터를 업로드, 다운로드, 삭제하며 프로젝트 단계의 리스트를 받아옵니다. 추가로 프로젝트 진행상황의 추가, 수정, 삭제 기능이 있습니다.

#### 메소드
##### pmGetProject
- 프로젝트 정보를 반환합니다.
##### pmExcelUpload
- 엑셀 데이터를 업로드합니다.
##### pmFileDel
- 파일을 삭제합니다.
##### pmExcelDownload
- 엑셀 파일을 다운로드합니다.
##### pmAttchFileListInq
- 첨부된 파일 리스트를 조회합니다.
##### pmFileDownload
- 파일을 다운로드합니다.
##### pmExcelDataAllDownload
- 모든 엑셀 데이터를 다운로드합니다.
##### pmGetLevelList
- 프로젝트 단계의 리스트를 반환합니다.
##### pmProceedingsAdd
- 프로젝트 진행 상황을 추가합니다.
##### pmProceedingsUpd
- 프로젝트 진행 상황을 업데이트합니다.
##### pmProceedingsDel
- 프로젝트 진행 상황을 삭제합니다.
##### pmProceedingsHistory
- 프로젝트 진행 이력을 조회합니다.

#### 관련 클래스
- com.skcc.pms.support.data.IDataSet
- com.skcc.pms.support.data.IOnlineContext

#### 클래스 사용 방법
비즈니스 연산을 위한 메소드들은 주로 @RequestBody 어노테이션을 사용해서 데이터를 수신하고 결과를 반환합니다. 데이터는 IDataSet 타입을 사용하며, 클라이언트와 서버 간의 통신에서 모든 데이터를 담고 있습니다. IOnlineContext는 온라인 트랜잭션 처리에 필요한 정보를 제공합니다.

메소드를 사용할 때는 상황에 맞는 메소드를 선언하고, 호출하는 입장에서 필요한 매개변수를 넘기면 됩니다. 반환값은 IDataSet 타입이며, 이를 통해 원하는 데이터를 얻을 수 있습니다. 

예를 들어, 프로젝트 정보를 얻고 싶다면, pmGetProject를 호출하고, 필요한 매개변수를 넘기면 됩니다. 단, 이 모든 작업은 try-catch 구문 내에서 이루어져야 하며, 예외가 발생할 경우 적절하게 처리해야 합니다.
---
## com/skcc/pms/bizcomponent/scope/bcproceedings/DUProceedings.java
### 범위관리 프로그램

#### 개요
이 프로그램은 다양한 회의 정보를 관리하는데 사용된다. 회의 주제, 대상 부점명, 회의 일자, 회의 장소 등 다양한 회의 정보를 저장하고 조회, 업데이트, 삭제 기능을 제공한다. 또한 엑셀을 이용해 일괄 등록 및 업데이트를 지원하며, 파일 다운로드 및 업로드 기능도 제공한다.

#### 메소드
##### dmGetLevelList
- 요청 정보를 받아 회의 정보를 조회한다.
##### dmProceedingsAdd
- 요청 정보를 받아 새로운 회의 정보를 추가한다.
##### setFileUpload
- 파일 업로드 처리를 담당한다. 
##### dmProceedingsUpd
- 요청 정보를 받아 회의 정보를 수정한다.
##### dmProceedingsDel
- 요청 정보를 받아 회의 정보를 삭제한다.
##### getXmlDocument
- XML 문서 파싱을 담당하는 메소드
##### dmExcelDataAllDownload
- 등록된 모든 회의 정보를 엑셀로 다운로드한다.
##### logMsg
- 로그 메세지를 출력하는 메소드
##### dmFileDownload
- 파일 다운로드 처리를 담당하는 메소드
##### dmExcelDownload 
- 엑셀 다운로드 기능이 구현된 메소드
##### dmExcelUpload
- 엑셀 업로드를 처리하는 메소드
##### dmGetProject
- 파라미터로 받은 요청 정보로 프로젝트를 조회하는 메소드
##### dmAttchFileListInq
- 첨부 파일 목록을 조회하는 메소드
##### dmFileDel
- 첨부된 파일을 삭제하는 기능을 담당하는 메소드
##### dmProceedingsHistory
- 회의 이력을 조회하는 메소드

##### 관련 클래스
- DataSet: 데이터를 저장 및 관리하는 클래스
- IRecordSet: 레코드 셋을 관리하는 클래스
- IOnlineContext: 요청 정보를 관리하는 클래스
- IRecord: 레코드를 관리하는 클래스

#### 클래스 사용 방법
1. dmGetLevelList 메소드를 사용해서 회의 정보를 조회한다.
2. dmProceedingsAdd 메소드를 사용해서 새로운 회의 정보를 등록한다.
3. setFileUpload 메소드를 사용해서 파일을 업로드한다.
4. dmProceedingsUpd 메소드를 사용해서 회의 정보를 수정한다.
5. dmProceedingsDel 메소드를 사용해서 회의 정보를 삭제한다.
6. getXmlDocument 메소드를 사용해서 XML 문서를 파싱한다.
7. dmExcelDataAllDownload 메소드를 사용해서 모든 회의 정보를 엑셀로 다운로드한다.
8. dmFileDownload 메소드를 사용해서 파일을 다운로드한다.
9. dmExcelUpload 메소드를 사용해서 엑셀 파일을 업로드한다.
10. dmGetProject 메소드를 사용해서 프로젝트 정보를 조회한다.
11. dmAttchFileListInq 메소드를 사용해서 첨부 파일 목록을 조회한다.
12. dmFileDel 메소드를 사용해서 첨부된 파일을 삭제한다.
13. dmProceedingsHistory 메소드를 사용해서 회의 이력을 조회한다.

---
## com/skcc/pms/bizcomponent/scope/bcproceedings/PUProceedings.java
### 프로시딩 관리 서비스

#### 개요
이 프로그램은 업무 그룹인 HiPMS의 범위 관리에 사용되는 서비스로 주요 기능으로는 레벨 리스트 가져오기, 프로시딩 추가, 업데이트, 삭제, 엑셀 데이터 전체 다운로드, 파일 다운로드, 엑셀 다운로드, 엑셀 업로드, 프로젝트 가져오기, 첨부파일 리스트 조회, 파일 삭제, 프로시딩 기록을 확인하는 기능이 포함되어 있다.

#### 메소드

##### pmGetLevelList
- 레벨 목록을 가져오는 기능을 수행합니다.

##### pmProceedingsAdd
- 새로운 프로시딩을 추가하는 기능을 수행합니다.

##### pmProceedingsUpd
- 기존의 프로시딩 정보를 업데이트하는 기능을 수행합니다.

##### pmProceedingsDel
- 기존의 프로시딩 정보를 삭제하는 기능을 수행합니다.

##### pmExcelDataAllDownload
- 엑셀 데이터 전체를 다운로드 하는 기능을 수행합니다.

##### pmFileDownload
- 특정 파일을 다운로드 하는 기능을 수행합니다.

##### pmExcelDownload
- 엑셀 파일을 다운로드하는 기능을 수행합니다.

##### pmExcelUpload
- 엑셀 파일을 업로드하는 기능을 수행합니다.

##### pmGetProject
- 프로젝트 정보를 가져오는 기능을 수행합니다.

##### pmAttchFileListInq
- 첨부파일 리스트를 조회하는 기능을 수행합니다.

##### pmFileDel
- 특정 파일을 삭제하는 기능을 수행합니다.

##### pmProceedingsHistory
- 프로시딩 기록을 확인하는 기능을 수행합니다.

##### 관련 클래스
- DUProceedings: 각 메소드에서 이 클래스의 메소드를 호출하여 실제 업무를 수행합니다.
- DataSet, IDataSet: 프로시딩 정보를 저장하고 전달하는 데 사용되는 데이터 구조입니다.
- IOnlineContext: 요청 정보를 전달받는 인터페이스입니다.

#### 클래스 사용 방법
이 클래스는 Spring Framework의 `@Service` 어노테이션으로 정의되어 있어 스프링 컨테이너가 관리하게 됩니다. 따라서 시스템에서는 이 클래스의 객체를 직접 생성하지 않고 스프링 컨테이너로부터 주입받아 사용하게 됩니다. 주요 메소드들은 IDataSet 타입의 데이터와 IOnlineContext를 파라미터로 받고 처리 결과를 IDataSet으로 반환하는 구조입니다.
---
## com/skcc/pms/bizcomponent/scope/bcchangelistmanagement/PUChangeListManagement.java
### 변경리스트 관리

#### 개요
본 프로그램은 변경리스트에 대한 관리를 수행합니다. 변경리스트는 그리드 조회, Excel 다운로드, 삭제 및 구분 코드 선택 등의 관리 기능이 있습니다.

#### 메소드
##### pmChangeListManagementGrid
- 그리드를 통한 변경리스트 관리 기능을 제공합니다. 데이터셋 객체를 사용해 요청 정보를 받아 처리는 결과를 데이터셋 객체로 반환합니다.

##### pmChangeListManagementExcelDownload
- 변동 사항 목록을 엑셀 파일로 다운로드 받을 수 있게 처리합니다. 데이터셋 객체로 요청 정보를 받아 처리 결과를 데이터셋 객체로 반환합니다.

##### pmChangeListManagementDel
- 변동 사항 목록을 삭제하는 기능을 제공합니다. 데이터셋 객체로 요청 정보를 받아 처리 결과를 데이터셋 객체로 반환합니다.

##### pmChangeListManagementGubunCodeSel
- 구분 코드 선택을 위한 변동 목록 관리 기능을 제공합니다. 데이터셋 객체로 요청 정보를 받아 처리 결과를 데이터셋 객체로 반환합니다.

##### 관련 클래스
- DUChangeListManagement: 변경 리스트 관리 데이터 업데이트를 지원하는 클래스입니다. 해당 클래스의 메소드를 사용하여 변경 리스트를 관리합니다.

#### 클래스 사용 방법
본 클래스는 스프링 프레임워크의 @Service 어노테이션이 붙어 있으므로 빈 객체로서 DI(의존성 주입)를 받아 사용할 수 있습니다. 각 메소드는 IDataSet 인터페이스로 요청 정보(requestData)와 온라인 컨텍스트(onlineCtx)를 파라미터로 받아 처리 결과를 IDataSet으로 반환합니다. 이때, 요청 정보는 변경 리스트와 관련된 데이터가 담긴 객체이며, 온라인 컨텍스트는 리퀘스트 정보를 담고 있는 객체입니다. 각 메소드를 호출할 때는 이러한 파라미터를 제공하여야 합니다. 메소드 호출 결과는 IDataSet 인스턴스로 반환됩니다. 이 결과 데이터셋에서는 "rsOut"이라는 이름의 레코드셋을 얻을 수 있습니다. 레코드셋에는 처리 결과 데이터가 담겨져 있습니다. 구체적인 사용 방법은 아래와 같습니다.

```
@Autowired
private PUChangeListManagement puclm;

public void someMethod() {
    IDataSet requestData = ...;  // 요청 데이터 준비
    IOnlineContext onlineCtx = ...;  // 온라인 컨텍스트 준비

    // 그리드 조회 수행
    IDataSet resultData = puclm.pmChangeListManagementGrid(requestData, onlineCtx); 
    IRecordSet resultRecordSet = resultData.getRecordSet("rsOut");  
}
```
위와 같이 사용하면 됩니다. 여기서 IDataSet requestData는 요청 정보를, IOnlineContext onlineCtx는 온라인 컨텍스트 정보를 갖고 있으며 이를 인자로 해당 메소드를 호출한 후, 리턴받은 IDataSet에서 "rsOut"이라는 이름의 레코드셋을 받아 활용하시면 됩니다.

---
## com/skcc/pms/bizcomponent/scope/bcchangelistmanagement/DUChangeListManagement.java
### 변경목록 관리 시스템

#### 개요
해당 프로그램은 객체의 변경목록을 관리합니다. 객체의 변경내역을 조회, 엑셀로 출력, 삭제, 특정 분류 코드 조회 등의 기능이 구현되어 있습니다.

#### 메소드
##### dmChangeListManagementGrid
- 요청정보 데이터셋을 받아 DB에서 조회하여 처리 결과값을 리턴합니다.

##### dmChangeListManagementExcelDownload
- 요청정보 데이터셋을 받아 DB에서 조회하고, 엑셀 파일을 생성하여 다운로드를 처리합니다.

##### dmChangeListManagementDel
- 요청정보 데이터셋을 받아 해당 정보를 DB에서 삭제하는 메소드입니다.

##### dmChangeListManagementGubunCodeSel
- 요청정보 데이터셋을 받아 해당 분류 코드를 DB에서 조회하는 메소드입니다.

#### 관련 클래스
- LoggerFactory 클래스: 로그 생성을 관리합니다.
- DataUnit 클래스: 데이터 연산을 처리합니다.
- DataSet 클래스: 데이터 셋을 관리합니다.
- IOnlineContext 클래스: 온라인 컨텍스트 정보를 관리합니다.
- UserInfo 클래스: 유저 정보를 관리합니다.
- BizRuntimeException 클래스: 비즈니스 로직 예외 처리를 담당합니다.
- ExcelManager 클래스: 엑셀 파일 생성 및 다운로드를 관리합니다.

#### 클래스 사용 방법
해당 클라스 사용시 요청 정보를 IDataSet 형태로 입력하기만 하면 됩니다. 메소드들은 Request 정보와 요청 정보를 입력 받아 각각 그에 맞는 역할을 수행하며, 알맞는 결과 데이터셋을 리턴합니다. 결과적으로 사용자는 요청 정보만 알맞게 세팅하면 간편하게 이용할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcchangelistmanagement/BCChangeListManagementController.java
### 변동 항목 관리 컨트롤러

#### 개요
변동 항목 관리 컨트롤러는 사용자의 요청을 처리하고 변동 항목을 관리하는 기능을 제공합니다. 이 컨트롤러는 PM가 관리하는 변동 항목을 삭제, 조회, 구분 코드 선택, 엑셀 다운로드를 수행합니다.

#### 메소드
##### pmChangeListManagementDel
- 사용자의 요청에 따라 변동 항목을 삭제하는 기능을 제공합니다. 
   
##### pmChangeListManagementGrid
- 사용자의 요청에 따라 변동 항목을 조회하는 기능을 제공합니다.

##### pmChangeListManagementGubunCodeSel
- 사용자의 요청에 따라 구분 코드를 선택하는 기능을 제공합니다.
   
##### pmChangeListManagementExcelDownload
- 사용자의 요청에 따라 변동 리스트를 엑셀로 다운로드 받는 기능을 제공합니다. 
     
##### 관련 클래스
- IDataSet
- IOnlineContext
- DownloadView

#### 클래스 사용 방법
1. 변수 선언: IDataSet, IOnlineContext, DownloadView 등 관련 타입의 변수를 선언합니다.
2. 메소드 호출: 컨트롤러의 메소드를 호출하여 원하는 기능을 사용할 수 있습니다. 이 때, 메소드 호출시 필요한 매개변수를 넘겨주어야 합니다.
3. 결과 처리: 메소드 호출의 결과를 확인하고, 필요한 경우 결과를 처리합니다. 예를 들어, "pmChangeListManagementDel" 메소드 호출 후 삭제가 잘 이루어졌는지 확인할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcrmtracemain/PURmTraceMain.java
### 요구 추적 관리 시스템

#### 개요
이 소프트웨어는 요구 사항을 추적하고 관리하기 위한 것입니다. 각 요구 사항에 대한 상세 정보를 검색, 업데이트, 추가, 삭제하는 기능을 제공하고, 요구 사항들을 엑셀 파일로 다운로드 및 업로드하는 기능도 제공합니다. 또한, 요구 사항에 따른 작업 진행률 콤보(Combo)를 조회하는 기능도 포함하고 있습니다.

#### 메소드
##### pmRmTraceTableInqV2
 - 이 메소드는 요구 사항 정보를 조회하는 데 사용됩니다.

##### pmRmTracePhaseSettingInq
 - 이 메소드는 요구 사항에 관한 설정 부분을 조회하는 데 사용됩니다.

##### pmRmTracePhaseDivInq
 - 이 메소드는 요구 사항의 단계를 조회하는 데 사용됩니다.

##### pmRmTracePhaseDetailInq
 - 이 메소드는 요구 사항의 상세 단계를 조회하는 데 사용됩니다.

##### pmRmTraceReqPreAdd 
 - 이 메소드는 요구 사항을 추가하기 전에 필요한 데이터를 준비하는 데 사용됩니다.

##### pmRmTraceReqPostAdd 
 - 이 메소드는 요구 사항을 추가한 후에 필요한 데이터를 돌려주는 데 사용됩니다.

##### pmRmTraceReqPreDel 
 - 이 메소드는 요구 사항을 삭제하기 전에 필요한 데이터를 준비하는 데 사용됩니다.

##### pmRmTraceReqPostDel 
 - 이 메소드는 요구 사항을 삭제한 후에 필요한 데이터를 돌려주는 데 사용됩니다.

##### pmExcelDownloadAll 
 - 이 메소드는 모든 요구 사항을 엑셀 파일로 다운로드하는 데 사용됩니다.

##### pmExcelUploadTrace
 - 이 메소드는 요구 사항 관련 엑셀 파일을 업로드하는 데 사용됩니다.

#### 관련 클래스
- DURmTraceMain : 요구 추적 정보를 조회하고 업데이트하는 역할을 합니다.

#### 클래스 사용 방법
주로 서비스 레이어에서 이 클래스의 객체를 생성하여 사용합니다.

각 메소드는 요청 정보를 담은 IDataSet 객체와 Request 정보를 담은 IOnlineContext 객체를 파라미터로 전달 받습니다.

요구 사항 정보를 검색하거나 업데이트하는 경우, 요청 정보에 필요한 키와 값들을 IDataSet에 set 해서 파라미터로 넘겨줘야 합니다.

마지막으로 각 메소드는 처리 결과를 포함한 IDataSet 객체를 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bcrmtracemain/DURmTraceMain.java
### 트레이스 메인 관리

#### 개요
해당 클래스는 요구사항의 추적 과정을 관리하고 이를 표현하기 위한 기능을 제공한다.

#### 메소드
##### dmRmTraceTableInqV2
- 요청된 데이터셋 바탕으로 로직을 수행하고 응답 데이터셋을 반환한다.
##### dmRmTraceTableInq
- 요청정보 DataSet 객체에 기반하여 처리 결과 DataSet 객체를 반환한다.
##### dmRmTracePhaseSettingInq
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTracePhaseDivInq
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTracePhaseDetailInq
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTracePopupInq
- 요청정보 DataSet объект로부터 처리 결과 DataSet 객체를 반환한다.
##### dmRmTracePopupColumnInq
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTracePopupComboInq
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTraceReqPreUpt
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTraceReqPostUpt
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTraceReqPreAdd
- 요청정보 DataSet 객체에 기반하여 처리 결과 DataSet 객체를 반환한다.
##### dmRmTraceReqPostAdd
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTraceReqPreDel
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmExcelDownloadAll
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmExcelDownloadTrace
- 요청정보 DataSet 객체에 기반하여 처리 결과 DataSet 객체를 반환한다.
##### dmRmTraceDataImport
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmRmTracePopupProgressRateComboInq
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.
##### dmExcelUploadTrace
- 요청 정보를 기반으로 처리결과 DataSet 객체를 반환한다.

#### 클래스 사용 방법
   클래스의 메소드를 호출하여 요청 정보를 제공하고, 결과 데이터를 받는다. 각 메소드는 특정 요청 정보를 필요로하며, 주어진 정보를 바탕으로 처리 결과를 DataSet 객체로 반환한다.
---
## com/skcc/pms/bizcomponent/scope/bcrmtracemain/BCRmTraceMainController.java
### 트레이스 메인 컨트롤러

#### 개요
사용자의 요청을 받아 처리하고 적절한 서비스를 호출하며, 처리 결과에 따라 뷰를 반환하는 역할을 수행한다.

#### 메소드
##### pmExcelDownloadAll
- 전체 데이터를 엑셀 파일로 다운로드한다.
##### pmRmTracePhaseDetailInq
- 특정 단계의 세부 정보를 조회한다.
##### pmRmTracePhaseDivInq
- 특정 단계의 구분 사항을 조회한다.
##### pmRmTracePhaseSettingInq
- 단계 설정 현황을 조회한다.
##### pmRmTraceTableInqV2
- 테이블 데이터를 조회한다.(버전 2)
##### pmRmTraceTableInq
- 테이블 데이터를 조회한다.
##### pmRmTracePopupInq
- 팝업 정보를 조회한다.
##### pmRmTracePopupColumnInq
- 팝업의 컬럼 정보를 조회한다.
##### pmRmTracePopupComboInq
- 팝업의 콤보박스 항목들을 조회한다.
##### pmRmTraceReqPreUpt
- 요청 전 처리 업데이트를 수행한다.
##### pmRmTracePopupSubComboInq
- 팝업의 하위 콤보박스 항목들을 조회한다.
##### pmRmTraceReqPostUpt
- 요청 후 처리 업데이트를 수행한다.
##### pmRmTraceReqPreAdd
- 요청 전 데이터 추가를 처리한다.
##### pmRmTraceReqPostAdd
- 요청 후 데이터 추가를 처리한다.
##### pmRmTraceReqPreDel
- 요청 전 데이터 삭제를 처리한다.
##### pmExcelDownloadTrace 
- 트레이스 데이터를 엑셀 파일로 다운로드한다.
##### pmRmTraceDataImport 
- 트레이스 데이터를 가져온다.
##### pmExcelUploadTrace
- 엑셀 파일의 데이터를 업로드한다.
##### pmRmTracePopupProgressRateComboInq 
- 진행률 콤보박스의 정보를 조회한다.

#### 관련 클래스
- BCRmTraceMainController
- PURmTraceMain

#### 클래스 사용 방법
이 클래스는 사용자의 요청을 받기 위한 매핑 요청 또는 엔드포인트를 제공한다. 각 메소드는 특정 URL을 매핑하고, 서비스 레이어를 호출하여 요청을 처리한다. 메소드는 작업이 완료되면 뷰를 반환하거나 데이터를 클라이언트에게 제공한다.
---
## com/skcc/pms/bizcomponent/scope/bcrmmanagementverbalagreement/PURmManagementVerbalAgreement.java
### 범위 관리 서비스

#### 개요
이 서비스는 범위 관리를 통한 서비스 약정 관리를 제공합니다. 사용자는 각종요청 정보에 대한 처리 결과를 얻을 수 있습니다.

#### 메소드
##### pmPlanProgressRateInq
- 계획 진행률 조회 메소드
##### pmDetailCodeUseYn
- 상세코드 사용 여부 조회 메소드
##### pmExcelDownloadAll
- 전체 엑셀 다운로드 메소드
##### pmGetInfoAboutReqId
- 요청 ID에 관한 정보 조회 메소드
##### pmTestExecutionBatch
- 테스트 실행 배치 메소드
##### pmRequirementsScopeAdd
- 요구사항 범위 추가 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 목록 조회 메소드
##### pmRquirementsScopeReport
- 요구사항 범위 보고 메소드
##### pmRequirementsScopeDel
- 요구사항 범위 삭제 메소드
##### pmRequirementsScopeUpd
- 요구사항 범위 업데이트 메소드
##### pmRequirementsScopeExcelDownload
- 요구사항 범위 엑셀 다운로드 메소드
##### pmRequirementsScopeExcelUpload
- 요구사항 범위 엑셀 업로드 메소드
##### pmRequirementsScopeFileListInq
- 요구사항 범위 파일 목록 조회 메소드
##### pmRequirementsScopeFileDel
- 요구사항 범위 파일 삭제 메소드
##### pmRequirementsL4Inq
- 요구사항 L4 조회 메소드
##### pmRequirementsScopeHistory
- 요구사항 범위 히스토리 메소드
##### pmRequirementsScopeObjectUseYN
- 요구사항 범위 오브젝트 사용 여부 메소드
##### pmRequirementsScopeObjectUseYNSel
- 요구사항 범위 오브젝트 사용 여부 선택 메소드
##### pmPopupSearchStep
- 팝업 검색 단계 메소드
##### pmReqIdDupCheck
- 요청 ID 중복 검사 메소드
##### pmRmIdListInq
- Rm ID 목록 조회 메소드
##### pmRequirementsGetproject
- 요구사항 Getproject 메소드
##### pmRequirementsGetSubProject
- 요구사항 SubProject 가져오는 메소드
##### pmProjectUserListInq
- 프로젝트 사용자 리스트 조회 메소드
##### pm_req_is_is_yn
- 요구사항 IS YN 메소드

#### 관련 클래스
- DURmManagementVerbalAgreement

#### 클래스 사용 방법
이 클래스를 사용하려면 먼저 클래스 인스턴스를 생성해야 합니다. 그런 다음 생성된 인스턴스를 사용하여 필요에 따라 다양한 메소드를 호출할 수 있습니다. 메서드 호출은 주로 요청에 필요한 데이터와 컨텍스트 정보를 인자로 받고, 처리 결과를 반환하는 형태로 이루어집니다.

---
## com/skcc/pms/bizcomponent/scope/bcrmmanagementverbalagreement/BCRmManagementVerbalAgreementController.java
### 요구사항 관리 컨트롤러

#### 개요
이 프로그램은 요구사항의 관리를 도와주는 컨트롤러입니다. 각 메소드들은 요구사항 리스트 조회, 요구사항 파일 정보 추가/삭제/수정, 요구사항 스코프 변경, 요구사항 기록 확인, 요구사항에 대한 테스트 실행 배치 등의 작업을 수행합니다.

#### 메소드
##### pmRmIdListInq
- 요구사항 관리 번호 리스트를 조회합니다.
##### pmRequirementsScopeFileListInq
- 요구사항 스코프 파일 리스트를 조회합니다.
##### pmRequirementsScopeExcelUpload
- 요구사항 스코프 정보를 엑셀로 업로드합니다.
##### pmRequirementsScopeObjectUseYNSel
- 요구사항 스코프 객체 사용 유무를 선택합니다.
##### pmRequirementsScopeObjectUseYN
- 요구사항 스코프 객체 사용 유무를 설정합니다.

... (이하 생략) ...

##### pm_req_is_is_yn
- IS 요구사항 유무를 설정합니다.

#### 관련 클래스
- PURmManagementVerbalAgreement

#### 클래스 사용 방법
1. 이 클래스를 인스턴스화합니다.
2. 필요한 메소드를 호출하면서 필요한 매개변수를 전달합니다. 매개변수는 IDataSet 과 IOnlineContext 인스턴스여야 합니다.
3. 메소드에서 반환되는 IDataSet 인스턴스를 사용하여 작업을 수행합니다. 

---
## com/skcc/pms/bizcomponent/scope/bcrmmanagementverbalagreement/DURmManagementVerbalAgreement.java
### 한국SK 주문 관리 프로그램

#### 개요
이 프로그램은 SK 주문 관리를 위한 업무야. 이 클래스는 DataUnit를 확장하며, 이 클래스의 목적은 주문 관리 연계 업무와 관련한 데이터를 조작하고, Excel 파일 다운로드, 테스트 실행 배치 등의 기능을 제공한다.

#### 메소드
##### dmPlanProgressRateInq
- 신청 인포메이션 데이터셋 요청 정보와 함께 온라인 컨텍스트를 받아 처리 결과 데이터셋 객체를 반환

##### dmGetInfoAboutReqId
- 신청 인포메이션 데이터셋 요청 정보와 함께 온라인 컨텍스트를 받아 처리 결과 데이터셋 객체를 반환

##### dmExcelDownloadAll
- 신청 인포메이션 데이터셋 요청 정보와 함께 온라인 컨텍스트를 받아 처리 결과 데이터셋 객체를 반환

##### dmRequirementsScopeL4Check
- 신청 인포메이션 데이터셋 요청 정보와 함께 온라인 컨텍스트를 받아 처리 결과 데이터셋 객체를 반환

##### dmRequirementsScopeExcelDownload
- 신청 인포메이션 데이터셋 요청 정보와 함께 온라인 컨텍스트를 받아 처리 결과 데이터셋 객체를 반환

##### dmRequirementsScopeGridUpd
- 신청 인포메이션 데이터셋 요청 정보와 함께 온라인 컨텍스트를 받아 처리 결과 데이터셋 객체를 반환

##### 관련 클래스
- DataUnit
- DataSet
- IOnlineContext
- IDataSet
- ExcelExport
- FileResourceManager
- ZipFile
- ZipParameters
- Zip4jConstants
- LoggerFactory
- IRecordSet
- IRecord
- IRecordHeader
- ResultMessage
- DateUtils

#### 클래스 사용 방법
1. 이 클래스를 사용하려면 먼저 레포지토리 또는 서비스에서 이 클래스를 불러오세요.
2. 메서드 중 필요한 것을 선택하여 필요한 파라미터를 전달하면 됩니다.
3. 이 클래스의 메서드는 주로 데이터를 조회하거나 업데이트하는 데 사용됩니다.
4. 메서드에서 반환하는 IDataSet는 원하는 데이터를 포함하고 있습니다. 이 DataSet을 사용하여 데이터를 다루거나 다른 메서드에 전달할 수 있습니다.
5. 이 클래스의 메서드는 주로 다른 서비스 또는 레포지토리에서 호출되어 사용됩니다.

---
## com/skcc/pms/bizcomponent/scope/bcprogramdevretrievewoori/NTMInfomation.java
### NTM 정보 시스템

#### 개요
이 프로그램은 NTM(네트워크 트래픽 모니터링) 정보를 관리하고 URL을 생성하는 기능을 가진다.

#### 메소드
##### makeUrl
- 해당 메소드는 구성정보를 참고하여 DB와의 연결에 필요한 URL을 생성한다. 
##### setting
- 해당 메소드는 요청된 데이터에 DB 연결 ID를 만들고 URL을 세팅한다. 
##### makeConnectionID
- 이 메소드는 현재 시간을 기반으로 고유한 DB 연결 ID를 생성한다.

##### 관련 클래스
- IDataSet: 데이터 집합 인터페이스로 데이터 핸들링에 사용된다.

#### 클래스 사용 방법
이 클래스는 스프링 빈으로 등록되며, 설정 파일에서 NTM의 접속 정보를 주입받아 사용한다. 'makeUrl' 메소드를 통해 URL을 생성하고, 'setting' 메소드를 통해 IRequestData 필드에 적절한 연결 ID와 URL을 세팅한다. 고유한 연결 ID는 'makeConnectionID' 메소드를 통해 생성된다.
---
## com/skcc/pms/bizcomponent/scope/bcprogramdevretrievewoori/BCProgramDevRetrieveWooriController.java
### 프로그램 관리 시스템

#### 개요
프로그램 관리 시스템은 프로젝트 스코프 및 프로그램 개발 관련 데이터를 다루는 여러 기능들을 제공하는 웹 서비스입니다. 이 장고 안에는 데이터셋 요청에 기반한 수많은 메소드가 포함되어 있으며, 각각 다양한 작업들을 수행합니다.

#### 메소드
##### pmScopeDel
- 프로젝트 스코프를 제거하는 메소드입니다.
##### pmScopeUpd
- 프로젝트 스코프를 업데이트하는 메소드입니다.
##### pmTaskName
- 태스크 이름을 가져오는 메소드입니다.
##### pmScopeAdd
- 프로젝트 스코프를 추가하는 메소드입니다.
##### pmExcelUpload
- 엑셀 파일을 업로드하는 메소드입니다.
##### pmProRate
- 프로젝트 비율 정보를 가져오는 메소드입니다.
...(중략)...
##### pmCheckAsis
- AS IS 체크를 수행하는 메소드입니다.
##### pmGetCase
- 케이스 정보를 얻는 메소드입니다.
##### pmDBlinkupdate
- DB 링크를 업데이트하는 메소드입니다.

#### 관련 클래스
- PUProgramDevRetrieveWoori

#### 클래스 사용 방법
1. 해당 클래스를 @Autowired 어노테이션을 이용해 자동 주입합니다.
2. 각 메소드를 사용 부분에 맞추어 호출합니다.
3. 해당 메소드는 주로 아래와 같이 라우팅 요청 처리에 사용됩니다.
   ```java
   @RequestMapping("pmScopeDel")
   public IDataSet pmScopeDel(@RequestBody IDataSet requestData, IOnlineContext onlineCtx) throws Exception {
       return service.pmScopeDel(requestData, onlineCtx);
   }
   ```
   여기서 @RequestBody는 HTTP 요청 몸체부분을 자바 객체로 변환하는 것을 의미합니다. 따라서 클라이언트에서 전송한 JSON 데이터를 IDataSet 객체로 변환하기 위해 사용됩니다. IOnlineContext는 온라인 트랜잭션을 위한 객체입니다. 메소드는 예외를 던질 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcprogramdevretrievewoori/PUProgramDevRetrieveWoori.java
### 프로그램 조회 및 관리 시스템

#### 개요
Java로 작성된 이 서비스는 PUProgramDevRetrieveWoori 클래스를 통해 범위 관리에 대한 여러 가지 업무를 처리합니다. 프로그램의 추가, 업데이트, 삭제 등 기본적인 CRUD 연산 및 범위 정보 조회, 엑셀 업로드/다운로드, 사용자 정보와 프로젝트 정보 관리 등 다양한 기능을 제공합니다. 

#### 메소드
##### pmScopeListInq
- 범위 목록을 조회하는 메소드
##### pmUserIdCode
- 사용자 ID를 이용하여 데이터를 조회하는 메소드
##### pmProRate
- 진행률을 이용하여 데이터를 조회하는 메소드
##### pmTaskName
- 작업 이름을 조회하는 메소드
##### pmScopeAdd
- 범위를 추가하는 메소드
##### pmScopeUpd
- 범위를 업데이트하는 메소드
##### pmScopeDel
- 범위를 삭제하는 메소드
##### pmScopeGridUpd
- 범위 그리드를 업데이트하는 메소드
##### pmScopeInq
- 상세 범위를 조회하는 메소드
##### pmExcelUpload
- 엑셀 데이터를 업로드하는 메소드
##### pmScopeObjectUseYN
- 객체 사용 여부를 확인하는 메소드

#### 관련 클래스
- DUProgramDevRetrieveWoori
- DataSet
- IOnlineContext
- IRecord
- IRecordSet
- BizRuntimeException
- BaseUtils
- ExceptionUtil

#### 클래스 사용 방법
이 클래스의 메소드는 주로 두 개의 매개변수, 즉 요청 정보를 담은 IDataSet 객체와 요청 컨텍스트 정보를 담은 IOnlineContext 객체를 받아 처리 후, 처리 결과를 담은 IDataSet 객체를 반환합니다. 서비스 로직에 따라 추가적으로 필요한 정보가 있을 경우 해당 메소드 내에서 요청 데이터셋에서 필요한 값을 추출하여 사용합니다. 각 메소드 내에서 발생할 수 있는 예외 상황에 대해서도 처리하고 있으며, 비즈니스 예외가 발생할 경우 BizRuntimeException을 발생시킵니다. 이 클래스는 스프링 서비스 빈으로 등록되어 사용됩니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckcascadingexecution/PUCheckCascadingExecution.java
### 요구사항 범위 체크

#### 개요
주어진 데이터 요청에 따라 다양한 조작을 수행하고 결과를 반환하는 서비스입니다. 주요 기능으로는 리스트 조회, 추가, 수정, 삭제, 파일 리스트 조회 및 삭제, 엑셀 파일 업로드 및 다운로드, 진척률 조회 등이 있습니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 목록을 조회하는 메소드

##### pmRequirementsScopeAdd
- 요구사항 범위 추가하는 메소드

##### pmRequirementsScopeUpd
- 요구사항 범위를 수정하는 메소드

##### pmRequirementsScopeGridUpd
- 그리드 형태의 요구사항 범위를 수정하는 메소드

##### pmRequirementsScopeFileListInq
- 첨부 파일 목록을 조회하는 메소드

##### pmRequirementsScopeFileDel
- 첨부 파일을 삭제하는 메소드

##### pmRequirementsScopeDel
- 요구사항 범위를 삭제하는 메소드

##### pmRequirementsScopeExcelDownload
- 요구사항 범위를 엑셀 파일로 다운로드하는 메소드

##### pmRquirementsScopeReport
- 요구사항 범위에 대한 보고서를 생성하는 메소드

##### pmRequirementsScopeExcelUpload
- 엑셀 파일의 요구사항 범위를 업로드하는 메소드

##### pmProgressRateInq
- 진행률을 조회하는 메소드

##### pmPlanProgressRateInq
- 계획된 진행률을 조회하는 메소드

##### pmExcelDownloadAll
- 모든 데이터를 엑셀 파일로 다운로드하는 메소드

##### pmRequirementsScopeHistory
- 요구사항 범위에 대한 이력을 조회하는 메소드

##### pmRequirementsL4Inq
- L4 요구사항 범위를 조회하는 메소드

##### pmRequirementsScopeObjectUseYN
- 객체 사용 여부를 조회하는 메소드

##### pmRequirementsScopeObjectUseYNSel
- 객체 사용 선택 여부를 조회하는 메소드

##### pmDetailCodeSel
- 상세 코드를 선택하는 메소드

##### pmDetailCodeUseYn
- 상세 코드 사용 여부를 조회하는 메소드

##### pmTestExecutionBatch
- 테스트 실행 배치를 진행하는 메소드

##### pmTestIdNameListInq
- 테스트 ID와 이름 목록을 조회하는 메소드

#### 관련 클래스
- DUCheckCascadingExecution: 각 메소드 실행에 필요한 클래스

#### 클래스 사용 방법
- 조회 메서드(pmRequirementsScopeListInq, pmRequirementsScopeFileListInq 등)은 requestData와 onlineCtx를 인자로 받아 해당하는 정보를 조회한 후 IDataSet 형태로 반환합니다. 
- 추가, 수정, 삭제 메서드(pmRequirementsScopeAdd, pmRequirementsScopeUpd, pmRequirementsScopeDel 등)는 추가적으로 요청정보에서 변경할 데이터를 가져와 해당 작업을 진행하며, 그 결과를 IDataSet 형태로 반환합니다. 
- 파일 관련 메서드(pmRequirementsScopeExcelUpload, pmRequirementsScopeExcelDownload 등)는 업로드 또는 다운로드할 파일에 관한 정보를 요청정보에서 가져와 해당 작업을 진행하고, 그 결과를 IDataSet 형태로 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckcascadingexecution/DUCheckCascadingExecution.java
### '요구사항 범위 관리' 프로그램

#### 개요
이 프로그램은 요구사항 범위를 관리하는데 필요한 기능을 제공합니다. 데이터 단위에서 요청 정보를 받아 데이터베이스에서 처리하고, 그 결과를 다시 데이터 단위로 반환합니다.

#### 메소드
##### dmRequirementsScopeListInq()
- 사용자의 요청 정보를 받아 해당 요구사항의 범위 리스트를 조회하는 메소드입니다.

##### dmRequirementsScopeAdd()
- 사용자의 요청 정보를 받아 요구사항 범위를 추가하는 메소드입니다.

##### dmRequirementsScopeUpd()
- 사용자의 요청 정보를 받아 요구사항 범위를 업데이트하는 메소드입니다.

##### dmRequirementsScopeGridUpd()
- 사용자의 요청 정보를 받아 요구사항 범위 그리드를 업데이트하는 메소드입니다.

##### dmRequirementsScopeDel()
- 사용자의 요청 정보를 받아 요구사항 범위를 삭제하는 메소드입니다.

##### dmRequirementsScopeFileListInq()
- 사용자의 요청 정보를 받아 요구사항 범위 파일 목록을 조회하는 메소드입니다.

##### dmRequirementsScopeFileDel()
- 사용자의 요청 정보를 받아 요구사항 범위 파일을 삭제하는 메소드입니다.

##### dmRequirementsScopeExcelDownload()
- 사용자의 요청 정보를 받아 요구사항 범위를 엑셀 파일로 다운로드 받는 메소드입니다.

##### dmRquirementsScopeReport()
- 사용자의 요청 정보를 받아 요구사항 범위 리포트를 생성하는 메소드입니다.

##### dmRequirementsScopeExcelUpload()
- 사용자의 요청 정보를 받아 요구사항 범위를 엑셀 파일로 업로드하는 메소드입니다.

##### dmProgressRateInq()
- 사용자의 요청 정보를 받아 진행률을 조회하는 메소드입니다.

#### 관련 클래스
- DataSet: 데이터 저장 및 처리를 위한 클래스
- IDataSet: DataSet 인터페이스
- IRecordSet: 레코드 세트 인터페이스
- IRecord: 레코드 인터페이스
- UserInfo: 사용자 정보 클래스
- BizRuntimeException: 비즈니스 예외 처리 클래스
- ExcelManager: 엑셀 관련 처리를 위한 클래스
- FileResourceManager: 파일 리소스 관리를 위한 클래스

#### 클래스 사용 방법
먼저, 요구사항 범위 관리 프로그램 인스턴스를 생성합니다. 생성된 인스턴스에서 원하는 메소드를 호출하고, 요청 정보를 DataSet 형태로 제공합니다. 메소드 실행 결과는 IDataSet 형태로 반환됩니다.
---
## com/skcc/pms/bizcomponent/scope/bccheckcascadingexecution/BCCheckCascadingExecutionController.java
### 요구사항 체크 프로그램 

#### 개요
이 프로그램은 요구사항 관리와 관련된 다양한 기능을 제공하는 웹 기반 서비스입니다. 요구사항의 추가, 업데이트, 삭제, 엑셀 파일 다운로드, 요구사항 이력 조회, 상세 코드 조회 등의 기능을 포함하고 있습니다. 

#### 메소드

##### pmRequirementsScopeListInq 메소드
- 요구사항 목록을 조회하는 메소드
##### pmRequirementsScopeAdd 메소드
- 요구사항을 추가하는 메소드
##### pmRequirementsScopeUpd 메소드
- 요구사항을 업데이트하는 메소드
##### pmRequirementsScopeGridUpd 메소드
- 요구사항 Grid를 업데이트하는 메소드
##### pmRequirementsScopeFileDel 메소드
- 요구사항 파일을 삭제하는 메소드
##### pmRequirementsScopeDel 메소드
- 요구사항을 삭제하는 메소드
##### pmRquirementsScopeReport 메소드
- 요구사항 명세서를 다운로드하는 메소드
##### pmPlanProgressRateInq 메소드
- 계획 진행률을 조회하는 메소드
##### pmRequirementsScopeHistory 메소드
- 요구사항 히스토리를 조회하는 메소드
##### pmExcelDownloadAll 메소드
- 모든 요구사항 데이터를 엑셀 파일로 다운로드하는 메소드
##### pmRequirementsScopeFileListInq 메소드
- 요구사항 파일 목록을 조회하는 메소드
##### pmRequirementsScopeExcelDownload 메소드
- 요구사항 목록을 엑셀 파일로 다운로드하는 메소드
##### pmRequirementsScopeExcelUpload 메소드
- 엑셀 파일을 업로드하여 요구사항을 추가하는 메소드
##### pmDetailCodeSel 메소드
- 상세 코드를 조회하는 메소드
##### pmDetailCodeUseYn 메소드
- 상세 코드의 사용 여부를 조회하는 메소드
##### pmTestIdNameListInq 메소드
- 테스트 ID와 이름을 조회하는 메소드
##### pmTestExecutionBatch 메소드
- 테스트 실행 배치를 실행하는 메소드
##### pmRequirementsL4Inq 메소드
- 요구사항 L4를 조회하는 메소드
##### pmProgressRateInq 메소드
- 진행률을 조회하는 메소드
##### pmRequirementsScopeObjectUseYN 메소드
- 요구사항 요소의 사용 여부를 변경하는 메소드
##### pmRequirementsScopeObjectUseYNSel 메소드
- 요구사항 요소의 사용 여부를 조회하는 메소드

#### 관련 클래스
- 上下文 클래스 : `IOnlineContext`
- 서비스 클래스 : `PUCheckCascadingExecution`
- 데이터 클래스 : `IDataSet`
- 파일 다운로드 클래스 : `DownloadView`
- 엑셀 파일 관리 클래스 : `ExcelManager`

#### 클래스 사용 방법
클래스의 메소드는 주로 요구사항(dataSet)와 상황 정보(onlineCtx)를 인자로 받아 작업을 수행하며, `RequestBody` 어노테이션을 통해 HTTP 요청 본문으로부터 데이터를 바인딩 받습니다. 이 후, 각 메소드는 주어진 요구사항에 따라 서비스를 수행하며 처리 결과를 `IDataSet` 형태로 반환합니다. 파일 다운로드에 필요한 경우 'DownloadView' 형태로 반환됩니다.
---
## com/skcc/pms/bizcomponent/scope/bcrmtracesetting/DURmTraceSettingMgt.java
### 소스 코드 관리

#### 개요
이 코드는 사용자의 요청 정보를 기반으로 미리 정의된 동작을 수행하는 클래스이다. 기능에는 여러 데이터를 저장, 업데이트, 삭제 등이 포함되며 각각의 작업은 요청된 데이터에 따라 실행된다.

#### 메소드
##### getXmlDocument
- xml 문자열을 파싱하여 Document 객체를 반환한다.

##### code_combo_select
- 코드 콤보를 선택할 때 데이터를 가져오는 메소드이다.

##### phase_preview_select
- 단계 미리보기를 선택할 때 데이터를 가져오는 메소드이다.

##### phase_select
- 단계를 선택할 때 데이터를 가져오는 메소드입니다.

##### dmRmTraceSettingMgt
- 사용자의 요청을 기반으로 코드를 저장, 업데이트, 삭제하는 메소드이다.

##### 관련 클래스
- DataUnit : 이 클래스는 데이터 처리를 위한 기본 클래스입니다.

#### 클래스 사용 방법
사용자의 요청정보와 그 요청에 맞는 연산자를 전달하는 것으로 사용할 수 있다. 각 메소드는 특정 연산을 처리하고 결과를 반환한다. 업데이트, 삭제, 저장 등의 연산이 가능하다.
---
## com/skcc/pms/bizcomponent/scope/bcrmtracesetting/PURmTraceSettingMgt.java
### 트레이스 설정 관리

#### 개요
트레이스 설정 관리 관련 기능을 수행하는 서비스 클래스입니다. 특정 요청 정보에 따른 처리 결과를 반환합니다.

#### 메소드
##### pmRmTraceSettingMgt
- 요청 정보 DataSet 객체와 Request 정보를 인자로 받아, 처리 결과를 DataSet 객체로 반환하는 메소드입니다. 이 과정에서 예외가 발생하면 BizRuntimeException을 발생시킵니다.

#### 관련 클래스
- DURmTraceSettingMgt

#### 클래스 사용 방법
이 클래스는 @Service 어노테이션을 통해 스프링에서 관리하는 빈으로 등록되며, Autowired 어노테이션을 통해 DURmTraceSettingMgt 클래를 주입받아 사용합니다. 따라서 이 클래스는 빈의 생명주기에 따라 관리되며, 메소드 pmRmTraceSettingMgt를 호출하여 사용할 수 있습니다.
주의: 이 클래스는 Singleton 객체로 수행됩니다. 여기에 필드를 선언하여 사용하면 동시성 문제를 일으킬 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bcrmtracesetting/BCRmTraceSettingMgtController.java
### 트레이스 설정 관리 프로그램

#### 개요
스코프에서 제공하는 BCRmTraceSetting의 관리 기능에 관련된 컨트롤러 클래스입니다. 스프링 웹 애플리케이션에서 HTTP 요청에 대응되는 메소드를 관리합니다. 요청 경로는 "scope/BCRmTraceSetting"입니다.

#### 메소드
##### pmRmTraceSettingMgt
- 클라이언트로부터 요청 데이터(IDataSet requestData)와 온라인 컨텍스트(IOnlineContext onlineCtx)를 파라미터로 받아 처리합니다. 
- 전달받은 요청 데이터를 이용하여 트레이스 설정을 관리하는 서비스를 호출하고 결과를 반환합니다.

#### 관련 클래스
- PURmTraceSettingMgt
- IDataSet
- IOnlineContext

#### 클래스 사용 방법
1. BCRmTraceSettingMgtController 클래스의 인스턴스를 생성합니다.
2. pmRmTraceSettingMgt 메소드를 호출하면서 클라이언트의 요청 데이터와 온라인 컨텍스트를 파라미터로 전달합니다.
3. pmRmTraceSettingMgt 메소드는 PURmTraceSettingMgt 서비스를 호출하여, 요청 데이터를 기반으로 트레이스 설정을 관리합니다.
4. pmRmTraceSettingMgt 메소드는 처리 결과를 IDataSet 타입으로 반환합니다.
---
## com/skcc/pms/bizcomponent/scope/bccsrdefectmanager/BCCsrDefectManagerController.java
### 결함 관리 시스템

#### 개요
이 프로그램은 결함 관리 시스템을 위한 컨트롤러로, 여러 가지 메서드 등을 통해 다양한 기능을 수행합니다. 이 프로그램은 주로 결함 리스트 조회, 결함 추가, 수정, 삭제 등의 기능을 수행하며, 또한 결함 관련 파일 삭제, 요구 사항 범위, 프로그램 진행률 조회 등의 기능을 수행합니다.

#### 메소드
##### pmCsrDefectListInq
- 서비스 호출을 통해 결함 리스트를 조회하는 메소드입니다.
##### pmCsrDefectAdd
- 서비스 호출을 통해 결함을 추가하는 메소드입니다.
##### pmCsrDefectFileDel
- 서비스 호출을 통해 결함 관련 파일을 제거하는 메소드입니다.
##### pmRequirementsScopeGridUpd
- 서비스 호출을 통해 요구사항 범위 그리드를 업데이트하는 메소드입니다.
##### pmPlanProgressRateInq
- 서비스 호출을 통해 프로젝트의 진행률을 조회하는 메소드입니다.

#### 관련 클래스
- DownloadView : 파일 다운로드에 대한 뷰 클래스
- PUCsrDefectManager : 결함 관리 서비스

#### 클래스 사용 방법
이 클래스는 컨트롤러 클래스로 서비스 호출을 통해 각기 다른 로직의 처리를 수행합니다. 각 메소드는 HTTP 요청을 처리하고 응답을 반환하는 역할을 합니다. 이 클래스는 사용자 요청에 따라 적절한 서비스 메소드를 호출하며, 해당 메소드의 실행 결과를 반환합니다. 각 메소드는 @RequestMapping 어노테이션을 통해 HTTP 요청과 매핑됩니다. 사용자로부터 요청을 받으면 해당 요청에 맞는 메소드를 실행하고, 결과를 반환합니다. 반환된 결과는 사용자에게 HTTP 응답으로 전달됩니다. 이 클래스는 결함 관리 서비스를 호출하는 역할을 수행하며, 하나의 요청 처리를 위해 여러 서비스를 호출할 수 있습니다.
---
## com/skcc/pms/bizcomponent/scope/bccsrdefectmanager/PUCsrDefectManager.java
### 결함 관리 프로그램

#### 개요
결함 관리를 위한 프로그램 입니다. 데이터셋 객체를 이용하여 결함 리스트를 조회하고, 항목을 추가, 수정, 삭제하는 기능을 포함하고 있습니다. 또한 Excel을 이용하여 데이터를 업로드하거나 다운로드하는 기능이 있습니다.

#### 메소드
##### pmCsrDefectListInq
- 결함 목록 조회를 위한 메소드입니다.
##### pmCsrDefectAdd
- 결함을 추가하기 위한 메소드입니다.
##### pmCsrDefectUpd
- 결함 정보를 업데이트하기 위한 메소드입니다.
##### pmCsrDefectDel
- 결함 항목을 삭제하기 위한 메소드입니다.

(다양한 기능을 가진 메소드가 많으므로 간추립니다.)

#### 관련 클래스
- DUCsrDefectManager
- DUAutonumberManager

#### 클래스 사용 방법
1. 필요한 메소드에 requestData와 onlineCtx를 파라미터로 넘겨줍니다.
2. 주요 메소드 내에서 DU 클래스의 메소드가 호출되며, 이 메소드에서 실제 업무 로직이 처리됩니다.
3. 처리 결과값을 responseData에 담아 반환합니다.
4. BizRuntimeException의 경우엔 예외가 발생할 경우 해당 예외를 던져 줍니다.

위와 같은 방식으로 사용할 수 있으며, 각 메소드의 파라미터인 requestData와 onlineCtx는 각각 요청 정보 및 세션 정보를 담고 있습니다. 이를 활용해야 정상적인 프로그램 동작이 가능합니다.
---
## com/skcc/pms/bizcomponent/scope/bctestplanobjectselection/BCTestPlanObjectSelectionController.java
### 테스트 계획 객체 선택 컨트롤러

#### 개요
이 프로그램은 테스트 계획 객체 선택 관련 기능을 제공하는 웹 서비스 컨트롤러입니다. 각 테스트 계획 객체에 대한 조회, 추가, 업데이트, 삭제 등의 CRUD 작업을 수행하며, 테스트 상태, 실행 진행률, 관련 파일들에 대한 함수도 있습니다. 또한 엑셀 파일이나 이와 연관된 다운로드에 사용되는 기능도 제공합니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요구사항 범위 리스트 조회 메소드
##### pmRequirementsScopeAdd
- 요구사항 범위 추가 메소드
##### pmRequirementsScopeUpd
- 요구사항 범위 업데이트 메소드
##### pmRequirementsScopeGridUpd
- 요구사항 범위 그리드 업데이트 메소드
##### pmRequirementsScopeFileDel
- 요구사항 범위 파일 삭제 메소드
##### pmRequirementsScopeDel
- 요구사항 범위 삭제 메소드
##### pmRquirementsScopeReport
- 요구사항 범위 리포트 메소드
##### pmPlanProgressRateInq
- 계획 진행률 조회 메소드
##### pmExcelDownloadAll
- 모든 엑셀 다운로드 메소드
##### 등등

#### 관련 클래스
- PUTestPlanObjectSelection : 이 컨트롤러와 연관된 서비스
- IDataSet : 데이터 처리에 사용되는 인터페이스
- IOnlineContext : 온라인 요청 컨텍스트를 관리하는 클래스
- DownloadView : 파일 다운로드를 제공하는 클래스

#### 클래스 사용 방법
사용자는 요청 본문(RequestBody)에 `IDataSet` 객체를 이용해 데이터를 전달해야 합니다. 또한 모든 메소드는 `IOnlineContext`를 매개변수로 받습니다. 

예를 들어, 요구 사항 범위 리스트를 조회하려면 `pmRequirementsScopeListInq` 메소드를 호출하며, 데이터는 `IDataSet`을 통해 전달합니다.
---
## com/skcc/pms/bizcomponent/scope/bctestplanobjectselection/PUTestPlanObjectSelection.java
### 테스트 계획 객체 선택

#### 개요
테스트 계획 객체 선택 프로그램은 사용자로부터 요청받은 데이터를 이용하여 테스트 계획과 관련된 다양한 작업들을 수행합니다.

#### 메소드
##### pmRequirementsScopeListInq
- 요청받은 데이터를 통해 테스트 계획 범위 목록을 조회하는 메소드입니다.

##### pmRequirementsScopeAdd
- 요청받은 데이터를 통해 테스트 요구사항 범위를 추가하는 메소드입니다.

##### pmRequirementsScopeUpd
- 요청받은 데이터를 통해 테스트 요구사항 범위를 업데이트하는 메소드입니다.

##### pmRequirementsScopeGridUpd
- 요청받은 데이터를 통해 테스트 요구사항 범위 그리드를 업데이트하는 메소드입니다.

#### 관련 클래스
- DUTestPlanObjectSelection: 데이터 업데이트에 관련된 기능을 수행하는 클래스입니다.

#### 클래스 사용 방법
이 클래스는 테스트 계획 객체 선택과 관련된 다양한 메소드들을 포함하고 있습니다. 이들 메소드들은 요청받은 데이터를 통해 테스트 계획과 관련된 다양한 작업(목록 조회, 추가, 수정 등)을 수행합니다. 각 메소드는 요청받은 데이터와 온라인 컨텍스트를 인자로 받아 처리하며, 처리 결과를 반환합니다. 데이터 처리에 관한 로직은 대부분 DUTestPlanObjectSelection 클래스의 메소드를 호출하여 수행합니다.
---
## com/skcc/pms/bizcomponent/scope/bctestsetting/BCTestSettingController.java
### 테스트 설정 컨트롤러

#### 개요
BCTestSettingController는 테스트 설정 관련 처리를 수행하는 컨트롤러입니다. HTTP 요청에 따라 테스트 설정을 관리하는 데 필요한 기능을 제공합니다.

#### 메소드
##### pmTestSetting
- 테스트 설정 정보를 받아 테스트 설정을 수행하는 메소드입니다.

##### pmgetLinkYN
- 테스트 설정 연결 여부를 확인하는 메소드입니다.

##### pmTestSetting_confirm (deprecated)
- 테스트 설정을 확인하는 메소드입니다. pmDelete_confirm 메소드로 변경 예정이므로 현재 사용은 권장하지 않습니다.

#### 관련 클래스
- PUTestSetting
- IDataSet
- IOnlineContext

#### 클래스 사용 방법
@RequestMapping 어노테이션에 지정된 URL로 HTTP 요청을 보내면, BCTestSettingController는 해당 요청을 처리하기 위해 적절한 메소드를 호출합니다. 각 메소드는 요청 데이터(@RequestBody IDataSet)와 컨텍스트 정보(IOnlineContext)를 파라미터로 받아, PUTestSetting 서비스를 이용하여 처리하고 결과를 반환합니다. 
---
