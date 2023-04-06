////. Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
////muestre por pantalla.

Algoritmo vectores
	
	definir vector, i Como Entero
	dimension vector[5]
	
	para i = 0 hasta 4 Hacer
		leer vector[i]
	FinPara
	
	para i = 0 hasta 4
		escribir "[" vector[i] "]" Sin Saltar
	FinPara
	escribir ""
	
FinAlgoritmo
