package guia12ej3extra.servicios;

import guia12ej3extra.entidades.Alojamiento;
import guia12ej3extra.entidades.Camping;
import guia12ej3extra.entidades.Hotel;
import guia12ej3extra.entidades.Hotel4E;
import guia12ej3extra.entidades.Hotel5E;
import guia12ej3extra.entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Service {

    public void menu(ArrayList<Alojamiento> alojamientos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Todos los alojamientos.");
            System.out.println("2 - Hoteles por precio.");
            System.out.println("3 - Campings con restaurante.");
            System.out.println("4 - Residencias con descuentos.");
            System.out.println("5 - Salir.");
            System.out.println("Elija una opción:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    mostrarTodos(alojamientos);
                    break;
                case 2:
                    hotelesPorPrecio(alojamientos);
                    break;
                case 3:
                    campingsConRest(alojamientos);
                    break;
                case 4:
                    residenciasConDesc(alojamientos);
                    break;
                case 5:
                    System.out.println("Hasta Luego!!");
                    break;
                default:
                    System.out.println("Dígito incorrecto. Vuelva a ingresarlo: ");
            }
        } while (op != 5);

    }

    public void mostrarTodos(ArrayList<Alojamiento> alojamientos) {
        System.out.println("Alojamientos: ");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
        }
    }

    public void hotelesPorPrecio(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Hotel> hoteles = new ArrayList();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        Collections.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitaciones).reversed());
        System.out.println("Hoteles ordenados por precio: ");
        for (Hotel hotel : hoteles) {
            if (hotel instanceof Hotel5E) {
                System.out.print("Hotel 5 estrellas: ");
            } else {
                System.out.print("Hotel 4 estrellas: ");
            }
            System.out.println(hotel.toString());
        }
    }

    public void campingsConRest(ArrayList<Alojamiento> alojamientos) {
        System.out.println("Campings con Restaurante: ");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                if (((Camping) alojamiento).isRestaurante()) {
                    System.out.println(alojamiento.toString());
                }
            }
        }
    }

    public void residenciasConDesc(ArrayList<Alojamiento> alojamientos) {
        System.out.println("Residencias con descuentos: ");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                if (((Residencia) alojamiento).isDescuentosGremios()) {
                    System.out.println(alojamiento.toString());
                }
            }
        }
    }
}
