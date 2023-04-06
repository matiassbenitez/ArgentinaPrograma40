//Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa

Algoritmo capicua
	definir num Como Entero
	
	escribir "Ingrese un número de 3 cifras: "
	leer num
	
	si trunc(num/100) == num MOD 10 Entonces
		escribir "El número ingresado es capicúa."
	FinSi
FinAlgoritmo
