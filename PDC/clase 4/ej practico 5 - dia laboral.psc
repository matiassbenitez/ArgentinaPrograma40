//Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no

Algoritmo diaLaboral
	
	definir dia Como Caracter
	
	escribir "Ingrese un día de la semana: "
	leer dia
	
	dia = Minusculas(dia)
	
	si (dia == "lunes" O dia == "martes" O dia == "miercoles" O dia == "miércoles" O dia == "jueves" O dia == "viernes") Entonces
		escribir "El día ingresado es laboral."
	FinSi
	
	si (dia == "sabado" O dia == "sábado" O dia == "domingo") Entonces
		escribir "El día ingresado es no laboral."
	FinSi
	
	
FinAlgoritmo
