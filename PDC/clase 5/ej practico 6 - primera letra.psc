///Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
///es una ?A?. Si la primera letra es una ?A?, se deber� de imprimir un mensaje por pantalla
///que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO". Nota:
///investigar la funci�n Subcadena de PseInt

Algoritmo primeraLetra
	definir palabra como cadena
	escribir "Ingrese una palabra o frase: "
	leer palabra
	
	palabra = Minusculas(palabra)
	
	si Subcadena(palabra,0,0) == 'a' Entonces
		escribir "CORRECTO"
	SiNo
		escribir "INCORRECTO"
	FinSi
FinAlgoritmo
