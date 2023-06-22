package guia9extrasclases;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Escribe un programa que encuentre todos los números primos menores o iguales
 * a un número entero ingresado por el usuario utilizando el algoritmo del criba
 * de Eratóstenes.
 */
public class Extras4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un número mayor a 2:");
        Integer num = leer.nextInt();
        while (num.compareTo(2)<0){
            System.out.println("El número ingresado debe ser mayor a 2, vuelva a ingresarlo:");
            num = leer.nextInt();
        }
        int cont = 2;        
        int [] arreglo = new int[num-1];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = cont+i;
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != -1 && Math.pow(arreglo[i], 2)<num){
                for (int j = i+1; j < arreglo.length; j++) {
                    if (arreglo[j]%arreglo[i] == 0){
                        arreglo[j]=-1;
                    }
                }
            }
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != -1){
                System.out.print("[" + arreglo[i] + "]");
            }else{
                System.out.print("");
            }
        }
        System.out.println("");
       // System.out.println(Arrays.toString(arreglo));
        
    }

}
