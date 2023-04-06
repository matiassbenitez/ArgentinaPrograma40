//Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar al
//usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
//volumen = ? * radio2 * altura

Algoritmo volumenCilindro
	
	definir radio, altura, volumen Como Real
	
	escribir "Ingrese el radio del cilindro: "
	leer radio
	escribir "Ingrese la altura del cilindro: "
	leer altura
	
	volumen = PI * radio^2 * altura
	
	escribir "El volumen del cilindro es de: " volumen "m3"

	
FinAlgoritmo
