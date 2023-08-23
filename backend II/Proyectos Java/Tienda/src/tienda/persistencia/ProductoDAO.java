package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el Producto.");
            }
            String sql = "INSERT INTO Producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ('" + producto.getNombre() + "' , " + producto.getPrecio() + " , " + producto.getCodigoFabricante() + ");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<String> listarNombres() throws Exception {

        try {
            String sql = "SELECT nombre FROM Producto";
            consultarBase(sql);
            Collection<String> nombres = new ArrayList();
            while (resultado.next()) {
                nombres.add(resultado.getString(1));
            }
            desconectarBase();
            return nombres;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

    /*public Collection<Producto> listarProductos() throws Exception {

        try {
            String sql = "SELECT * FROM Producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }*/

    
    
    public Map<String, Double> listarNombresPrecios() throws Exception {

        try {
            String sql = "SELECT nombre, precio FROM Producto";
            consultarBase(sql);
            Map<String, Double> nombresPrecios = new HashMap<>();
            while (resultado.next()) {
                nombresPrecios.put(resultado.getString(1), resultado.getDouble(2));
            }
            desconectarBase();
            return nombresPrecios;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

    public Collection<Producto> listarRangoPrecios(Double a, Double b) throws Exception {

        try {
            String sql = "SELECT * FROM Producto WHERE precio >=" + a + " AND precio <= " + b;
            consultarBase(sql);
            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                //codigo, nombre, precio, codigo_fabricante
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

    public Collection<Producto> listarPortatiles() throws Exception {

        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%portatil%'";
            consultarBase(sql);
            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                //codigo, nombre, precio, codigo_fabricante
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

    public Producto listarMasBarato() throws Exception {

        try {
            String sql = "SELECT * FROM Producto ORDER BY precio LIMIT 1";
            consultarBase(sql);
            Producto prod = null;
            while (resultado.next()) {
                //codigo, nombre, precio, codigo_fabricante
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return prod;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

    public Producto buscarProductoPorID(int id) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + id + ";";
            consultarBase(sql);
            Producto producto = null;
            if (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(id);
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception{
        try {
            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() + "' , precio = " + producto.getPrecio() + ", codigo_fabricante = '" + producto.getCodigoFabricante() + "' WHERE codigo = " + producto.getCodigo() ;
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
}
