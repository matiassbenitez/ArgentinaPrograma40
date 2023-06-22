/*
Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
package Entididad_ej3.subClases;

import Entididad_ej3.Hotelero;

public class Residencia extends Hotelero{
    
 protected int cantHabt;
 protected boolean descGremio;
 protected boolean campDep;

    public Residencia() {
    }

    public Residencia(int cantHabt, boolean descGremio, boolean campDep, boolean privates, Double metros, Double precio) {
        super(privates, metros, precio);
        this.cantHabt = cantHabt;
        this.descGremio = descGremio;
        this.campDep = campDep;
    }

    public int getCantHabt() {
        return cantHabt;
    }

    public void setCantHabt(int cantHabt) {
        this.cantHabt = cantHabt;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampDep() {
        return campDep;
    }

    public void setCampDep(boolean campDep) {
        this.campDep = campDep;
    }

    @Override
    public String toString() {
        return "Residencia | " + "cant.Habitaciones = " + cantHabt + ", desc.Gremio ? " + descGremio + ", campDeportivo ? " + campDep + ", " + super.toString();
    }
 
 
}
