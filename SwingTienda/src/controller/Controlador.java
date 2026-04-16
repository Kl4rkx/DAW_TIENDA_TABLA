package controller;

import view.*;
import dao.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Controlador implements ActionListener {

	// Ventana principal y DAO
	VentanaPrincipal vista;
	ClienteDAO cDao;

	// Referencias para no abrir duplicadas
	VentanaAgregarCliente ventanaAlta;
	VentanaModificarCliente ventanaModificar;
	VentanaEliminarCliente ventanaEliminar;
	VentanaVisualizarClientes ventanaVisualizar;

	public Controlador(VentanaPrincipal vista) {

		this.vista = vista;
		vista.setVisible(true);

		// Inicializar el DAO
		cDao = new ClienteDAO();

		// Asociar botones al ActionListener
		this.vista.btnAltaCliente.addActionListener(this);
		this.vista.btnEliminarCliente.addActionListener(this);
		this.vista.btnModificarCliente.addActionListener(this);
		this.vista.btnVisualizarClientes.addActionListener(this);
		this.vista.btnSalir.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.btnAltaCliente) {
			if (activarVentanaSiYaEstaAbierta(ventanaAlta)) {
				return;
			}

			ventanaAlta = new VentanaAgregarCliente(vista);
			new ControladorAgregarCliente(ventanaAlta, cDao);
			return;
		}

		if (e.getSource() == vista.btnModificarCliente) {
			if (activarVentanaSiYaEstaAbierta(ventanaModificar)) {
				return;
			}

			ventanaModificar = new VentanaModificarCliente(vista);
			new ControladorModificarCliente(ventanaModificar, cDao);
			return;
		}

		if (e.getSource() == vista.btnEliminarCliente) {
			if (activarVentanaSiYaEstaAbierta(ventanaEliminar)) {
				return;
			}

			ventanaEliminar = new VentanaEliminarCliente(vista);
			new ControladorEliminarCliente(ventanaEliminar, cDao);
			return;
		}

		if (e.getSource() == vista.btnVisualizarClientes) {
			if (activarVentanaSiYaEstaAbierta(ventanaVisualizar)) {
				return;
			}

			ventanaVisualizar = new VentanaVisualizarClientes(vista);
			new ControladorVisualizarClientes(ventanaVisualizar, cDao);
			return;
		}

		if (e.getSource() == vista.btnSalir) {
			System.exit(0);
		}

	}

	private boolean activarVentanaSiYaEstaAbierta(JFrame ventana) {
		if (ventana != null && ventana.isDisplayable() && ventana.isVisible()) {
			ventana.toFront();
			ventana.requestFocus();
			return true;
		}

		// El displayable es para saber si la ventana ya existe pero no se ha cerrado,
		// si no se ha cerrado pero no es visible, la cerramos para evitar que quede una
		// ventana invisible abierta
		if (ventana != null && ventana.isDisplayable() && !ventana.isVisible()) {
			ventana.dispose();
		}

		return false;
	}

}
