
package Clases7a8;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Ejercicio4a {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un Número:"); 
        int num = reader.nextInt();
        boolean retorno = NumerosPrimos(num);
        
        System.out.println("La Afirmacion el Número es Primo = " + retorno);
    }
    public static boolean NumerosPrimos(int num){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=num)){
            if (num % contador == 0)
            primo = false;
            contador++;
        } 
        return primo;
    }
}