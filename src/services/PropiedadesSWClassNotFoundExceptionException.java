
/**
 * PropiedadesSWClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package services;

public class PropiedadesSWClassNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1458080187386L;
    
    private services.PropiedadesSWClassNotFoundException faultMessage;

    
        public PropiedadesSWClassNotFoundExceptionException() {
            super("PropiedadesSWClassNotFoundExceptionException");
        }

        public PropiedadesSWClassNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public PropiedadesSWClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PropiedadesSWClassNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(services.PropiedadesSWClassNotFoundException msg){
       faultMessage = msg;
    }
    
    public services.PropiedadesSWClassNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    