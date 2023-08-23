package tienda.servicios;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

//    public Collection<String> listarNombres() throws Exception {
//        try {
//            Collection<String> productos = dao.listarNombres();
//            return productos;
//        } catch (Exception e) {
//            throw e;
//        }
//    }

//    public Map<String, Double> listarNombresPrecios() throws Exception {
//        try {
//            Map<String, Double> nombresPrecios = dao.listarNombresPrecios();
//            return nombresPrecios;
//        } catch (Exception e) {
//            throw e;
//        }
//    }

    public void crearProducto(String nombre, Double precio, Integer codigo_fabricante) throws Exception{
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre.");
            }
            if (precio == null || precio == 0) {
                throw new Exception("Debe indicar un precio.");
            }
            if (codigo_fabricante == null || codigo_fabricante == 0) {
                throw new Exception("Debe indicar un código de fabricante.");
            }
            
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigo_fabricante);
            dao.ingresarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
    
    /*public void imprimirProductos(){
        try {
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar.");
            }else{
                for (Producto producto : productos) {
                    System.out.println(producto);
                }
            }
        } catch (Exception e) {
        }
    }*/
    
    public void imprimirProductos(){
        
    }
    
    public void modificarProducto(int id){
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            Producto producto = dao.buscarProductoPorID(id);
            System.out.println("Indica el nuevo nombre del producto.");
            String nombre = leer.next();
            System.out.println("Indica el nuevo precio del producto.");
            int precio = leer.nextInt();
            System.out.println("Indica el codigo de fabricante.");
            int cod_fabricante = leer.nextInt();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(cod_fabricante);
            dao.modificarProducto(producto);
        } catch (Exception e) {
        }
    }
    
    public void imprimirNombres() throws Exception {
        try {
            Collection<String> nombres = dao.listarNombres();
            if (nombres.isEmpty()) {
                throw new Exception("No existen nombres para mostrar.");
            } else {
                nombres.forEach((nombre) -> {
                    System.out.println(nombre);
                });
            }
        } catch (Exception e) {
            throw e;
        }
    }
    

    public void imprimirNombresPrecios() throws Exception {
        try {
            Map<String, Double> nombresPrecios = dao.listarNombresPrecios();
            if (nombresPrecios.isEmpty()) {
                throw new Exception("No existen artículos para mostrar.");
            } else {
                for (Map.Entry<String, Double> entry : nombresPrecios.entrySet()) {
                    String nombre = entry.getKey();
                    Double precio = entry.getValue();
                    System.out.println(nombre + " - $" + precio);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

     public void imprimirRangoPrecios(Double a, Double b) throws Exception {
        try {
            Collection<Producto> productos = dao.listarRangoPrecios(a,b);
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar.");
            } else {
                productos.forEach((producto) -> {
                    System.out.println(producto);
                });
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
      public void imprimirPortatiles() throws Exception {
        try {
            Collection<Producto> productos = dao.listarPortatiles();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar.");
            } else {
                productos.forEach((producto) -> {
                    System.out.println(producto);
                });
            }
        } catch (Exception e) {
            throw e;
        }
    }
      
      public void imprimirMasBarato(){
          try {
              Producto producto = dao.listarMasBarato();
              if (producto == null){
                  throw new Exception("No existe artículo para mostrar.");
              }else{
                  System.out.println(producto);
              }
          } catch (Exception e) {
          }
      }
      
}
