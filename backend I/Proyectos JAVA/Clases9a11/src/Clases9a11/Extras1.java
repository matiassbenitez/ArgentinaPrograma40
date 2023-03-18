
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Extras1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num=0; 
        int vector[] ;
        vector = new int [5];
//      System.out.println("Por favor introduzca un tamaño para el vector");
//      int num=(int) leer.nextInt();
        
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < 5; i++) {
            num += vector[i];
        }
        
        for (int i=0; i<5; i++){
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println(num);
       }
    }