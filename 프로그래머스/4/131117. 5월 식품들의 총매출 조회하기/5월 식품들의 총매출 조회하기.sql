SELECT O.PRODUCT_ID,PRODUCT_NAME,PRICE*AMOUNT AS TOTAL_SALES
FROM (SELECT PRODUCT_ID,SUM(AMOUNT) AS AMOUNT FROM FOOD_ORDER 
      WHERE PRODUCE_DATE LIKE '2022-05-%' GROUP BY PRODUCT_ID)O
JOIN(SELECT PRODUCT_ID,PRODUCT_NAME,PRICE FROM FOOD_PRODUCT)P
ON O.PRODUCT_ID=P.PRODUCT_ID
ORDER BY TOTAL_SALES DESC,PRODUCT_ID ASC;

