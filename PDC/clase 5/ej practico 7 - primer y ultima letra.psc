///Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
///primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
///mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
///"INCORRECTO"

Algoritmo primeraUltimaLetra
	definir palabra como cadena
	definir long Como Entero
	
	escribir "Ingrese una palabra o frase: "
	leer palabra
	
	palabra = Minusculas(palabra)
	long = Longitud(palabra)
	
	si Subcadena(palabra,0,0) == Subcadena(palabra,long-1,long-1) Entonces
		escribir "CORRECTO"
	SiNo
		escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo