///Realizar un programa que solicite al usuario su código de usuario (un número entero
///mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no le
///debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567.
///El programa finaliza cuando ingresa los datos correctos.

Algoritmo usuario
	
	definir codigo, pass Como Entero
	Hacer
		
		Hacer
			escribir "Ingrese su codigo de usuario (Entero Positivo): "
			leer codigo
		Mientras Que codigo < 0
		
		Hacer
			escribir "Ingrese su contraseña numérica (Entero Positivo): "
			leer pass
		Mientras Que pass < 0
		
	Mientras Que codigo <> 1024 O pass <> 4567
	
	escribir "Ud. ingresó los datos correctos."
	
FinAlgoritmo
