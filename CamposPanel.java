package tema6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CamposPanel extends JPanel {
	
	private PanelManager m;
	
	private JLabel nombreLbl;
	private JLabel apellidoLbl;
	private JTextField nombreTxt;
	private JTextField apellidoTxt;

	public CamposPanel(PanelManager m) {
		this.m = m;
		armarFormulario();
	}
	
	public void armarFormulario() {
		this.setLayout(new GridLayout(2,2));
		JButton j = new JButton("hola");

		nombreLbl = new JLabel("Nombre:");
		apellidoLbl = new JLabel("Apellido:");

		nombreTxt = new JTextField("");
		apellidoTxt = new JTextField("");

		this.add(nombreLbl);
		this.add(nombreTxt);
		this.add(apellidoLbl);
		this.add(apellidoTxt);
		
		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//String nombre = this.nombreTxt().getText();
				//String apellido = this.apellidoTxt().getText();
			}

		});


	}

	public PanelManager getM() {
		return m;
	}

	public void setM(PanelManager m) {
		this.m = m;
	}

	public JLabel getNombreLbl() {
		return nombreLbl;
	}

	public void setNombreLbl(JLabel nombreLbl) {
		this.nombreLbl = nombreLbl;
	}

	public JLabel getApellidoLbl() {
		return apellidoLbl;
	}

	public void setApellidoLbl(JLabel apellidoLbl) {
		this.apellidoLbl = apellidoLbl;
	}

	public JTextField getNombreTxt() {
		return nombreTxt;
	}

	public void setNombreTxt(JTextField nombreTxt) {
		this.nombreTxt = nombreTxt;
	}

	public JTextField getApellidoTxt() {
		return apellidoTxt;
	}

	public void setApellidoTxt(JTextField apellidoTxt) {
		this.apellidoTxt = apellidoTxt;
	}
	
	

}
