package com.cxby.serviceImpl;

import com.cxby.dao.BookDao;
import com.cxby.domain.Book;
import com.cxby.service.BookService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by liweiting on 15-5-17.
 */
@WebService
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @WebMethod
    public void save(Book book) {
        bookDao.addBook(book);
    }

    @WebMethod
    @Override
    public void delete(Book book) {
        bookDao.deleteBook(book);
    }

    @WebMethod
    @Override
    public List<Book> search(String sql) {
        return bookDao.getBookList(sql);
    }

    @WebMethod
    @Override
    public Book search(int id) {
        return bookDao.getBook( id );
    }


    @WebMethod
    @Override
    public void update(Book book) {
        bookDao.updateBook(book);
    }
}
