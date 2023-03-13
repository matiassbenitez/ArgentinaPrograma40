
package clases4a6;

import java.util.Scanner;
/**
 *
 * @author elTuk
 */
public class meet1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        if (num%2==0){
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
        }
        
    }

}
