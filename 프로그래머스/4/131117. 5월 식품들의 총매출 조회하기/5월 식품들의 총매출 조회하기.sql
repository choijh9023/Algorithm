SELECT o.PRODUCT_ID,p.PRODUCT_NAME,sum(p.price*o.AMOUNT) as TOTAL_SALES
from FOOD_PRODUCT p 
join FOOD_ORDER o 
on p.PRODUCT_ID = o.PRODUCT_ID
where month(o.PRODUCE_DATE) = 5
group by p.PRODUCT_ID
order by 3 desc, 1 asc;