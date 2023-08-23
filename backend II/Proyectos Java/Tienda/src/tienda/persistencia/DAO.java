
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class DAO {

    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws SQLException, ClassNotFoundException{
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://LocalHost:3306/" + DATABASE+ "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    
    protected void desconectarBase() throws Exception{
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws SQLException, ClassNotFoundException, Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
           // conexion.rollback();
            throw ex;
        }finally{
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    protected List<Map<String, Object>> mapearConsulta(String sql) throws Exception{
        
        List<Map<String, Object>> mapas = new ArrayList();
        consultarBase(sql);
          ResultSetMetaData metaData = resultado.getMetaData();
    int columnCount = metaData.getColumnCount();
        while (resultado.next()){
            Map<String, Object> mapa = new HashMap();
            for (int i = 1; i < columnCount; i++) {
                String llave = metaData.getColumnName(i);
                Object valor = resultado.getObject(i);
                mapa.put(llave, valor);
            }
            mapas.add(mapa);
        }
        return mapas;
    }
     
    protected void mostrarResultado(List<Map<String, Object>> mapas){
        for (Map<String, Object> mapa : mapas) {
            for (Map.Entry<String, Object> entry : mapa.entrySet()) {
                String llave = entry.getKey();
                Object valor = entry.getValue();
                System.out.println(llave + ": " + valor);
            }
            System.out.println("********************");
        }
    }
}
