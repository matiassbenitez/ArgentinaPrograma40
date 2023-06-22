/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Rectangulo implements calculosFormas {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

}
