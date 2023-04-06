////Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
////comprendidos entre 1 y 100. 


Algoritmo multiplos
	
	definir i, cont como entero
	
	cont = 0
	
	para i=1 hasta 100 Hacer
		si i MOD 2 == 0 O i MOD 3 == 0 Entonces
			cont = cont +1
		FinSi
	FinPara
	
	escribir "La cantidad número múltiplos de 2 o de 3 enrte 1 y 100 son: " cont
	
FinAlgoritmo
