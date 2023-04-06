//Hacer un programa que ingrese por teclado un número total de segundos y que luego
//pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor
//ingresado

Algoritmo convertirSegundos
	
	definir seconds, second, horas, minutos Como Entero
	
	escribir "Ingresar la cantidad de segundos a convertir: "
	leer seconds
	
	second = seconds MOD 60
	minutos = ((seconds - second) MOD 3600) / 60
	horas = (seconds - second - minutos*60) / 3600
	
	escribir "Horas: " horas
	escribir "Minutos: " minutos
	escribir "Segundos: " second
	
FinAlgoritmo
