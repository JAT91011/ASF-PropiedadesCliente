package views;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import controllers.Controller;

public class StartPanel extends JPanel {

	private static final long	serialVersionUID	= -1527615628965557447L;

	private Controller			controller;

	public StartPanel() {

		controller = new Controller();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 360, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 40, 40, 40, 30, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
	}
}