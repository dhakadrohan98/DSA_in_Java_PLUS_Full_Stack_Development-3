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





























