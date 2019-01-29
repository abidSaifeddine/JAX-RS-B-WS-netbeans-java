
package com.codincyco;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculetteWS", targetNamespace = "http://codinCyco.Com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculetteWS {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://codinCyco.Com/", className = "com.codincyco.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://codinCyco.Com/", className = "com.codincyco.HelloResponse")
    @Action(input = "http://codinCyco.Com/CalculetteWS/helloRequest", output = "http://codinCyco.Com/CalculetteWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "plus", targetNamespace = "http://codinCyco.Com/", className = "com.codincyco.Plus")
    @ResponseWrapper(localName = "plusResponse", targetNamespace = "http://codinCyco.Com/", className = "com.codincyco.PlusResponse")
    @Action(input = "http://codinCyco.Com/CalculetteWS/plusRequest", output = "http://codinCyco.Com/CalculetteWS/plusResponse")
    public int plus(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "substraction", targetNamespace = "http://codinCyco.Com/", className = "com.codincyco.Substraction")
    @ResponseWrapper(localName = "substractionResponse", targetNamespace = "http://codinCyco.Com/", className = "com.codincyco.SubstractionResponse")
    @Action(input = "http://codinCyco.Com/CalculetteWS/substractionRequest", output = "http://codinCyco.Com/CalculetteWS/substractionResponse")
    public int substraction(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

}
