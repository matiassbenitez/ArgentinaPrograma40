////Escribir un programa que calcule la suma de los N primeros números naturales. El valor de
////N se leerá por teclado. 

Algoritmo numerosNaturales
	
	definir n, i, suma Como Entero
	
	suma=0
	
	escribir "Ingresar n: "
	leer n
	
	para i=0 hasta n Hacer
		suma = suma + i
	FinPara
	
	escribir "La suma de los " n " primeros números naturales es: " suma
	
FinAlgoritmo
