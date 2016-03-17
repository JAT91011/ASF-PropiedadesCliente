package utilitiies;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import entities.xsd.Propiedad;
import entities.xsd.Provincia;
import services.BorrarPropiedad;
import services.EditarPropiedad;
import services.ExisteProvinciaConNombre;
import services.ExisteProvinciaConNombreResponse;
import services.InsertarPropiedad;
import services.InsertarProvincia;
import services.ObtenerPropiedad;
import services.ObtenerPropiedadResponse;
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

	public Propiedad obtenerPropiedad(int id) {

		try {
			opropiedad = new ObtenerPropiedad();
			opropiedad.setId(id);
			opropiedadr = stub.obtenerPropiedad(opropiedad);
			Propiedad propiedad = opropiedadr.get_return();
			return propiedad;
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

	public void insertarPropiedad(Propiedad p) {
		try {
			ipro = new InsertarPropiedad();
			ipro.setP(p);
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

	public boolean existeProvinciaConNombre(String provincia) {
		try {
			epn = new ExisteProvinciaConNombre();
			epn.setProvincia(provincia);
			epnr = instance.stub.existeProvinciaConNombre(epn);
			boolean resul = epnr.get_return();

			return resul;
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
		return false;
	}

	public void insertarProvincia(Provincia p) {
		try {
			if (!existeProvinciaConNombre(p.getNombre())) {
				ip = new InsertarProvincia();
				ip.setP(p);
				stub.insertarProvincia(ip);
			}
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

	public Provincia obtenerProvinciaPorNombre(String provincia) {
		try {
			opn = new ObtenerProvinciaPorNombre();
			opn.setProvincia(provincia);
			opnr = stub.obtenerProvinciaPorNombre(opn);
			Provincia p = opnr.get_return();
			return p;
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
