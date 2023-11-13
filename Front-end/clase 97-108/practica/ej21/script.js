/* 
Escribir un programa para obtener un array de las propiedades de un objeto Persona. 
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. 
*/
let persona = {
    nombre: 'Matías',
    edad: 38,
    sexo: 'H',
    peso: 100,
    altura: 1.74
}

let valores = Object.values(persona);
alert(valores);