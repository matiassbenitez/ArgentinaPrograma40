////Escribir una función recursiva que calcule y retorne la cantidad de dígitos de un número entero.
////Ejemplos de uso:
////	
////	cantDigitos(1234) ? 4                 cantDigitos(0) ? 1

Algoritmo cantidadDeDigitos
	
	definir num Como Entero
	
	escribir "Ingrese un número: "
	leer num
	escribir "La cantidad de dígitos es: " contar(num)
	
FinAlgoritmo

Funcion contador <- contar(num)
	definir contador Como Entero

	si num<10 entonces
		contador = 1
	SiNo
		contador = 1 + contar(trunc(num/10))
	FinSi

FinFuncion