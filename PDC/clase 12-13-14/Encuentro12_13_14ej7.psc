////Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
////entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con de-
////cimales ni letras. Ejemplo: ingresando "100" (car�cter) debe convertirse en 100 (entero).
Funcion enter <- num1 ( num )
	
	Definir enter como entero
	enter = ConvertirANumero(num)
	
Fin Funcion

Algoritmo Encuentro12_13_14ej7
	Definir num Como Caracter
	Definir enter Como Entero
	
	Escribir "Ingrese un n�mero de hasta tres d�gitos: "
	Leer num
	mientras Longitud(num)>3 Hacer
		escribir "El n�mero supera los 3 d�gitos. Por favor, vuelva a ingresarlo: "
		leer num
	FinMientras
	
	enter = num1 (num)
	Escribir "El n�mero ingresado es: " enter
	
FinAlgoritmo