import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class customerresponsibilities extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField sex;
	private JTextField designation;
	private JTable table;
	private JTable table_1;
	//private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerresponsibilities frame = new customerresponsibilities();
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
	public customerresponsibilities() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel homepage = new JLabel("pet suplly store");
		homepage.setBounds(351, 13, 320, 60);
		homepage.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		contentPane.add(homepage);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(97, 148, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("age");
		lblAge.setBounds(97, 209, 56, 16);
		contentPane.add(lblAge);
		
		JLabel lblSex = new JLabel("sex");
		lblSex.setBounds(97, 289, 56, 16);
		contentPane.add(lblSex);
		
		JLabel lblDesignation = new JLabel("designation");
		lblDesignation.setBounds(97, 354, 102, 16);
		contentPane.add(lblDesignation);
		
		name = new JTextField();
		name.setBounds(222, 145, 116, 22);
		contentPane.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setBounds(222, 221, 116, 22);
		contentPane.add(age);
		age.setColumns(10);
		
		sex = new JTextField();
		sex.setBounds(222, 286, 116, 22);
		contentPane.add(sex);
		sex.setColumns(10);
		
		designation = new JTextField();
		designation.setBounds(222, 351, 116, 22);
		contentPane.add(designation);
		designation.setColumns(10);
		
		JButton adddetails = new JButton("add details\r\n");
		adddetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getActionCommand().equals("add details")) {
					String TextFieldValue =  textField.getText();	
					//model.add(0,TextFieldValue);
						
					}
				
				
				
				
			}
		});
		adddetails.setBounds(143, 444, 97, 25);
		contentPane.add(adddetails);
		
		table = new JTable();
		table.setBounds(515, 205, 74, -36);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"serialnumber", "name", "age", "sex", "desigantion"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.setBounds(470, 141, 419, 192);
		contentPane.add(table_1);
	}
}
