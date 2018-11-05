package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookServiceImpl implements BookService {

    private BookDao bookDaoImpl;
    // set方法
    public void setBookDaoImpl(BookDao bookDaoImpl) {
        this.bookDaoImpl = bookDaoImpl;
    }

    public void findByBook() {
        List<Book> byBook = bookDaoImpl.findByBook();
        for (Book book : byBook) {
            System.out.println(book.getBookName());
        }
    }

    public void del(int id) {
        bookDaoImpl.del(id);
    }
}
