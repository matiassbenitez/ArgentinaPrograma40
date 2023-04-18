package servicios;

import entidades.ParDeNumeros;

public class ParDeNumerosServicio {

    public static void mostrarNumeros(ParDeNumeros p) {
        System.out.println("Número 1: " + p.getNum1());
        System.out.println("Número 2: " + p.getNum1());
    }

    public  static double devolverMayor(ParDeNumeros p) {
        if (p.getNum1() > p.getNum2()) {
            return p.getNum1();
        } else {
            return p.getNum2();
        }
    }

    public  static double calcularPotencia(ParDeNumeros p) {
        double mayor = ParDeNumerosServicio.devolverMayor(p);
        double menor;
        if (p.getNum1() == mayor) {
            menor = p.getNum2();
        } else {
            menor = p.getNum1();
        }

        return Math.pow(Math.round(mayor), Math.round(menor));
    }

    public static double calculaRaiz(ParDeNumeros p) {
        double num;
        if (p.getNum1() > p.getNum2()) {
            num = Math.abs(p.getNum2());
        } else {
            num = Math.abs(p.getNum1());
        }
        return Math.sqrt(num);
    }

}
