select ANIMAL_ID, NAME
from ANIMAL_INS
where ANIMAL_TYPE like 'Dog' and NAME like '%EL%'
order by NAME;