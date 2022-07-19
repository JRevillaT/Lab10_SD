package Lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consulta2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta2 frame = new Consulta2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Consulta2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Laboratorio 10- Proyectos");
		lblTitulo.setOpaque(true);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTitulo.setBackground(new Color(0, 100, 0));
		lblTitulo.setBounds(0, 0, 523, 83);
		contentPane.add(lblTitulo);
		
		JLabel lblBusquedaDeIngenieros = new JLabel("Busqueda de ingenieros por proyecto");
		lblBusquedaDeIngenieros.setHorizontalAlignment(SwingConstants.LEFT);
		lblBusquedaDeIngenieros.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblBusquedaDeIngenieros.setBounds(10, 93, 511, 49);
		contentPane.add(lblBusquedaDeIngenieros);
		
		JLabel lblSeleccioneElDepartamento = new JLabel("Seleccione el proyecto a buscar");
		lblSeleccioneElDepartamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccioneElDepartamento.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblSeleccioneElDepartamento.setBounds(10, 139, 341, 49);
		contentPane.add(lblSeleccioneElDepartamento);
		
		JTextArea areaRpta = new JTextArea();
		areaRpta.setWrapStyleWord(true);
		areaRpta.setLineWrap(true);
		areaRpta.setBounds(10, 185, 505, 221);
		contentPane.add(areaRpta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(281, 153, 231, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBackground(new Color(255, 0, 51));
		btnNewButton_1.setBounds(423, 417, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Volver al Menu Principal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventanaPrincipal n = new ventanaPrincipal();
				n.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBounds(10, 417, 145, 23);
		contentPane.add(btnNewButton);
	}

}
