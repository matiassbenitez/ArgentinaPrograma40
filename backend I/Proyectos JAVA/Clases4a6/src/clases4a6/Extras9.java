package clases4a6;

import java.util.Scanner;

/**
 *
 * @author elTuk
 */
public class Extras9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cociente = 0, resto, divisor;
        System.out.println("Ingrese el dividendo: ");
        num = leer.nextInt();
        while (num <= 1) {
            System.out.println("El número debe ser mayor a 1, vuelva a ingresarlo: ");
            num = leer.nextInt();
        }
        System.out.println("Ingrese el divisor: ");
        divisor = leer.nextInt();
        while (divisor <= 1) {
            System.out.println("El número debe ser mayor a 1, vuelva a ingresarlo: ");
            divisor = leer.nextInt();
        }
        resto = num;
        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }
        System.out.println(num + "/" + divisor + "=" + cociente + " y su resto es " + resto);
    }

}
