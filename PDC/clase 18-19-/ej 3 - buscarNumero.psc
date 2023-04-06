////Realizar un programa que rellene un vector de tama�o N, 
////con valores ingresados por el usuario. A continuaci�n, 
////se debe buscar un elemento dentro del arreglo (el n�mero a 
////buscar tambi�n debe ser ingresado por el usuario). El programa 
////debe indicar la posici�n donde se encuentra el valor. En caso de 
////que el n�mero se encuentre repetido dentro del arreglo se deben
////imprimir todas las posiciones donde se encuentra ese valor.
////Finalmente, en caso de que el n�mero a buscar no est� adentro del arreglo se debe mostrar
////un mensaje.

Algoritmo buscarNumero
	
	definir vector, n, num, i Como Entero
	definir encontrado como logico
	escribir "Ingrese el tama�o del vector: "
	leer n
	dimension vector[n]
	para i = 0 hasta n-1 Hacer
		escribir "Elemento " i ":"
		leer vector[i]
	FinPara
	
	escribir "Ingresar el n�mero a buscar: "
	leer num
	encontrado = Falso
	para i = 0 hasta n-1 Hacer
		si num == vector[i] Entonces
			escribir "El n�mero fue encontrado en la posici�n: " i
			encontrado = Verdadero
		FinSi
	FinPara
	
	si NO encontrado Entonces
		escribir "El n�mero no fue encontrado."
	FinSi
	
FinAlgoritmo








