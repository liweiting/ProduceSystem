package com.cxby.dao;

import com.cxby.domain.Book;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liweiting on 15-5-17.
 */
public class BookDao {
    private SessionFactory sessionFactory;

    public void addBook( Book book ){

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist( book );
        tx.commit();
        session.close();

    }

    public Book getBook( int id ){

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Book book = (Book)session.get(Book.class,id);
        tx.commit();
        session.close();
        return book;
    }

    public List<Book> getBookList( String sql ){

        List bookList = new ArrayList<Book>();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery(sql);
        bookList = query.list();
        tx.commit();
        session.close();
        return bookList;

    }

    public void updateBook( Book book ){

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(book);
        tx.commit();
        session.close();
    }

    public void deleteBook( Book book ){

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(book);
        tx.commit();
        session.close();
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
