//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//	bisiesto. Nota: recuerde la funci�n mod de PseInt

Algoritmo anioBisiesto
	
	definir anio Como Entero
	
	escribir "Ingresar el a�o: "
	leer anio
	
	si (anio MOD 4) == 0 Entonces
		si (anio MOD 100) <> 0 Entonces
			escribir "El a�o es bisiesto porque es divisible por 4 pero no por 100"
		SiNo
			si (anio MOD 400) == 0 Entonces
				escribir "El a�o es bisiesto porque es divisible por 4, 100 y 400"
			SiNo
				escribir "El a�o no es bisiesto porque es divisible por 4 y 100 pero no por 400"
			FinSi
		FinSi
	SiNo
		escribir "El a�o no es bisiesto porque no es divisile por 4."
	FinSi
	
	
FinAlgoritmo
