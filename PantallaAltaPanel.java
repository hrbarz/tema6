package tema6;

import java.awt.Color;

import javax.swing.*;

public class PantallaAltaPanel extends JPanel{

    private PanelManager m;

    private JLabel tituloLbl;
    private CamposPanel camposPanel;
    private BotoneraPanel botonesPanel;


    public PantallaAltaPanel(PanelManager m) {
        this.m = m;
        armarPantallaPanel();
    }

    public void armarPantallaPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        tituloLbl = new JLabel("ALTA");
        camposPanel = new CamposPanel(m);
        botonesPanel = new BotoneraPanel(m);
        this.add(tituloLbl);
        this.add(camposPanel);
        this.add(botonesPanel);

        //tomar valores de los campos

        //escuchar evento del ok, mandar a grabar

    }

}
