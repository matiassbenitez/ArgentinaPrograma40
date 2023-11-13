// Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio 
// de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que 
// para calcular el área y el perímetro se utilizan las siguientes fórmulas: 
// area = PI * radio2 
// perimetro = 2 * PI * radio

let radio = prompt("Ingrese el valor del radio:");
while (isNaN(radio)) {
    radio = prompt(`El valor ingresado no es un número.
    Vuelva a intentarlo:`);
}
alert(`La superficie del círculo es ${(Math.PI*Math.pow(radio,2)).toFixed(2)}
El perímetro del círculo es ${(Math.PI*radio).toFixed(2)}`);