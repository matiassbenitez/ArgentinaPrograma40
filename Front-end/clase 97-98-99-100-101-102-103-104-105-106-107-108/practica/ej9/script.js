// Realizar un programa que pida una frase y el programa deberá mostrar la frase con un 
// espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el 
// funcionamiento de la función Substring().

/*
let frase = prompt(`Por favor, ingrese una frase: `);
frase = frase.split('');
frase = frase.join(" ");
alert(frase);
*/

/*
let frase = prompt(`Por favor, ingrese una frase: `);
frase = frase.split('');
for (let i = 0; i < frase.length; i++) {
    frase[i] += " "; 
}
frase = frase.join("");
alert(frase);
*/

let frase = prompt(`Por favor, ingrese una frase: `);
let nuevaFrase = "";
for (let i = 0; i < frase.length; i++) {
    nuevaFrase += (frase.substring(i,i+1)) + " ";
    // nuevaFrase += (" ");
}
// nuevaFrase = nuevaFrase.join('');
alert(nuevaFrase);