-- SQL - Auction Web Service LOt Statistics
-- An auction web service needs a query that returns a list of all avaialable lots with offfers left by buyers
-- result should have the following columns 
-- name: lot name| min_offer: min offer for a specific lot| avg_offer: for specific lot rounded to 2 decimal places
-- max_offer: for specific lot,| offers : total no of offers for a specific lot
-- order by offers desc

SELECT name, MIN(amount) FROM offers WHERE lots.id = try;
-- SELECT ROUND((AVG(amount),2) FROM 
SELECT MAX(amount) FROM offers WHERE lots.id = efs;
SELECT COUNT(lot_id)

