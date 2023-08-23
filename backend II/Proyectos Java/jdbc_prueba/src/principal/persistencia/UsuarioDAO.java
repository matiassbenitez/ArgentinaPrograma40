
package principal.persistencia;
//suponiendo que nuestro proyecto, tenga una clase Usuario


public final class UsuarioDAO extends DAO {

    public void guardarUsuario(Usuario usuario) throws Exception{
        try {
            if (usuario == null){
                throw new Exception("Debe indicar un usuario.");
            }
            
            String sql = "INSERT INTO Usuario (correoElectronico, clave)"
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
        public void modificarUsuario(Usuario usuario) throws Exception{
        try {
            if (usuario == null){
                throw new Exception("Debe indicar el usuario que desea modificar.");
            }
            
            String sql = "UPDATE Usuario SET "
                    + "clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" + usuario.getCorreoElectronico() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
        
        public void eliminarUsuario(String correoElectronico) throws Exception {
            try {
                String sql = "DELETE FROM Usuario WHERE correoElectronico = '" + correoElectronico + "'";
                insertarModificarEliminar(sql);
            } catch (Exception e) {
                throw e;
            }
        }
    
}
