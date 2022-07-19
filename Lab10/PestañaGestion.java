package Lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PestañaGestion extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdD;
	private JTextField txtNombreD;
	private JTextField txtTlfD;
	private JTextField txtFaxD;
	private JTextField txtIdP;
	private JTextField txtIdI;
	private JTextField txtNombreP;
	private JTextField txtFeIniP;
	private JTextField txtFeTerP;
	private JTextField txtEspI;
	private JTextField txtCargoI;

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
					PestañaGestion frame = new PestañaGestion();
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
	public PestañaGestion() {
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
		setBounds(100, 100, 537, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane pestañas = new JTabbedPane(JTabbedPane.TOP);
		pestañas.setBounds(0, 124, 521, 349);
		contentPane.add(pestañas);
        
      //Creamos el panel y lo añadimos a las pestañas
        JPanel panel2=new JPanel();
        pestañas.addTab("Proyectos", panel2);
        panel2.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("ID:");
        lblNewLabel_2.setBounds(22, 37, 46, 14);
        panel2.add(lblNewLabel_2);
        
        txtIdP = new JTextField();
        txtIdP.setColumns(10);
        txtIdP.setBounds(57, 34, 86, 20);
        panel2.add(txtIdP);
        
        JButton btnNewButton_2_1 = new JButton("Buscar");
        btnNewButton_2_1.setBounds(169, 33, 89, 23);
        panel2.add(btnNewButton_2_1);
        
        JLabel lblNewLabel_4 = new JLabel("Nombre");
        lblNewLabel_4.setBounds(22, 87, 46, 14);
        panel2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Fecha de Inicio");
        lblNewLabel_5.setBounds(22, 134, 86, 14);
        panel2.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Fecha de termino");
        lblNewLabel_6.setBounds(22, 172, 86, 14);
        panel2.add(lblNewLabel_6);
        
        txtNombreP = new JTextField();
        txtNombreP.setBounds(124, 84, 286, 20);
        panel2.add(txtNombreP);
        txtNombreP.setColumns(10);
        
        txtFeIniP = new JTextField();
        txtFeIniP.setBounds(124, 131, 286, 20);
        panel2.add(txtFeIniP);
        txtFeIniP.setColumns(10);
        
        txtFeTerP = new JTextField();
        txtFeTerP.setBounds(124, 169, 286, 20);
        panel2.add(txtFeTerP);
        txtFeTerP.setColumns(10);
        
        JLabel lblNewLabel_9 = new JLabel("Departamento");
        lblNewLabel_9.setBounds(22, 210, 86, 14);
        panel2.add(lblNewLabel_9);
        
        JLabel lblNewLabel_9_1 = new JLabel("Ingeniero a cargo");
        lblNewLabel_9_1.setBounds(22, 235, 100, 14);
        panel2.add(lblNewLabel_9_1);
        //Creamos el panel y lo añadimos a las pestañas
        JPanel panel1=new JPanel();
        pestañas.addTab("Departamentos", panel1);
        panel1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("ID:");
        lblNewLabel.setBounds(26, 28, 46, 14);
        panel1.add(lblNewLabel);
        
        txtIdD = new JTextField();
        txtIdD.setBounds(55, 25, 86, 20);
        panel1.add(txtIdD);
        txtIdD.setColumns(10);
        
        JButton btnNewButton_2 = new JButton("Buscar");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_2.setBounds(166, 24, 89, 23);
        panel1.add(btnNewButton_2);
        
        JLabel lblNewLabel_1 = new JLabel("Nombre");
        lblNewLabel_1.setBounds(26, 86, 46, 14);
        panel1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Telefono");
        lblNewLabel_1_1.setBounds(26, 132, 46, 14);
        panel1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Fax");
        lblNewLabel_1_1_1.setBounds(26, 179, 46, 14);
        panel1.add(lblNewLabel_1_1_1);
        
        txtNombreD = new JTextField();
        txtNombreD.setBounds(82, 83, 321, 20);
        panel1.add(txtNombreD);
        txtNombreD.setColumns(10);
        
        txtTlfD = new JTextField();
        txtTlfD.setBounds(82, 129, 321, 20);
        panel1.add(txtTlfD);
        txtTlfD.setColumns(10);
        
        txtFaxD = new JTextField();
        txtFaxD.setBounds(82, 176, 86, 20);
        panel1.add(txtFaxD);
        txtFaxD.setColumns(10);
        
        JButton btnLimpiarDatos_1 = new JButton("Limpiar Datos");
        btnLimpiarDatos_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		limpiarDatosD();
        	}
        });
        btnLimpiarDatos_1.setBounds(26, 233, 136, 23);
        panel1.add(btnLimpiarDatos_1);
        
        JButton btnInsertarI_1 = new JButton("Insertar");
        btnInsertarI_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
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
                 try {
					ps=con.prepareStatement("INSERT INTO departamentos (iddpto, nombre, telefono, fax) VALUES(?,?,?,?)");
					ps.setString(1, txtIdD.getText());
		            ps.setString(2, txtNombreD.getText());
		            ps.setString(3, txtTlfD.getText());
		            ps.setString(4, txtFaxD.getText());
		            int rpta=ps.executeUpdate();
		            if(rpta>0){
		                JOptionPane.showMessageDialog(null,"Se añadio el registro de departamento");
		            }else{
		                JOptionPane.showMessageDialog(null, "No se pudo añadir, intente de nuevo");
		            }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                 limpiarDatos();
        		
        	}
        });
        btnInsertarI_1.setBackground(new Color(0, 204, 0));
        btnInsertarI_1.setBounds(215, 233, 89, 23);
        panel1.add(btnInsertarI_1);
        
        JButton btnActualizarI_1 = new JButton("Actualizar");
        btnActualizarI_1.setBackground(new Color(51, 153, 153));
        btnActualizarI_1.setBounds(314, 233, 89, 23);
        panel1.add(btnActualizarI_1);
        
        JButton btnEliminarI_1 = new JButton("Eliminar");
        btnEliminarI_1.setBackground(new Color(255, 51, 51));
        btnEliminarI_1.setBounds(417, 233, 89, 23);
        panel1.add(btnEliminarI_1);
        
      //Creamos el panel y lo añadimos a las pestañas
        JPanel panel3=new JPanel();
        pestañas.addTab("Ingenieros", panel3);
        panel3.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("ID:");
        lblNewLabel_3.setBounds(29, 33, 46, 14);
        panel3.add(lblNewLabel_3);
        
        txtIdI = new JTextField();
        txtIdI.setColumns(10);
        txtIdI.setBounds(60, 30, 86, 20);
        panel3.add(txtIdI);
        
        JButton btnNewButton_2_2 = new JButton("Buscar");
        btnNewButton_2_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
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
 					ps.setString(1, txtIdI.getText());
 		            res=ps.executeQuery();
 		            if(res.next()){
 		            	txtIdI.setEditable(false);
 		            	txtEspI.setText(res.getString("especialidad"));
 		            	txtCargoI.setText(res.getString("cargo"));
 		            }else{
 		                JOptionPane.showMessageDialog(null, "No se encontro el registro de ingeniero");
 		            }
 				} catch (SQLException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 				}
        	}
        });
        btnNewButton_2_2.setBounds(156, 29, 89, 23);
        panel3.add(btnNewButton_2_2);
        
        JLabel lblNewLabel_7 = new JLabel("Especialidad");
        lblNewLabel_7.setBounds(29, 93, 76, 14);
        panel3.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("Cargo");
        lblNewLabel_8.setBounds(29, 136, 46, 14);
        panel3.add(lblNewLabel_8);
        
        txtEspI = new JTextField();
        txtEspI.setBounds(106, 90, 139, 20);
        panel3.add(txtEspI);
        txtEspI.setColumns(10);
        
        txtCargoI = new JTextField();
        txtCargoI.setBounds(106, 133, 139, 20);
        panel3.add(txtCargoI);
        txtCargoI.setColumns(10);
        
        JButton btnInsertarI = new JButton("Insertar");
        btnInsertarI.setBackground(new Color(0, 204, 0));
        btnInsertarI.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
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
                 try {
					ps=con.prepareStatement("INSERT INTO ingeniero (iding, especialidad, cargo) VALUES(?,?,?)");
					ps.setString(1, txtIdI.getText());
		            ps.setString(2, txtEspI.getText());
		            ps.setString(3, txtCargoI.getText());
		            int rpta=ps.executeUpdate();
		            if(rpta>0){
		                JOptionPane.showMessageDialog(null,"Se añadio el registro de ingeniero");
		            }else{
		                JOptionPane.showMessageDialog(null, "No se pudo añadir, intente de nuevo");
		            }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                 limpiarDatos();
        	}
        });
        btnInsertarI.setBounds(184, 211, 89, 23);
        panel3.add(btnInsertarI);
        
        JButton btnActualizarI = new JButton("Actualizar");
        btnActualizarI.setBackground(new Color(51, 153, 153));
        btnActualizarI.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
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
        		 try {
 					ps=con.prepareStatement("UPDATE ingeniero SET especialidad=?,cargo=? WHERE iding=?");
 					ps.setString(1, txtEspI.getText());
 		            ps.setString(2, txtCargoI.getText());
 		            ps.setString(3, txtIdI.getText());
 		            int rpta=ps.executeUpdate();
 		           if(rpta>0) {
                       JOptionPane.showMessageDialog(null,"Se modifico el registro del ingeniero");
 		           }else
                       JOptionPane.showMessageDialog(null, "No se pudo modificar el registro del ingeniero");
 		           con.close();
 		           limpiarDatos();
 				}catch (SQLException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 				}
        	}
        });
        btnActualizarI.setBounds(296, 211, 89, 23);
        panel3.add(btnActualizarI);
        
        JButton btnEliminarI = new JButton("Eliminar");
        btnEliminarI.setBackground(new Color(255, 51, 51));
        btnEliminarI.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
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
        		 try {
 					ps=con.prepareStatement("DELETE FROM ingeniero WHERE iding=?");
 		            ps.setString(1, txtIdI.getText());
 		            int rpta=ps.executeUpdate();
 		           if(rpta>0) {
                       JOptionPane.showMessageDialog(null,"Se elimino el registro del ingeniero");
 		           }else
                       JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro del ingeniero. Intente otra vez");
 		           con.close();
 		           limpiarDatos();
 				}catch (SQLException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 				}
        	}
        });
        btnEliminarI.setBounds(404, 211, 89, 23);
        panel3.add(btnEliminarI);
        
        JButton btnLimpiarDatos = new JButton("Limpiar Datos");
        btnLimpiarDatos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		limpiarDatos();
        	}
        });
        btnLimpiarDatos.setBounds(10, 211, 136, 23);
        panel3.add(btnLimpiarDatos);
        
        JLabel lblTitulo = new JLabel("Laboratorio 10- Proyectos");
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lblTitulo.setBackground(new Color(0, 100, 0));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(0, 0, 521, 83);
        lblTitulo.setOpaque(true);
        contentPane.add(lblTitulo);
        
        JLabel lblSubtitulo = new JLabel("Gestion de Proyectos");
        lblSubtitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblSubtitulo.setBounds(0, 86, 521, 38);
        contentPane.add(lblSubtitulo);
        
        JButton btnNewButton = new JButton("Cerrar");
        btnNewButton.setBackground(new Color(255, 0, 51));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton.setBounds(422, 484, 89, 23);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Volver al Menu Principal");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
				ventanaPrincipal n = new ventanaPrincipal();
				n.setVisible(true);
        	}
        });
        btnNewButton_1.setBackground(new Color(255, 204, 0));
        btnNewButton_1.setBounds(10, 484, 173, 23);
        contentPane.add(btnNewButton_1);
	}
	public void limpiarDatos() {
		txtIdI.setEditable(true);
		txtIdI.setText("");
		txtEspI.setText("");
		txtCargoI.setText("");
	}
	public void limpiarDatosD() {
		txtIdD.setText("");
		txtNombreD.setText("");
		txtTlfD.setText("");
		txtFaxD.setText("");
	}
}
