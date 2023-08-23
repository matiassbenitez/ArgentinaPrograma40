/* 
Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a 
elección.
*/

const boton = document.getElementById("hola");

boton.addEventListener('click',saludar); //no agregar paréntesis, hace que se ejecute la función directamente

function saludar(){
    alert("Hola");
}