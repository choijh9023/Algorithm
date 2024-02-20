-- 코드를 입력하세요
SELECT id, name, HOST_ID
from PLACES
where host_id in(select host_id from PLACES where host_id 
                group by host_id having count(*)>=2)