/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos.

Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. 

Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.

Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.

 */
package Entididad_ej3;

public class Hotelero {
    protected boolean privates;
    protected Double metros;
    protected Double precio;
    public Hotelero() {
    }

    public Hotelero(boolean privates, Double metros, Double precio) {
        this.privates = privates;
        this.metros = metros;
        this.precio = precio;
    }

    public boolean isPrivates() {
        return privates;
    }

    public void setPrivates(boolean privates) {
        this.privates = privates;
    }

    public Double getMetros() {
        return metros;
    }

    public void setMetros(Double metros) {
        this.metros = metros;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "Privado ? " + privates + ", Precio = "+ precio + ", Dimension = " + metros + " m² |";
    }
    
}
