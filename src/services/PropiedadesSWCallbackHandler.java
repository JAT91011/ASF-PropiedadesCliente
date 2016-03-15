
/**
 * PropiedadesSWCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package services;

    /**
     *  PropiedadesSWCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PropiedadesSWCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PropiedadesSWCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PropiedadesSWCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for obtenerMunicipioPorNombre method
            * override this method for handling normal response from obtenerMunicipioPorNombre operation
            */
           public void receiveResultobtenerMunicipioPorNombre(
                    services.ObtenerMunicipioPorNombreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMunicipioPorNombre operation
           */
            public void receiveErrorobtenerMunicipioPorNombre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarMunicipio method
            * override this method for handling normal response from insertarMunicipio operation
            */
           public void receiveResultinsertarMunicipio(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarMunicipio operation
           */
            public void receiveErrorinsertarMunicipio(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for existeProvinciaConNombre method
            * override this method for handling normal response from existeProvinciaConNombre operation
            */
           public void receiveResultexisteProvinciaConNombre(
                    services.ExisteProvinciaConNombreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from existeProvinciaConNombre operation
           */
            public void receiveErrorexisteProvinciaConNombre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for editarPropiedad method
            * override this method for handling normal response from editarPropiedad operation
            */
           public void receiveResulteditarPropiedad(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from editarPropiedad operation
           */
            public void receiveErroreditarPropiedad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarProvincia method
            * override this method for handling normal response from insertarProvincia operation
            */
           public void receiveResultinsertarProvincia(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarProvincia operation
           */
            public void receiveErrorinsertarProvincia(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPropiedadesPorNombre method
            * override this method for handling normal response from obtenerPropiedadesPorNombre operation
            */
           public void receiveResultobtenerPropiedadesPorNombre(
                    services.ObtenerPropiedadesPorNombreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPropiedadesPorNombre operation
           */
            public void receiveErrorobtenerPropiedadesPorNombre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPropiedad method
            * override this method for handling normal response from obtenerPropiedad operation
            */
           public void receiveResultobtenerPropiedad(
                    services.ObtenerPropiedadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPropiedad operation
           */
            public void receiveErrorobtenerPropiedad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for main method
            * override this method for handling normal response from main operation
            */
           public void receiveResultmain(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from main operation
           */
            public void receiveErrormain(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarPropiedad method
            * override this method for handling normal response from insertarPropiedad operation
            */
           public void receiveResultinsertarPropiedad(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarPropiedad operation
           */
            public void receiveErrorinsertarPropiedad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPropiedadesPorMunicipio method
            * override this method for handling normal response from obtenerPropiedadesPorMunicipio operation
            */
           public void receiveResultobtenerPropiedadesPorMunicipio(
                    services.ObtenerPropiedadesPorMunicipioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPropiedadesPorMunicipio operation
           */
            public void receiveErrorobtenerPropiedadesPorMunicipio(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPropiedades method
            * override this method for handling normal response from obtenerPropiedades operation
            */
           public void receiveResultobtenerPropiedades(
                    services.ObtenerPropiedadesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPropiedades operation
           */
            public void receiveErrorobtenerPropiedades(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarPropiedad method
            * override this method for handling normal response from borrarPropiedad operation
            */
           public void receiveResultborrarPropiedad(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarPropiedad operation
           */
            public void receiveErrorborrarPropiedad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for existeMunicipioConNombre method
            * override this method for handling normal response from existeMunicipioConNombre operation
            */
           public void receiveResultexisteMunicipioConNombre(
                    services.ExisteMunicipioConNombreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from existeMunicipioConNombre operation
           */
            public void receiveErrorexisteMunicipioConNombre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerProvinciaPorNombre method
            * override this method for handling normal response from obtenerProvinciaPorNombre operation
            */
           public void receiveResultobtenerProvinciaPorNombre(
                    services.ObtenerProvinciaPorNombreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerProvinciaPorNombre operation
           */
            public void receiveErrorobtenerProvinciaPorNombre(java.lang.Exception e) {
            }
                


    }
    