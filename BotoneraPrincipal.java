package tema6;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BotoneraPrincipal extends JPanel {

    private PanelManager m;

    public BotoneraPrincipal(PanelManager m) {
        this.m = m;
        armarBotoneraPanel();
    }

    public void armarBotoneraPanel() {
        this.setAlignmentX( Component.LEFT_ALIGNMENT );

        JButton altaBtn = new JButton("CREAR USUARIO");
        JButton edicionBtn = new JButton("EDITAR USUARIO");
        JButton eliminarBtn = new JButton("ELIMINAR USUARIO");

        this.add(altaBtn);
        this.add(edicionBtn);
        this.add(eliminarBtn);

        altaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.mostrarEdicionPanel("pep", "gomez");
            }
        });

        edicionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.pantallaListadoPanel.traerElementoSeleccionado();
            }
        });
    }

}
