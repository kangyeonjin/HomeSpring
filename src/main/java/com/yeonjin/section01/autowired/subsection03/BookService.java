package com.yeonjin.section01.autowired.subsection03;

import com.yeonjin.section01.autowired.common.BookDAO;
import com.yeonjin.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceSetter")
public class BookService {

    private BookDAO bookDAO;

    @Autowired
    public void setBookDAO(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }
}
