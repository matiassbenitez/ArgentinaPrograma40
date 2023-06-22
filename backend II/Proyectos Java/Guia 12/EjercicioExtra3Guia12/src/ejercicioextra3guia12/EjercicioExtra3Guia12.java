package ejercicioextra3guia12;

import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Una compañía de promociones turísticas desea mantener información sobre la
 * infraestructura de alojamiento para turistas, de forma tal que los clientes
 * puedan planear sus vacaciones de acuerdo con sus posibilidades. Los
 * alojamientos se identifican por un nombre, una dirección, una localidad y un
 * gerente encargado del lugar. La compañía trabaja con dos tipos de
 * alojamientos: Hoteles y Alojamientos Extrahoteleros. Los Hoteles tienen como
 * atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos,
 * Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
 * características de las distintas categorías son las siguientes: • Hotel ****
 * Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
 * Nombre del Restaurante, Capacidad del Restaurante, Precio de las
 * Habitaciones. • Hotel ***** Cantidad de Habitaciones, Número de camas,
 * Cantidad de Pisos, Gimnasio, Nombre del Restaurante, Capacidad del
 * Restaurante, Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de
 * Limosinas, Precio de las Habitaciones. Los gimnasios pueden ser clasificados
 * por la empresa como de tipo “A” o de tipo “B”, de acuerdo a las prestaciones
 * observadas. Las limosinas están disponibles para cualquier cliente, pero
 * sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más
 * caro será. El precio de una habitación debe calcularse de acuerdo con la
 * siguiente fórmula: PrecioHabitación = $50 + ($1 x capacidad del hotel) +
 * (valor agregado por restaurante) + (valor agregado por gimnasio) + (valor
 * agregado por limosinas). Donde: Valor agregado por el restaurante: • $10 si
 * la capacidad del restaurante es de menos de 30 personas. • $30 si está entre
 * 30 y 50 personas. • $50 si es mayor de 50. Valor agregado por el gimnasio: •
 * $50 si el tipo del gimnasio es A. • $30 si el tipo del gimnasio es B. Valor
 * agregado por las limosinas: • $15 por la cantidad de limosinas del hotel. En
 * contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a
 * los de los hoteles, estando más orientados a la vida al aire libre y al
 * turista de bajos recursos. Por cada Alojamiento Extrahotelero se indica si es
 * privado o no, así como la cantidad de metros cuadrados que ocupa. Existen dos
 * tipos de alojamientos extrahoteleros: los Camping y las Residencias. Para los
 * Camping se indica la capacidad máxima de carpas, la cantidad de baños
 * disponibles y si posee o no un restaurante dentro de las instalaciones. Para
 * las residencias se indica la cantidad de habitaciones, si se hacen o no
 * descuentos a los gremios y si posee o no campo deportivo. Realizar un
 * programa en el que se representen todas las relaciones descriptas. Realizar
 * un sistema de consulta que le permite al usuario consultar por diferentes
 * criterios:
 * 
 * • todos los alojamientos. 
 * • todos los hoteles de más caro a más barato. 
 * • todos los campings con restaurante • todos las residencias que
 * tienen descuento.
 *
 * @author ALEXIS.R.L
 */
public class EjercicioExtra3Guia12 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        ArrayList<Alojamiento> list = new ArrayList();
        Alojamiento a1 = new HotelDe4Estrellas('B', "PanzaVacia", 50, 25, 2, 10, "Intercontinental", "calle oscura", "Matias", "Bs As");
        Alojamiento a2 = new HotelDe5stars(2, 4, 5, 'B', "PanzaLlena", 30, 200, 3, 20, "Sheraton", "Siempre Viva", "Agustina", "Bs As");
        Alojamiento a3 = new Camping(50, 8, true, true, 200, "EllaLoSabe", "Seguro La Giovana", "German Ballester", "Mendoza");
        Alojamiento a4 = new Residencia(10, true, true, false, 50, "ElPapa", "Algun Lugar", "Alexis", "Santa Rosa");
        
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        
        System.out.println("MENU de Alojamientos");
        System.out.println("1.todos los alojamientos\n 2.hoteles por precio\n 3.campings con restourantes \n 4.residencia con descuento");
        int opcion=leer.nextInt();
        
        switch (opcion) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
    }

}
