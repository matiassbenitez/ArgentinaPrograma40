/**
 * /**
 *  Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package coleccionesej1guia10.Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class RazaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarRazas(ArrayList<String> aux){
        String raza = "";
        String resp = "";
        do {
            System.out.println("Ingrese la raza de perro: ");
            raza = leer.next();
            aux.add(raza);
            System.out.println("Desea seguir ingresando razas? S/N");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));
    }
    public void mostrarRazas(ArrayList<String> aux){
        System.out.println("Las razas ingresadas son las siguientes: ");
        for (String raza : aux) {
            System.out.println(raza);
        }
    }
    public void eliminarRaza(ArrayList<String> aux){
        
        System.out.println("Ingrese la raza a eliminar: ");
        String raza = leer.next();
        Iterator<String> iterador = aux.iterator();
        while (iterador.hasNext()){
            if (iterador.next().equalsIgnoreCase(raza)){
                iterador.remove();
                System.out.println("Raza eliminada.");
            }else{
                if (!iterador.hasNext()){
                    System.out.println("La raza no se encontró.");
                }
            }
        }
    }
}
