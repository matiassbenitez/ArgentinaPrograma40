
package Clases9a11;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Ejercicio2 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector ");
        int N = sc.nextInt();
        
        System.out.println("Ingrese el numero que desea buscar");
        int buscarNumero = sc.nextInt();
        
        int[] numeros = new int [N];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*5+1);
            
        }
        boolean encontrado = false;
        boolean repetido = false;
        String posiciones="";
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==buscarNumero){
                if (encontrado){
                    repetido = true;
                }
                encontrado=true;
                posiciones+=i+" ";
            }
            
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("["+numeros[i]+"]");
            
        }
        System.out.println("");
        
       
        if(encontrado){
            System.out.println("El número "+ buscarNumero+ " se encuentra en las posiciones " + posiciones);
            if (repetido){
                System.out.println("El número "+buscarNumero+" se encuentra repetido");
            }
        }else{
            System.out.println("El número "+buscarNumero+ " no se encuentra en el vector");
        }
    }
}
