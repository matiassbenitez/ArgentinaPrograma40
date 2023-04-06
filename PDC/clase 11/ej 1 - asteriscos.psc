////Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
////ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
////	5 *****
////	3 ***
////	11 ***********
////	2 **
////	9 *********

Algoritmo asteriscos
	
	definir n, i, j Como Entero
	
	para i = 1 hasta 5 Hacer
		escribir "Ingrese el " i "º número: "
		leer n
		
		mientras n<1 O n>20 Hacer
			escribir "El número ingresado está fuera de rango. Vuelva a ingresarlo: "
			leer n
		FinMientras
		
		escribir sin saltar n " "
			
		para j=1 hasta n Hacer
			escribir sin saltar "*"
		FinPara
		escribir ""
		
	FinPara
	
FinAlgoritmo
