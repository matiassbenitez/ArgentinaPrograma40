//Un alumno desea saber cu�l ser� su calificaci�n final en la materia de Algoritmos. Dicha
//calificaci�n se compone de los siguientes porcentajes:
//a. 55% del promedio de sus tres calificaciones parciales.
//b. 30% de la calificaci�n del examen final.
//c. 15% de la calificaci�n de un trabajo final

Algoritmo sin_titulo
	definir p1, p2, p3, examenFinal, trabajoFinal Como Real
	
	escribir "Ingrese la calificaci�n del primer parcial: "
	leer p1
	escribir "Ingrese la calificaci�n del segundo parcial: "
	leer p2
	escribir "Ingrese la calificaci�n del tercer parcial: "
	leer p3
	escribir "Ingrese la calificaci�n del examen final: "
	leer examenFinal
	escribir "Ingrese la calificaci�n del trabajo final: "
	leer trabajoFinal
	
	escribir "La calificaci�n final es: " ((p1+p2+p3)/3)*0.55 +  examenFinal*0.3 + trabajoFinal*0.15
FinAlgoritmo
