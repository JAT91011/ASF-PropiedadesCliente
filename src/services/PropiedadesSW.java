

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
                    * @param existeProvinciaConNombre4
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ExisteProvinciaConNombreResponse existeProvinciaConNombre(

                        services.ExisteProvinciaConNombre existeProvinciaConNombre4)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param existeProvinciaConNombre4
            
          */
        public void startexisteProvinciaConNombre(

            services.ExisteProvinciaConNombre existeProvinciaConNombre4,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarPropiedad6
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void insertarPropiedad(

                        services.InsertarPropiedad insertarPropiedad6)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarPropiedad6
            
          */
        public void startinsertarPropiedad(

            services.InsertarPropiedad insertarPropiedad6,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param editarPropiedad8
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void editarPropiedad(

                        services.EditarPropiedad editarPropiedad8)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param editarPropiedad8
            
          */
        public void starteditarPropiedad(

            services.EditarPropiedad editarPropiedad8,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarProvincia10
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void insertarProvincia(

                        services.InsertarProvincia insertarProvincia10)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarProvincia10
            
          */
        public void startinsertarProvincia(

            services.InsertarProvincia insertarProvincia10,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerPropiedades12
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerPropiedadesResponse obtenerPropiedades(

                        services.ObtenerPropiedades obtenerPropiedades12)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerPropiedades12
            
          */
        public void startobtenerPropiedades(

            services.ObtenerPropiedades obtenerPropiedades12,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarPropiedad14
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public void borrarPropiedad(

                        services.BorrarPropiedad borrarPropiedad14)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarPropiedad14
            
          */
        public void startborrarPropiedad(

            services.BorrarPropiedad borrarPropiedad14,

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
                    * @param obtenerPropiedadesPorProvincia18
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerPropiedadesPorProvinciaResponse obtenerPropiedadesPorProvincia(

                        services.ObtenerPropiedadesPorProvincia obtenerPropiedadesPorProvincia18)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerPropiedadesPorProvincia18
            
          */
        public void startobtenerPropiedadesPorProvincia(

            services.ObtenerPropiedadesPorProvincia obtenerPropiedadesPorProvincia18,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerProvinciaPorNombre20
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerProvinciaPorNombreResponse obtenerProvinciaPorNombre(

                        services.ObtenerProvinciaPorNombre obtenerProvinciaPorNombre20)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerProvinciaPorNombre20
            
          */
        public void startobtenerProvinciaPorNombre(

            services.ObtenerProvinciaPorNombre obtenerProvinciaPorNombre20,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerPropiedad22
                
             * @throws services.PropiedadesSWClassNotFoundExceptionException : 
             * @throws services.PropiedadesSWSQLExceptionException : 
         */

         
                     public services.ObtenerPropiedadResponse obtenerPropiedad(

                        services.ObtenerPropiedad obtenerPropiedad22)
                        throws java.rmi.RemoteException
             
          ,services.PropiedadesSWClassNotFoundExceptionException
          ,services.PropiedadesSWSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerPropiedad22
            
          */
        public void startobtenerPropiedad(

            services.ObtenerPropiedad obtenerPropiedad22,

            final services.PropiedadesSWCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    