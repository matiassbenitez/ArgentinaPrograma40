/*
Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.

 */
package Servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    public static Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de nacimiento: ");
        int anio = leer.nextInt()-1900;
        Date fechaNac = new Date(anio, mes, dia);

        return new Persona(nombre, fechaNac);
    }

    public static int calcularEdad(Persona p) {
        int diferencia;
        Date act = new Date();
        diferencia = act.getYear() - p.getFechaNac().getYear();
        if (act.getMonth() < p.getFechaNac().getMonth()) {
            diferencia--;
        } else if (act.getMonth() == p.getFechaNac().getMonth()) {
            if (act.getDay() < p.getFechaNac().getDay()) {
                diferencia--;
            }
        }
        return diferencia;
    }

    public static boolean menorQue(Persona p, int edad) {

        if (PersonaService.calcularEdad(p) < edad) {
            return true;
        } else {
            return false;
        }

    }

    public static void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaNac().getDate()+ "/" + p.getFechaNac().getMonth() + "/" + p.getFechaNac().getYear());
    }
}
