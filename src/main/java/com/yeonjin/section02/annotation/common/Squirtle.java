package com.yeonjin.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Pokemon {

    public void attack() {
        System.out.println("물대포공격");
    }

}
