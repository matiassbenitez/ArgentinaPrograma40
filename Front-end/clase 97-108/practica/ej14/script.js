// Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, 
// Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario 
// y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
// numero de páginas.

let libro = {
    ISBN: null,
    titulo: null,
    autor: null,
    nroPaginas: null
}

function cargar(){
    let isbn = prompt("Ingrese el ISBN: ");
    libro.ISBN = isbn;
    let titulo = prompt("Ingrese el título: ");
    libro.titulo = titulo;
    let autor = prompt("Ingrese el autor: ");
    libro.autor = autor;
    let np = parseInt(prompt("Ingrese el número de páginas: "));
    libro.nroPaginas = np;
}

function mostrar(libro){
    alert(`ISBN: ${libro.ISBN}
Título: ${libro.titulo}
Autor: ${libro.autor}
Número de páginas: ${libro.nroPaginas}`);
}

cargar();
mostrar(libro);


