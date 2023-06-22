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
public class Autos {
    private String[] marcaAutos;

    public Autos() {
        marcaAutos = new String[4];
    }

    public Autos(String[] marcaAutos) {
        this.marcaAutos = marcaAutos;
    }

    public void setMarcaAutos(String[] marcaAutos) {
        this.marcaAutos = marcaAutos;
    }

    public String[] getMarcaAutos() {
        return marcaAutos;
    }

    
    
    
}
