-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, if(sex_upon_intake like "%intact%","X","O") AS "중성화"
from animal_ins 
ORDER BY ANIMAL_ID;