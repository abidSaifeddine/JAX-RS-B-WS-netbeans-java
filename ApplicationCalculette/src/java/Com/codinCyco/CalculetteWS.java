/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.codinCyco;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author saifeddine
 */
@WebService(serviceName = "CalculetteWS")
public class CalculetteWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Helloeee " + txt + "";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "plus")
    public int plus(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        return i+j;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "substraction")
    public int substraction(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        return i-j;
    }
}
