
package Entidades;

import java.util.Arrays;
import java.util.Scanner;


public class Receta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String nombre;
    public String[] ingredientes;

    public Receta() {
        System.out.println("Ingreseel nombre de la receta: ");
        nombre = leer.next();
        System.out.println("Ingrese la cantidad de ingredientes: ");
        int cantIng = leer.nextInt();
        ingredientes = new String[cantIng];
        for (int i = 0; i < cantIng; i++) {
            System.out.println("Ingrese el ingrediente nro " + i + ":");
            ingredientes[i] = leer.next();
        }

    }

    @Override
    public String toString() {
        return "Receta{" + "nombre=" + nombre + ", ingredientes=" + Arrays.toString(ingredientes) + '}';
    }

}
