////Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
////m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya pidiendo 
////la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
////programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo temperaturas
	
	definir n Como Entero
	escribir "Ingrese n: "
	leer n
	media(n)
	
FinAlgoritmo

SubProceso media(n)
	definir max, min como reales
	definir i Como Entero
	para i = 1 hasta n Hacer
		escribir "D�a " i ":"
		escribir "Ingrese la temperatura m�xima: "
		leer max
		escribir "Ingrese la temperatura m�nima: "
		leer min
		escribir "La temperatura media es de: " (max+min)/2
	FinPara
FinSubProceso
	