
package clases4a6;

import java.util.Scanner;

/**
 * @author elTuk
 */
public class Extras3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.print("Ingrese una letra: ");
        letra = leer.next();
        letra = letra.toLowerCase();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("La letra ingresada ES UNA VOCAL.");
                break;
            default:
                System.out.println("El dato ingresado NO ES UNA VOCAL.");
        }
    }

}
