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

@SuppressWarnings("serial")
public class VentanaAgregarCliente extends JFrame {

	private JLabel textoAgregarNuevoJugador = new JLabel("Agregar Equipo");

	private JPanel panelPrincipal = new JPanel();
	private JLabel txtId = new JLabel("Introduce el ID:");
	public JTextField inputId = new JTextField();

	private JLabel txtNombre = new JLabel("Introduce el nombre: ");
	public JTextField inputNombre = new JTextField();

	private JLabel txtCiudad = new JLabel("Introduce la ciudad:");
	public JTextField inputCiudad = new JTextField();
	private JSeparator separator1_5 = new JSeparator();
	private JSeparator separator1_6 = new JSeparator();
	private JSeparator separator1_11 = new JSeparator();
	private JSeparator separator1_12 = new JSeparator();
	private JSeparator separator1_1 = new JSeparator();
	private JSeparator separator1_2 = new JSeparator();

	public JButton btnVolver = new JButton("Volver");
	public JButton btnConfirmar = new JButton("Agregar");
	private final JSeparator separator1_3_2 = new JSeparator();
	private final JSeparator separator1_4_1 = new JSeparator();

	public VentanaAgregarCliente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(getParent());
		setType(Type.UTILITY);
		getContentPane().setBackground(new Color(255, 255, 255));
		inputCiudad.setBackground(new Color(255, 255, 204));
		inputCiudad.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inputCiudad.setColumns(10);
		inputNombre.setBackground(new Color(255, 255, 204));
		inputNombre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inputNombre.setColumns(10);
		inputId.setBackground(new Color(255, 255, 204));
		inputId.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inputId.setColumns(10);

		setTitle("Agregar Cliente - Tienda");
		setSize(500, 400);
		textoAgregarNuevoJugador.setBorder(new EmptyBorder(20, 0, 20, 0));
		textoAgregarNuevoJugador.setBackground(new Color(255, 255, 255));
		textoAgregarNuevoJugador.setFont(new Font("Arial", Font.BOLD, 16));
		textoAgregarNuevoJugador.setHorizontalAlignment(SwingConstants.CENTER);

		getContentPane().add(textoAgregarNuevoJugador, BorderLayout.NORTH);
		panelPrincipal.setBackground(new Color(255, 255, 255));

		getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new GridLayout(0, 2, 0, 0));
		separator1_1.setOrientation(SwingConstants.VERTICAL);
		separator1_1.setForeground(Color.WHITE);
		separator1_1.setBackground(Color.WHITE);

		panelPrincipal.add(separator1_1);
		separator1_2.setForeground(Color.WHITE);
		separator1_2.setBackground(Color.WHITE);

		panelPrincipal.add(separator1_2);
		txtId.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));

		panelPrincipal.add(txtId);

		panelPrincipal.add(inputId);
		separator1_3_2.setOrientation(SwingConstants.VERTICAL);
		separator1_3_2.setForeground(Color.WHITE);
		separator1_3_2.setBackground(Color.WHITE);

		panelPrincipal.add(separator1_3_2);
		separator1_4_1.setForeground(Color.WHITE);
		separator1_4_1.setBackground(Color.WHITE);

		panelPrincipal.add(separator1_4_1);
		txtNombre.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));

		panelPrincipal.add(txtNombre);

		panelPrincipal.add(inputNombre);
		separator1_5.setForeground(new Color(255, 255, 255));
		separator1_5.setBackground(new Color(255, 255, 255));
		separator1_5.setOrientation(SwingConstants.VERTICAL);

		panelPrincipal.add(separator1_5);
		separator1_6.setForeground(new Color(255, 255, 255));
		separator1_6.setBackground(new Color(255, 255, 255));

		panelPrincipal.add(separator1_6);
		txtCiudad.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));

		panelPrincipal.add(txtCiudad);

		panelPrincipal.add(inputCiudad);
		separator1_11.setForeground(new Color(255, 255, 255));
		separator1_11.setBackground(new Color(255, 255, 255));
		separator1_11.setOrientation(SwingConstants.VERTICAL);

		panelPrincipal.add(separator1_11);
		separator1_12.setForeground(new Color(255, 255, 255));
		separator1_12.setBackground(new Color(255, 255, 255));

		panelPrincipal.add(separator1_12);
		btnVolver.setBorder(null);
		btnVolver.setForeground(new Color(204, 204, 204));
		btnVolver.setBackground(new Color(255, 255, 255));

		panelPrincipal.add(btnVolver);
		btnConfirmar.setForeground(new Color(0, 0, 0));
		btnConfirmar.setBorder(null);
		btnConfirmar.setBackground(new Color(255, 255, 255));

		panelPrincipal.add(btnConfirmar);
	}
}