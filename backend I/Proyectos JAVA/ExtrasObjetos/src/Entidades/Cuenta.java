/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
 */
package Entidades;

import java.util.Scanner;

public class Cuenta {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void retirar_dinero() {
        System.out.println("Por favor ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > saldo) {
            System.out.println("No se pudo realizar la transacción. Saldo insuficiente.");
        } else {
            saldo -= retiro;
            System.out.println("Su retiro fue de $" + retiro + ", su saldo actual es de $" + saldo + ".");
        }
    }
}
