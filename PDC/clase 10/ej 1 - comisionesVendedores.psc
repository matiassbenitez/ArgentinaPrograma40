////Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
////m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
////recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
////compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
////vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
////deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
////vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
////cada venta.

Algoritmo comisionesVendedores
	
	definir i, j, n, cantVentas Como Entero
	definir sueldoBase, comision, monto, total Como Real
	
	escribir "Ingrese la cantidad de empleados: "
	leer n
	
	totalComisiones = 0
	para i = 1 hasta n Hacer
		
		total = 0
		
		escribir "EMPLEADO Nro. " i "."
		escribir "Ingrese el sueldo base del empleado: "
		leer sueldoBase
		
		escribir "Ingrese la cantidad de ventas realizadas: "
		leer cantVentas
		
		para j=1 hasta cantVentas Hacer
			escribir "Ingrese el monto de la " j "� venta: "
			leer monto
			total = total + monto
		FinPara
		
		comision = total *0.1
		
		escribir "El total de comisiones del empleado Nro " i " es: $",comision
		escribir "El sueldo total a pagar es de: $", sueldoBase+ comision
	FinPara
	
FinAlgoritmo
