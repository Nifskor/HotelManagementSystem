### Swing 기반 JAVA 호텔 정보관리 시스템 (가상) Hotel Management System 설계 프로젝트. 
>동의대학교 S/W 공학과 이종민  교수님이 진행하는 객체지향 프로그래밍 2 강의에서 수행하는 호텔 정보관리 시스템 프로젝트입니다. 
>> 프로그램 프로세스 흐름도
<img src="https://user-images.githubusercontent.com/92977647/143884670-6cba730c-125c-4f75-8496-e05ebedf6ba8.png" width="1100" height="700"/>

### 개발현황 
>1. 수행 기간 : 2021 / 10 / 01 ~ 2021 / 12 / 01
>2. 설계 및 GUI 구현 기간 : 2021 / 11 / 01 ~ 2021 / 11 / 16
>2. 실구현 기간 : 2021 / 11 / 19 ~ 2021 / 11 / 29
>3. 기능구현완료 : 11 월 29일 
>4. 소프트웨어 안정성 : 현재 알려진버그가 존재함 
>5. 기능요구사항 : 테스팅완료 11.29 (97% 구현완료 평가)

### 개발팀원 

>1. Nifskor
>2. hj592
>3. sseong-min
>4. KingMugyeong

### 초기 계정 및 실행방법 

> 1. 다운받은후 ossystem클래스를 실행하여 실행한다.
> 2. 초기 직원 계정은 staff , staff 이며 관리자는 : admin ,admin 이다 
> 3. 실행에 필요한 DB 파일은 Windows (C://DB) 위치 이며 , MAC OS X 경우 (/Applications/DB) 파일을 위치하면 된다.

### 현재 알려진 버그 
>1. 아이디 생성까지 문제가없지만 (staff) / 아이디생성후 -> 다시 (직원) 아이디 비밀번호 변경후 새로생성시 널문자 오류로 인한 오류 발생 
>2. 체크인할때 검색하는 기능이 잘안되는부분 (위에꺼는 잘표시가 되지만 아래부분 데이터가 간혈적으로 잘표시되지 않는 문제발생)
>3. 관리자메뉴 호실변경시 간혈적으로 제대로 업데이트가 되지않는 상황이 발생
