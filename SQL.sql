-- SQL(구조화 질의 언어)
-- MySQL DMBS(RDBMS : 관계형 데이터베이스) -> TABLE(관리)
create database bigdata;
create table student( 
num int not null primary key auto_increment,
name varchar(50),
tel varchar(50),
age int,
email varchar(50) 
);
-- <-- 이렇게해서 하나의 스키마 그걸 CRUD 함
-- 중복이 안되는값 넣기 primary key 기본 키 auto_increment <-- 입력할수록 증가하는 값
-- CRUD 단계 드래그해서 위에 번개모양 눌러서 작동
insert into student(name,tel,age,email)
values('홍길동','010-1111-1111',20,'aaa@naver.com');
-- <-- 정보 넣을것 순서대로 배치

insert into student(name,tel,age,email)
values('주우건','010-6567-7179',28,'wndnrjs27@gmail.com');

-- num가 2인 학생의 나이를 99로 수정하세요?
update student set age=99 where num=2;

update student
set tel='010-1111-1004',email='1004@naver.com'
where num=2;

-- 2번 학생을 삭제하시오.
delete from student 
where num=2;

select * from student;

-- 테이블 삭제 (drop)
drop table student;



