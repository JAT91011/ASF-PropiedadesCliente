package test;

import java.rmi.RemoteException;

import entities.xsd.Municipio;
import entities.xsd.Propiedad;
import entities.xsd.Provincia;
import services.BorrarPropiedad;
import services.EditarPropiedad;
import services.ExisteMunicipioConNombre;
import services.ExisteMunicipioConNombreResponse;
import services.ExisteProvinciaConNombre;
import services.ExisteProvinciaConNombreResponse;
import services.InsertarMunicipio;
import services.InsertarPropiedad;
import services.InsertarProvincia;
import services.ObtenerMunicipioPorNombre;
import services.ObtenerMunicipioPorNombreResponse;
import services.ObtenerPropiedades;
import services.ObtenerPropiedadesPorMunicipio;
import services.ObtenerPropiedadesPorMunicipioResponse;
import services.ObtenerPropiedadesPorNombre;
import services.ObtenerPropiedadesPorNombreResponse;
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

		// Proceso inserción provincia Madrid
		Provincia p_Madrid = new Provincia();
		p_Madrid.setNombre("Madrid");
		ExisteProvinciaConNombre epn = new ExisteProvinciaConNombre();
		epn.setProvincia("Madrid");
		ExisteProvinciaConNombreResponse epnr = stub.existeProvinciaConNombre(epn);
		if (!epnr.get_return()) {
			InsertarProvincia ip = new InsertarProvincia();
			ip.setP(p_Madrid);
			stub.insertarProvincia(ip);
		}
		ObtenerProvinciaPorNombre opn = new ObtenerProvinciaPorNombre();
		opn.setProvincia("Madrid");
		ObtenerProvinciaPorNombreResponse opnr = stub.obtenerProvinciaPorNombre(opn);
		p_Madrid = opnr.get_return();

		// Proceso inserción provincia Vizcaya
		Provincia p_Vizcaya = new Provincia();
		p_Vizcaya.setNombre("Vizcaya");
		epn = new ExisteProvinciaConNombre();
		epn.setProvincia("Vizcaya");
		epnr = stub.existeProvinciaConNombre(epn);
		if (!epnr.get_return()) {
			InsertarProvincia ip = new InsertarProvincia();
			ip.setP(p_Vizcaya);
			stub.insertarProvincia(ip);
		}
		opn = new ObtenerProvinciaPorNombre();
		opn.setProvincia("Vizcaya");
		opnr = stub.obtenerProvinciaPorNombre(opn);
		p_Vizcaya = opnr.get_return();

		// Proceso inserción provincia Alava
		Provincia p_Alava = new Provincia();
		p_Alava.setNombre("Alava");
		epn = new ExisteProvinciaConNombre();
		epn.setProvincia("Alava");
		epnr = stub.existeProvinciaConNombre(epn);
		if (!epnr.get_return()) {
			InsertarProvincia ip = new InsertarProvincia();
			ip.setP(p_Alava);
			stub.insertarProvincia(ip);
		}
		opn = new ObtenerProvinciaPorNombre();
		opn.setProvincia("Alava");
		opnr = stub.obtenerProvinciaPorNombre(opn);
		p_Alava = opnr.get_return();

		// Proceso inserción municipio Bilbao
		Municipio m_Bilbao = new Municipio();
		m_Bilbao.setNombre("Bilbao");
		m_Bilbao.setProvincia(p_Vizcaya);
		ExisteMunicipioConNombre emn = new ExisteMunicipioConNombre();
		emn.setNomMunicipio("Bilbao");
		ExisteMunicipioConNombreResponse emnr = stub.existeMunicipioConNombre(emn);
		if (!emnr.get_return()) {
			InsertarMunicipio im = new InsertarMunicipio();
			im.setM(m_Bilbao);
			stub.insertarMunicipio(im);
		}
		ObtenerMunicipioPorNombre omn = new ObtenerMunicipioPorNombre();
		omn.setNomMunicipio("Bilbao");
		ObtenerMunicipioPorNombreResponse omnr = stub.obtenerMunicipioPorNombre(omn);
		m_Bilbao = omnr.get_return();

		// Proceso inserción municipio Karrantza
		Municipio m_Karrantza = new Municipio();
		m_Karrantza.setNombre("Karrantza");
		m_Karrantza.setProvincia(p_Vizcaya);
		emn = new ExisteMunicipioConNombre();
		emn.setNomMunicipio("Karrantza");
		emnr = stub.existeMunicipioConNombre(emn);
		if (!emnr.get_return()) {
			InsertarMunicipio im = new InsertarMunicipio();
			im.setM(m_Karrantza);
			stub.insertarMunicipio(im);
		}
		omn = new ObtenerMunicipioPorNombre();
		omn.setNomMunicipio("Karrantza");
		omnr = stub.obtenerMunicipioPorNombre(omn);
		m_Karrantza = omnr.get_return();

		// Proceso inserción municipio Madrid
		Municipio m_Madrid = new Municipio();
		m_Madrid.setNombre("Madrid");
		m_Madrid.setProvincia(p_Madrid);
		emn = new ExisteMunicipioConNombre();
		emn.setNomMunicipio("Madrid");
		emnr = stub.existeMunicipioConNombre(emn);
		if (!emnr.get_return()) {
			InsertarMunicipio im = new InsertarMunicipio();
			im.setM(m_Madrid);
			stub.insertarMunicipio(im);
		}
		omn = new ObtenerMunicipioPorNombre();
		omn.setNomMunicipio("Madrid");
		omnr = stub.obtenerMunicipioPorNombre(omn);
		m_Madrid = omnr.get_return();

		// Proceso inserción municipio Vitoria
		Municipio m_Vitoria = new Municipio();
		m_Vitoria.setNombre("Vitoria");
		m_Vitoria.setProvincia(p_Alava);
		emn = new ExisteMunicipioConNombre();
		emn.setNomMunicipio("Vitoria");
		emnr = stub.existeMunicipioConNombre(emn);
		if (!emnr.get_return()) {
			InsertarMunicipio im = new InsertarMunicipio();
			im.setM(m_Vitoria);
			stub.insertarMunicipio(im);
		}
		omn = new ObtenerMunicipioPorNombre();
		omn.setNomMunicipio("Vitoria");
		omnr = stub.obtenerMunicipioPorNombre(omn);
		m_Vitoria = omnr.get_return();

		// Proceso inserción propiedad Bilbao
		Propiedad pro_Bilbao = new Propiedad();
		pro_Bilbao.setNombre("Terreno Bilbao");
		pro_Bilbao.setDescripcion("Grande");
		pro_Bilbao.setDireccion("Calle falsa 1234");
		pro_Bilbao.setLatitud(25.564561f);
		pro_Bilbao.setLongitud(-4.5646513216f);
		pro_Bilbao.setArea(2500.1);
		pro_Bilbao.setPrecio(500);
		pro_Bilbao.setMunicipio(m_Bilbao);
		InsertarPropiedad ipro = new InsertarPropiedad();
		ipro.setP(pro_Bilbao);
		stub.insertarPropiedad(ipro);

		// Proceso inserción propiedad Karrantza
		Propiedad pro_Karrantza = new Propiedad();
		pro_Karrantza.setNombre("Terreno Karrantza");
		pro_Karrantza.setDescripcion("Grande");
		pro_Karrantza.setDireccion("Calle falsa 1234");
		pro_Karrantza.setLatitud(25.564561f);
		pro_Karrantza.setLongitud(-4.5646513216f);
		pro_Karrantza.setArea(2500.1);
		pro_Karrantza.setPrecio(500);
		pro_Karrantza.setMunicipio(m_Karrantza);
		ipro = new InsertarPropiedad();
		ipro.setP(pro_Karrantza);
		stub.insertarPropiedad(ipro);

		// Proceso inserción propiedad Madrid
		Propiedad pro_Madrid = new Propiedad();
		pro_Madrid.setNombre("Terreno Madrid");
		pro_Madrid.setDescripcion("Grande");
		pro_Madrid.setDireccion("Calle falsa 1234");
		pro_Madrid.setLatitud(25.564561f);
		pro_Madrid.setLongitud(-4.5646513216f);
		pro_Madrid.setArea(2500.1);
		pro_Madrid.setPrecio(500);
		pro_Madrid.setMunicipio(m_Madrid);
		ipro = new InsertarPropiedad();
		ipro.setP(pro_Madrid);
		stub.insertarPropiedad(ipro);

		// Proceso inserción propiedad Vitoria
		Propiedad pro_Vitoria = new Propiedad();
		pro_Vitoria.setNombre("Terreno Vitoria");
		pro_Vitoria.setDescripcion("Grande");
		pro_Vitoria.setDireccion("Calle falsa 1234");
		pro_Vitoria.setLatitud(25.564561f);
		pro_Vitoria.setLongitud(-4.5646513216f);
		pro_Vitoria.setArea(2500.1);
		pro_Vitoria.setPrecio(500);
		pro_Vitoria.setMunicipio(m_Vitoria);
		ipro = new InsertarPropiedad();
		ipro.setP(pro_Vitoria);
		stub.insertarPropiedad(ipro);

		System.out.println("Insercion realizada correctamente\n");

		// Obtenemos las propiedades y las mostramos por pantalla
		System.out.println("Propiedades insertadas:");
		ObtenerPropiedades opro = new ObtenerPropiedades();
		ObtenerPropiedadesResponse opror = stub.obtenerPropiedades(opro);
		Propiedad[] propiedades = opror.get_return();
		for (int i = 0; i < propiedades.length; i++) {
			System.out.println((i + 1) + ". " + propiedades[i].getNombre() + "\n");
		}

		// Mostramos las propiedades de Bilbao
		System.out.println("Propiedades en Bilbao:");
		ObtenerPropiedadesPorMunicipio oprom = new ObtenerPropiedadesPorMunicipio();
		oprom.setMunicipio("Bilbao");
		ObtenerPropiedadesPorMunicipioResponse opromr = stub.obtenerPropiedadesPorMunicipio(oprom);
		Propiedad[] propiedadesMunicipio = opromr.get_return();
		for (int i = 0; i < propiedadesMunicipio.length; i++) {
			System.out.println((i + 1) + ". " + propiedadesMunicipio[i].getNombre() + "\n");
		}

		// Mostramos las propiedades que tengan como nombre Karrantza
		System.out.println("Propiedades con nombre Karrantza:");
		ObtenerPropiedadesPorNombre opron = new ObtenerPropiedadesPorNombre();
		opron.setNombre("Karrantza");
		ObtenerPropiedadesPorNombreResponse opronr = stub.obtenerPropiedadesPorNombre(opron);
		Propiedad[] propiedadesNombre = opronr.get_return();
		for (int i = 0; i < propiedadesNombre.length; i++) {
			System.out.println((i + 1) + ". " + propiedadesNombre[i].getNombre() + "\n");
		}

		// Editamos la propiedad de Madrid
		for (int i = 0; i < propiedades.length; i++) {
			if (propiedades[i].getNombre().equals("Terreno Madrid")) {
				propiedades[i].setNombre("Terreno Madrid Editado");
				EditarPropiedad epro = new EditarPropiedad();
				epro.setP(propiedades[i]);
				stub.editarPropiedad(epro);
				System.out.println("La propiedad " + propiedades[i].getNombre() + " ha sido editada correctamente.\n");
			}
		}

		// Borramos la propiedad de Vitoria
		for (int i = 0; i < propiedades.length; i++) {
			if (propiedades[i].getNombre().equals("Terreno Vitoria")) {
				BorrarPropiedad bpro = new BorrarPropiedad();
				bpro.setId(propiedades[i].getId());
				stub.borrarPropiedad(bpro);
				System.out.println("La propiedad " + propiedades[i].getNombre() + " ha sido borrada correctamente.\n");
			}
		}
	}
}
