///Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
///programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
///todos ellos.
///Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
///numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable.
///Si es mayor reemplazaremos el valor de numeroMaximo. Por ejemplo, si 5 > 0 entonces el
///m�ximo entre estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2 > 5 lo que
///resultar� falso y por lo tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica
///similar tendr� el m�nimo.

Algoritmo teclearCero
	
	definir num, cont, numeroMaximo, numeroMinimo, suma como entero
	definir promedio Como Real
	
	numeroMaximo = 0
	suma = 0
	cont = 0
	escribir "Ingrese un n�mero: "
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
			
			escribir "Ingrese un n�mero: "
			leer num
			
		Mientras Que num <> 0 
		
		promedio = suma / cont
		escribir "El mayor n�mero ingresado es: " numeroMaximo
		escribir "El menor n�mero ingresado es: " numeroMinimo
		escribir "El promedio de los n�meros ingresados es: " promedio
	SiNo
		escribir "No se ha ingresado ning�n n�mero."
	FinSi
	
FinAlgoritmo
