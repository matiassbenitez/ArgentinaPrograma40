// Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el 
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de 
// todos ellos.

/*
let suma = 0, cont = 0;
let num, maximo = 0, minimo = 0, promedio = 0; 
do {
    num = parseInt(prompt(`Ingrese un número: `));
    if (!isNaN(num)) {
        if (num !=0) {
            suma += num;
            if (cont == 0) {
                maximo = num;
                minimo = num;
            } else {
                if (num > maximo) {
                    maximo = num
                }else{
                    if (num < minimo) {
                        minimo = num;
                    }
                }
            }
            cont++;
        }
    } else {
        alert("Número no válido.")
    }
} while (num != 0);
if (cont == 0) {
    alert("No se ingresó ningún número. No se puede emitir un informe.")
} else {
    alert(`El máximo número ingresado: ${maximo}
El mínimo número ingresado: ${minimo}
El promedio: ${(suma/cont).toFixed(2)}`)
}
*/

let numeros = [];
let num;
do {
    num = parseInt(prompt(`Ingrese un número: `));
    if (!isNaN(num)) {
        if (num != 0) {
            numeros.push(num);
        }
    } else {
        alert("Número no válido.")
    }
} while (num != 0);
if (numeros.length == 0) {
    alert("No se ingresó ningún número. No se puede emitir un informe.");
} else {
    let maximo, minimo, suma = 0, promedio;
    function comparar (a,b) {return a-b};
    numeros.sort(comparar);
    maximo = numeros[numeros.length-1];
    minimo = numeros[0];
    numeros.forEach(element => {
        suma += element;
    });
    promedio = suma/numeros.length;
    alert(`El máximo número ingresado: ${maximo}
El mínimo número ingresado: ${minimo}
El promedio: ${(promedio).toFixed(2)}`);
}


