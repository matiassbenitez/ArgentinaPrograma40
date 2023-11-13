import React, { useEffect, useState } from 'react'
import Card from './Card'
import RickAndMortyService from '../../Services/RickAndMorty.service';

/* const Cards = ({ personajes }) => {  (SOLUCION 1) */
const Cards = () => { /* (SOLUCION 2) */

    const [personajes, setpersonajes] = useState([]);

    useEffect(() => { /* Escucha constantemente el cambio de alguna variable */
        RickAndMortyService.getAllCharacters()
            .then((data) => setpersonajes(data.results))
            .catch((error) => console.log(error));
    }, [personajes]); /* variable a escuchar */

    const cardList = personajes.map((p) => <Card personaje={p} key={p.id} />)

    return (
        <div className="album py-5 bg-light">
            <div className="container">
                <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    {cardList}
                </div>
            </div>
        </div>
    )
}

export default Cards
