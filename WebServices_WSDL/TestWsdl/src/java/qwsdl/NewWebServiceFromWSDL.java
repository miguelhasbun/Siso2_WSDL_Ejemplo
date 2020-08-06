/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qwsdl;

import javax.jws.WebService;

/**
 *
 * @author MiguelPaz
 */
@WebService(serviceName = "testWSDL", portName = "testWSDLPort", endpointInterface = "qwsdl.TestWSDL", targetNamespace = "http://qwsdl/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/testWSDL.wsdl")
public class NewWebServiceFromWSDL {

    public java.lang.String operation(java.lang.String nombre) {
      return "hola "+ nombre;
    }

    public java.lang.String hello(java.lang.String name) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
