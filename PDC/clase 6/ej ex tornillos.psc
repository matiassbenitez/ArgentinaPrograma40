//Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de
//	tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período
//	de prueba:
///? Producir menos de 200 tornillos defectuosos.
///? Producir más de 10000 tornillos sin defectos.
//? El grado de eficiencia se determina de la siguiente manera:
//? Si no cumple ninguna de las condiciones, grado 5.
//? Si sólo cumple la primera condición, grado 6.
//? Si sólo cumple la segunda condición, grado 7.
//? Si cumple las dos condiciones, grado 8
//Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
//ejercicio. No hacer todos al mismo tiempo y después probar

Algoritmo sin_titulo
	Definir total,eficiencia,errores Como Entero
	Escribir "Este programa para obtener el grado de eficiencia en un periodo de prueba"
	Escribir "Ingresa el total de tornillo"
	leer total
	escribir "Total de deficientes tornillo" 
	leer errores
	eficiencia = total-errores //sin defectos
	si errores<=200 Entonces
		si eficiencia>10000 Entonces
			Escribir"El grado de eficiencia es grado 8"
		SiNo
			Escribir"El grado de eficiencia es grado 6"
		FinSi
	SiNo
		//Escribir "El grado de eficiencia es grado 5"
		si eficiencia>10000 Entonces
			Escribir"El grado de eficiencia es grado 7"
//			si errores<=200 Entonces
//				Escribir"El grado de eficiencia es grado 8"
			//			FinSi
		SiNo
			Escribir"El grado de eficiencia es grado 5"
		FinSi
	FinSi
	
FinAlgoritmo


