
package g11extra3.servicios;

import g11extra3.entidades.Poliza;




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
