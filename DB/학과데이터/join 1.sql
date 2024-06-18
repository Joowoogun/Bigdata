-- SQL : 학생의 학과 정보를 출력하세요. (학생이름, 학과명)

-- 학생이름 , 학과명
select student_name, department_name 
-- 스튜던트에 학과를 조인
from student s
inner join department d
-- 공통된 PK 학과코드에서
on s.department_code = d.department_code;

select s.student.name, d.department_name
from student s, department d
where s.department_code = d.department_code;

select * from student;

-- 학과별 학생수를 구하여 출력하시오(학과명, 학생수), 학생수가 2명이상인 학과를 출력하시오.
select d.department_name, count(*) as cnt
from department d
inner join student s
on s.department_code = d.department_code
group by d.department_name
having cnt>=2;

select * from department;

-- SQL. 국어 국문과에 다니는 학생을 출력하세요.(학과명 학생이름)
 select department_name, student_name
 from department d
 inner join student s
 on s.department_code = d.department_code
 where d.department_name = '컴퓨터공학과'; -- where 조건절
 
 -- SQL 학생이름이 바로 시작하는 학생이름만 출력하세요 -- like 검색
 select * from student
 where student_name like '바%'; -- 길동으로 끝나는 이름찾으려면 '%길동' '%길% <- 자주씀
 
 
 -- SQL 학생의 키가 170 이상 (관계연산)
 select * 
 from student
 where student_height >=170;
 
  -- SQL 학생의 키가 170 이상 180이하인 학생만 출력하세요 (논리연산)
 select * 
 from student
 where student_height between 170 and 180;  -- betwenn ~ 에서 ~ 사이
 
 -- SQL 키가 가장큰 사람을 출력하세요  -- 내림차순으로 정렬한다음 리미트로 한명만 출력
 select student_name from student
 order by student_height desc
 limit 1; -- 페이징 처리
 
 
 -- 
 
 
