
package tienda.persistencia;

import tienda.entidades.Fabricante;


public final class FabricanteDAO extends DAO{

     public void ingresarFabricante(Fabricante fabricante) throws Exception{
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante.");
            }
            String sql = "INSERT INTO Fabricante (nombre) " 
                    + "VALUES ('" + fabricante.getNombre() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
}
