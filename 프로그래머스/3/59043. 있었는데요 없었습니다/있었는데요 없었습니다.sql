-- 코드를 입력하세요
SELECT a.animal_id, a.name
from ANIMAL_INS a 
left join ANIMAL_OUTS ao
on a.animal_id = ao.animal_id
where a.datetime > ao.datetime
order by a.datetime;