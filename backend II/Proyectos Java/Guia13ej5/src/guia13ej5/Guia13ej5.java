/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
 * debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
 * ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
 * número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
 * ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
 * controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
 * carácter fallido como un intento.
 */
package guia13ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia13ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = (int) (Math.random() * 501);
        int n = 0;
        int contador = 0;
        boolean encontrado = false;
        System.out.println(num);
        System.out.println("El número ya fue elegido. Intente adivinarlo.");
        do {
            System.out.println("Ingrese un número: ");
            try {
                n = Integer.parseInt(leer.next());
                if (n > num) {
                    System.out.println("El número deber ser MENOR. Vuelva a ingresarlo: ");
                } else if (n < num) {
                    System.out.println("El número deber ser MAYOR. Vuelva a ingresarlo: ");
                } else {
                    encontrado = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR!!! No se ingresó un número.");
            }
            contador++;
        } while (!encontrado);
        System.out.println("Encontraste el número en " + contador + " intentos.");
    }

}
