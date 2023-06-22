/**
 *  Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package coleccionesej1guia10;

import coleccionesej1guia10.Servicios.RazaService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ColeccionesEj1Guia10 {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        RazaService rs = new RazaService();
        rs.cargarRazas(razas);
        rs.mostrarRazas(razas);
        rs.eliminarRaza(razas);
        Collections.sort(razas);
        System.out.println("Razas ordenadas: ");
        rs.mostrarRazas(razas);
    }
}
