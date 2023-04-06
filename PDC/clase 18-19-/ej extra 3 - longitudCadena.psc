////Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
////almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
////debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
////Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo longitudCadena
	
	definir nombres como cadena
	definir long, i, n Como Entero
	
	escribir "Ingrese el tamaño del vector: "
	leer n
	dimension nombres[n], long[n]
	
	para i = 0 hasta n-1 Hacer
		escribir "Ingrese el " i+1 "º nombre: "
		leer nombres[i]
		long[i] = Longitud(nombres[i])
	FinPara
	
	para i = 0 hasta n-1 Hacer
		escribir "El nombre " nombres[i] " tiene " long[i] " letras."
	FinPara
	
FinAlgoritmo
