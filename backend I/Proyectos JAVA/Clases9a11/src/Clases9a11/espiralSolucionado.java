
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class espiralSolucionado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cnt = 0, contNum = 0;
        int[][] matriz = new int[6][6];

        do {
            for (int j = cnt; j < 5-cnt; j++) {
                contNum++;
                matriz[cnt][j] = contNum;
            }
            for (int i = cnt; i < 5-cnt; i++) {
                contNum++;
                matriz[i][5 - cnt] = contNum;
            }
            for (int j = 5-cnt; j > cnt; j--) {
                contNum++;
                matriz[5 - cnt][j] = contNum;
            }
            for (int i = 5-cnt; i > cnt; i--) {
                contNum++;
                matriz[i][cnt] = contNum;
            }
            cnt++;

        } while (contNum < 36);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

