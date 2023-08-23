package servicios;

import entidades.Editorial;
import persistencia.EditorialDAO;

/**
 *
 * @author ALEXIS.R.L
 */
public class EditorialServicio {
    private final EditorialDAO daoE;

    public EditorialServicio() {
        this.daoE = new EditorialDAO();
    }
    
    public Editorial crearEditorial(String nombre,Boolean alta){
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
