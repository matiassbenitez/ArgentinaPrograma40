//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
//usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
//mostrar un mensaje por pantalla indicándolo.

Algoritmo sin_titulo
	definir actual, minimo Como Real
	escribir "Ingrese su sueldo actual: "
	leer actual
	escribir "Ingrese el sueldo mínimo: "
	leer minimo
	
	si actual>minimo Entonces
		escribir "Su sueldo actual es mayor al sueldo mínimo."
	FinSi
FinAlgoritmo
