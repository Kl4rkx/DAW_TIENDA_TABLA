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
public class VentanaEliminarCliente extends JFrame {

	private static final Color COLOR_FONDO = new Color(245, 247, 250);
	private static final Color COLOR_CABECERA = new Color(25, 55, 109);
	private static final Color COLOR_TEXTO = new Color(33, 37, 41);
	private static final Color COLOR_CAMPO = Color.WHITE;
	private static final Color COLOR_BORDE_CAMPO = new Color(186, 196, 209);
	private static final Color COLOR_BOTON_PRINCIPAL = new Color(170, 58, 58);
	private static final Color COLOR_BOTON_SECUNDARIO = new Color(108, 117, 125);
	private static final Font FUENTE_TITULO = new Font("Segoe UI", Font.BOLD, 28);
	private static final Font FUENTE_LABEL = new Font("Segoe UI", Font.BOLD, 20);
	private static final Font FUENTE_INPUT = new Font("Segoe UI", Font.PLAIN, 20);
	private static final Font FUENTE_BOTON = new Font("Segoe UI", Font.BOLD, 20);

	private JLabel txtTitulo = new JLabel("Eliminar cliente");
	private JPanel panelPrincipal = new JPanel();

	private JLabel txtBuscarId = new JLabel("ID del cliente");
	public JTextField inputBuscarId = new JTextField();

	public JButton btnBuscar = new JButton("Eliminar");
	public JButton btnVolver = new JButton("Volver");

	private JSeparator sp1 = new JSeparator();
	private JSeparator sp2 = new JSeparator();
	private JSeparator sp3 = new JSeparator();
	private JSeparator sp4 = new JSeparator();

	public VentanaEliminarCliente(JFrame padre) {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaEliminarCliente.class.getResource("/assets/icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setTitle("Eliminar cliente - Tienda");
		setSize(760, 430);
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

		inputBuscarId.setColumns(10);
		inputBuscarId.setBackground(COLOR_CAMPO);
		inputBuscarId.setFont(FUENTE_INPUT);
		inputBuscarId.setBorder(new BevelBorder(BevelBorder.LOWERED, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO,
				COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO));

		txtBuscarId.setHorizontalAlignment(SwingConstants.CENTER);
		txtBuscarId.setForeground(COLOR_TEXTO);
		txtBuscarId.setFont(FUENTE_LABEL);
		txtBuscarId.setBorder(new LineBorder(COLOR_FONDO, 5, true));

		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(COLOR_BOTON_PRINCIPAL);
		btnBuscar.setBorder(null);
		btnBuscar.setFont(FUENTE_BOTON);
		btnBuscar.setPreferredSize(new Dimension(180, 56));

		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(COLOR_BOTON_SECUNDARIO);
		btnVolver.setBorder(null);
		btnVolver.setFont(FUENTE_BOTON);
		btnVolver.setPreferredSize(new Dimension(180, 56));

		inicializarSeparador(sp1);
		inicializarSeparador(sp2);
		inicializarSeparador(sp3);
		inicializarSeparador(sp4);

		panelPrincipal.add(sp1);
		panelPrincipal.add(sp2);
		panelPrincipal.add(txtBuscarId);
		panelPrincipal.add(inputBuscarId);
		panelPrincipal.add(sp3);
		panelPrincipal.add(sp4);
		panelPrincipal.add(btnVolver);
		panelPrincipal.add(btnBuscar);
	}

	private void inicializarSeparador(JSeparator sp) {
		sp.setForeground(Color.WHITE);
		sp.setBackground(Color.WHITE);
		sp.setOrientation(SwingConstants.VERTICAL);
	}

	public VentanaEliminarCliente() {
		this((JFrame) null);
	}
}
