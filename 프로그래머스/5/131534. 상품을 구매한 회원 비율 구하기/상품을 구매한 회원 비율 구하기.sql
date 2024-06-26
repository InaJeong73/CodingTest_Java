SELECT 
    YEAR(S.SALES_DATE) AS YEAR,
    MONTH(S.SALES_DATE) AS MONTH,
    COUNT(DISTINCT S.USER_ID) AS PURCHASED_USERS,
    ROUND(COUNT(DISTINCT S.USER_ID) / (SELECT COUNT(*) FROM USER_INFO WHERE YEAR(JOINED)=2021 ), 1) AS PURCHASED_RATIO
FROM 
    ONLINE_SALE S
JOIN 
    USER_INFO U ON S.USER_ID = U.USER_ID
WHERE 
    YEAR(U.JOINED) = 2021
GROUP BY 
    YEAR(S.SALES_DATE), MONTH(S.SALES_DATE)
ORDER BY 
    YEAR(S.SALES_DATE), MONTH(S.SALES_DATE);  -- ORDER BY 절에서 YEAR와 MONTH를 명시적으로 지정합니다.
