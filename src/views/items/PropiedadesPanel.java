package views.items;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import entities.Propiedad;
import entities.Provincia;

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
	private JComboBox<String>	cboProvincia;
	private JTextField			txtLatitud;
	private JTextField			txtLongitud;
	private JTextField			txtPrecio;
	private JTextField			txtArea;

	public PropiedadesPanel(int mode, Propiedad propiedad) {

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

		txtId = new JTextField();
		txtId.setEnabled(false);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.anchor = GridBagConstraints.WEST;
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

		JLabel lblDescripcin = new JLabel("Descripción");
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

		JLabel lblDireccin = new JLabel("Dirección");
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

		cboProvincia = new JComboBox<String>();
		GridBagConstraints gbc_cboProvincia = new GridBagConstraints();
		gbc_cboProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_cboProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboProvincia.gridx = 2;
		gbc_cboProvincia.gridy = 5;
		add(cboProvincia, gbc_cboProvincia);

		JLabel lblLatitud = new JLabel("Latitud");
		GridBagConstraints gbc_lblLatitud = new GridBagConstraints();
		gbc_lblLatitud.anchor = GridBagConstraints.WEST;
		gbc_lblLatitud.insets = new Insets(0, 0, 5, 5);
		gbc_lblLatitud.gridx = 1;
		gbc_lblLatitud.gridy = 6;
		add(lblLatitud, gbc_lblLatitud);

		txtLatitud = new JTextField();
		GridBagConstraints gbc_txtLatitud = new GridBagConstraints();
		gbc_txtLatitud.anchor = GridBagConstraints.WEST;
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
		gbc_txtLongitud.anchor = GridBagConstraints.WEST;
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
		gbc_txtPrecio.anchor = GridBagConstraints.WEST;
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.gridx = 2;
		gbc_txtPrecio.gridy = 8;
		add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		JLabel lblArea = new JLabel("Área");
		GridBagConstraints gbc_lblArea = new GridBagConstraints();
		gbc_lblArea.anchor = GridBagConstraints.WEST;
		gbc_lblArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblArea.gridx = 1;
		gbc_lblArea.gridy = 9;
		add(lblArea, gbc_lblArea);

		txtArea = new JTextField();
		GridBagConstraints gbc_txtArea = new GridBagConstraints();
		gbc_txtArea.anchor = GridBagConstraints.WEST;
		gbc_txtArea.insets = new Insets(0, 0, 5, 5);
		gbc_txtArea.gridx = 2;
		gbc_txtArea.gridy = 9;
		add(txtArea, gbc_txtArea);
		txtArea.setColumns(10);

		setMode(mode, propiedad);
	}

	private void setMode(int mode, Propiedad propiedad) {

		// Se habilitan o inhabilitan los controles
		this.txtNombre.setEditable(mode != MODE_VIEW);
		this.txtDescripcion.setEditable(mode != MODE_VIEW);
		this.txtDireccion.setEditable(mode != MODE_VIEW);
		this.cboProvincia.setEditable(mode != MODE_VIEW);
		this.txtLatitud.setEditable(mode != MODE_VIEW);
		this.txtLongitud.setEditable(mode != MODE_VIEW);
		this.txtPrecio.setEditable(mode != MODE_VIEW);
		this.txtArea.setEditable(mode != MODE_VIEW);

		// Se cargan los datos si estamos en modo editable
		if (mode != MODE_NEW) {
			this.txtId.setText(propiedad.getId());
			this.txtNombre.setText(propiedad.getNombre());
			this.txtDescripcion.setText(propiedad.getDescripcion());
			this.txtDireccion.setText(propiedad.getDireccion());
			this.cboProvincia.setSelectedItem(propiedad.getProvincia());
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

	private Propiedad obtenerPropiedad() {

		// Se carga la propiedad con los valores del formulario y la devolvemos
		Propiedad propiedad = new Propiedad();
		propiedad.setId(Integer.parseInt(txtId.getText().trim()));
		propiedad.setNombre(txtNombre.getText().trim());
		propiedad.setDescripcion(txtDescripcion.getText().trim());
		propiedad.setDireccion(txtDireccion.getText().trim());
		propiedad.setProvincia((Provincia) cboProvincia.getSelectedItem());
		propiedad.setLatitud(Float.parseFloat(txtLatitud.getText().trim()));
		propiedad.setLatitud(Float.parseFloat(txtLongitud.getText().trim()));
		propiedad.setPrecio(Double.parseDouble(txtPrecio.getText().trim()));
		propiedad.setArea(Double.parseDouble(txtArea.getText().trim()));

		return propiedad;
	}
}