import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class newpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newpage frame = new newpage();
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
	public newpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 679);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final DefaultListModel model = new DefaultListModel();
		final JList list = new JList(model);
		list.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		list.setBounds(473, 361, 455, 227);
		contentPane.add(list);
		
		textField = new JTextField();
		textField.setBounds(206, 128, 251, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblName = new JLabel("Nameofc");
		lblName.setBounds(12, 124, 157, 44);
		contentPane.add(lblName);
		
		
		JButton btnAdd = new JButton("Add product");
		btnAdd.setFont(new Font("Calibri", Font.BOLD, 13));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Add product")) {
				String TextFieldValue =  textField.getText();	
				model.add(0,TextFieldValue);
					
				}
			
			
			}
		});
		btnAdd.setBounds(565, 129, 157, 37);
		contentPane.add(btnAdd);
		
		JButton btnNewButton = new JButton("Remove Product");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getActionCommand().equals("Remove Product")) {
				int index ;
				index= list.getSelectedIndex();
				model.remove(index);
					
				}
			
			
			}
		});
		
		
		btnNewButton.setBounds(565, 210, 157, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblAdmin = new JLabel("Administrator's Roles\r\n");
		lblAdmin.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblAdmin.setBounds(87, 30, 500, 61);
		contentPane.add(lblAdmin);
		
		JButton btnNewButton_1 = new JButton("Clear display");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			}
		});
		btnNewButton_1.setBounds(565, 299, 157, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogOut = new JButton("click to Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				loginpage admlgn = new loginpage();
				admlgn.setVisible(true);
			}
		});
		btnLogOut.setBounds(61, 476, 273, 61);
		contentPane.add(btnLogOut);
	}
}
