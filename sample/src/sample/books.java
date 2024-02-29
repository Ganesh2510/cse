package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;

public class books {
   int item=0;
   int bill=0;
	private JFrame frame;
	private JTextField txtECommerceWebsite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					books window = new books();
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
	public books() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 0));
		frame.setBounds(200, 200, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel C1 = new JLabel("CART   : 0");
		C1.setBounds(360, 11, 66, 30);
		frame.getContentPane().add(C1);
		
		JButton B1 = new JButton("");
		B1.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\download (1).jpg"));
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item=item+1;
				bill=bill+250;
				C1.setText("CART :"+item);
				
			}
		});
		
		B1.setBounds(30, 63, 89, 111);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("");
		B2.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\download.jpg"));
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item=item+1;
				bill=bill+300;
				C1.setText("CART :"+item);
				
			}
		});
		B2.setBounds(172, 65, 89, 109);
		frame.getContentPane().add(B2);
		
		JLabel lblNewLabel_1 = new JLabel("RS 250");
		lblNewLabel_1.setBounds(43, 174, 81, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton B3 = new JButton("");
		B3.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\81AHTyq2wVL._AC_UL210_SR195,210_.jpg"));
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item=item+1;
				bill=bill+350;
				C1.setText("CART :"+item);
				
			}
		});
		B3.setBounds(306, 63, 89, 111);
		frame.getContentPane().add(B3);
		
		JLabel lblNewLabel_2 = new JLabel("RS 300");
		lblNewLabel_2.setBounds(180, 180, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RS 350");
		lblNewLabel_3.setBounds(319, 180, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtECommerceWebsite = new JTextField();
		txtECommerceWebsite.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtECommerceWebsite.setText("E COMMERCE WEBSITE");
		txtECommerceWebsite.setBounds(73, 22, 182, 20);
		frame.getContentPane().add(txtECommerceWebsite);
		txtECommerceWebsite.setColumns(10);
		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.setBounds(121, 279, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
