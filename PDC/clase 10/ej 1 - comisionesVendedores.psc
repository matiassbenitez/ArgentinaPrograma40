////Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
////múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
////recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
////compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
////vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
////deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
////vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
			escribir "Ingrese el monto de la " j "º venta: "
			leer monto
			total = total + monto
		FinPara
		
		comision = total *0.1
		
		escribir "El total de comisiones del empleado Nro " i " es: $",comision
		escribir "El sueldo total a pagar es de: $", sueldoBase+ comision
	FinPara
	
FinAlgoritmo
