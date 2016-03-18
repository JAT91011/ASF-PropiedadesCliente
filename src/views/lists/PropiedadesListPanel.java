package views.lists;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import utilitiies.Axis2Manager;
import utilitiies.FileChooser;
import utilitiies.JAXBManager;
import views.Window;
import views.items.PropiedadesPanel;

public class PropiedadesListPanel extends JPanel implements ActionListener {

	private static final long				serialVersionUID	= 5253268925767443459L;

	private String[]						header;
	private final DefaultTableModel			modelTable;
	private JTable							tableContent;

	private Vector<entities.xsd.Propiedad>	vectorPropiedades;

	private JButton							btnImport;
	private JButton							btnNew;
	private JButton							btnEdit;

	private JButton							btnFind;
	private JButton							btnClear;
	private JButton							btnRemove;
	private JLabel							lblNombre;
	private JTextField						txtNombre;

	private static String					provincias[]		= { "Alava", "Albacete", "Alicante", "Almería", "Asturias", "Avila", "Badajoz",
			"Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada",
			"Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia",
			"Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona",
			"Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };

	private Vector<String>					vectorProvincias;

	public PropiedadesListPanel() {

		this.vectorProvincias = new Vector<String>(Arrays.asList(provincias));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel buttonsPanel = new JPanel();
		GridBagConstraints gbc_buttonsPanel = new GridBagConstraints();
		gbc_buttonsPanel.insets = new Insets(5, 5, 5, 5);
		gbc_buttonsPanel.fill = GridBagConstraints.BOTH;
		gbc_buttonsPanel.gridx = 0;
		gbc_buttonsPanel.gridy = 0;
		add(buttonsPanel, gbc_buttonsPanel);
		GridBagLayout gbl_buttonsPanel = new GridBagLayout();
		gbl_buttonsPanel.columnWidths = new int[] { 0, 245, 0, 0, 0, 0 };
		gbl_buttonsPanel.rowHeights = new int[] { 40, 0 };
		gbl_buttonsPanel.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_buttonsPanel.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		buttonsPanel.setLayout(gbl_buttonsPanel);

		btnImport = new JButton("Importar");
		btnImport.setFocusPainted(false);
		btnImport.setIcon(new ImageIcon("icons/import-icon.png"));
		btnImport.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImport.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnImport.addActionListener(this);
		GridBagConstraints gbc_btnImport = new GridBagConstraints();
		gbc_btnImport.insets = new Insets(0, 1, 0, 5);
		gbc_btnImport.fill = GridBagConstraints.VERTICAL;
		gbc_btnImport.anchor = GridBagConstraints.WEST;
		gbc_btnImport.gridx = 0;
		gbc_btnImport.gridy = 0;
		buttonsPanel.add(btnImport, gbc_btnImport);

		btnNew = new JButton("Nueva");
		btnNew.setFocusPainted(false);
		btnNew.setIcon(new ImageIcon("icons/add-icon.png"));
		btnNew.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNew.addActionListener(this);
		btnNew.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNew = new GridBagConstraints();
		gbc_btnNew.fill = GridBagConstraints.BOTH;
		gbc_btnNew.insets = new Insets(0, 0, 0, 10);
		gbc_btnNew.gridx = 2;
		gbc_btnNew.gridy = 0;
		buttonsPanel.add(btnNew, gbc_btnNew);

		btnEdit = new JButton("Editar");
		btnEdit.setFocusPainted(false);
		btnEdit.setIcon(new ImageIcon("icons/edit-icon.png"));
		btnEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEdit.addActionListener(this);
		btnEdit.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.fill = GridBagConstraints.BOTH;
		gbc_btnEdit.insets = new Insets(0, 0, 0, 10);
		gbc_btnEdit.gridx = 3;
		gbc_btnEdit.gridy = 0;
		buttonsPanel.add(btnEdit, gbc_btnEdit);

		btnRemove = new JButton("Eliminar");
		btnRemove.setFocusPainted(false);
		btnRemove.setIcon(new ImageIcon("icons/remove-icon.png"));
		btnRemove.setBackground(new Color(240, 128, 128));
		btnRemove.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemove.addActionListener(this);
		btnRemove.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.insets = new Insets(0, 0, 0, 2);
		gbc_btnRemove.fill = GridBagConstraints.BOTH;
		gbc_btnRemove.gridx = 4;
		gbc_btnRemove.gridy = 0;
		buttonsPanel.add(btnRemove, gbc_btnRemove);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.9);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.insets = new Insets(0, 5, 5, 5);
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 1;
		add(splitPane, gbc_splitPane);

		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);

		header = new String[7];
		header[0] = "ID";
		header[1] = "Nombre";
		header[2] = "Descripci\u00f3n";
		header[3] = "Direcci\u00f3n";
		header[4] = "Provincia";
		header[5] = "\u00c1rea";
		header[6] = "Precio";

		modelTable = new DefaultTableModel(header, 0);

		tableContent = new JTable(modelTable);
		tableContent.getTableHeader().setReorderingAllowed(false);
		tableContent.setDragEnabled(false);
		tableContent.setSelectionForeground(Color.WHITE);
		tableContent.setSelectionBackground(Color.BLUE);
		tableContent.setForeground(Color.BLACK);
		tableContent.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		tableContent.setRowHeight(20);
		tableContent.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
		tableContent.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				Point p = me.getPoint();
				int row = tableContent.rowAtPoint(p);
				if (me.getClickCount() == 2) {
					verPropiedad(vectorPropiedades.get(row));
				}
			}
		});

		scrollPane.setViewportView(tableContent);

		JPanel panBottom = new JPanel();
		panBottom.setSize(new Dimension(0, 150));
		panBottom.setMinimumSize(new Dimension(10, 150));
		panBottom.setMaximumSize(new Dimension(32767, 150));
		panBottom.setPreferredSize(new Dimension(10, 150));
		panBottom.setBackground(Color.WHITE);
		splitPane.setRightComponent(panBottom);
		GridBagLayout gbl_panBottom = new GridBagLayout();
		gbl_panBottom.columnWidths = new int[] { 0, 0, 0 };
		gbl_panBottom.rowHeights = new int[] { 0, 50, 50, 0 };
		gbl_panBottom.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_panBottom.rowWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		panBottom.setLayout(gbl_panBottom);

		JPanel panelFilter = new JPanel();
		panelFilter.setOpaque(false);
		GridBagConstraints gbc_panelFilter = new GridBagConstraints();
		gbc_panelFilter.gridheight = 3;
		gbc_panelFilter.insets = new Insets(0, 0, 0, 5);
		gbc_panelFilter.fill = GridBagConstraints.BOTH;
		gbc_panelFilter.gridx = 0;
		gbc_panelFilter.gridy = 0;
		panBottom.add(panelFilter, gbc_panelFilter);
		GridBagLayout gbl_panelFilter = new GridBagLayout();
		gbl_panelFilter.columnWidths = new int[] { 10, 0, 0, 0 };
		gbl_panelFilter.rowHeights = new int[] { 10, 0, 0 };
		gbl_panelFilter.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelFilter.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelFilter.setLayout(gbl_panelFilter);

		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 10, 5);
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		panelFilter.add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.WEST;
		gbc_txtNombre.insets = new Insets(0, 0, 10, 0);
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		panelFilter.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(20);

		btnFind = new JButton("BUSCAR");
		btnFind.setIcon(new ImageIcon("icons/search-icon.png"));
		btnFind.setFocusPainted(false);
		btnFind.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFind.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnFind.addActionListener(this);
		GridBagConstraints gbc_btnFind = new GridBagConstraints();
		gbc_btnFind.fill = GridBagConstraints.BOTH;
		gbc_btnFind.insets = new Insets(0, 0, 10, 10);
		gbc_btnFind.gridx = 1;
		gbc_btnFind.gridy = 1;
		panBottom.add(btnFind, gbc_btnFind);

		btnClear = new JButton("LIMPIAR");
		btnClear.setIcon(new ImageIcon("icons/clear-icon.png"));
		btnClear.setFocusPainted(false);
		btnClear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClear.addActionListener(this);
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.fill = GridBagConstraints.BOTH;
		gbc_btnClear.insets = new Insets(0, 0, 10, 10);
		gbc_btnClear.gridx = 1;
		gbc_btnClear.gridy = 2;
		panBottom.add(btnClear, gbc_btnClear);

		// Se piden las propiedades
		loadData();
	}

	public void loadData() {
		// TODO Obtener las propiedades del servidor y cargar la tabla
		entities.xsd.Propiedad[] propiedades = Axis2Manager.getInstance().obtenerPropiedades();
		if (propiedades.length > 0) {
			this.vectorPropiedades = new Vector<entities.xsd.Propiedad>();
			modelTable.setDataVector(new String[propiedades.length][header.length], header);
			for (int i = 0; i < propiedades.length; i++) {
				this.vectorPropiedades.addElement(propiedades[i]);

				header[1] = "Nombre";
				header[2] = "Descripci\u00f3n";
				header[3] = "Direcci\u00f3n";
				header[4] = "Provincia";
				header[5] = "\u00c1rea";
				header[6] = "Precio";
				// ID
				tableContent.getModel().setValueAt(Integer.toString(propiedades[i].getId()), i, 0);
				// NOMBRE
				tableContent.getModel().setValueAt(propiedades[i].getNombre(), i, 1);
				// DESCRIPCION
				tableContent.getModel().setValueAt(propiedades[i].getDescripcion(), i, 2);
				// DIRECCION
				tableContent.getModel().setValueAt(propiedades[i].getDireccion(), i, 3);
				// PROVINCIA
				tableContent.getModel().setValueAt(propiedades[i].getProvincia().getNombre(), i, 4);
				// AREA
				tableContent.getModel().setValueAt(Double.toString(propiedades[i].getArea()), i, 5);
				// PRECIO
				tableContent.getModel().setValueAt(Double.toString(propiedades[i].getPrecio()), i, 6);
			}
			System.out.println("Se han cargado: " + this.vectorPropiedades.size() + " propiedades");
		} else {
			System.out.println("No se ha cargado ninguna propiedad");
		}

	}

	public void loadDataByName(String nombre) {
		// TODO Obtener las propiedades del servidor y cargar la tabla
		entities.xsd.Propiedad[] propiedades = Axis2Manager.getInstance().obtenerPropiedadesPorNombre(nombre);
		if (propiedades.length > 0) {
			this.vectorPropiedades = new Vector<entities.xsd.Propiedad>();
			modelTable.setDataVector(new String[propiedades.length][header.length], header);
			for (int i = 0; i < propiedades.length; i++) {
				this.vectorPropiedades.addElement(propiedades[i]);

				header[1] = "Nombre";
				header[2] = "Descripci\u00f3n";
				header[3] = "Direcci\u00f3n";
				header[4] = "Provincia";
				header[5] = "\u00c1rea";
				header[6] = "Precio";
				// ID
				tableContent.getModel().setValueAt(Integer.toString(propiedades[i].getId()), i, 0);
				// NOMBRE
				tableContent.getModel().setValueAt(propiedades[i].getNombre(), i, 1);
				// DESCRIPCION
				tableContent.getModel().setValueAt(propiedades[i].getDescripcion(), i, 2);
				// DIRECCION
				tableContent.getModel().setValueAt(propiedades[i].getDireccion(), i, 3);
				// PROVINCIA
				tableContent.getModel().setValueAt(propiedades[i].getProvincia().getNombre(), i, 4);
				// AREA
				tableContent.getModel().setValueAt(Double.toString(propiedades[i].getArea()), i, 5);
				// PRECIO
				tableContent.getModel().setValueAt(Double.toString(propiedades[i].getPrecio()), i, 6);
			}
			System.out.println("Se han cargado: " + this.vectorPropiedades.size() + " propiedades");
		} else {
			System.out.println("No se ha cargado ninguna propiedad");
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (btnImport == e.getSource()) {
			File xmlFile = FileChooser.openFile("Ficheros XML", "files/", "xml");
			if (xmlFile != null && xmlFile.exists()) {
				System.out.println(xmlFile.getAbsolutePath());
				ArrayList<entities.Propiedad> properties = JAXBManager.getInstance().importProperties(xmlFile.getAbsolutePath());
				System.out.println("Propiedades a importar: " + properties.size());
				for (entities.Propiedad p : properties) {
					// Se comprueba que la provincia sea correcta
					if (this.vectorProvincias.contains(p.getProvincia().getNombre())) {
						entities.xsd.Propiedad propiedad = JAXBManager.getInstance().parsePropiedad(p);

						if (!Axis2Manager.getInstance().existeProvinciaConNombre(propiedad.getProvincia().getNombre())) {
							Axis2Manager.getInstance().insertarProvincia(propiedad.getProvincia());
						}
						// Almacenamos en una variable la provincia existente
						// (con
						// el id que se le
						// asigna de forma autonumérica en la base de datos al
						// insertarla).
						entities.xsd.Provincia provincia = Axis2Manager.getInstance().obtenerProvinciaPorNombre(propiedad.getProvincia().getNombre());

						// Le cambiamos la provincia a la propiedad por la que
						// tiene
						// un id por estar
						// insertada en la base de datos.
						propiedad.setProvincia(provincia);

						// Insertamos la propiedad en la base de datos.
						Axis2Manager.getInstance().insertarPropiedad(propiedad);
					} else {
						JOptionPane.showMessageDialog(Window.getInstance(),
								"La propiedad del XML con el nombre: " + p.getNombre() + " contiene una provincia inexistente en España", "Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				JOptionPane.showMessageDialog(Window.getInstance(), "Las propiedades se han importado correctamente", "Información",
						JOptionPane.INFORMATION_MESSAGE);
				loadData();
			}
		} else if (btnNew == e.getSource()) {
			insertarPropiedad();
		} else if (btnEdit == e.getSource()) {
			// Editamos una propiedad a modo de prueba.
			if (tableContent.getSelectedRow() >= 0) {
				editarPropiedad(this.vectorPropiedades.get(tableContent.getSelectedRow()));
			} else {
				JOptionPane.showMessageDialog(Window.getInstance(), "Selecciona una propiedad para poder editarla", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if (btnRemove == e.getSource()) {
			if (tableContent.getSelectedRow() >= 0) {
				eliminarPropiedad(this.vectorPropiedades.get(tableContent.getSelectedRow()).getId());
			} else {
				JOptionPane.showMessageDialog(Window.getInstance(), "Selecciona una propiedad para poder editarla", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if (btnFind == e.getSource()) {
			buscarPropiedades();
		} else if (btnClear == e.getSource()) {
			txtNombre.setText("");
		}
	}

	public void insertarPropiedad() {
		final PropiedadesPanel p = new PropiedadesPanel(PropiedadesPanel.MODE_NEW, null);

		final String[] options = { "Cancelar", "Guardar" };
		final JOptionPane pane = new JOptionPane(p, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION, null, options, options[1]);
		final JDialog dialog = pane.createDialog("Nueva propiedad");
		dialog.setSize(500, 600);
		dialog.setLocationRelativeTo(Window.getInstance());
		dialog.setVisible(true);

		if (pane.getValue() == options[0]) {
			// Al pulsar cancelar cerramos el dialogo
			dialog.dispose();
		} else {
			// Al pulsar guardar
			entities.xsd.Propiedad propiedad = p.obtenerPropiedad();
			if (propiedad != null) {
				Axis2Manager.getInstance().insertarPropiedad(propiedad);
				JOptionPane.showMessageDialog(Window.getInstance(), "La propiedad se ha insertado correctamente", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
				loadData();
			}
		}
	}

	public void editarPropiedad(entities.xsd.Propiedad propiedad) {
		final PropiedadesPanel p = new PropiedadesPanel(PropiedadesPanel.MODE_EDIT, propiedad);

		final String[] options = { "Cancelar", "Guardar" };
		final JOptionPane pane = new JOptionPane(p, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION, null, options, options[1]);
		final JDialog dialog = pane.createDialog("Editar propiedad");
		dialog.setSize(500, 600);
		dialog.setLocationRelativeTo(Window.getInstance());
		dialog.setVisible(true);

		if (pane.getValue() == options[0]) {
			// Al pulsar cancelar cerramos el dialogo
			dialog.dispose();
		} else {
			// Al pulsar guardar
			entities.xsd.Propiedad prop = p.obtenerPropiedad();
			if (prop != null) {
				Axis2Manager.getInstance().editarPropiedad(prop);
				JOptionPane.showMessageDialog(Window.getInstance(), "La propiedad se ha editado correctamente", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
				loadData();
			}
		}
	}

	public void verPropiedad(entities.xsd.Propiedad propiedad) {
		final PropiedadesPanel p = new PropiedadesPanel(PropiedadesPanel.MODE_VIEW, propiedad);

		final String[] options = { "Volver" };
		final JOptionPane pane = new JOptionPane(p, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_OPTION, null, options, options[0]);
		final JDialog dialog = pane.createDialog("Ver propiedad");
		dialog.setSize(500, 600);
		dialog.setLocationRelativeTo(Window.getInstance());
		dialog.setVisible(true);

		if (pane.getValue() == options[0]) {
			// Al pulsar volver
			dialog.dispose();
		}
	}

	public void eliminarPropiedad(int id) {
		Axis2Manager.getInstance().borrarPropiedad(id);
		JOptionPane.showMessageDialog(Window.getInstance(), "La propiedad se ha eliminado correctamente", "Informacion",
				JOptionPane.INFORMATION_MESSAGE);
		loadData();
	}

	public void buscarPropiedades() {
		String nombre = txtNombre.getText().trim();
		if (nombre.isEmpty()) {
			loadData();
		} else {
			loadDataByName(nombre);
		}

	}
}