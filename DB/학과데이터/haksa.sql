select * from professor;
select * from department;

-- Q 컴퓨터공학과의 소속된 교수 이름을 출력하세요.
select professor_name, department_name
from professor p
inner join department d
on p.department_code = d.department_code
where d.department_name = '컴퓨터공학과';

-- 학과별 교수의 수를 출력하세요(학과 교수의수)
select d.department_name, count(professor_name) as cnt
from department d
inner join professor p
on p.department_code = d.department_code
group by d.department_name;

-- 학과별 교수의 수가 4보다 큰 값만 출력
select d.department_name, count(professor_name) as cnt
from department d
inner join professor p
on p.department_code = d.department_code
group by d.department_name
having cnt >=4;


-- 가장 많은 학생이 있는 학과명과 학생수를 출력
select d.department_name, count(student_name) as cnt
from student s
inner join department d
on s.department_code = d.department_code
group by d.department_name
order by cnt desc
limit 1;

-- 서브쿼리  셀렉트안에 셀렉트가 있으면 서브쿼리라고 하며 안쪽셀렉트가 먼저실행됨
select department_name
from department
where department_code=( 
   select department_code
   from student
   group by department_code
   having count(department_code)=(
      select count(department_code) cnt
      from student 
      group by department_code
      order by cnt desc 
      limit 1
 )
);

select count(department_code)
from student 
group by department_code;

-- 학생중 성이 아인 학생이 속한 학과명과 학생명을 출력하세요.
select student_name, department_name
from student s
inner join department d
on s.department_code = d.department_code
where student_name like '아%';

-- 키가 175~180 사이에 속한 학생수를 출력하세요.
select count(student_id) cnt
from student
where student_height between 175 and 180;

-- 다길동 학생과 같은 학과에 속한 학생의 이름을 출력하시오.
-- 서브 쿼리를 이용해보세요
-- 먼저 다길동의 department_code를 구하고
-- 구한 department_code를 다시 학생테이블에서 같은 department_code의 학생들만 출력
select student_name
from student st
where st.department_code=(
    select department_code
    from student s
    where s.student_name = '다길동'
    );
    
    -- 학과별 키의 최고값과, 평균값을 출력하시오. 
	select d.department_name, max(s.student_height), avg(s.student_height)
    from student s
    inner join department d
    on s.department_code = d.department_code
    group by d.department_code;
  
select * from course;

-- 빌게이츠 교수가 가르치는 과목이름을 출력하세요
select p.professor_name, c.course_name 
from professor p
inner join course c
on p.professor_code = c.professor_code
where p.professor_name = '빌 게이츠';


select (max(id),0)+1 num from student_course; -- null 이면 0 

select * from course;

-- Q 과목별 수강자 수를 출력하시오.
select course_name , count(sc.student_id) cnt
from course c
inner join student_course sc
on c.course_code = sc.course_code
group by course_name;
-- having cnt>=2
-- order by course_name desc

-- 서브쿼리
-- Q 빌게이츠 교수(4)의/ 과목(4)을/ 수강신청한 학생을 출력하세요.
select s.student_name
from student s
where s.student_id IN (
  select sc.student_id
  from student_course sc
  where sc.course_code=(
    select c.course_code
     from course c
     where c.professor_code=(
          select p.professor_code
            from professor p
           where p.professor_name='빌 게이츠'
))
);


-- 스티브 잡스 교수의 / 과목을 / 수강신청한 학생이름을 출력하세요
select department_name, student_name
from department d
inner join 
(select s.student_name, s.department_code
from student s
where s.student_id IN (
  select sc.student_id
  from student_course sc
  where sc.course_code=(
    select c.course_code
     from course c
     where c.professor_code=(
          select p.professor_code
            from professor p
           where p.professor_name='스티브 잡스'
)))) as A
on A.department_code=d.department_code;
-- 서브쿼리
-- Q 사길동 학생과 같은 과목을 수강신청한 학생이름을 출력하세요.
select s.student_name
from student s
where s.student_id IN(
   select sc.student_id
   from student_course sc
   where sc.course_code=(
      select sc.course_code
      from student_course sc
      where sc.student_id=(
         select s.student_id
         from student s
         where s.student_name='사길동'
)))





