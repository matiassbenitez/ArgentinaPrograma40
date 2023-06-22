
package guia12ej1extra.entidades;

import java.util.ArrayList;
import java.util.List;


public class BarcosServicios {
    Barco b1 = new Velero(3,"aaa111", 30, 1985);
    Barco b2 = new BarcoAMotor(100,"bbb222", 20, 1990);
    Barco b3 = new YateDeLujo(6,120,"ccc333", 10, 2010);
    Barco b4 = new Barco("ddd444", 25, 2015);
    Barco b5 = new Barco("eee555", 35, 1999);
    
    
    public ArrayList<Barco> llenar(){
    ArrayList<Barco> array = new ArrayList();
        array.add(b1);
        array.add(b2);
        array.add(b3);
        array.add(b4);
        array.add(b5);
        return array;
    }

    
    
}
