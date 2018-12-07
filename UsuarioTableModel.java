package tema6;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    /**
     * INDICES DE MIS COLUMNAS
     */
    private static final int COLUMNA_LOGIN = 0;
    private static final int COLUMNA_NOMBRE = 1;
    private static final int COLUMNA_EMAIL = 2;
    private static final int COLUMNA_DNI = 3;

    /**
     * NOMBRES DE LOS ENCABEZADOS
     */
    private String[] nombresColumnas = {"Login", "Nombre", "Email", "DNI"};
    /**
     * TIPOS DE CADA COLUMNA (EN EL MISMO ORDEN DE LOS ENCABEZADOS)
     */
    private Class[] tiposColumnas = {String.class, String.class, String.class, Integer.class};


    /**
     * CONTENIDO DEL MODELO
     */
    private List<Usuario> filas;

    /**
     * CONSTRUCTOR VACIO
     */
    public UsuarioTableModel() {
        filas = new ArrayList<Usuario>();
    }

    /**
     * CONSTRUCTOR CON CONTENIDO INICIAL
     * @param contenidoInicial
     */
    public UsuarioTableModel(List<Usuario> contenidoInicial) {
        filas = contenidoInicial;
    }

    /**
     * METODO QUE HAY QUE PISAR
     */
    public int getColumnCount() {
        return nombresColumnas.length;
    }

    /**
     * OTRO METODO QUE HAY QUE PISAR
     */
    public int getRowCount() {
        return filas.size();
    }


    /**
     * METODO QUE HAY QUE PISAR
     */
    public Object getValueAt(int rowIndex, int columnIndex) {

        Usuario u = filas.get(rowIndex);

        Object result = null;
        switch(columnIndex) {
            case COLUMNA_LOGIN:
                result = u.getUsername();
                break;
            case COLUMNA_NOMBRE:
                result = u.getNombre();
                break;
            case COLUMNA_EMAIL:
                result = u.getEmail();
                break;
            case COLUMNA_DNI:
                result = u.getDni();
                break;
            default:
                result = new String("");
        }

        return result;
    }

    /**
     * METODO QUE HAY QUE PISAR
     */
    public String getColumnName(int col) {
        return nombresColumnas[col];
    }

    /**
     * METODO QUE HAY QUE PISAR
     */
    public Class getColumnClass(int col) {
        return tiposColumnas[col];
    }




    /**
     * GETTER DE MIS FILAS
     * @return
     */
    public List<Usuario> getFilas() {
        return filas;
    }
    /**
     * SETTER DE MIS FILAS
     *
     * @param filas
     */
    public void setFilas(List<Usuario> filas) {
        this.filas = filas;
    }
}
