///Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
///En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni impar".
///Nota: investigar la funci�n mod de PSeInt


Algoritmo parImpar
	definir num Como Entero
	escribir "Ingrese un n�mero: "
	leer num
	si num <> 0 entonces
		si (num MOD 2) == 0 Entonces
			escribir "El n�mero ingresado es PAR."
		SiNo
			escribir "El n�mero ingresado es IMPAR."
		FinSi
	SiNo
		escribir "El n�mero no es par ni impar."
	FinSi
	
FinAlgoritmo