package test;

import java.rmi.RemoteException;

import entities.xsd.Propiedad;
import entities.xsd.Provincia;
import services.PropiedadesSWClassNotFoundExceptionException;
import services.PropiedadesSWSQLExceptionException;
import utilitiies.Axis2Manager;

public class ClientePropiedades {

	public static void main(String[] args) throws RemoteException, PropiedadesSWClassNotFoundExceptionException, PropiedadesSWSQLExceptionException {

		// Proceso inserci�n provincia Madrid
		Provincia p_Madrid = new Provincia();
		p_Madrid.setNombre("Madrid");
		if (!Axis2Manager.getInstance().existeProvinciaConNombre("Madrid")) {
			Axis2Manager.getInstance().insertarProvincia(p_Madrid);
		}
		p_Madrid = Axis2Manager.getInstance().obtenerProvinciaPorNombre("Madrid");

		// Proceso inserci�n provincia Vizcaya
		Provincia p_Vizcaya = new Provincia();
		p_Madrid.setNombre("Vizcaya");
		if (!Axis2Manager.getInstance().existeProvinciaConNombre("Vizcaya")) {
			Axis2Manager.getInstance().insertarProvincia(p_Vizcaya);
		}
		p_Vizcaya = Axis2Manager.getInstance().obtenerProvinciaPorNombre("Vizcaya");

		// Proceso inserci�n provincia Alava
		Provincia p_Alava = new Provincia();
		p_Madrid.setNombre("Alava");
		if (!Axis2Manager.getInstance().existeProvinciaConNombre("Alava")) {
			Axis2Manager.getInstance().insertarProvincia(p_Alava);
		}
		p_Alava = Axis2Manager.getInstance().obtenerProvinciaPorNombre("Alava");

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
		Axis2Manager.getInstance().insertarPropiedad(pro_Bilbao);

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
		Axis2Manager.getInstance().insertarPropiedad(pro_Karrantza);

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
		Axis2Manager.getInstance().insertarPropiedad(pro_Madrid);

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
		Axis2Manager.getInstance().insertarPropiedad(pro_Vitoria);

		System.out.println("Insercion realizada correctamente\n");

		// Obtenemos las propiedades y las mostramos por pantalla
		System.out.println("Propiedades insertadas:");
		Propiedad[] propiedades = Axis2Manager.getInstance().obtenerPropiedades();
		for (int i = 0; i < propiedades.length; i++) {
			System.out.println((i + 1) + ". " + propiedades[i].getNombre() + "\n");
		}

		// Mostramos las propiedades de Vizcaya
		System.out.println("Propiedades en Vizcaya:");
		Propiedad[] propiedadesProvincia = Axis2Manager.getInstance().obtenerPropiedadesPorProvincia("Vizcaya");
		for (int i = 0; i < propiedadesProvincia.length; i++) {
			System.out.println((i + 1) + ". " + propiedadesProvincia[i].getNombre() + "\n");
		}

		// Mostramos las propiedades que tengan como nombre Karrantza
		System.out.println("Propiedades con nombre Karrantza:");
		Propiedad[] propiedadesNombre = Axis2Manager.getInstance().obtenerPropiedadesPorNombre("Karrantza");
		for (int i = 0; i < propiedadesNombre.length; i++) {
			System.out.println((i + 1) + ". " + propiedadesNombre[i].getNombre() + "\n");
		}

		// Editamos la propiedad de Madrid
		for (int i = 0; i < propiedades.length; i++) {
			if (propiedades[i].getNombre().equals("Terreno Madrid")) {
				propiedades[i].setNombre("Terreno Madrid Editado");
				Axis2Manager.getInstance().editarPropiedad(propiedades[i]);
				System.out.println("La propiedad " + propiedades[i].getNombre() + "ha sido editada correctamente.\n");
			}
		}

		// Borramos la propiedad de Vitoria
		for (int i = 0; i < propiedades.length; i++) {
			if (propiedades[i].getNombre().equals("Terreno Vitoria")) {
				Axis2Manager.getInstance().borrarPropiedad(propiedades[i].getId());
				System.out.println("La propiedad " + propiedades[i].getNombre() + "ha sido borrada correctamente.\n");
			}
		}
	}
}
