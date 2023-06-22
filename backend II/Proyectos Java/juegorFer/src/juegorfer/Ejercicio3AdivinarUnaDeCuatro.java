package juegoFer;

import juegoFer.servicios.Ejercicio3UnaDeCuatroServicio;
import java.util.Scanner;

public class Ejercicio3AdivinarUnaDeCuatro {

    public static void main(String[] args) {
        Ejercicio3UnaDeCuatroServicio r1 = new Ejercicio3UnaDeCuatroServicio();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de respuestas correctas con sus respectivas descripciones para jugar");
        int n = leer.nextInt();
        r1.juego(n);
    }
    
}
