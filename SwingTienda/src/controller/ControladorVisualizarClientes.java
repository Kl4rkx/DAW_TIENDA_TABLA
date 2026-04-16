package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import dao.ClienteDAO;
import model.Cliente;
import view.VentanaVisualizarClientes;

public class ControladorVisualizarClientes implements ActionListener {

	VentanaVisualizarClientes view;
	ClienteDAO dao;

	public ControladorVisualizarClientes(VentanaVisualizarClientes view, ClienteDAO dao) {
		this.view = view;
		this.dao = dao;

		cargarTablaClientes();
		view.btnVolver.addActionListener(this);
		view.setVisible(true);
	}

	private void cargarTablaClientes() {
		view.modeloTabla.setRowCount(0);
		ArrayList<Cliente> listaClientes = dao.getClientes();

		for (Cliente c : listaClientes) {
			Object[] fila = { c.getId(), c.getNombre(), c.getDireccion(), c.getCodPostal(), c.getTelefono() };
			view.modeloTabla.addRow(fila);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.btnVolver) {
			view.setVisible(false);
		}
	}
}
