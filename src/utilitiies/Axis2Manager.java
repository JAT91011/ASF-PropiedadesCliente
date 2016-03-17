package utilitiies;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import entities.Propiedad;

public class Axis2Manager {
	private static Axis2Manager						instance;
	private PropiedadesSWStub						stub;
	private ExisteProvinciaConNombre				epn;
	private ExisteProvinciaConNombreResponse		epnr;
	private InsertarProvincia						ip;
	private ObtenerProvinciaPorNombre				opn;
	private ObtenerProvinciaPorNombreResponse		opnr;
	private InsertarPropiedad						ipro;
	private ObtenerPropiedades						opro;
	private ObtenerPropiedad						opropiedad;
	private ObtenerPropiedadResponse				opropiedadr;
	private ObtenerPropiedadesResponse				opror;
	private ObtenerPropiedadesPorProvincia			oprop;
	private ObtenerPropiedadesPorProvinciaResponse	opropr;
	private ObtenerPropiedadesPorNombre				opron;
	private ObtenerPropiedadesPorNombreResponse		opronr;
	private EditarPropiedad							epro;
	private BorrarPropiedad							bpro;

	private Axis2Manager() {
		try {
			stub = new PropiedadesSWStub("http://localhost:8080/axis2/services/PropiedadesSW");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Propiedad[] obtenerProvincias() {
		try {
			// TODO obtener provincias
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWClassNotFoundExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Propiedad[] obtenerPropiedades() {
		try {
			opro = new ObtenerPropiedades();
			opror = instance.stub.obtenerPropiedades(opro);
			Propiedad[] propiedades = opror.get_return();
			return propiedades;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWClassNotFoundExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Propiedad[] obtenerPropiedadesPorProvincia(String provincia) {
		try {
			oprop = new ObtenerPropiedadesPorProvincia();
			oprop.setProvincia(provincia);
			opropr = stub.obtenerPropiedadesPorProvincia(oprop);
			Propiedad[] propiedadesProvincia = opropr.get_return();
			return propiedadesProvincia;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWClassNotFoundExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Propiedad[] obtenerPropiedadesPorNombre(String nombre) {
		try {
			opron = new ObtenerPropiedadesPorNombre();
			opron.setNombre(nombre);
			opronr = instance.stub.obtenerPropiedadesPorNombre(opron);
			Propiedad[] propiedadesNombre = opronr.get_return();
			return propiedadesNombre;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWClassNotFoundExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String insertarPropiedad(Propiedad p) {
		try {
			ipro = new InsertarPropiedad();
			ipro.setP(p);
			// TODO Devolver string
			stub.insertarPropiedad(ipro);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWClassNotFoundExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editarPropiedad(Propiedad p) {
		try {
			epro = new EditarPropiedad();
			epro.setP(p);
			stub.editarPropiedad(epro);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWClassNotFoundExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrarPropiedad(int id) {
		try {
			bpro = new BorrarPropiedad();
			bpro.setId(id);
			stub.borrarPropiedad(bpro);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWClassNotFoundExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropiedadesSWSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PropiedadesSWStub getStub() {
		return stub;
	}

	public static Axis2Manager getInstance() {
		if (instance == null) {
			instance = new Axis2Manager();
		}
		return instance;
	}
}
