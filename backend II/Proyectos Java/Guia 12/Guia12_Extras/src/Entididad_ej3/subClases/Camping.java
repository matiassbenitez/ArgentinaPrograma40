/*
Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. 

Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package Entididad_ej3.subClases;

import Entididad_ej3.Hotelero;

public class Camping extends Hotelero{
    protected int cantCarp;
    protected int cantBanios;
    protected boolean rest;

    public Camping() {
    }

    public Camping(int cantCarp, int cantBanios, boolean rest, boolean privates, Double metros, Double precio) {
        super(privates, metros, precio);
        this.cantCarp = cantCarp;
        this.cantBanios = cantBanios;
        this.rest = rest;
    }

    public int getCantCarp() {
        return cantCarp;
    }

    public void setCantCarp(int cantCarp) {
        this.cantCarp = cantCarp;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }

    @Override
    public String toString() {
        return "Camping |" + " cant.Carpas =" + cantCarp + ", cant.Baños = " + cantBanios + ", restaurante ? " + rest + ", " +super.toString();
    }
    
}
