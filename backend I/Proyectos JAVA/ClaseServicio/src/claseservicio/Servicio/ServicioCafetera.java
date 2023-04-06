package claseservicio.Servicio;

import claseservicio.Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {

        System.out.println("Ingrese la capacidad máxima: ");
        int cm = leer.nextInt();
        System.out.println("Ingrese la cantidad actual: ");
        int ca = leer.nextInt();
        while (cm < ca) {
            System.out.println("La cantidad actual supera la capacidad máxima, vuelva a ingresarla: ");
            ca = leer.nextInt();
        }
        return new Cafetera(cm, ca);
    }

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
    }
    
    public void servirTaza(int taza, Cafetera c){
        if (c.getCantidadActual()<taza){
            System.out.println("La taza no se llenó. El contenido vertido es: " + c.getCantidadActual());
            c.setCantidadActual(0);
        }else{
            System.out.println("La taza se llenó.");
            c.setCantidadActual(c.getCantidadActual()-taza);
        }
    }
    
    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
    }

    public void agregarCafe(int cafe, Cafetera c){
        if (c.getCantidadActual()+cafe > c.getCapacidadMaxima()){
            System.out.println("La cafetera se llenó.");
            
        }else{
            c.setCantidadActual(c.getCantidadActual() + cafe);
            System.out.println("La cantidad actual de la cafetera es: " + c.getCantidadActual());
        }
    }
}
