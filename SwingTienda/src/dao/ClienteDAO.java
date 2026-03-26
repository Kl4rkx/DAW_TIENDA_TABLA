package dao;

import java.sql.*;

import model.Cliente;

public class ClienteDAO {

	// CREATE
	public void addCliente(Cliente c) throws SQLException {
		// Usa "?" como marcadores de posición
		String sql = "INSERT INTO clientes VALUES (?, ?, ?, ?, ?)";

		try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, c.getId());
			ps.setString(2, c.getNombre());
			ps.setString(3, c.getDireccion());
			ps.setString(4, c.getCodPostal());
			ps.setString(5, c.getTelefono());
			ps.executeUpdate();
		}
	}
	
	

}
