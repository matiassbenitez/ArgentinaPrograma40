//Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
//pantalla el área y perímetro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.

Algoritmo rectangulo
	
	definir base, altura, area, perimetro como real
	
	escribir "Ingrese la base del rectángulo: "
	leer base
	escribir "Ingrese la altura del rectángulo: "
	leer altura
	
	area = base * altura
	perimetro = 2*base + 2*altura
	
	escribir "El área del rectángulo es de: " area " m2"
	escribir "El perímetro del rectángulo es de: " perimetro " m"
	
FinAlgoritmo
