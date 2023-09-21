REM   Script: Activity7
REM   Perform Aggregate Operations on Orders


select sum(purchase_amount) as "Total sum" from orders;

select MAX(purchase_amount) AS "Maximum" from orders;

select avg(purchase_amount) as "Avg " from orders;

select MIN(purchase_amount) AS "Minumum" from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

