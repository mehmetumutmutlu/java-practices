SELECT COUNT(*) FROM film GROUP BY rating;

SELECT COUNT(*) FROM film GROUP BY replacement_cost HAVING COUNT(replacement_cost) > 50;

SELECT COUNT(*) FROM customer GROUP BY store_id;

SELECT country_id, COUNT(*) FROM city GROUP BY country_id;