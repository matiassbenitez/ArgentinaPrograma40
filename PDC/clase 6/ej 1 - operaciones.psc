Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	Definir opci Como Caracter
	
	Escribir "Ingrese el primer n�mero: "
	Leer num1
	Escribir "Ingrese el segundo n�mero: "
	Leer num2
	Escribir "que operaci�n quiere realizar? S/s para la suma, R/r para la resta, M/m para la multiplicaci�n o D/d para la divisi�n)"
	Leer opci
	
	Segun opci Hacer
		'S', 's':
			Escribir " La suma de los n�meros es: " num1 + num2
		'R', 'r':
			Escribir " La resta de los n�meros es: " num1 - num2
		'M', 'm':	
			Escribir " La multiplicaci�n de los n�meros es: " num1 * num2
		'D', 'd':	
			Escribir " La divisi�n de los n�meros es: " num1 / num2	
		De Otro Modo:
			Escribir "opci�n inv�lida"
	Fin Segun
FinAlgoritmo
