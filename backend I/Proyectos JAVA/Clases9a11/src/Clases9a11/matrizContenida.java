
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class matrizContenida {

    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] retornoMatrizM = DimensionYLlenadoDeMatrizM(matrizM);
        matrizM = retornoMatrizM;
        int[][] matrizP = new int[3][3];
        int[][] retornoMatrizP = DimensionYLlenadoDeMatrizP(matrizM, matrizP);
        matrizP = retornoMatrizP;
        boolean retornoContencion = buscarElemento(matrizM, matrizP);
        System.out.println("La matriz P está contenida dentro de la matriz M? " + retornoContencion);
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizP[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static int[][] DimensionYLlenadoDeMatrizM(int[][] matrizM) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 99);
            }
        }
        return matrizM;
    }

    public static int[][] DimensionYLlenadoDeMatrizP(int[][] matrizM, int[][] matrizP) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Ingrese los valores a buscar en la matriz grande");
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                System.out.println("Posición: " + i + "," + j);
                matrizP[i][j] = leer.nextInt();
            }
        }
        System.out.println("");
        return matrizP;
    }
    
    public static boolean buscarElemento(int [] [] matrizM, int [] [] matrizP){
        int num = matrizP [0] [0];
        boolean encontrado = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM [i] [j] == num) {
                    encontrado = buscarMatriz (i, j, matrizM, matrizP);
                    if (encontrado) {
                        return encontrado;
                    }
                }
            }
        }
        return encontrado;
    }
    
    public static boolean buscarMatriz(int i, int j, int [] [] matrizM, int [] [] matrizP){
        boolean igualdad = true;
        for (int k = i; k < i+2; k++) {
            for (int l = j; l < j+2; l++) {
                if (matrizM [k] [l] != matrizP [k-i] [l-j]) {
                    igualdad = false;
                }
            }
        }
        return igualdad;
    }
    
}
