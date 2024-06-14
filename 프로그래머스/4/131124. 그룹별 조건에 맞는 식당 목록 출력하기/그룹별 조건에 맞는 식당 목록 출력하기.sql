SET @MAX_COUNT=(SELECT COUNT(*) AS MAX_COUNT 
FROM REST_REVIEW 
GROUP BY MEMBER_ID
ORDER BY MAX_COUNT DESC
LIMIT 1);

SELECT MEMBER_NAME,REVIEW_TEXT,DATE_FORMAT(REVIEW_DATE,'%Y-%m-%d') AS REVIEW_DATE
FROM REST_REVIEW R
LEFT JOIN (
    SELECT R.MEMBER_ID,MEMBER_NAME,COUNT(*) AS REVIEW_COUNT
FROM REST_REVIEW R
LEFT JOIN MEMBER_PROFILE P
ON R.MEMBER_ID=P.MEMBER_ID
GROUP BY R.MEMBER_ID
) P ON R.MEMBER_ID=P.MEMBER_ID
WHERE REVIEW_COUNT=@MAX_COUNT
ORDER BY REVIEW_DATE,REVIEW_TEXT ASC;











