//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
//	hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//			funci�n debe devolver el resultado de esta validaci�n, para mostrar el mensaje en el algoritmo.
//				Nota: recordar el uso de las variables de tipo l�gico.

Algoritmo ejercicio_8
	definir n, arreglo1, arreglo2 Como Entero
	
	Escribir "ingrese el tama�o deseado"
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
		escribir " el arreglo n� 1 es: " arreglo1[i] 
		escribir " el arreglo n� 2 es: " arreglo2[i] 
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
	