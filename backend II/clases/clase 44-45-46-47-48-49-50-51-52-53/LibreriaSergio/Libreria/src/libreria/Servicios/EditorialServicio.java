/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Servicios;

import libreria.Persistencia.EditorialDao;
import libreria.entidades.Editorial;

/**
 *
 * @author La Doble G
 */
public class EditorialServicio {
    private final EditorialDao daoE;

    public EditorialServicio() {
        this.daoE = new EditorialDao();
    }
    
    public Editorial crearEditorial(String nombre,boolean alta){
       Editorial editorial = new Editorial();
       try {
            editorial.setNombre(nombre);
            editorial.setAlta(alta);
            daoE.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Editorial buscarPorId(Integer id) {
        try {
            return daoE.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
