package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class VentanaVisualizarClientes extends JFrame {

	private static final Color COLOR_FONDO = new Color(245, 247, 250);
	private static final Color COLOR_CABECERA = new Color(25, 55, 109);
	private static final Color COLOR_BOTON_SECUNDARIO = new Color(108, 117, 125);
	private static final Font FUENTE_TITULO = new Font("Segoe UI", Font.BOLD, 28);
	private static final Font FUENTE_TABLA = new Font("Segoe UI", Font.PLAIN, 19);
	private static final Font FUENTE_TABLA_CABECERA = new Font("Segoe UI", Font.BOLD, 19);
	private static final Font FUENTE_BOTON = new Font("Segoe UI", Font.BOLD, 20);

	private JLabel txtTitulo = new JLabel("Listado de clientes");
	private JPanel panelSur = new JPanel();
	public JButton btnVolver = new JButton("Volver");

	public DefaultTableModel modeloTabla;
	public JTable tablaClientes;

	public VentanaVisualizarClientes(JFrame padre) {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaVisualizarClientes.class.getResource("/assets/icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setTitle("Visualizar clientes - Tienda");
		setSize(980, 680);
		setLocationRelativeTo(padre);

		getContentPane().setBackground(COLOR_FONDO);
		getContentPane().setLayout(new BorderLayout());

		txtTitulo.setBorder(new EmptyBorder(24, 0, 24, 0));
		txtTitulo.setOpaque(true);
		txtTitulo.setBackground(COLOR_CABECERA);
		txtTitulo.setForeground(Color.WHITE);
		txtTitulo.setFont(FUENTE_TITULO);
		txtTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(txtTitulo, BorderLayout.NORTH);

		modeloTabla = new DefaultTableModel(new String[] { "ID", "Nombre", "Direccion", "Codigo Postal", "Telefono" },
				0) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tablaClientes = new JTable(modeloTabla);
		tablaClientes.setFont(FUENTE_TABLA);
		tablaClientes.setRowHeight(34);
		tablaClientes.getTableHeader().setFont(FUENTE_TABLA_CABECERA);
		JScrollPane scrollPane = new JScrollPane(tablaClientes);
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		panelSur.setBackground(COLOR_FONDO);
		panelSur.setBorder(new EmptyBorder(14, 14, 14, 14));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(COLOR_BOTON_SECUNDARIO);
		btnVolver.setBorder(null);
		btnVolver.setFont(FUENTE_BOTON);
		btnVolver.setPreferredSize(new Dimension(200, 58));
		panelSur.add(btnVolver);
		getContentPane().add(panelSur, BorderLayout.SOUTH);
	}

	public VentanaVisualizarClientes() {
		this((JFrame) null);
	}
}
