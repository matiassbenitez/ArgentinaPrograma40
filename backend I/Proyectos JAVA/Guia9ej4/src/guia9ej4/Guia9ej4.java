/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).

*/
package guia9ej4;

import Servicios.FechaService;
import java.util.Date;





public class Guia9ej4 {

    public static void main(String[] args) {
        
        Date fecha = FechaService.fechaNacimiento();
        System.out.println(fecha);
        Date fechaAct = FechaService.fechaActual();
        System.out.println(fechaAct);
        System.out.println("la edad es: "+FechaService.diferencia(fecha, fechaAct));
        
    }

}
