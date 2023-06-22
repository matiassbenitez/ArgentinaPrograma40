/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luna
 */
public class Asiento {
    int fila;
    String columna;
    Espectador persona;

    public Asiento(int fila, String columna) {
        this.fila = fila;
        this.columna = columna;
        this.persona = null;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public Espectador getPersona() {
        return persona;
    }

    public void setPersona(Espectador persona) {
        this.persona = persona;
    }
    
}
