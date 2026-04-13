package view;

import controller.Controlador;

public class Main {
	
	private static VentanaPrincipal view;
	public static void main(String[] args) {
		// Inicializar el controlador y la ventana principal
		view = new VentanaPrincipal();
		new Controlador(view);
	}

}
