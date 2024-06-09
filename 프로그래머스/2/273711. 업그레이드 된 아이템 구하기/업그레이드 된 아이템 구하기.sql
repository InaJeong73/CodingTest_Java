-- 코드를 작성해주세요
SELECT DISTINCT ITEM_INFO.ITEM_ID,ITEM_NAME,RARITY
FROM ITEM_INFO 
JOIN ITEM_TREE 
USING(ITEM_ID)
WHERE PARENT_ITEM_ID IN (
    SELECT ITEM_ID
    FROM ITEM_INFO 
    WHERE RARITY='RARE'
    )
ORDER BY ITEM_INFO.ITEM_ID DESC;