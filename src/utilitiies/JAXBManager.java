package utilitiies;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import entities.Propiedad;
import entities.wrappers.Propiedades;

public class JAXBManager {
	private static JAXBManager instance;

	private JAXBManager() {

	}

	public ArrayList<Propiedad> importProperties(final String path) {
		ArrayList<Propiedad> propiedadesList = null;
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

	public static JAXBManager getInstance() {
		if (instance == null) {
			instance = new JAXBManager();
		}
		return instance;
	}
}
