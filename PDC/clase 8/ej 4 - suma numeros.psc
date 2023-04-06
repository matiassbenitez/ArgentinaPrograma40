///Se debe realizar un programa que:
///1º) Pida por teclado un número (entero positivo).
///2º) Pregunte al usuario si desea introducir o no otro número.
///3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
///4º) Muestre por pantalla la suma de los números introducidos por el usuario.

Algoritmo sumaNumeros
	
	definir suma, num Como Entero
	definir resp como caracter
	suma =0
	Hacer
		Hacer
			escribir "Ingrese un número (Entero Positivo): "
			leer num
		Mientras Que num<0
		suma = suma + num
		Hacer
			escribir "Desea ingresar otro número? s/n"
			leer resp
			resp = Minusculas(resp)
		Mientras Que resp <> 'n' Y resp <> 's'
	Mientras Que resp <> 'n'
	escribir "La suma de los nñumero ingresados es: " suma
	
FinAlgoritmo
