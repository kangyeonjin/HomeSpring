package com.yeonjin.section01.autowired.subsection02.constructor;

import com.yeonjin.section01.autowired.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.yeonjin.section01");

        BookService bookService = context.getBean("bookServiceConstructor", BookService.class);

        List<BookDTO> books = bookService.seleceAllBooks();

        for(BookDTO book : books){
            System.out.println(book);
        }

        System.out.println(bookService.searchBookBySequence(1));


    }

}
