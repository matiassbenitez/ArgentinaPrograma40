//Solicitar al usuario que ingrese la base y altura de un rect�ngulo, y calcular y mostrar por
//pantalla el �rea y per�metro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.

Algoritmo rectangulo
	
	definir base, altura, area, perimetro como real
	
	escribir "Ingrese la base del rect�ngulo: "
	leer base
	escribir "Ingrese la altura del rect�ngulo: "
	leer altura
	
	area = base * altura
	perimetro = 2*base + 2*altura
	
	escribir "El �rea del rect�ngulo es de: " area " m2"
	escribir "El per�metro del rect�ngulo es de: " perimetro " m"
	
FinAlgoritmo
