////Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
////cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
////cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
////		* * * *
////		*     *
////		*     *
////		* * * *
////	Nota: Recordar el uso del escribir sin saltar en PseInt.

Algoritmo cuadrado
	
	definir n, i, j como entero
	
	escribir "Ingrese el tama�o del lado del cuadrado a dibujar: "
	leer n
	
	para i=1 hasta n Hacer
		para j = 1 hasta n Hacer
			si i==1 O i==n Entonces
				escribir sin saltar "* "
			SiNo
				si j==1 entonces
					escribir sin saltar "* "
				SiNo
					si j==n Entonces
						escribir sin saltar "*"
					SiNo
						escribir sin saltar "  "
					FinSi
				FinSi
			FinSi
		FinPara
		escribir ""
	FinPara
	
FinAlgoritmo
