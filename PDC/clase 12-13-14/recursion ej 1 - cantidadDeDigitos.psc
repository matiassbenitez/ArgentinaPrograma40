////Escribir una funci�n recursiva que calcule y retorne la cantidad de d�gitos de un n�mero entero.
////Ejemplos de uso:
////	
////	cantDigitos(1234) ? 4                 cantDigitos(0) ? 1

Algoritmo cantidadDeDigitos
	
	definir num Como Entero
	
	escribir "Ingrese un n�mero: "
	leer num
	escribir "La cantidad de d�gitos es: " contar(num)
	
FinAlgoritmo

Funcion contador <- contar(num)
	definir contador Como Entero

	si num<10 entonces
		contador = 1
	SiNo
		contador = 1 + contar(trunc(num/10))
	FinSi

FinFuncion