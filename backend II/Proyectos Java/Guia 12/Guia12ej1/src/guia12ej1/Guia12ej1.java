
package guia12ej1;

import guia12ej1.entidades.Animal;
import guia12ej1.entidades.Caballo;
import guia12ej1.entidades.Gato;
import guia12ej1.entidades.Perro;


public class Guia12ej1 {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich","Carne",15,"Doberman");
        perro1.alimentarse();
        
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.alimentarse();
        
        Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
        gato1.alimentarse();
        
        Animal caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.alimentarse();
        
        
    }

}
