package com.yeonjin.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Pokemon {

    @Override
    public void attack() {
        System.out.println("피카츄공격⚡");
    }

}
