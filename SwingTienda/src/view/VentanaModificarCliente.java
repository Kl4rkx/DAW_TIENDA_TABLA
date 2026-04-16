package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class VentanaModificarCliente extends JFrame {

	private static final Color COLOR_FONDO = new Color(245, 247, 250);
	private static final Color COLOR_CABECERA = new Color(25, 55, 109);
	private static final Color COLOR_TEXTO = new Color(33, 37, 41);
	private static final Color COLOR_CAMPO = Color.WHITE;
	private static final Color COLOR_BORDE_CAMPO = new Color(186, 196, 209);
	private static final Color COLOR_BOTON_PRINCIPAL = new Color(41, 98, 168);
	private static final Color COLOR_BOTON_SECUNDARIO = new Color(108, 117, 125);
	private static final Font FUENTE_TITULO = new Font("Segoe UI", Font.BOLD, 28);
	private static final Font FUENTE_LABEL = new Font("Segoe UI", Font.BOLD, 20);
	private static final Font FUENTE_INPUT = new Font("Segoe UI", Font.PLAIN, 20);
	private static final Font FUENTE_BOTON = new Font("Segoe UI", Font.BOLD, 20);

	private JLabel txtTitulo = new JLabel("Modificar cliente");
	private JPanel panelPrincipal = new JPanel();

	private JLabel txtBuscarId = new JLabel("ID a buscar");
	public JTextField inputBuscarId = new JTextField();
	public JButton btnBuscar = new JButton("Buscar");

	private JLabel txtNombre = new JLabel("Nombre");
	public JTextField inputNombre = new JTextField();
	private JLabel txtDireccion = new JLabel("Direccion");
	public JTextField inputDireccion = new JTextField();
	private JLabel txtCp = new JLabel("Codigo postal");
	public JTextField inputCp = new JTextField();
	private JLabel txtTelefono = new JLabel("Telefono");
	public JTextField inputTelefono = new JTextField();

	public JButton btnVolver = new JButton("Volver");
	public JButton btnModificar = new JButton("Modificar");

	private JSeparator sp1 = new JSeparator();
	private JSeparator sp2 = new JSeparator();
	private JSeparator sp3 = new JSeparator();
	private JSeparator sp4 = new JSeparator();
	private JSeparator sp5 = new JSeparator();
	private JSeparator sp6 = new JSeparator();
	private JSeparator sp7 = new JSeparator();
	private JSeparator sp8 = new JSeparator();
	private JSeparator sp9 = new JSeparator();
	private JSeparator sp10 = new JSeparator();

	public VentanaModificarCliente(JFrame padre) {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaModificarCliente.class.getResource("/assets/icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setTitle("Modificar cliente - Tienda");
		setSize(860, 660);
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

		panelPrincipal.setBackground(COLOR_FONDO);
		panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));
		panelPrincipal.setLayout(new GridLayout(0, 2, 0, 0));
		getContentPane().add(panelPrincipal, BorderLayout.CENTER);

		configurarCampo(inputBuscarId);
		configurarCampo(inputNombre);
		configurarCampo(inputDireccion);
		configurarCampo(inputCp);
		configurarCampo(inputTelefono);

		configurarLabel(txtBuscarId);
		configurarLabel(txtNombre);
		configurarLabel(txtDireccion);
		configurarLabel(txtCp);
		configurarLabel(txtTelefono);

		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(COLOR_BOTON_PRINCIPAL);
		btnBuscar.setBorder(null);
		btnBuscar.setFont(FUENTE_BOTON);
		btnBuscar.setPreferredSize(new Dimension(180, 56));

		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBackground(COLOR_BOTON_PRINCIPAL);
		btnModificar.setBorder(null);
		btnModificar.setFont(FUENTE_BOTON);
		btnModificar.setPreferredSize(new Dimension(180, 56));

		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(COLOR_BOTON_SECUNDARIO);
		btnVolver.setBorder(null);
		btnVolver.setFont(FUENTE_BOTON);
		btnVolver.setPreferredSize(new Dimension(180, 56));

		inicializarSeparador(sp1);
		inicializarSeparador(sp2);
		inicializarSeparador(sp3);
		inicializarSeparador(sp4);
		inicializarSeparador(sp5);
		inicializarSeparador(sp6);
		inicializarSeparador(sp7);
		inicializarSeparador(sp8);
		inicializarSeparador(sp9);
		inicializarSeparador(sp10);

		panelPrincipal.add(sp1);
		panelPrincipal.add(sp2);
		panelPrincipal.add(txtBuscarId);
		panelPrincipal.add(inputBuscarId);
		panelPrincipal.add(new JLabel(""));
		panelPrincipal.add(btnBuscar);
		panelPrincipal.add(sp3);
		panelPrincipal.add(sp4);
		panelPrincipal.add(txtNombre);
		panelPrincipal.add(inputNombre);
		panelPrincipal.add(sp5);
		panelPrincipal.add(sp6);
		panelPrincipal.add(txtDireccion);
		panelPrincipal.add(inputDireccion);
		panelPrincipal.add(sp7);
		panelPrincipal.add(sp8);
		panelPrincipal.add(txtCp);
		panelPrincipal.add(inputCp);
		panelPrincipal.add(sp9);
		panelPrincipal.add(sp10);
		panelPrincipal.add(txtTelefono);
		panelPrincipal.add(inputTelefono);
		panelPrincipal.add(btnVolver);
		panelPrincipal.add(btnModificar);
	}

	private void configurarCampo(JTextField campo) {
		campo.setColumns(10);
		campo.setBackground(COLOR_CAMPO);
		campo.setFont(FUENTE_INPUT);
		campo.setBorder(new BevelBorder(BevelBorder.LOWERED, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO,
				COLOR_BORDE_CAMPO));
	}

	private void configurarLabel(JLabel label) {
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(COLOR_TEXTO);
		label.setFont(FUENTE_LABEL);
		label.setBorder(new LineBorder(COLOR_FONDO, 5, true));
	}

	private void inicializarSeparador(JSeparator sp) {
		sp.setForeground(Color.WHITE);
		sp.setBackground(Color.WHITE);
		sp.setOrientation(SwingConstants.VERTICAL);
	}

	public VentanaModificarCliente() {
		this((JFrame) null);
	}
}
