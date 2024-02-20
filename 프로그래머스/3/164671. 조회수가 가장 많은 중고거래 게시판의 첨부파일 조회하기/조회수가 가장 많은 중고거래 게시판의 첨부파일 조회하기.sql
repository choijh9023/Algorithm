-- 코드를 입력하세요
SELECT concat('/home/grep/src/',b.board_id,'/',f.FILE_ID,f.FILE_NAME,f.FILE_EXT) as FILE_PATH
from USED_GOODS_BOARD b 
join USED_GOODS_FILE f 
on b.board_id=f.board_id
where VIEWS in(select max(views)from USED_GOODS_BOARD)


order by f.FILE_ID desc;