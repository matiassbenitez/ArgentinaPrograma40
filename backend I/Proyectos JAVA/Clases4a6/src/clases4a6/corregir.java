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
public class corregir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el tiempo en minutos: ");
        int minutos = scanner.nextInt();
        int dias = minutos/1440;
        System.out.println(minutos + " minutos son equivalentes a " + dias + " dias");
    }
    
}
