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
public class Persona {
    private Integer edad;
    private String nombre;

    public Persona(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean esMayorDeEdad(){
        return this.edad > 17;
    }
}
