////Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
////N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
////Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
////sus estudiantes:
////	Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
////	reprueba el curso si tiene una nota final inferior a 6.5
////	Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
////	La mayor nota obtenida en las exposiciones.
////	Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
////		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
////		las 3 notas y calculará todos informes claves que requiere el docente. 


Algoritmo calificaciones
	
	definir n, i, cont, ARep como entero
	definir n1, n2, n3, promedio, alumnos47, reprobados, MNexposiciones Como Real
	
	cont = 0
	ARep = 0
	reprobados = 0
	MNExposiciones = 0
	alumnos47 = 0
	escribir "Ingresar la cantidad de alumnos: "
	leer n
	
	para i = 1 hasta n Hacer
		
		escribir "ALUMNO " i ":"
		escribir "Ingrese la nota del trabajo práctico integrador: "
		leer n1
		escribir "Ingrese la nota de la exposición: "
		leer n2
		escribir "Ingrese la nota del parcial: "
		leer n3
		
		promedio = n1 * 0.35 + n2 * 0.25 + n3 * 0.40
		
		si promedio<6.5 Entonces
			reprobados = reprobados + promedio
			ARep = ARep + 1
		SiNo
			si promedio>7.5 Entonces
				cont = cont + 1
			FinSi
		FinSi
		
		si n3>=4 Y n3<=7.5 Entonces
			alumnos47 = alumnos47 + 1
		FinSi
		
		si n2>MNExposiciones Entonces
			MNExposiciones=n2
		FinSi
		
	FinPara
	
	si ARep>0 Entonces
		escribir "La nota promedio final de los alumnos que reprobaron es: " reprobados/ARep
	SiNo
		escribir "No hubo alumnos reprobados."
	FinSi
	
	escribir "El proncentaje de alumnos que tiene la nota superior a 7.5 es el: " cont*100/n "%"
	escribir "La nota mayor obtenida en las exposiciones es: " MNExposiciones
	escribir "El total de estudiantes con notas entre 4.0 y 7.5 es: " alumnos47
	
FinAlgoritmo
