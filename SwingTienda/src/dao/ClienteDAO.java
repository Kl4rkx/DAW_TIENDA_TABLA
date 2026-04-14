package dao;

import java.sql.*;
import java.util.ArrayList;

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

	public ArrayList<Cliente> getClientes() throws SQLException {
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		String consulta = "SELECT * FROM clientes;";

		try (Connection con = DbConnection.getConnection();
				Statement st = con.createStatement();
				ResultSet resultSet = st.executeQuery(consulta)) {

			while (resultSet.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(resultSet.getString("id"));
				cliente.setNombre(resultSet.getString("nombre"));
				cliente.setDireccion(resultSet.getString("direccion"));
				cliente.setCodPostal(resultSet.getString("codPostal"));
				cliente.setTelefono(resultSet.getString("telefono"));
				listaClientes.add(cliente);
			}

		} catch (SQLException e) {
			System.err.println("Error en el método getCliente: " + e.getMessage());
		}

		return listaClientes;
	}

	public Cliente getClienteById(String id) {
		Cliente cliente = new Cliente();
		String sql = "SELECT * FROM clientes WHERE id = ?";

		try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, id);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					cliente.setId(rs.getString("id"));
					cliente.setNombre(rs.getString("nombre"));
					cliente.setDireccion(rs.getString("direccion"));
					cliente.setCodPostal(rs.getString("codPostal"));
					cliente.setTelefono(rs.getString("telefono"));
				}
			}

		} catch (SQLException e) {
			System.err.println("Error en el método getClienteById: " + e.getMessage());
		}

		return cliente;
	}
	

}
