///Realizar un programa que pida un número y determine si ese número es par o impar.
///Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
///número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
///la función mod de PseInt.

Algoritmo parImpar
	definir num Como Entero
	escribir "Ingrese un número: "
	leer num
	
	si (num MOD 2) == 0 Entonces
		escribir "El número ingresado es PAR."
	SiNo
		escribir "El número ingresado es IMPAR."
	FinSi
FinAlgoritmo
