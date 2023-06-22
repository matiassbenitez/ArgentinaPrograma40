
package battleshipsolitaire;

import battleshipsolitaire.entidades.Juego;
import battleshipsolitaire.servicios.JuegoService;

public class BattleshipSolitaire {

    public static void main(String[] args) {
        JuegoService js = new JuegoService();
        Juego partida1 = js.crearJuego(15);
        js.mostrarTablero(partida1.getRespuesta(),partida1.getRespuesta());

    }

}
