
package guia12teoria1;

import guia12teoria1.entidades.Animal;
import guia12teoria1.entidades.Gato;
import guia12teoria1.entidades.Perro;
import java.util.ArrayList;
import java.util.List;


public class Guia12teoria1 {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        Animal a = new Animal();
        Perro b = new Perro(4);
        Gato c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    }

}
