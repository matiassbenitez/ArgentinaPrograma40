
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int[] cantidad = new int[5];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100000);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
            cantidad[contar(vector[i])-1]++;    //voy sumando 1 a cada cantidad[X] siendo X la cantidad de dígitos
        }
        System.out.println("");
        for (int i = 0; i < cantidad.length; i++) {
            System.out.println("Tienen " + (i+1) + " dígitos: " + cantidad[i]);
        }
    }
    public static int contar(int a){
        int cont=0;
        while (a>0){
            a = a/10;
            cont++;
        }
        return cont;
    }

}
