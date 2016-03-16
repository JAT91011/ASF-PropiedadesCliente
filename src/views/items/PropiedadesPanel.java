package views.items;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PropiedadesPanel extends JPanel {

	private static final long	serialVersionUID	= 5131759915996741639L;
	private JTextField			txtId;
	private JTextField			txtNombre;
	private JTextField			txtAddress;
	private JTextField			textField_3;
	private JTextField			textField_4;
	private JTextField			textField_5;
	private JTextField			textField_6;

	public PropiedadesPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblId = new JLabel("ID");
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

		JTextArea txtDescripcion = new JTextArea();
		scrollPane.setViewportView(txtDescripcion);

		JLabel lblDireccin = new JLabel("Dirección");
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.WEST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 1;
		gbc_lblDireccin.gridy = 4;
		add(lblDireccin, gbc_lblDireccin);

		txtAddress = new JTextField();
		GridBagConstraints gbc_txtAddress = new GridBagConstraints();
		gbc_txtAddress.insets = new Insets(0, 0, 5, 5);
		gbc_txtAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddress.gridx = 2;
		gbc_txtAddress.gridy = 4;
		add(txtAddress, gbc_txtAddress);
		txtAddress.setColumns(10);

		JLabel lblProvincia = new JLabel("Provincia");
		GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
		gbc_lblProvincia.anchor = GridBagConstraints.WEST;
		gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia.gridx = 1;
		gbc_lblProvincia.gridy = 5;
		add(lblProvincia, gbc_lblProvincia);

		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 5;
		add(comboBox, gbc_comboBox);

		JLabel lblLatitud = new JLabel("Latitud");
		GridBagConstraints gbc_lblLatitud = new GridBagConstraints();
		gbc_lblLatitud.anchor = GridBagConstraints.WEST;
		gbc_lblLatitud.insets = new Insets(0, 0, 5, 5);
		gbc_lblLatitud.gridx = 1;
		gbc_lblLatitud.gridy = 6;
		add(lblLatitud, gbc_lblLatitud);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 6;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblLongitud = new JLabel("Longitud");
		GridBagConstraints gbc_lblLongitud = new GridBagConstraints();
		gbc_lblLongitud.anchor = GridBagConstraints.WEST;
		gbc_lblLongitud.insets = new Insets(0, 0, 5, 5);
		gbc_lblLongitud.gridx = 1;
		gbc_lblLongitud.gridy = 7;
		add(lblLongitud, gbc_lblLongitud);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 7;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 8;
		add(lblPrecio, gbc_lblPrecio);

		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 8;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblrea = new JLabel("Área");
		GridBagConstraints gbc_lblrea = new GridBagConstraints();
		gbc_lblrea.anchor = GridBagConstraints.WEST;
		gbc_lblrea.insets = new Insets(0, 0, 5, 5);
		gbc_lblrea.gridx = 1;
		gbc_lblrea.gridy = 9;
		add(lblrea, gbc_lblrea);

		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 9;
		add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.EAST;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 11;
		add(panel, gbc_panel);

		JButton btnCancel = new JButton("Cancelar");
		panel.add(btnCancel);

		JButton btnGuardar = new JButton("Guardar");
		panel.add(btnGuardar);

	}

}
