///Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un
///	curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
///		igual a 70; y reprueba en caso contrario.

Algoritmo promedioNotas
	
	definir n1, n2, n3 Como entero
	definir promedio Como Real
	
	escribir "Ingrese las 3 notas: "
	leer n1
	leer n2
	leer n3
	promedio = (n1+ n2+ n3)/3
	
	si promedio>=70 Entonces
		escribir "APRUEBA"
	SiNo
		Escribir "REPRUEBA"
	FinSi
	
FinAlgoritmo
