package views.lists;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import utilitiies.FileChooser;

public class PropiedadesListPanel extends JPanel implements ActionListener {

	private static final long	serialVersionUID	= 5253268925767443459L;
	private JTable				tableContent;

	private JButton				btnImport;
	private JButton				btnNew;
	private JButton				btnEdit;

	private JButton				btnFind;
	private JButton				btnClear;
	private JButton				btnRemove;

	public PropiedadesListPanel() {

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

		btnNew = new JButton("Añadir");
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

		TableModel tableModel = new DefaultTableModel(new String[] { "ID", "Nombre", "Descripción", "Dirección", "Municipio", "Área", "Precio" }, 6);

		tableContent = new JTable(tableModel);
		tableContent.getTableHeader().setReorderingAllowed(false);
		tableContent.setDragEnabled(false);
		tableContent.setSelectionForeground(Color.WHITE);
		tableContent.setSelectionBackground(Color.BLUE);
		tableContent.setForeground(Color.BLACK);
		tableContent.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		tableContent.setRowHeight(20);
		tableContent.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));

		scrollPane.setViewportView(tableContent);

		JPanel panBottom = new JPanel();
		panBottom.setSize(new Dimension(0, 200));
		panBottom.setMinimumSize(new Dimension(10, 150));
		panBottom.setMaximumSize(new Dimension(32767, 250));
		panBottom.setPreferredSize(new Dimension(10, 200));
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
	}

	public void loadData() {

	}

	public void actionPerformed(ActionEvent e) {
		if (btnImport == e.getSource()) {
			File xmlFile = FileChooser.openFile("Ficheros XML", "xml");
			if (xmlFile != null && xmlFile.exists()) {
				System.out.println(xmlFile.getAbsolutePath());
			}
		} else if (btnNew == e.getSource()) {

		} else if (btnEdit == e.getSource()) {

		} else if (btnRemove == e.getSource()) {

		} else if (btnFind == e.getSource()) {

		} else if (btnClear == e.getSource()) {

		}
	}
}