//Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su
//diferencia, de modo que el resultado sea siempre positivo)

Algoritmo distanciaNumeros
	definir n1, n2, distancia como entero
	
	escribir "Ingrese el primer número: "
	leer n1
	escribir "Ingrese el segundo número: "
	leer n2
	
	distancia = ABS(n1-n2)
	
	escribir "La distancia entre los números es: " distancia

FinAlgoritmo
