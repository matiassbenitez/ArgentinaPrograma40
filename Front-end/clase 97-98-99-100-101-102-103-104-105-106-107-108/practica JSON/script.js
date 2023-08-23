// JSON

var persona = {
    apellido : "Benítez",
    nombre : "Matías",
    dni : 31567557,
    edad: 38,
    nacimiento : new Date("03-22-1985"),
    mascotas : [{
        apodo : "Polito",
        numeroIdentificatorio : 2203,
        nacimiento: new Date("02-15-2017")
    },
    {
        apodo : "Luchi",
        numeroIdentificatorio : 1985,
        nacimiento: new Date("09-22-2016")
    }]
};

// var mascota = {
//     apodo : "Polito",
//     numeroIdentificatorio : 2203,
//     nacimiento: new Date("02-15-2017")
// };

console.log(persona.mascotas[1].apodo);
console.log(JSON.stringify(persona));

class Mascota{
    apodo;
    numeroIdentificatorio;
}

var m = new Mascota();

m.apodo = "Polito"
m.numeroIdentificatorio = 2203;

console.log(m);
