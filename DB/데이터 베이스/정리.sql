-- SQL 명령문
-- DDL(정의) : create, alter, drop
-- DML(조작) : select, insert, update, delete
-- DCL(제어) : grant, revoke

select * from customer_product;
-- 구매이력이 있는 customer_id 출력 중복방지 distinct
select count(distinct customer_id)
from customer_product;

select manufacturer,char_length(manufacturer)
from product;

select product_name, manufacturer
from product
where char_length(manufacturer)>=8;

select * 
from customer;

-- NULL null 은 카운트 하지않음
select count(age) from customer;
select count(customer_id) from customer;

-- 나이 NULL인 고객을 출력하시오, null이 아닌 고객을 출력
select customer_name from customer
where age is null;
select customer_name from customer
where age is not null;


select * from product;

-- 제품을 2개 이상 제조한 제조업체 별로 제품의 개수와 제품중 가장 비싼 가격을 출력하세요
select manufacturer, count(*)cnt, max(price) maxprice
from product
group by manufacturer
having count(*)>=2; -- 필터링

-- 제품명이 제품 C를 생산한 제조업체가 만든 제품들의 제품명과 가격을 출력.

select manufacturer 
from product
where product_name='제품 C';

-- 제품명이 제품 C를 생산한 제조업체가 만든 제품들의 제품명과 가격을 출력.
select product_name, price
from product
where manufacturer =(
    select manufacturer
    from product
    where product_name = '제품 C'
);

-- CUST005고객이 주문한 제품의 제품명과 제조업체를 출력하시오.
select product_name, manufacturer
from product
where product_number IN(
   select product_number 
   from customer_product 
   where customer_id='CUST005'
);

-- CUST005고객이 주문안한 제품의 제품명과 제조업체를 출력하시오.
select product_name, manufacturer
from product
where product_number NOT IN(
   select product_number 
   from customer_product 
   where customer_id='CUST005'
);


select * 
from product;
-- 제품의 가격을 모두 10%인상 해보자



update product 
set price = price*1.1
-- where product_number=6;  
-- 특정 값만 인상하려면 where 절 추가




