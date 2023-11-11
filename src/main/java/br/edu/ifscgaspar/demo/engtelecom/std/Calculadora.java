package br.edu.ifscgaspar.demo.engtelecom.std;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebServices(serviceName = "Calculadora")
public class Calculadora {

    @Method(operationName = "somar")
    public int somar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int c = a + b;
        return c;
    }

    @WebMethod(operationName = "subtrair")
    public int subtrair(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int c = a - b;
        return c;
    }
}
