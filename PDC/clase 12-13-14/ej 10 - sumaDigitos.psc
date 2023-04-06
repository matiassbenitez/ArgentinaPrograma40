////Realizar una función que calcule la suma de los dígitos de un número.
////Ejemplo: 25 = 2 + 5 = 7
////Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
////resto de una división entre 10. Recordar el uso de la función Mod y Trunc.

Algoritmo sumaDigitos
	
	definir num como entero
	
	escribir "Ingrese el número al cuál le desee sumar los dígitos: "
	leer num
	
	escribir sumarDigitos(num)
	
FinAlgoritmo

funcion suma <- sumarDigitos(num) // ver para dar vuelta la respuesta, sale la suma de los numeros invertidos, la lógica está bien (concatenar??)
	escribir sin saltar num " = "
	definir suma Como Entero
	suma = 0
	mientras num>0 Hacer
		suma = suma + (num MOD 10)
		escribir sin saltar (num MOD 10)
		si num>9 Entonces
			escribir sin saltar " + "
		FinSi
		num = trunc(num/10)
	FinMientras
	escribir sin saltar " = "
	
FinFuncion