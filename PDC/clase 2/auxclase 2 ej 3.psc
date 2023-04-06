Algoritmo Prueba
	definir n1, n2, n3, n4, aux,i Como Entero
	escribir "ingrese n1: "
	leer n1
	escribir "ingrese n2: "
	leer n2
	escribir "ingrese n3: "
	leer n3
	escribir "ingrese n4: "
	leer n4
	
	aux = n1
	n1 = n4
	n4= aux
	aux = n2
	n2 = n3
	n3=aux
	
	escribir n1 " " n2 " " n3 " " n4
FinAlgoritmo
