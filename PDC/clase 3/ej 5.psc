//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.

Algoritmo porcentajeAumento
	
	definir p1, p2, aumento Como Real
	
	escribir "Ingrese el precio del producto al inicio del año: "
	leer p1
	escribir "Ingrese el precio del producto al final del año: "
	leer p2
	
	aumento = ((p2-p1)/p1) *100
	
	escribir "El aumento del producto fue del: " aumento "%"
	
FinAlgoritmo
