package controller;

import view.*;
import dao.*;
import model.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class ControladorAgregarCliente implements ActionListener, KeyListener {

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
		view.inputId.addKeyListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Botón de confirmar
		if (e.getSource() == view.btnConfirmar) {
			// Verificar que los campos no estén vacios
			if (inputIsEmpty()) {
				return;
			}

			// Comprobar que el id exista
			if (clienteExiste(view.inputId.getText()) == true) { // Verifica si el cliente existe
				JOptionPane.showMessageDialog(view, "Error: El id introducido ya existe", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}

			// Si el cliente no existe se llama a la función y se añade el cliente
			if (clienteExiste(view.inputId.getText()) == false) {
				addCliente();
				JOptionPane.showMessageDialog(null, "Info: Se ha añadido el cliente correctamente.", "Info",
						JOptionPane.INFORMATION_MESSAGE);
				view.setVisible(false);
				return;
			}

		}

		// Botón de volver
		if (e.getSource() == view.btnVolver) {
			view.setVisible(false);
			return;
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

		if (cliente.getId() == null) {
			return false;
		}

		return true;

	}

	private void addCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(view.inputId.getText());
		cliente.setNombre(view.inputNombre.getText());
		cliente.setDireccion(view.inputDireccion.getText());
		cliente.setCodPostal(view.inputCp.getText());
		cliente.setTelefono(view.inputTelefono.getText());

		dao.addCliente(cliente);
	}

	private boolean inputIsEmpty() {
		if (view.inputId.getText().isEmpty() | view.inputNombre.getText().isEmpty()
				| view.inputDireccion.getText().isEmpty() | view.inputCp.getText().isEmpty()
				| view.inputTelefono.getText().isEmpty()) {
			JOptionPane.showMessageDialog(view, "Advertencia: El campo no puede estar vacío.", "Warning",
					JOptionPane.WARNING_MESSAGE);
			return true;
		}
		return false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (view.inputId.getText().length() >= 5) {
			e.consume(); // Ignora la tecla si ya hay 5 caracteres
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
