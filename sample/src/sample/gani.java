package sample;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class gani {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gani window = new gani();
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
	public gani() {
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
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setBounds(54, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(54, 101, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(54, 141, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblMarks = new JLabel("marks");
		lblMarks.setBounds(54, 182, 46, 14);
		frame.getContentPane().add(lblMarks);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      String name=t1.getText();
				String id=t2.getText();
				String address=t3.getText();
				String marks=t4.getText();
				int m=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/venkat","root","mrec");
				
				String q="insert into student1 values('"+name+"','"+id+"','"+address+"','"+marks+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton,"successful");
				
				}
				catch(SQLException e1){
					e1.printStackTrace();
				}
				}
		});
		btnNewButton.setBounds(135, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT DETAILS");
		lblNewLabel_1.setBounds(138, 22, 100, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(127, 60, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(127, 98, 86, 20);
		frame.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(127, 138, 86, 20);
		frame.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(127, 179, 86, 20);
		frame.getContentPane().add(t4);
	}
}
