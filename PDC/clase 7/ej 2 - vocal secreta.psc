Algoritmo vocalSecreta
	definir vocal, intento Como Caracter
	vocal = 'a'
	escribir "Intente adivinar la vocal igresando una: "
	leer intento
	mientras intento<>vocal Hacer
		escribir "Vocal incorrecta, ingrese otra: "
		leer intento
	FinMientras
	
	escribir "Felicitaciones!!! La vocal |" vocal "| era la vocal secreta."
	
FinAlgoritmo
