-- 코드를 입력하세요
SELECT FOOD_TYPE, rest_id, rest_name, FAVORITES
from rest_info 
where FAVORITES in (select max(FAVORITES) FROM rest_info GROUP BY FOOD_TYPE)
group by FOOD_TYPE
order by FOOD_TYPE desc;