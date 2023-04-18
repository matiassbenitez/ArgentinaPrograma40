package guia9ej2extra.Servicios;

import guia9ej2extra.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    public static Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la palabra a adivinar: ");
        String palabra = leer.next();
        return new Ahorcado(palabra);
    }

    public static void longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es: " + a.getPalabra().length);
    }

    public static boolean buscar(Ahorcado a, char letra) {
        boolean encontrado = false;
        int cont = 0;
        while (!encontrado && cont < a.getPalabra().length) {
            if (a.getPalabra()[cont] == letra) {
                encontrado = true;
            } else {
                cont++;
            }
        }
        if (encontrado) {
            System.out.println("Mensaje: La letra pertenece a la palabra.");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra.");
        }
        return encontrado;
    }

    public static void encontradas(Ahorcado a, char letra) {
        boolean encontrado = AhorcadoService.buscar(a, letra);
        if (encontrado) {
            int cant = 0;
            for (int i = 0; i < a.getPalabra().length; i++) {
                if (a.getPalabra()[i] == letra) {
                    cant++;
                    a.getDescubierta()[i] = letra;
                }
            }
            a.setEncontradas(a.getEncontradas() + cant);
        } else {
            a.setIntentos(a.getIntentos() - 1);
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + a.getEncontradas() + "," + (a.getPalabra().length - a.getEncontradas()) + ")");
    }

    public static void intentos(Ahorcado a) {
        int intentos = a.getIntentos();
        switch (intentos) {
            case 0:
                a.setSt1("________");
                a.setSt2("|      |");
                a.setSt3("| >  < |");
                a.setSt4("| ____ |");
                a.setSt5("|    U |");
                a.setSt6("\\______/");
                break;
            case 1:
                a.setSt5("     |   / \\   ");
                break;
            case 2:
                a.setSt5("     |   /     ");
                break;
            case 3:
                a.setSt4("     |   /|\\   ");
                break;
            case 4:
                a.setSt4("     |   /|    ");

                break;
            case 5:
                a.setSt4("     |    |    ");
                break;

        }
        System.out.println("Número de oportunidades restantes: " + intentos);
    }

    public static void juego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ahorcado juego;
        juego = AhorcadoService.crearJuego();
        do {
            System.out.println("Ingrese una letra: ");
            String letra = leer.next();
            System.out.println("\n\n\n\n\n\n");
            AhorcadoService.longitud(juego);
            AhorcadoService.encontradas(juego, letra.charAt(0));
            AhorcadoService.intentos(juego);
            System.out.println(juego.getSt1());
            System.out.println(juego.getSt2());
            System.out.println(juego.getSt3());
            System.out.println(juego.getSt4());
            System.out.println(juego.getSt5());
            System.out.println(juego.getSt6());
            System.out.println(Arrays.toString(juego.getDescubierta()));
            System.out.println("-------------------------------------------------------");
        } while (juego.getIntentos() > 0 && juego.getEncontradas() < juego.getPalabra().length);
        if (juego.getIntentos() == 0) {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        } else {
            System.out.println("Felicidades!!! Acertaste la palabra!!!!");
        }
        System.out.println("La palabra era: " + Arrays.toString(juego.getPalabra()));
    }

}
