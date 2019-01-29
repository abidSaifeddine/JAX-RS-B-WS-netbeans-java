
package com.library.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BooksLibrary", targetNamespace = "http://ws.library.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BooksLibrary {


    /**
     * 
     * @param bookId
     * @return
     *     returns com.library.ws.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBookById", targetNamespace = "http://ws.library.com/", className = "com.library.ws.GetBookById")
    @ResponseWrapper(localName = "getBookByIdResponse", targetNamespace = "http://ws.library.com/", className = "com.library.ws.GetBookByIdResponse")
    @Action(input = "http://ws.library.com/BooksLibrary/getBookByIdRequest", output = "http://ws.library.com/BooksLibrary/getBookByIdResponse")
    public Book getBookById(
        @WebParam(name = "book_id", targetNamespace = "")
        int bookId);

    /**
     * 
     * @param book
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suggestBook", targetNamespace = "http://ws.library.com/", className = "com.library.ws.SuggestBook")
    @ResponseWrapper(localName = "suggestBookResponse", targetNamespace = "http://ws.library.com/", className = "com.library.ws.SuggestBookResponse")
    @Action(input = "http://ws.library.com/BooksLibrary/suggestBookRequest", output = "http://ws.library.com/BooksLibrary/suggestBookResponse")
    public int suggestBook(
        @WebParam(name = "book", targetNamespace = "")
        Book book);

}
