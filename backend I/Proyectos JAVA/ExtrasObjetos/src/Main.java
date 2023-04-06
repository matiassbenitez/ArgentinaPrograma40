
import Entidades.Cocina;
import Entidades.Cuenta;
import Entidades.Empleado;
import Entidades.Receta;
import Entidades.Rectangulo;
import java.util.Arrays;
//import Entidades.Juego;

public class Main {

    public static void main(String[] args) {
        /* Juego juego = new Juego();
       juego.iniciarJuego();*/

 /* Receta rec = new Receta();
      Receta[] lista = {rec};
      String[] arr = {"harina","huevo"};
      Cocina coc = new Cocina(arr,lista);
      System.out.println(coc);
      System.out.println(Arrays.toString(coc.recetasPosibles()));*/
 /*Empleado emp = new Empleado("Matias", 27, 200000);
      emp.calcular_aumento();
        System.out.println(emp);*/
 /* Rectangulo rectangulo1 = new Rectangulo(4,6);
        System.out.printf("El área del rectángulo es: %.2f\n",rectangulo1.calcular_area());*/
        Cuenta cta = new Cuenta("Matias", 150000);
        cta.retirar_dinero();
    }

}
