/*
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.


14

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Televisor extends Electrodomestico {

    protected int pulgadas;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean TDT, Double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();

        System.out.println("Que resolucion en pulgadas tiene el televisor?");
        setPulgadas(leer.nextInt());
        System.out.println("Tiene sintonizador TDT?");
        if (leer.next().equalsIgnoreCase("S")) {
            TDT = true;
        } else {
            TDT = false;
        }

        precioFinal();

        System.out.println("El precio final queda en $" + precio);
    }

    /**
     * este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
     */
    @Override
    public void precioFinal() {
        super.precioFinal();

        if (pulgadas > 40) {
            precio += precio * 0.3;
        }

        if (TDT) {
            precio += 500;
        }
    }
}
