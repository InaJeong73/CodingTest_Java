SELECT P.CATEGORY,P.PRICE AS MAX_PRICE,PRODUCT_NAME
FROM FOOD_PRODUCT P
JOIN(SELECT CATEGORY,MAX(PRICE) AS PRICE
FROM FOOD_PRODUCT 
GROUP BY CATEGORY) M
ON M.CATEGORY=P.CATEGORY AND M.PRICE=P.PRICE
WHERE P.CATEGORY IN('과자', '국', '김치', '식용유')
ORDER BY MAX_PRICE DESC;
