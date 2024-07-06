package com.yeonjin.section02.annotation.subsection03;

import com.yeonjin.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {

    private Map<String, Pokemon> pokemonMap;

    @Autowired
    public PokemonService(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    public void pokemonAttack() {
        pokemonMap.forEach((k, v) -> {
            System.out.println(k);
            System.out.println();
            v.attack();

        });


    }
}