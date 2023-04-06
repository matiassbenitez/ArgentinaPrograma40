////Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente
////y el resto utilizando el método de restas sucesivas.
////El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
////obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
////realizadas es el cociente. Por ejemplo: 50 / 13:
////		50 - 13 = 37 una resta realizada
////		37 - 13 = 24 dos restas realizadas
////		24 - 13 = 11 tres restas realizadas
////	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo restas_sucesivas
	Definir n1, n2, aux Como entero
	
	Escribir "Ingresar los numeros que desea utilizar "
	leer n1, n2
	
	Si n2 > n1 Entonces
		division(n1,n2,aux)
		sino division(n2,n1,aux)
	FinSi
	
FinAlgoritmo

SubProceso division(n1 Por Referencia,n2 Por Referencia, aux por referencia)
	
	aux = 0
	Mientras n2 >= n1 Hacer
		n2 = n2-n1
		aux = aux + 1
	FinMientras
	
	Escribir "El residuo es " n2
	Escribir "El numero de restas realizadas es " aux
	FinSubProceso
	