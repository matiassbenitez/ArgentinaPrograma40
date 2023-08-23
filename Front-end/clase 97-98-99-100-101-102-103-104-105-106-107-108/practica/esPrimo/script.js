// /^1?$|^(11+?)\1+$/

function esPrimo() {
    var posiblePrimo = prompt("Introduzca el número para saber si es primo usando REGEX");
    var primoEnUnos = "1".repeat(posiblePrimo);
    const REGEX = /^1?$|^(11+?)\1+$/
    
    var isPrime = REGEX.test(primoEnUnos);
    if (!isPrime) {
        console.log("Es Primo")
    } else {
        console.log("No es primo")
    }
    
}