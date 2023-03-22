
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class especialJuanpi {


    public static void main (String[] args){
        int n = 5;
        String [][] matriz = new String [n][n];
        int x = 0;
        int y = n-1;
        int z = 0;
        
        for (int j = 0; j < matriz.length; j++) {
            
            for (int i = x; i <= y; i++) { //fila superior
                matriz [x][i] = z++ + " ";
            }
            for (int i = x + 1; i <= y; i++) { //fila del extremo derecho
                matriz [i][y] = z++ + " ";
            }
            for (int i = y-1; i >=x; i--) {//fila inferior de derecha a izquierda
                matriz [y][i]= z++ + " ";
            }
            for (int i = y-1; i >= x + 1; i--) {//columna izquierda de abajo hacia arriba
                matriz [i][x] = z++ + " ";
            }
            x++;y--;
        }
        for (int f = 0; f < n; f++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[f][j] + "\t");
                
            }
            System.out.println("");
        }
    }
}
