SELECT SCORE,A.EMP_NO,EMP_NAME,POSITION,EMAIL
FROM HR_EMPLOYEES A
LEFT JOIN (
    SELECT EMP_NO,SUM(SCORE) AS SCORE
    FROM HR_GRADE 
    GROUP BY EMP_NO
    ORDER BY SUM(SCORE)
    ) B
USING (EMP_NO)
ORDER BY SCORE DESC
LIMIT 1;


