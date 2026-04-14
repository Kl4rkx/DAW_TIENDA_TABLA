package controller;

import view.*;
import dao.*;
import model.*;
import java.awt.event.*;

public class Controlador implements ActionListener {

	// Ventanas y DAOs
	VentanaPrincipal vista;
	VentanaAgregarCliente clienteVista;
	ClienteDAO cDao;
	ControladorAgregarCliente clienteController;

	public Controlador(VentanaPrincipal vista) {

		this.vista = vista;
		vista.setVisible(true);

		// Inicializar el DAO y las ventanas
		cDao = new ClienteDAO();
		clienteVista = new VentanaAgregarCliente();

		// Asociar botones al ActionListener
		this.vista.btnAltaCliente.addActionListener(this);
		this.vista.btnEliminarCliente.addActionListener(this);
		this.vista.btnModificarCliente.addActionListener(this);
		this.vista.btnVisualizarClientes.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == vista.btnAltaCliente) {
			clienteController = new ControladorAgregarCliente(clienteVista, cDao);
		}
		
	}

}
