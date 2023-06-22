
package recetas.app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListRecetas {
    
    ArrayList<Cocina> listRecetas = new ArrayList();
    
    public String input(String text){
        return JOptionPane.showInputDialog(text);
    }
    
    public void agregarReceta(){
        String nameRece = input("Nombre receta");
        String Ingredi = input("Ingredientes");
        Cocina co = new Cocina();
        
        co.setNombre(nameRece);
        co.setIngredientes(Ingredi);
        
        listRecetas.add(co);
    }
    
    public void mostrarRecetas(){
        
        String cadena = "";
        for (int i = 0; i < listRecetas.size(); i++) {
            cadena += "Receta"+(i+1) + "\n";
            cadena += "Nombre: " + listRecetas.get(i) .getNombre() +"\n";
            cadena += "Ingredientes: " + listRecetas.get(i) .getIngredientes()+"\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    public void borrarReceta(){
        listRecetas.clear();
    }
    
}
