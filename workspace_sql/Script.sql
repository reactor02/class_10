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
WHERE deptno = 30 AND job = 'SALESMAN'

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
SELECT LENGTH('한글'), length()
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
ORDER BY hiredate

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


--q3 연습
SELECT hiredate,
	to_char(hiredate, 'yyyy/mm/dd'), 
	to_char(ADD_MONTHS(hiredate, 3), 'yyyy-mm-dd') AS r_job
FROM emp;


substr(a, b, c)
