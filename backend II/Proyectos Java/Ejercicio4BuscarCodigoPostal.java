package Ejecutores;

import Servicios.Ejercicio4CodigoPostalServicio;
import java.util.HashMap;

public class Ejercicio4BuscarCodigoPostal {

    public static void main(String[] args) {
        HashMap<Integer, String> cp = new HashMap();
        Ejercicio4CodigoPostalServicio service = new Ejercicio4CodigoPostalServicio();
        for (int i = 0; i < 10; i++) {
            service.añadirLocalidad(cp);
        }
        service.mostrarLocalidades(cp);
        service.buscarLocalidad(cp);
        service.añadirLocalidad(cp);
        service.mostrarLocalidades(cp);
        for (int i = 0; i < 3; i++) {
            service.eliminarLocalidades(cp);
        }
        service.mostrarLocalidades(cp);
    }

}
