///Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo tresDigitos
	definir num como entero
	
	escribir "Ingresar un n�mero: "
	leer num
	
	si num>99 Y num<1000 Entonces
		escribir "El n�mero ingresado tiene 3 d�gitos."
	SiNo
		si num>-1000 Y num<-99 Entonces
			escribir "El n�mero ingresado tiene 3 d�gitos."
		SiNo
			escribir "El n�mero ingresado no tiene 3 d�gitos."
		FinSi
	FinSi
FinAlgoritmo
