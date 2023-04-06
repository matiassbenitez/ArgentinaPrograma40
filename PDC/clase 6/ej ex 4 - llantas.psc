/// Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
///	entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
///	Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
///	llantas que compra, y el monto total que tiene que pagar por el total de la compra.


Algoritmo compraLlantas
	definir llantas Como Entero
	definir precio Como Real
	definir bandera Como Logico
	
	escribir "Ingresar la cantidad de llantas compradas: "
	leer llantas
	
	si llantas>0 Entonces
		bandera = Verdadero
		si llantas<5 Entonces
			precio = 3000
		SiNo
			si llantas>=5 Y llantas<=10 Entonces
				precio = 2500
			SiNo
				precio = 2000
			FinSi
		FinSi
	SiNo
		si llantas == 0 Entonces
			escribir "Ud. No ha comprado llantas."
			bandera = Falso
		SiNo
			bandera = Falso
		FinSi
	FinSi
	si llantas <> 0 Entonces
		si bandera Entonces
			escribir "Ud. ha comprado " llantas " llantas, cada una a $" precio ". El total a abonar es: $" llantas*precio "."
		SiNo
			escribir "Cantidad de llantas inválida."
		FinSi
	finsi
	
	
FinAlgoritmo
