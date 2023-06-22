
package cocinapp;

import javax.swing.JOptionPane;
import recetas.app.ListRecetas;


public class Cocinapp {

    public static void main(String[] args) {
        
        ListRecetas objeto = new  ListRecetas();
        
        byte opcion;
        
        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu principal\n"
                    + "1. Agregar receta\n"
                    + "2. Ver recetas\n"
                    + "3. Limpiar la lista\n"
                    + "4. Salir"
                    ));
            
            switch(opcion){
                case 1:
                    objeto.agregarReceta();
                    break;
                case 2:
                    objeto.mostrarRecetas();
                    break;
                case 3:
                    objeto.borrarReceta();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se ha encontrado la opcion");
                    break;
            }
        
        }while(opcion != 4);
       
    }
    
}
