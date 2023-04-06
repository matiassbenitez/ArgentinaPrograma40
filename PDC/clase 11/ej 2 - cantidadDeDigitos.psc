////Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
////componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
////deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
////de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
////resultados.

Algoritmo cantidadDeDigitos
	
	definir n, cont Como Entero
	
	escribir "Ingrese un n�mero: "
	leer n
	cont = 0
	
	mientras n<>0 Hacer
		n=trunc(n/10)
		cont = cont +1
		escribir n
	FinMientras
	
	escribir "El n�mero ingresado tiene " cont " d�gitos."
	
FinAlgoritmo
