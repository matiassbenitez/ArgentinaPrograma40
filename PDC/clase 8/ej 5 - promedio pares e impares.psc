///Hacer un algoritmo para calcular la media de los n�meros pares e impares, s�lo se
///ingresar� diez n�meros.

Algoritmo paresImpares
	
	definir sumaP, sumaI, i, p, num, cont Como Entero
	
	i = 0
	p = 0
	sumaP = 0
	sumaI = 0
	cont = 0
	
	Hacer
		escribir "Ingrese un n�mero (Entero Positivo): "
		leer num
		mientras num <0 Hacer
			escribir "El n�mero debe ser Entero Positivo, vuelva a ingresarlo: "
			leer num
		FinMientras
		cont = cont + 1
		si num MOD 2 == 0 Entonces
			p = p + 1
			sumaP = sumaP + num
		SiNo
			i = i + 1
			sumaI = sumaI + num
		FinSi
	Mientras Que cont < 10
	
	escribir "Se ingresaron " p " n�mero pares y " i " impares."
	escribir "El promedio de los n�meros pares es: " sumaP / p
	escribir "El promedio de los n�meros impares es: " sumaI / i
	
FinAlgoritmo
