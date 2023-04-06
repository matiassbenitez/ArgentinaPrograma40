////Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales repetidas. 
////Al final el procedimiento mostrará la frase final.
////Por ejemplo:
////Entrada: "Habia una vez un barco"
////Salida: "Habi un vez n brco"
////	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? 
////quedan al no estar repetidas.

Algoritmo eliminarVocales
	
	definir frase como cadena
	
	escribir "Ingrese la frase: "
	leer frase
	frase = Minusculas(frase)
	escribir "Frase antes de procedimiento: "
	escribir frase
	eliminar(frase)
	escribir "Frase después de procedimiento: "
	escribir frase
	
	
FinAlgoritmo

SubProceso eliminar(frase por referencia)
	definir i, k Como Entero
	k=Longitud(frase)-1
	para i = 0 hasta k Hacer
		segun subcadena(frase,i,i) Hacer
			'a':
				eliminarLetra(frase,i,k,'a')
			'e':
				eliminarLetra(frase,i,k,'e')
			'i':
				eliminarLetra(frase,i,k,'i')
			'o':
				eliminarLetra(frase,i,k,'o')
			'u':
				eliminarLetra(frase,i,k,'u')
		FinSegun
	FinPara
FinSubProceso

SubProceso eliminarLetra(frase por referencia,i por valor,k por referencia, vocal)
	definir j Como entero
	j= i+1
	mientras j<=k Hacer
			si subcadena(frase,j,j) == vocal Entonces
			frase = concatenar(subcadena(frase,0,j-1),subcadena(frase,j+1,k))
			escribir "dentro de procedimiento"
			escribir frase
			k=k-1
		SiNo
			j=j+1
		FinSi
	FinMientras
FinSubProceso