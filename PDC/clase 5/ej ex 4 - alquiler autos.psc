/// La empresa "Te llevo a todos lados" est� destinada al alquiler de autos y tiene un sistema
/// de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
///	de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
///	regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
///	cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
///	40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
///	de $5,20 el minuto de uso. Realice un programa que permita registrar esa informaci�n y el
///	total a pagar por el cliente

Algoritmo alquilerAutos
	
	definir horas, minutos como entero
	definir consumo Como Real
	
	escribir "Ingrese el tiempo transcurrido en horas: "
	leer horas
	
	si horas > 2 Entonces
		escribir "Ingrese la cantidad de litros de nafta consumidos: "
		leer consumo
		escribir "El total a pagar es de: $" horas*60*5.2 + consumo*40
	SiNo
		escribir "El total a pagar es de: $400"
	FinSi
	
FinAlgoritmo
