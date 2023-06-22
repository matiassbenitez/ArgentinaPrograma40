package javaapplication42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class JavaApplication42 {

    public static void main(String[] args) {
        ArrayList<String> raza = new ArrayList();
        Scanner leer = new Scanner(System.in);
        

        while (true) {
            System.out.println("Qué raza agregamos?");
            raza.add(leer.next());
            System.out.println("Queres agregar otra raza de perro? ");
            System.out.println("Ingresa S para confirmar o N para salir ");
            if (!leer.next().equalsIgnoreCase("s")) {
                break;
            }
        }
        Iterator<String> busquedad = raza.iterator();
            System.out.println("Qué raza buscamos?");
            String buscar = leer.next();
            
        while (busquedad.hasNext()) {
            String nombre = busquedad.next();
            System.out.println(nombre);
            if (nombre.equalsIgnoreCase(buscar)) {
                System.out.println("esta la raza");
                busquedad.remove();
     
                break;
            } else {


            }
        }
               Collections.sort(raza);
                for (String r : raza) {
                    System.out.println(". " + r);
                }
    }
}