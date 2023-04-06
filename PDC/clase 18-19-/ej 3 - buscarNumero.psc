////Realizar un programa que rellene un vector de tamaño N, 
////con valores ingresados por el usuario. A continuación, 
////se debe buscar un elemento dentro del arreglo (el número a 
////buscar también debe ser ingresado por el usuario). El programa 
////debe indicar la posición donde se encuentra el valor. En caso de 
////que el número se encuentre repetido dentro del arreglo se deben
////imprimir todas las posiciones donde se encuentra ese valor.
////Finalmente, en caso de que el número a buscar no está adentro del arreglo se debe mostrar
////un mensaje.

Algoritmo buscarNumero
	
	definir vector, n, num, i Como Entero
	definir encontrado como logico
	escribir "Ingrese el tamaño del vector: "
	leer n
	dimension vector[n]
	para i = 0 hasta n-1 Hacer
		escribir "Elemento " i ":"
		leer vector[i]
	FinPara
	
	escribir "Ingresar el número a buscar: "
	leer num
	encontrado = Falso
	para i = 0 hasta n-1 Hacer
		si num == vector[i] Entonces
			escribir "El número fue encontrado en la posición: " i
			encontrado = Verdadero
		FinSi
	FinPara
	
	si NO encontrado Entonces
		escribir "El número no fue encontrado."
	FinSi
	
FinAlgoritmo








