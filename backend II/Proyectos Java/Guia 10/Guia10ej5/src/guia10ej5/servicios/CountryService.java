/**
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
 * usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
 * conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
 * si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
 * los servicios en la clase correspondiente)
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
 * cómo se ordena un conjunto.
 * Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
 * buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
 * usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
 * al usuario
 */
package guia10ej5.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CountryService {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static HashSet<String> countries = new HashSet();
    static ArrayList<String> arrayCountries;

    public static void addCountries() {
        String ans;
        do {
            System.out.println("Write the name of the country: ");
            String country = leer.next();
            countries.add(country);
            System.out.println("Do you want to continue? y/n");
            ans = leer.next();
        } while (ans.equalsIgnoreCase("y"));
        showCountries();
    }

    public static void showCountries() {
        System.out.println("Countries:");
        for (String country : countries) {
            System.out.println(country);
        }
        System.out.println("");
    }

    public static void sortCountries() {
        arrayCountries = new ArrayList(countries);
        Collections.sort(arrayCountries);
    }

    public static void showArrayCountries() {
        System.out.println("Countries:");
        for (String country : arrayCountries) {
            System.out.println(country);
        }
        System.out.println("");
    }

    public static void searchAndDestroyCountry() {
        System.out.println("Write the name of the country to eliminate: ");
        String name = leer.next();
        Iterator iterator = countries.iterator();
        boolean found = false;
        while (iterator.hasNext() && !found) {
            if (iterator.next().equals(name)) {
                found = true;
                iterator.remove();  // tambien se puede hacer con countries.remove(name);
            }
        }
        if (!found) {
            System.out.println("The country doesn't exist.");
        } else {
            showCountries();
        }
    }

}
