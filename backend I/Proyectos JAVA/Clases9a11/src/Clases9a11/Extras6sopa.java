
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Extras6sopa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] [] sopa = new String [20] [20];
        String palabra;
        int m = 0;
        int n = 0;
        boolean solapado;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra");
            palabra = leer.next();
            while (palabra.length() < 3 || palabra.length() >5) {                
                System.out.println("Error, palabra demasiado larga o corta. Inténtelo nuevamente");
                palabra = leer.next();
            }
            do {
                solapado = false;
                m = (int) (Math.random()*20);
                n = (int) (Math.random()*20);
                if (m > 19-palabra.length()+1) {
                    solapado = true;
                }
                if (!solapado) {
                    for (int j = m; j < m+palabra.length()-1; j++) {
                        if (sopa [n] [m] != null) {
                            solapado = true;
                        }
                    }
                }
            } while (solapado);
            for (int j = m; j < m+palabra.length(); j++) {
                sopa [n] [j] = palabra.substring(j-m, j-m+1);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa [i] [j] == null) {
                    sopa [i] [j] = String.valueOf((int) (Math.random()*9-1+1)+1);
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa [i] [j] + "]");
            }
            System.out.println("");
        }
    }

}
