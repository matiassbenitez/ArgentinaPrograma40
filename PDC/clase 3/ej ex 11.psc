//Un alumno desea saber cuál será su calificación final en la materia de Algoritmos. Dicha
//calificación se compone de los siguientes porcentajes:
//a. 55% del promedio de sus tres calificaciones parciales.
//b. 30% de la calificación del examen final.
//c. 15% de la calificación de un trabajo final

Algoritmo sin_titulo
	definir p1, p2, p3, examenFinal, trabajoFinal Como Real
	
	escribir "Ingrese la calificación del primer parcial: "
	leer p1
	escribir "Ingrese la calificación del segundo parcial: "
	leer p2
	escribir "Ingrese la calificación del tercer parcial: "
	leer p3
	escribir "Ingrese la calificación del examen final: "
	leer examenFinal
	escribir "Ingrese la calificación del trabajo final: "
	leer trabajoFinal
	
	escribir "La calificación final es: " ((p1+p2+p3)/3)*0.55 +  examenFinal*0.3 + trabajoFinal*0.15
FinAlgoritmo
