//En medio de la auditor�a interna, el equipo est� cubriendo a un compa�ero de trabajo que
//est� de licencia. Su compa�ero de trabajo ha dejado un mensaje con las tareas a realizar.

//"�Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja
//de c�lculo de ingresos mensuales. Puedes hacerlo buscando los �ltimos ingresos
//publicitarios en los informes de marketing. Despu�s de hacer todo eso, revisa mi correo
//electr�nico y si hay menos de 10 correos sin leer revisa mi correo de voz para ver si hay
//alguna solicitud de los ejecutivos. Si hay tales solicitudes, h�galas primero a menos que
//tenga una solicitud de emergencia de otro departamento. Una vez que hayas terminado
//con la solicitud de cumplimiento, riegue la planta de mi escritorio despu�s de apagar la
//computadora. Ah, espera, deber�a haber mencionado un par de cosas: debes iniciar
//sesi�n con usuario de administrador para ver los informes de marketing, y tendr�s que
//enviarme un correo electr�nico de actualizaci�n justo despu�s de que termines de
//manejar las solicitudes. Bueno, gracias de nuevo. �Es de gran ayuda! Te debo el almuerzo
//cuando regrese." [Continua en la siguiente p�gina]

//Nuestra tarea ser� imprimir por pantalla la lista de tareas en el orden que corresponden
//para que luego las podamos realizar. �Te animas a colocar las tareas en el orden correcto?
//Para hacer esto, debes crear en PSeInt la cantidad de variables que creas correctas y
//asignarles valor

Algoritmo ingresos_mensuales
	definir correoSinLeer, solicitudEjecutivos, solicitudEmergencia como entero
	
	correoSinLeer = 6
	solicitudEjecutivos = 3
	solicitudEmergencia = 0
	
	escribir "Iniciar sesi�n como administrador."
	escribir "Buscar �ltimos ingresos publicitarios en los informes de Marketing."
	escribir "Completar la hoja de c�lculos de ingresos mensuales."
	escribir "Revisar correo electr�nico."
	si correoSinLeer<10 Entonces
		escribir "Revisar correo de voz."
	FinSi
	
	si correoSinLeer>=10 Entonces
		solicitudEjecutivos=0
		solicitudEmergencia=0
	FinSi                                  //Consultar
	
	si solicitudEmergencia>0 Entonces
		escribir "Atender solicitudes de emergencia."
	FinSi
	
	si solicitudEjecutivos>0 Entonces
		escribir "Atender solicitudes de ejecutivos."
	FinSi
	
	escribir "Enviar correo de actualizaci�n."
	escribir "Apagar la PC."
	escribir "Regar planta."
	
FinAlgoritmo
