SELECT DISTINCT H.CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
LEFT JOIN (
SELECT CAR_ID,CAR_TYPE
FROM CAR_RENTAL_COMPANY_CAR 
)C
ON H.CAR_ID=C.CAR_ID
WHERE C.CAR_TYPE='세단'&& MONTH(START_DATE)=10
ORDER BY H.CAR_ID DESC;
