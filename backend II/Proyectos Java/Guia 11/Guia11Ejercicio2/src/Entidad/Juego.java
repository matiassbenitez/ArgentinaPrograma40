/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Jugadores (conjunto de Jugadores) y
Revólver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 * @author camip
 */
public class Juego {
    private ArrayList <Jugador> jugadores = new ArrayList ();
    private Revolver r ;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
    public void llenarJuego(){
        Scanner leer = new Scanner (System.in);
        System.out.println("introduzca la cantidad de jugadores");
        int cantidad = leer.nextInt();
        if (cantidad >6 || cantidad <1) {
            cantidad =6;
        }
        for (int i = 0; i < cantidad; i++) {
            jugadores.add(new Jugador (i+1));
            
        }
        r = new Revolver();
    }
    public void ronda(){
        int contador = 0;
        boolean aux = false;
        
        do {
            System.out.println("jugaodr" +contador+1);
            if (contador == jugadores.size()) {
                contador =0;
            }
            aux = jugadores.get(contador).disparo(r);
            contador ++;
            
            if (r.getPosicionActual() == r.getPosicionAgua()) {
                 aux = true;
            }
            
        } while (!aux);
        System.out.println("se mojó el jugador n°" + jugadores.get(contador -1).getId());
    }
}
