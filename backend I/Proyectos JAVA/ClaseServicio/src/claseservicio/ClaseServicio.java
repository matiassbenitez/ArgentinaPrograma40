package claseservicio;

import claseservicio.Entidad.Cafetera;
import claseservicio.Entidad.CuentaBancaria;
import claseservicio.Servicio.CuentaBancariaServicio;
import claseservicio.Servicio.ServicioCafetera;
import claseservicio.Servicio.ServicioPersona;
import java.util.Scanner;

public class ClaseServicio {

    private long entero;

    public static void main(String[] args) {
        /*ServicioPersona service = new ServicioPersona();
        service.mostrarPersona(service.crearPersona());*/
  /*      
    Scanner read = new Scanner(System.in);
    CuentaBancariaServicio serv = new CuentaBancariaServicio ();
    CuentaBancaria banc = serv.crearCuenta();
    serv.ingresarDinero(25000, banc);
    serv.retirarDinero(50000, banc);
    serv.extraccionRapida(30000, banc);
    serv.consultarSaldo(banc);
    serv.consultarDatos(banc);*/
  
  ServicioCafetera sc = new ServicioCafetera();
  Cafetera c1 = sc.crearCafetera();
  
  sc.servirTaza(250, c1);
  sc.llenarCafetera(c1);
  sc.vaciarCafetera(c1);
  sc.agregarCafe(3500, c1);
  
    }

}
