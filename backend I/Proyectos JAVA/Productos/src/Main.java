
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Main {
    static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        /*
        Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
        */
        HashMap <String,Integer> Productos = new HashMap(); 
        String nombre,resp;
        Integer precio;
        
        do {
         System.out.println("Menu");
            System.out.println("1.Ingresar producto: ");
            System.out.println("2.Modificar precio: ");
            System.out.println("3.Eliminar producto: ");
            System.out.println("4.Mostrar: ");
            System.out.println("5.Salir");
           resp = entrada.next();
            switch (resp) {
                case "1":
                   ingresarProducto(Productos);
                    break;
                case "2":
                    modificarPrecio(Productos);
                  break;
                case "3":
                    eliminar(Productos);
                    break;
                case "4":
                    mostrar(Productos);
                    break;
                case "5":
                    System.out.println("Chao ameo ");
                    break;
            }
        } while (!resp.equalsIgnoreCase("5"));
        
                 
    }
    
public static void mostrar(HashMap <String,Integer> producto){
    for (Map.Entry<String, Integer> entry : producto.entrySet()) {
        System.out.println(entry.getKey() +"----"+ entry.getValue());
           }
}
public static void eliminar(HashMap <String,Integer> producto){
     //Otra manera de eliminar
//        while (iterador.hasNext()) {
//            if (iterador.next().equals(productoaEliminar)) {
//                iterador.remove();
//            }
//        }
    System.out.println("Ingrese producto a eliminar: ");
        String productoaEliminar = entrada.next();
        producto.remove(productoaEliminar);
        mostrar(producto);
}


public static void modificarPrecio(HashMap <String,Integer> producto){
    Iterator<Map.Entry<String, Integer>> iterador = producto.entrySet().iterator();
        //// Iterator <Integer> iterador = Productos.values().iterador();
        // Modificar el precio,
        System.out.println("Producto a modificar el precio: ");
        String modificarProducto = entrada.next();
        Integer precionuevo;
        while (iterador.hasNext()) {
            Map.Entry <String,Integer> entry = iterador.next();
            // si la llave es igual al producto
            if (entry.getKey().equalsIgnoreCase(modificarProducto)) {
                System.out.println("Ingrese nuevo precio del producto: ");
                precionuevo = entrada.nextInt();
                entry.setValue(precionuevo);
                System.out.println("Precio modificado correctamente");
                                            }
        }
}
public static void ingresarProducto(HashMap <String,Integer> producto){
    String nombre;
        Integer precio;
            System.out.println("Ingrese nombre del producto a ingresar: ");
            nombre = entrada.next();
            System.out.println("Ingrese el precio: ");
            precio = entrada.nextInt();
            producto.put(nombre, precio);
            System.out.println("Producto agregado :)");
            System.out.println("");
}
}

