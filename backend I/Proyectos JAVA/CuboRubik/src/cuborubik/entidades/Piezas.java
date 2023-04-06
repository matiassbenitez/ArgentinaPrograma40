package cuborubik.entidades;

public class Piezas {

    public Centro piezaCentro[];
    public Arista piezaArista[];
    public Esquina piezaEsquina[];

    public Piezas() {

        piezaCentro = new Centro[6];
        piezaArista = new Arista[12];
        piezaEsquina = new Esquina[8];

        for (int i = 0; i < piezaCentro.length; i++) {
            piezaCentro[i] = new Centro();
        }
        for (int i = 0; i < piezaArista.length; i++) {
            piezaArista[i] = new Arista();
        }
        for (int i = 0; i < piezaEsquina.length; i++) {
            piezaEsquina[i] = new Esquina();
        }

    }

}
