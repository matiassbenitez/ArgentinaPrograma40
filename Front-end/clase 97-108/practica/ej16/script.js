// Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios 
// y los muestre por pantalla.

let vec1 = [];
let vec2 = [];

for (let i = 0; i < 5; i++) {
    vec1[i] = parseInt(Math.random()*101);
    vec2[i] = vec1[i]; 
}

alert(`vector 1: ${vec1}
Vector 2: ${vec2}`);