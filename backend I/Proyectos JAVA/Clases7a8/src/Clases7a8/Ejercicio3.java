
package Clases7a8;

import java.util.Scanner;

/**
 * @author Tuchito
 * Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int op;
        float importe;
        System.out.println("Ingrese el importe en euros: ");
        importe = leer.nextFloat();
        System.out.println("MENU\n1-Libras\n2-Dólares\n3-Yenes");
        System.out.println("Ingrese su opción: ");
        op = leer.nextInt();
        convertir(op, importe);
               

    }
    
    public static void convertir(int op, float importe){
        float total;
        switch (op) {
            case 1:
                total = (float)0.86 * importe;
                System.out.println(importe + " Euros es equivalente a " + total + " Libras");
                break;
            case 2:
                total = (float)1.28611 * importe;
                System.out.println(importe + " Euros es equivalente a " + total + " Dólares");
                break;
            case 3:
                total = (float)129.852 * importe;
                System.out.println(importe + " Euros es equivalente a " + total + " Yenes");
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }

}
