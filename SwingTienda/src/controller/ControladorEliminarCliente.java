package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.ClienteDAO;
import model.Cliente;
import view.VentanaEliminarCliente;

public class ControladorEliminarCliente implements ActionListener {

	VentanaEliminarCliente view;
	ClienteDAO dao;

	public ControladorEliminarCliente(VentanaEliminarCliente view, ClienteDAO dao) {
		this.view = view;
		this.dao = dao;

		view.inputBuscarId.setText("");
		view.btnBuscar.addActionListener(this);
		view.btnVolver.addActionListener(this);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.btnBuscar) {
			eliminarCliente();
			return;
		}

		if (e.getSource() == view.btnVolver) {
			view.setVisible(false);
		}
	}

	private void eliminarCliente() {
		String id = view.inputBuscarId.getText();

		if (id.isEmpty()) {
			JOptionPane.showMessageDialog(view, "Advertencia: Introduce un ID.", "Warning",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		Cliente cliente = dao.getClienteById(id);

		if (cliente.getId() == null) {
			JOptionPane.showMessageDialog(view, "Error: El cliente no existe.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		int opcion = JOptionPane.showConfirmDialog(view,
				"Se va a eliminar el cliente " + cliente.getNombre() + " (" + cliente.getId() + ").\nDeseas continuar?",
				"Confirmar eliminacion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		if (opcion == JOptionPane.YES_OPTION) {
			if (dao.deleteClienteById(id)) {
				JOptionPane.showMessageDialog(view, "Info: Cliente eliminado correctamente.", "Info",
						JOptionPane.INFORMATION_MESSAGE);
				view.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(view, "Error: No se pudo eliminar el cliente.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
