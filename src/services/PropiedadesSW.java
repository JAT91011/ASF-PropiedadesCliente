

/**
 * PropiedadesSW.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package services;

    /*
     *  PropiedadesSW java interface
     */

    public interface PropiedadesSW {
          

        /**
          * Auto generated method signature
          * 
                    * @param obtenerMunicipioPorNombre6
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerMunicipioPorNombreResponse obtenerMunicipioPorNombre(

                        services.ObtenerMunicipioPorNombre obtenerMunicipioPorNombre6)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerMunicipioPorNombre6
            
          */
        public void startobtenerMunicipioPorNombre(

            services.ObtenerMunicipioPorNombre obtenerMunicipioPorNombre6,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarMunicipio8
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void insertarMunicipio(

                        services.InsertarMunicipio insertarMunicipio8)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarMunicipio8
            
          */
        public void startinsertarMunicipio(

            services.InsertarMunicipio insertarMunicipio8,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param existeProvinciaConNombre10
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ExisteProvinciaConNombreResponse existeProvinciaConNombre(

                        services.ExisteProvinciaConNombre existeProvinciaConNombre10)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param existeProvinciaConNombre10
            
          */
        public void startexisteProvinciaConNombre(

            services.ExisteProvinciaConNombre existeProvinciaConNombre10,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param editarPropiedad12
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void editarPropiedad(

                        services.EditarPropiedad editarPropiedad12)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param editarPropiedad12
            
          */
        public void starteditarPropiedad(

            services.EditarPropiedad editarPropiedad12,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarProvincia14
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void insertarProvincia(

                        services.InsertarProvincia insertarProvincia14)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarProvincia14
            
          */
        public void startinsertarProvincia(

            services.InsertarProvincia insertarProvincia14,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerPropiedadesPorNombre16
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerPropiedadesPorNombreResponse obtenerPropiedadesPorNombre(

                        services.ObtenerPropiedadesPorNombre obtenerPropiedadesPorNombre16)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerPropiedadesPorNombre16
            
          */
        public void startobtenerPropiedadesPorNombre(

            services.ObtenerPropiedadesPorNombre obtenerPropiedadesPorNombre16,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerPropiedad18
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerPropiedadResponse obtenerPropiedad(

                        services.ObtenerPropiedad obtenerPropiedad18)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerPropiedad18
            
          */
        public void startobtenerPropiedad(

            services.ObtenerPropiedad obtenerPropiedad18,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param main20
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void main(

                        services.Main main20)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param main20
            
          */
        public void startmain(

            services.Main main20,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarPropiedad22
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void insertarPropiedad(

                        services.InsertarPropiedad insertarPropiedad22)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarPropiedad22
            
          */
        public void startinsertarPropiedad(

            services.InsertarPropiedad insertarPropiedad22,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerPropiedadesPorMunicipio24
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerPropiedadesPorMunicipioResponse obtenerPropiedadesPorMunicipio(

                        services.ObtenerPropiedadesPorMunicipio obtenerPropiedadesPorMunicipio24)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerPropiedadesPorMunicipio24
            
          */
        public void startobtenerPropiedadesPorMunicipio(

            services.ObtenerPropiedadesPorMunicipio obtenerPropiedadesPorMunicipio24,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerPropiedades26
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerPropiedadesResponse obtenerPropiedades(

                        services.ObtenerPropiedades obtenerPropiedades26)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerPropiedades26
            
          */
        public void startobtenerPropiedades(

            services.ObtenerPropiedades obtenerPropiedades26,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarPropiedad28
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void borrarPropiedad(

                        services.BorrarPropiedad borrarPropiedad28)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarPropiedad28
            
          */
        public void startborrarPropiedad(

            services.BorrarPropiedad borrarPropiedad28,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param existeMunicipioConNombre30
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ExisteMunicipioConNombreResponse existeMunicipioConNombre(

                        services.ExisteMunicipioConNombre existeMunicipioConNombre30)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param existeMunicipioConNombre30
            
          */
        public void startexisteMunicipioConNombre(

            services.ExisteMunicipioConNombre existeMunicipioConNombre30,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerProvinciaPorNombre32
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerProvinciaPorNombreResponse obtenerProvinciaPorNombre(

                        services.ObtenerProvinciaPorNombre obtenerProvinciaPorNombre32)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerProvinciaPorNombre32
            
          */
        public void startobtenerProvinciaPorNombre(

            services.ObtenerProvinciaPorNombre obtenerProvinciaPorNombre32,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    