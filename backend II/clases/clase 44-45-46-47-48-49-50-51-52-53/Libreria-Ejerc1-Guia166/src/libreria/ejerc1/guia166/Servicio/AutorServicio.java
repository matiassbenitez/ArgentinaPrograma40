/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ejerc1.guia166.Servicio;

import java.util.Scanner;
import libreria.ejerc1.guia166.Entidad.Autor;
import static libreria.ejerc1.guia166.Entidad.Autor_.nombre;
import libreria.ejerc1.guia166.Persistencia.AutorDao;

/**
 *
 * @author Juan Luna
 */
public class AutorServicio {
private AutorDao dao;

    public AutorServicio() {
        this.dao = new AutorDao();
    }

    /*
     private AutorDao dao;

    public AutorServicio() {
        this.dao = new AutorDao();
    }
     */
    public Autor crearAutor() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Autor autor = new Autor();
        System.out.println("Ingrese un nombre ");
        String nombre = scan.next();
        Boolean alta = true;
        autor.setNombre(nombre);
        autor.setAlta(alta);
        dao.guardar(autor);
        
        return autor;
    }
   public Autor BuscarPorNombre(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrese el nombre del autor a Buscar");
       String nombre = scan.next();
       Autor autor = dao.buscarPorNombre(nombre);
       return autor;
   }

}
