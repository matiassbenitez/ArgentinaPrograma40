/**
 *  Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package hashmapproductos.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarProducto(HashMap<String,Float> productos){
        System.out.println("Ingrese el nombre del producto: ");
        String producto = leer.next();
        System.out.println("Ingrese el precio: ");
        float precio = leer.nextFloat();
        productos.put(producto, precio);
    }
    
    public void modificarPrecio(HashMap<String,Float> productos){
        System.out.println("Ingrese el nombre del producto a modificar: ");
        String producto = leer.next();
        for (Map.Entry<String, Float> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(producto)){
                System.out.println("Ingrese el precio: ");
                float precioNuevo = leer.nextFloat();
                productos.put(producto, precioNuevo);
            }
        }
    }
    public void eliminarProducto(HashMap<String,Float> productos){
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String producto = leer.next();
        if (productos.containsKey(producto)){
            productos.remove(producto);
        }else{
            System.out.println("El producto no se encontró.");
        }
    }
    
    public void mostrarProductos(HashMap<String,Float> productos){
        System.out.println("Lista de productos: ");
        for (Map.Entry<String, Float> entry : productos.entrySet()) {
            System.out.println("producto: " + entry.getKey() + ", precio: " + entry.getValue());
        }
    }
    
}
