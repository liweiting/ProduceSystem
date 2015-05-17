package com.cxby.web.actins;

import com.cxby.domain.Book;
import com.cxby.service.BookService;
import com.cxby.web.forms.BookForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liweiting on 15-5-17.
 */
public class BookAction extends DispatchAction {


    public ActionForward addBook(ActionMapping mapping, ActionForm form,
               HttpServletRequest request, HttpServletResponse response) throws Exception {
        BookForm bookForm = (BookForm)form;
        WebApplicationContext ctx = WebApplicationContextUtils.
                getWebApplicationContext(this.getServlet().getServletContext());
        Book book=new Book();
        book.setHot(0);
        book.setName(bookForm.getName());
        book.setPrice(bookForm.getPrice());
        book.setType(bookForm.getType());
        book.setProductor( bookForm.getProductor() );
        BookService bookService=(BookService)ctx.getBean("bookService");
        System.out.println("-----------------------------------------------");
        bookService.save( book );
        return mapping.findForward("addBookSuccess");

    }
}
