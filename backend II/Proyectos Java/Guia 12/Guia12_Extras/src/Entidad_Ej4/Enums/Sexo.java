/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_Ej4.Enums;

/**
 *
 * @author Usuario
 */
public enum Sexo {
    Hombre("Hombre"),Mujer("Mujer"),Otro("Otro");
    String codigo;

    private Sexo() {
    }

    private Sexo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
