//Pide al usuario dos n�meros y muestra la "distancia" entre ellos (el valor absoluto de su
//diferencia, de modo que el resultado sea siempre positivo)

Algoritmo distanciaNumeros
	definir n1, n2, distancia como entero
	
	escribir "Ingrese el primer n�mero: "
	leer n1
	escribir "Ingrese el segundo n�mero: "
	leer n2
	
	distancia = ABS(n1-n2)
	
	escribir "La distancia entre los n�meros es: " distancia

FinAlgoritmo
