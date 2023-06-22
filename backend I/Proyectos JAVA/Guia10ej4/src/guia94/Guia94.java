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
package guia94;

import guia94.Entidades.Pelicula;
import guia94.Servicios.Comparadores;
import guia94.Servicios.PeliculaServicios;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Guia94 {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        PeliculaServicios sv = new PeliculaServicios();
        Pelicula p;
        HashSet listaPeliculas = new HashSet();
        String resp;
        ArrayList lista;
//        do {
//            p = sv.crearPelicula();
//            listaPeliculas.add(p);
//            System.out.println("Desea agregar otra pelicula?");
//            resp = leer.next();
//        } while (!resp.equalsIgnoreCase("n"));
        
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("La naranja mecánica","Stanley Kubrick",136f));
        listaPeliculas.add(new Pelicula("Star Wars: El retorno del Jedi","Richard Marquand",131f));
        listaPeliculas.add(new Pelicula("Cantando bajo la lluvia","Stanley Donen",103f));
        listaPeliculas.add(new Pelicula("El padrino","Francis Ford Coppola",175f));
        listaPeliculas.add(new Pelicula("La lista de Schindler","Steven Spielberg",195f));

        for (Object listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.hashCode());
        }
        
        for (Object listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        lista = new ArrayList(listaPeliculas);
        sv.mostrarOrdenada(lista, Comparadores.ordenarTituloAscendente, "título ascendentemente");
        sv.mostrarOrdenada(lista, Comparadores.ordenarDirectorAscendente, "director ascendentemente");
        sv.mostrarOrdenada(lista, Comparadores.ordenarDuracionAscendente, "duración ascendentemente");
        sv.mostrarOrdenada(lista, Comparadores.ordenarDuracionDescendente, "duración descendentemente");
    }

}
