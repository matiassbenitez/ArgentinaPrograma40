package guia11ej3.Servicios;

import guia11ej3.entidades.Carta;
import guia11ej3.entidades.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MazoService {

    ArrayList<Carta> monton = new ArrayList();

    public Mazo crearMazo() {
        ArrayList<Carta> mazo = new ArrayList();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        for (int i = 0; i < 48; i++) {
            if (i % 12 != 8 - 1 && i % 12 != 9 - 1) {
                mazo.add(new Carta((i % 12) + 1, palos[i / 12]));
            }
        }
        return new Mazo(mazo);
    }

    /*
    public void barajar(Mazo mazo){
        ArrayList<Integer> num = new ArrayList();
        ArrayList<Carta> mazo2 = new ArrayList();
        mazo2.addAll(mazo.getMazo());
        int n;
        for (int i = 0; i < 40; i++) {
            do {
                n=(int)(Math.random()*40);

            } while (num.contains(n));
            num.add(n);
            mazo.getMazo().set(i, mazo2.get(n));
        }
    }*/
//    public void barajar(Mazo mazo) {
//        ArrayList<Integer> num = new ArrayList();
//        ArrayList<Carta> mazo2 = new ArrayList();
//        for (int i = 0; i < 40; i++) {
//            num.add(i);
//        }
//        mazo2.addAll(mazo.getMazo());
//        int n;
//        for (int i = 0; i < 40; i++) {
//            n = (int) (Math.random() * num.size());
//            mazo.getMazo().set(i, mazo2.get(num.get(n)));
//            num.remove(n);
//        }
//    }
    public void barajar(Mazo mazo){
        Collections.shuffle(mazo.getMazo());
    }

    public Carta siguienteCarta(Mazo mazo) {
        Carta siguiente;
        if (mazo.getMazo().size() > 0) {
            siguiente = mazo.getMazo().get(mazo.getMazo().size() - 1);
        } else {
            System.out.println("No hay cartas disponibles.");
            siguiente = new Carta(0, "");
        }
        return siguiente;
    }

    public int cartasDisponibles(Mazo mazo) {
        int cantidad = mazo.getMazo().size();
        System.out.println("Hay " + cantidad + " cartas para repartir.");
        return cantidad;
    }

    public ArrayList<Carta> darCartas(Mazo mazo) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Carta> cartas = new ArrayList();
        System.out.println("Ingrese la cantidad de cartas a pedir: ");
        int cantidad = leer.nextInt();
        if (cartasDisponibles(mazo) >= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                cartas.add(siguienteCarta(mazo));
                mazo.getMazo().remove(mazo.getMazo().size() - 1);
            }
        } else {
            System.out.println("No hay suficientes cartas.");
        }
        monton.addAll(cartas);
        return cartas;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("Todavía no ha salido ninguna carta.");
        } else {
            System.out.println("Las cartas que han salido son las siguientes: ");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarMazo(Mazo mazo) {
        if (mazo.getMazo().isEmpty()) {
            System.out.println("El mazo está vacío.");
        } else {
            for (Carta carta : mazo.getMazo()) {
                System.out.println(carta);
            }
        }
    }
}
