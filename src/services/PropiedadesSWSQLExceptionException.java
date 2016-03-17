
/**
 * PropiedadesSWSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package services;

public class PropiedadesSWSQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1458156310008L;
    
    private services.PropiedadesSWSQLException faultMessage;

    
        public PropiedadesSWSQLExceptionException() {
            super("PropiedadesSWSQLExceptionException");
        }

        public PropiedadesSWSQLExceptionException(java.lang.String s) {
           super(s);
        }

        public PropiedadesSWSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PropiedadesSWSQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(services.PropiedadesSWSQLException msg){
       faultMessage = msg;
    }
    
    public services.PropiedadesSWSQLException getFaultMessage(){
       return faultMessage;
    }
}
    