package utilitiies;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import entities.wrappers.Propiedades;

public class JAXBManager {

	private static JAXBManager instance;

	private JAXBManager() {

	}

	public ArrayList<entities.Propiedad> importProperties(final String path) {
		ArrayList<entities.Propiedad> propiedadesList = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Propiedades.class);
			Unmarshaller um = context.createUnmarshaller();
			Propiedades propiedades = (Propiedades) um.unmarshal(new FileReader(path));
			propiedadesList = propiedades.getPropiedades();
		} catch (JAXBException | FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return propiedadesList;
	}

	public entities.xsd.Provincia parseProvincia(entities.Provincia provincia) {
		entities.xsd.Provincia p = new entities.xsd.Provincia();
		p.setNombre(provincia.getNombre());
		return p;
	}

	public entities.xsd.Propiedad parsePropiedad(entities.Propiedad propiedad) {
		entities.xsd.Propiedad p = new entities.xsd.Propiedad();
		p.setNombre(propiedad.getNombre());
		p.setDescripcion(propiedad.getDescripcion());
		p.setDireccion(propiedad.getDireccion());
		p.setProvincia(parseProvincia(propiedad.getProvincia()));
		p.setLatitud(propiedad.getLatitud());
		p.setLongitud(propiedad.getLongitud());
		p.setPrecio(propiedad.getPrecio());
		p.setArea(propiedad.getArea());
		return p;
	}

	public static JAXBManager getInstance() {
		if (instance == null) {
			instance = new JAXBManager();
		}
		return instance;
	}
}
