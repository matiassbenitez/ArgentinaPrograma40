///Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
///programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
///todos ellos.
///Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
///numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable.
///Si es mayor reemplazaremos el valor de numeroMaximo. Por ejemplo, si 5 > 0 entonces el
///máximo entre estos números será 5. Si luego ingreso el número 2, se evalúa 2 > 5 lo que
///resultará falso y por lo tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica
///similar tendrá el mínimo.

Algoritmo teclearCero
	
	definir num, cont, numeroMaximo, numeroMinimo, suma como entero
	definir promedio Como Real
	
	numeroMaximo = 0
	suma = 0
	cont = 0
	escribir "Ingrese un número: "
	leer num
	si num <> 0 Entonces		
		Hacer
			
			cont = cont + 1
			
			si num>numeroMaximo entonces
				numeroMaximo = num
			FinSi
			
			si cont <> 1 Entonces
				si num<numeroMinimo Entonces
					numeroMinimo = num
				FinSi
			SiNo
				numeroMinimo = num
			FinSi
			
			suma = suma + num
			
			escribir "Ingrese un número: "
			leer num
			
		Mientras Que num <> 0 
		
		promedio = suma / cont
		escribir "El mayor número ingresado es: " numeroMaximo
		escribir "El menor número ingresado es: " numeroMinimo
		escribir "El promedio de los números ingresados es: " promedio
	SiNo
		escribir "No se ha ingresado ningún número."
	FinSi
	
FinAlgoritmo
