// Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo 
// con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El 
// radio del círculo lo proporcionará el usuario.

function Circulo(radio){
    this.radio = radio;
    this.calcularPerimetro = function(){
        return (Math.PI*this.radio).toFixed(2);
    }
    this.calcularArea = () =>(Math.PI*Math.pow(this.radio,2)).toFixed(2);
}

let radio = parseInt(prompt('Ingrese el radio: '));
let circulo1 = new Circulo(radio);
alert(`Radio: ${circulo1.radio}
Área: ${circulo1.calcularArea()}
Perímetro: ${circulo1.calcularPerimetro()}`);