
package clases4a6;

import java.util.Scanner;

/**
 * @author elTuk
 */
public class Extras1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int minutos, dias, horas;
        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = leer.nextInt();
        dias = minutos/1440;
        horas = (minutos%1440)/60;
        System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
    }

}
