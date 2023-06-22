/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.ArrayList;
import java.util.Collections;

/**Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 *
 * @author godoy
 */
public enum Vehiculo {
   FORD(101, "Ford",null,null,(int)(Math.random()*34+1990),23,(int)(Math.random()*9+200),null), 
   PEUGEOT(102, "Peugeot",null,null,(int)(Math.random()*34+1990),24,(int)(Math.random()*9+200),null), 
   FIAT(103, "Fiat",null,null,(int)(Math.random()*34+1990),25,(int)(Math.random()*9+200),null),
   NISSAN(104, "Nissan",null,null,(int)(Math.random()*34+1990),26,(int)(Math.random()*9+200),null), 
   CHEVROLET(105,"Chevrolet",null,null,(int)(Math.random()*34+1990),27,(int)(Math.random()*9+200),null), 
   BMW(106,"BMW",null,null,(int)(Math.random()*34+1990),28,(int)(Math.random()*9+200),null), 
   CITROEN(107,"Citroen",null,null,(int)(Math.random()*34+1990),29,(int)(Math.random()*9+200),null), 
   VOLKSWAGEN(108,"Volkswagen",null,null,(int)(Math.random()*34+1990),30,(int)(Math.random()*9+200),null);
   
   private Integer codigo;
   private String nombreMarca;
   private ArrayList<String> colores;
   private String modelo;
   private Integer año, numeroMotor, chasis;
   private ArrayList<String> tipo;

    private Vehiculo(Integer codigo, String nombreMarca, ArrayList<String> colores, String modelo, Integer año, Integer numeroMotor, Integer chasis, ArrayList<String> tipo) {
        this.codigo = codigo; //Hard tipeado
        this.nombreMarca = nombreMarca;//Hard tipeado
        this.colores = new ArrayList();
        this.colores.add("Azul");
        this.colores.add("Rojo");
        this.colores.add("Verde");
        this.colores.add("Violeta");
        this.colores.add("Negro");
        this.colores.add("Blanco");
        Collections.shuffle(colores);
        this.modelo = modelo;//vamos a pedir que ingrese por teclado
        this.año = año;//Ya lo definimos con un math.random
        this.numeroMotor = numeroMotor;//Hard tipeado
        this.chasis = chasis;//Definido con math.random
        this.tipo = new ArrayList();
        this.tipo.add("Camioneta");
        this.tipo.add("Sedan");
        this.tipo.add("SUB");
        this.tipo.add("Camion");
        Collections.shuffle(tipo);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public ArrayList<String> getColores() {
        return colores;
    }

    public void setColores(ArrayList<String> colores) {
        this.colores = colores;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public Integer getChasis() {
        return chasis;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }
   
   
}
