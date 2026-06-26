# Write your MySQL query statement below
select unique_id ,name
from employees 
left join employeeUNI 
on employeeUNI.id = employees.id

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna