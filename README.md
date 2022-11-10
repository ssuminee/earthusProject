# 🏢 PROJECT - EarthUs

***
# Contents <br>
1. [개요](#star-개요)  
2. [팀 소개 및 주요 기능](#star-팀-소개-및-주요-기능)
3. [구현 기능](#star-구현-기능)
    - 사용자
        - [메인페이지](#pushpin-메인페이지)
        - [마이페이지](#pushpin-마이페이지)
        - [회원 관리](#pushpin-회원-관리)
        - [로그인/로그아웃](#pushpin-로그인로그아웃)
        - [공지사항/FAQ 조회](#pushpin-공지사항faq-조회)
        - [Q&A 작성/조회/수정/삭제](#pushpin-q&a-작성조회수정삭제)
        - [상품 검색](#pushpin-상품-검색)
     - 관리자
        - [회원 조회/삭제/복구](#pushpin-회원-조회삭제복구)
        - [공지사항/FAQ 작성/조회/수정/삭제](#pushpin-공지사항/faq-작성조회수정삭제)
        - [Q&A 조회/수정/답변/삭제](#pushpin-q&a-조회수정답변삭제)
   
3. [Document](#star-document)

***
 
# :star: 개요
- 프로젝트명 : EarthUs <br>

- 보고서 : [EarthUs_지구지켜조_최종보고서.pdf](https://github.com/wwndbs/earthusProject/files/9958924/EarthUs_._.pdf) <br>

- 기획 의도  <br>
  - 제로웨이스트 인식 개선 및 커뮤니티 활성화 <br>
  - 불필요한 쓰레기를 줄여야 한다는 소비자의 인식 반영 <br>
  - 일상생활의 제품을 플라스틱이 적은 제품으로 변화시켜 지속가능한 일상 만들기<br>

- 개발 환경 <br><br>
![image](https://user-images.githubusercontent.com/102542087/200749423-28855af5-d7a8-4f40-896a-53495af3a05b.png) <br>

***

# :star: 팀 소개 및 주요 기능
![image](https://user-images.githubusercontent.com/102542087/200527700-ed0c0090-681c-4f7c-a6c3-a6d59ca55050.png) <br>
![image](https://user-images.githubusercontent.com/102542087/200527720-4736ddc7-9dca-42aa-9a20-36fbac66afd0.png) <br>


***
# :star: 구현 기능

## :pushpin: 메인페이지
![메인페이지](https://user-images.githubusercontent.com/102542087/200755802-6e427657-7363-46e5-8a19-95d738cfd781.gif) <br>

# :sparkles: 사용자

## :pushpin: 마이페이지
![마이 페이지](https://user-images.githubusercontent.com/102542087/200756402-2cea8740-9fd3-4cc2-a583-e0c45370f347.gif) <br>
    
    
## :pushpin: 회원 관리
![회원 관리](https://user-images.githubusercontent.com/102542087/200756303-0e0a3db7-d0af-4095-88c7-1640f11e7025.gif) <br>
- 구현 기능 설명
    - 회원 가입(중복/유효성 검사 체크)(kakao map API)
    - 회원 정보 수정 (비밀번호 일치 여부를 판단해 수정 가능)
    - 회원 탈퇴 (비밀번호 일치 여부 판단)

    
## :pushpin: 로그인/로그아웃
![로그인](https://user-images.githubusercontent.com/102542087/200803191-8229167f-6586-43de-bdb1-eb2d0cdb838d.gif) <br>
- 구현 기능 설명
    - 아이디 찾기
    - 비밀번호 찾기(이메일 인증)
    - 비밀번호 재설정
    - 로그인/로그아웃
 
 
## 💻 회원 MVC 코드 페이지 이동
- [Model](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/member/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/member)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/member/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/member-mapper.xml)


## :pushpin: 공지사항/FAQ 조회
![공지사항](https://user-images.githubusercontent.com/102542087/200804000-0941a55b-d688-4dc2-b88f-50a7415df96f.gif) <br>
- 구현 기능 설명
    - 공지사항/FAQ 카테고리별 조회 가능
 
 ## 💻 공지사항 MVC 코드 페이지 이동
- [Model](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/notice/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/cs/notice)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/notice/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/customerService-mapper.xml)

## 💻 FAQ MVC 코드 페이지 이동
- [Model](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/faq/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/cs/faq)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/faq/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/customerService-mapper.xml)


## :pushpin: Q&A 작성/조회/수정/삭제
![q a2](https://user-images.githubusercontent.com/102542087/200824614-d73bdc5b-19d5-4307-8783-fe32948e1562.gif) <br>
- 구현 기능 설명
    - Q&A 목록 조회
    - Q&A 작성(비밀글로 작성 가능/첨부파일 첨부 가능)
    - Q&A 수정/삭제
    - 페이징 처리
 
 ## 💻 Q&A MVC 코드 페이지 이동
- [Model](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/qna/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/cs/qna)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/qna/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/customerService-mapper.xml)


## :pushpin: 상품 검색
![상품 검색 (1)](https://user-images.githubusercontent.com/102542087/200816498-d8c0557a-e7ec-4b07-89d1-18c5a89c4190.gif) <br>
- 구현 기능 설명
    - 메인 화면에서 상품 검색
    - 카테고리별 상품 검색 가능
    
# :sparkles: 관리자

## :pushpin: 회원 조회/삭제/복구
![관리자회원](https://user-images.githubusercontent.com/102542087/201005209-f6639187-85cc-41a3-be6e-ab7d3cd9bc7e.gif) <br>
- 구현 기능 설명
    - 전체 회원 목록 조회/검색 (아이디/이름을 키워드로 검색)
    - 회원 선택/개별 삭제/복구
  
    
## :pushpin: 공지사항/FAQ 작성/조회/수정/삭제
![관리자공지](https://user-images.githubusercontent.com/102542087/201007350-51874ead-f9ee-45c5-bf4a-e862275fda7f.gif) <br>
- 구현 기능 설명
    - 게시글 작성/조회/수정/삭제

## :pushpin: Q&A 조회/수정/답변/삭제
![관리자Q](https://user-images.githubusercontent.com/102542087/201009429-556799c2-3a57-4cfc-8c4b-1aaa4389bff8.gif) <br>
- 구현 기능 설명
    - 게시글 조회/삭제
    - 게시글 답변/수정
    
</details>


***
# :star: Document

## 개발 일정 <br><br>
![image](https://user-images.githubusercontent.com/102542087/200530788-b46d72d2-6087-4a4b-9ae0-072c39e37976.png) <br>


## 유스케이스 <br><br>
![image](https://user-images.githubusercontent.com/102542087/200530772-6fa313c5-b984-4742-908b-a37f38385969.png) <br>
![image](https://user-images.githubusercontent.com/102542087/200530760-4f4a7a1b-6a5d-43ad-8c02-a6925e0ddc1f.png) <br>

## DB 설계 <br><br>
![image](https://user-images.githubusercontent.com/102542087/200531201-326c352b-d58b-4e4a-bacd-6475ef61a45e.png) <br>

 
