-- 서브쿼리(SUBQUERY) SQL 문제입니다.

-- 문제1.
-- 현재 평균 연봉보다 많은 월급을 받는 직원은 몇 명이나 있습니까?
select avg(salary)
  from salaries
 where to_date = '9999-01-01';
 
 select count(b.emp_no)
   from employees a, salaries b
 where a.emp_no = b.emp_no
   and b.to_date = '9999-01-01'
   and b.salary > (select avg(salary)
					 from salaries
				    where to_date = '9999-01-01');
-- 문제2. (생략 x)
-- 현재, 각 부서별로 최고의 급여를 받는 사원의 사번, 이름, 부서 급여를 조회하세요. 
-- 단 조회결과는 연봉의 내림차순으로 정렬되어 나타나야 합니다. 

-- 문제3.
-- 현재, 자신의 부서 평균 급여보다 급여 많은 사원의 사번, 이름과 급여을 조회하세요 

-- 1) 부서별 평균 급여
  select c.dept_name, avg(a.salary) as avg_salary
    from salaries a, dept_emp b, departments c
   where a.emp_no = b.emp_no
     and b.dept_no = c.dept_no
     and a.to_date = '9999-01-01'
     and b.to_date = '9999-01-01'
group by c.dept_name;

-- 2) 부서 평균보다 많이 받는 직원의 사번, 이름, 급여 조회
  select c.emp_no, c.first_name, d.salary, a.dept_name
    from departments a, dept_emp b, employees c, salaries d, (select c.dept_name, avg(a.salary) as avg_salary
														        from salaries a, dept_emp b, departments c
															   where a.emp_no = b.emp_no
															     and b.dept_no = c.dept_no
																 and a.to_date = '9999-01-01'
																 and b.to_date = '9999-01-01'
														    group by c.dept_name) e
   where a.dept_no = b.dept_no
     and b.emp_no = c.emp_no
	 and c.emp_no = d.emp_no
     and e.dept_name = a.dept_name
     and b.to_date = '9999-01-01'
     and d.to_date = '9999-01-01'
	 and d.salary > e.avg_salary
order by c.emp_no asc;
 
-- 문제4.
-- 현재, 사원들의 사번, 이름, 매니저 이름, 부서 이름으로 출력해 보세요.
select b.emp_no, concat(a.first_name, ' ', a.last_name), c.dept_name
  from employees a, dept_manager b, departments c
 where a.emp_no = b.emp_no
   and b.dept_no = c.dept_no
   and b.to_date = '9999-01-01'
order by a.emp_no;
 
-- 문제5.
-- 현재, 평균급여가 가장 높은 부서의 사원들의 사번, 이름, 직책, 급여를 조회하고 급여 순으로 출력하세요.

-- 1) 평균 급여 부서
select a.dept_name, avg(salary) as avg_salary
  from departments a, dept_emp b, salaries c
 where a.dept_no = b.dept_no
   and b.emp_no = c.emp_no
   and b.to_date = '9999-01-01'
   and c.to_date = '9999-01-01'
group by a.dept_name
order by avg_salary desc;


-- 2) 부서별 평균연봉이 가장 높은 부서
select max(a.avg_salary)
  from (  select a.dept_name, avg(salary) as avg_salary
		    from departments a, dept_emp b, salaries c
           where a.dept_no = b.dept_no
             and b.emp_no = c.emp_no
             and b.to_date = '9999-01-01'
             and c.to_date = '9999-01-01'
		group by a.dept_name) a;
        
-- 3) sol1
select a.emp_no, a.first_name, b.title, avg(c.salary) as avg_salary, d.dept_name
  from employees a, titles b, salaries c, departments d, dept_emp e
 where a.emp_no = b.emp_no
   and b.emp_no = c.emp_no
   and a.emp_no = e.emp_no
   and e.dept_no = d.dept_no
   and b.to_date = '9999-01-01'
   and c.to_date = '9999-01-01'
   and e.to_date = '9999-01-01'
group by d.dept_name
having avg_salary = (select max(a.avg_salary)
					   from (  select a.dept_name, avg(salary) as avg_salary
					   from departments a, dept_emp b, salaries c
					  where a.dept_no = b.dept_no
						and b.emp_no = c.emp_no
						and b.to_date = '9999-01-01'
						and c.to_date = '9999-01-01'
				   group by a.dept_name) a);

-- 문제6.
-- 평균 급여가 가장 높은 부서는? 
-- 부서이름, 평균 급여
-- 1) 평균 급여 부서
select a.dept_name, avg(salary) as avg_salary
  from departments a, dept_emp b, salaries c
 where a.dept_no = b.dept_no
   and b.emp_no = c.emp_no
   and b.to_date = '9999-01-01'
   and c.to_date = '9999-01-01'
group by a.dept_name
order by avg_salary desc;

-- 2) 가장 높은 부서는?
select avg(c.salary) as avg_salay, a.dept_name
  from departments a, dept_emp b, salaries c
 where a.dept_no = b.dept_no
   and b.emp_no = c.emp_no
   
-- 문제7.
-- 평균 급여가 가장 높은 직책?
-- 직책, 평균급여

-- 문제8.
-- 현재 자신의 매니저보다 높은 급여를 받고 있는 직원은?
-- 부서이름, 사원이름, 급여, 매니저 이름, 메니저 급여 순으로 출력합니다.

