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
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Consulta2 extends JFrame {

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
		
		JComboBox cmbIng = new JComboBox();
		cmbIng.setModel(new DefaultComboBoxModel(new String[] {"Ninguno", "1. Campa\u00F1a de Verano", "2. Sistema de Alcantarillas", "3. Plataforma E-Comerce", "4. Activacion Prestamos", "5. Pruebas de Software", "6. Front-End Proyecto \"Nina\""}));
		cmbIng.setBounds(198, 153, 231, 22);
		contentPane.add(cmbIng);
		
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
		btnNewButton.setBounds(10, 417, 169, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuscarP = new JButton("Buscar");
		btnBuscarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selDpto=(String) cmbIng.getSelectedItem();
				if(selDpto.equals("Ninguno")) {
					JOptionPane.showMessageDialog(null, "Debes seleccionar un Ingeniero");
				}else {
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
	        		 PreparedStatement ps=null;
	                 ResultSet res;
	                 try {
	 					ps=con.prepareStatement("SELECT * FROM ingeniero WHERE iding=?");
	 					ps.setString(1, selDpto.substring(0,1));
	 		            res=ps.executeQuery();
	 		            String outText="";
	 		            while (res.next()){
	 		               outText+=res.getString("iding") + "-" + res.getString("especialidad")+ "-" + res.getString("cargo")+"\n";
	 		            }
	 		            areaRpta.setText(outText);
	 				 }catch (SQLException e1) {
	 					// TODO Auto-generated catch block
	 					e1.printStackTrace();
	 				}
				}
			}
		});
		btnBuscarP.setBounds(429, 153, 89, 23);
		contentPane.add(btnBuscarP);
	}

}
