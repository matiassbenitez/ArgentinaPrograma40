Algoritmo ejercicio5
	definir n, i, max Como Entero
	definir vector Como Entero
	
	escribir " ingrese un valor"
	leer n
	Dimension vector[n]
	
	para i=0 hasta n-1 Hacer
		leer vector[i] 
		
	FinPara
	max = vectorMasalto(vector,n)
	escribir "el vector de valor mas grande es: " max
FinAlgoritmo

Funcion max <- vectorMasalto (vector Por Referencia, n Por Referencia)
	Definir i, max Como Entero
	
	max=vector[0]
	para i=1 hasta n-1 Hacer
		si vector[i] > max
			max= vector[i]
		FinSi
	FinPara
	
FinFuncion
