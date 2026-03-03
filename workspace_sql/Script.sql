SELECT * FROM emp;

SELECT deptno FROM emp;

SELECT
	sal,
	ename,
	123,
	'문자eng'
FROM emp;

SELECT DISTINCT deptno FROM emp;
SELECT DISTINCT job FROM emp;

SELECT ename, sal, sal*12+comm, comm
	FROM emp;

SELECT ename, sal, sal*12+comm AS "ann sal", comm
	FROM emp;

SELECT ename AS "name", sal, sal*12+comm annsal, comm
	FROM emp;

SELECT ename AS name FROM emp;

SELECT * FROM emp 
ORDER BY sal ASC;

SELECT * FROM EMP
ORDER BY sal DESC;

SELECT * FROM EMP
ORDER BY empno DESC; 

SELECT * FROM EMP
ORDER BY DEPTNO, sal, empno;

SELECT * FROM EMP
ORDER BY DEPTNO asc, sal desc, empno ;

SELECT DISTINCT job FROM  emp


SELECT 
	empno as employee_no,
	ename as employee_name
FROM emp
ORDER BY DEPTNO  DESC, ename asc;

SELECT * 
	FROM EMP
WHERE deptno = 30;

SELECT * FROM emp
WHERE DEPTNO = 30 AND job = 'SALESMAN';

--SELECT * FROM EMP
/*
 * 
 */
WHERE empno = 7499 and deptno = 30;

SELECT * FROM EMP
WHERE mgr = 7839 AND DEPTNO = 20;

SELECT * FROM EMP WHERE deptno = 30 OR job = 'CLERK';

SELECT * FROM emp
	WHERE deptno = 30 OR EMPNO = 7369
	
SELECT * FROM EMp WHERE sal >= 3000;

SELECT * FROM emp 
WHERE 
	sal >= 2500 
	AND job = 'ANALYST';

SELECT * 	
	FROM emp
WHERE sal <> 3000; 

SELECT * FROM EMP
WHERE NOT sal <= 3000;

SELECT ename, sal FROM emp
WHERE sal >= 1500 AND sal < 3000; 

SELECT * FROM emp
WHERE job = 'CLERK' OR sal > 2000 AND deptno = 10;

SELECT ename, deptno FROM emp
WHERE deptno IN (10, 20)
	

SELECT * FROM emp
WHERE (deptno = 20 OR deptno = 30) AND (sal >= 2000 AND sal <= 3000)
ORDER BY sal ASC, ename ASC;

SELECT ename, deptno FROM emp
WHERE deptno NOT IN (10, 20)

SELECT *
	FROM emp
WHERE sal between 2000 AND 3000;

SELECT *
	FROM emp
WHERE sal NOT between 2000 AND 3000;

SELECT *
	FROM emp
WHERE sal NOT between 2000 AND 3000
AND deptno =30;

SELECT * FROM emp
WHERE ename LIKE 'S%';

SELECT * FROM emp
WHERE ename LIKE '%N';

SELECT * 
	FROM EMP
WHERE ename LIKE '_L%';

--이름이 5글자인 사람을 찾을 때
SELECT * FROM emp
WHERE ename LIKE '_____';

SELECT * FROM emp
WHERE ename LIKE '%AM%';

SELECT * FROM emp
WHERE ename not LIKE '%A%';

SELECT * FROM emp
WHERE ename not LIKE '%A%S%';

SELECT comm FROM emp;

SELECT * FROM EMP
WHERE comm = NULL

SELECT * FROM emp
WHERE comm IS NULL;

SELECT * FROM emp
WHERE comm IS not NULL;



SELECT * FROM EMP

SELECT empno, ename, job, sal, deptno FROM emp
WHERE deptno = 30 AND job = 'SALESMAN';

SELECT * FROM EMP 
WHERE NOT (sal >= 2000 AND sal <= 3000);

SELECT ename, upper(ename), lower(ename), initcap(ename) FROM emp;

SELECT 1 FROM dual;

select upper('aBc'), LOWER(123), upper(LOWER('aBc')) FROM dual;

SELECT * FROM emp
WHERE upper(ename) LIKE upper('%aM%');

SELECT ename, LENGTH(ename) FROM emp

SELECT * FROM emp
WHERE length(ename) >= 5;
-- 길이
SELECT LENGTH('한글'), length(123) FROM emp;
-- lengthb는 바이트 개수
SELECT LENGTH('a'), LENGTH('한'), LENGTHB('a'), LENGTHB('한') FROM dual;

SELECT job , substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) FROM emp;
--q 사원이름 2번째부터 3글자만 출력
SELECT substr(ename, 2, 3) FROM emp;

SELECT substr(ename, 2, 30) FROM emp; --마지막 숫자가 커도 끝까지만 출력

SELECT substr(ename, 20, 3), substr(ename, -20, 3) FROM emp; --실제 길이를 벗어나면 NULL이 된다.

SELECT ENAME, substr(ename, -3, 2) FROM emp;-- -시작위치는 뒤에서부터 세서 시작점으로 한다. 이후 글자수 진행방향은 ->

--replace(대상, 바뀔 문자, 바꿀 문자)
-- "모든" 바뀔 문자를 바꿀 문자로 변경
SELECT 
	'a-b-c',
	replace('a-b-c', '-', ' '),
	replace('a-b-c', '-', ';'),
	replace('a-b-c', '-'),
	replace('a-b-c', '-', '')
from dual;

--q 사원 이름에 A를 모두 abc로 바꾼다
SELECT ename, replace(ename, 'A', 'abc') FROM emp;

SELECT 
	ename, lpad(ename, 10, '#'),
	rpad(ename, 10, '#'),
	lpad(ename, 10),
	rpad(ename, 10) FROM emp;
-- lpad, rpad는 모자르면 채우고, 넘치면 자른다.
-- 즉, 두번째 값의 길이로 만들어준다.
SELECT rpad(ename, 10, '#'), rpad(ename, 5, '#') FROM emp;

SELECT replace() FROM emp;


--리플레이스 (열대상, (바꿀 것), 바뀔것), 바꿀 것이 문제. 원본에서 3번째부터 끝까지 문자를 없애자.

SELECT Lpad(ename, 2), rpad(ename, 2) FROM emp;

--q1
SELECT ename, substr(ename, 1, 2), Lpad(ename, 2), replace(ename, substr(ename, 3) , '' ) FROM emp;

--q2
SELECT ename, rpad(substr(ename, 1, 2), 6, '*') FROM emp;
--q3
SELECT ename, rpad(substr(ename, 1, 2), length(ename), '*') FROM emp;
--q4
-- q3에서 앞두 글자만 별표 처리
SELECT ename, lpad(substr(ename, 3), length(ename), '*') FROM emp;


SELECT 'ab' || 'cd' FROM dual;

SELECT  
	'['|| '   _ _oracle_ _   ' ||']', 
	'['|| trim('   _ _oracle_ _   ') ||']' 
FROM dual;

SELECT
	round(14.46), --14
	round(14.46, 1), --14.5
	round(14.46, -1) --10
FROM dual;

SELECT
	trunc(17.78), --17
	trunc(17.78, 1), --17.7
	trunc(17.78, -1), --10
	trunc(-17.78)
FROM dual;

SELECT
	ceil(3.14), --4
	floor(3.14), --3
	ceil(-3.14), -- -3
	floor(-3.14) -- -4
FROM dual;

SELECT mod(15,6), mod(15,0) FROM dual; --divisor가 0이어도 에러 안남
SELECT MOD(6,3), MOD(7,3), MOD(8,3), mod(9,3) FROM dual;

SELECT sysdate from dual;
SELECT sysdate, ADD_MONTHS(sysdate, 3) from dual;

SELECT to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') AS 현재날짜시간 
from dual;

SELECT to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시":mi"분":ss"초"') AS 현재날짜시간 --한글은 ""로 감싸줘야한다
from dual;

SELECT hiredate FROM EMP 
ORDER BY hiredate;

SELECT * FROM EMP
WHERE hiredate > to_date('1981/06/01', 'yyyy/mm/dd');

SELECT 
	sal, 
	comm, 
	sal+comm, 
	nvl(comm, 0), 
	sal+nvl(comm, 0),
	nvl(to_char(comm), 'N/A') --데이타타입은 colum에 하나만 있을 수 있다. 2개 이상 공존 불가능
FROM emp;

SELECT JOB, SAL,
	decode(job,
			'MANAGER', SAL*1.1,
			'SALESMAN', SAL*1.05,
			'ANALYST', SAL,  
			SAL*1.03) AS UPSAL
FROM EMP;

SELECT EMPNO, ENAME, JOB, SAL,
	CASE JOB
		WHEN 'MANAGER' THEN SAL*1.1
		WHEN 'SALESMAN' THEN SAL*1.05
		WHEN 'ANALYST' THEN SAL
		ELSE SAL*1.03
	END AS UPSAL
FROM EMP;

SELECT empno, ename, comm, 
	CASE
		WHEN comm IS NULL THEN '해당 사항 없음'
		WHEN comm = 0 THEN '수당 없음'
		WHEN comm > 0 THEN '수당: ' || comm
	END AS comm_text
FROM emp;
--
--q1
SELECT empno, 
	rpad(substr(empno, 1, 2), LENGTH(empno),'*'  ) AS MASKING_EMPNO, 
	ename,
	rpad(substr(ename, 1, 1), LENGTH(ename),'*'  ) AS masking_ename 
FROM emp
WHERE length(ename) >= 5 AND length(ename) < 6;

--q2
SELECT 
	empno, 
	ename,
	sal,
	trunc(sal/21.5, 2) AS DAY_PAY, 
	round(sal/21.5/8, 1) AS TIME_PAY
FROM emp;

--q3
SELECT empno, 
	ename, 
	to_char(hiredate, 'yy/mm/dd'), 
	to_char(ADD_MONTHS(hiredate, 3), 'yyyy-mm-dd') AS r_job, 
	CASE 
		WHEN comm IS NULL THEN 'N/A'
		else to_char(comm)
	END AS comm
FROM emp;

--q4
SELECT empno, ename, mgr, 
CASE
	WHEN mgr IS NULL THEN 0000
	WHEN substr(mgr, 1, 2) = 75 THEN 5555 
	WHEN substr(mgr, 1, 2) = 76 THEN 6666
	WHEN substr(mgr, 1, 2) = 77 THEN 7777
	WHEN substr(mgr, 1, 2) = 78 THEN 8888
	ELSE mgr
END AS chg_mgr
FROM emp;


--q3 연습i
SELECT hiredate,
	to_char(hiredate, 'yyyy/mm/dd'), 
	to_char(ADD_MONTHS(hiredate, 3), 'yyyy-mm-dd') AS r_job
FROM emp;

SELECT sum(comm) FROM emp;

--SELECT sum(sal), sal FROM emp; 행의 개수가 달라서 안됨

SELECT count(sal) FROM emp;
SELECT count(comm) FROM emp;
SELECT count(*) FROM emp;

SELECT count(*) FROM emp
WHERE deptno =30;

SELECT max(sal) FROM emp;
SELECT min(sal) FROM emp;

SELECT 
	max(sal), min(sal), min(hiredate), min(comm)
	,count(*), sum(sal)
FROM emp; --한 줄이라서 다 같이 나옴

SELECT FLOOR(avg(sal)) FROM emp;

-- 이름에 a가 들어가는 사람은 몇명?--
--'a'

SELECT count(ename) FROM EMP 
WHERE LOWER(ename) LIKE Lower('%a%');

SELECT DISTINCT deptno FROM emp;

--group by
/*
 * 제약 1. select에는 group by에 적은 컬럼명만 가능하다
 * 제약 2. select에 집계 함수는 가능하다
 */
SELECT deptno
FROM emp
GROUP BY deptno;

SELECT deptno, count(*), sum(sal)
FROM emp
GROUP BY deptno;
--

SELECT deptno , job, count(*) 
FROM EMP
GROUP BY  deptno , job;

SELECT deptno , job 
FROM EMP
GROUP BY  deptno , job;

--SELECT* FROM emp
--WHERE avg(sal) < sla; 집계함수 where에 못 씀

SELECT deptno, job FROM emp
WHERE deptno = 10
GROUP BY deptno, job;

SELECT deptno, job FROM emp
--WHERE deptno = 10
GROUP BY deptno, job
HAVING deptno = 10;

SELECT deptno, job, avg(sal) FROM emp
GROUP BY deptno, job;

SELECT deptno, job, avg(sal) FROM emp
--WHERE deptno = 10
GROUP BY deptno, job
HAVING avg(sal) > 2000; --집계함수를 조건으로 쓰고 싶을 때 having 쓸 수 있음

-- job 별로 3명 이상인 job과 count(*)를 출력 표시 --
SELECT job, count(*) FROM EMP e 
GROUP by job
HAVING count(*) >= 3;

--실행순서
--5.SELECT job, 1 as num
--1.FROM emp
--2.WHERE sal > 1000
--3.GROUP BY job
--4.HAVING count(*) >= 3
--6.ORDER BY num desc;

SELECT *FROM dept;
SELECT * FROM emp;

--모든 조합이 다 나온다
SELECT * FROM emp, dept
ORDER BY empno;

-- emp에서 smith의 deptno만 출력
SELECT deptno FROM emp
WHERE ename = 'SMITH';
-- dept에서 deptno가 20인 줄 모든 컬럼 출력
SELECT * FROM dept WHERE deptno = 20;

SELECT *
FROM emp, DEPT
WHERE emp.DEPTNO =dept.deptno;

SELECT *
FROM emp e, dept d --별칭 as 못씀
--WHERE emp.EMPNO = d.DEPTNO  e말고 emp 쓰면 에러남
WHERE e.DEPTNO =d.DEPTNO ;

--SELECT ename, * FROM emp; --에러
SELECT ename, emp.* FROM emp; --* 외의 다른 컬럼이 있으면 출처 적어야함
SELECT emp.ename FROM emp;

--scheme

--모호하다
--SELECT ename, deptno
--FROM emp e, dept d --별칭 as 못씀
----WHERE emp.EMPNO = d.DEPTNO  e말고 emp 쓰면 에러남
--WHERE e.DEPTNO =d.DEPTNO ;

SELECT ename, e.deptno, e.*
FROM emp e, dept d --별칭 as 못씀
--WHERE emp.EMPNO = d.DEPTNO  e말고 emp 쓰면 에러남
WHERE e.DEPTNO =d.DEPTNO ;


SELECT * FROM salgrade;

--800
SELECT sal FROM emp WHERE ENAME = 'SMITH';

SELECT ename, sal, grade, losal,hisal FROM emp e, salgrade s WHERE e.sal >= s.LOSAL AND e.SAL <= s.HISAL ; 

SELECT mgr FROM emp WHERE ENAME = 'SMITH';
SELECT *FROM emp WHERE empno = 7902;

-- king은 mgr이 null이어서 결과에서 빠졌다
SELECT 	e1.empno, e1.ename, e1.MGR,
		e2.empno, e2.ename, e2.MGR
FROM emp e1, emp e2
WHERE e1.MGR  = e2.empno;

SELECT * FROM emp e NATURAL JOIN dept d;
SELECT deptno FROM emp e NATURAL JOIN dept d;

SELECT * 
FROM emp e JOIN dept d using(deptno);

SELECT deptno, e.empno, dname
FROM emp e JOIN dept d USING(deptno);

SELECT d.deptno, d.*
FROM emp e JOIN dept d ON (e.deptno = d.deptno)
WHERE sal <= 2000;

SELECT * 
FROM emp e1 JOIN emp e2 ON(e1.mgr = e2.empno); 

SELECT * 
FROM emp e1 LEFT OUTER JOIN emp e2 ON(e1.mgr = e2.empno);
SELECT * 
FROM emp e1 right OUTER JOIN emp e2 ON(e1.mgr = e2.empno);

SELECT * 
FROM emp e1 full OUTER JOIN emp e2 ON(e1.mgr = e2.empno);

-- 퀴즈
-- 각 부서별로 
-- 급여가 가장 높은 급여랑 
-- 가장 낮은 사원의 급여,
-- 급여 차액,
-- 부서번호
-- hint 결과는 총 3줄

SELECT deptno, max(sal), min(sal), max(sal)-min(sal) FROM EMP e
GROUP BY e.DEPTNO ;


-- 그들의 급여 차이와 부서번호 출력
--q1
SELECT e.deptno, d.dname, empno, ename, sal FROM emp e, DEPT d 
WHERE sal > 2000 and d.DEPTNO = e.DEPTNO
ORDER BY e.deptno, job;

--q2
SELECT e.deptno,d.DNAME,  floor(avg(sal)), max(e.sal), min(e.sal), count(e.empno) FROM EMP e, dept d 
WHERE d.DEPTNO =e.DEPTNO
GROUP BY e.DEPTNO,dname
ORDER BY e.DEPTNO;

--q3
SELECT d.deptno, d.dname, empno, ename, job, sal  FROM emp e right OUTER join dept d on (e.DEPTNO = d.DEPTNO) 
ORDER by  e.deptno, ename;

--q4

SELECT d.deptno, d.dname, e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno AS deptno_1, losal, hisal, sa.GRADE, e2.empno AS MGR_empno, e2.mgr AS mgr_ename   
FROM   
dept d left outer JOIN emp e1 ON (e1.DEPTNO = d.deptno) 
LEFT OUTER jOIN emp e2 ON(e1.mgr = e2.empno) 
LEFT OUTER join salgrade sa ON (e1.sal >= sa.LOSAL AND e1.sal <= sa.hisal)
ORDER BY d.deptno, e1.EMPNO ;


-----------------
--서브쿼리
----------------

--SELECT * FROM emp WHERE sal >2975;
WHERE sal > (SELECT sal
				from emp		
				WHERE ename = 'JONES');

SELECT *
FROM emp e
WHERE hiredate < (SELECT HIREDATE 
		          FROM emp 
				  WHERE ename = 'SCOTT');

SELECT * FROM EMP e 
WHERE sal > (SELECT avg(sal) from emp
);

SELECT MAX(sal) FROM EMP e 
GROUP BY deptno;
SELECT * FROM EMP e 
WHERE sal in(2850, 3000, 5000);

SELECT * FROM EMP e 
WHERE sal in(SELECT MAX(sal) FROM EMP e 
GROUP BY deptno);

SELECT *FROM (SELECT * FROM emp WHERE deptno = 10) e10, dept d
WHERE e10.DEPTNO = d.DEPTNO ;

SELECT job, COUNT(*) FROM emp 
GROUP BY job
HAVING count(*) >= 3;

SELECT * from(
	SELECT job, COUNT(*) cnt FROM emp 
	GROUP BY job	
)
WHERE cnt >= 3;

SELECT rownum , e.*
FROM emp e;

SELECT rownum, e.*
FROM(SELECT * FROM emp ORDER BY sal ) e
WHERE ROWnum =6 -- rownum 자체가 의미가 있다
;

SELECT rownum rnum, e.*
FROM(SELECT * FROM emp ORDER BY sal ) e
WHERE rnum =6
;

SELECT * from(
SELECT rownum rnum, e.*
FROM(SELECT * FROM emp ORDER BY sal ) e
)
WHERE rnum >= 6 AND rnum <= 10;

-- sub-quary를 with에 등록해놓고 쓸 수 있다
WITH e10 AS( 
	SELECT * FROM emp WHERE deptno = 10 )
SELECT*FROM e10;	


SELECT 
	sal,
	ename,
	(SELECT 
		grade
	 FROM SALGRADE s 
	 WHERE e.sal BETWEEN losal AND hisal) grade	
FROM EMP e ;

--q1
-- comm이 null인 사원을 급여 내림차순으로 정렬

SELECT * FROM EMP e 
WHERE comm IS NULL
ORDER BY sal desc
;

-- q2
-- 급여 등급 별 사원 수를 등급 오름차순으로 정렬
-- 출력결과: 등급, 몇명
SELECT grade, count(*) AS count FROM EMP e , salgrade sa
WHERE sal >= sa.LOSAL AND sal <= sa.HISAL 
GROUP BY grade
ORDER BY grade;

--q3
-- 출력: 이름, 급여, 급여 등급, 부서 이름
-- 급여 등급 3 이상, 급여등급 내림 차순
-- 급여 등급이 같은 경우 급여 내림 차순

SELECT e.ename, e.sal, sa.grade, e.deptno
FROM emp e join SALGRADE sa on(sal >= sa.LOSAL AND sal <= sa.HISAL )LEFT OUTER JOIN dept d ON (e.deptno = d.deptno)
WHERE sa.GRADE >=3
ORDER BY grade desc, sal desc;


--q4 
-- 부서명이 sales인 사원 중
-- 급여 등급이 2 또는 3인 사원 급여를 내림차순으로 정렬

SELECT sal, dname, ename FROM EMP e JOIN SALGRADE sa on(sal >= sa.LOSAL AND sal <= sa.HISAL ) LEFT OUTER JOIN dept d ON (e.deptno = d.deptno)
WHERE d.DNAME = 'SALES' AND (grade =2 OR grade = 3)
ORDER BY sal desc;


-- book1
SELECT e.job, e.empno, e.ename, e.sal, e.deptno,dname FROM EMP e , dept d, 
(SELECT * FROM EMP e WHERE ename = 'ALLEN') e10
WHERE e.deptno = d.deptno AND e.job =e10.job
ORDER BY e.sal desc;

--book2
SELECT empno, ename, dname, to_char(hiredate, 'yy/mm/dd'), loc, sal, grade 
FROM emp e LEFT OUTER join DEPT d ON (e.DEPTNO =d.deptno), salgrade, (SELECT avg(sal) AS a FROM emp e)
WHERE sal >= losal AND sal<= hisal AND sal > a
ORDER BY sal DESC, empno asc;


--book3
SELECT empno, ename, job, e.deptno, dname,loc 
FROM emp e, dept d 
WHERE e.DEPTNO =d.DEPTNO 
and  e.deptno =10 
and e.job NOT in (SELECT job FROM  emp e 
	WHERE e.deptno =30); 

SELECT job FROM  emp e 
	WHERE e.deptno =10
	GROUP BY job;

SELECT job FROM  emp e 
	WHERE e.deptno =30
	GROUP BY job;


--book4

SELECT * FROM EMP e 
WHERE job = 'SALESMAN'; --잡이 salesman

SELECT max(sal) FROM (SELECT * FROM EMP WHERE job = 'SALESMAN'); -- job이 세일즈맨 중에 제일 sal이 높은 사람

SELeCT empno,ename,sal,grade FROM emp,SALGRADE
WHERE sal between losal AND hisal and
	sal > (SELECT max(sal) FROM (SELECT * FROM EMP WHERE job = 'SALESMAN')); -- job이 세일즈맨 중에 제일 sal이 높은 사람보다 sal이 높은 사람 

SELeCT empno,ename,sal,grade FROM emp,SALGRADE
WHERE sal>=losal AND sal<=hisal and
	sal > (SELECT max(sal) FROM emp WHERE job = 'SALESMAN'); -- job이 세일즈맨 중에 제일 sal이 높은 사람보다 sal이 높은 사람 






DESC emp;
SELECT * FROM emp;

CREATE TABLE emp_dd1 (
	empno number(4),
	ename varchar2(10),
	job varchar2(9),
	mgr number(4),
	hiredate DATE,
	sal number(7, 2),
	comm number(7,2),
	deptno number(2)
);

SELECT * FROM emp_dd1;

CREATE TABLE dept_dd2
AS SELECT * FROM dept;

SELECT * FROM dept_dd2;

CREATE TABLE emp_dd1_30 
AS SELECT * FROM emp WHERE deptno = 30;
SELECT * FROM emp_dd1_30;

CREATE TABLE empdept_ddl
AS 
SELECT empno, ename, job AS job2, d.deptno, dname FROM emp e, dept d
WHERE 1<> 1;
SELECT * FROM empdept_ddl;

CREATE TABLE emp_alter
AS SELECT * FROM emp;

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
ADD hp varchar2(20);

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
RENAME column hp TO tel;

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
MODIFY empno number(5);

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
DROP COLUMN tel;
-- 크기는 늘어나는 경우만 가능, 줄어들지 못함
-- 다른 타입으로 변경할 때는 null만 가능하다.




SELECT * FROM emp_alter;

RENAME emp_alter TO emp_rename;
SELECT * FROM emp_rename;

TRUNCATE TABLE emp_rename;

DROP TABLE emp_rename;



-----------------------
--10장
----------------------
create TABLE dept_temp AS SELECT * FROM dept;

SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, dname, loc)
VALUES (50, 'DATABASE', 'SEOUL');



SELECT * FROM dept_temp;
INSERT INTO dept_temp (deptno, dname, loc)
VALUES (60, null, 'SEOUL'); -- NULL 넣는 명시적인 방법

SELECT * FROM dept_temp;
INSERT INTO dept_temp 
VALUES (70, 'NETWORK', 'BUSAN');

SELECT * FROM dept_temp;

INSERT INTO DEPT_temp
VALUES (80, 'MOBILE', '');
SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, loc)
VALUES (90, 'INCHEON'); -- NULL 넣는 암시적인 방법
SELECT * FROM dept_temp; 

CREATE TABLE EMP_TEMP
AS SELECT * FROM EMP WHERE 1<>1;

SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (9999,'홍길동', '2026/01/27');

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (9999,'홍길동', '2026-01-27');
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (7051, '최민수', to_date('2026-01-27', 'yyyy-mm-dd'));

SELECT * FROM emp_temp;

INSERT INTO emp_temp(empno, ename, hiredate)
VALUES (3111, '심청이', sysdate);

SELECT * FROM emp_temp;

INSERT INTO emp_temp 
SELECT * FROM emp WHERE deptno = 10;

SELECT * FROM emp_temp;


INSERT ALL 
INTO emp_temp (empno, ename, hiredate)
	VALUES (3112, '심청이2', sysdate)
INTO emp_temp (empno, ename, hiredate)
	VALUES (3113, '심청이3', sysdate)
SELECT * FROM dual;

SELECT * FROM emp_temp;


----------------------
--update
---------------------

CREATE TABLE dept_temp2
AS SELECT * FROM dept;
SELECT *FROM dept_temp2;

UPDATE dept_temp2
SET loc = 'SEOUL';

SELECT *FROM dept_temp2;
ROLLBACK;
SELECT *FROM dept_temp2;

-- update, delete 실행하기 전에 where를 무조건 검증해보기!!
-- select로 확인하기
SELECT * FROM dept_temp2
WHERE deptno = 40;

UPDATE dept_temp2
SET dname = 'DATABASE', loc = 'SEOUL'
WHERE deptno = 40;

SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET dname = (SELECT dname from dept WHERE deptno = 40 ),
loc = (SELECT loc FROM dept WHERE deptno = 40)
WHERE deptno = 40;

SELECT * FROM dept_temp2;

CREATE TABLE EMP_TMP AS SELECT *FROM emp;
SELECT * FROM EMP_Tmp;

SELECT sal, sal * 1.08 FROM EMP_TMP
WHERE sal < 1000;

UPDATE EMP_Tmp SET sal = sal *1.08 WHERE sal<1000;

SELECT * FROM emp_tmp 
WHERE ename IN ('SMITH','JAMES');

create TABLE emp_temp2 
AS SELECT * FROM emp;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';

SELECT * FROM EMP_TEMP2;

DELETE FROM emp_temp2;

SELECT * FROM EMP_TEMP2;

ROLLBACK;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';

SELECT * FROM EMP_TEMP2;

COMMIT;
SELECT * FROM EMP_TEMP2;

---------------
--13장
----------------

SELECT * FROM dict;
SELECT * FROM user_tables;

-----------
--index
-----------
CREATE INDEX idx_emp_salALTER 
ON emp (sal asc);

SELECT * from user_indexes;
SELECT * FROM user_ind_columns;

SELECT  /*+ index(e idx_emp_salALTER) */ -- 강제 힌트	
	ename, sal 
FROM emp e
WHERE sal = 3000;

DROP INDEX idx_emp_salALTER ;
SELECT * from user_indexes;

CREATE VIEW vw_emp20
AS (SELECT empno, ename, job, deptno
	FROM emp
	WHERE deptno =20);

SELECT * FROM vw_emp20;
SELECT * FROM vw_emp20
WHERE job = 'CLERK';

CREATE TABLE dept_seq
AS SELECT * FROM dept 
WHERE 1 != 1;

SELECT * FROM dept_seq

CREATE SEQUENCE seq_dept

--
SELECT * FROM user_sequence;
-- 다음 값
SELECT seq_dept.nextval FROM dual;
SELECT seq_dept.nextval FROM dual; 
-- 현재값
-- 생성 후에 nextval 한번은 실행하고 나서
-- currval 사용 가능
SELECT seq_dept.currval FROM dual; 

CREATE SEQUENCE seq_dept_10_
START WITH 10
INCREMENT BY 10;

SELECT seq_dept_10_.currval FROM dual;
SELECT seq_dept_10_.nextval FROM dual;
SELECT seq_dept_10_.nextval FROM dual;
SELECT seq_dept_10_.currval FROM dual;

INSERT INTO dept_seq(deptno, dname, loc)
VALUES (seq_dept_10_.nextval, 'database', 'seoul');

SELECT * FROM dept_seq;

INSERT INTO dept_seq(deptno, dname, loc)
VALUES (seq_dept_10_.nextval, 'database2', 'seoul2');

-----------
-- 제약 조건
-------------
-- 방법1
-- primary key를 두 개 이상 줄 수 없다
CREATE TABLE table_pk (
	login_id varchar2(20) PRIMARY KEY,
	login_pw varchar2(20) NOT NULL,
	tel varchar2(20)
);
SELECT * FROM table_pk;
-- pk를 지정하면 index 자동 생성
SELECT *  FROM user_indexes;

INSERT INTO table_pk 
VALUES ('id1', 'pw1', null);

--id 중복
INSERT INTO table_pk 
VALUES ('id1', 'pw1', null);
-- not null에 null 추가
INSERT INTO table_pk 
VALUES ('id2', null, null);
INSERT INTO table_pk(login_id)
VALUES ('id3');
INSERT INTO table_pk(login_id)
VALUES (null);
SELECT * FROM table_pk;

--pk나 not null을 null로 변경
UPDATE table_pk SET login_id = NULL
WHERE login_id = 'id1';

INSERT INTO table_pk 
VALUES ('id2', 'pw2', null);
SELECT * FROM table_pk;
-- pk를 중복되는 값으로 변경
UPDATE table_pk SET login_id = 'id1'
WHERE login_id = 'id2';

-- 방법2
-- pk 하나 이상 지정 가능
CREATE TABLE table_pk2 (
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20),
	
	PRIMARY KEY(login_id, login_pw)
);

SELECT * FROM table_pk2;

-- 방법 3
CREATE TABLE table_pk3 (
	login_id varchar2(20) ,
	login_pw varchar2(20) ,
	tel varchar2(20)
);

ALTER TABLE table_pk3
ADD PRIMARY key(login_id, login_pw);

ALTER TABLE table_pk3
MODIFY login_id PRIMARY KEY;

--foreign key 

CREATE TABLE dept_fk(
	deptno number(2) PRIMARY KEY,
	dname varchar2(14),
	loc varchar2(13)
);

CREATE TABLE emp_fk(
	empno number(4) PRIMARY KEY,
	ename varchar2(10),
	deptno number(2) REFERENCES dept_fk(deptno)
);

-- null 됨
INSERT INTO emp_fk
VALUES (1,'이름', null);

-- 없는 값은 안됨
INSERT INTO emp_fk
VALUES (2,'이름', 1);


INSERT INTO dept_fk
VALUES (10, '부서', '위치');
SELECT * FROM dept_fk;

INSERT INTO emp_fk
VALUES (2,'이름2', 10);

INSERT INTO emp_fk
VALUES (3,'이름3', 10);

SELECT * FROM emp_fk;

UPDATE emp_fk
SET deptno =20
WHERE deptno = 10;

-- 참조하고 있는 원본 값 삭제 불가
DELETE dept_fk
WHERE deptno = 10;

DROP TABLE dept_fk;

UPDATE dept_fk
SET deptno = 20
WHERE deptno = 10;


TRUNCATE table dept_fk;

DELETE emp_fk
WHERE deptno = 10;

UPDATE dept_fk
SET deptno =20
WHERE deptno = 10;

SELECT * FROM dept_fk;
COMMIT;

-- 2번째 방법
CREATE TABLE emp_fk2 (
	deptno number(4), deptno number(2) 
	FOREIGN KEY (deptno) REFERENCES dept(deptno);
)

CREATE TABLE emp_fk3 (
	deptno number(4), deptno number(2) 
	
)
ALTER TABLE emp_fk3
ADD FOREIGN KEY (deptno) REFERENCES dept(deptno);



SELECT * FROM emp;





CREATE TABLE customer (
    sequence10    number(5)    NULL,
    caddress      varchar2(20) NULL,
    cphonenumber  varchar2(20) NULL
);

CREATE TABLE store (
    sequence     number(5)    NULL,
    name         varchar2(20) NULL,
    phonenumber  varchar2(20) NULL,
    address      varchar2(20) NULL
);

CREATE TABLE ordered_menu (
    numbers           number(3) NULL,
    sequence2        number(5) NULL,
    detailsequence   number(5) NULL
);

CREATE TABLE detail (
    detailsequence   number(5) NULL,
    delivery_option  number(1) NULL, -- 공백은 언더바로 대체하는 것이 안전합니다
    sequence10       number(5) NULL
);

CREATE TABLE menu (
    sequence2  number(5)    NULL,
    menu       varchar2(20) NULL,
    sequence   number(5)    NULL
);

ALTER TABLE customer ADD CONSTRAINT PK_CUSTOMER PRIMARY KEY (
    sequence10
);

ALTER TABLE store ADD CONSTRAINT PK_STORE PRIMARY KEY (
    sequence
);

ALTER TABLE detail ADD CONSTRAINT PK_DETAIL PRIMARY KEY (
    detailsequence
);

ALTER TABLE menu ADD CONSTRAINT PK_MENU PRIMARY KEY (
    sequence2
);

