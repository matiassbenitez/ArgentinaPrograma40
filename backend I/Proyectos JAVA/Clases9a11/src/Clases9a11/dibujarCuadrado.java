

package Clases9a11;

import java.util.Scanner;

/**
 *
 * @author Tuchito
 */
public class dibujarCuadrado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int base = 5;
        int altura = 4;
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i==0 || i == base-1){
                    System.out.print(" * ");
                }else{
                    if (j==0 || j == altura-1){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println("");
        }
    }

}
