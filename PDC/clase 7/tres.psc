//Dada una secuencia de n�meros ingresados por teclado que finaliza con un ?1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los
//	n�meros ingresados. Suponemos que el usuario no insertar� n�mero negativos.
Algoritmo tres
	definir num,prom,suma Como Real
	definir  contador Como Entero
	suma=0
	num=0 
	contador=0
	mientras num<> -1 Hacer
		escribir "ingresar numeros"
		leer num 
		contador = contador +1
		suma = suma+num
		
	FinMientras
	prom = (suma+1) / (contador-1)
	Escribir "El promedio de la suma es ", prom
	
FinAlgoritmo
