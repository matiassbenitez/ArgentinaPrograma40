
package clases4a6;

import java.util.Scanner;

/**
 *
 * @author elTuk
 */
public class Teoria8 {

    public static void main(String[] args) {
        double nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        nota = leer.nextDouble();
        while (nota<0 || nota>10){
            System.out.println("Nota fuera de rango, vuelva a ingresarla: ");
            nota = leer.nextDouble();
        }
    }
}
