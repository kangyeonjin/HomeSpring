package com.yeonjin.section02.annotation.subsection03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.yeonjin.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String name : beanNames){
            System.out.println(name);
        }

        PokemonService pokemonService = context.getBean("pokemonServiceCollection",PokemonService.class);

        pokemonService.pokemonAttack();
    }

}
