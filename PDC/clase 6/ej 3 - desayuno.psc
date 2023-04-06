///  Es tu turno, diseña un condicional anidado que le pregunte al usuario si quiere tomar té o café y
///	en caso de que quiera tomar café, preguntar si solo o cortado y en caso de ser cortado, si prefiere
///	leche vegetal

Algoritmo desayuno
	
	definir resp como cadena
	escribir "Para el desayuno, quiere té o café?"
	leer resp
	resp = Minusculas(resp)
	si resp == "cafe" O resp == "café" Entonces
		escribir "Cómo desea el café? Solo o cortado?"
		leer resp
		resp = Minusculas(resp)
		si resp == "cortado" Entonces
			escribir "Prefiere la leche vegetal?"
			leer resp
			resp = Minusculas(resp)
			si resp == "si" Entonces
				escribir "Se le servirá un café cortado con leche vegetal."
			SiNo
				escribir "Se le servirá un café cortado con leche de vaca."
			FinSi
		SiNo
			escribir "Se le servirá un cafe solo."
		FinSi
	SiNo
		escribir "Se le servirá un té."
	FinSi
	
FinAlgoritmo
