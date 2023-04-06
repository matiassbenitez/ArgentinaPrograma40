////Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
////ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
////ción Subcadena().
Funcion cantidad <- contar ( cad1, letra )
	Definir cantidad, i Como Entero
	cantidad = 0 
	Para i = 0 hasta Longitud(cad1) - 1 hacer 
		Si Subcadena(cad1,i,i) == letra Entonces
			cantidad = cantidad + 1
		FinSi
	FinPara
Fin Funcion

Algoritmo Encuentro12_13_14Ej4
	Definir cad1, letra como caracter 
	Definir num1, cantidad como entero 
	
	
	Escribir 'Ingrese una frase'
	Leer cad1
	
	Escribir 'Ingrese la letra que desea buscar:' 
	Leer letra
	
	cantidad = contar (cad1, letra)
	Escribir 'La cantidad de letras en su frase es: ' cantidad 
	
FinAlgoritmo
