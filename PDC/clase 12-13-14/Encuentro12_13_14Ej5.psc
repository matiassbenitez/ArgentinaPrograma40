////Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
////primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
////3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
Funcion primo <- esPrimo ( num1 )
	Definir primo Como Logico
	Definir contador como entero
	primo = verdadero
	contador = 2
	Mientras primo y contador < num1 Hacer
		si num1 MOD contador == 0 Entonces 
			primo = falso 
		FinSi
		contador = contador + 1
	FinMientras
Fin Funcion

Algoritmo Encuentro12_13_14Ej5
	Definir num1 como entero
	Definir primo Como Logico
	
	Escribir 'Escribe un número para saber si es primo:' 
	Leer num1
	
	primo = esPrimo (num1)
	Escribir 'El número ingresado es primo?: ' primo 
	
FinAlgoritmo
