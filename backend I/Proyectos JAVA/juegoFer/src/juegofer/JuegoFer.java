package juegofer;

import java.util.Arrays;

public class JuegoFer {

    public static void main(String[] args) {

        int[] numeros = {-1, -1, -1, -1}; //arreglo declarado con valores que no puede obtener el random
        int indice;
        for (int i = 0; i < 4; i++) {           //ciclo para generar 4 números enteros aleatorios 
            indice = (int) (Math.random() * 10);    //genero el número aleatorio
            while (Arrays.binarySearch(numeros, indice) >= 0) { //mientras el número generado se encuentre en el arreglo, lo genera nuevamente
                indice = (int) (Math.random() * 10);    
            }
            numeros[i] = indice; //cuando encuentro un número que no se encuentre en el arreglo, lo agrego
        }
        System.out.println(Arrays.toString(numeros)); // muestro el arreglo de los 4 número generados, sin repetición
    }

}
