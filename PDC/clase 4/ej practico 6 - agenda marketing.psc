//En medio de la auditoría interna, el equipo está cubriendo a un compañero de trabajo que
//está de licencia. Su compañero de trabajo ha dejado un mensaje con las tareas a realizar.

//"¡Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja
//de cálculo de ingresos mensuales. Puedes hacerlo buscando los últimos ingresos
//publicitarios en los informes de marketing. Después de hacer todo eso, revisa mi correo
//electrónico y si hay menos de 10 correos sin leer revisa mi correo de voz para ver si hay
//alguna solicitud de los ejecutivos. Si hay tales solicitudes, hágalas primero a menos que
//tenga una solicitud de emergencia de otro departamento. Una vez que hayas terminado
//con la solicitud de cumplimiento, riegue la planta de mi escritorio después de apagar la
//computadora. Ah, espera, debería haber mencionado un par de cosas: debes iniciar
//sesión con usuario de administrador para ver los informes de marketing, y tendrás que
//enviarme un correo electrónico de actualización justo después de que termines de
//manejar las solicitudes. Bueno, gracias de nuevo. ¡Es de gran ayuda! Te debo el almuerzo
//cuando regrese." [Continua en la siguiente página]

//Nuestra tarea será imprimir por pantalla la lista de tareas en el orden que corresponden
//para que luego las podamos realizar. ¿Te animas a colocar las tareas en el orden correcto?
//Para hacer esto, debes crear en PSeInt la cantidad de variables que creas correctas y
//asignarles valor

Algoritmo ingresos_mensuales
	definir correoSinLeer, solicitudEjecutivos, solicitudEmergencia como entero
	
	correoSinLeer = 6
	solicitudEjecutivos = 3
	solicitudEmergencia = 0
	
	escribir "Iniciar sesión como administrador."
	escribir "Buscar últimos ingresos publicitarios en los informes de Marketing."
	escribir "Completar la hoja de cálculos de ingresos mensuales."
	escribir "Revisar correo electrónico."
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
	
	escribir "Enviar correo de actualización."
	escribir "Apagar la PC."
	escribir "Regar planta."
	
FinAlgoritmo
