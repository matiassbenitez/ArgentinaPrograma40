
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Kathy {

    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        int num, num1, n, n1;
        boolean comparacion;
        int x;
        x=0 ;
        comparacion=false ;
        System.out.println("Ingrese el tamaño del primer vector");
        n=leer.nextInt();
        int [] vector1= new int [n];
        System.out.println("Ingrese el tamaño del segundo vector");
        n1=leer.nextInt();
        int [] vector2= new int [n1];
        System.out.println("Ingrese los valores del primer vector");
        for (int i = 0; i < n; i++) {
            num=leer.nextInt();
            vector1[i]=num ;
        }
        System.out.println("Ingrese los valores del segundo vector");
        for (int i = 0; i < n1; i++) {
            num1=leer.nextInt();
            vector2[i]=num1 ;
        }
       
        while(vector2[x]==vector1[x]){
           x=x+1;
          
           comparacion=true;
        }

    }
}

