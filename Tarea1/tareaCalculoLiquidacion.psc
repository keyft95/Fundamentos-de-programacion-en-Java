Algoritmo CalculoLiquidacion
	Definir salarioMensual Como Real
	Definir salarioPendiente Como Real
	Definir vacacionesNoGozadas Como Real
	Definir aguinaldoProporcional Como Real
	Definir preaviso Como Real
	Definir cesantia Como Real
	Definir mesesPendientes Como Real
	Definir liquidacionTotal Como Real
	Escribir 'Digite el salario Mensual'
	Leer salarioMensual
	Escribir 'Digite la cantidad de meses pendientes'
	Leer mesesPendientes
	salarioPendiente <- salarioMensual*mesesPendientes
	vacacionesNoGozadas <- salarioMensual/30*14
	aguinaldoProporcional <- salarioMensual/12
	preaviso <- salarioMensual
	cesantia <- salarioMensual/30*20*2
	liquidacionTotal <- salarioPendiente+vacacionesNoGozadas+aguinaldoProporcional+preaviso+cesantia
	Escribir 'Salario Mensual: ',salarioMensual
	Escribir 'Vacaciones no gozadas: ',vacacionesNoGozadas
	Escribir 'Aguinaldo Proporcional: ',aguinaldoProporcional
	Escribir 'Preaviso: ',preaviso
	Escribir 'Cesantia: ',cesantia
	Escribir 'El total a liquidar es ',liquidacionTotal,' para el empleado'
FinAlgoritmo
