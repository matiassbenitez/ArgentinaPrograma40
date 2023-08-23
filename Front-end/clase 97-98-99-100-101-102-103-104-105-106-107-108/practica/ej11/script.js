// Escribir una función que reciba un String y devuelva la palabra más larga. 
// String Ejemplo: “Guia de JavaScript”
// Resultado esperado : “JavaScript”

function masLarga(frase){
    let palabras = frase.split(" ");
    let larga = "";
    for (let i = 0; i < palabras.length; i++) {
        if (i==0) {
            larga = palabras[i];
        } else {
            if (palabras[i].length > larga.length) {
                larga = palabras[i];
            }
        }
    }
    return larga;
}

alert(masLarga("Guia de JavaScript"));