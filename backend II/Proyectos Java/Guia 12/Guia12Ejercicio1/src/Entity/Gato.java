/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author godoy
 */
public class Gato extends Animal {

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    public Gato() {
    }
    
    @Override
    public String seAlimenta(){
        return "Se alimenta de :" + alimento;
    }
}
