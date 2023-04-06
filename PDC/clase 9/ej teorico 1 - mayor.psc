///Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
///mayor número ingresado.

Algoritmo mayorNumero
	
	definir i, mayor, num, maximo Como Entero
	
	Para i = 1 Hasta 5 Con Paso 1 Hacer
		escribir "Ingrese el " i "º número"
		leer num
		si i == 1 Entonces
			maximo = num
		SiNo
			si num > maximo Entonces
				maximo = num
			FinSi
		FinSi
		
	FinPara
	
	escribir "El mayor número ingresado es el " maximo
	
FinAlgoritmo
