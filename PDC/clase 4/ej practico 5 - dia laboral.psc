//Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un dia laboral o no

Algoritmo diaLaboral
	
	definir dia Como Caracter
	
	escribir "Ingrese un d�a de la semana: "
	leer dia
	
	dia = Minusculas(dia)
	
	si (dia == "lunes" O dia == "martes" O dia == "miercoles" O dia == "mi�rcoles" O dia == "jueves" O dia == "viernes") Entonces
		escribir "El d�a ingresado es laboral."
	FinSi
	
	si (dia == "sabado" O dia == "s�bado" O dia == "domingo") Entonces
		escribir "El d�a ingresado es no laboral."
	FinSi
	
	
FinAlgoritmo
