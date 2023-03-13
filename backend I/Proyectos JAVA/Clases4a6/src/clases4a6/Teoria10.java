
package clases4a6;

import java.util.Scanner;
/**
 *
 * @author elTuk
 */
public class Teoria10 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        for (int i=1;i<5;i++){
            System.out.println("Ingrese el " + i + "º número: ");
            num = leer.nextInt();
            while (num<1 || num>20){
                System.out.println("Número fuera de rango(1-20), vuelva a ingresarlo: ");
                num = leer.nextInt();
            }
            for (int j=0; j<num;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
