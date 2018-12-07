package tema6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BotoneraPanel extends JPanel {

	private PanelManager m;

	public BotoneraPanel(PanelManager m) {
		this.m = m;
		armarBotoneraPanel();
	}
	
	public void armarBotoneraPanel() {
		JButton okBtn = new JButton("Guardar cambios");
		JButton cancelBtn = new JButton("Volver a listado");

		this.add(okBtn);
		this.add(cancelBtn);

		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m.mostrarListadoPanel();
			}
		});

		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m.mostrarListadoPanel();
			}
		});
	}

}
