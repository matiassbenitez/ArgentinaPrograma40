Proceso Ejercicio4
	//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y termi-
	//nada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vo-
	//cal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (inclu-
	//yendo a las vocales acentuadas) se mantienen sin cambios.
	//a e i o u
	//@ # $ % *
	//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación co-
	//rrespondiente. Utilice la estructura "según" para la transformación.
	//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
	//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
	//NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
	
	Definir frase Como Caracter

	Escribir "Ingrese una frase "
	Leer frase
	reemplazoletras(frase)
	
FinProceso

subproceso reemplazoletras (frase Por Referencia)
	Definir i, k como entero
	Definir frase2 Como Caracter
	i=Longitud(frase)
    frase2=""
	
	Para k=0 Hasta i-1 Con Paso 1 Hacer
		
		Segun SubCadena(frase,k,k) Hacer
			"A", "a":
				frase2= Concatenar(frase2,"@")
			"E", "e":
				frase2= Concatenar(frase2,"#")
			"I", "i":
				frase2= Concatenar(frase2,"$")
			"O", "o":
				frase2= Concatenar(frase2,"%")
			"U", "u":
				frase2= Concatenar(frase2,"*")
				
			De Otro Modo:
				frase2 =Concatenar(frase2,SubCadena(frase,k,k))
				
		Fin Segun
	Fin Para
			Escribir frase2
	
	FinSubProceso
	