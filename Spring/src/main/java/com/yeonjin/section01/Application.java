package com.yeonjin.section01;

import com.yeonjin.commom.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section01/spring-context.xml");

        MemberDTO member = (MemberDTO) context.getBean("member");
        MemberDTO member2 = context.getBean(MemberDTO.class);

        MemberDTO member3 = context.getBean("member", MemberDTO.class);

        System.out.println(member);


    }

}
