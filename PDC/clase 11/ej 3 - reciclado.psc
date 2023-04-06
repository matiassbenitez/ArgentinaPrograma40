////Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
////máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
////nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra
////cuenta.
////? Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
////verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
////correcta haremos que una variable llamada Login sea verdadera.
////? Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un
////bucle Mientras para darle al usuario sólo 3 intentos para poner la contraseña.

////? Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al
////menú de opciones:
////	o Ingresar botellas
////	o Consultar saldo
////	o Salir
////						
////2
////? Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema.
////Una vez que tenemos el número vamos a usar un bucle para, a fin de ir ingresando
////cada botella. En cada ciclo del bucle se debe generar un número aleatorio entre 100 y
////3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario está
////ingresando botellas en la máquina). Una vez generado, según el peso del material,
////usaremos un condicional múltiple para asignarle un valor monetario:
////		o Si es menos de 500 gr, corresponden $50
////		o Si es entre 501 gr y 1500 gr, corresponden $125
////		o Si es más de 1501 gr, corresponden $200
////Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
////ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
////material (sólo mostrar en pantalla "Devolviendo material"). Para esto usaremos un
////condicional doble.
////? Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
////? Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú
////principal.

Algoritmo reciclado
	definir usuario, pass como cadena
	definir login como logico
	definir intentos, opc, cantBot, i Como Entero
	definir peso, saldo, monto Como Real
	definir resp como caracter
	
	escribir "Ingrese su nombre de usuario: "
	leer usuario
	
	si usuario == 'Albus_D' Entonces
		intentos = 1
		escribir "Ingresar contraseña: "
		leer pass
		mientras intentos<3 Y pass <> 'caramelosDeLimon' Hacer
			intentos= intentos + 1
			escribir "Contraseña incorrecta. Ingrésela nuevamente: "
			leer pass
		FinMientras
		
		si pass == 'caramelosDeLimon' Entonces
			login = Verdadero
			saldo = 0
			escribir "Contraseña correcta."
		SiNo
			login = Falso
			escribir "Supero la cantidad de intentos permitidos."
		FinSi
	SiNo
		login = Falso
	FinSi
	
	si login Entonces
		Hacer
			hacer
				escribir "MENU"
				escribir "1 - Ingresar botellas."
				escribir "2 - Consultar saldo."
				escribir "3 - Salir."
				escribir ""
				escribir "Ingrese una opción: "
				leer opc
			Mientras Que opc<1 O opc>3
			
			segun opc Hacer
				1:
					escribir "INGRESAR BOTELLAS"
					escribir "Ingresar la cantidad de botellas a reciclar: "
					leer cantBot
					para i = 1 hasta cantBot Hacer
						peso = aleatorio(100,3000)
						escribir "El peso de la " i "º botella es: " peso
						
						si peso <= 500 Entonces
							escribir "Le corresponden $50."
							monto = 50
						SiNo
							si peso <= 1500 Entonces
								escribir "Le corresponden $125."
								monto = 125
							SiNo
								escribir "Le corresponden $200."
								monto = 200
							FinSi
						FinSi
						
						escribir "Acepta la oferta realizada? s/n: "
						leer resp
						resp = Minusculas(resp)
						mientras resp<>'n' Y resp<>'s'
							escribir "Respuesta incorrecta. s/n: "
							leer resp
						FinMientras
						
						si resp == 's' Entonces
							saldo = saldo + monto
						SiNo
							escribir "Devoviendo material."
						FinSi
					FinPara
				2:
					escribir "CONSULTA DE SALDO."
					escribir "Su saldo actual es de $" saldo "."
			FinSegun
		mientras que opc <>3
		escribir "Ha finalizado el programa. Hasta luego."
	FinSi
	
FinAlgoritmo
//usuario y contraseña








