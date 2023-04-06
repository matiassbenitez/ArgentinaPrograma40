////Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
////muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arreglo.

Algoritmo vectores
	definir vector, i, suma, resta, multiplicacion Como Real
	dimension vector[10]
	suma = 0
	resta = 0
	multiplicacion = 1
	para i = 0 hasta 9 Hacer
		leer vector[i]
	FinPara
	
	para i = 0 hasta 9 Hacer
		suma = suma + vector[i]
		resta = resta - vector[i]
		multiplicacion = multiplicacion * vector[i] 
	FinPara
	
	escribir "Suma = " suma
	escribir "Resta = " resta
	escribir "Multiplicación = " multiplicacion
	
FinAlgoritmo
