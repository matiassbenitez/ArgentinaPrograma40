///3. Dise�ar una funci�n que permita obtener el m�ximo com�n divisor 
///de dos n�meros mediante el algoritmo de Euclides


Algoritmo euclides
	
	definir a, b, m Como Entero
	escribir "Ingrese el primer n�mero: "
	leer a
	escribir "Ingrese el segundo n�mero: "
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
	