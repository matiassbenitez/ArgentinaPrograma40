//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.

Algoritmo porcentajeCurso
	definir ninios,ninias Como Entero
	definir pNinias, pNinios Como Real
	
	escribir "Ingrese la cantidad de ni�os que hay en el curso: "
	leer ninios
	escribir "Ingrese la cantidad de ni�as que hay en el curso: "
	leer ninias
	pNinios = (ninios/(ninios+ninias))*100
	pNinias = (ninias/(ninios+ninias))*100
	escribir "El porcentaje de ni�os dentro del curso es del " pNinios "%"
	escribir "El porcentaje de ni�as dentro del curso es del " pNinias "%"
	
FinAlgoritmo
