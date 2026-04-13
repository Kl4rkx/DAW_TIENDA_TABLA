package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.*;
import view.*;

public class Controlador implements ActionListener {

	// Ventanas y DAOs
	VentanaPrincipal vista;
	ClienteDAO cDao;

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

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == vista.btnAltaCliente) {
			
		}
		
	}

}
