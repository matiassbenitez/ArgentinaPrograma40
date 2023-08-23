/* Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el 
resultado */

function eliminarUltimos(arreglo = []){
    // alert(arreglo.reverse().slice(2).reverse());
    /* arreglo.pop();
    arreglo.pop();
    alert(arreglo); */
    alert(arreglo.splice(arreglo.length-2,2));
}

let num = [1,2,3,4,5,6,7,8,10];
eliminarUltimos(num);