package tema6;

import java.awt.Color;

import javax.swing.*;

public class PantallaEdicionPanel extends JPanel{

    private PanelManager m;

    private JLabel tituloLbl;
    private CamposPanel camposPanel;
    private BotoneraPanel botonesPanel;


    public PantallaEdicionPanel(PanelManager m) {
        this.m = m;
        armarPantallaPanel();
    }

    public void armarPantallaPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        tituloLbl = new JLabel("EDICION");
        camposPanel = new CamposPanel(m);
        botonesPanel = new BotoneraPanel(m);
        this.add(tituloLbl);
        this.add(camposPanel);
        this.add(botonesPanel);

        //tomar valores de los campos

        //escuchar evento del ok, mandar a grabar

    }

	public PanelManager getM() {
		return m;
	}

	public void setM(PanelManager m) {
		this.m = m;
	}

	public JLabel getTituloLbl() {
		return tituloLbl;
	}

	public void setTituloLbl(JLabel tituloLbl) {
		this.tituloLbl = tituloLbl;
	}

	public CamposPanel getCamposPanel() {
		return camposPanel;
	}

	public void setCamposPanel(CamposPanel camposPanel) {
		this.camposPanel = camposPanel;
	}

	public BotoneraPanel getBotonesPanel() {
		return botonesPanel;
	}

	public void setBotonesPanel(BotoneraPanel botonesPanel) {
		this.botonesPanel = botonesPanel;
	}
    
    

}
