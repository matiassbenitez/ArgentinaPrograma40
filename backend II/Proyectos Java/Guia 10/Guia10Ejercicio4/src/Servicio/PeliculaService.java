
package Servicio;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas;
    
    public PeliculaService(){
        this.peliculas = new ArrayList();
    }
    
    public Pelicula crearPelicula(){
        
        System.out.print("Ingrese el nombre de la pelicula: ");
        String pelicula = leer.next();
        
        System.out.print("Ingrese el nombre del director: ");
        String director = leer.next();
        
        System.out.print("Ingrese la duración de la pelicula en horas: ");
        float duracion = leer.nextFloat();
        
        Pelicula peli = new Pelicula(pelicula, director, duracion);
        
        peliculas.add(peli);
        
        return peli;
    }
    
    public void mostrarPelicula(){
        
        System.out.println("Las peliculas en cartelera son: ");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarPelicula(Comparator c){
        System.out.println("Ordenamos las peliculas");
        Collections.sort(peliculas, c);
 
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }       
    }
    
    public static Comparator<Pelicula> ordenarPorTituloAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorDirectorAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsce = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    
     public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
}
