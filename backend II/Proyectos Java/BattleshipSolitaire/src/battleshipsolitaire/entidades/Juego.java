
package battleshipsolitaire.entidades;

import java.util.ArrayList;

public class Juego {

    private String[][] respuesta;
    private String[][] partida;
    private ArrayList<Integer> barcos; //{3,2,2,1,1,1}

    public Juego() {
    }

    public Juego(String[][] respuesta, String[][] partida, ArrayList<Integer> barcos) {
        this.respuesta = respuesta;
        this.partida = partida;
        this.barcos = barcos;
    }

    public String[][] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[][] respuesta) {
        this.respuesta = respuesta;
    }

    public String[][] getPartida() {
        return partida;
    }

    public void setPartida(String[][] partida) {
        this.partida = partida;
    }

    public ArrayList<Integer> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Integer> barcos) {
        this.barcos = barcos;
    }

    @Override
    public String toString() {
        return "Juego{" + "respuesta=" + respuesta + ", partida=" + partida + ", barcos=" + barcos + '}';
    }

    
}
