-- 코드를 입력하세요
SELECT b.CATEGORY, sum(bs.sales) as TOTAL_SALES
from book b 
join BOOK_SALES bs
on b.book_id = bs.book_id
where bs.SALES_DATE like '%2022-01%'
group by b.CATEGORY
order by 1