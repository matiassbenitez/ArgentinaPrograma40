////Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
////espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el funcionamiento
////		de la funci�n Subcadena().
////	NOTA:. En PseInt, si queremos escribir sin que haya saltos de l�nea, al final de la operaci�n
////		"escribir" escribimos "sin saltar". Por ejemplo:
////			Escribir sin saltar "Hola, "
////			Escribir sin saltar "c�mo est�s?"
////		Imprimir� por pantalla: Hola, c�mo est�s?

Algoritmo fraseConEspacios
	
	definir frase como cadena
	definir total, i Como Entero
	escribir "Ingrese la frase: "
	leer frase
	
	total = longitud(frase)
	
	para i = 0 hasta total-1 Hacer
		escribir Sin Saltar subcadena(frase,i,i) 
		escribir sin saltar "*"
	FinPara
	escribir ""
	
	
FinAlgoritmo
