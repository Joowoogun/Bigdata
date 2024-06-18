/************************** 만약 테이블이 있을 경우 삭제 *****************************/ 

DROP TABLE 직원연락처;
DROP TABLE 직원주소;
DROP TABLE 직원;
DROP TABLE 부서;


/*************************** 테이블 생성 *********************************/ 

--   컬럼 : 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID(FK)
CREATE TABLE 직원 ( 
    직원ID  VARCHAR(10) , 
    패스워드 VARCHAR(20) NOT NULL , 
    이름    VARCHAR(30) , 
    성별    CHAR(3)      , 
    나이    INT(3)    , 
    입사일시 DATE         , 
    주민등록번호 VARCHAR(15) NOT NULL ,
    연봉    INT , 
    부서ID  VARCHAR(5) 
);

--   컬럼 : 직원ID , 구분코드 , 연락처 
CREATE TABLE 직원연락처 ( 
    직원ID  VARCHAR(10) , 
    구분코드 VARCHAR(10) , 
    연락처 VARCHAR(15)  NOT NULL 
) ; 

--   컬럼 : 직원ID , 구분코드 , 주소 
CREATE TABLE 직원주소 ( 
    직원ID  VARCHAR(10) , 
    구분코드 VARCHAR(10) , 
    주소 VARCHAR(100)  NOT NULL 
) ; 

--  컬럼 : 부서ID , 부서명
CREATE TABLE 부서 ( 
    부서ID VARCHAR(5) NOT NULL , 
    부서명 VARCHAR(50) NOT NULL , 
    근무지 VARCHAR(100) NOT NULL 
);

/*************************** 테이블 생성 종료*********************************/ 

/****************** 제약 조건 (PRIMARY KEY , 식별자 설정하기) *****************/ 

ALTER TABLE 직원 ADD CONSTRAINT PK_직원 
PRIMARY KEY(직원ID) ; 

ALTER TABLE 직원연락처 ADD CONSTRAINT PK_직원연락처 
PRIMARY KEY(직원ID , 구분코드) ; 

ALTER TABLE 직원주소 ADD CONSTRAINT PK_직원주소 
PRIMARY KEY(직원ID, 구분코드) ; 

ALTER TABLE 부서 ADD CONSTRAINT PK_부서 
PRIMARY KEY(부서ID) ; 

 

/****************** 제약 조건 설정 완료 (PRIMARY KEY , 식별자 설정하기) *****************/ 



/******************** 제약 조건 (FOREIGN KEY , 외래키 설정하기) *********************/ 

ALTER TABLE 직원연락처 ADD CONSTRAINT FK_직원연락처_REF_직원 
FOREIGN KEY (직원ID) REFERENCES 직원(직원ID) ; 

ALTER TABLE 직원주소 ADD CONSTRAINT FK_직원주소_REF_직원 
FOREIGN KEY (직원ID) REFERENCES 직원(직원ID) ; 
 
ALTER TABLE 직원 ADD CONSTRAINT FK_직원_REF_부서 
FOREIGN KEY (부서ID) REFERENCES 부서(부서ID) ; 

/******************** 제약 조건 설정 완료 (FOREIGN KEY , 외래키 설정하기) *********************/ 



/******************* 제약 조건 (CHECK 설정하기) *********************/ 
ALTER TABLE 직원 ADD CONSTRAINT 직원_CHECK_성별 CHECK ( 성별 IN ( '남' , '여') );
/*************** 제약 조건 설정 완료 (CHECK 설정하기)****************/





/************************** 데이터 등록하기 **********************************/ 

INSERT INTO 부서 ( 부서ID , 부서명 , 근무지 ) VALUES ( 'D001' , '인사부' ,    '서울'); 
INSERT INTO 부서 ( 부서ID , 부서명 , 근무지 ) VALUES ( 'D002' , '급여부' ,    '서울'); 
INSERT INTO 부서 ( 부서ID , 부서명 , 근무지 ) VALUES ( 'D003' , '전략기획부' , '경기'); 
INSERT INTO 부서 ( 부서ID , 부서명 , 근무지 ) VALUES ( 'D004' , 'SI사업부' ,  '경기'); 
INSERT INTO 부서 ( 부서ID , 부서명 , 근무지) VALUES ( 'D005' , '사업부' , '제주');  
INSERT INTO 부서 ( 부서ID , 부서명 , 근무지) VALUES ( 'D006' , '인프라서비스부' , '서울'); 

COMMIT; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0001' , 12345 , '김철수' , '남' , 25 , DATE '2022-12-06' , '991212-1566123' , 2800 , 'D001' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0002' , 'hello123!' , '강홍수' , '남' , 28 , DATE '2022-06-22' , '950223-1562867' , 3000 , 'D002' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0003' , 'nono132' , '이현정' , '여' , null , DATE '2021-08-29' , '000112-4566123' , 2600 , 'D003' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0004' , '123123!!' , '김선미' , '여' , null , DATE '2018-11-30' , '930722-2766443' , 4500 , 'D004' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 ) 
VALUES ( 'A0005' , 'test123' , '문현철' , '남' , 34 , NULL , '891231-1786155' , 5000 )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0006' , '774433' , '송대주' , '남' , 44 , DATE '2018-03-01' , '790903-1566127' , 7500 , 'D001' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0007' , 'pwd123' , '메이슨' , '남' , 40 , DATE '2016-10-22' , '830629-1676551' , 6200 , 'D002' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0008' , 'anjffhgkwl123' , '송진아' , '여' , 47 , DATE '2018-01-06', '761212-2508143' , 7500 , 'D003' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0009' , 'test123' , '이서연' , '여' , 50 , DATE '2012-02-26' , '730317-259616' , 9000 , 'D004' )  ; 

INSERT INTO 직원 ( 직원ID , 패스워드 , 이름 , 성별 , 나이 , 입사일시 , 주민등록번호 , 연봉 , 부서ID ) 
VALUES ( 'A0010' , 'coffeegood!' , '김홍민' , '남' , 52 , DATE '2013-08-17' , '710513-1572876' , 9300 , 'D005' )  ; 

COMMIT; 

    
--    5명은 휴대폰 ,집전화 모두 존재 
--    3명은 휴대폰만 존재 
--    2명은 휴대폰 입력을 안했음 

INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0001' , '집전화' , '062-123-1234' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0001' , '휴대폰' , '010-1231-1234' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0002' , '집전화' , '062-254-6342' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0002' , '휴대폰' , '010-2544-6342' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0003' , '집전화' , '062-776-5231' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0003' , '휴대폰' , '010-7766-5231' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0004' , '집전화' , '062-443-5522' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0004' , '휴대폰' , '010-4433-5522' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0005' , '집전화' , '062-998-7273' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0005' , '휴대폰' , '010-9988-7273' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0006' , '휴대폰' , '010-8373-5511' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0007' , '휴대폰' , '010-2323-1133' );
INSERT INTO 직원연락처 (직원ID , 구분코드 , 연락처 ) VALUES ( 'A0008' , '휴대폰' , '010-8877-0087' );

COMMIT; 



--    5명 집주소 입력  
INSERT INTO 직원주소 ( 직원ID , 구분코드 , 주소 ) VALUES ( 'A0006' , '집' , '동구 충장로 예술로 12'); 
INSERT INTO 직원주소 ( 직원ID , 구분코드 , 주소 ) VALUES ( 'A0007' , '집' , '서울 중구 423'); 
INSERT INTO 직원주소 ( 직원ID , 구분코드 , 주소 ) VALUES ( 'A0008' , '집' , '서울 관악구 청룡로 66'); 
INSERT INTO 직원주소 ( 직원ID , 구분코드 , 주소 ) VALUES ( 'A0009' , '집' , '남구 송원로 812'); 
INSERT INTO 직원주소 ( 직원ID , 구분코드 , 주소 ) VALUES ( 'A0010' , '집' , '동구 백서로 53'); 


COMMIT; 


SELECT *
FROM 직원;


DROP TABLE 수강생정보; 
DROP TABLE 성적표; 

CREATE TABLE 수강생정보(
학생ID VARCHAR(9) PRIMARY KEY , 
학생이름 VARCHAR(50) NOT NULL , 
소속반 VARCHAR(5) 
); 

CREATE TABLE 성적표 ( 
    학생ID VARCHAR(9) , 
    과목   VARCHAR(30) , 
    성적   numeric  , 
    CONSTRAINT PK_성적표 PRIMARY KEY(학생ID , 과목) , 
    CONSTRAINT FK_성적표_REF_수강생 FOREIGN KEY(학생ID) REFERENCES 수강생정보(학생ID) 
)  ; 

INSERT INTO 수강생정보 VALUES ('S0001' , '김현철' , 'A') ; 
INSERT INTO 수강생정보 VALUES ('S0002' , '문현중' , 'A') ; 
INSERT INTO 수강생정보 VALUES ('S0003' , '강문치' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('S0004' , '박나선' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('S0005' , '신태강' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('S0006' , '물고기' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('S0007' , '자라니' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('S0008' , '공팔두' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('S0009' , '최팔현' , 'C') ; 

INSERT INTO 성적표 VALUES('S0001'  ,'국어' , 90); 
INSERT INTO 성적표 VALUES('S0001'  ,'수학' , 85); 
INSERT INTO 성적표 VALUES('S0001'  ,'영어' , 100); 
INSERT INTO 성적표 VALUES('S0002'  ,'국어' , 100); 
INSERT INTO 성적표 VALUES('S0002'  ,'수학' , 100); 
INSERT INTO 성적표 VALUES('S0002'  ,'영어' , 20); 
INSERT INTO 성적표 VALUES('S0003'  ,'국어' , 100); 
INSERT INTO 성적표 VALUES('S0003'  ,'수학' , 100); 
INSERT INTO 성적표 VALUES('S0003'  ,'영어' , 20); 
INSERT INTO 성적표 VALUES('S0004'  ,'국어' , 85); 
INSERT INTO 성적표 VALUES('S0004'  ,'수학' , 40); 
INSERT INTO 성적표 VALUES('S0004'  ,'영어' , 60); 
INSERT INTO 성적표 VALUES('S0005'  ,'국어' , 100); 
INSERT INTO 성적표 VALUES('S0005'  ,'수학' , 100); 
INSERT INTO 성적표 VALUES('S0005'  ,'영어' , 100); 
INSERT INTO 성적표 VALUES ( 'S0006' , '국어' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'S0006' , '수학' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'S0006' , '영어' , NULL ) ; 

COMMIT; 








