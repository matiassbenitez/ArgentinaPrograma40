////Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
////Ejemplo: 25 = 2 + 5 = 7
////Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
////resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

Algoritmo sumaDigitos
	
	definir num como entero
	
	escribir "Ingrese el n�mero al cu�l le desee sumar los d�gitos: "
	leer num
	
	escribir sumarDigitos(num)
	
FinAlgoritmo

funcion suma <- sumarDigitos(num) // ver para dar vuelta la respuesta, sale la suma de los numeros invertidos, la l�gica est� bien (concatenar??)
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