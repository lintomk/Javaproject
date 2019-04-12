import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.File;
public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Welcome Admin!!!");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdmin.setBounds(75, 29, 265, 35);
		contentPane.add(lblAdmin);
		
		JButton btnAddProduct = new JButton("ADD PRODUCT");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AddProduct addProd = new AddProduct();
					setVisible(false);
					addProd.setVisible(true);
				}
					 catch (Exception e1) {
							e1.printStackTrace();
				}
			}
		});
		btnAddProduct.setBounds(45, 109, 127, 23);
		contentPane.add(btnAddProduct);
		
		JButton btnViewProduct = new JButton("VIEW PRODUCT");
		btnViewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
			      {
					File f = new File("ProductList.txt");
					if(f.exists()) {
			       BufferedReader bR1 = new BufferedReader( new FileReader("ProductList.txt") ); 
			       String record;
			       int i=0;
			       String DisplayView1[]=new String[1024];
			       System.out.println("ID |  NAME | TYPE | PRICE\n");
			    	    for (int j = 0; j < 68; j++) {
			    	        System.out.print('=');
			    	    }
			    	    System.out.println();
			       
			       while( ( record = bR1.readLine() ) != null )
			       {
			       StringTokenizer st = new StringTokenizer(record,",");
			       String IDView,nameView,typeView,priceView;
			       IDView=st.nextToken();
			       nameView=st.nextToken();
			       typeView=st.nextToken();
			       priceView=st.nextToken();
			       DisplayView1[i]=(IDView+" | "+nameView+" | "+typeView+" | "+priceView+"\n");
			      System.out.println( DisplayView1[i]);
			       i++;
			       }
			       bR1.close();
			      }
			      }
				catch (FileNotFoundException e2){
				    System.out.println(e2);
				}
				catch (IOException e3){
				    System.out.println(e3);
				}

			}
		});
		btnViewProduct.setHorizontalAlignment(SwingConstants.RIGHT);
		btnViewProduct.setBounds(45, 178, 127, 23);
		contentPane.add(btnViewProduct);
		
		JButton btnAddEmployee = new JButton("ADD EMPLOYEE");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AddEmployee addEmp = new AddEmployee();
					setVisible(false);
					addEmp.setVisible(true);
				}
					 catch (Exception e1) {
							e1.printStackTrace();
				}
			}
		});
		btnAddEmployee.setBounds(234, 109, 127, 23);
		contentPane.add(btnAddEmployee);
		
		JButton btnViewEmployee = new JButton("VIEW EMPLOYEE");
		btnViewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
			      {
					File f = new File("EmployeeList.txt");
					if(f.exists()) {
			       BufferedReader bR1 = new BufferedReader( new FileReader("EmployeeList.txt") ); 
			       String record;
			       int i=0;
			       String DisplayView1[]=new String[1024];
			       System.out.println("ID |  NAME | DESIGNATION | ADDRESS | MOBILE NO\n");
			    	    for (int j = 0; j < 68; j++) {
			    	        System.out.print('=');
			    	    }
			    	    System.out.println();
			       
			       while( ( record = bR1.readLine() ) != null )
			       {
			       StringTokenizer st = new StringTokenizer(record,",");
			       String IDView,nameView,designationView,addressView,mobView;
			       IDView=st.nextToken();
			       nameView=st.nextToken();
			       designationView=st.nextToken();
			       addressView=st.nextToken();
			       mobView=st.nextToken();
			       DisplayView1[i]=(IDView+" | "+nameView+" | "+designationView+" | "+addressView+" | "+mobView+"\n");
			      System.out.println( DisplayView1[i]);
			       i++;
			       }
			       bR1.close();
			      }
			      }
				catch (FileNotFoundException e2){
				    System.out.println(e2);
				}
				catch (IOException e3){
				    System.out.println(e3);
				}

			}
		});
		btnViewEmployee.setBounds(234, 178, 127, 23);
		contentPane.add(btnViewEmployee);
	}

}
