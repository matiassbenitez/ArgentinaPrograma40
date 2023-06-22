/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_ej1.Services;

import Entidad_ej1.AlquilerB;
import Entidad_ej1.Barco;
import Entidad_ej1.subClases.BarcosMotor;
import Entidad_ej1.subClases.Velero;
import Entidad_ej1.subClases.Yate;
import java.util.Date;
import java.util.Scanner;

public class ServiceAlquiler {

    ServiceBarco nuevo = new ServiceBarco();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int pago = 0;

    public AlquilerB crearAlquiler() {
        Barco b1 = null;
        System.out.println("Ingrese su nombre : ");
        String nombre = leer.next();
        Long documento = GeneracionAl();
        System.out.println("Fecha de alquiler :");
        Date fechaAlq = crearFecha();
        Date fechaDev = new Date();
        System.out.println("Amarre por izquierda o por derecha ?? I/D");
        char res = leer.next().charAt(0);
        while (res != 'I' && res != 'D' && res != 'i' && res != 'd') {
            System.out.println("Seleccion la Opcion Correctamente I/D");
            res = leer.next().charAt(0);
        }
        System.out.println("Que tipo de Barco es ?.");
        System.out.println("Yate. / Barco a motor. / Velero");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("Yate") && !opc.equalsIgnoreCase("Barco a motor") && !opc.equalsIgnoreCase("Velero")) {
            System.out.println("Seleccion la Opcion Correctamente");
            System.out.println("Yate. / Barco a motor. / Velero");
            opc = leer.next();
        }
        if (opc.equalsIgnoreCase("Yate")) {
            b1 = nuevo.crearYate();
            pago = comprobarPago(b1, fechaAlq, fechaDev);
            comprobarPagoY((Yate) b1);
        }
        if (opc.equalsIgnoreCase("Barco a motor")) {
            b1 = nuevo.crearBm();
            pago = comprobarPago(b1, fechaAlq, fechaDev);
            comprobarPagoBM((BarcosMotor) b1);
        }
        if (opc.equalsIgnoreCase("Velero")) {
            b1 = nuevo.crearVelero();
            pago = comprobarPago(b1, fechaAlq, fechaDev);
            comprobarPagoV((Velero) b1);
        }
        return new AlquilerB(nombre, documento, fechaAlq, fechaDev, res, b1, pago);
    }

    public void comprobarPagoV(Velero b1) {
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
        pago = b1.getNumMastil() + pago;
    }

    public void comprobarPagoBM(BarcosMotor b1) {
//en los barcos a motor se le suma la potencia en CV
        pago = (int) (b1.getCVmotor() + pago);
    }

    public void comprobarPagoY(Yate b1) {
//en los yates se suma la potencia en CV y
//el número de camarotes.
        pago = (int) ((b1.getCVmotor() * b1.getNumCamarotes()) + pago);
    }

    public int comprobarPago(Barco b1, Date fechaAlq, Date fechaDev) {
//        Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
        int num;
        long var = fechaAlq.getTime();
        long var2 = fechaDev.getTime();
        long diasDesde = (long) Math.floor(var / (1000 * 60 * 60 * 24)); // convertimos a dias, para que no afecten cambios de hora 
        long diasHasta = (long) Math.floor(var2 / (1000 * 60 * 60 * 24)); // convertimos a dias, para que no afecten cambios de hora
        long dias = diasHasta - diasDesde;
        System.out.println("pasaron : " + dias + " Dias");
        num = (int) (dias + (b1.getEslora() * 10));
        return num;
    }

    public Date crearFecha() {
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        return new Date((anio - 1900), mes, dia);
    }

    public long GeneracionAl() {
        String num = "";
        do {
            int numero = (int) (Math.random() * 9);
            num = num.concat(String.valueOf(numero));
        } while (num.length() != 8);
        long dni = Integer.parseInt(num);
        return dni;
    }

}
