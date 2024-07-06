package com.yeonjin.section02.annotation.subsection02;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.yeonjin.section02");

        String[] beanNames = context.getBeanDefinitionNames();

       for(String name : beanNames){
            System.out.println(name);
        }

        PokemonService pokemonService = context.getBean("pokemonServiceQualifier", PokemonService.class);
        pokemonService.pokemonAttack();

    }
}
