
package libreria.servicios;

import java.util.List;
import libreria.DAO.AutorDAO;
import libreria.entidades.Autor;


public class AutorService {

    AutorDAO dao = new AutorDAO();
    
    public Autor altaAutor(String nombre){            //VER SI ES NECESARIO QUE RETORNE UN AUTOR
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAlta(true);
        dao.guardar(autor);
        return autor;
    }
    
    public void bajaAutor(Autor autor){
        if (autor.getAlta()) {
            autor.setAlta(Boolean.FALSE);
            dao.actualizar(autor);
        }
    }
    
    public List<Autor> listarAutores(){
        List<Autor> autores = dao.listar();
        return autores;
    } 
    
    public Autor buscarPorNombre(String nombre){
        Autor autor = dao.buscarPorNombre(nombre);
        return autor;
    }
    
}
