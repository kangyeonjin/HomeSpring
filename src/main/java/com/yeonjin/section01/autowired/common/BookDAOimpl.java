package com.yeonjin.section01.autowired.common;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("bookDAO")
public class BookDAOimpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;

    public BookDAOimpl(){
        bookList = new HashMap<>();

        bookList.put(1,
                new BookDTO(1, 123456, "자바의 정석",
                        "남궁성", "도우출판", LocalDate.now()));

    }

    @Override
    public List<BookDTO> selectBookList(){
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence){
        return bookList.get(sequence);
    }



}
