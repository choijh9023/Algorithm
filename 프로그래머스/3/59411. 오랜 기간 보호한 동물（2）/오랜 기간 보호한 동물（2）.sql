-- 코드를 입력하세요
SELECT ao.animal_id, ao.name
from ANIMAL_INS a 
join ANIMAL_OUTS ao
on a.animal_id = ao.animal_id
order by DATEDIFF(ao.DATETIME,a.DATETIME) desc limit 2;