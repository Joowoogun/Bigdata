CREATE TABLE customer ( -- 고객테이블
customer_id VARCHAR(50) NOT NULL, -- 고객아이디
password VARCHAR(100) NOT NULL, -- 비밀번호
customer_name VARCHAR(100) NOT NULL, -- 고객이름
age INT, -- 나이
rating VARCHAR(20) NOT NULL, -- 등급
occupation VARCHAR(20), -- 직업
reserves INT DEFAULT 0, -- 적립금
PRIMARY KEY (customer_id)
);
CREATE TABLE product ( -- 제품테이블
product_number INT AUTO_INCREMENT, -- 제품번호
product_name VARCHAR(100), -- 제품명
inventory INT, -- 재고량
price INT, -- 가격
manufacturer VARCHAR(100), -- 제조업체
PRIMARY KEY (product_number),
CHECK (inventory > 0 AND inventory <= 10000)
);
CREATE TABLE customer_product ( -- 주문테이블
order_number INT AUTO_INCREMENT, -- 주문번호(독립형PK)
customer_id VARCHAR(50), -- 고객번호
product_number INT, -- 제품번호
quantity INT, -- 수량
order_date DATETIME default now(), -- 주문일자
PRIMARY KEY (order_number),
FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
FOREIGN KEY (product_number) REFERENCES product(product_number)
);

INSERT INTO customer (customer_id, password, customer_name, age, rating, occupation, reserves)
VALUES
('CUST001', 'CUST001', '홍길동', 30, 'Gold', '엔지니어', 100),
('CUST002', 'CUST002', '이영희', 25, 'Silver', '교사', 50),
('CUST003', 'CUST003', '김철수', 40, 'VIP', '의사', 75),
('CUST004', 'CUST004', '박영훈', 35, 'Silver', '변호사', 25),
('CUST005', 'CUST005', '최미영', 28, 'Gold', '예술가', 150);

INSERT INTO product (product_name, inventory, price, manufacturer)
VALUES
('제품 A', 50, 20000, 'ABC 주식회사'),
('제품 B', 30, 35000, 'XYZ 기업'),
('제품 C', 80, 15000, 'LMN 산업'),
('제품 D', 40, 25000, 'PQR 주식회사'),
('제품 E', 20, 30000, 'JKL 기업');

INSERT INTO customer_product (customer_id, product_number, quantity)
VALUES
('CUST001', 1, 2),
('CUST002', 3, 1),
('CUST003', 2, 3),
('CUST004', 4, 2),
('CUST005', 5, 1),
('CUST001', 2, 1),
('CUST002', 4, 2),
('CUST003', 1, 3),
('CUST004', 5, 1),
('CUST005', 3, 2);


select * from customer;
select * from product;
select * from customer_product;


-- (제품번호 주문일자)
select product_number, customer_id
from customer_product;


-- 주문테이블에서 cust005고객이 주문한 제품의 이름을 출력하세요
select p.product_name
from product p
inner join customer_product cp
on p.product_number= cp.product_number
where cp.customer_id='CUST005';

update product set inventory =-1
where product_number=5;

-- 주문테이블에서 나이가 30세 이상인 고객이 주문한 제품의 번호와 주문일자를 출력하세요
select cp.product_number, cp.order_date
from customer c
inner join customer_product cp
on c.customer_id=cp.customer_id
where c.age >=30;

select * from customer;
select * from product;
select * from customer_product;

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
 where p.product_number IN(
 select cp.product_number
 from customer_product cp
 where cp.customer_id = 'CUST005'
 );