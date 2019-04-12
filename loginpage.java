import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
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
	public loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblUserName.setBounds(56, 130, 233, 45);
		contentPane.add(lblUserName);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel.setBounds(56, 226, 233, 45);
		contentPane.add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(302, 130, 233, 45);
		contentPane.add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(300, 226, 235, 45);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String unm= username.getText();
				String psd = passwordField.getText();
				
				if(unm.equals("123") && psd.equals("321"))
				{
					JOptionPane.showMessageDialog(null, "You are Successfully Logged In");
					setVisible(false);
					newpage lbp= new newpage();
					lbp.setVisible(true);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password");
					setVisible(false);
				}
				
			}
		});
		
		
		btnNewButton.setBounds(340, 308, 156, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblWelcomeAdmin = new JLabel("Welcome Admin");
		lblWelcomeAdmin.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblWelcomeAdmin.setBounds(287, 13, 233, 45);
		contentPane.add(lblWelcomeAdmin);
	}

}
