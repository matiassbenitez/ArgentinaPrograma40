//Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la nota
//se pedir� de nuevo hasta que la nota sea correcta.
Algoritmo uno_
	definir nota Como Real
	Escribir "Ingresar nota "
	leer nota
	mientras nota > 10 o nota <0 Hacer
		escribir "reingresar nota" 
		leer nota
	FinMientras
FinAlgoritmo
