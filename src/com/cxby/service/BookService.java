package com.cxby.service;

import com.cxby.domain.Book;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by liweiting on 15-5-17.
 */
@WebService
public interface BookService {

    @WebMethod
    public void save( Book book );
    @WebMethod
    public void delete( Book book );
    @WebMethod
    public List<Book> search( String sql );
    @WebMethod
    public  Book search( int id );
    @WebMethod
    public void update( Book book );

}
