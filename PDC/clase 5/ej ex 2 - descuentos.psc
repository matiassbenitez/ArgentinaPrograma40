///Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
///10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
///mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
///debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo descuentosMeses
	
	definir mes como cadena
	definir importe Como Real
	Escribir "Ingrese el mes en el que se realizó la compra: "
	leer mes
	escribir "Ingrese el importe de la compra: "
	leer importe
	
	mes = Minusculas(mes)
	
	si mes == "septiembre" O mes == "octubre" O mes == "noviembre" Entonces
		escribir "El monto total a pagar es: $" importe*0.9
	SiNo
		escribir "El monto total a pagar es: $" importe
	FinSi
	
FinAlgoritmo
