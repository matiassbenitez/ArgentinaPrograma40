package battleshipsolitaire.servicios;

import battleshipsolitaire.entidades.Juego;
import java.util.ArrayList;
import java.util.Arrays;

public class JuegoService {

    public Juego crearJuego(int tamTablero) {
        int[] b6 = {3, 2, 2, 1, 1, 1};
        int[] b7 = {4, 3, 2, 2, 1, 1, 1};
        int[] b8 = {4, 3, 3, 2, 2, 2, 1, 1, 1};
        int[] b10 = {5, 4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        int[] b12 = {5, 4, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1};
        int[] b15 = {5, 4, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1};
        ArrayList<Integer> barcos = new ArrayList();
        switch (tamTablero) {
            case 6:
                for (int i = 0; i < 6; i++) {
                    barcos.add(b6[i]);
                }
                break;
            case 7:
                for (int i = 0; i < 7; i++) {
                    barcos.add(b7[i]);
                }
                break;
            case 8:
                for (int i = 0; i < 9; i++) {
                    barcos.add(b8[i]);
                }
                break;
            case 10:
                for (int i = 0; i < 11; i++) {
                    barcos.add(b10[i]);
                }

                break;
            case 12:
                for (int i = 0; i < 12; i++) {
                    barcos.add(b12[i]);
                }
                break;
            case 15:
                for (int i = 0; i < 14; i++) {
                    barcos.add(b15[i]);
                }
                break;
        }
        String[][] respuesta = new String[tamTablero][tamTablero];

        boolean barcosColocados;
        do {
            barcosColocados = false;
            for (int i = 0; i < tamTablero; i++) {
                for (int j = 0; j < tamTablero; j++) {
                    respuesta[i][j] = "▒";
                }
            }
            for (int i = 0; i < barcos.size() - 2; i++) {
                ubicarBarco(respuesta, barcos.get(i));
            }
            if (verificarBlancos(respuesta)) {
                ubicarBarco(respuesta, 1);
                barcosColocados = verificarBlancos(respuesta);
                if (barcosColocados) {
                    ubicarBarco(respuesta, 1);
                }
            }
        } while (!barcosColocados);
        String[][] partida = new String[tamTablero][tamTablero];
        for (int i = 0; i < tamTablero; i++) {
            for (int j = 0; j < tamTablero; j++) {
                partida[i][j] = "▒";

            }
        }
        return new Juego(respuesta, partida, barcos);
    }

    public void mostrarTablero(String[][] tablero, String[][] tablero2) {
        int cont = 0;
        System.out.print("   ");
        for (int i = 0; i < tablero2[0].length; i++) {
            for (int j = 0; j < tablero2[0].length; j++) {
                if (tablero2[j][i].equals("█")){
                    cont++;
                }
            }
                System.out.printf("\u001B[30m%d",cont);
                if (i !=tablero2[0].length-1){
                    System.out.print("\u001B[37m─");
                }
                cont=0;
        }
        System.out.println("");
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero2[0].length; j++) {
                if (tablero2[i][j].equals("█")){
                    cont++;
                }
            }
                System.out.print(" " +cont + " ");
                cont=0;
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }
//    public void mostrarTablero(String[][] tablero) {
//        for (int i = 0; i < tablero[0].length; i++) {
//            for (int j = 0; j < tablero[0].length; j++) {
//                System.out.print(tablero[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }

    private boolean verificar(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean verificado = true;
        boolean u = true, d = true, l = true, r = true;
        if (direccion == 0) {
            if (fila != 0) {
                u = false;
            }
            if (fila != respuesta[0].length - 1) {
                d = false;
            }
            if (columna != 0) {
                l = false;
            }
            if (columna != respuesta[0].length - barco) {
                r = false;
            }
        } else {
            if (fila != 0) {
                u = false;
            }
            if (fila != respuesta[0].length - barco) {
                d = false;
            }
            if (columna != 0) {
                l = false;
            }
            if (columna != respuesta[0].length - 1) {
                r = false;
            }
        }
        if (u) {                        //está arriba
            if (verificarAbajo(respuesta, fila, columna, barco, direccion)) {
                if (l) {                //está arriba y a la izquierda
                    if (verificarDerecha(respuesta, fila, columna, barco, direccion)) {
                        if (!verificarAD(respuesta, fila, columna, barco, direccion)) {
                            verificado = false;
                        }
                    } else {
                        verificado = false;
                    }
                } else {            //está arriba y no está a la izquierda
                    if (verificarIzquierda(respuesta, fila, columna, barco, direccion)) {
                        if (!verificarAI(respuesta, fila, columna, barco, direccion)) {
                            verificado = false;
                        }
                        if (!r) { //está arriba, no a la izquierda y no a la derecha
                            if (verificarDerecha(respuesta, fila, columna, barco, direccion)) {
                                if (!verificarAD(respuesta, fila, columna, barco, direccion)) {
                                    verificado = false;
                                }
                            } else {
                                verificado = false;
                            }
                        }
                    } else {
                        verificado = false;
                    }
                }
            } else {
                verificado = false;
            }
        } else {                        //no está arriba
            if (verificarArriba(respuesta, fila, columna, barco, direccion)) {
                if (l) {                   //no está arriba y está a la izquierda
                    if (verificarDerecha(respuesta, fila, columna, barco, direccion)) {
                        if (verificarUD(respuesta, fila, columna, barco, direccion)) {
                            if (!d) {    //no está arriba, está a la izquierda y no está abajo
                                if (verificarAbajo(respuesta, fila, columna, barco, direccion)) {
                                    if (!verificarAD(respuesta, fila, columna, barco, direccion)) {
                                        verificado = false;
                                    }
                                } else {
                                    verificado = false;
                                }
                            }
                        } else {
                            verificado = false;
                        }
                    } else {
                        verificado = false;
                    }
                } else {                    //no está arriba y no está a la izquierda
                    if (verificarIzquierda(respuesta, fila, columna, barco, direccion)) {
                        if (verificaUI(respuesta, fila, columna, barco, direccion)) {
                            if (!r) {        //no está arriba, no está a la izquierda y no está a la derecha
                                if (verificarDerecha(respuesta, fila, columna, barco, direccion)) {
                                    if (!verificarUD(respuesta, fila, columna, barco, direccion)) {
                                        verificado = false;
                                    }
                                } else {
                                    verificado = false;
                                }
                            }
                            if (!d) {
                                if (verificarAbajo(respuesta, fila, columna, barco, direccion)) {
                                    if (verificarAI(respuesta, fila, columna, barco, direccion)) {
                                        if (!r) {
                                            if (!verificarAD(respuesta, fila, columna, barco, direccion)) {
                                                verificado = false;
                                            }
                                        }
                                    } else {
                                        verificado = false;
                                    }
                                } else {
                                    verificado = false;

                                }
                            }
                        } else {
                            verificado = false;
                        }
                    } else {
                        verificado = false;
                    }
                }

            } else {
                verificado = false;
            }
        }
        return verificado;
    }

    public boolean verificarArriba(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (direccion == 0) {
            for (int i = 0; i < barco; i++) {
                if (!respuesta[fila - 1][columna + i].equals("▒")) {
                    libre = false;
                }
            }

        } else {
            if (!respuesta[fila - 1][columna].equals("▒")) {
                libre = false;
            }
        }
        return libre;
    }

    public boolean verificarAbajo(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (direccion == 0) {
            for (int i = 0; i < barco; i++) {
                if (!respuesta[fila + 1][columna + i].equals("▒")) {
                    libre = false;
                }
            }
        } else {
            if (!respuesta[fila + barco][columna].equals("▒")) {
                libre = false;
            }
        }
        return libre;
    }

    public boolean verificarIzquierda(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (direccion == 1) {
            for (int i = 0; i < barco; i++) {
                if (!respuesta[fila + i][columna - 1].equals("▒")) {
                    libre = false;
                }
            }
        } else {
            if (!respuesta[fila][columna - 1].equals("▒")) {
                libre = false;
            }
        }
        return libre;
    }

    public boolean verificarDerecha(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (direccion == 1) {
            for (int i = 0; i < barco; i++) {
                if (!respuesta[fila + i][columna + 1].equals("▒")) {
                    libre = false;
                }
            }

        } else {
            if (!respuesta[fila][columna + barco].equals("▒")) {
                libre = false;
            }
        }
        return libre;
    }

    private boolean verificarAI(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (direccion == 0) {
            if (!respuesta[fila + 1][columna - 1].equals("▒")) {
                libre = false;
            }
        } else {
            if (!respuesta[fila + barco][columna - 1].equals("▒")) {
                libre = false;
            }
        }
        return libre;
    }

    private boolean verificarAD(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (direccion == 0) {
            if (!respuesta[fila + 1][columna + barco].equals("▒")) {
                libre = false;
            }
        } else {
            if (!respuesta[fila + barco][columna + 1].equals("▒")) {
                libre = false;
            }
        }
        return libre;
    }

    private boolean verificarUD(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (direccion == 0) {
            if (!respuesta[fila - 1][columna + barco].equals("▒")) {
                libre = false;
            }
        } else {
            if (!respuesta[fila - 1][columna + 1].equals("▒")) {
                libre = false;
            }
        }
        return libre;
    }

    private boolean verificaUI(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean libre = true;
        if (!respuesta[fila - 1][columna - 1].equals("▒")) {
            libre = false;
        }
        return libre;
    }

    private boolean verificarPosicion(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        boolean verificado = true;
        //verificar si no se sale de la pantalla
        if (direccion == 0) {
            if (columna < respuesta[0].length - barco) {
                for (int i = 0; i < barco; i++) {
                    if (!respuesta[fila][columna + i].equals("▒")) {
                        verificado = false;
                    }
                }
            } else {
                verificado = false;
            }
        } else {
            if (fila < respuesta[0].length - barco) {
                for (int i = 0; i < barco; i++) {
                    if (!respuesta[fila + i][columna].equals("▒")) {
                        verificado = false;
                    }
                }
            } else {
                verificado = false;
            }

        }
        return verificado;
    }

    public void colocarBarco(String[][] respuesta, int fila, int columna, int barco, int direccion) {
        if (direccion == 0) {
            //System.out.println("barco" + barco);
            for (int i = 0; i < barco; i++) {
               // System.out.println("i:" + i);
                respuesta[fila][columna + i] = "█";
            }
        } else {
           // System.out.println("barco" + barco);
            for (int i = 0; i < barco; i++) {
               // System.out.println("i:" + i);
                respuesta[fila + i][columna] = "█";
            }
        }
    }

//    public boolean verificarBlancos(String[][] respuesta) { //HACERLO ESTRUCTURADO Y TIENE QUE SER ALEATORIO
//        boolean verificado = false;
//        for (int i = 0; i < respuesta[0].length; i++) {
//            for (int j = 0; j < respuesta[0].length; j++) {
//                System.out.println("VARIFICANDO: "+i +","+j);
//                if (verificarPosicion(respuesta, i, j, 1, 0)) {
//                    if (verificar(respuesta, i, j, 1, 0)) {
//                        colocarBarco(respuesta, i, j, 1, 0);
//                        return true;
//                    }
//                }
//            }
//        }
//        return verificado;
//    }
    public void ubicarBarco(String[][] respuesta, int barco) {
        boolean colocado;
        do {
            colocado = true;
            int fila = (int) (Math.random() * respuesta[0].length);
            int columna = (int) (Math.random() * respuesta[0].length);
           // System.out.println("(" + fila + "," + columna + ")");
            int direccion = (int) (Math.random() * 2);
           // System.out.println("direccion: " + direccion);
            if (verificarPosicion(respuesta, fila, columna, barco, direccion)) {
               // System.out.println("posicion verificada");
                if (verificar(respuesta, fila, columna, barco, direccion)) {
                  //  System.out.println("verificado alrededores");
                    colocarBarco(respuesta, fila, columna, barco, direccion);
                } else {
                    colocado = false;
                }
            } else {
                colocado = false;
            }
        } while (!colocado);
    }

    public boolean verificarBlancos(String[][] respuesta) {
        boolean verificado = false;
        int i = 0, j = 0;
        while (i < respuesta[0].length && !verificado) {
            //System.out.println("VERIFICANDO: " + i + "," + j);
            if (verificarPosicion(respuesta, i, j, 1, 0)) {
                if (verificar(respuesta, i, j, 1, 0)) {
                    verificado = true;
                } else {
                    j++;
                }
            } else {
                j++;
            }
            if (j == respuesta[0].length) {
                j = 0;
                i++;
            }
        }
        return verificado;
    }
}
