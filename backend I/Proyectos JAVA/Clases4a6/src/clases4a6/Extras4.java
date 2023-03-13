
package clases4a6;

import java.util.Scanner;

/**
 * @author elTuk
 */
public class Extras4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número entre 1 y 10: ");
        num = leer.nextInt();
        while (num<1 || num>10){
            System.out.println("Número fuera de rango, vuelva a ingresarlo: ");
            num = leer.nextInt();
        }
        if (num%10==0){
            System.out.println("X");
        }else{
            if (num%5<=3){
                if(num/5!=0){
                        System.out.print("V");
                    }
                for (int i = 0; i < num%5; i++) {
                    System.out.print("I");
                }
                System.out.println("");
            }else{
                System.out.print("I");
                if(num%4==0){
                    System.out.println("V");
                }else{
                    System.out.println("X");
                }
            }
        }
    }   
}
