# -- 코드를 입력하세요
SELECT USED_GOODS_USER.USER_ID,NICKNAME,TOTAL_SALES
FROM USED_GOODS_USER 
JOIN (
    SELECT WRITER_ID AS USER_ID,SUM(PRICE) AS TOTAL_SALES
    FROM USED_GOODS_BOARD
    GROUP BY USER_ID,STATUS
    HAVING STATUS='DONE'
    ORDER BY USER_ID,STATUS ASC
) AS A
USING (USER_ID)
WHERE TOTAL_SALES>=700000
ORDER BY A.TOTAL_SALES ASC;






