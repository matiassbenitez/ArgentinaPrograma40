//Dise�e un algoritmo que lea un n�mero de tres cifras y determine si es o no capic�a

Algoritmo capicua
	definir num Como Entero
	
	escribir "Ingrese un n�mero de 3 cifras: "
	leer num
	
	si trunc(num/100) == num MOD 10 Entonces
		escribir "El n�mero ingresado es capic�a."
	FinSi
FinAlgoritmo
