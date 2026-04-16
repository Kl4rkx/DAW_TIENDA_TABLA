package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class VentanaAgregarCliente extends JFrame {

	private static final Color COLOR_FONDO = new Color(245, 247, 250);
	private static final Color COLOR_CABECERA = new Color(25, 55, 109);
	private static final Color COLOR_TEXTO_PRINCIPAL = new Color(33, 37, 41);
	private static final Color COLOR_TEXTO_SECUNDARIO = new Color(73, 80, 87);
	private static final Color COLOR_CAMPO = Color.WHITE;
	private static final Color COLOR_BORDE_CAMPO = new Color(186, 196, 209);
	private static final Color COLOR_BOTON_PRINCIPAL = new Color(41, 98, 168);
	private static final Color COLOR_BOTON_SECUNDARIO = new Color(108, 117, 125);
	private static final Font FUENTE_TITULO = new Font("Segoe UI", Font.BOLD, 28);
	private static final Font FUENTE_LABEL = new Font("Segoe UI", Font.BOLD, 20);
	private static final Font FUENTE_INPUT = new Font("Segoe UI", Font.PLAIN, 20);
	private static final Font FUENTE_BOTON = new Font("Segoe UI", Font.BOLD, 20);

	private JLabel textoAgregarNuevoJugador = new JLabel("Añadir cliente");

	private JPanel panelPrincipal = new JPanel();
	private JLabel txtId = new JLabel("Id");
	public JTextField inputId = new JTextField();

	private JLabel txtNombre = new JLabel("Nombre");
	public JTextField inputNombre = new JTextField();

	private JLabel txtCiudad = new JLabel("Dirección");
	public JTextField inputDireccion = new JTextField();
	private JSeparator separator3 = new JSeparator();
	private JSeparator separator4 = new JSeparator();
	private JSeparator separator5 = new JSeparator();
	private JSeparator separator6 = new JSeparator();
	private JSeparator separator1_1 = new JSeparator();
	private JSeparator separator1_2 = new JSeparator();

	public JButton btnVolver = new JButton("Volver");
	public JButton btnConfirmar = new JButton("Añadir");
	private final JSeparator separator1 = new JSeparator();
	private final JSeparator separator2 = new JSeparator();
	private final JLabel txtCp = new JLabel("Código postal");
	public JTextField inputCp = new JTextField();
	private final JSeparator separator7 = new JSeparator();
	private final JSeparator separator8 = new JSeparator();
	private final JLabel txtTelefono = new JLabel("Teléfono");
	public JTextField inputTelefono = new JTextField();
	private final JSeparator separator9 = new JSeparator();
	private final JSeparator separator10 = new JSeparator();

	public VentanaAgregarCliente(JFrame padre) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaAgregarCliente.class.getResource("/assets/icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		getContentPane().setBackground(COLOR_FONDO);
		inputDireccion.setBackground(COLOR_CAMPO);
		inputDireccion.setBorder(new BevelBorder(BevelBorder.LOWERED, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO,
				COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO));
		inputDireccion.setColumns(10);
		inputNombre.setBackground(COLOR_CAMPO);
		inputNombre.setBorder(new BevelBorder(BevelBorder.LOWERED, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO,
				COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO));
		inputNombre.setColumns(10);
		inputId.setBackground(COLOR_CAMPO);
		inputId.setBorder(new BevelBorder(BevelBorder.LOWERED, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO,
				COLOR_BORDE_CAMPO));
		inputId.setColumns(10);

		setTitle("Añadir cliente - Tienda");
		setSize(860, 660);
		setLocationRelativeTo(padre);
		textoAgregarNuevoJugador.setBorder(new EmptyBorder(24, 0, 24, 0));
		textoAgregarNuevoJugador.setOpaque(true);
		textoAgregarNuevoJugador.setBackground(COLOR_CABECERA);
		textoAgregarNuevoJugador.setForeground(Color.WHITE);
		textoAgregarNuevoJugador.setFont(FUENTE_TITULO);
		textoAgregarNuevoJugador.setHorizontalAlignment(SwingConstants.CENTER);

		getContentPane().add(textoAgregarNuevoJugador, BorderLayout.NORTH);
		panelPrincipal.setBackground(COLOR_FONDO);
		panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));

		getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new GridLayout(0, 2, 0, 0));
		separator1_1.setOrientation(SwingConstants.VERTICAL);
		separator1_1.setForeground(Color.WHITE);
		separator1_1.setBackground(Color.WHITE);

		panelPrincipal.add(separator1_1);
		separator1_2.setForeground(Color.WHITE);
		separator1_2.setBackground(Color.WHITE);

		panelPrincipal.add(separator1_2);
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setForeground(COLOR_TEXTO_PRINCIPAL);
		txtId.setBorder(new LineBorder(COLOR_FONDO, 5, true));
		txtId.setFont(FUENTE_LABEL);

		panelPrincipal.add(txtId);

		panelPrincipal.add(inputId);
		inputId.setFont(FUENTE_INPUT);
		separator1.setOrientation(SwingConstants.VERTICAL);
		separator1.setForeground(Color.WHITE);
		separator1.setBackground(Color.WHITE);

		panelPrincipal.add(separator1);
		separator2.setForeground(Color.WHITE);
		separator2.setBackground(Color.WHITE);

		panelPrincipal.add(separator2);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setForeground(COLOR_TEXTO_PRINCIPAL);
		txtNombre.setBorder(new LineBorder(COLOR_FONDO, 5, true));
		txtNombre.setFont(FUENTE_LABEL);

		panelPrincipal.add(txtNombre);

		panelPrincipal.add(inputNombre);
		inputNombre.setFont(FUENTE_INPUT);
		separator3.setForeground(new Color(255, 255, 255));
		separator3.setBackground(new Color(255, 255, 255));
		separator3.setOrientation(SwingConstants.VERTICAL);

		panelPrincipal.add(separator3);
		separator4.setForeground(new Color(255, 255, 255));
		separator4.setBackground(new Color(255, 255, 255));

		panelPrincipal.add(separator4);
		txtCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCiudad.setForeground(COLOR_TEXTO_PRINCIPAL);
		txtCiudad.setBorder(new LineBorder(COLOR_FONDO, 5, true));
		txtCiudad.setFont(FUENTE_LABEL);

		panelPrincipal.add(txtCiudad);

		panelPrincipal.add(inputDireccion);
		inputDireccion.setFont(FUENTE_INPUT);
		separator5.setForeground(new Color(255, 255, 255));
		separator5.setBackground(new Color(255, 255, 255));
		separator5.setOrientation(SwingConstants.VERTICAL);

		panelPrincipal.add(separator5);
		separator6.setForeground(new Color(255, 255, 255));
		separator6.setBackground(new Color(255, 255, 255));

		panelPrincipal.add(separator6);
		txtCp.setHorizontalAlignment(SwingConstants.CENTER);
		txtCp.setForeground(COLOR_TEXTO_SECUNDARIO);
		txtCp.setBorder(new LineBorder(COLOR_FONDO, 5, true));
		txtCp.setFont(FUENTE_LABEL);

		panelPrincipal.add(txtCp);
		inputCp.setColumns(10);
		inputCp.setBorder(new BevelBorder(BevelBorder.LOWERED, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO,
				COLOR_BORDE_CAMPO));
		inputCp.setBackground(COLOR_CAMPO);
		inputCp.setFont(FUENTE_INPUT);

		panelPrincipal.add(inputCp);
		separator7.setOrientation(SwingConstants.VERTICAL);
		separator7.setForeground(Color.WHITE);
		separator7.setBackground(Color.WHITE);

		panelPrincipal.add(separator7);
		separator8.setForeground(Color.WHITE);
		separator8.setBackground(Color.WHITE);

		panelPrincipal.add(separator8);
		txtTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelefono.setForeground(COLOR_TEXTO_SECUNDARIO);
		txtTelefono.setBorder(new LineBorder(COLOR_FONDO, 5, true));
		txtTelefono.setFont(FUENTE_LABEL);

		panelPrincipal.add(txtTelefono);
		inputTelefono.setColumns(10);
		inputTelefono.setBorder(new BevelBorder(BevelBorder.LOWERED, COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO,
				COLOR_BORDE_CAMPO, COLOR_BORDE_CAMPO));
		inputTelefono.setBackground(COLOR_CAMPO);
		inputTelefono.setFont(FUENTE_INPUT);

		panelPrincipal.add(inputTelefono);
		separator9.setOrientation(SwingConstants.VERTICAL);
		separator9.setForeground(Color.WHITE);
		separator9.setBackground(Color.WHITE);

		panelPrincipal.add(separator9);
		separator10.setForeground(Color.WHITE);
		separator10.setBackground(Color.WHITE);

		panelPrincipal.add(separator10);
		btnVolver.setBorder(null);
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(COLOR_BOTON_SECUNDARIO);
		btnVolver.setFont(FUENTE_BOTON);
		btnVolver.setPreferredSize(new Dimension(180, 56));

		panelPrincipal.add(btnVolver);
		btnConfirmar.setForeground(Color.WHITE);
		btnConfirmar.setBorder(null);
		btnConfirmar.setBackground(COLOR_BOTON_PRINCIPAL);
		btnConfirmar.setFont(FUENTE_BOTON);
		btnConfirmar.setPreferredSize(new Dimension(180, 56));

		panelPrincipal.add(btnConfirmar);
	}

	public VentanaAgregarCliente() {
		this((JFrame) null);
	}
}