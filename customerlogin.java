import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class customerlogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField username1;
	private JLabel lblhicustomer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerlogin frame = new customerlogin();
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
	public customerlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblUserName.setBounds(95, 120, 147, 31);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblPassword.setBounds(95, 207, 147, 31);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(293, 204, 246, 43);
		contentPane.add(passwordField);
		
		username1 = new JTextField();
		username1.setBounds(293, 117, 246, 43);
		contentPane.add(username1);
		username1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname= username1.getText();
				String psd= passwordField.getText();
				
				
				if(uname.equals("123") && psd.equals("321"))
				{
					JOptionPane.showMessageDialog(null, "You are Successfully Logged In");
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password");
				}
			}
		});
		btnLogin.setBounds(349, 298, 147, 43);
		contentPane.add(btnLogin);
		
		lblhicustomer = new JLabel("Welcome sir/madam");
		lblhicustomer.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblhicustomer.setBounds(275, 13, 264, 57);
		contentPane.add(lblhicustomer);
	}

}
