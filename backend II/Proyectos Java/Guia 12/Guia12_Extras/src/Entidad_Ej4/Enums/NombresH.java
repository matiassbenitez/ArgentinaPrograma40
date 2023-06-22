
package Entidad_Ej4.Enums;

/**
La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
 */
public enum NombresH {
    MATEO("Mateo"),BAUTISTA("Bautista"),JUAN("Juan"),FELIPE("Felipe"),BRUNO("Bruno"),NOAH("Noah"),BENICIO("Benicio"),
    THIAGO("Thiago"),CIRO("Ciro"),LIAM("Liam"),LORENZO("Lorenzo"),BENJAMIN("Benjamin"),VALENTINO("Valentino"),
    BASTIAN("Bastian"),SANTINO("Santino"),SANTIAGO("Santiago"),DANTE("Dante"),LAUTARO("Lautaro"),FRANCISCO("Francisco"),IAN("Ian");
    String codigo;

    private NombresH() {
    }

    private NombresH(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
