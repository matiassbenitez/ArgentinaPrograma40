////Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
////invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
////deber� mostrar:
////	*****
////	****
////	***
////	**
////	*

Algoritmo trianguloInvertido
	
	definir n, m, i, j Como Entero
	
	escribir "Ingrese el tama�o del lado del tri�ngulo: "
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
