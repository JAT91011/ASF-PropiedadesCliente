
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package java.sql.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://entities/xsd".equals(namespaceURI) &&
                  "Propiedad".equals(typeName)){
                   
                            return  entities.xsd.Propiedad.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://entities/xsd".equals(namespaceURI) &&
                  "Provincia".equals(typeName)){
                   
                            return  entities.xsd.Provincia.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://sql.java/xsd".equals(namespaceURI) &&
                  "SQLException".equals(typeName)){
                   
                            return  java.sql.xsd.SQLException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://entities/xsd".equals(namespaceURI) &&
                  "Municipio".equals(typeName)){
                   
                            return  entities.xsd.Municipio.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    