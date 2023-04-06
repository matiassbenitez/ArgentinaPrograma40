/// Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
/// una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
///	mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
///	clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
///	correctamente.


Algoritmo eureka
	definir clave como cadena
	definir i Como Entero
	i = 0
	Hacer
		escribir "Ingrese una clave:"
		leer clave
		i = i+1
	Mientras Que clave <> 'eureka' Y i < 3
	
	si clave <> 'eureka' Entonces
		escribir "Se agotaron los 3 intentos."
	SiNo
		escribir "La clave es correcta."
	FinSi
	
FinAlgoritmo
