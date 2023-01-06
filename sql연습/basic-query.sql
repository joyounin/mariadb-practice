show databases;

use webdb;

select version(), current_date(), now() from dual;


-- 수학함수, 사칙 연산도 된다.
select sin(pi() / 4 ), 1 + 2 * 3 - 4 / 5 from dual;

-- 대소문자 구분 안한다.
sElect VERSION(), current_date(), Now() from dual;

-- 두개 동시에 실행가능(CLI에서 가능)
select sin(pi() / 4 ); select 1 + 2 * 3 - 4 / 5 from dual;



show tables;

-- table 생성: DML
create table pet (
	name varchar(100),
	owner varchar(20),
	species varchar(20),
	gender char(1),
	birth date,
	death date
);

-- schema 확인 테이블 구조
desc pet;

-- table 삭제
drop table pet;
show tables;

-- insert: DML(C)
insert into pet values('망고','조영인', 'cat','f', '2014-11-10', null);

-- select: DML(R)
select * from pet;

-- update: DML(U)
update pet set name='뿌꾸' where name = '망고';

-- delete: DML(D)
delete from pet where name='뿌꾸';

-- load data
load data local infile 'D:\pet.txt' into table pet;

-- select 
select name, species from pet where name = 'Bowser';




