//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de niños, y la cantidad total de niñas que hay en el curso.

Algoritmo porcentajeCurso
	definir ninios,ninias Como Entero
	definir pNinias, pNinios Como Real
	
	escribir "Ingrese la cantidad de niños que hay en el curso: "
	leer ninios
	escribir "Ingrese la cantidad de niñas que hay en el curso: "
	leer ninias
	pNinios = (ninios/(ninios+ninias))*100
	pNinias = (ninias/(ninios+ninias))*100
	escribir "El porcentaje de niños dentro del curso es del " pNinios "%"
	escribir "El porcentaje de niñas dentro del curso es del " pNinias "%"
	
FinAlgoritmo
