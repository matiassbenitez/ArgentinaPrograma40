/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package Entidad_ej2.Services;

import Entidad_ej2.Edificio;
import Entidad_ej2.subclases.Oficina;
import Entidad_ej2.subclases.PoliDep;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Services {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Edificio crearEdificio() {
        System.out.println("Ingrese el Ancho del Edificio : ");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el Largo del Edificio : ");
        int largo = leer.nextInt();
        System.out.println("Ingrese la Altura del Edificio : ");
        int alto = leer.nextInt();
        return new Edificio(ancho, alto, largo) {
            @Override
            public int calcularSuperficie() {
                return largo * ancho;
            }
            @Override
            public int calcularVolumen() {
                return largo * ancho * alto;
            }
        };
    }

    public PoliDep crearPoliDeportivo() {
//Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o Abierto
        Edificio ed = crearEdificio();
        System.out.println("Nombre del polideportivo");
        String nombre = leer.next();
        System.out.println("tipo de instalaciónTechado o Abierto ? T/A");
        char res = leer.next().charAt(0);
        while (res != 'T' && res != 'A' && res != 't' && res != 'a') {
            System.out.println("Seleccion la Opcion Correctamente T/A");
            res = leer.next().charAt(0);
        }
        return new PoliDep(nombre, res, ed.getAncho(), ed.getAlto(), ed.getLargo());
    }

    public Oficina crearOficina(ArrayList<Integer> numOficinas, ArrayList<Integer> Personas) {
        Edificio ed = crearEdificio();
//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.
        System.out.println("Ingrese la Cantidad de Pisos");
        int pisos = leer.nextInt();
        int cont = 1;
        do {
            System.out.println("Ingrese la cantidad de Oficinas para el piso " + cont);
            int num = leer.nextInt();
            while (num < 0) {
                System.out.println("Error. Ingrese alguna Oficina ");
                num = leer.nextInt();
            }
            System.out.println("Ingrese la cantidad de Personas que entran por Oficina");
            int cantP = leer.nextInt();
            while (cantP < 0) {
                System.out.println("Error. Ingrese alguna Persona ");
                cantP = leer.nextInt();
            }
            numOficinas.add(num);
            Personas.add(cantP);
            cont++;
        } while (cont != (pisos + 1));
        return new Oficina(numOficinas, Personas, pisos, ed.getAncho(), ed.getAlto(), ed.getLargo());
    }

    public void CalculoAux(HashSet<Edificio> edif){
        for (Edificio edificio : edif) {
            if (edificio instanceof Oficina) {
                 CalcularPersonas((Oficina) edificio);
                 System.out.println("");
            }
        }
    }
    
    public void CalcularPersonas(Oficina of) {
        ArrayList<Integer> edif = new ArrayList();
        for (int i = 0; i < of.getNumPisos(); i++) {
            int cont = of.getNumOficinas().get(i) * of.getCantPersonas().get(i);
            edif.add(cont);
        }
        MostrarPisos(edif);
    }

    public void MostrarPisos(ArrayList<Integer> edif) {
        int cont = 1;
        int totalP = 0;
        for (int i = 0; i < edif.size(); i++) {
            System.out.println("En el piso " + cont + " hay " + edif.get(i) + " Personas");
            totalP += edif.get(i);
            cont++;
        }
        System.out.println("- - - - - - - -");
        System.out.println("Total de Personas : " + totalP);
    }

    public void LlenarDatos(HashSet<Edificio> edif, int cont) {
        ArrayList<Integer> of = new ArrayList();
        ArrayList<Integer> per = new ArrayList();
        String opc;
        int c = 0;
        do {
            System.out.println("Que desea agregar Oficina o Polideportivo? O/P");
            opc = leer.next();
            
            while (!opc.equalsIgnoreCase("O") && !opc.equalsIgnoreCase("P")) {
                System.out.println("Seleccion la Opcion Correctamente O/P");
                opc = leer.next();
            }
            if (opc.equalsIgnoreCase("O")) {
                edif.add(crearOficina(of, per));
            }
            if (opc.equalsIgnoreCase("P")) {
                edif.add(crearPoliDeportivo());
            }
            c++;
        } while (cont != c);
    }

    public void Calculo(Edificio edif){
        System.out.println("Superficie : " + edif.calcularSuperficie());
        System.out.println("Volumen : "+edif.calcularVolumen() );
    }
    
    public void RecorridoCalculo(HashSet<Edificio> edif){
        for (Edificio edificio : edif) {
            if (edificio instanceof PoliDep) {
                System.out.println("PoliDeportivo");
            }
            if (edificio instanceof Oficina) {
                System.out.println("Oficina");
            }
            Calculo(edificio);
            System.out.println("");
        }
    }
}
