/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2objetos;

import ejercicio2objetos.ServicioCincunferencia.ServicioCircunferencia;
import ejercicio2objetos.entidades.Circunferencia;

/**
 *
 * @author MATIAS
 */
public class Main {


    public static void main(String[] args) {
        ServicioCircunferencia sc = new ServicioCircunferencia();
        
        Circunferencia c1 = sc.crearCircunferencia();
        System.out.println(c1);
        c1.setRadio(5);
        System.out.println(c1);
        
    }
    
}
