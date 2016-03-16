package entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "municipio")
@XmlAccessorType(XmlAccessType.FIELD)
public class Municipio {

	private String		nombre;
	private Provincia	provincia;

	public Municipio() {

	}

	public Municipio(String nombre, Provincia provincia) {
		this.nombre = nombre;
		this.provincia = provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
}