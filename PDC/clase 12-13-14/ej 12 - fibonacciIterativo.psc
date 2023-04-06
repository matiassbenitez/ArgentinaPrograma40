////Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La sucesión de Fibonacci es la sucesión de los siguientes números:
////	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
////Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
////	La sucesión del número 2 se calcula sumando (1+1)
////	Análogamente, la sucesión del número 3 es (1+2),
////	Y la del 5 es (2+3),
////	Y así sucesivamente?
////La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
////	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
////	Fibonacci (n) = 1 para todo n <= 1
////Por lo tanto, si queremos calcular el término "n" debemos escribir una función que reciba
////como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.

Algoritmo fibonacciIterativo
	
	definir n Como Entero
	
	escribir "Ingrese el número de término de la sucesión de Fibonacci a calcular: "
	leer n
	
	escribir "El " "º témino de la sucesión de Fibonacci es: " fibo(n)
	
FinAlgoritmo

Funcion num <- fibo(n)
	definir num, pri, seg,i Como Entero
	
	pri = 1
	seg = 1
	si n == 1 O n == 2 Entonces
		num = 1
	SiNo
		para i=1 hasta n-2 Hacer
			num = pri + seg
			pri = seg
			seg = num
		FinPara
	FinSi
FinFuncion
	