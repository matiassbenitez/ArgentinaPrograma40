/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio1;

import Entity.Persona;
import java.util.Scanner;

/**
 * Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null
 * y tratar de invocar el método esMayorDeEdad() a través de ese objeto. Luego,
 * englobe el código con una cláusula try-catch para probar la nueva excepción
 * que debe ser controlada.
 *
 * @author godoy
 */
public class Guia13Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona(null,"Pablo");
        Scanner sc = new Scanner(System.in);
       
        
        try {
            System.out.println(p.esMayorDeEdad());
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            System.out.println("No se definio la edad");
            System.out.println("Llene la edad: ");
            p.setEdad(sc.nextInt());
            System.out.println(p.getEdad());
            System.out.println(p.esMayorDeEdad());
        }
    }

}
