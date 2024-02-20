-- 코드를 입력하세요 -- 
SELECT car_id ,  CASE 
                  WHEN max(START_DATE <= '2022-10-16' AND END_DATE >= '2022-10-16') THEN '대여중' 
            ELSE '대여 가능' END AS AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 

group by car_id
order by car_id desc;