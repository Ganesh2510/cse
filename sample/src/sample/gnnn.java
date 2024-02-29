package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class gnnn {

	private JFrame frame;
	private JTextField T1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gnnn window = new gnnn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gnnn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setBounds(69, 64, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(69, 118, 86, 14);
		frame.getContentPane().add(lblPassword);
		
		T1 = new JTextField();
		T1.setBounds(224, 61, 86, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel lblLoginPageWith = new JLabel("LOGIN PAGE WITH DB CONNECTION");
		lblLoginPageWith.setBounds(145, 22, 195, 14);
		frame.getContentPane().add(lblLoginPageWith);
		
		P1 = new JPasswordField();
		P1.setBounds(224, 115, 86, 20);
		frame.getContentPane().add(P1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username =T1.getText();
				String password=P1.getText();
				 try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/venkat","root","mrec");	
					PreparedStatement stn=con.prepareStatement("select username,password from user where  username=? and password=?");
				    stn.setString(1, username);
				    stn.setString(2, password);
				    ResultSet rs=stn.executeQuery();
				   
				    if(rs.next()) {
				    	JOptionPane.showMessageDialog(btnNewButton,"valid user");
				    	
				    }
				    else {
				    	JOptionPane.showMessageDialog(btnNewButton,"invalid user");
				    }
				 }
				 catch(SQLException e1) {
					 e1.printStackTrace();
					 
				 }
			}
		});
		btnNewButton.setBounds(165, 185, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
