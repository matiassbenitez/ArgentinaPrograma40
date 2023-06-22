/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkgenum.Enum;

/**
 *
 * @author MATIAS
 */
public enum NewEnum {
    FORD(1,"Camioneta",(int)(Math.random()*3));
    
    private Integer num;
    private String tipo;
    private Integer num1;

    private NewEnum(Integer num, String tipo, Integer num1) {
        this.num = num;
        this.tipo = tipo;
        this.num1 = num1;
    }
    switch (this) {
        case val:
            
            break;
        default:
            throw new AssertionError();
    }
    
}
