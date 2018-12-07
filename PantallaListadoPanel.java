package tema6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class PantallaListadoPanel extends JPanel implements ActionListener{

    private PanelManager m;

    private JLabel tituloLbl;
    private JButton edicionBtn;
    private JButton altaBtn;
    private JButton eliminarBtn;

    private JTable tablaUsuarios;
    private UsuarioTableModel modelo;
    private JScrollPane scrollPaneParaTabla;

    private BotoneraPrincipal botonesPrincipales;



    public PantallaListadoPanel(PanelManager m) {
        this.m = m;
        armarPantallaPanel();
    }

    public void armarPantallaPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        tituloLbl = new JLabel("LISTA DE USUARIOS HOME BANKING");

        botonesPrincipales = new BotoneraPrincipal(m);

        this.add(tituloLbl);
        this.add(botonesPrincipales);


        //edicionBtn.addActionListener(this);

        modelo = new UsuarioTableModel();
        tablaUsuarios = new JTable(modelo);

        scrollPaneParaTabla = new JScrollPane(tablaUsuarios);
        this.add(scrollPaneParaTabla);

        Random r = new Random();
        int x = r.nextInt(100);
        int dni = r.nextInt(1000) * r.nextInt(1000);

        Usuario u1 = new Usuario("nombre" + x, "test" + x, "mail" + x, dni);

        modelo.getFilas().add(u1);

        Usuario u2 = new Usuario("nombre" + x, "test" + x, "mail" + x, dni);

        modelo.getFilas().add(u2);

        modelo.fireTableDataChanged();

    }

    public void traerElementoSeleccionado(){
        int column = 0;
        int row = tablaUsuarios.getSelectedRow();
        String value = tablaUsuarios.getModel().getValueAt(row, column).toString();
        System.out.println(value);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	m.mostrarEdicionPanel("pep", "gomez");  	
    }
    

}
