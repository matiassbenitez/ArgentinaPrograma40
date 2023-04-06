//Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide desarro-
//llar un programa que:
//	
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la función Subcadena de PSeInt.
//	
//	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una posi-
//	ción dentro del arreglo, y el programa debe intentar ingresar el carácter en la posición
//	
//	indicada, si es que hay lugar (es decir la posición está vacía o es un espacio en
//	blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado, de
//	lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
//	H o l a m u n d o c r u e l !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//Si se desea ingresar el carácter "%" en la posición 10, entonces el resultado sería:
//		H o l a m u n d o % c r u e l !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19

Algoritmo ejercicio6
	definir frase, c como cadena
	definir vector Como Caracter
	definir i, posicion como entero
	
	dimension vector[20]
	
	Escribir "ingrese una frase"
	Escribir " "
	leer frase 
	
	para i=0 Hasta 19 Hacer
		vector[i] = Subcadena(frase,i,i)
		
	FinPara
	
	Escribir "ingrese un caracter"
	leer c
	Escribir " "
	Escribir "ingrese una posicion"
	leer posicion
	
	si posicion >= 0 Y posicion < 20 Entonces
		si posicion > Longitud(frase)-1 Entonces
			vector[posicion] = c
		sino 
			si vector[posicion] = " " Entonces
				vector[posicion] = c
			sino 
				Escribir "no se pudo modificar"
			FinSi
		FinSi
	SiNo
		Escribir "no se pudo modificar"
	FinSi
	
	escribir "la frase es la siguiente " frase " y la frase queda de la siguiente manera: "
	
	para i=0 hasta 19 Hacer
		escribir sin saltar vector[i] 
	FinPara
FinAlgoritmo
