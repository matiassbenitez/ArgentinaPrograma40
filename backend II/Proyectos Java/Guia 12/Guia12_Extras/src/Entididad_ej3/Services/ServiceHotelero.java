/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entididad_ej3.Services;

import Entididad_ej3.Hotelero;
import Entididad_ej3.subClases.Camping;
import Entididad_ej3.subClases.Residencia;
import java.util.Scanner;

public class ServiceHotelero {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotelero crearHotelero() {
        boolean opc = false;
        System.out.println("Es privado ? S/N");
        char res = leer.next().charAt(0);
        while (res != 'S' && res != 'N' && res != 's' && res != 'n') {
            System.out.println("Seleccion la Opcion Correctamente S/N");
            res = leer.next().charAt(0);
        }
        if (res == 'S' || res == 's') {
            opc = true;
        } else if (res == 'N' || res == 'n') {
            opc = false;
        }
        System.out.println("Ingrese los m² que posea el lugar : ");
        Double mts = leer.nextDouble();

        return new Hotelero(opc, mts, 50.0);
    }

    public Camping crearCamping() {
        Hotelero h1 = crearHotelero();
        System.out.println("Ingrese la cantidad de Carpas :");
        int cantCarp = leer.nextInt();
        System.out.println("Ingrese la cantidad de Baños :");
        int cantBanios = leer.nextInt();
        boolean opc = false;
        System.out.println("Tiene restaurante ? S/N");
        char res = leer.next().charAt(0);
        while (res != 'S' && res != 'N' && res != 's' && res != 'n') {
            System.out.println("Seleccion la Opcion Correctamente S/N");
            res = leer.next().charAt(0);
        }
        if (res == 'S' || res == 's') {
            opc = true;
        } else if (res == 'N' || res == 'n') {
            opc = false;
        }
        return new Camping(cantCarp, cantBanios, opc, h1.isPrivates(), h1.getMetros(), h1.getPrecio());
    }

    public Residencia crearResident() {
        //si se hacen o no descuentos a los gremios y si posee o no campo deportivo.
        Hotelero h1 = crearHotelero();
        System.out.println("Ingrese la cantidad de Habitaciones :");
        int cantHabt = leer.nextInt();
        boolean opc = false;
        System.out.println("Tiene Descuento para los Gremios ? S/N");
        char res = leer.next().charAt(0);
        while (res != 'S' && res != 'N' && res != 's' && res != 'n') {
            System.out.println("Seleccion la Opcion Correctamente S/N");
            res = leer.next().charAt(0);
        }
        if (res == 'S' || res == 's') {
            opc = true;
        } else if (res == 'N' || res == 'n') {
            opc = false;
        }
        boolean opc2 = false;
        System.out.println("Tiene Campo Deportivo ? S/N");
        char res2 = leer.next().charAt(0);
        while (res2 != 'S' && res2 != 'N' && res2 != 's' && res2 != 'n') {
            System.out.println("Seleccion la Opcion Correctamente S/N");
            res2 = leer.next().charAt(0);
        }
        if (res2 == 'S' || res2 == 's') {
            opc2 = true;
        } else if (res2 == 'N' || res2 == 'n') {
            opc2 = false;
        }
        return new Residencia(cantHabt, opc, opc2, h1.isPrivates(), h1.getMetros(), h1.getPrecio());
    }

    public Double CambioCamp(Camping c1) {
        int priv = 0;
        if (c1.isPrivates()) {
            priv = 500;
        }
        int rest = 0;
        if (c1.isRest()) {
            rest = 1000;
        }
        double dev = (c1.getPrecio() * c1.getCantBanios()) + c1.getCantCarp() + priv + rest;
        return dev;
    }

    public Double CambioResident(Residencia r1) {
        int priv = 0;
        if (r1.isPrivates()) {
            priv = 100;
        }
        int grem = 0;
        if (r1.isDescGremio()) {
            grem = 750;
        }
        int camp = 0;
        if (r1.isCampDep()) {
            camp = 250;
        }
        double dev = ((r1.getPrecio() * r1.getCantHabt()) + priv + camp) - grem;
        return dev;
    }

}
