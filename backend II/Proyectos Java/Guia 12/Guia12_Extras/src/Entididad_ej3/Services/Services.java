/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entididad_ej3.Services;

import Entididad_ej3.Hotel;
import Entididad_ej3.Hotelero;
import Entididad_ej3.Turismo;
import Entididad_ej3.subClases.Camping;
import Entididad_ej3.subClases.Hotel4;
import Entididad_ej3.subClases.Hotel5;
import Entididad_ej3.subClases.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Services {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServiceHotel sh = new ServiceHotel();
    ServiceHotelero sch = new ServiceHotelero();
    HashSet<Hotel> hotel = new HashSet();
    HashSet<Hotelero> hotelero = new HashSet();

    public void llenarHotel(int canth, Turismo t1) {
        do {
            System.out.println("Que hotel desea agregar (4/5)");
            int elec = leer.nextInt();
            while (elec < 4 || elec > 5) {
                System.out.println("Error. Ingrese solo (4 o 5)");
                elec = leer.nextInt();
            }
            if (elec == 4) {
                hotel.add(sh.crearHotel4());
            } else if (elec == 5) {
                hotel.add(sh.crearHotel5());
            }
        } while (hotel.size() != canth);
        t1.setHotel(hotel);
    }

    public void llenarHotelero(int canth, Turismo t1) {
        do {
            System.out.println("Que desea agregar Camping o Residencia (C/R)");
            String let = leer.next();
            while (!let.equalsIgnoreCase("C") && !let.equalsIgnoreCase("R")) {
                System.out.println("Error. Ingrese solo (C o R)");
                let = leer.next();
            }
            if (let.equalsIgnoreCase("C")) {
                hotelero.add(sch.crearCamping());
            } else if (let.equalsIgnoreCase("R")) {
                hotelero.add(sch.crearResident());
            }
        } while (hotelero.size() != canth);
        t1.setHotelero(hotelero);
    }

    public Turismo crearTurismo() {
        System.out.println("Ingrese el Nombre de la Compañia");
        String nombre = leer.next();
        System.out.println("Ingrese la Direccion");
        String direccion = leer.next();
        System.out.println("Ingrese la Localidad");
        String localidad = leer.next();
        System.out.println("Ingrese el Nombre del Gerente");
        String gerente = leer.next();
        return new Turismo(nombre, direccion, localidad, gerente, null, null);
    }

    public void Menu(Turismo t1) {
        boolean b1 = false;
        boolean b2 = false;
        int opc;
        do {
            System.out.println("> > Menu < < Turismo < <");
            System.out.println("1 . Llenar Hotel");
            System.out.println("2 . Lenar Hotelero");
            System.out.println("3 . Mostrar Hoteles");
            System.out.println("4 . Mostrar Hoteleros");
            System.out.println("5 . Mostrar Hoteles por Precio ");
            System.out.println("6 . Mostrar Camping con Restaurante");
            System.out.println("7 . Mostrar Residencias con Descuento");
            System.out.println("8 . Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese la cantidad de hoteles");
                    int cont = leer.nextInt();
                    llenarHotel(cont, t1);
                    b1 = true;
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de Hoteles extra");
                    int conth = leer.nextInt();
                    llenarHotelero(conth, t1);
                    b2 = true;
                    break;
                case 3:
                    if (b1) {
                        MostrarHotel(t1);
                    } else {
                        System.out.println("Primero llene los Hoteles");
                    }
                    break;
                case 4:
                    if (b2) {
                        MostrarHotelero(t1);
                    } else {
                        System.out.println("Primero llene los Hoteleros");
                    }
                    break;
                case 5:
                    if (b1) {
                        Ordenar(t1.getHotel());
                    } else {
                        System.out.println("Primero llene los Hoteles");
                    }
                    break;
                case 6:
                    if (b2) {
                        CampingComida(t1.getHotelero());
                    } else {
                        System.out.println("Primero llene los Hoteleros");
                    }
                    break;
                case 7:
                    if (b2) {
                        ResidenciasDesc(t1.getHotelero());
                    } else {
                        System.out.println("Primero llene los Hoteleros");
                    }
                    break;
                case 8:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Digito Invalido");
            }
        } while (opc != 8);
    }

    public void MostrarHotel(Turismo t1) {
        for (Hotel h1 : t1.getHotel()) {
            if (h1 instanceof Hotel5) {
                Hotel5 h5 = (Hotel5) h1;
                h1.setPrecioHabit(sh.valorAgregado4(h5.getGimnasio(), h5.getCapRest(), h5.getCantHabitaciones(), h5.getPrecioHabit()));
                h1.setPrecioHabit(sh.ValorAgregado5(h5.getCantLimosinas(), h5.getPrecioHabit()));
                System.out.println(h1.toString());
                System.out.println("");
                continue;
            }
            if (h1 instanceof Hotel4) {
                Hotel4 h4 = (Hotel4) h1;
                h1.setPrecioHabit(sh.valorAgregado4(h4.getGimnasio(), h4.getCapRest(), h4.getCantHabitaciones(), h4.getPrecioHabit()));
                System.out.println("Hotel 4* |" + h1.toString());
                System.out.println("");
            }
        }
    }

    public void MostrarHotelero(Turismo t1) {
        for (Hotelero h1 : t1.getHotelero()) {
            if (h1 instanceof Residencia) {
                Residencia re = (Residencia) h1;
                h1.setPrecio(sch.CambioResident(re));
                System.out.println(h1.toString());
            }
            if (h1 instanceof Camping) {
                Camping ca = (Camping) h1;
                h1.setPrecio(sch.CambioCamp(ca));
                System.out.println(h1.toString());
            }
            System.out.println("");
        }
    }

    public void Ordenar(HashSet<Hotel> h1) {
        //• todos los hoteles de más caro a más barato.
        ArrayList<Hotel> ar = new ArrayList(h1);
        Collections.sort(ar, Comparator.comparingDouble(Hotel::getPrecioHabit).reversed());
        for (Hotel hh : ar) {
            if (hh instanceof Hotel5) {
                System.out.println(hh.toString());
                System.out.println("");
                continue;
            }
            if (hh instanceof Hotel4) {
                System.out.println("Hotel 4* |" + hh.toString());
                System.out.println("");
            }
        }
    }

    public void CampingComida(HashSet<Hotelero> h1) {
        //todos los campings con restaurante
        for (Hotelero hot : h1) {
            if (hot instanceof Camping) {
                if (((Camping) hot).isRest()) {
                    System.out.println(hot.toString());
                }
            }
        }
    }

    public void ResidenciasDesc(HashSet<Hotelero> h1) {
        for (Hotelero hot : h1) {
            if (hot instanceof Residencia) {
                if (((Residencia) hot).isDescGremio()) {
                    System.out.println(hot.toString());
                }
            }
        }
    }
}
