package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * Ventana principal de la aplicación de Gestión de Clientes.
 * <p>
 * Proporciona acceso a las operaciones CRUD sobre clientes: dar de alta,
 * modificar, eliminar y visualizar todos los clientes.
 * </p>
 *
 * @author SwingTienda
 * @version 1.0
 */
public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	// Colores
	/** Color corporativo principal (azul oscuro). */
	private static final Color COLOR_CORPORATIVO = new Color(25, 55, 109);
	/** Color de fondo general de la ventana. */
	private static final Color COLOR_FONDO = new Color(240, 243, 247);
	/** Color de texto claro sobre fondos oscuros. */
	private static final Color COLOR_TEXTO_CLARO = Color.WHITE;
	/** Color de fondo de los botones principales. */
	private static final Color COLOR_BOTON = new Color(41, 98, 168);
	/** Color de la barra de estado. */
	private static final Color COLOR_BARRA_ESTADO = new Color(220, 225, 230);
	/** Color del borde sutil de los botones. */
	private static final Color COLOR_BORDE_BOTON = new Color(30, 75, 135);

	// Tamaños
	/** Anchura mínima de la ventana en píxeles. */
	private static final int ANCHO_VENTANA = 650;
	/** Altura mínima de la ventana en píxeles. */
	private static final int ALTO_VENTANA = 450;
	/** Anchura preferida de los botones principales. */
	private static final int ANCHO_BOTON = 200;
	/** Altura preferida de los botones principales. */
	private static final int ALTO_BOTON = 55;
	/** Margen interno (padding) de los botones. */
	private static final int PADDING_BOTON = 10;

	// Fuentes
	/** Fuente para el título de la cabecera. */
	private static final Font FUENTE_TITULO = new Font("Segoe UI", Font.BOLD, 18);
	/** Fuente para los botones principales. */
	private static final Font FUENTE_BOTON = new Font("Segoe UI", Font.PLAIN, 13);
	/** Fuente para la barra de estado. */
	private static final Font FUENTE_ESTADO = new Font("Segoe UI", Font.PLAIN, 11);

	// Componentes de la interfaz
	private JPanel contentPane;
	private JPanel pnlCabecera;
	private JPanel pnlBotones;
	private JPanel pnlEstado;
	private JLabel lblTitulo;
	private JLabel lblEstado;
	public JButton btnAltaCliente;
	public JButton btnModificarCliente;
	public JButton btnEliminarCliente;
	public JButton btnVisualizarClientes;

	// Constructor

	/**
	 * Crea la ventana principal e inicializa todos los componentes de la interfaz.
	 */
	public VentanaPrincipal() {
		setTitle("Gestión de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(ANCHO_VENTANA, ALTO_VENTANA));
		setBounds(100, 100, ANCHO_VENTANA, ALTO_VENTANA);
		setLocationRelativeTo(null);
		setResizable(true);

		// ── Panel de contenido principal ──
		contentPane = new JPanel();
		contentPane.setName("contentPane");
		contentPane.setBackground(COLOR_FONDO);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// ── Panel superior (cabecera) ──
		pnlCabecera = new JPanel();
		pnlCabecera.setName("pnlCabecera");
		pnlCabecera.setBackground(COLOR_CORPORATIVO);
		pnlCabecera.setLayout(new BorderLayout(0, 0));
		pnlCabecera.setBorder(new EmptyBorder(15, 20, 15, 20));
		pnlCabecera.setPreferredSize(new Dimension(0, 60));
		contentPane.add(pnlCabecera, BorderLayout.NORTH);

		lblTitulo = new JLabel("Gestión de Clientes");
		lblTitulo.setName("lblTitulo");
		lblTitulo.setFont(FUENTE_TITULO);
		lblTitulo.setForeground(COLOR_TEXTO_CLARO);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCabecera.add(lblTitulo, BorderLayout.CENTER);

		// ── Panel central (botones) ──
		pnlBotones = new JPanel();
		pnlBotones.setName("pnlBotones");
		pnlBotones.setBackground(COLOR_FONDO);
		pnlBotones.setBorder(new EmptyBorder(30, 40, 30, 40));

		GridBagLayout gblPnlBotones = new GridBagLayout();
		gblPnlBotones.columnWidths = new int[] { 0, 0 };
		gblPnlBotones.rowHeights = new int[] { 0, 0 };
		gblPnlBotones.columnWeights = new double[] { 1.0, 1.0 };
		gblPnlBotones.rowWeights = new double[] { 1.0, 1.0 };
		pnlBotones.setLayout(gblPnlBotones);
		contentPane.add(pnlBotones, BorderLayout.CENTER);

		// ── Botón: Dar de alta un cliente ──
		btnAltaCliente = new JButton("Dar de alta un cliente");
		btnAltaCliente.setName("btnAltaCliente");
		btnAltaCliente.setFont(FUENTE_BOTON);
		btnAltaCliente.setForeground(new Color(255, 255, 255));
		btnAltaCliente.setBackground(new Color(17, 100, 162));
		btnAltaCliente.setToolTipText("Dar de alta un nuevo cliente en el sistema (Alt+A)");
		btnAltaCliente.setMnemonic('A');
		btnAltaCliente.setFocusPainted(false);
		btnAltaCliente.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAltaCliente.setPreferredSize(new Dimension(ANCHO_BOTON, ALTO_BOTON));
		btnAltaCliente.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(COLOR_BORDE_BOTON, 1, true), new EmptyBorder(8, 16, 8, 16)));

		GridBagConstraints gbcBtnAlta = new GridBagConstraints();
		gbcBtnAlta.insets = new Insets(PADDING_BOTON, PADDING_BOTON, PADDING_BOTON, PADDING_BOTON);
		gbcBtnAlta.fill = GridBagConstraints.BOTH;
		gbcBtnAlta.gridx = 0;
		gbcBtnAlta.gridy = 0;
		pnlBotones.add(btnAltaCliente, gbcBtnAlta);

		// ── Botón: Modificar cliente ──
		btnModificarCliente = new JButton("Modificar cliente");
		btnModificarCliente.setName("btnModificarCliente");
		btnModificarCliente.setFont(FUENTE_BOTON);
		btnModificarCliente.setForeground(new Color(255, 255, 255));
		btnModificarCliente.setBackground(COLOR_BOTON);
		btnModificarCliente.setToolTipText("Modificar los datos de un cliente existente (Alt+M)");
		btnModificarCliente.setMnemonic('M');
		btnModificarCliente.setFocusPainted(false);
		btnModificarCliente.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnModificarCliente.setPreferredSize(new Dimension(ANCHO_BOTON, ALTO_BOTON));
		btnModificarCliente.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(COLOR_BORDE_BOTON, 1, true), new EmptyBorder(8, 16, 8, 16)));

		GridBagConstraints gbcBtnModificar = new GridBagConstraints();
		gbcBtnModificar.insets = new Insets(PADDING_BOTON, PADDING_BOTON, PADDING_BOTON, PADDING_BOTON);
		gbcBtnModificar.fill = GridBagConstraints.BOTH;
		gbcBtnModificar.gridx = 1;
		gbcBtnModificar.gridy = 0;
		pnlBotones.add(btnModificarCliente, gbcBtnModificar);

		// ── Botón: Eliminar cliente ──
		btnEliminarCliente = new JButton("Eliminar cliente");
		btnEliminarCliente.setName("btnEliminarCliente");
		btnEliminarCliente.setFont(FUENTE_BOTON);
		btnEliminarCliente.setForeground(new Color(255, 255, 255));
		btnEliminarCliente.setBackground(COLOR_BOTON);
		btnEliminarCliente.setToolTipText("Eliminar un cliente del sistema (Alt+E)");
		btnEliminarCliente.setMnemonic('E');
		btnEliminarCliente.setFocusPainted(false);
		btnEliminarCliente.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEliminarCliente.setPreferredSize(new Dimension(ANCHO_BOTON, ALTO_BOTON));
		btnEliminarCliente.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(COLOR_BORDE_BOTON, 1, true), new EmptyBorder(8, 16, 8, 16)));

		GridBagConstraints gbcBtnEliminar = new GridBagConstraints();
		gbcBtnEliminar.insets = new Insets(PADDING_BOTON, PADDING_BOTON, PADDING_BOTON, PADDING_BOTON);
		gbcBtnEliminar.fill = GridBagConstraints.BOTH;
		gbcBtnEliminar.gridx = 0;
		gbcBtnEliminar.gridy = 1;
		pnlBotones.add(btnEliminarCliente, gbcBtnEliminar);

		// ── Botón: Visualizar todos los clientes ──
		btnVisualizarClientes = new JButton("Visualizar todos los clientes");
		btnVisualizarClientes.setName("btnVisualizarClientes");
		btnVisualizarClientes.setFont(FUENTE_BOTON);
		btnVisualizarClientes.setForeground(new Color(255, 255, 255));
		btnVisualizarClientes.setBackground(COLOR_BOTON);
		btnVisualizarClientes.setToolTipText("Mostrar un listado con todos los clientes registrados (Alt+V)");
		btnVisualizarClientes.setMnemonic('V');
		btnVisualizarClientes.setFocusPainted(false);
		btnVisualizarClientes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVisualizarClientes.setPreferredSize(new Dimension(ANCHO_BOTON, ALTO_BOTON));
		btnVisualizarClientes.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(COLOR_BORDE_BOTON, 1, true), new EmptyBorder(8, 16, 8, 16)));

		GridBagConstraints gbcBtnVisualizar = new GridBagConstraints();
		gbcBtnVisualizar.insets = new Insets(PADDING_BOTON, PADDING_BOTON, PADDING_BOTON, PADDING_BOTON);
		gbcBtnVisualizar.fill = GridBagConstraints.BOTH;
		gbcBtnVisualizar.gridx = 1;
		gbcBtnVisualizar.gridy = 1;
		pnlBotones.add(btnVisualizarClientes, gbcBtnVisualizar);

		// ── Panel inferior (barra de estado) ──
		pnlEstado = new JPanel();
		pnlEstado.setName("pnlEstado");
		pnlEstado.setBackground(COLOR_BARRA_ESTADO);
		pnlEstado.setLayout(new BorderLayout(0, 0));
		pnlEstado.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(200, 205, 210)), new EmptyBorder(6, 15, 6, 15)));
		pnlEstado.setPreferredSize(new Dimension(0, 30));
		contentPane.add(pnlEstado, BorderLayout.SOUTH);

		lblEstado = new JLabel("Preparado - Seleccione una opción del menú");
		lblEstado.setName("lblEstado");
		lblEstado.setFont(FUENTE_ESTADO);
		lblEstado.setForeground(new Color(100, 110, 120));
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		pnlEstado.add(lblEstado, BorderLayout.CENTER);
	}

}