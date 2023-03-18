
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Ejercicio5fer {

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensione las matrices");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un valor para la posición " + i + "," + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz original: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  " + matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  " + matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        boolean retorno = checkAsimetrico(matriz, n, aux);
        System.out.println("Las matrices son asimétricas? " + retorno);

    }

    public static boolean checkAsimetrico(int[][] matriz, int n, int aux) {
        boolean asimetria = (aux == 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                asimetria = (aux == -matriz[i][j]);
            }
        }
        return asimetria;
    }
}