//Se pide ingresar una letra del alfabeto y mostrar si dicha letra es vocal o consonante.

Algoritmo vocalesYconsonantes
	definir letra Como Caracter
	escribir "Ingrese una letra: "
	leer letra
	
	letra = Minusculas(letra)
	
	si (letra == "a" O letra == "e" O letra == "i" O letra == "o" O letra == "u") Entonces
		escribir "La letra ingresada es una vocal."
	FinSi
	
	si NO(letra == "a" O letra == "e" O letra == "i" O letra == "o" O letra == "u") Entonces
		escribir "La letra ingresada es una consonante."
	FinSi
	
FinAlgoritmo