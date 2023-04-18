
package guia9ej2;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosServicio;


public class Guia9ej2 {

    public static void main(String[] args) {
     
        ParDeNumeros par = new ParDeNumeros();

        ParDeNumerosServicio.mostrarNumeros(par);
        System.out.println("Mayor: " + ParDeNumerosServicio.devolverMayor(par));
        System.out.println("Potencia: " + ParDeNumerosServicio.calcularPotencia(par));
        System.out.println("Raíz: " + ParDeNumerosServicio.calculaRaiz(par));
        
    }

}
