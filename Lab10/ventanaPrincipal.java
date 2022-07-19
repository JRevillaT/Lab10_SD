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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 417);
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
		
		JLabel lblHolaSeleccionaLa = new JLabel("Hola, selecciona la accion que deseas realizar: ");
		lblHolaSeleccionaLa.setHorizontalAlignment(SwingConstants.LEFT);
		lblHolaSeleccionaLa.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblHolaSeleccionaLa.setBounds(10, 83, 511, 49);
		contentPane.add(lblHolaSeleccionaLa);
		
		JButton btnGestion = new JButton("Gestionar proyectos");
		btnGestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PestañaGestion n = new PestañaGestion();
				n.setVisible(true);
			}
		});
		btnGestion.setBounds(10, 132, 149, 235);
		contentPane.add(btnGestion);
		
		JButton btnConsulta1 = new JButton("Consulta de proyectos por departamento");
		btnConsulta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Consulta1 n = new Consulta1();
				n.setVisible(true);
			}
		});
		btnConsulta1.setBounds(181, 132, 149, 235);
		contentPane.add(btnConsulta1);
		
		JButton btnConsulta2 = new JButton("Consulta de Ingenieros por proyecto");
		btnConsulta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Consulta2 n = new Consulta2();
				n.setVisible(true);
			}
		});
		btnConsulta2.setBounds(364, 132, 149, 235);
		contentPane.add(btnConsulta2);
	}
}
