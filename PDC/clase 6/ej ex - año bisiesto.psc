//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//	bisiesto. Nota: recuerde la función mod de PseInt

Algoritmo anioBisiesto
	
	definir anio Como Entero
	
	escribir "Ingresar el año: "
	leer anio
	
	si (anio MOD 4) == 0 Entonces
		si (anio MOD 100) <> 0 Entonces
			escribir "El año es bisiesto porque es divisible por 4 pero no por 100"
		SiNo
			si (anio MOD 400) == 0 Entonces
				escribir "El año es bisiesto porque es divisible por 4, 100 y 400"
			SiNo
				escribir "El año no es bisiesto porque es divisible por 4 y 100 pero no por 400"
			FinSi
		FinSi
	SiNo
		escribir "El año no es bisiesto porque no es divisile por 4."
	FinSi
	
	
FinAlgoritmo
