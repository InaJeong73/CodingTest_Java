SELECT  COUNT(*) AS COUNT
FROM ECOLI_DATA 
WHERE GENOTYPE&0b0010=0
AND (GENOTYPE&0b0100>0
OR GENOTYPE&0b0001>0);
