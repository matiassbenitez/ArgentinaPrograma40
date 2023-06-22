/*
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 */
package Entididad_ej3.Services;

import Entididad_ej3.Hotel;
import Entididad_ej3.subClases.Hotel4;
import Entididad_ej3.subClases.Hotel5;
import java.util.Scanner;

public class ServiceHotel {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel crearHotel() {
        System.out.println("Cantidad de Habitaciones : ");
        int cantHabitaciones = leer.nextInt();
        System.out.println("Numero de Camas : ");
        int numCamas = leer.nextInt();
        System.out.println("Cantidad de Pisos : ");
        int cantPisos = leer.nextInt();
        return new Hotel(cantHabitaciones, numCamas, cantPisos, 50.0);
    }

    public Hotel4 crearHotel4() {
        Hotel h1 = crearHotel();
        System.out.println("Gimnasio tipo A o tipo B /(A,B) ");
        char res = leer.next().charAt(0);
        while (res != 'A' && res != 'B' && res != 'a' && res != 'b') {
            System.out.println("Seleccion la Opcion Correctamente A/B");
            res = leer.next().charAt(0);
        }
        System.out.println("Nombre Restaurante : ");
        String nomRest = leer.next();
        System.out.println("Capacidad del Restaurante : ");
        int capRest = leer.nextInt();
        return new Hotel4(res, nomRest, capRest, h1.getCantHabitaciones(), h1.getNumCamas(), h1.getCantPisos(), h1.getPrecioHabit());
    }

    public Hotel5 crearHotel5() {
        Hotel4 h4 = crearHotel4();
        System.out.println("Cantidad de Salones de Conferencia");
        int cantSalas = leer.nextInt();
        System.out.println("Cantidad de Suites");
        int cantSuites = leer.nextInt();
        System.out.println("Cantidad de limosinas");
        int cantLimosinas = leer.nextInt();
        return new Hotel5(cantSalas, cantSuites, cantLimosinas, h4.getGimnasio(), h4.getNomRest(), h4.getCapRest(), h4.getCantHabitaciones(), h4.getNumCamas(), h4.getCantPisos(), h4.getPrecioHabit());
    }

    public Double valorAgregado4(char gimnasio, int restaurante, int cantH, Double precio) {
        /*
        El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
         */
        int gim = Gim(gimnasio);
        int rest = Rest(restaurante);
        Double dev = precio + (1 * cantH) + rest + gim;
        return dev;
    }

    public Double ValorAgregado5(int limon, double d) {
        int lim = Limon(limon);
        double dev = d + lim;
        return dev;
    }

    public int Gim(char res) {
        int cont = 0;
        switch (res) {
            case 'a':
                cont = 50;
                break;
            case 'A':
                cont = 50;
                break;
            case 'B':
                cont = 30;
                break;
            case 'b':
                cont = 30;
                break;
        }
        return cont;
    }

    public int Limon(int lim) {
        return lim * 15;
    }

    public int Rest(int rest) {
        int cont = 0;
        if (rest < 30) {
            cont = 10;
        }
        if (rest > 30 && rest < 50) {
            cont = 30;
        }
        if (rest > 50) {
            cont = 50;
        }
        return cont;
    }

}
