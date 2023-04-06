////Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
////entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con de-
////cimales ni letras. Ejemplo: ingresando "100" (carácter) debe convertirse en 100 (entero).
Funcion enter <- num1 ( num )
	
	Definir enter como entero
	enter = ConvertirANumero(num)
	
Fin Funcion

Algoritmo Encuentro12_13_14ej7
	Definir num Como Caracter
	Definir enter Como Entero
	
	Escribir "Ingrese un número de hasta tres dígitos: "
	Leer num
	mientras Longitud(num)>3 Hacer
		escribir "El número supera los 3 dígitos. Por favor, vuelva a ingresarlo: "
		leer num
	FinMientras
	
	enter = num1 (num)
	Escribir "El número ingresado es: " enter
	
FinAlgoritmo