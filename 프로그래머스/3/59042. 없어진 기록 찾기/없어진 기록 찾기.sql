-- 코드를 입력하세요
SELECT oa.animal_id,oa.name
from ANIMAL_INS a 
right join ANIMAL_OUTS oa 
on a.animal_id = oa.animal_id
where a.animal_id is null 
order by 1;