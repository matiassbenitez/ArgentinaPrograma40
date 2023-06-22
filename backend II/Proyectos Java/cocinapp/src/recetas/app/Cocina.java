/*
 Crea una clase "Cocina" que tenga una lista de objetos "Receta". 
Luego, crea métodos para agregar nuevas recetas a la lista, 
para buscar una receta por nombre y para obtener la lista de
recetas que se pueden preparar con los ingredientes disponibles 
en la cocina.

 */
package recetas.app;

public class Cocina {
    
    private String nombre;
    private String ingredientes;

    public Cocina() {
        nombre = "";
        ingredientes = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
        
        
    
}
