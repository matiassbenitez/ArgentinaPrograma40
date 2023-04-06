////Define un vector que alojará números enteros y otro de cadena. 
////Dimensiona ambos de la longitud
////que tu desees. Ahora en lapiz y papel, escribe la dimensión de 
////tus vectores y sus subíndices. 

Algoritmo vector
	definir num, i Como Entero
	definir cad como cadena
	
	dimension num[10]
	dimension cad[5]
	cad[0]='a'
	cad[1]='b'
	cad[2]='c'
	cad[3]='d'
	cad[4]='e'
	
	para i = 0 hasta 9 Hacer
		num[i] = i*2
	FinPara
	
	
	para i = 0 hasta 9 Hacer
		escribir sin saltar "[" num[i] "] "
	FinPara
	escribir ""
	para i = 0 hasta 4 Hacer
		escribir sin saltar "[" cad[i] "] "
	FinPara
	escribir ""

FinAlgoritmo
