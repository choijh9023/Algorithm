-- 코드를 입력하세요
SELECT u.user_id,u.nickname,sum(price) as total_sales
from USED_GOODS_BOARD b
join USED_GOODS_USER u
on b.writer_id = u.user_id
where  b.status like '%done%'
group by user_id having sum(price)>=700000
order by total_sales;