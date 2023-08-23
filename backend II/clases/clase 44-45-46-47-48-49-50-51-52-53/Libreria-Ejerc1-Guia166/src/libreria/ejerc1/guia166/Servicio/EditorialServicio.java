/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ejerc1.guia166.Servicio;

import java.util.Scanner;
import libreria.ejerc1.guia166.Entidad.Autor;
import libreria.ejerc1.guia166.Entidad.Editorial;
import libreria.ejerc1.guia166.Persistencia.EditorialDao;



/**
 *
 * @author Juan Luna
 */
public class EditorialServicio {

      private EditorialDao dao;

    public EditorialServicio() {
        this.dao = new EditorialDao();
    }
 public void crearEditorial(){
     System.out.println("Ingrese un nombre para la Editorial: ");
     Scanner scan = new Scanner(System.in).useDelimiter("\n");
     String nombre = scan.next();
     Editorial editorial  = new Editorial();
     editorial.setNombre(nombre);
     Boolean alta = true;
     editorial.setAlta(alta);
     dao.guardar(editorial);
 }
     public Editorial BuscarPorNombre(){
       Scanner scan = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrese el nombre de la  Editorial a buscar");
       String nombre = scan.next();
       Editorial editorial = dao.buscarPorNombre(nombre);
       return editorial;
   }
    
}
