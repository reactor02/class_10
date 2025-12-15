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