-- 코드를 입력하세요
SELECT month(start_date) as month , car_id,  COUNT(HISTORY_ID) AS RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where car_id in(select car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY where month(start_date) in (8,9,10)
                group by car_id having count(HISTORY_ID)>=5)
          AND MONTH(START_DATE) IN (8, 9, 10)
GROUP BY MONTH, CAR_ID
HAVING COUNT(HISTORY_ID) >= 1
ORDER BY MONTH
       , CAR_ID DESC;