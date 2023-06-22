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
public enum Estado {
    SOLTERO_A("Soltero/a",1),CASADO_A("Casado/a",2),SEPARADO_A("Separado/a",3),DIVORCIADO_A("Divorciado/a",4),VIUDO_A("Viudo/a",5);
    String codigo;
    Integer num;
    private Estado() {
    }

    private Estado(String codigo, Integer num) {
        this.codigo = codigo;
        this.num = num;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
