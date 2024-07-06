package com.yeonjin.section01.autowired.subsection03;

import com.yeonjin.section01.autowired.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.yeonjin.section01");

        BookService bookService = context.getBean("bookServiceSetter", BookService.class);

        List<BookDTO> books = bookService.selectAllBooks();

        for(BookDTO book : books){
            System.out.println(book);
        }

        System.out.println(bookService.searchBookBySequence(1));

    }

}
