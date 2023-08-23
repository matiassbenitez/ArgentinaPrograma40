
package libreria;

import libreria.DAO.AutorDAO;
import libreria.entidades.Autor;



public class Libreria {

    public static void main(String[] args) {
        AutorDAO as = new AutorDAO();
        try {
            Autor autor = new Autor(1, "Matias", Boolean.TRUE);
            as.guardar(autor);
        } catch (Exception e) {
        }
        
    }

}
