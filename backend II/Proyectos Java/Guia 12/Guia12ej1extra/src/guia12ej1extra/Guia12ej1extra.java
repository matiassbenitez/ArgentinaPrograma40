/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
 * nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
 * amarre y el barco que lo ocupará.
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 * Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
 * • Número de mástiles para veleros.
 * • Potencia en CV para barcos a motor.
 * • Potencia en CV y número de camarotes para yates de lujo.
 * Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
 * alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
 * multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
 * sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
 * en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
 * el número de camarotes.
 * Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
 * métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
 * precio final de su alquiler.
 */
package guia12ej1extra;

import guia12ej1extra.entidades.Alquiler;
import guia12ej1extra.entidades.Barco;
import guia12ej1extra.entidades.BarcosServicios;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Guia12ej1extra {

    public static void main(String[] args) {
        ArrayList<Alquiler> alquileres = new ArrayList();
        alquileres.add(crearAlquiler());
        System.out.println(alquileres.toString());
        System.out.println("Costo alquiler: ");
        System.out.println(calcular(alquileres.get(0)));
        
    }

    public static Alquiler crearAlquiler() {
        BarcosServicios bs = new BarcosServicios();
        ArrayList<Barco> lista = bs.llenar();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Nombre: ");
        String nombre = "Matias"; //leer.next();
        System.out.println("Ingrese el documento: ");
        String dni = "123123"; //leer.next();
        System.out.println("Fecha de Alquiler:");
        System.out.println("Ingrese el día: ");
        int diaA = 22; //leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mesA = 03; //leer.nextInt();
        System.out.println("Ingrese el año: ");
        int anioA = 2023; //leer.nextInt();
        System.out.println("Fecha de Devolución: ");
        System.out.println("Ingrese el día: ");
        int diaD = 23; //leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mesD = 04; //leer.nextInt();
        System.out.println("Ingrese el año: ");
        int anioD = 2023; //leer.nextInt();
        int c = 1;
        System.out.println("Barcos disponibles, elija su opción: ");
        for (Barco barco : lista) {
            System.out.println(c + "-" + barco);
            c++;
        }
        int op = leer.nextInt();
        return new Alquiler(nombre, dni, new Date(anioA - 1900, mesA - 1, diaA), new Date(anioD - 1900, mesD - 1, diaD), op, lista.get(op - 1));
    }

    public static int calcular(Alquiler alquiler) {
        long fechaInicio = alquiler.getFechaAlquiler().getTime();
        long fechaFinal = alquiler.getFechaDevolucion().getTime();
        long diferencia = fechaFinal - fechaInicio;
        int dias = (int)((((diferencia/1000)/60)/60)/24);
        int costo = alquiler.getBarco().calcularModulo()*dias;
        return costo;
    }
}
