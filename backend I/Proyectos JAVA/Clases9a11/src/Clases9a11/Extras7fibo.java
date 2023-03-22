
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Extras7fibo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            if (i<2) {
                vector[i]=1;
            }else{
                vector[i]=vector[i-1] + vector[i-2];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }

}
