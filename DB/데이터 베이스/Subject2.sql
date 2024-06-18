-- Q : 모든 고객의 정보(이름, 전화번호)를 출력하세요
select customer_name,phone from t_customer;
select * from t_customer;

-- 고객 정보를 입력하세요.
insert into t_customer(customer_name, phone, email, address, region_code)
values('손흥민','010-1234-7894','son@gmail.com','서울특별시 강남구 삼성동','02');

insert into t_customer(customer_name, phone, email, address, region_code)
values('박태환','010-1234-5555','park@gmail.com','제주특별자치도 제주시 일도','064');

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

select * from t_product;

insert into t_sales(customer_id, product_code, qty)
values(15, 'P003', 2);

select * from t_sales;

-- Q2. 특정 지역(예: '서울특별시')에 사는 고객의 이름과 전화번호를 가져오는 질의
select customer_name, phone from t_customer where region_code = '02'; 

-- Q. 모든 고객의 정보를 출력하시오(단 고객번호, 이름, 지역명) <-- 두개의 테이블을 사용함(JOIN)
select id, customer_name, region_name from t_customer, t_region;

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






