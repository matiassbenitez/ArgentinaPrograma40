/**
 * clase: Armadura
 * color primario
 * color secundario
 * botas[]
 * guantes[]
 * consola
 * sintetizador
 * integridad
 * bateria
 * reactor
 * ubicacion
 * 
 * 
 */
package guia13integrador;

import guia13integrador.entidades.Armadura;


public class Guia13Integrador {

    public static void main(String[] args) {
        
        Armadura arm = new Armadura();
        System.out.println(arm.getBotas()[0].getConsumo());
        System.out.println(arm.toString());
        
    }

}
