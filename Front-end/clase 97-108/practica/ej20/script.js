/* 
Realizar un programa que obtenga la siguiente matriz 
[[3], [6], [9], [12], [15]] y devuelve y 
muestre el siguiente array [6, 9, 12, 15, 18]. 
*/

let matriz = [
    [3],
    [6],
    [9],
    [12],
    [15]
];

/* let arreglo = [];
function limpiar(matriz, arreglo){
    for (let i = 0; i < matriz.length; i++) {
        if (typeof(matriz[i]) == 'object') {
            limpiar(matriz[i],arreglo);
        }else{
            arreglo.push(matriz[i]+3);
        }
    }
}
limpiar(matriz,arreglo);
 */
alert(matriz);
matriz.flat();
// matriz = matriz.map(function (num) {return parseInt(num)+3});
matriz = matriz.map((num) => parseInt(num)+3);
alert(matriz);