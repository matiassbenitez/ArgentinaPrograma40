
package guia8extrasej2;

import guia8extrasej2.entidades.NIF;
import guia8extrasej2.servicios.NIFServicio;


public class Guia8ExtrasEj2 {


    public static void main(String[] args) {
        
        NIFServicio ns = new NIFServicio();
        NIF n = ns.crearNif();
        
        ns.mostrar(n);
    }
    
}
