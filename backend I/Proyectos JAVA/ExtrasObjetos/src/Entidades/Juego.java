package Entidades;

import java.util.Scanner;

public class Juego {

    private int nroJ1;
    private int nroJ2;

    public Juego() {
    }

    public void iniciarJuego() {
        String resp;
        int partidasJ1 = 0, partidasJ2 = 0;
        Scanner leer = new Scanner(System.in);
        do {
            int intentos = 1;
            System.out.println("J1 Ingrese el número secreto(0-9): ");
            nroJ1 = leer.nextInt();
            while (nroJ1 < 0 || nroJ1 > 9) {
                System.out.println("Número fuera de rango, por favor, vuelva a ingresarlo: ");
                nroJ1 = leer.nextInt();
            }

            System.out.println("Intente adivinar el número: ");
            do {

                nroJ2 = leer.nextInt();
                if (nroJ2 < nroJ1) {
                    System.out.println("El número debe ser mayor: ");
                    intentos++;
                } else if (nroJ2 > nroJ1) {
                    System.out.println("El número debe ser menor: ");
                    intentos++;
                } else {
                    System.out.println("CORRECTO!!! Acertaste el número secreto en " + intentos + " intento/s. Felicitaciones!!!");
                    break;
                }
            } while (nroJ1 != nroJ2 && intentos <= 5);

            if (intentos > 5) {
                System.out.println("Perdiste!!! Se te acabaron los intentos.");
                partidasJ1++;
            } else {
                partidasJ2++;
            }

            System.out.println("Desea volver a jugar? (s/n): ");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));
        System.out.println("Partidas ganadas por el Jugador 1: " + partidasJ1);
        System.out.println("Partidas ganadas por el Jugador 2: " + partidasJ2);
    }

}
