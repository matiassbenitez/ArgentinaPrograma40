////Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
////devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd". Ade-
////m�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos solo			
////3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.

Funcion retorno <- Login ( usuario,contrasenia )
	Definir retorno Como Logico
	Definir contador Como Entero
	retorno = Falso
	contador = 1
	Mientras contador <= 3 Y retorno = Falso
		Si usuario == "usuario1" Y contrasenia == "asdasd" Entonces
			retorno = Verdadero
		SiNo
			Escribir "Ingrese el usuario nuevamente: "
			Leer usuario
			Escribir "Ingrese la contrase�a nuevamente: "
			Leer contrasenia
			contador = contador + 1
		FinSi
	FinMientras
Fin Funcion

Algoritmo Encuentro12_13_14ej8
	Definir usuario, contrasenia Como Caracter
	Escribir "Ingrese el usuario: "
	Leer usuario
	Escribir "Ingrese la contrase�a: "
	Leer contrasenia
	Escribir Login(usuario,contrasenia) 
	Escribir "Ingresando"
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir " "
	Escribir "BIENVENIDO AL SISTEMA"
FinAlgoritmo
