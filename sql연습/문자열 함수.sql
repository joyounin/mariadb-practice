-- 문자열 함수

-- upper 대문자로 만든다
select upper('busan'), upper('BusaN'), upper('Busan') from dual;
select upper(first_name) from employees order by upper(first_name);

-- lower 소문자로 만든다
select lower('BUSAN'), lcase('BusaN'), lower('Busan') from dual;
select lower(first_name) from employees order by lower(first_name);

-- substring(문자열, index, length) where절에서도 사용가능
select substring('Hello World', 1, 15);

-- 예제) 1989년에 입사한 사원들의 이름, 입사일을 출력
select first_name, hire_date
  from employees
 where substring(hire_date, 1, 4) = '1989';
 
 -- lpad(오른쪽 정렬, 칸을 채운다, '들어갈 것'), rpad(왼쪽 정렬, 칸을 채운다, '들어갈 것')
 select lpad('1234', 10, '-'), rpad('1234', 10, '-');
 
 -- 예제) 직원들의 월급을 오른쪽 정렬(빈공간 *)
 select lpad(salary, 10, '*') from salaries;
 
 -- trim(both를 사용하여 특수 문자열 제거, leading 왼쪽 특수 문자열 삭제, trailing 오른쪽 특수 문자열 삭제), ltrim, rtrim(문자열 공백 삭제)
 select 
  concat('---', ltrim('     hello     '), '---'),
  concat('---', rtrim('     hello     '), '---'),
  concat('---', trim(leading 'x' from 'xxxxxhelloxxxxx'), '---'),
  concat('---', trim(trailing 'x' from 'xxxxxhelloxxxxx'), '---'),
  concat('---', trim(both 'x' from 'xxxxxhelloxxxxx'), '---')
  from dual;
  
-- length(문자열 길이 출력)
  select length('Hello World') from dual;