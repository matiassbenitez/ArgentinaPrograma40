////Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
////La variable A, debe terminar con el valor de la variable B.

Algoritmo intercambio
	
	definir a, b como entero
	
	escribir "Ingrese el valor de la variable a: "
	leer a
	escribir "Ingrese el valor de la variable b: "
	leer b
	
	intercambiar(a, b)
	
	escribir "El valor de la variable a es: " a
	escribir "El valor de la variable b es: " b
	
FinAlgoritmo

SubProceso intercambiar(a por referencia, b por referencia)
	definir aux como entero
	aux = a
	a = b
	b = aux
FinSubProceso
	