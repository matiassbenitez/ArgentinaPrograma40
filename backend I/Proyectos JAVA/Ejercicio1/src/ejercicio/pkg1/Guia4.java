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
public class Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // F=32+(9*c/5)
        double tempC,tempF;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en ºC: ");
        tempC = leer.nextDouble();
        tempF = 32 + (tempC * 9/5);
        System.out.println("La temperatura es de " + tempF + "ºF.");
    }
    
}
