
package guia95;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Guia95 {

 static Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        /*
        Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
         */
        //TreeSet <Integer>numeros = new TreeSet(); 
        TreeSet<String> Paises = new TreeSet();
        String pais, resp = "", PaisaBuscar;
        int c = 0;
        do {
            System.out.println("Ingrese paises: ");
            pais = entrada.next();
            Paises.add(pais);
            if (c == 3) {
                System.out.println("¿Desea continuar ingresando paises?");
                System.out.println("Si || No");
                resp = entrada.next().substring(0, 1).toUpperCase();
                c = 0;
            } else {
                c++;
            }

        } while (!resp.equalsIgnoreCase("N"));
        //// Podemos especificar el tipo de Iterator, o podemos hacer el casteo
        /// en el If (String) iterador.next;
        Iterator<String> iterador = Paises.iterator();
        System.out.println("Ingrese pais a buscar: ");
        PaisaBuscar = entrada.next();
        while (iterador.hasNext()) {
            if (PaisaBuscar.equalsIgnoreCase(iterador.next())) {
                iterador.remove();
            }
        }
        for (String Paise : Paises) {
            System.out.println(Paise);
        }
    }
}