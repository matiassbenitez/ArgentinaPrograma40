/*
  En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Entidad_ej1.Services;

import Entidad_ej1.Barco;
import Entidad_ej1.subClases.BarcosMotor;
import Entidad_ej1.subClases.Velero;
import Entidad_ej1.subClases.Yate;
import java.util.Scanner;

public class ServiceBarco {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    public Barco crearBarco() {
        System.out.println("Ingrese la matricula ");
        String matricula = leer.next();
        System.out.println("Ingrese la eslora(longitud de Popa a Proa)");
        int longitud = leer.nextInt();
        while (longitud < 0) {
            System.out.println("Error. Ingrese la eslora correctamente");
            longitud = leer.nextInt();
        }
        System.out.println("Ingrese el año del barco");
        int anio = leer.nextInt();
        while (anio <= 1900 || anio >= 2025) {
            System.out.println("Error. Ingrese correctamente el año");
            anio = leer.nextInt();
        }
        return new Barco(matricula, longitud, anio);
    }

    public BarcosMotor crearBm() {
        Barco b1 = crearBarco();
        System.out.println("Ingrese la potencia del motor (en CV) ");
        Double CVmotor = leer.nextDouble();
        return new BarcosMotor(CVmotor, b1.getMatricula(), b1.getEslora(), b1.getAnio());
    }

    public Yate crearYate() {
        Barco b1 = crearBarco();
        System.out.println("Ingrese la potencia del motor (en CV) ");
        Double CVmotor = leer.nextDouble();
        System.out.println("Ingrese la cantidad de camarotes");
        int numCamarotes = leer.nextInt();
        while (numCamarotes < 0) {
            System.out.println("Error. Ingrese los camarotes nuevamente");
            numCamarotes = leer.nextInt();
        }
        return new Yate(CVmotor, numCamarotes, b1.getMatricula(), b1.getEslora(), b1.getAnio());
    }

    public Velero crearVelero() {
        Barco b1 = crearBarco();
        System.out.println("Ingrese la cantidad de mastiles");
        int numMastil = leer.nextInt();
        return new Velero(numMastil, b1.getMatricula(), b1.getEslora(), b1.getAnio());
    }
    
    
}
