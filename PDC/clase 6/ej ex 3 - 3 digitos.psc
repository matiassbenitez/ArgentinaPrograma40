///Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo tresDigitos
	definir num como entero
	
	escribir "Ingresar un número: "
	leer num
	
	si num>99 Y num<1000 Entonces
		escribir "El número ingresado tiene 3 dígitos."
	SiNo
		si num>-1000 Y num<-99 Entonces
			escribir "El número ingresado tiene 3 dígitos."
		SiNo
			escribir "El número ingresado no tiene 3 dígitos."
		FinSi
	FinSi
FinAlgoritmo
