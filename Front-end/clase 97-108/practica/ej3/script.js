// Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de 
// edad se debe mostrar un mensaje indicándolo.

let edad = prompt("Por favor, ingrese su edad: ");
while ((isNaN(edad)) || (edad < 0)) {
    edad = prompt(`La edad ingresada no es válida.
Vuelva a ingresarla: `);
}
if (edad >= 18) {
    alert("El usuario es mayor de edad.")
}

