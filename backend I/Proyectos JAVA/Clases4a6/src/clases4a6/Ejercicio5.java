package clases4a6;

import java.util.Scanner;

/**
 *
 * @author elTuk
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lim, num, suma = 0;
        System.out.println("Ingrese el límite positivo: ");
        lim = leer.nextInt();
        while (lim<=0){
            System.out.println("El límite debe ser mayor a cero. Vuelva a ingresarlo: ");
            lim= leer.nextInt();
        }
        while(suma<=lim){
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            suma+=num;
        }
        System.out.println("La suma es: " + suma);
        System.out.println("El límite es: " + lim);
    }

}
