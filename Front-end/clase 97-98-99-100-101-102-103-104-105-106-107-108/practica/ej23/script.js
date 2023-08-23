/* 
Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo 
amarillo, por ejemplo) 
*/

const par = document.getElementById("parrafo");

let parrafo = par.innerHTML.split(" ");

for (let i = 0; i < parrafo.length; i++) {
    if (parrafo[i].length > 8) {
        parrafo[i] = "<span>" + parrafo[i] + "</span>";
    };
}
parrafo = parrafo.join(" ");
par.innerHTML = parrafo;