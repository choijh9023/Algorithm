-- 코드를 입력하세요
SELECT distinct 
u.user_id,
u.nickname,
concat(u.city,' ',u.STREET_ADDRESS1,' ',u.STREET_ADDRESS2) '전체주소',
concat(substr(u.tlno,1,3),'-',substr(u.tlno,4,4),'-',substr(u.tlno,8,4)) as '전화번호'
from USED_GOODS_BOARD b 
join USED_GOODS_USER u 
on b.writer_ID = u.USER_ID
where b.writer_id in (select WRITER_ID from USED_GOODS_BOARD group by WRITER_ID having count(*)>=3)
order by u.user_id desc;