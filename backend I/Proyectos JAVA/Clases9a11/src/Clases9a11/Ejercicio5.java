
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int matriz[][] = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int traspuesta[][] = new int[3][3];
        boolean check=true;

        
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) { //Filas
            for (int j = 0; j < 3; j++) { //Columnas
               // matriz[i][j] = (int) (Math.random() * (10 - 0 + 1) + 0);
               if (matriz[i][j]<0){System.out.print(matriz[i][j] + ", ");}
               else {System.out.print(" "+matriz[i][j] + ", ");}
            } 
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Traspuesta:");
        for (int j = 0; j < 3; j++) {//filas
            for (int i = 0; i < 3; i++) {//columnas
                traspuesta[j][i] = matriz[i][j];
               if (matriz[i][j]<0){System.out.print(matriz[i][j] + ", ");}
               else {System.out.print(" "+matriz[i][j] + ", ");}
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j]!= -(traspuesta[i][j])){
                        check=false;
                    }
                }
        }
        
        if (check){System.out.println("Es antisimetrica");}
        else System.out.println("No es antisimétrica");
    }

}
