///Se debe realizar un programa que:
///1�) Pida por teclado un n�mero (entero positivo).
///2�) Pregunte al usuario si desea introducir o no otro n�mero.
///3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
///4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario.

Algoritmo sumaNumeros
	
	definir suma, num Como Entero
	definir resp como caracter
	suma =0
	Hacer
		Hacer
			escribir "Ingrese un n�mero (Entero Positivo): "
			leer num
		Mientras Que num<0
		suma = suma + num
		Hacer
			escribir "Desea ingresar otro n�mero? s/n"
			leer resp
			resp = Minusculas(resp)
		Mientras Que resp <> 'n' Y resp <> 's'
	Mientras Que resp <> 'n'
	escribir "La suma de los n�umero ingresados es: " suma
	
FinAlgoritmo
