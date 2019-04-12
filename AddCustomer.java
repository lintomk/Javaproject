import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class AddCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textCustomerName;
	private JTextField textAddress;
	private JTextField textMobile;
	private String CustomerName,Address,Mobile;
	private int customerID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer();
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
	public AddCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddCustomer = new JLabel("ADD CUSTOMER");
		lblAddCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCustomer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddCustomer.setBounds(132, 37, 205, 22);
		contentPane.add(lblAddCustomer);
		
		JLabel lblCustomerName = new JLabel("CUSTOMER NAME");
		lblCustomerName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerName.setBounds(47, 82, 126, 14);
		contentPane.add(lblCustomerName);
		
		textCustomerName = new JTextField();
		textCustomerName.setBounds(205, 79, 86, 20);
		contentPane.add(textCustomerName);
		textCustomerName.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(87, 122, 46, 14);
		contentPane.add(lblAddress);
		
		textAddress = new JTextField();
		textAddress.setBounds(205, 119, 86, 20);
		contentPane.add(textAddress);
		textAddress.setColumns(10);
		
		JLabel lblMobileNumber = new JLabel("MOBILE NUMBER");
		lblMobileNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNumber.setBounds(64, 166, 126, 14);
		contentPane.add(lblMobileNumber);
		
		textMobile = new JTextField();
		textMobile.setBounds(205, 163, 86, 20);
		contentPane.add(textMobile);
		textMobile.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
			     {
				BufferedWriter bw3=new BufferedWriter(new FileWriter("CustomerList.txt",true));
				 BufferedReader br3 = new BufferedReader( new FileReader("CustomerList.txt") );
				 boolean empty;
				 
			      if(empty = br3.readLine() == null ) {
			    	  customerID=200;
			      }
			      else {
			    	  customerID=customerID+1;
			      }

			      CustomerName=textCustomerName.getText();
			      Address=textAddress.getText();
			      Mobile=textMobile.getText();
			      bw3.write(customerID+","+CustomerName+","+Address+","+Mobile);
			      bw3.flush();
			      bw3.newLine();
			      bw3.close();
			       JOptionPane.showMessageDialog(null,"Customer Added");
			      }
			     
			     catch(Exception ex)
			     {
			      System.out.println("Exception msg: "+ex);
			     }
			    

			}
		});

		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBounds(161, 215, 89, 23);
		contentPane.add(btnAdd);
	}

}
