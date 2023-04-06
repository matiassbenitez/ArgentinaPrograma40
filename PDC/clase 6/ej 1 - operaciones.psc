Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	Definir opci Como Caracter
	
	Escribir "Ingrese el primer número: "
	Leer num1
	Escribir "Ingrese el segundo número: "
	Leer num2
	Escribir "que operación quiere realizar? S/s para la suma, R/r para la resta, M/m para la multiplicación o D/d para la división)"
	Leer opci
	
	Segun opci Hacer
		'S', 's':
			Escribir " La suma de los números es: " num1 + num2
		'R', 'r':
			Escribir " La resta de los números es: " num1 - num2
		'M', 'm':	
			Escribir " La multiplicación de los números es: " num1 * num2
		'D', 'd':	
			Escribir " La división de los números es: " num1 / num2	
		De Otro Modo:
			Escribir "opción inválida"
	Fin Segun
FinAlgoritmo
