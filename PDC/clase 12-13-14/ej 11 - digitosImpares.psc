////Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
////tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
////numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
////Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
////realizar el ejercicio.

Algoritmo digitosImpares
	
	definir num Como Entero
	
	escribir "Ingrese un número: "
	leer num
	
	si comprobar(num) Entonces
		escribir "El número ingresado contiene todos sus dígitos impares."
	SiNo
		escribir "Uno o más de los dígitos son pares."
	FinSi
	
FinAlgoritmo

Funcion log <- comprobar(num)
	definir log Como Logico
	log = verdadero
	mientras log Y num>0 Hacer
		si ((num MOD 10) MOD 2) == 0 Entonces
			log = Falso
		SiNo
			num = trunc(num/10)
		FinSi
	FinMientras
FinFuncion
