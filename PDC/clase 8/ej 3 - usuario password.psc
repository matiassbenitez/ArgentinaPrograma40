///Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
///mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no le
///debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a 4567.
///El programa finaliza cuando ingresa los datos correctos.

Algoritmo usuario
	
	definir codigo, pass Como Entero
	Hacer
		
		Hacer
			escribir "Ingrese su codigo de usuario (Entero Positivo): "
			leer codigo
		Mientras Que codigo < 0
		
		Hacer
			escribir "Ingrese su contrase�a num�rica (Entero Positivo): "
			leer pass
		Mientras Que pass < 0
		
	Mientras Que codigo <> 1024 O pass <> 4567
	
	escribir "Ud. ingres� los datos correctos."
	
FinAlgoritmo
