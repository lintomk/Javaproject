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
import javax.swing.JTable;
import java.awt.Choice;
import javax.swing.table.DefaultTableModel;

public class admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table_2;

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
	public admin() {
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

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 217, 251, 37);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 320, 251, 37);
		contentPane.add(textField_2);
		
		
		JLabel lblName = new JLabel("NAME\r\n");
		lblName.setBounds(12, 124, 157, 44);
		contentPane.add(lblName);
		
		
		JButton btnAdd = new JButton("Add product");
		btnAdd.setFont(new Font("Calibri", Font.BOLD, 13));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Add product")) {
				String TextFieldValue =  textField.getText();
				String TextFieldValue1 =  textField_1.getText();
				String TextFieldValue2 =  textField_2.getText();
				
				model.add(0,TextFieldValue);
				model.add(0,TextFieldValue1);
				model.add(0,"name"+TextFieldValue2);
				
					
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
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(12, 203, 157, 44);
		contentPane.add(lblAge);
		
		JLabel lblSex = new JLabel("SEX");
		lblSex.setBounds(12, 309, 157, 44);
		contentPane.add(lblSex);
		
		table_2 = new JTable();
		table_2.setToolTipText("");
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"name", "age", "sex", "designation"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.setBounds(792, 70, 213, 154);
		contentPane.add(table_2);
		
	}
}
