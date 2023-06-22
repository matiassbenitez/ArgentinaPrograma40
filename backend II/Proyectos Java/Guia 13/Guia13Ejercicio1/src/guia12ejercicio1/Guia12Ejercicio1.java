/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio1;

import Entity.Animal;
import Entity.Caballo;
import Entity.Gato;
import Entity.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author godoy
 */
public class Guia12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos lista para guradar animales
        List <Animal> listaAnimales = new ArrayList();
        
        //Creamos 4 perritos y los añadimos a la lista
        Animal perro1 = new Perro("Max","Crocetas","Husky",5);
        perro1.seAlimenta();
        listaAnimales.add(perro1);
        Animal perro2 = new Perro("Luna","Pollo","Bulldog",7);
        perro2.seAlimenta();
        listaAnimales.add(perro2);
        Animal perro3 = new Perro("Carlito","Alimento balanceado","Terrier",3);
        perro3.seAlimenta();
        listaAnimales.add(perro3);
        Animal perro4 = new Perro("Iñaki","Arroz","Pastor Aleman",1);
        perro4.seAlimenta();
        listaAnimales.add(perro4);
        
        //Creamos 3 gatos y los añadimos a la lista
        Animal gato1 = new Gato("Mica","Pajaritos","De la calle",1);
        gato1.seAlimenta();
        listaAnimales.add(gato1);
        Animal gato2 = new Gato("Michi","Palomas","Siames",4);
        gato2.seAlimenta();
        listaAnimales.add(gato2);
        Animal gato3 = new Gato("Nico","Alimento balanceado","Persa",10);
        gato3.seAlimenta();
        listaAnimales.add(gato3);
        
        //Creamos 2 caballos y los añadimos a la lista
        Animal caballo1 = new Caballo("Felipe","Maiz","Andaluz",7);
        caballo1.seAlimenta();
        listaAnimales.add(caballo1);
        Animal caballo2 = new Caballo("Turca","Avena","Pura sangre",6);
        caballo2.seAlimenta();
        listaAnimales.add(caballo2);
        
        for (Animal aux : listaAnimales) {
            System.out.println(aux + aux.seAlimenta());
        }
        
    }
    
}
