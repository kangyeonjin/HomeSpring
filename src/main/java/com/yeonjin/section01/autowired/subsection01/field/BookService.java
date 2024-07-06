package com.yeonjin.section01.autowired.subsection01.field;

import com.yeonjin.section01.autowired.common.BookDAO;
import com.yeonjin.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
