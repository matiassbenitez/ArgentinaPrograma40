//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//		investigar la función trunc().

Algoritmo ultimo
	Definir num, contador Como Entero
	leer num
	
	contador= 0
	
	mientras num <> 0 Hacer
		num = trunc (num/10)
		contador = contador+1
		
	FinMientras
	
	Escribir contador
FinAlgoritmo
