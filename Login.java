import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JLabel lblPassword;
	private JTextField textPassword;
	private JComboBox comboBox;
	private JLabel lblLoginAs;
	private JButton btnLogin;
	private JLabel lblWelcomeToJhipster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(72, 83, 121, 14);
		contentPane.add(lblUsername);
		
		textUser = new JTextField();
		textUser.setBounds(198, 80, 86, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(72, 136, 77, 14);
		contentPane.add(lblPassword);
		
		textPassword = new JTextField();
		textPassword.setBounds(198, 130, 86, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		String selectLogin[]={"Admin","Billing"};
		comboBox = new JComboBox(selectLogin);
		comboBox.setBounds(218, 174, 28, 20);
		contentPane.add(comboBox);
		
		lblLoginAs = new JLabel("LOGIN AS");
		lblLoginAs.setBounds(72, 177, 56, 14);
		contentPane.add(lblLoginAs);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textUser.getText().equals("admin") && textPassword.getText().equals("admin") && comboBox.getSelectedItem().equals("Admin")){
					Admin ad = new Admin();
					ad.setVisible(true);
					}
				else {
					AddOrder ao = null;
					try {
						ao = new AddOrder();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ao.setVisible(true);
				}
						       
							    }
			
					
				
			
		});
		btnLogin.setBounds(130, 216, 89, 23);
		contentPane.add(btnLogin);
		
		lblWelcomeToJhipster = new JLabel("WELCOME TO JHIPSTER PETSTORE");
		lblWelcomeToJhipster.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWelcomeToJhipster.setBounds(40, 23, 344, 30);
		contentPane.add(lblWelcomeToJhipster);
	}

}
