package entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "propiedad")
@XmlAccessorType(XmlAccessType.FIELD)
public class Propiedad {

	private String		nombre;
	private String		descripcion;
	private String		direccion;
	private float		latitud;
	private float		longitud;
	private double		area;
	private double		precio;

	@XmlElement(name = "municipio")
	private Municipio	municipio;

	public Propiedad() {

	}

	public Propiedad(String nombre, String descripcion, String direccion, float latitud, float longitud, double area, double precio,
			Municipio municipio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.area = area;
		this.precio = precio;
		this.municipio = municipio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
}