////Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
////tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
////numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
////Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
////realizar el ejercicio.

Algoritmo digitosImpares
	
	definir num Como Entero
	
	escribir "Ingrese un n�mero: "
	leer num
	
	si comprobar(num) Entonces
		escribir "El n�mero ingresado contiene todos sus d�gitos impares."
	SiNo
		escribir "Uno o m�s de los d�gitos son pares."
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
