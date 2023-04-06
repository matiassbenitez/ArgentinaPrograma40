//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas vale
//	el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres notas
//	obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los datos del
//	siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben estar
//	comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el promedio
//		y se mostrar� un mensaje de error.

Algoritmo calificaciones_alumnos
	definir nombre como cadena
	definir n1, n2, n3 Como Real
	
	Escribir "Ingrese nombre"
	Leer nombre
	
	
	mientras longitud(nombre) > 0 Hacer
		Escribir "Ingresar las tres notas"
		Leer n1, n2, n3
		si n1 >= 0 y n1 <= 10 Entonces
			Si n2 >= 0 y n2 <= 10 Entonces
				si n3 >= 0 y n3 <= 10 Entonces
				
					Escribir "La nota final es " n1*0.1 + n2*0.5 + n3*0.4
					
				SiNo
					Escribir "error"
				FinSi
			Sino 
				Escribir "error"
			FinSi
		SiNo
			Escribir  "error"
			
		FinSi
		Escribir "Ingresar un nombre"
		leer nombre
	FinMientras
	
	
FinAlgoritmo
