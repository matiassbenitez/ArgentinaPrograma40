////Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
////invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
////deberá mostrar:
////	*****
////	****
////	***
////	**
////	*

Algoritmo trianguloInvertido
	
	definir n, m, i, j Como Entero
	
	escribir "Ingrese el tamaño del lado del triángulo: "
	leer n
	
	m = n
	
	para i = 1 hasta n Hacer
		para j = 1 hasta m Hacer
			escribir sin saltar "* "
		FinPara
		escribir ""
		m = m - 1
	FinPara
	
FinAlgoritmo
