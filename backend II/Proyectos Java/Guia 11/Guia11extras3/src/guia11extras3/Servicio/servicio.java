/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extras3.Servicio;


import guia11extras3.entidades.Poliza;


/**
 *
 * Se registrará una póliza, donde se guardará los datos tanto de un 
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son:
*
* 
* número de póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, 
* forma de pago, monto total asegurado, incluye granizo, monto máximo granizo,
* tipo de cobertura (total, contra terceros, etc.). 
* 
* 
* Nota: prestar atención al principio de este enunciado y pensar en las 
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de 
muchos a uno o de muchos a muchos. 
 */
public class servicio {
    
    
    public Poliza generarPoliza (){
        boolean granizoPoN;
        int polizaa;
        int fechaInicio;
        int fechaFin;
        int cantidadCuotas;
        String formaPago="";
        String tipoCobertura="";
        
        int aux=0;
        int aux1=0;
        granizoPoN=false;
        
        polizaa=((int)(Math.random()*500000));
        fechaInicio=((int)(Math.random()*10)+10);
        fechaFin=((int)(Math.random()*15)+10);
        cantidadCuotas=((int)(Math.random()*12)+1);//montoTotal=cantidadCuotas(menos nCuotas)*(montoCuota)
        aux=((int)(Math.random()*4)+1);
        switch(aux){
            case 1:
                formaPago="efectivo";
            case 2:
                formaPago="Credito";
            case 3:
                formaPago="Debito";
            case 4:
                formaPago="Mercado Pago";
        }
        
        aux1=((int)(Math.random()*2)+1);
        if (aux1==1){
            granizoPoN=true;
        }
        
        int aux2=0;
        aux2=((int)(Math.random()*4)+1);
        switch(aux2){
            case 1:
                tipoCobertura="Total";
            case 2:
                tipoCobertura="Terceros";
            case 3:
                tipoCobertura="";
            case 4:
                tipoCobertura="";
        }
        return new Poliza(polizaa, fechaInicio, fechaFin, cantidadCuotas, formaPago, cantidadCuotas, granizoPoN, cantidadCuotas, tipoCobertura);
    }
    
    
}
