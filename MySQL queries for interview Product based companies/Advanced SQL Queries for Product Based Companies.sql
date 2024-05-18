-- use labour;

-- create table EmployeeDetails (
--      Emp_Id int primary key,
--      FullName varchar(50) Not null,
--      ManagerId int(15) Not null,
--      DateOfJoining DATE,
--      City varchar(50)
-- );

-- INSERT into EmployeeDetails (Emp_Id, FullName, ManagerId, DateOfJoining, City)
--  VALUES (121, 'John Snow', 321, '2019/01/31', 'Tornto'),
--  (321, 'Walter White', 986, '2020/01/30' ,'California'), 
--  (421, 'Kuldeep Rana', 876, '2021/11/27', 'New Delhi'); 

-- INSERT into EmployeeDetails (Emp_Id, FullName, ManagerId, DateOfJoining, City)
--  VALUES (521, 'Sanjeet Kumar', 312, '2018/02/23', 'Taliwand'),
--  (312, 'Pranav Pankaj', 678, '2021/02/28' ,'Massachhusets'), 
--  (412, 'Ritesh Rana', 786, '2022/10/26', 'Jaipur Rajasthan');

-- Insert into EmployeeDetails VALUES 
-- (5211, 'Sanjeet Kumar', 312, '2018/02/23', 'Taliwand'),
-- (3122, 'Pranav Pankaj', 678, '2021/02/28' ,'Massachhusets'), 
-- (4122, 'Ritesh Rana', 786, '2022/10/26', 'Jaipur Rajasthan');

-- select * from employeedetails;

-- create table EmployeeSalary (
--      Emp_Id int primary key,
--      Project varchar(100) Not null,
--      Salary int(10) Not null,
--      Variable varchar(10) not null
-- );

-- INSERT into EmployeeSalary (Emp_Id, Project, Salary, Variable)
--  VALUES (121, 'P1', 8000, 500),
--  (321, 'P2', 10000, 1000), 
--  (421, 'P1', 12000, 0); 

-- INSERT into EmployeeSalary (Emp_Id, Project, Salary, Variable)
--  VALUES (521, 'P1', 80000, 5000),
--  (621, 'P2', 100000, 10000), 
--  (721, 'P2', 120000, 10000);
--  select * from EmployeeSalary;

-- select Emp_Id, FullName from EmployeeDetails
-- where ManagerId = 986;

-- select distinct(Project) from EmployeeSalary;

-- select max(salary) as maximum, min(salary) as minimum, avg(salary) as average from EmployeeSalary 
-- where Project='P1';

-- //applied Inner join//
-- select ed.Emp_id, ed.FullName, ed.ManagerId, es.salary, es.Project, es.variable 
-- from EmployeeDetails ed
-- inner join EmployeeSalary es
-- on ed.Emp_Id = es.Emp_Id;

select salary from EmployeeSalary order by salary desc limit 3;

select max(salary) from EmployeeSalary where salary <
(select max(salary) from EmployeeSalary);

select min(salary) as thirdHighest from 
(select distinct(salary) from EmployeeSalary order by salary desc limit 3) as alias;

select Project, salary from EmployeeSalary;

select max(salary), Project from EmployeeSalary group by Project;
select min(salary), Project from EmployeeSalary group by Project;

select Project, count(*) from EmployeeSalary group by Project;

SELECT ROW_NUMBER() OVER (Order By salary DESC) as row_num, Emp_Id, Project, Salary 
FROM EmployeeSalary;

select * from
(select row_number() over (order by salary desc) as rowNum, Emp_Id, Project, Salary 
from EmployeeSalary) as firstQuery
where rowNum % 2 != 0;

select FullName, count(*) as frequency 
from employeeDetails group by FullName having frequency > 1;

select FullName, count(*) as frequency 
from employeeDetails group by FullName order by frequency desc;

select FullName from EmployeeDetails where FullName like 'W%';

select FullName from EmployeeDetails where FullName like '%r';

select FullName from EmployeeDetails where FullName like '%e%';

select FullName from EmployeeDetails where FullName like '%ee%';

select FullName from EmployeeDetails where FullName not like '%e%';

select FullName from EmployeeDetails where FullName like '_________';

select FullName from EmployeeDetails where FullName like '__h___n__';

select * from EmployeeDetails;

select FullName, DateOfJoining from EmployeeDetails 
where DateOfJoining like '_____11___';

select * from EmployeeDetails where FullName like '%ee%';

select FullName from EmployeeDetails where FullName like 'K%A';

-- SQL practice for park+
-- Basic SQL queries
use corporate;
show tables;
describe employees;

select * from employees;
-- 1. Write an SQL query to fetch the EmpId and FullName of all the employees working under the
select first_name, department_id from employees where salary <= 63000;

-- 2.Write an SQL query to fetch the different projects available from the EmployeeSalary table.
select * from employeesalary;
select distinct(Project) as project from employeesalary;

-- 3.Write an SQL query to fetch the count of employees working in project ‘P1’.
select count(Emp_id) as TotalEmployees from  employeesalary 
where project = 'P1';

-- 4.Write an SQL query to find the maximum, minimum, and average salary of the employees.
select max(salary),min(salary),avg(salary) from employeesalary;

-- 5.Write an SQL query to find the employee id whose salary lies in the range of 8000 and 12000.
select * from employeesalary where salary between 8000 and 12000;

-- 6. Write an SQL query to fetch those employees who live in Toronto and/or work under the manager with ManagerId – 321.
SELECT EmpId, City, ManagerId
FROM EmployeeDetails
WHERE City='Toronto' AND/OR ManagerId='321';

-- 8. Write an SQL query to fetch all those employees who work on Projects other than P1.
select * from employeesalary where project <>'p1';
select * from employeesalary where project !='p1';
select * from employeesalary where not project = 'p1';

-- 9. Write an SQL query to display the total salary of each employee adding the Salary with Variable value.
select Emp_id, Project, (salary+variable_pay) as TotalSalary from employeesalary;

-- 10. Write an SQL query to fetch the employees whose name begins with any two characters, followed by a text “hn” and ends with any sequence of characters.
select employee_id, first_name from employees 
where first_name like '__an%';

-- 11. Write an SQL query to fetch all the EmpIds which are present in either of the tables – ‘EmployeeDetails’ and ‘EmployeeSalary’.
SELECT EmpId FROM EmployeeDetails
UNION 
SELECT EmpId FROM EmployeeSalary;

-- 12.Write an SQL query to fetch common records between two tables.
SELECT *
FROM EmployeeSalary
WHERE EmpId IN
(SELECT EmpId from ManagerSalary);



-- Q.1 Nth highest salary from employees table.
select * from employees order by salary desc;
select min(salary) from 
(select distinct(salary) from employees order by salary desc limit 5 offset 3) as subquery;

select * from employees;
-- Q.2 Departmentwise/projectwise highest salray from employeesalary table?
select max(salary), project from employeesalary group by project;

-- Q.3 count how many employee in each department?
select count(employee_id), department_id  from employees 
group by department_id; 

use corporate;
select * from employees;

-- Q.4 Display alternate(even/odd) number of records?
-- Easy query(best query if there is an column with non-negative integers)
select employee_id as emp_id, first_name, salary from
employees where mod(employee_id, 2) != 0;

-- Conceptual query
select * from
(select row_number() over (order by salary) as rowNum, employee_id, first_name, salary 
from Employees) as firstQuery
where mod(rowNum,2) <> 0;

-- Q.5 Display the name of all Employees whose name length is exactly 9
select FullName from EmployeeDetails where FullName like '____________';

-- Q.6 Display the names of employees whose name contains the 
-- (i)third letter as ‘H’
-- (ii) seventh letter as ‘N’
select FullName from EmployeeDetails where FullName like '__h%';
select FullName from EmployeeDetails where FullName like '______d%';
select FullName from EmployeeDetails where FullName like '__H___d_____';

-- Q.7 Display Nth row (2nd, 4th row) of the employee table ?
select row_number() over (order by salary desc) as rowNum, 
employee_id, first_name, department_id
from employees;

SELECT employee_id, first_name, department_id
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 1;

SELECT *
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 3;
-- For the 4th row:
-- LIMIT 1 OFFSET 3;

use corporate;
select * from Employees;
select * from EmployeeDetails;

INSERT into EmployeeDetails (Emp_Id, FullName, ManagerId, DateOfJoining, City)
VALUES(2, 'Farukh khan', 261, '1998/08/27', 'Columbia');

-- union
select * from Employees
union
select * from EmployeeDetails;

-- Employee table for appying inner joins
use employee;
show tables;
select * from departments;
Create table employee (
	empid int primary key,
	ename varchar(50) not null,
	designation varchar(25) not null,
	managerid int(15) not null,
	hiredate date not null,
	salary int(16) not null,
	deptno int(15) not null
);
describe employee;
-- Insert single employee data
Insert into employee values
(7839, 'king', 'president', 0, '1981/11/17', 5000, 10);
-- Insert mutliple employee data
Insert into employee values
(7698, 'blake', 'manager', 7839, '1981/05/01', 2850, 30),
(7782, 'clark', 'manager', 7839, '1981/06/09', 2450, 10),
(7566, 'jones', 'manager', 7839, '1981/04/02', 2975, 20),
(7788, 'scott', 'analyst', 7566, '1987/04/19', 3000, 20),
(7902, 'FORD', 'analyst', 7566, '1981/12/03', 3000, 20),
(7369, 'smith', 'clerk', 7902, '1980/12/17', 800, 20);
select * from employee;
-- Inner joins problems:

-- 1.How to find which employee is an manager of which employee from employee table(having EmpNo, Ename, designation, managerId, hiredate, salary, departmentNo) ? 
SELECT e1.Ename AS employee,  m2.Ename AS manager 
FROM employee e1
INNER JOIN employee m2 ON e1.managerId = m2.empid;

-- 2.Display employee details who are getting more salary than their manager salary?
SELECT e1.Ename AS employeeName,  m2.Ename AS managerName, m2.salary as managerSalary
FROM employee e1
INNER JOIN employee m2 
ON e1.managerId = m2.empid and e1.salary > m2.salary;

-- 3.Display employee details who joined before their manager?
SELECT e1.Ename AS employeeName,  m2.Ename AS managerName, m2.hiredate as hireDate
FROM employee e1
INNER JOIN employee m2 
ON e1.managerId = m2.empid and e1.hiredate < m2.hiredate;

-- create department table for left, right, full & corss join
use employee;
create table department(
	deptno int(10) not null,
    dname varchar(40) not null,
    loc varchar(30) not null
);
describe department;
insert into department values
(10, 'accounting', 'New york'),
(20, 'research', 'Dallas'),
(30, 'sales', 'chicago'),
(40, 'operations', 'Boston');
select * from employee;
select * from department;
-- Left join:
select e.empid, e.ename, e.designation, e.salary, d.deptno, d.dname, d.loc
from employee e
left join department d
on e.deptno = d.deptno and d.dname = 'accounting';
-- Right join
select e.empid, e.ename, e.designation, e.salary, d.deptno, d.dname, d.loc
from employee e
right join department d
on e.deptno = d.deptno;
-- Full join
SELECT e.deptno, e.empid, e.salary,d.deptno, d.dname, d.loc
FROM employee e
FULL JOIN department d ON d.deptno = 20;
-- Equivalent sql queries to FULL JOIN (using union on left & right join)
SELECT e.deptno, e.empid, e.salary,d.deptno, d.dname, d.loc
FROM employee e
LEFT JOIN department d ON d.deptno = 20
UNION
SELECT e.deptno, e.empid, e.salary, d.deptno, d.dname, d.loc
FROM employee e
RIGHT JOIN department d ON d.deptno = 20;

select * from employee;
-- cross join
select e.empid, e.ename, d.deptno, d.dname, d.loc
from employee e
cross join department d;

-- first row or last row
select * from (
select row_number() over (order by salary) as rowNum, ename, designation, salary
from employee) as subQuery
where rowNum = 1 or rowNum = (select count(*) from employee);

-- last two or N rows of the table
select * from (
select row_number() over (order by salary) as rowNum, ename, designation, salary 
from employee) as subQuery
order by rowNum desc
limit 2;

select * from (
	select row_number() over (order by salary) as rowNum, ename, designation, salary
    from employee) as subQuery
where rowNum = 1 or rowNum > (select count(*)-2 from employee);

select distinct(salary) from employee 
order by salary desc 
limit 1 offset 2;

create database city;
use city;

create table area1(
city varchar(40) NOT NULL,
country varchar(40) NOT NULL);
Insert into area1 values('hyderabad', 'India'),
('Kolkata', 'west bengal'),
('Indore', 'Madhya pradesh');
Insert into area1 values('Dalla', 'North america');
select * from area1;

create table area2(
city varchar(40) NOT NULL,
country varchar(40) NOT NULL);
Insert into area2 values('USA', 'Texas'),
('chichago', 'Souht america'),
('Dalla', 'North america'),
('Hyderabad', 'India');
select * from area2;

-- Intersect
SELECT city, country
FROM area1
INTERSECT
SELECT city, country  
FROM area2;
 
 