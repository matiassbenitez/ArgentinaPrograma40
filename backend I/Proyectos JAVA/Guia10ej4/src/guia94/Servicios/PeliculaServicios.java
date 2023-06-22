/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.

 */
package guia94.Servicios;

import guia94.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        String titulo,director;
        Float duracion;
        System.out.println("Ingrese el título de la película: ");
        titulo = leer.next();
        System.out.println("Ingrese el nombre del director: ");
        director = leer.next();
        System.out.println("Ingrese la duración en minutos: ");
        duracion = leer.nextFloat();
        
        return new Pelicula(titulo, director, duracion);
    }
    
    public void mostrarOrdenada(ArrayList list, Comparator c, String s){
        Collections.sort(list, c);
        System.out.println("");
        System.out.println("Lista de Películas ordenadas por " + s);
        for (Object object : list) {
            System.out.println(object);
        }
    }

}
