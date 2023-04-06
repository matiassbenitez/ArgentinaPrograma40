///Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
///En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
///Nota: investigar la función mod de PSeInt


Algoritmo parImpar
	definir num Como Entero
	escribir "Ingrese un número: "
	leer num
	si num <> 0 entonces
		si (num MOD 2) == 0 Entonces
			escribir "El número ingresado es PAR."
		SiNo
			escribir "El número ingresado es IMPAR."
		FinSi
	SiNo
		escribir "El número no es par ni impar."
	FinSi
	
FinAlgoritmo