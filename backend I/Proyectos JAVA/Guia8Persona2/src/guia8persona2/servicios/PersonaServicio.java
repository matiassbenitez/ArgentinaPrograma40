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
package guia8persona2.servicios;

import guia8persona2.entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese el edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo: ");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("El sexo ingresado no es correcto. Vuelva a ingresarlo: ");
            sexo = leer.next();
        }
        System.out.println("Ingrese el peso: ");
        float peso = leer.nextFloat();
        System.out.println("Ingrese el altura: ");
        float altura = leer.nextFloat();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public byte calcularIMC(Persona p) {
        float imc = p.getPeso() / (float) Math.pow(p.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public void todo(Persona p) {
        if (this.esMayorDeEdad(p)) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
        switch (this.calcularIMC(p)) {
            case -1:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona está en su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }

    }

    public void mostrarInforme(byte[] imc, boolean[] mayor) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        for (int i = 0; i < 4; i++) {
            if (imc[i] < 0) {
                c1++;
            } else if (imc[i] == 0) {
                c2++;
            } else {
                c3++;
            }
            if (mayor[i]) {
                c4++;
            } else {
                c5++;
            }
        }
        System.out.println("El porcentaje de personas por debajo de su peso ideal es de: " + ((float) c1 / 4) * 100 + "%");
        System.out.println("El porcentaje de personas en su peso ideal es de: " + ((float) c2 / 4) * 100 + "%");
        System.out.println("El porcentaje de personas con sobrepeso es de: " + ((float) c3 / 4) * 100 + "%");
        System.out.println("El porcentaje de personas mayores de edad es de: " + ((float) c4 / 4) * 100 + "%");
        System.out.println("El porcentaje de personas menores de edad es de: " + ((float) c5 / 4) * 100 + "%");

    }

}
