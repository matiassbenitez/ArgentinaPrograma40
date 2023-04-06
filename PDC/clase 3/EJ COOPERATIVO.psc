//Ingrese un número de tres cifras y muestra la unidad, decena y la centena.
//Por ejemplo, si el número ingresado por pantalla es 123 el programa debe mostrar:
//CENTENA: 1
//DECENA: 2
//UNIDAD: 3

Algoritmo sin_titulo
	definir num, centena, decena, unidad como real 
	escribir "ingresar numero: "
	leer num
	
	centena = trunc (num/100)
	escribir "CENTENA:", centena
	decena = trunc ((num mod 100) / 10) 
	escribir "DECENA:", decena
	unidad = num mod 10 
	escribir "UNIDAD:", unidad
FinAlgoritmo

