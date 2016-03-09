package entities.wrappers;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import entities.Propiedad;

@XmlRootElement(name = "propiedades")
@XmlAccessorType(XmlAccessType.FIELD)
public class Propiedades {
	@XmlElement(name = "propiedad")
	private ArrayList<Propiedad> propiedades = null;

	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
}