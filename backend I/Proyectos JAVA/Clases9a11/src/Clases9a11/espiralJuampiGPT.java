
package Clases9a11;

/**
 * @author Tuchito
 */
public class espiralJuampiGPT {

    public static void main(String[] args) {
        int dimension = 5;
        int z = 0;
        int x = 0;
        int y = dimension - 1;
        int[][] matriz = new int[dimension][dimension];

        while (z < dimension * dimension) {
            for (int i = x; i <= y; i++) { // fila superior
                matriz[x][i] = ++z;
            }
            for (int i = x + 1; i <= y; i++) { // columna del extremo derecho
                matriz[i][y] = ++z;
            }
            for (int i = y - 1; i >= x; i--) { // fila inferior de derecha a izquierda
                matriz[y][i] = ++z;
            }
            for (int i = y - 1; i >= x + 1; i--) { // columna izquierda de abajo hacia arriba
                matriz[i][x] = ++z;
            }
            x++;
            y--;
        }

        for (int[] fila : matriz) {
            for (int valorElemento : fila) {
                System.out.print(valorElemento + "\t");
            }
            System.out.println();
        }
    }
}