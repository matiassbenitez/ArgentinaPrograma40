
function calcular() {
    let diametro = document.getElementById("diametro").value;
    let radio = diametro/2;

    document.getElementById("resultado").innerHTML = `<p>El radio es: ${radio}</p>`;
   
}

document.getElementById("diametro").addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        calcular();
    }
});

document.getElementById("boton").onclick = calcular;
