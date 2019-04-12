import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class Billing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BILLING ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(120, 11, 175, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnAddCustomer = new JButton("ADD CUSTOMER");
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AddCustomer addCust = new AddCustomer();
					setVisible(false);
					addCust.setVisible(true);
				}
					 catch (Exception e1) {
							e1.printStackTrace();
				}
			}
		});
		btnAddCustomer.setBounds(46, 110, 138, 23);
		contentPane.add(btnAddCustomer);
		
		JButton btnViewCustomer = new JButton("VIEW CUSTOMER");
		btnViewCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
			      {
			      
			       BufferedReader bR1 = new BufferedReader( new FileReader("CustomerList.txt") ); 
			       String record;
			       int i=0;
			       String DisplayView1[]=new String[1024];
			       System.out.println("ID |  NAME | ADDRESS | MOBILE NO\n");
			    	    for (int j = 0; j < 68; j++) {
			    	        System.out.print('=');
			    	    }
			    	    System.out.println();
			       
			       while( ( record = bR1.readLine() ) != null )
			       {
			       StringTokenizer st = new StringTokenizer(record,",");
			       String IDView,nameView,addressView,mobView;
			       IDView=st.nextToken();
			       nameView=st.nextToken();
			       addressView=st.nextToken();
			       mobView=st.nextToken();
			       DisplayView1[i]=(IDView+" | "+nameView+" | "+addressView+" | "+mobView+"\n");
			      System.out.println( DisplayView1[i]);
			       i++;
			       }
			       bR1.close();
			      }
				catch (FileNotFoundException e2){
				    System.out.println(e2);
				}
				catch (IOException e3){
				    System.out.println(e3);
				}

			}
		});

		btnViewCustomer.setBounds(46, 174, 138, 23);
		contentPane.add(btnViewCustomer);
		
		JButton btnNewButton = new JButton("ADD ORDER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(241, 110, 123, 23);
		contentPane.add(btnNewButton);
		
		JButton btnViewOrder = new JButton("VIEW ORDER");
		btnViewOrder.setBounds(241, 174, 123, 23);
		contentPane.add(btnViewOrder);
	}

}
