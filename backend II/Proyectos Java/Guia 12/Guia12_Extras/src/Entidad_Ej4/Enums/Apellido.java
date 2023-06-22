/*
 */
package Entidad_Ej4.Enums;

/**
  romero, benitez,sosa,ramirez,ruiz,alvarez,torres,acosta,rojas,medina
   gonzalez,rodriguez,gomez,fernandez,lopez,martinez,diaz,garcia,perez,sanches
 */
public enum Apellido {
    ROMERO("Romero"),BENITEZ("Benitez"),SOSA("Sosa"),RAMIREZ("Ramirez"),RUIZ("Ruiz"),ALVAREZ("Alvarez"),TORRES("Torres")
    ,ACOSTA("Acosta"),ROJAS("Rojas"),MEDINA("Medina"),GONZALES("Gonzales"),RODRIGUEZ("Rodriguez"),GOMEZ("Gomez"),
    FERNANDEZ("Fernandez"),LOPEZ("Lopez"),MARTINEZ("Martinez"),DIAZ("Diaz"),GARCIA("Garcia"),PEREZ("Perez"),SANCHEZ("Sanchez");
    private String codigo;

    private Apellido(String codigo) {
        this.codigo = codigo;
    }

    private Apellido() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
