///Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
///	caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
///	es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
///	programa mostrará después la frase final. Nota: investigar la función Longitud() y
///	Concatenar() de PseInt.

Algoritmo cuatroCaracteres
	
	definir palabra como cadena
	
	escribir "Ingrese una palabra o frase: "
	leer palabra
	
	si longitud(palabra) == 4 Entonces
		escribir concatenar(palabra,'!')
	SiNo
		escribir concatenar(palabra, '?')
	FinSi
	
FinAlgoritmo
