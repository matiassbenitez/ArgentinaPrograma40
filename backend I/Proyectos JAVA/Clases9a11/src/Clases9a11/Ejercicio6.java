
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Ejercicio6 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
      
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                int valor = leer.nextInt();
                
                if (valor < 0 || valor > 9) {
                    System.out.println("El valor debe estar entre 1 y 9. Intente de nuevo.");
                    j--;
                } else {
                    matriz[i][j] = valor;
                }
            }
        }
        
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        boolean matrizMagica = true;
        
        int sumaFila = matriz[0][0] + matriz[0][1] + matriz[0][2];
       
        for (int i = 1; i < 3; i++) {
            int sumaFilaActual = matriz[i][0] + matriz[i][1] + matriz[i][2];
            if (sumaFilaActual != sumaFila) {
                matrizMagica = false;
                break;
            }
        }
        
        if (matrizMagica) {
            for (int j = 0; j < 3; j++) {
                int sumaColumna = matriz[0][j] + matriz[1][j] + matriz[2][j];
                if (sumaColumna != sumaFila) {
                    matrizMagica = false;
                    break;
                }
            }
        }
        
        if (matrizMagica) {
            int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
            int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
            if (sumaDiagonal1 != sumaFila || sumaDiagonal2 != sumaFila) {
                matrizMagica = false;
            }
        }
        
        if (matrizMagica) {
            System.out.println("La matriz ingresada es una matriz mágica.");
        } else {
            System.out.println("La matriz ingresada no es una matriz mágica.");
        }
    }
}