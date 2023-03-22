
package Clases9a11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Extras5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        int suma = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10);
                suma += matriz[i][j];
            }
        }
        
        System.out.println("Para la siguiente matriz:");
        for (int i = 0; i < filas; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        
        System.out.printf("La suma de todos sus elementos es %d.", suma);

    }

}
