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

-- select salary from EmployeeSalary order by salary desc limit 3;

-- select max(salary) from EmployeeSalary where salary <
-- (select max(salary) from EmployeeSalary);

-- select min(salary) as thirdHighest from 
-- (select distinct(salary) from EmployeeSalary order by salary desc limit 3) as alias;

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

























