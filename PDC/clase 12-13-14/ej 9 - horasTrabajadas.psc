////Los empleados de una f�brica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
////jornal diario de acuerdo con las siguientes reglas:
////	a) La tarifa de las horas diurnas es de $ 90
////	b) La tarifa de las horas nocturnas es de $ 125
////	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
////un 15% si el turno es nocturno.
////El programa debe solicitar la siguiente informaci�n al usuario: el nombre del trabajador, el d�a
////de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Adem�s, debemos preguntarle al usuario si el d�a de la semana (lunes, martes, mi�rcoles, etc.) era
////festivo o
////no, para poder calcular el jornal diario. Utilice una funci�n para realizar el c�lculo.
Algoritmo horasTrabajadas
	
	definir nombre, dia, turno, festivo como cadena
	definir horas Como Entero
	
	escribir "Ingrese su nombre: "
	leer nombre
	escribir "Ingrese el d�a trabajado de la semana: "
	leer dia
	dia = Minusculas(dia)
	mientras (dia<>"lunes") Y (dia<>"martes") Y (dia<>"miercoles") Y (dia<>"mi�rcoles") Y (dia<>"jueves") Y (dia<>"viernes") Y (dia<>"sabado") Y (dia<>"s�bado") Y (dia<>"domingo") Hacer
		escribir "Por favor, ingrese un d�a v�lido: "
		leer dia
		dia= Minusculas(dia)
	FinMientras
	escribir "Ingrese su turno, diurno/nocturno: "
	leer turno
	turno = Minusculas(turno)
	mientras (turno<>"diurno") Y (turno<>"nocturno") Hacer
		escribir "Por favor, ingrese un turno v�lido (diurno/nocturno): "
		leer turno
		turno= Minusculas(turno)
	FinMientras
	escribir "Ingrese la cantidad de horas trabajadas: "
	leer horas
	mientras horas<0 O horas>24 Hacer
		escribir "Por favor, ingrese una cantidad de horas v�lidas: "
		leer horas
	FinMientras
	escribir "El d�a " dia " fue festivo? si/no: "
	leer festivo
	festivo = Minusculas(festivo)
	mientras festivo<>"si" Y festivo<>"no" Hacer
		escribir "Por favor, ingrese una respuesta v�lida(si/no): "
		leer festivo
		festivo = Minusculas(festivo)
	FinMientras
	
	escribir "El jornal de " nombre ", calculado para el dia " dia " es de: $" jornal(turno, horas, festivo)  
	
FinAlgoritmo

Funcion total <- jornal(turno, horas, festivo)
	definir total Como Real
	festivo = Minusculas(festivo)
	si turno== "diurno" Entonces
		si festivo == "si" Entonces
			total = horas * 90 * 1.1
		SiNo
			total = horas * 90
		FinSi
	SiNo
		si festivo == "si" Entonces
			total = horas * 125 * 1.15
		SiNo
			total = horas * 125
		FinSi
	FinSi	
FinFuncion
	