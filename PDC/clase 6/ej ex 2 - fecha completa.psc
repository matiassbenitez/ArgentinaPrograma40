Algoritmo fecha
	Definir dd, mm, aaaa Como Entero
	definir bandera Como Logico
	Definir mmca como Cadena
	Escribir "ingrese el día: "
	Leer dd
	Escribir "ingrese el mes: "
	Leer mm
	Escribir "Ingrese el año: "
	Leer aaaa
	
	segun mm Hacer
		1,3,5,7,8,10,12:
			si dd>0 Y dd<=31 Entonces
				bandera = Verdadero
			SiNo
				bandera = Falso
			FinSi
		4,6,9,11:
			si dd>0 Y dd<=30 Entonces
				bandera = Verdadero
			SiNo
				bandera = Falso
			FinSi
		2:
			si dd>0 Entonces
				si dd<=28 Entonces
					bandera = Verdadero
				SiNo
					si dd == 29 Entonces
						si (aaaa MOD 4) == 0 Entonces
							si (aaaa MOD 100) == 0 Entonces
								si (aaaa MOD 400) == 0 Entonces
									bandera = Verdadero
								SiNo
									bandera = Falso
								FinSi
							SiNo
								bandera = Verdadero
							FinSi
						SiNo
							bandera = Falso
						FinSi
					SiNo
						bandera = Falso
					FinSi
				FinSi
			SiNo
				bandera = Falso
			FinSi
		De Otro Modo:
			bandera = Falso
	FinSegun
	
	si bandera Entonces
		Segun mm Hacer
			1:
				mmca = "Enero"
			2:
				mmca = "Febrero"
			3:
				mmca = "Marzo"
			4:
				mmca = "Abril"
			5:
				mmca = "Mayo"
			6:
				mmca = "Junio"
			7:
				mmca = "Julio"
			8:
				mmca = "Agosto"
			9:
				mmca = "Septiembre"
			10:
				mmca = "Octubre"
			11:
				mmca = "Noviembre"
			12:
				mmca = "Diciembre"
			De Otro Modo:
				Escribir "No es una opción válida"
		Fin Segun
		
		escribir dd " de " mmca " del " aaaa
	SiNo
		escribir "La fecha ingresada es incorrecta."
	FinSi
	
FinAlgoritmo
