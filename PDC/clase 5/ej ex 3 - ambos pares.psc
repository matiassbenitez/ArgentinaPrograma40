/// Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
///	impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares" siempre
///	y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el siguiente
///	mensaje "Los n�meros no son pares, o uno de ellos no es par".

Algoritmo ambosPares
	
	definir n1, n2 como entero
	
	escribir "Ingrese 2 n�meros enteros: "
	leer n1
	leer n2
	
	si (n1 MOD 2) == 0 Entonces
		si (n2 MOD 2) == 0 Entonces
			escribir "Ambos n�meros son pares."
		SiNo
			escribir "Los n�meros no son pares, o uno de ellos no es par."
		FinSi
	SiNo
		escribir "Los n�meros no son pares, o uno de ellos no es par."
	FinSi
	
FinAlgoritmo
