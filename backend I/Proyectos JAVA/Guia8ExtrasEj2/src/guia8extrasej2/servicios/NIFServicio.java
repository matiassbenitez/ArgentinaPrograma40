
package guia8extrasej2.servicios;

import guia8extrasej2.entidades.NIF;
import java.util.Scanner;


public class NIFServicio {

    public NIF crearNif(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el dni: ");
        long dni = leer.nextLong();
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int resto = (int) dni%23;
        return new NIF(dni, letras[resto]);
    }
    
    public void mostrar(NIF n){
        System.out.println(n.getDni() + "-" + n.getLetra());
    }

    
}
