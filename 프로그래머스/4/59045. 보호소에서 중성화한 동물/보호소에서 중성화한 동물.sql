SELECT I.ANIMAL_ID,ANIMAL_TYPE,NAME
FROM ANIMAL_INS I
JOIN (SELECT ANIMAL_ID,SEX_UPON_OUTCOME FROM ANIMAL_OUTS ) O
ON I.ANIMAL_ID=O.ANIMAL_ID
WHERE I.SEX_UPON_INTAKE LIKE 'Intact%' AND (SEX_UPON_OUTCOME LIKE 'Spayed%' OR SEX_UPON_OUTCOME LIKE'Neutered%')
ORDER BY I.ANIMAL_ID