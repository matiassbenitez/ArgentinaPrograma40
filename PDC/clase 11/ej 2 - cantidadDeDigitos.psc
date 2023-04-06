////Escribir un programa que lea un número entero y devuelva el número de dígitos que
////componen ese número. Por ejemplo, si introducimos el número 12345, el programa
////deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
////de división. Nota: recordar que las variables de tipo entero truncan los números o
////resultados.

Algoritmo cantidadDeDigitos
	
	definir n, cont Como Entero
	
	escribir "Ingrese un número: "
	leer n
	cont = 0
	
	mientras n<>0 Hacer
		n=trunc(n/10)
		cont = cont +1
		escribir n
	FinMientras
	
	escribir "El número ingresado tiene " cont " dígitos."
	
FinAlgoritmo
