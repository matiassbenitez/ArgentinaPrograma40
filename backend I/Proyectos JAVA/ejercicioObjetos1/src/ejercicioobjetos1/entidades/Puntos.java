/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioobjetos1.entidades;

import java.util.Scanner;

/**
 *
 * @author Tuchito
 */
public class Puntos {
    
    private static Scanner leer = new Scanner(System.in);
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese x1: ");
        x1 = leer.nextInt();
        System.out.println("Ingrese y1: ");
        y1 = leer.nextInt();
        System.out.println("Ingrese x2: ");
        x2 = leer.nextInt();
        System.out.println("Ingrese y2: ");
        y2 = leer.nextInt();
    }
    
    public double distancia(){
        return Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));
    }
    
}
