create table board(
idx int auto_increment primary key, 
title varchar(100) not null,
writer varchar(100) not null,
content varchar(100) not null,
indate datetime default current_timestamp
);
commit;

insert into board(title, writer, content)
values('DB게시글1','주우건','ㅇㅇㅇㅇㅇ');


select * from board;

select DISTINCT * FROM BOARD 
where writer like concat('%','우','%');


SELECT DISTINCT(WRITER) from board;
DELETE FROM board
WHERE idx='2';


update board
set title = 'dddd' ,content = '아ㅏ'
where idx ='8'