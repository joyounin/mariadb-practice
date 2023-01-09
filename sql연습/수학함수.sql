-- 수학 함수

-- abs(절대값)
select abs(1), abs(-1) from dual;

-- ceil(실수가 있을때 높은 정수값 출력)
select ceil(3.14), ceiling(3.14) from dual;

-- floor(실수가 있을때 낮은 정수값 출력)
select floor(3.14) from dual;

-- mod 나머지 계산
select mod(10, 3), 10 % 3 from dual;

-- round(x) : x에 가장 근접한 정수
-- round(x, d) : x값 중에 소수점 d 자리에 가장 근접한 실수
select round(1.498), round(1.511), round(1.498, 1), round(1.498, 0) from dual;

-- power(x, y), pow(x,y) : x의 y승
select power(2, 10), pow(2, 10) from dual;

-- sign(x) : 양수면 1, 음수면 -1, 0 이면 1이 출력된다.
select sign(20), sign(-100), sign(0) from dual;

-- greatest(x, y, ...) 최대값, least(x, y, ...)최소값
select greatest(10, 40, 20, 50), least(10, 40, 20, 50) from dual;
-- 문자열은 아스키코드 값 소문자가 더 아스키코드 값이 낮다.
select greatest('b', 'A', 'C', 'D'), least('hello', 'hela', 'hell') from dual;

