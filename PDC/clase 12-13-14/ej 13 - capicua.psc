

////Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
////capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
////transformar el numero a cadena para realizar el ejercicio.

Algoritmo capicua
	
	definir num Como Entero
	
	escribir "Ingrese un n�mero: "
	leer num
	
	si comprobar(num) Entonces
		escribir "El n�mero es capic�a."
	SiNo
		escribir "El n�mero NO ES CAPICUA."
	FinSi
FinAlgoritmo

Funcion log <- comprobar(num)
	definir log Como Logico
	definir divisor Como Entero
	
	log = verdadero
	divisor = 10
	mientras trunc(num/divisor)>9 Hacer
		divisor= divisor*10
	FinMientras
	
	mientras log Y (num MOD 10)>0 Hacer
		si trunc(num/divisor) == num MOD 10 Entonces
			num = num MOD divisor
			num = trunc(num/10)
			divisor = trunc(divisor/100)
		SiNo
			log = Falso
		FinSi
	FinMientras
FinFuncion
	