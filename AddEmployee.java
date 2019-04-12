import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textEmployeeName;
	private JTextField textDesignation;
	private JTextField textAddress;
	private JTextField textMobile;
	private int employeeID;
	private String EmployeeName,Designation,Mobile,Address,Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddEmployee = new JLabel("ADD EMPLOYEE");
		lblAddEmployee.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddEmployee.setBounds(131, 45, 185, 22);
		contentPane.add(lblAddEmployee);
		
		JLabel lblEmployeeName = new JLabel("EMPLOYEE NAME");
		lblEmployeeName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeName.setBounds(40, 111, 130, 14);
		contentPane.add(lblEmployeeName);
		
		textEmployeeName = new JTextField();
		textEmployeeName.setHorizontalAlignment(SwingConstants.CENTER);
		textEmployeeName.setBounds(212, 108, 86, 20);
		contentPane.add(textEmployeeName);
		textEmployeeName.setColumns(10);
		
		JLabel lblDesignation = new JLabel("DESIGNATION");
		lblDesignation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesignation.setBounds(40, 161, 130, 14);
		contentPane.add(lblDesignation);
		
		textDesignation = new JTextField();
		textDesignation.setHorizontalAlignment(SwingConstants.CENTER);
		textDesignation.setBounds(212, 158, 86, 20);
		contentPane.add(textDesignation);
		textDesignation.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(59, 212, 86, 14);
		contentPane.add(lblAddress);
		
		textAddress = new JTextField();
		textAddress.setHorizontalAlignment(SwingConstants.CENTER);
		textAddress.setBounds(212, 209, 86, 20);
		contentPane.add(textAddress);
		textAddress.setColumns(10);
		
		JLabel lbMobileNumber = new JLabel("MOBILE NO");
		lbMobileNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lbMobileNumber.setBounds(59, 260, 100, 14);
		contentPane.add(lbMobileNumber);
		
		textMobile = new JTextField();
		textMobile.setHorizontalAlignment(SwingConstants.CENTER);
		textMobile.setBounds(212, 257, 86, 20);
		contentPane.add(textMobile);
		textMobile.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
			     {
				BufferedWriter bw2=new BufferedWriter(new FileWriter("EmployeeList.txt",true));
				 BufferedReader bR2 = new BufferedReader( new FileReader("EmployeeList.txt") );
				 boolean empty;
				 
			      if(empty = bR2.readLine() == null ) {
			    	  employeeID=111;
			      }
			      else {
			    	  employeeID=employeeID+1;
			      }
			      Password=textEmployeeName.getText();
			      EmployeeName=textEmployeeName.getText();
			      Designation=textDesignation.getText();
			      Address=textAddress.getText();
			      Mobile=textMobile.getText();
			       bw2.write(employeeID+","+EmployeeName+","+Designation+","+Address+","+Mobile+","+Password);
			       bw2.flush();
			       bw2.newLine();
			       bw2.close();
			       JOptionPane.showMessageDialog(null,"Employee Added");
			      }
			     
			     catch(Exception ex)
			     {
			      System.out.println("Exception msg: "+ex);
			     }
			    

			}
		});

		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBounds(143, 297, 89, 23);
		contentPane.add(btnAdd);
	}

}
