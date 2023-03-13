
package clases4a6;

import java.util.Scanner;

/**
 * @author elTuk
 */
public class Extras2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int A=2,B=4,C=6,D=8, aux;
        
        System.out.println("Valores iniciales:\nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valores actualizados:\nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
        
    }

}
