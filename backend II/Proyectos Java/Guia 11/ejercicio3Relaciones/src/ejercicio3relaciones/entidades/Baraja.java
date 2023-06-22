/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
 * y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
 * contener un método toString() que retorne el número de carta y el palo. La baraja estará
 * compuesta por un conjunto de cartas, 40 exactamente.
 * Las operaciones que podrá realizar la baraja son:
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 * 
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
 * se haya llegado al final, se indica al usuario que no hay más cartas.
 * 
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 * 
 * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
 * cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
 * debemos indicárselo al usuario.
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
 * indicárselo al usuario
 * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
 * luego se llama al método, este no mostrara esa primera carta.
 *
 */
package ejercicio3relaciones.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> mazo;

    public Baraja() {
        mazo = new ArrayList();
        String[] palos = {"espadas", "oros", "bastos", "copas"};
        for (int i = 0; i < 48; i++) {
            if (i % 12 != 8 - 1 && i % 12 != 9 - 1) {
                mazo.add(new Carta((i % 12) + 1, palos[i / 12]));
            }
        }
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }

    public void barajar(){
        Collections.shuffle(mazo);
    }
    public Carta siguienteCarta(){
        Carta dev = null;
        if (!mazo.isEmpty()){
            dev = mazo.get(0);
        }else{
            System.out.println("No quedan cartas por repartir.");
        }
        return dev;
    }
    public void cartasDisponibles(){
        System.out.println("Cantidad de cartas disponibles: " + mazo.size());
    }
    public ArrayList<Carta> darCartas(){
        ArrayList<Carta> cartas = new ArrayList();
        System.out.println("Cuantas cartas desea? ");
        int cant = leer.nextInt();
        if (cant <= mazo.size()){
            for (int i = 0; i < cant; i++) {
                cartas.add(siguienteCarta());
                mazo.remove(0);
            }
        }else{
            System.out.println("No quedan suficientes cartas para repartir.");
        }
        return cartas;
    }
}
