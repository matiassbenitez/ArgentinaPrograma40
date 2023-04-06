//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//			función debe devolver el resultado de esta validación, para mostrar el mensaje en el algoritmo.
//				Nota: recordar el uso de las variables de tipo lógico.

Algoritmo ejercicio_8
	definir n, arreglo1, arreglo2 Como Entero
	
	Escribir "ingrese el tamaño deseado"
	leer n
	
	Dimension arreglo1[n], arreglo2[n]
	
	rellene2arreglos(arreglo1, arreglo2, n)
	
	Escribir comparacion(arreglo1, arreglo2, n)
	
FinAlgoritmo

SubProceso rellene2arreglos (arreglo1 Por Referencia, arreglo2 Por Referencia, n Por Referencia)
	definir i Como Entero
	
	para i = 0 hasta n-1 hacer
		arreglo1[i] = aleatorio (-100,100)
		arreglo2[i] = Aleatorio(-100,100)
	FinPara
	
	para i = 0 hasta n-1 hacer
		escribir " el arreglo n° 1 es: " arreglo1[i] 
		escribir " el arreglo n° 2 es: " arreglo2[i] 
	FinPara
FinSubProceso

Funcion retorno <- comparacion(arreglo1 Por Referencia, arreglo2 Por Referencia, n Por Referencia)
	definir retorno como logico
	definir i Como Entero
	i=0
	retorno= Verdadero
	
	Mientras retorno Y i<n Hacer
		si arreglo1[i] <> arreglo2[i] Entonces
			retorno = Falso
		SiNo
			i= i+1
		FinSi
		
	FinMientras
	
FinFuncion
	