


-- Q 손흥민 고객의 주소를 수정하세여(서울특별시 강남구 일동)
update t_customer 
set address = '서울특별시 강남구 일동'
where id = 14;

-- Q : 홍길동 고객을 삭제하세요.
delete from t_customer
where id = 1;

-- Q : 서울에 거주하는 고객을 출력하세요.
select * from t_customer 
where region_code = '02';

-- Q2. 특정 지역(예: '서울특별시')에 사는 고객의 이름과 전화번호를 가져오는 질의
select customer_name, phone 
from t_customer 
where region_code = '02'; 

-- Q. 모든 고객의 정보를 출력하시오(단 고객번호, 이름, 지역명) <-- 두개의 테이블을 사용함(JOIN)
select id, customer_name, region_name 
from t_customer, t_region;

-- t_customer 를 tc 로 명칭 t_region 을 tr 로 명칭 하고 교집 지역코드를 조인
select tc.id, tc.customer_name, tr.region_name 
from t_customer tc
inner join t_region tr 
on tc.region_code = tr.region_code;

-- tr의 테이블을 먼저
select id, customer_name, tc.region_code, region_name 
from t_customer tc
right join t_region tr 
on tc.region_code = tr.region_code;

-- tc의 테이블을 먼저
select id, customer_name, tc.region_code, region_name 
from t_customer tc
left join t_region tr 
on tc.region_code = tr.region_code;

-- 학과별 학생수를 구하여 출력하시오(학과명, 학생수), 학생수가 2명이상인 학과를 출력하시오.
select d.department_name, count(*) as cnt
from department d
inner join student s
on s.department_code = d.department_code
group by d.department_name
having cnt>=2;


-- 학생이름 , 학과명
select student_name, department_name 
-- 스튜던트에 학과를 조인
from student s
inner join department d
-- 공통된 PK 학과코드에서
on s.department_code = d.department_code;


-- SQL. 국어 국문과에 다니는 학생을 출력하세요.(학과명 학생이름)
 select department_name, student_name
 from department d
 inner join student s
 on s.department_code = d.department_code
 where d.department_name = '국어국문과'; -- where 조건절
 
 
 -- SQL 학생이름이 바로 시작하는 학생이름만 출력하세요 -- like 검색
 select * from student
 where student_name like '바%'; -- 길동으로 끝나는 이름찾으려면 '%길동' '%길% <- 자주씀
 
 
  -- SQL 학생의 키가 170 이상 (관계연산)
 select * from student
 where student_height >=170;
 
 
  -- SQL 학생의 키가 170 이상 180이하인 학생만 출력하세요 (논리연산)
 select * from student
 where student_height between 170 and 180;  -- betwenn ~ 에서 ~ 사이
 
 
 -- SQL 키가 가장큰 사람을 출력하세요  -- 내림차순으로 정렬한다음 리미트로 한명만 출력
 select student_name from student
 order by student_height desc
 limit 1; -- 페이징 처리
 
 -- 학과별 교수의 수를 출력하세요(학과 교수의수)
select d.department_name, count(professor_name) as cnt
from department d
inner join professor p
on p.department_code = d.department_code
group by d.department_name;
 
-- 가장 많은 학생이 있는 학과명과 학생수를 출력     한개만 출력하기위해 (내림차순, 리미트) 사용
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


-- 학생중 성이 아 인 학생이 속한 학과명과 학생명을 출력하세요.
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
    
-- 빌게이츠 교수가 가르치는 과목이름을 출력하세요
select p.professor_name, c.course_name 
from professor p
inner join course c
on p.professor_code = c.professor_code
where p.professor_name = '빌 게이츠';


-- Q 과목별 수강자 수를 출력하시오.
select course_name , count(sc.student_id) cnt
from course c
inner join student_course sc
on c.course_code = sc.course_code
group by course_name;

-- 서브 쿼리
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
)));


-- 쇼핑
-- 주문테이블에서 cust005고객이 주문한 제품의 이름을 출력하세요
select p.product_name
from product p
inner join customer_product cp
on p.product_number= cp.product_number
where cp.customer_id='CUST005';
  
 -- 주문테이블에서 나이가 30세 이상인 고객이 주문한 제품의 번호와 주문일자를 출력하세요
select cp.product_number, cp.order_date
from customer c
inner join customer_product cp
on c.customer_id=cp.customer_id
where c.age >=30;

-- 고객테이블에서 적립금 평균이 80원 이상인 등급에 대해 등급별 고객수와 적립금 평균을 출력하세요.
select rating, count(*) cnt, avg(reserves) average
from customer
group by rating
having average >= 80;

-- 주문테이블에서 적립금이 가장 많은 고객의 고객이름과 적립금을 출력하세요.
select customer_name, reserves
from customer
where reserves =(
select max(reserves) 
from customer
 );
 
  -- 주문테이블에서 CUST005 고객이 주문한 제품의 이름과 제조업체를 출력하세요 
 select product_name, manufacturer
 from product p
 inner join customer_product cp
 on p.product_number=cp.product_number
 where customer_id = 'CUST005';
 
  -- 주문테이블에서 CUST005 고객이 주문한 제품의 이름과 제조업체를 출력하세요 
 select product_name, manufacturer
 from product p
 where p.product_number IN(
 select cp.product_number
 from customer_product cp
 where cp.customer_id = 'CUST005'
 );

 -- 구매이력이 있는 customer_id 출력 중복방지 distinct
select distinct customer_id
from customer_product;
  
 
