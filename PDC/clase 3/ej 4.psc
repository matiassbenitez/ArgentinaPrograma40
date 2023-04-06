//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
//1 día = 24 horas = 1440 minutos = 86400 segundos

Algoritmo convertirDias
	definir dias, horas, minutos, seguns Como Entero
	escribir "Ingresar la cantidad de días a convertir: "
	leer dias
	
	horas = dias * 24
	minutos = horas * 60
	seguns = minutos * 60
	
	escribir dias " día/s = " horas " horas = " minutos " minutos = " seguns " segundos"
FinAlgoritmo
