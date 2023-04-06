package claseservicio.Servicio;

import claseservicio.Entidad.CuentaBancaria;
import java.util.Scanner;

//Realizar una clase llamada CuentaBancaria en el paquete Entidades con
//los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
//saldoActual. Agregar constructor vacío, con parámetros, getters y
//setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que
//contenga:
//a) Método para crear cuenta pidiéndole los datos al usuario.
//b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
//se le sumará al saldo actual.
//c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
//restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
//retirar se retirará el máximo posible hasta dejar la cuenta en 0.
//d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
//Validar que el usuario no saque más del 20%.
//e) Método consultarSaldo: permitirá consultar el saldo disponible en la
//cuenta.
//f) Método consultarDatos: permitirá mostrar todos los datos de la
//cuenta
public class CuentaBancariaServicio {

    Scanner read = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = read.nextInt();
        System.out.println("Ingrese el dni");
        long dniCliente = read.nextLong();
        System.out.println("Ingrese el saldo Actual");
        double saldoActual = read.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresarDinero(double ingDin, CuentaBancaria c) {
        c.setSaldoActual(c.getSaldoActual() + ingDin);
    }

    public void retirarDinero(double retDin, CuentaBancaria c) {
        if (c.getSaldoActual() < retDin) {
            System.out.println("Solamente se pudo retirar " + c.getSaldoActual());
            c.setSaldoActual(0);
        } else {
            c.setSaldoActual(c.getSaldoActual() - retDin);
        }
    }

    public void extraccionRapida(double extraDin, CuentaBancaria c) {
        if (extraDin <= (c.getSaldoActual() * 0.20)) {
            c.setSaldoActual(c.getSaldoActual() - extraDin);
        } else {
            System.out.println("Solo se pudo retirar el 20%:" + (c.getSaldoActual() * 0.20));
            c.setSaldoActual(c.getSaldoActual() * 0.8);
        }
    }

    public void consultarSaldo(CuentaBancaria c) {
        System.out.println("El saldo es " + c.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria c) {
        System.out.println("El numero de cuenta es " + c.getNumeroCuenta());
        System.out.println("El DNI es " + c.getDniCliente());
        System.out.println("El saldo es " + c.getSaldoActual());
    }
}
