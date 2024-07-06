package com.yeonjin.section02.annotation.subsection02;

import com.yeonjin.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    private Pokemon pokemon;

    public PokemonService(@Qualifier("squirtle")Pokemon pokemon){
        this.pokemon = pokemon;

    }

    public void pokemonAttack(){
        pokemon.attack();
    }


}


