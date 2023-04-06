/// Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
///	impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares" siempre
///	y cuando cumplan con la condición. En caso contrario se deberá imprimir el siguiente
///	mensaje "Los números no son pares, o uno de ellos no es par".

Algoritmo ambosPares
	
	definir n1, n2 como entero
	
	escribir "Ingrese 2 números enteros: "
	leer n1
	leer n2
	
	si (n1 MOD 2) == 0 Entonces
		si (n2 MOD 2) == 0 Entonces
			escribir "Ambos números son pares."
		SiNo
			escribir "Los números no son pares, o uno de ellos no es par."
		FinSi
	SiNo
		escribir "Los números no son pares, o uno de ellos no es par."
	FinSi
	
FinAlgoritmo
