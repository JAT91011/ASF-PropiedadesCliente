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

	/*
	 * public static void main(String... args) throws JAXBException, IOException
	 * {
	 * 
	 * ArrayList<Propiedad> propiedadesList = new ArrayList<Propiedad>();
	 * 
	 * // Se crea una provincia Provincia p1 = new Provincia("Vizcaya");
	 * 
	 * // Se crea un municipio Municipio m1 = new Municipio("Atxondo", p1);
	 * 
	 * // Se crean varias Propiedades Propiedad prop1 = new Propiedad();
	 * prop1.setNombre("AAA"); prop1.setDescripcion("AAAAA");
	 * prop1.setLatitud(0.0F); prop1.setLongitud(0.0F);
	 * prop1.setDireccion("AAAAAAAAAA"); prop1.setPrecio(0.2);
	 * prop1.setArea(100.00); prop1.setMunicipio(m1);
	 * propiedadesList.add(prop1);
	 * 
	 * // Se crean varias Propiedades Propiedad prop2 = new Propiedad();
	 * prop2.setNombre("BBB"); prop2.setDescripcion("BBBBB");
	 * prop2.setLatitud(0.0F); prop2.setLongitud(0.0F);
	 * prop2.setDireccion("BBBBBBBBBB"); prop2.setPrecio(0.4);
	 * prop2.setArea(120.00); prop2.setMunicipio(m1);
	 * propiedadesList.add(prop2);
	 * 
	 * Propiedades propiedades = new Propiedades();
	 * propiedades.setPropiedades(propiedadesList);
	 * 
	 * // We had written this file in marshalling example JAXBContext context =
	 * JAXBContext.newInstance(Propiedades.class); Marshaller m =
	 * context.createMarshaller();
	 * m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 * m.marshal(propiedades, System.out); Writer w = null; try { w = new
	 * FileWriter("files/Propiedades.xml"); m.marshal(propiedades, w); } finally
	 * { try { w.close(); } catch (Exception e) { } } }
	 */
}