Algoritmo zoom
	definir hora, minutos, horario Como Entero
	horario = 16*60
	escribir "Ingrese la hora y los minutos a los cuales ingres� a la clase:"
	leer hora
	leer minutos
	
	si (hora*60 + minutos) <= (horario+15) Entonces
		escribir "Llegaste a tiempo, tienes presente"
	SiNo
		escribir "Hoy tendr�s tardanza. Recuerda avisarle a tus coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es VITAL"
	FinSi
	
FinAlgoritmo
