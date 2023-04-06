///3. Diseñar una función que permita obtener el máximo común divisor 
///de dos números mediante el algoritmo de Euclides


Algoritmo euclides
	
	definir a, b, m Como Entero
	escribir "Ingrese el primer número: "
	leer a
	escribir "Ingrese el segundo número: "
	leer b
	si a>b Entonces
		m = calcular(b,a)
	SiNo
		m = calcular(a,b)
	FinSi
	
	escribir "El mcd entre " a " y " b " es: " m
	
FinAlgoritmo

Funcion mcd <- calcular(a,b)
	
	definir mcd, aux Como Entero
	mientras b MOD a <> 0 Hacer
		aux = a
		a = b MOD a
		b = aux 
	FinMientras
	mcd = a
FinFuncion
	