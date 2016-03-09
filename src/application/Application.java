package application;

import java.awt.EventQueue;

import javax.swing.UIManager;

import views.Window;
import views.lists.PropiedadesListPanel;

public class Application {

	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					Window.getInstance().getSlider().addComponent(new PropiedadesListPanel());
					Window.getInstance().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}