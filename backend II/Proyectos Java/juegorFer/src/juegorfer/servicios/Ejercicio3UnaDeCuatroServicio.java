


package juegoFer.servicios;


import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Scanner;
import juegoFer.entidades.Ejercicio3UnaDeCuatro;

public class Ejercicio3UnaDeCuatroServicio {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejercicio3UnaDeCuatro crearJuego(int n) {
        String[] respuesta = new String[n];
        String[] cadenaDescripcion = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese una respuesta n° " + (i + 1));
            respuesta[i] = leer.next();
            System.out.println("Ingrese la descripción para la respuesta");
            cadenaDescripcion[i] = leer.next();
        }
        return new Ejercicio3UnaDeCuatro(respuesta, cadenaDescripcion);
    }

    public void limpiarANT(Ejercicio3UnaDeCuatro partida) {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(KeyEvent.VK_CONTROL);
            pressbot.keyPress(KeyEvent.VK_L);
            pressbot.keyRelease(KeyEvent.VK_CONTROL);
            pressbot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
            System.out.println("" + ex.getMessage());
        }
    }

    public void mostrar4Opciones(String[] mostrar4, Ejercicio3UnaDeCuatro partida, int n) {
        int[] numeros = {-1, -1, -1, -1};
        int indice;
        for (int i = 0; i < 4; i++) {
            boolean esta;
            do {
                esta = false;
                indice = (int) (Math.random() * n);
                for (int j = 0; j < 4; j++) {
                    if (numeros[j] == indice) {
                        esta = true;
                    }
                }
            } while (esta);
            numeros[i] = indice;
        }
        for (int i = 0; i < 4; i++) {
            mostrar4[i] = partida.getRespuesta()[numeros[i]];
        }
    }

    public void imprimirOpciones(String[] mostrar4) {
        for (int i = 0; i < mostrar4.length; i++) {
            System.out.println((i + 1) + ". " + mostrar4[i]);
        }
    }

    public int mostrarDescripcion(String[] mostrar4, Ejercicio3UnaDeCuatro partida, int n) {
        int i, indiceDevuelto=-1;
        boolean esta;
        do {
            esta = false;
            i = (int) (Math.random() * n);
            for (int j = 0; j < 4; j++) {
                if (mostrar4[j].equals(partida.getRespuesta()[i])) {
                    esta = true;
                    indiceDevuelto=j; // agrego esta línea para que el numero que me devuelva sea el indice de mostrar4 y no de la palabra correcta
                }
            }
        } while (!esta);
        System.out.println("Descripción: " + partida.getCadenaDescripcion()[i]);
        return indiceDevuelto;
    }

    public void reemplazarRespuesta(String[] mostrar4, Ejercicio3UnaDeCuatro partida, int i) {
        boolean encontrado;
        do {
            encontrado = false;
            int j = (int) (Math.random() * partida.getRespuesta().length);
            for (int k = 0; k < 4; k++) {
                if (mostrar4[k].equals(partida.getRespuesta()[j])) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                mostrar4[i] = partida.getRespuesta()[j]; 
            }
        } while (encontrado);
    }

    public void juego(int n) {
        Ejercicio3UnaDeCuatro partida;
        partida = this.crearJuego(n);
        this.limpiarANT(partida);
        int correctas = 0;
        String[] mostrar4 = new String[4];
        this.mostrar4Opciones(mostrar4, partida, n); 
        for (int i = 0; i < n; i++) { // ver la cantidad de oportunidades, acá es la misma que la cantidad de palabras ingresadas
            this.imprimirOpciones(mostrar4);
            int indice = this.mostrarDescripcion(mostrar4, partida, n);
            System.out.println("Ingrese su opción");
            partida.setOpc(leer.nextInt());
          //  if ((Arrays.asList(partida.getRespuesta()).indexOf(mostrar4[partida.getOpc() - 1])) == indice) {
            if ((partida.getOpc() - 1) == indice) { // comparo solamente los indices
                System.out.println("Correcto");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + mostrar4[indice]); //cambié getPartida por mostrar4
            }
            this.reemplazarRespuesta(mostrar4, partida, indice); // cambié i por indice
        }
        System.out.println("Obtuviste " + correctas + " respuestas correctas");
    }

}
