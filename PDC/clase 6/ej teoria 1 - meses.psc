///Ingresar un número del 1 ? 12 y mostrar el mes del año que corresponde, si el número ingresado
///	no es correcto mostrar un "mensaje de error".

Algoritmo meses
	definir mes Como Entero
	escribir "Ingrese el número de mes que desea imprimir: "
	leer mes
	
	segun mes Hacer
		1:
			escribir "Enero"
		2:
			escribir "Febrero"
		3:
			escribir "Marzo"
		4:
			escribir "Abril"
		5:
			escribir "Mayo"
		6:
			escribir "Junio"
		7:
			escribir "Julio"
		8:
			escribir "Agosto"
		9:
			escribir "Septiembre"
		10:
			escribir "Octubre"
		11:
			escribir "Noviembre"
		12:
			escribir "Diciembre"
		De Otro Modo:
			escribir "El numero ingresado es incorrecto."
	FinSegun
FinAlgoritmo
