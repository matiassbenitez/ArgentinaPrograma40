////Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. La sucesi�n de Fibonacci es la sucesi�n de los siguientes n�meros:
////	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
////Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
////	La sucesi�n del n�mero 2 se calcula sumando (1+1)
////	An�logamente, la sucesi�n del n�mero 3 es (1+2),
////	Y la del 5 es (2+3),
////	Y as� sucesivamente?
////La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
////	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
////	Fibonacci (n) = 1 para todo n <= 1
////Por lo tanto, si queremos calcular el t�rmino "n" debemos escribir una funci�n que reciba
////como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.

Algoritmo fibonacciIterativo
	
	definir n Como Entero
	
	escribir "Ingrese el n�mero de t�rmino de la sucesi�n de Fibonacci a calcular: "
	leer n
	
	escribir "El " "� t�mino de la sucesi�n de Fibonacci es: " fibo(n)
	
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
	