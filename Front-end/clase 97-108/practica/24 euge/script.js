var edad = prompt("Qué edad tenes?");


// template string - se usa mucho en REACT o ANGULAR
var mensaje =
    `La edad del sujeto es
...
... ${edad}`;

alert(mensaje);

function mostrarElementosArray(elemento, indice, array) {
    console.log("a[" + indice + "] = " + elemento);
}

[2, 5, , 9].forEach(mostrarElementosArray);
console.log("Hola");