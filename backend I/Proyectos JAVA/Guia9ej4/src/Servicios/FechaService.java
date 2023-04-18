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
package Servicios;

import java.util.Date;
import java.util.Scanner;


public class FechaService {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public static Date fechaNacimiento(){
         int dia, mes, anio;
         System.out.println("Ingrese el día: ");
         dia = leer.nextInt();
         System.out.println("Ingrese el mes: ");
         mes = leer.nextInt();
         System.out.println("Ingrese el año: ");
         anio = leer.nextInt();
         
         return new Date(anio,mes,dia);
         
     }
    
    public static Date fechaActual(){
        return new Date();
    }
    
    public static int diferencia(Date nac, Date act){
        int diferencia;
        diferencia = act.getYear()-nac.getYear();
        if (act.getMonth()<nac.getMonth()){
            diferencia--;
        }else if (act.getMonth()==nac.getMonth()){
            if (act.getDay()<nac.getDay()){
                diferencia--;
            }
        }
        
        
        return diferencia;
    }
}
