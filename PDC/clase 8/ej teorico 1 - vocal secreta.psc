//Vamos a hacer nuevamente el ejercicio de la vocal misteriosa, pero esta vez con una estructura
//Hacer-Mientras. ¿Puedes notar cuál es la diferencia entre ambas estructuras?

Algoritmo vocalSecretaHM
	definir VS, vocal Como Caracter
	VS = 'e'
	Hacer
		escribir "Intente adivinar la vocal secreta: "
		leer vocal
	Mientras Que vocal <> VS
	escribir "Felicidades!!! Adivinó la vocal secreta."
FinAlgoritmo
