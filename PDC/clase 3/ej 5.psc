//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l fue el
//porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.

Algoritmo porcentajeAumento
	
	definir p1, p2, aumento Como Real
	
	escribir "Ingrese el precio del producto al inicio del a�o: "
	leer p1
	escribir "Ingrese el precio del producto al final del a�o: "
	leer p2
	
	aumento = ((p2-p1)/p1) *100
	
	escribir "El aumento del producto fue del: " aumento "%"
	
FinAlgoritmo
