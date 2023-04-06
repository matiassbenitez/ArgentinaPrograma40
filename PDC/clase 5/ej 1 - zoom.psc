Algoritmo zoom
	definir hora, minutos, horario Como Entero
	horario = 16*60
	escribir "Ingrese la hora y los minutos a los cuales ingresó a la clase:"
	leer hora
	leer minutos
	
	si (hora*60 + minutos) <= (horario+15) Entonces
		escribir "Llegaste a tiempo, tienes presente"
	SiNo
		escribir "Hoy tendrás tardanza. Recuerda avisarle a tus coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"
	FinSi
	
FinAlgoritmo
