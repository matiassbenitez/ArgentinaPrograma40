////Realizar una funci�n que calcule y retorne la suma de todos los divisores del n�mero n distin-
////tos de n. El valor de n debe ser ingresado por el usuario.
Funcion sumatoria <- sumar ( n )
	Definir sumatoria, contador como entero 
	sumatoria = 0
	contador = 1
	Mientras contador < n Hacer
		si n MOD contador == 0 Entonces 
			sumatoria = sumatoria + contador
			Escribir 'Los n�meros que se sumaran ser�n: ' contador
		FinSi
		contador = contador + 1
	FinMientras
Fin Funcion

Algoritmo Encuentro12_13_14Ej6
	Definir n, sumatoria, contador como entero
	
	
	Escribir 'Escribe un n�mero: ' 
	Leer n
	
	sumatoria = sumar ( n )
	
	Escribir 'La suma de los divisores es: ' sumatoria  
FinAlgoritmo
