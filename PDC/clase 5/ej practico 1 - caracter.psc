/// Realiza un programa que s�lo permita introducir los caracteres ?S? y ?N?. Si el usuario
///	ingresa alguno de esos dos caracteres se deber� de imprimir un mensaje por pantalla que
///	diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO"


Algoritmo eseYene
	definir char Como Caracter
	escribir "Ingrese un caracter: "
	leer char
	char = Minusculas(char)
	
	si char == 's' O char == 'n'
		escribir "CORRECTO"
	SiNo
		escribir "INCORRECTO"
	FinSi
FinAlgoritmo
