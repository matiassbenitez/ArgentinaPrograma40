
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;


public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    
          public void crearFabricante(String nombre) throws Exception{
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre.");
            }
            
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.ingresarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
