package test;

import java.rmi.RemoteException;

import entities.xsd.Propiedad;
import entities.xsd.Provincia;
import services.BorrarPropiedad;
import services.EditarPropiedad;
import services.ExisteProvinciaConNombre;
import services.ExisteProvinciaConNombreResponse;
import services.InsertarPropiedad;
import services.InsertarProvincia;
import services.ObtenerPropiedades;
import services.ObtenerPropiedadesPorNombre;
import services.ObtenerPropiedadesPorNombreResponse;
import services.ObtenerPropiedadesPorProvincia;
import services.ObtenerPropiedadesPorProvinciaResponse;
import services.ObtenerPropiedadesResponse;
import services.ObtenerProvinciaPorNombre;
import services.ObtenerProvinciaPorNombreResponse;
import services.PropiedadesSWClassNotFoundExceptionException;
import services.PropiedadesSWSQLExceptionException;
import services.PropiedadesSWStub;

public class ClientePropiedades {

	public static void main(String[] args) throws RemoteException, PropiedadesSWClassNotFoundExceptionException, PropiedadesSWSQLExceptionException {
		// Declaramos e inicializamos el stub.
		PropiedadesSWStub stub = new PropiedadesSWStub("http://localhost:8080/axis2/services/PropiedadesSW");

		// Declaramos todos los servicios que vamos a utilizar
		ExisteProvinciaConNombre epn;
		ExisteProvinciaConNombreResponse epnr;
		InsertarProvincia ip;
		ObtenerProvinciaPorNombre opn;
		ObtenerProvinciaPorNombreResponse opnr;
		InsertarPropiedad ipro;
		ObtenerPropiedades opro;
		ObtenerPropiedadesResponse opror;
		ObtenerPropiedadesPorProvincia oprop;
		ObtenerPropiedadesPorProvinciaResponse opropr;
		ObtenerPropiedadesPorNombre opron;
		ObtenerPropiedadesPorNombreResponse opronr;
		EditarPropiedad epro;
		BorrarPropiedad bpro;

		// Proceso inserci�n provincia Madrid
		Provincia p_Madrid = new Provincia();
		p_Madrid.setNombre("Madrid");
		epn = new ExisteProvinciaConNombre();
		epn.setProvincia("Madrid");
		epnr = stub.existeProvinciaConNombre(epn);
		if (!epnr.get_return()) {
			ip = new InsertarProvincia();
			ip.setP(p_Madrid);
			stub.insertarProvincia(ip);
		}
		opn = new ObtenerProvinciaPorNombre();
		opn.setProvincia("Madrid");
		opnr = stub.obtenerProvinciaPorNombre(opn);
		p_Madrid = opnr.get_return();

		// Proceso inserci�n provincia Vizcaya
		Provincia p_Vizcaya = new Provincia();
		p_Vizcaya.setNombre("Vizcaya");
		epn = new ExisteProvinciaConNombre();
		epn.setProvincia("Vizcaya");
		epnr = stub.existeProvinciaConNombre(epn);
		if (!epnr.get_return()) {
			ip = new InsertarProvincia();
			ip.setP(p_Vizcaya);
			stub.insertarProvincia(ip);
		}
		opn = new ObtenerProvinciaPorNombre();
		opn.setProvincia("Vizcaya");
		opnr = stub.obtenerProvinciaPorNombre(opn);
		p_Vizcaya = opnr.get_return();

		// Proceso inserci�n provincia Alava
		Provincia p_Alava = new Provincia();
		p_Alava.setNombre("Alava");
		epn = new ExisteProvinciaConNombre();
		epn.setProvincia("Alava");
		epnr = stub.existeProvinciaConNombre(epn);
		if (!epnr.get_return()) {
			ip = new InsertarProvincia();
			ip.setP(p_Alava);
			stub.insertarProvincia(ip);
		}
		opn = new ObtenerProvinciaPorNombre();
		opn.setProvincia("Alava");
		opnr = stub.obtenerProvinciaPorNombre(opn);
		p_Alava = opnr.get_return();

		// Proceso inserci�n propiedad Bilbao
		Propiedad pro_Bilbao = new Propiedad();
		pro_Bilbao.setNombre("Terreno Bilbao");
		pro_Bilbao.setDescripcion("Grande");
		pro_Bilbao.setDireccion("Calle falsa 1234");
		pro_Bilbao.setLatitud(25.564561f);
		pro_Bilbao.setLongitud(-4.5646513216f);
		pro_Bilbao.setArea(2500.1);
		pro_Bilbao.setPrecio(500);
		pro_Bilbao.setProvincia(p_Vizcaya);
		ipro = new InsertarPropiedad();
		ipro.setP(pro_Bilbao);
		stub.insertarPropiedad(ipro);

		// Proceso inserci�n propiedad Karrantza
		Propiedad pro_Karrantza = new Propiedad();
		pro_Karrantza.setNombre("Terreno Karrantza");
		pro_Karrantza.setDescripcion("Grande");
		pro_Karrantza.setDireccion("Calle falsa 1234");
		pro_Karrantza.setLatitud(25.564561f);
		pro_Karrantza.setLongitud(-4.5646513216f);
		pro_Karrantza.setArea(2500.1);
		pro_Karrantza.setPrecio(500);
		pro_Karrantza.setProvincia(p_Vizcaya);
		ipro = new InsertarPropiedad();
		ipro.setP(pro_Karrantza);
		stub.insertarPropiedad(ipro);

		// Proceso inserci�n propiedad Madrid
		Propiedad pro_Madrid = new Propiedad();
		pro_Madrid.setNombre("Terreno Madrid");
		pro_Madrid.setDescripcion("Grande");
		pro_Madrid.setDireccion("Calle falsa 1234");
		pro_Madrid.setLatitud(25.564561f);
		pro_Madrid.setLongitud(-4.5646513216f);
		pro_Madrid.setArea(2500.1);
		pro_Madrid.setPrecio(500);
		pro_Madrid.setProvincia(p_Madrid);
		ipro = new InsertarPropiedad();
		ipro.setP(pro_Madrid);
		stub.insertarPropiedad(ipro);

		// Proceso inserci�n propiedad Vitoria
		Propiedad pro_Vitoria = new Propiedad();
		pro_Vitoria.setNombre("Terreno Vitoria");
		pro_Vitoria.setDescripcion("Grande");
		pro_Vitoria.setDireccion("Calle falsa 1234");
		pro_Vitoria.setLatitud(25.564561f);
		pro_Vitoria.setLongitud(-4.5646513216f);
		pro_Vitoria.setArea(2500.1);
		pro_Vitoria.setPrecio(500);
		pro_Vitoria.setProvincia(p_Alava);
		ipro = new InsertarPropiedad();
		ipro.setP(pro_Vitoria);
		stub.insertarPropiedad(ipro);

		System.out.println("Insercion realizada correctamente\n");

		// Obtenemos las propiedades y las mostramos por pantalla
		System.out.println("Propiedades insertadas:");
		opro = new ObtenerPropiedades();
		opror = stub.obtenerPropiedades(opro);
		Propiedad[] propiedades = opror.get_return();
		for (int i = 0; i < propiedades.length; i++) {
			System.out.println((i + 1) + ". " + propiedades[i].getNombre() + "\n");
		}

		// Mostramos las propiedades de Vizcaya
		System.out.println("Propiedades en Vizcaya:");
		oprop = new ObtenerPropiedadesPorProvincia();
		oprop.setProvincia("Vizcaya");
		opropr = stub.obtenerPropiedadesPorProvincia(oprop);
		Propiedad[] propiedadesProvincia = opropr.get_return();
		for (int i = 0; i < propiedadesProvincia.length; i++) {
			System.out.println((i + 1) + ". " + propiedadesProvincia[i].getNombre() + "\n");
		}

		// Mostramos las propiedades que tengan como nombre Karrantza
		System.out.println("Propiedades con nombre Karrantza:");
		opron = new ObtenerPropiedadesPorNombre();
		opron.setNombre("Karrantza");
		opronr = stub.obtenerPropiedadesPorNombre(opron);
		Propiedad[] propiedadesNombre = opronr.get_return();
		for (int i = 0; i < propiedadesNombre.length; i++) {
			System.out.println((i + 1) + ". " + propiedadesNombre[i].getNombre() + "\n");
		}

		// Editamos la propiedad de Madrid
		for (int i = 0; i < propiedades.length; i++) {
			if (propiedades[i].getNombre().equals("Terreno Madrid")) {
				propiedades[i].setNombre("Terreno Madrid Editado");
				epro = new EditarPropiedad();
				epro.setP(propiedades[i]);
				stub.editarPropiedad(epro);
				System.out.println("La propiedad " + propiedades[i].getNombre() + "ha sido editada correctamente.\n");
			}
		}

		// Borramos la propiedad de Vitoria
		for (int i = 0; i < propiedades.length; i++) {
			if (propiedades[i].getNombre().equals("Terreno Vitoria")) {
				bpro = new BorrarPropiedad();
				bpro.setId(propiedades[i].getId());
				stub.borrarPropiedad(bpro);
				System.out.println("La propiedad " + propiedades[i].getNombre() + "ha sido borrada correctamente.\n");
			}
		}
	}
}
