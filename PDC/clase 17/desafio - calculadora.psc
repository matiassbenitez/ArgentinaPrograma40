Algoritmo calculadora
	menu()
FinAlgoritmo

subproceso menu
	definir mn Como Entero
	Hacer
		
		
		Escribir "Menu de opciones. " "Ingrese una opcion"
		esperar 2 segundo
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		
		leer mn
		
		Segun mn Hacer
			1:
				calcularMuro
			2:
				calcularViga
			3:
				calcularColumna
			4:
				calcularContrapisos
			5:
				calcularTecho
			6:
				calcularPisos
			7:
				calcularPintura
			8:
				CalcularIluminacion
			9:
				Escribir "Muchas gracias, Hasta pronto"
		FinSegun
	Mientras Que mn <> 9
FinSubProceso

Funcion volumen <- calcularVolumen(largo por valor, alto por valor, ancho por valor)
	definir volumen Como Real
	volumen = largo*alto*ancho
FinFuncion

Funcion superficie <- calcularSuperficie(largo por valor, ancho por valor)
	definir superficie Como Real
	superficie = largo*ancho
FinFuncion

subproceso calcularMuro
	definir espesor,largo,alto, calculo,final, cemento, arena,ladrillo Como Real 
	Escribir "Elegir espesor del muro." " 20 cm o 30 cm"
	leer espesor
	Escribir "Ahora ingrese el largo del muro"
	leer largo
	Escribir "Ingrese el alto del muro"
	leer alto
	segun espesor hacer
		20: 
			calculo = calcularSuperficie(largo, alto)
			cemento= 10.9 * calculo
			arena= 0.09 * calculo
			ladrillo=90 * calculo
			Escribir "Para contruir una pared de: ", largo, " x ", alto " x ", espesor ", necesitara ", cemento, " kg de cemento, ",arena, " m3 de arena y ", ladrillo " ladrillos"  
		30: 
			calculo= calcularSuperficie(largo,alto)
			cemento= 15.2 * calculo
			arena= 0.115 * calculo
			ladrillo = 120 * calculo
			escribir "Para contruir una pared de: ", largo, " x ", alto " x ", espesor ", necesitara ", cemento, " kg de cemento, ",arena, " m3 de arena y ", ladrillo " ladrillos"  
			
	FinSegun
FinSubProceso

SubProceso calcularViga()
	definir largo Como Real
	escribir "Ingrese el largo de la viga: "
	leer largo
	escribir "Materiales necesarios: "
	escribir "Cemento: " 9*largo "kg."
	escribir "Arena: " 0.02*largo "m3."
	escribir "Piedra: " 0.02*largo "m2."
	escribir "Hierro del 8: " 4*largo "m."
	escribir "Hierro del 4: " 3*largo "m."
	
FinSubProceso

SubProceso calcularColumna()
	definir largo como real
	escribir "Ingrese el largo de la columna: "
	leer largo
	escribir "Materiales necesarios: "
	escribir "Cemento: " 7.5*largo "kg."
	escribir "Arena: " 0.016*largo "m3."
	escribir "Piedra: " 0.016*largo "m2."
	escribir "Hierro del 10: " 6*largo "m."
	escribir "Hierro del 4: " 3*largo "m."
FinSubProceso

subproceso calcularContrapisos
	definir espesor,largo,ancho, volumen Como Real 
	Escribir "Elegir espesor del contrapiso:" 
	leer espesor
	Escribir "Ahora ingrese el largo del contrapiso:"
	leer largo
	Escribir "Ingrese el ancho del contrapiso:"
	leer ancho
	volumen=CalcularVolumen(largo, ancho, espesor)
	escribir "Materiales necesarios: "
	escribir "Cemento: " 105*volumen "kg."
	escribir "Arena: " 0.45*volumen "m3."
	escribir "Piedra: " 0.09*volumen "m3."
	
FinSubProceso

subproceso calcularTecho()
	definir espesor, ancho, largo, volumen Como Real
	escribir "Ingrese el espesor del techo: "
	leer espesor
	escribir "Ingrese el ancho del techo: "
	leer ancho
	escribir "Ingrese el largo del techo: "
	leer largo
	volumen = calcularVolumen(largo, ancho, espesor)
	escribir "Materiales necesarios: "
	escribir "Cemento: " 33*volumen "kg."
	escribir "Arena: " 0.072*volumen "m3."
	escribir "Piedra: " 0.072*volumen "m3."
	escribir "Hierro del 8: " 7*volumen "m."
	escribir "Hierro del 6: " 4*volumen "m."
FinSubProceso

subproceso calcularPisos()
	definir largo, ancho, superficie Como Real
	escribir "Ingrese el largo del piso: "
	leer largo
	escribir "Ingrese el ancho del piso: "
	leer ancho
	superficie = calcularSuperficie(largo,ancho)*1.1
	escribir "La superficie del piso es de: " superficie "m2."
FinSubProceso

SubProceso calcularPintura()
	definir superficie Como Real
	escribir "Ingrese la superficie del muro: "
	leer superficie
	escribir "La pintura necesaria es: " superficie/6 "litros."
FinSubProceso

SubProceso calcularIluminacion()
	definir superficie Como Real
	escribir "Ingrese la superficie de la habitación: "
	leer superficie
	escribir "La iluminación natural mínima es de: " superficie*0.20 "m2."
FinSubProceso












