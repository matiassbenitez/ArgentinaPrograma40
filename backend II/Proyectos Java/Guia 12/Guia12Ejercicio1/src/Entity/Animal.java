/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
 * @author godoy
 * Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
public class Animal {
    protected String nombre, alimento, raza;
    protected int edad;

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public Animal() {
    }
    
    public String seAlimenta(){
        return "Como lo que venga, a veces veo bien y a veces no";
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
