// Construir un programa que simule un menú de opciones para realizar las cuatro 
// operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores 
// numéricos enteros. El usuario, además, debe especificar la operación con el primer 
// carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’ 
// o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.

let opc = prompt(`MENU
S - Sumar
R - Restar
M - Multiplicar
D - Dividir`).toLocaleUpperCase();

let num1 = parseInt(prompt(`Ingrese el primer número: `));
let num2 = parseInt(prompt(`Ingrese el segundo número: `));

switch (opc) {
    case 'S':
        alert(num1+num2);
        break;
    case 'R':
        alert(num1-num2);
        break;
    case 'M':
        alert(num1*num2);
        break;
    case 'D':
        if (num2 != 0) {
            alert(num1/num2);
        } else {
            alert("ERROR");
        }
        break;

    default:
        alert("Opción incorrecta.")
        break;
}
