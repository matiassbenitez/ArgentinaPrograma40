// Escribir una función flecha que reciba una palabra y la devuelva al revés.

let frase = prompt('Ingrese una frase: ');
let newfrase = (frase)=>frase.split("").reverse().join("");
let palabra = newfrase(frase);
alert(palabra);

