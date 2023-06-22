/**
 * Una compañía de promociones turísticas desea mantener información sobre la infraestructura
 * de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
 * acuerdo con sus posibilidades.
 *
 * Los alojamientos se identifican por un nombre, una dirección,
 * una localidad y un gerente encargado del lugar.
 *
 * La compañía trabaja con dos tipos de
 * alojamientos: Hoteles y Alojamientos Extrahoteleros.
 *
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
 * Pisos, Precio de Habitaciones.
 *
 * Y estos pueden ser de cuatro o cinco estrellas. Las
 * características de las distintas categorías son las siguientes:
 * • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
 * Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
 * Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
 * Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 * Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
 * acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
 * cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
 * será.
 * El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
 * PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
 * agregado por gimnasio) + (valor agregado por limosinas).
 * Donde:
 * Valor agregado por el restaurante:
 * • $10 si la capacidad del restaurante es de menos de 30 personas.
 * • $30 si está entre 30 y 50 personas.
 * • $50 si es mayor de 50.
 * Valor agregado por el gimnasio:
 * • $50 si el tipo del gimnasio es A.
 * • $30 si el tipo del gimnasio es B.
 * Valor agregado por las limosinas:
 * • $15 por la cantidad de limosinas del hotel.
 *
 * En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
 * hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
 * Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
 * cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
 * Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
 * disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
 * indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
 * campo deportivo. Realizar un programa en el que se representen todas las relaciones
 * descriptas.
 * Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
 * • todos los alojamientos.
 * • todos los hoteles de más caro a más barato.
 * • todos los campings con restaurante
 * • todos las residencias que tienen descuento.
 */
package guia12ej3extra;

import guia12ej3extra.entidades.*;
import guia12ej3extra.servicios.Service;
import java.util.ArrayList;

public class Guia12ej3extra {

    public static void main(String[] args) {
        Service sv = new Service();
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        alojamientos.add(new Hotel4E('A', "pepito", 60, 60, 2, 10, "Hotel A", "calle 111", "aaaa", "AAA"));
        alojamientos.add(new Hotel4E('B', "pepito2", 25, 30, 2, 3, "Hotel B", "calle 222", "gggg", "GGG"));
        alojamientos.add(new Hotel5E(1, 5, 2, 'A', "resto2", 45, 50, 2, 10, "Hotel 6", "calle 6666", "ffff", "FFF"));
        alojamientos.add(new Hotel5E(2, 10, 3, 'A', "resto", 60, 80, 2, 20, "Hotel 5", "calle 5555", "bbbb", "BBBB"));
        alojamientos.add(new Camping(30, 6, false, true, 500, "camping 1", "ssss 1111", "ssss", "SSS"));
        alojamientos.add(new Camping(20, 3, true, false, 300, "camping 2", "zzzz 2222", "zzzz", "ZZZ"));
        alojamientos.add(new Residencia(20, true, true, true, 650, "residencia 1", "rrrr 6666", "rrrr", "RRR"));
        alojamientos.add(new Residencia(50, false, true, false, 1220, "residencia 2", "yyyy 9999", "yyy", "YYY"));
        sv.menu(alojamientos);
    }

}
