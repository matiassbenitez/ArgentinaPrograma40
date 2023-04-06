Algoritmo ficonacciRecursivo
	
	definir n Como Entero
	escribir "Ingrese n: "
	leer n
	escribir "El " n "º término de la sucesión de Fibonacci es: " fibo(n)
	
FinAlgoritmo

Funcion num <- fibo(n)
	definir num Como Entero
	
	si n==1 O n==2 Entonces
		num = 1
	SiNo
		num = fibo(n-1) + fibo(n-2)
	FinSi
FinFuncion
