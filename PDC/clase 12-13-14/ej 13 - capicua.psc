

////Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
////capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
////transformar el numero a cadena para realizar el ejercicio.

Algoritmo capicua
	
	definir num Como Entero
	
	escribir "Ingrese un número: "
	leer num
	
	si comprobar(num) Entonces
		escribir "El número es capicúa."
	SiNo
		escribir "El número NO ES CAPICUA."
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
	