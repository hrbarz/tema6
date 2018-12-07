package tema6;

public class ClasePrincipal {
	
	private PanelManager manager;

	public static void main(String[] args) {
		
		ClasePrincipal ppal = new ClasePrincipal();
		ppal.iniciarManager();
		ppal.showFrame();
	}
		
	public void iniciarManager() {
		manager = new PanelManager();
		manager.armarManager();

		manager.mostrarUnPanel();
	}
	
	public void showFrame() {
		manager.showFrame();
	}
	
}
