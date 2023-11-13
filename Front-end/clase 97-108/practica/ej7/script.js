// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
// solicite números al usuario hasta que la suma de los números introducidos supere el 
// límite inicial.

let limite = prompt(`Por favor, ingrese un número límite (positivo):`)
while (limite<=0 || isNaN(limite)){
    limite = prompt(`Número no válido. Vuelva a intentarlo: `);
}
let suma = 0;
do {
    let num = parseFloat(prompt("Ingrese un número: "));
    while (isNaN(num)) {
        num = parseFloat(prompt("Ingrese un número: "));
    }
    alert("ok");
    suma = suma + num;
    alert(suma);
} while (suma <= limite);