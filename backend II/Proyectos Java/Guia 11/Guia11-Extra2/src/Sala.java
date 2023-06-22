/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luna
 */
public class Sala {
    Asiento [][] listadeObjetillos = new Asiento[8][6];

    public Sala() {
        String [] columna ={"A","B","C","D","E","F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                listadeObjetillos[i][j] = new Asiento(8-i,columna[j]);
            }
        }
    }

    public Asiento[][] getListadeObjetillos() {
        return listadeObjetillos;
    }

    public void setListadeObjetillos(Asiento[][] listadeObjetillos) {
        this.listadeObjetillos = listadeObjetillos;
    }

    
    
}
