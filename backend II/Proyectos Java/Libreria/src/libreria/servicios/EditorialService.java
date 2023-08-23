
package libreria.servicios;

import java.util.List;
import libreria.DAO.EditorialDAO;
import libreria.entidades.Editorial;


public class EditorialService {

    EditorialDAO dao = new EditorialDAO();
    
     public Editorial altaEditorial(String nombre){            //VER SI ES NECESARIO QUE RETORNE UN AUTOR
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        dao.guardar(editorial);
        return editorial;
    }
    
    public void bajaEditorial(Editorial editorial){
        if (editorial.getAlta()) {
            editorial.setAlta(Boolean.FALSE);
            dao.actualizar(editorial);
        }
    }
    
       public List<Editorial> listarAutores(){
        List<Editorial> editoriales = dao.listar();
        return editoriales;
    } 
    
}
