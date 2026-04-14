package controller;

import view.*;
import dao.*;
import model.*;
import java.awt.event.*;

public class ControladorAgregarCliente implements ActionListener {
	
	VentanaAgregarCliente view;
	ClienteDAO dao;

	public ControladorAgregarCliente(VentanaAgregarCliente view, ClienteDAO dao) {
		
		this.view = view;
		this.dao = dao;
		
		// Se limpia el input cada que se abre la ventana
		limpiarInput();
		view.setVisible(true);
		
		// ActionListeners de los botones
		view.btnConfirmar.addActionListener(this);
		view.btnVolver.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Botón de confirmar
		if (e.getSource() == view.btnConfirmar) {
			// Comprobar que el id no exista y luego añadir el usuario
			if (!clienteExiste(view.inputId.getText())) { // Verifica si el cliente no existe
				
			}
		}
		
		// Botón de volver
		if (e.getSource() == view.btnVolver) {
			System.out.println("Volver");
		}
		
	}
	
	public void limpiarInput() {
		view.inputId.setText("");
		view.inputNombre.setText("");
		view.inputDireccion.setText("");
		view.inputCp.setText("");
		view.inputTelefono.setText("");
	}
	
	private boolean clienteExiste(String id) {
		Cliente cliente = dao.getClienteById(id);
		
		if (cliente.getId().isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	private void addCliente() {
		Cliente cliente = new Cliente();
		view.inputId.getText();
		view.inputNombre.getText();
		view.inputDireccion.getText();
		view.inputCp.getText();
		view.inputTelefono.getText();
	}
	
}
