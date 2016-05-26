-- CUENTA
chr_cuencodigo
chr_monecodigo

-- MOVIMIENTO
chr_cuencodigo
int_movinumero
dtt_movifecha
chr_emplcodigo
chr_tipocodigo
dec_moviimporte
chr_cuenreferencia

-- MONEDA
chr_monecodigo
vch_monedescripcion

-- TIPOMOVIMIENTO

chr_tipocodigo
vch_tipodescripcion
vch_tipoaccion
vch_tipoestado


select 
	me.vch_monedescripcion moneda,
	sum(case when tm.vch_tipoaccion='INGRESO' 
		then dec_moviimporte else 0 end) ingresos,
	sum(case when tm.vch_tipoaccion='SALIDA' 
		then dec_moviimporte else 0 end) salida,
	sum(dec_moviimporte * case when tm.vch_tipoaccion='SALIDA' 
		then -1 else 1 end) saldo
from moneda me
join cuenta cu on me.chr_monecodigo = cu.chr_monecodigo
join movimiento mv on cu.chr_cuencodigo = mv.chr_cuencodigo
join tipomovimiento tm on mv.chr_tipocodigo = tm.chr_tipocodigo
group by me.vch_monedescripcion;

