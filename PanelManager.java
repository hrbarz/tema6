package tema6;

import javax.swing.*;

public class PanelManager {

	private JFrame frame;
	private PantallaAltaPanel pantallaAltaPanel;
	protected PantallaListadoPanel pantallaListadoPanel;
	private PantallaEdicionPanel pantallaEdicionPanel;

	public PanelManager() {
		// TODO Auto-generated constructor stub
	}

	public void armarManager() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);

		pantallaAltaPanel = new PantallaAltaPanel(this);
		pantallaListadoPanel = new PantallaListadoPanel(this);
		pantallaEdicionPanel = new PantallaEdicionPanel(this);
	}

	public void showFrame() {
		frame.setVisible(true);
	}

	public void mostrarUnPanel() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(pantallaListadoPanel);
		frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
		frame.getContentPane().repaint();//RE-pinto los elementos dispuestos en el paso anterior
		
	}

	public void mostrarListadoPanel() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(pantallaListadoPanel);
		frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
		frame.getContentPane().repaint();//RE-pinto los elementos dispuestos en el paso anterior
		
	}
	
	public void mostrarEdicionPanel(String nombre, String apellido) {
		frame.getContentPane().removeAll();
		pantallaEdicionPanel.getCamposPanel().getApellidoTxt().setText(apellido);
		pantallaEdicionPanel.getCamposPanel().getNombreTxt().setText(nombre);
		frame.getContentPane().add(pantallaEdicionPanel);
		frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
		frame.getContentPane().repaint();//RE-pinto los elementos dispuestos en el paso anterior
		
	}

}
