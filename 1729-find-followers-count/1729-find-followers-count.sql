# Write your MySQL query statement below
SELECT USER_ID,COUNT(*) AS FOLLOWERS_COUNT
FROM FOLLOWERS
GROUP BY USER_ID
ORDER BY USER_ID ASC;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna