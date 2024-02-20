-- 코드를 입력하세요
SELECT a.name, a.datetime
from ANIMAL_INS a 
left join ANIMAL_OUTS ao
on a.animal_id = ao.animal_id
where ao.animal_id is null
order by 2 limit 3;