# Write your MySQL query statement below

select EmployeeUNI.unique_id, Employees.name from EmployeeUNI 
right join Employees on Employees.id=EmployeeUNI.id;
