package Lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Consulta1 extends JFrame {

	private JPanel contentPane;
	
	public static final String URL = "jdbc:mysql://localhost:3306/test";
    public static final String USER = "root";
    public static final String CLAVE = "root";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta1 frame = new Consulta1();
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
	public Consulta1() {
		Connection con = null;
        
        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        JOptionPane.showMessageDialog(null, "Se conecto a la bd");
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 497);
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
		
		JLabel lblBusquedaDeProyectos = new JLabel("Busqueda de proyectos por departamento");
		lblBusquedaDeProyectos.setHorizontalAlignment(SwingConstants.LEFT);
		lblBusquedaDeProyectos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblBusquedaDeProyectos.setBounds(10, 91, 511, 49);
		contentPane.add(lblBusquedaDeProyectos);
		
		JLabel lblSeleccioneElDepartamento = new JLabel("Escoja el departamento para realizar la busqueda");
		lblSeleccioneElDepartamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccioneElDepartamento.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblSeleccioneElDepartamento.setBounds(12, 147, 341, 36);
		contentPane.add(lblSeleccioneElDepartamento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ninguno", "1. Direccion general", "2. Financiero", "3. Marketing", "4. Recursos Humanos", "5. Comercial", "6. Compras"}));
		comboBox.setBounds(293, 155, 130, 22);
		contentPane.add(comboBox);
		
		JTextArea areaRpta = new JTextArea();
		areaRpta.setWrapStyleWord(true);
		areaRpta.setLineWrap(true);
		areaRpta.setBounds(10, 195, 505, 221);
		contentPane.add(areaRpta);
		
		JButton btnNewButton = new JButton("Volver al Menu Principal");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventanaPrincipal n = new ventanaPrincipal();
				n.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 427, 166, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBackground(new Color(255, 0, 51));
		btnNewButton_1.setBounds(426, 427, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.setBounds(426, 155, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
