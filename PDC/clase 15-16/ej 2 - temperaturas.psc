////Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
////máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pidiendo 
////la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
////programa pedirá el número de días que se van a introducir.

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
		escribir "Día " i ":"
		escribir "Ingrese la temperatura máxima: "
		leer max
		escribir "Ingrese la temperatura mínima: "
		leer min
		escribir "La temperatura media es de: " (max+min)/2
	FinPara
FinSubProceso
	