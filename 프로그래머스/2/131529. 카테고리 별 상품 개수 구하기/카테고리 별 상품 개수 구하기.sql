select LEFT(PRODUCT_CODE, 2) as CATEGORY, count(*)
from PRODUCT
group by LEFT(PRODUCT_CODE, 2)
order by CATEGORY asc;