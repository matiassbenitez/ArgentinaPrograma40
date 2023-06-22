
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luna
 */
public class Servicio {
    ArrayList<Espectador> lista = new ArrayList();
    public void crearEspectadores(){
        for (int i = 0; i < 20; i++) {
            String nombre = "Espectador "+Integer.toString(i);
            int edad = ((int) (Math.random()*60)+10);
            float dinero = (float)Math.random()*100+1;
            lista.add(new Espectador(nombre,edad,dinero));
        }
    }
    public void controlar(Cine cine){
      
        for (Espectador espectador : lista) {
            if (espectador.getEdad() >= cine.getPelicula().getEdadMinima()) {
                if (espectador.getDinero() >= cine.getPrecioEntrada()) {
                    boolean vacio = false;
                    do {
                        int fila = (int) (Math.random()*8);
                        int columna = (int) (Math.random()*6);
                        if (cine.getSala().getListadeObjetillos()[fila][columna].getPersona() == null) {
                            vacio = true;
                            cine.getSala().getListadeObjetillos()[fila][columna].setPersona(espectador);
                        }
                    } while (!vacio);
                    
                }else{
                    System.out.println("No posee el dinero suficiente");
                }
            }else{
                System.out.println("No tiene la edad requerida");
            }
        }
    }
    public void mostrarSala(Cine cine){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print (cine.getSala().getListadeObjetillos()[i][j].getFila());
                System.out.print(cine.getSala().getListadeObjetillos()[i][j].getColumna());
                if (cine.getSala().getListadeObjetillos()[i][j].getPersona() != null) {
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
