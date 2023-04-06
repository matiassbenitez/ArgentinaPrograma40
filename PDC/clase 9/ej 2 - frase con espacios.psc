////Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
////espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el funcionamiento
////		de la función Subcadena().
////	NOTA:. En PseInt, si queremos escribir sin que haya saltos de línea, al final de la operación
////		"escribir" escribimos "sin saltar". Por ejemplo:
////			Escribir sin saltar "Hola, "
////			Escribir sin saltar "cómo estás?"
////		Imprimirá por pantalla: Hola, cómo estás?

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
