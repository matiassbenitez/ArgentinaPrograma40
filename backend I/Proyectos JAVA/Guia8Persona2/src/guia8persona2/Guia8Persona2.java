/*
 Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M u O. Si no es correcto se
deberá mostrar un mensaje.

c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
*/
package guia8persona2;

import guia8persona2.entidades.Persona;
import guia8persona2.servicios.PersonaServicio;


public class Guia8Persona2 {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1, p2, p3, p4;
        p1 = new Persona("Matias",38,"H",100,1.70f);
        p2 = new Persona("Sebatian",25,"O",75,1.56f);
        p3 = new Persona("María",15,"M",45,1.40f);
        p4 = new Persona("Soledad",35,"M",30,1.65f);
        ps.todo(p1);
        ps.todo(p2);
        ps.todo(p3);
        ps.todo(p4);
        
        boolean [] mayor = {ps.esMayorDeEdad(p1),ps.esMayorDeEdad(p2),ps.esMayorDeEdad(p3),ps.esMayorDeEdad(p4)};
        byte [] imc = {ps.calcularIMC(p1),ps.calcularIMC(p2),ps.calcularIMC(p3),ps.calcularIMC(p4)};
        ps.mostrarInforme(imc, mayor);
    }   
        
    }


