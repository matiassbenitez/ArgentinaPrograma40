///  Es tu turno, dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
///	en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si prefiere
///	leche vegetal

Algoritmo desayuno
	
	definir resp como cadena
	escribir "Para el desayuno, quiere t� o caf�?"
	leer resp
	resp = Minusculas(resp)
	si resp == "cafe" O resp == "caf�" Entonces
		escribir "C�mo desea el caf�? Solo o cortado?"
		leer resp
		resp = Minusculas(resp)
		si resp == "cortado" Entonces
			escribir "Prefiere la leche vegetal?"
			leer resp
			resp = Minusculas(resp)
			si resp == "si" Entonces
				escribir "Se le servir� un caf� cortado con leche vegetal."
			SiNo
				escribir "Se le servir� un caf� cortado con leche de vaca."
			FinSi
		SiNo
			escribir "Se le servir� un cafe solo."
		FinSi
	SiNo
		escribir "Se le servir� un t�."
	FinSi
	
FinAlgoritmo
