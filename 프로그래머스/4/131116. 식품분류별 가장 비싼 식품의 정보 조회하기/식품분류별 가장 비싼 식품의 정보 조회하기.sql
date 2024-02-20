-- 코드를 입력하세요
-- SELECT CATEGORY, max(price) as MAX_PRICE, PRODUCT_NAME
-- from FOOD_PRODUCT 
-- where category in('과자','국','김치','식용유')
-- group by category
-- order by PRICE desc;

SELECT CATEGORY, max(price) as MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT 
where price in (select max(price) from FOOD_PRODUCT 
             group by category)
and category in('과자','국','김치','식용유')
group by category 
order by PRICE desc;