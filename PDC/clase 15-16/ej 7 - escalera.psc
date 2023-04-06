////Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al
////comenzar. Ejemplo: si se ingresa el número 3:
////			1
////			12
////			123

Algoritmo escalera
	definir altura Como Entero
	escribir "Ingrese la altura de la escalera: "
	leer altura
	crearEscalera(altura)
FinAlgoritmo

SubProceso crearEscalera(n por valor)
	definir i, j como entero
	para i = 1 hasta n Hacer
		para j = 1 hasta i Hacer
			escribir sin saltar j
		FinPara
		escribir ""
	FinPara
FinSubProceso