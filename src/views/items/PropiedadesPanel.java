package views.items;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import entities.xsd.Propiedad;
import entities.xsd.Provincia;
import utilitiies.Axis2Manager;
import views.Window;

public class PropiedadesPanel extends JPanel {

	private static final long	serialVersionUID	= 5131759915996741639L;

	public static int			MODE_NEW			= 0;
	public static int			MODE_EDIT			= 1;
	public static int			MODE_VIEW			= 2;

	private JLabel				lblId;
	private JTextField			txtId;
	private JTextField			txtNombre;
	private JTextArea			txtDescripcion;
	private JTextField			txtDireccion;
	private JTextField			txtLatitud;
	private JTextField			txtLongitud;
	private JTextField			txtPrecio;
	private JTextField			txtArea;
	private JTextField			txtProvincia;

	private static String		provincias[]		= { "Alava", "Albacete", "Alicante", "Almería", "Asturias", "Avila", "Badajoz", "Barcelona",
			"Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada",
			"Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia",
			"Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona",
			"Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };

	private Vector<String>		vectorProvincias;

	public PropiedadesPanel(int mode, Propiedad propiedad) {

		this.vectorProvincias = new Vector<String>(Arrays.asList(provincias));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 1;
		add(lblId, gbc_lblId);

		txtId = new JTextField(0);
		txtId.setEnabled(false);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.gridx = 2;
		gbc_txtId.gridy = 1;
		add(txtId, gbc_txtId);
		txtId.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		JLabel lblDescripcin = new JLabel("Descripci\u00f3n");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 3;
		add(lblDescripcin, gbc_lblDescripcin);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		add(scrollPane, gbc_scrollPane);

		txtDescripcion = new JTextArea();
		scrollPane.setViewportView(txtDescripcion);

		JLabel lblDireccin = new JLabel("Direcci\u00f3n");
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.WEST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 1;
		gbc_lblDireccin.gridy = 4;
		add(lblDireccin, gbc_lblDireccin);

		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtAddress = new GridBagConstraints();
		gbc_txtAddress.insets = new Insets(0, 0, 5, 5);
		gbc_txtAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddress.gridx = 2;
		gbc_txtAddress.gridy = 4;
		add(txtDireccion, gbc_txtAddress);
		txtDireccion.setColumns(10);

		JLabel lblProvincia = new JLabel("Provincia");
		GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
		gbc_lblProvincia.anchor = GridBagConstraints.WEST;
		gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia.gridx = 1;
		gbc_lblProvincia.gridy = 5;
		add(lblProvincia, gbc_lblProvincia);

		txtProvincia = new JTextField();
		GridBagConstraints gbc_txtProvincia = new GridBagConstraints();
		gbc_txtProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_txtProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProvincia.gridx = 2;
		gbc_txtProvincia.gridy = 5;
		add(txtProvincia, gbc_txtProvincia);
		txtProvincia.setColumns(10);

		JLabel lblLatitud = new JLabel("Latitud");
		GridBagConstraints gbc_lblLatitud = new GridBagConstraints();
		gbc_lblLatitud.anchor = GridBagConstraints.WEST;
		gbc_lblLatitud.insets = new Insets(0, 0, 5, 5);
		gbc_lblLatitud.gridx = 1;
		gbc_lblLatitud.gridy = 6;
		add(lblLatitud, gbc_lblLatitud);

		txtLatitud = new JTextField();
		GridBagConstraints gbc_txtLatitud = new GridBagConstraints();
		gbc_txtLatitud.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLatitud.insets = new Insets(0, 0, 5, 5);
		gbc_txtLatitud.gridx = 2;
		gbc_txtLatitud.gridy = 6;
		add(txtLatitud, gbc_txtLatitud);
		txtLatitud.setColumns(10);

		JLabel lblLongitud = new JLabel("Longitud");
		GridBagConstraints gbc_lblLongitud = new GridBagConstraints();
		gbc_lblLongitud.anchor = GridBagConstraints.WEST;
		gbc_lblLongitud.insets = new Insets(0, 0, 5, 5);
		gbc_lblLongitud.gridx = 1;
		gbc_lblLongitud.gridy = 7;
		add(lblLongitud, gbc_lblLongitud);

		txtLongitud = new JTextField();
		GridBagConstraints gbc_txtLongitud = new GridBagConstraints();
		gbc_txtLongitud.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLongitud.insets = new Insets(0, 0, 5, 5);
		gbc_txtLongitud.gridx = 2;
		gbc_txtLongitud.gridy = 7;
		add(txtLongitud, gbc_txtLongitud);
		txtLongitud.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 8;
		add(lblPrecio, gbc_lblPrecio);

		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.gridx = 2;
		gbc_txtPrecio.gridy = 8;
		add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		JLabel lblArea = new JLabel("\u00c1rea");
		GridBagConstraints gbc_lblArea = new GridBagConstraints();
		gbc_lblArea.anchor = GridBagConstraints.WEST;
		gbc_lblArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblArea.gridx = 1;
		gbc_lblArea.gridy = 9;
		add(lblArea, gbc_lblArea);

		txtArea = new JTextField();
		GridBagConstraints gbc_txtArea = new GridBagConstraints();
		gbc_txtArea.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtArea.insets = new Insets(0, 0, 5, 5);
		gbc_txtArea.gridx = 2;
		gbc_txtArea.gridy = 9;
		add(txtArea, gbc_txtArea);
		txtArea.setColumns(10);

		setMode(mode, propiedad);
	}

	public void setMode(int mode, Propiedad propiedad) {

		// Se habilitan o inhabilitan los controles
		this.txtNombre.setEditable(mode != MODE_VIEW);
		this.txtProvincia.setEditable(mode != MODE_VIEW);
		this.txtDescripcion.setEditable(mode != MODE_VIEW);
		this.txtDireccion.setEditable(mode != MODE_VIEW);
		this.txtLatitud.setEditable(mode != MODE_VIEW);
		this.txtLongitud.setEditable(mode != MODE_VIEW);
		this.txtPrecio.setEditable(mode != MODE_VIEW);
		this.txtArea.setEditable(mode != MODE_VIEW);

		// Se cargan los datos si estamos en modo editable
		if (mode != MODE_NEW) {
			this.txtId.setText(Integer.toString(propiedad.getId()));
			this.txtNombre.setText(propiedad.getNombre());
			this.txtDescripcion.setText(propiedad.getDescripcion());
			this.txtDireccion.setText(propiedad.getDireccion());
			this.txtProvincia.setText(propiedad.getProvincia().getNombre());
			this.txtLatitud.setText(Float.toString(propiedad.getLatitud()));
			this.txtLongitud.setText(Float.toString(propiedad.getLongitud()));
			this.txtPrecio.setText(Double.toString(propiedad.getPrecio()));
			this.txtArea.setText(Double.toString(propiedad.getArea()));
		} else {
			this.txtId.setText(Integer.toString(0));
			this.lblId.setVisible(false);
			this.txtId.setVisible(false);
		}
	}

	public Propiedad obtenerPropiedad() {
		String provinciaText = txtProvincia.getText().trim();
		if (this.vectorProvincias.contains(provinciaText)) {
			Provincia provincia = new Provincia();
			provincia.setNombre(provinciaText);
			if (!Axis2Manager.getInstance().existeProvinciaConNombre(provinciaText)) {
				Axis2Manager.getInstance().insertarProvincia(provincia);
			}
			provincia = Axis2Manager.getInstance().obtenerProvinciaPorNombre(provinciaText);

			Propiedad propiedad = new Propiedad();
			propiedad.setId(Integer.parseInt(txtId.getText().trim()));
			propiedad.setNombre(txtNombre.getText().trim());
			propiedad.setDescripcion(txtDescripcion.getText().trim());
			propiedad.setDireccion(txtDireccion.getText().trim());
			propiedad.setProvincia(provincia);
			propiedad.setLatitud(Float.parseFloat(txtLatitud.getText().trim()));
			propiedad.setLongitud(Float.parseFloat(txtLongitud.getText().trim()));
			propiedad.setPrecio(Double.parseDouble(txtPrecio.getText().trim()));
			propiedad.setArea(Double.parseDouble(txtArea.getText().trim()));

			return propiedad;
		} else {
			JOptionPane.showMessageDialog(Window.getInstance(), "La provincia introducida no existe", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
}