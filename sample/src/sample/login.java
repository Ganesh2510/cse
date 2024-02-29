package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField P2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("userName");
		lblNewLabel.setBounds(90, 67, 76, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(204, 64, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(90, 128, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		banklo obj=new banklo();
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=tb1.getText();
				String password=P2.getText();
				if(userName.equals("GAN") && password.equals("ganesh2522")) {
					obj.setVisible(true);
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"Invalid Username or Password");
				}
			}
			
		});
		btnNewButton.setBounds(204, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		P2 = new JPasswordField();
		P2.setBounds(204, 125, 86, 20);
		frame.getContentPane().add(P2);
	}
}
