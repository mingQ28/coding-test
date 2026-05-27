select FLAVOR
from FIRST_HALF
group by FLAVOR
order by TOTAL_ORDER desc, SHIPMENT_ID asc;