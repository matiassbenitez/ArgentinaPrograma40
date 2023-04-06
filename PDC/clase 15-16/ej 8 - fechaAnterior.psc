////	Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
////	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha representada 
////	a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que
////	dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para los valores
////	dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo fechaAnterior
	
	definir dia, mes, anio Como Entero
	escribir sin saltar "Día: "
	leer dia
	escribir sin saltar "Mes: "
	leer mes
	escribir sin saltar "Año: "
	leer anio
	diaAnterior(dia, mes, anio)
	
	escribir "Día anterior a la fecha: " dia "/" mes "/" anio
	
FinAlgoritmo


subproceso diaAnterior(dd por referencia, mm por referencia, aaaa por referencia)
	
	si dd>1 Entonces
		dd = dd-1
	SiNo
		si mm>1 Entonces
			mm = mm-1
			segun mm Hacer
				1,3,5,7,8,10,12:
					dd = 31
				2:
					dd=28
				De Otro Modo:
					dd = 30
			FinSegun
		SiNo
			dd = 31
			mm = 12
			aaaa = aaaa-1
		FinSi
	FinSi
	
FinSubProceso
	