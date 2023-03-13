/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases4a6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Teoria6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        if (num1>25 || num2>25){
                System.out.println("Uno o ambos números son mayores a 25");
        }else{
            System.out.println("Ningún número es mayor a 25");
        }
    }
    
}
