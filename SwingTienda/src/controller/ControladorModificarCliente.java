package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.ClienteDAO;
import model.Cliente;
import view.VentanaModificarCliente;

public class ControladorModificarCliente implements ActionListener {

	VentanaModificarCliente view;
	ClienteDAO dao;
	Cliente clienteActual;

	public ControladorModificarCliente(VentanaModificarCliente view, ClienteDAO dao) {
		this.view = view;
		this.dao = dao;

		limpiarInput();
		bloquearCamposEdicion();

		view.btnBuscar.addActionListener(this);
		view.btnModificar.addActionListener(this);
		view.btnVolver.addActionListener(this);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.btnBuscar) {
			buscarCliente();
			return;
		}

		if (e.getSource() == view.btnModificar) {
			modificarCliente();
			return;
		}

		if (e.getSource() == view.btnVolver) {
			view.setVisible(false);
		}
	}

	private void buscarCliente() {
		String id = view.inputBuscarId.getText();

		if (id.isEmpty()) {
			JOptionPane.showMessageDialog(view, "Advertencia: Introduce un ID para buscar.", "Warning",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		clienteActual = dao.getClienteById(id);

		if (clienteActual.getId() == null) {
			JOptionPane.showMessageDialog(view, "Error: No existe un cliente con ese ID.", "Error",
					JOptionPane.ERROR_MESSAGE);
			bloquearCamposEdicion();
			return;
		}

		view.inputNombre.setText(clienteActual.getNombre());
		view.inputDireccion.setText(clienteActual.getDireccion());
		view.inputCp.setText(clienteActual.getCodPostal());
		view.inputTelefono.setText(clienteActual.getTelefono());
		desbloquearCamposEdicion();
	}

	private void modificarCliente() {
		if (clienteActual == null || clienteActual.getId() == null) {
			JOptionPane.showMessageDialog(view, "Advertencia: Primero busca un cliente.", "Warning",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		if (camposVacios()) {
			JOptionPane.showMessageDialog(view, "Advertencia: Ningun campo puede estar vacio.", "Warning",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		Cliente clienteModificado = new Cliente();
		clienteModificado.setId(clienteActual.getId());
		clienteModificado.setNombre(view.inputNombre.getText());
		clienteModificado.setDireccion(view.inputDireccion.getText());
		clienteModificado.setCodPostal(view.inputCp.getText());
		clienteModificado.setTelefono(view.inputTelefono.getText());

		if (dao.updateCliente(clienteModificado)) {
			JOptionPane.showMessageDialog(view, "Info: Cliente modificado correctamente.", "Info",
					JOptionPane.INFORMATION_MESSAGE);
			view.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(view, "Error: No se pudo modificar el cliente.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private boolean camposVacios() {
		return view.inputNombre.getText().isEmpty() || view.inputDireccion.getText().isEmpty()
				|| view.inputCp.getText().isEmpty() || view.inputTelefono.getText().isEmpty();
	}

	private void limpiarInput() {
		view.inputBuscarId.setText("");
		view.inputNombre.setText("");
		view.inputDireccion.setText("");
		view.inputCp.setText("");
		view.inputTelefono.setText("");
	}

	private void bloquearCamposEdicion() {
		view.inputNombre.setEnabled(false);
		view.inputDireccion.setEnabled(false);
		view.inputCp.setEnabled(false);
		view.inputTelefono.setEnabled(false);
		view.btnModificar.setEnabled(false);
	}

	private void desbloquearCamposEdicion() {
		view.inputNombre.setEnabled(true);
		view.inputDireccion.setEnabled(true);
		view.inputCp.setEnabled(true);
		view.inputTelefono.setEnabled(true);
		view.btnModificar.setEnabled(true);
	}
}
