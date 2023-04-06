/*Crea una clase "Cocina" que tenga una lista de objetos "Receta". 
Luego, crea métodos para agregar nuevas recetas a la lista, para 
buscar una receta por nombre y para obtener la lista de recetas que 
se pueden preparar con los ingredientes disponibles en la cocina.*/

package Entidades;

import java.util.Arrays;

public class Cocina {

    private String[] ingredientes;
    private Receta[] ListaRecetas;

    public Receta[] recetasPosibles() {
        Receta[] recetasPosibles = new Receta[10];
        boolean encontrado = true;
        int cantRec = 0;
        for (int i = 0; i < ListaRecetas.length; i++) {
            int contR = 0;
            while (encontrado && contR < ListaRecetas[i].ingredientes.length) {
                int contC = 0;
                boolean encontradoIng = false;
                while (!encontradoIng && contC < this.ingredientes.length) {
                    if (ListaRecetas[i].ingredientes[contR].equalsIgnoreCase(this.ingredientes[contC])) {
                        encontradoIng = true;
                    }
                    contC++;
                }
                if (!encontradoIng) {
                    encontrado = false;
                }
                contR++;
            }

            if (encontrado) {
                recetasPosibles[cantRec] = ListaRecetas[i];
                cantRec++;
            }
        }

        return recetasPosibles;
    }

    public Cocina(String[] ingredientes, Receta[] ListaRecetas) {
        this.ingredientes = ingredientes;
        this.ListaRecetas = ListaRecetas;
    }

    public Cocina() {
    }

    @Override
    public String toString() {
        return "Cocina{" + "ingredientes=" + Arrays.toString(ingredientes) + ", ListaRecetas=" + Arrays.toString(ListaRecetas) + '}';
    }

}
