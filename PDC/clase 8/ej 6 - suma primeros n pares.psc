///Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
///decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
///de los siguientes valores: 2+4+6+8+10. 

Algoritmo nNumerosPares
	
	definir pares, n, i, suma como enteros
	
	pares = 0
	suma = 0
	i = 0
	escribir "ingrese N: "
	leer n
	
	mientras n <= 0 Hacer
		escribir "N debe ser mayor a 0, vuelva a ingresarlo: "
		leer n
	FinMientras
	
	Hacer
		pares = pares + 2
		suma = suma + pares
		i = i + 1
	Mientras Que n <> i
	
	escribir "La suma de los primeros " n " números pares es: " suma 
	
FinAlgoritmo
