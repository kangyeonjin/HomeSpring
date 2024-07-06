package com.yeonjin.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Charmander implements Pokemon {

    @Override
    public void attack(){
        System.out.println("공격🔥");
    }

}
