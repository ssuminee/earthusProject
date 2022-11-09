# 🏢 PROJECT - EarthUs

***
# Contents <br>
1. [개요](#star-개요)  
2. [팀 소개 및 주요 기능](#star-팀-소개-및-주요-기능)
3. [구현 기능](#star-구현-기능)
    - 사용자
        - [메인페이지](#pushpin-메인페이지)
        - [회원 관리](#pushpin-회원-관리)
        - [로그인/로그아웃](#pushpin-로그인로그아웃)
        - [공지사항/FAQ 조회](#pushpin-공지사항faq-조회)
        - [Q&A 조회/작성/수정/삭제](#pushpin-Q&A-조회작성수정삭제)
        - [상품 검색](#pushpin-상품-검색)
     - 관리자
        - [회원 정보 조회/수정/삭제](#pushpin-회원-정보-조회수정삭제)
        - [공지사항/FAQ 조회/작성/삭제](#pushpin-)
        - [Q&A 조회/답변/삭제](#pushpin-)
   
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
![image]() <br>

***

# :star: 팀 소개 및 주요 기능
![image](https://user-images.githubusercontent.com/102542087/200527700-ed0c0090-681c-4f7c-a6c3-a6d59ca55050.png) <br>
![image](https://user-images.githubusercontent.com/102542087/200527720-4736ddc7-9dca-42aa-9a20-36fbac66afd0.png) <br>


***
# :star: 구현 기능

## :pushpin: 메인페이지
![메인페이지](https://user-images.githubusercontent.com/103404357/194943634-4debdc7d-e155-4e81-b354-7260ff92791c.gif) <br>

# :sparkles: 사용자
    
    
## 💻 회원 MVC 코드 페이지 이동
- [Model}(https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/member/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/member)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/member/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/member-mapper.xml)

## :pushpin: 회원 관리
![내 캘린더](https://user-images.githubusercontent.com/102542087/200232434-8ac60f9b-99da-4649-95a8-f1906fdb7bab.gif) <br>
- 구현 기능 설명
    - 회원 가입(중복/유효성 검사 체크)(kakao map API)
    - 회원 정보 수정
    - 회원 탈퇴
    
## :pushpin: 로그인/로그아웃
![관심 캘린더](https://user-images.githubusercontent.com/102542087/200235646-0c9afd69-535d-42ab-8c44-0aa5fdb44b3e.gif) <br>
- 구현 기능 설명
    - 


## 💻 공지사항 MVC 코드 페이지 이동
- [Model}(https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/notice/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/cs/notice)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/notice/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/customerService-mapper.xml)

## 💻 FAQ MVC 코드 페이지 이동
- [Model}(https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/faq/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/cs/faq)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/faq/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/customerService-mapper.xml)

### 📌 공지사항/FAQ 조회
![일정 등록](https://user-images.githubusercontent.com/102542087/200237226-0bdced4e-96c8-4127-8553-a0e4e2f59dec.gif) <br>
- 구현 기능 설명
    - 

## 💻 Q&A MVC 코드 페이지 이동
- [Model}(https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/qna/model)
- [View](https://github.com/ssuminee/earthusProject/tree/main/src/main/webapp/views/cs/qna)
- [Controller](https://github.com/ssuminee/earthusProject/tree/main/src/main/java/com/us/cs/qna/controller)
- [Mapper](https://github.com/ssuminee/earthusProject/blob/main/src/main/java/db/sql/customerService-mapper.xml)

### 📌 Q&A 조회/작성/수정/삭제
![일정 조회](https://user-images.githubusercontent.com/102542087/200239833-501e89fb-2228-489f-a9b6-fbde9f6018d6.gif) <br>
- 구현 기능 설명
    - 

### 📌 상품 검색
![홍보물 목록](https://user-images.githubusercontent.com/102542087/200492941-a2013d15-586d-45c7-a663-35284b0b2b01.gif) <br>
- 구현 기능 설명
    - 메인 화면에서 상품 검색
    - 카테고리별 
    
# :sparkles: 관리자

### 📌 회원 정보 조회/수정/삭제
![홍보물 게시글](https://user-images.githubusercontent.com/102542087/200494766-f2f44c6e-9de3-404d-909a-209f0eef10d9.gif) <br>
- 구현 기능 설명
    - 
    
### 📌 공지사항/FAQ 조회/작성/삭제
![상담 일정](https://user-images.githubusercontent.com/102542087/200501454-b55ad877-9b66-4c67-bad3-5a4c5d106981.gif) <br>
- 구현 기능 설명
    - 

### 📌 Q&A 조회/답변/삭제
![상담 내역](https://user-images.githubusercontent.com/102542087/200502986-755906a4-2bf7-44d3-bfd1-fdbe0acf0845.gif) <br>
- 구현 기능 설명
    - 
    
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

 
