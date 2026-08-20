# Write your MySQL query statement below
select name as customers from Customers where Id not in(select customerId from Orders);