package Lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PestañaGestion extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdD;
	private JTextField txtNombreD;
	private JTextField txtTlfD;
	private JTextField textFaxD;
	private JTextField txtIdP;
	private JTextField txtIdI;
	private JTextField txtNombreP;
	private JTextField txtFeIniP;
	private JTextField txtFeTerP;
	private JTextField txtEspI;
	private JTextField txtCargoI;

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
        
        textFaxD = new JTextField();
        textFaxD.setBounds(82, 176, 86, 20);
        panel1.add(textFaxD);
        textFaxD.setColumns(10);
        
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
        txtNombreP.setBounds(109, 84, 286, 20);
        panel2.add(txtNombreP);
        txtNombreP.setColumns(10);
        
        txtFeIniP = new JTextField();
        txtFeIniP.setBounds(109, 131, 286, 20);
        panel2.add(txtFeIniP);
        txtFeIniP.setColumns(10);
        
        txtFeTerP = new JTextField();
        txtFeTerP.setBounds(109, 169, 286, 20);
        panel2.add(txtFeTerP);
        txtFeTerP.setColumns(10);
        
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
        btnNewButton_1.setBounds(10, 484, 145, 23);
        contentPane.add(btnNewButton_1);
	}
}
