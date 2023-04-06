////Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
////un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
////posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
////o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
////	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
////	más cercano.
////Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
////	H o l a    m u n d o    c  r  u  e  l  !
////	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con desplazamiento sería:
////		h o l a    m u n % d o     c  r  u  e  l  !
////		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////		Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 estaba 
////más cerca de la posición 8 que el espacio de la posición 4.

Algoritmo reordenamiento
	
	definir frase, c , direccion como cadena
	definir vector Como Caracter
	definir i, posicion, long como entero
	
	dimension vector[20]
	
	Escribir "ingrese una frase"
	Escribir " "
	leer frase 
	long = Longitud(frase)
	para i=0 Hasta 19 Hacer
		vector[i] = Subcadena(frase,i,i)
	FinPara
	
	Escribir "ingrese un caracter"
	leer c
	Escribir " "
	Escribir "ingrese una posicion"
	leer posicion
	direccion = elegirDir(vector, posicion, long)
	
	segun direccion hacer
		"no":
			escribir "El caracter no pudo ser insertado."
		"ninguna":
			vector[posicion] = c
		"der":
			insertarDer(vector, c, posicion, long)
		"izq":
			insertarIzq(vector, c, posicion)
	FinSegun
	
	para i = 0 hasta long Hacer
		escribir sin saltar vector[i]
	FinPara
	escribir ""
	
FinAlgoritmo

funcion dir <- elegirDir(vector por referencia, posicion, long)
	definir dir como cadena
	definir j como entero
	j = 0
	dir = ""
	si vector[posicion] <> " " Entonces      
		si long < 20 Entonces
			Hacer								
				j = j + 1
				si posicion+j<20 Y posicion-j>=0 Entonces
					si vector[posicion+j] == " "
						dir = "der"
					SiNo
						si vector[posicion-j] == " "
							dir = "izq"
						FinSi
					FinSi
				SiNo
					si posicion+j==20 Entonces
						dir = "izq"
					SiNo
						dir = "der"
					FinSi
				FinSi
			Mientras Que dir <> "der" Y dir <> "izq"
		SiNo
			dir = "no"
		FinSi
	SiNo
		dir = "ninguna"
	FinSi
FinFuncion

subproceso insertarDer(vector por referencia, c, posicion, long)
	definir i Como Entero
	definir aux, aux2 como cadena
	para i = posicion hasta long Hacer
		si i == posicion Entonces
			aux = vector[i]
			vector[i] = c
		SiNo
			aux2 = vector[i]
			vector[i] = aux
			aux = aux2
		FinSi
	FinPara
FinSubProceso

subproceso insertarIzq(vector por referencia, c, posicion)
	definir i Como Entero
	para i = 0 hasta posicion-1 Hacer
		vector[i] = vector[i+1]
	FinPara
	vector[posicion] = c
FinSubProceso












