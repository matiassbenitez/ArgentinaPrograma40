/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " es: " + num*2);
        System.out.println("El triple de " + num + " es: " + num*3);
        System.out.println("La raíz cuadrada de " + num + " es: " + (Math.sqrt(num)));
        
    }
    
}
