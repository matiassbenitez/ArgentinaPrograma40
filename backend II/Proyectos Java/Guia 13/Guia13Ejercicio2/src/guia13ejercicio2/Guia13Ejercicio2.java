/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio2;

import Entity.Autos;

/**
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
 * código para generar y capturar una excepción ArrayIndexOutOfBoundsException
 * (índice de arreglo fuera de rango).
 *
 * @author godoy
 */
public class Guia13Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autos a = new Autos();
        
        try{
            System.out.println(a.getMarcaAutos()[6]);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.fillInStackTrace());
            System.out.println("Te saliste del rango mostro");
        }
        
        
    }

}
