
package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;


public class Tienda {

    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();
        
        ps.imprimirProductos();
        System.out.println("Ingrese el id del producto a modificar: ");
        int opcion = leer.nextInt();
        ps.modificarProducto(opcion);
    }
}
