////Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
////20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
////Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
////	a) Deficientes 0-5
////	b) Regulares 6-10
////	c) Buenos 11-15
////	d) Excelentes 16-20

Algoritmo calificaciones
	definir notas Como Real
	definir i, d, r, b, e como entero
	dimension notas[100]
	para i = 0 hasta 99 Hacer
		notas[i] = Aleatorio(0,20)
	FinPara
	d = 0
	r = 0
	b = 0
	e = 0
	para i = 0 hasta 99 Hacer
		si notas[i] < 6 Entonces
			d = d + 1
		SiNo
			si notas[i] < 11 Entonces
				r = r + 1
			SiNo
				si notas[i] < 16 Entonces
					b = b + 1
				SiNo
					e = e + 1
				FinSi
			FinSi
		FinSi
	FinPara
	escribir "Alumnos deficientes: " d
	escribir "Alumnos regulares: " r
	escribir "Alumnos buenos: " b
	escribir "Alumnos excelentes: " e
	
FinAlgoritmo








