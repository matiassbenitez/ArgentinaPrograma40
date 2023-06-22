package Servicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4CodigoPostalServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void añadirLocalidad(HashMap<Integer, String> cp) {
        System.out.println("Ingrese el código postal de la localidad");
        int codPostal = leer.nextInt();
        System.out.println("Ahora, su correspondiente localidad, por favor");
        String localidad = leer.next();
        cp.put(codPostal, localidad);
    }

    public void mostrarLocalidades(HashMap<Integer, String> cp) {
        System.out.println(cp);
    }

    public void buscarLocalidad(HashMap<Integer, String> cp) {
        System.out.println("Ingrese el código postal para buscar la localidad en la lista");
        int buscar = leer.nextInt();
        if (cp.containsKey(buscar)) {
            System.out.println("Se encontró la localidad con el código postal n° " + buscar + ".\nLa localidad es " + cp.get(buscar));
        } else {
            System.out.println("Lo siento, el código postal n° " + buscar + " no se encuentra en la lista");
        }
    }

    public void eliminarLocalidades(HashMap<Integer, String> cp) {
        System.out.println("Ingrese el código postal para eliminar la localidad en la lista");
        int eliminar = leer.nextInt();
        if (cp.containsKey(eliminar)) {
            cp.remove(eliminar);
            System.out.println("Localidad eliminada");
        } else {
            System.out.println("El código ingresado no está en la lista");
        }
    }
}
