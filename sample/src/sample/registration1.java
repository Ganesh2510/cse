package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class registration1 {

	private JFrame frame;
	private JTextField txtRegistration;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration1 window = new registration1();
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
	public registration1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NUMBER");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 105, 123, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setBounds(38, 80, 123, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtRegistration = new JTextField();
		txtRegistration.setText("STUDENT DETAILS FORM");
		txtRegistration.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 15));
		txtRegistration.setBounds(110, 24, 168, 20);
		frame.getContentPane().add(txtRegistration);
		txtRegistration.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DEPARTMENT");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(38, 130, 123, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_4.setBounds(38, 155, 113, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("GENDER");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\img8.jpg"));
		lblNewLabel.setBounds(10, 0, 400, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
