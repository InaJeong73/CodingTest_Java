SELECT COUNT(*) AS FISH_COUNT,FISH_NAME 
FROM FISH_INFO 
LEFT JOIN(SELECT FISH_TYPE,FISH_NAME FROM FISH_NAME_INFO) AS A
USING (FISH_TYPE)
GROUP BY FISH_NAME
ORDER BY COUNT(*) DESC;