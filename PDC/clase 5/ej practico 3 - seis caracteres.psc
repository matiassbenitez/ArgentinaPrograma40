///Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
///usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje por
///pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
///Nota: investigar la función Longitud() de PseInt.

Algoritmo seisCaracteres
	definir palabra como cadena
	escribir "Ingrese una palabra o frase: "
	leer palabra
	
	si Longitud(palabra) == 6 Entonces
		escribir "CORRECTO"
	SiNo
		escribir "INCORRECTO"
	FinSi
FinAlgoritmo
