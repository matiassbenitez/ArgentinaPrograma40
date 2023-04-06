////Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
////que ingrese la opci�n Salir:
////	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
////	usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
////	B. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
////	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
////a elemento. Ejemplo: C = A + B
////	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
////elemento. Ejemplo: C = B - A
////E. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector
////	A, B, o C.
////	F. Salir.
////NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La longitud
////		para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo se solicitar� una
////vez.

Algoritmo menuVectores
	
	definir op, opc como caracter
	definir A, B, C, n, i como entero
	
	escribir "Ingrese el tama�o de los vectores: "
	leer n
	dimension A[n], B[n], C[n]
	
	Hacer
		
	
		Borrar Pantalla
		escribir "MENU"
		escribir "A. Llenar Vector A"
		escribir "B. Llenar Vector B"
		escribir "C. Llenar Vector C con la suma"
		escribir "D. Llenar Vector C con la resta"
		escribir "E. Mostrar"
		escribir "F. Salir"
		escribir ""
		escribir "Ingrese su opci�n: "
		leer op
		
		segun op Hacer
			'A':
				para i = 0 hasta n-1 Hacer
					A[i] = Aleatorio(-100,100)
				FinPara
			'B':
				para i = 0 hasta n-1 Hacer
					B[i] = Aleatorio(-100,100)
				FinPara
			'C':
				para i = 0 hasta n-1 Hacer
					C[i] = A[i] + B[i]
				FinPara
			'D':
				para i = 0 hasta n-1 Hacer
					C[i] = B[i] - A[i]
				FinPara
			'E':
				escribir "Qu� vector desea mostrar?"
				escribir "A, B o C?"
				leer opc
				segun opc Hacer
					'A': 
						escribir "Vector A: "
						para i = 0 hasta n-1 Hacer
							escribir "[" A[i] "]" Sin Saltar
						FinPara
						escribir ""
						Esperar Tecla
					'B': 
						escribir "Vector B: "
						para i = 0 hasta n-1 Hacer
							escribir "[" B[i] "]" Sin Saltar
						FinPara
						escribir ""
						Esperar Tecla
					'C': 
						escribir "Vector C: "
						para i = 0 hasta n-1 Hacer
							escribir "[" C[i] "]" Sin Saltar
						FinPara
						escribir ""
						Esperar Tecla
				FinSegun
			'F':
				escribir "Muchas gracias. Hasta luego!!"
		FinSegun
	Mientras Que op<>'F'
FinAlgoritmo
