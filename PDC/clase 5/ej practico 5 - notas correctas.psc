///Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
///entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
///ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
///variable de tipo lógico

Algoritmo tresNotas
	definir n1, n2, n3 Como Real
	definir bandera Como Logico
	escribir "Ingresar las 3 notas: "
	leer n1
	leer n2
	leer n3
	
	si n1 >= 1 Y n1 <= 10 Entonces
		si n2 >= 1 Y n2 <= 10 Entonces
			si n3 >= 1 Y n3 <= 10 Entonces
				bandera = Verdadero
			SiNo
				bandera = Falso
			FinSi
		SiNo
			bandera = Falso
		FinSi
	sino
		bandera = Falso
	FinSi
	
	si bandera == Verdadero Entonces
		escribir "Las 3 notas son correctas."
	SiNo
		escribir "Notas incorrectas."
	FinSi
	
FinAlgoritmo
