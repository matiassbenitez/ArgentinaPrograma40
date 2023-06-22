/*
 Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. 

Las características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.

• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.

El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).

Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

 */
package Entididad_ej3.subClases;


public class Hotel5 extends Hotel4 {

    /*
    • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
     int cantHabitaciones, int numCamas, int cantPisos, Double precioHabit
     */
    protected int cantSalas;
    protected int cantSuites;
    protected int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalas, int cantSuites, int cantLimosinas, char gimnasio, String nomRest, int capRest, int cantHabitaciones, int numCamas, int cantPisos, Double precioHabit) {
        super(gimnasio, nomRest, capRest, cantHabitaciones, numCamas, cantPisos, precioHabit);
        this.cantSalas = cantSalas;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalas() {
        return cantSalas;
    }

    public void setCantSalas(int cantSalas) {
        this.cantSalas = cantSalas;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel 5* | " + "cant.Salas = " + cantSalas + ", cant.Suites = " + cantSuites + ", cant.Limosinas = " + cantLimosinas + "\n" + super.toString();
    }
    
}
