import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class AddOrder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddOrder frame = new AddOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public AddOrder() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 823);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblOrderId = new JLabel("Order ID");
		
		File file = new File("OrderID.txt");
		Scanner inputFile = new Scanner(file);
		String str = "";
		while (inputFile.hasNext())
		{
			str = inputFile.nextLine();
		}
		int orderCount = Integer.parseInt(str);
		
		orderCount += 1;
		inputFile.close();
	
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setText(str);
		
		JLabel lblRetailerId = new JLabel("Customer Name");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setText(dtf.format(localDate));
		

		DefaultListModel model = new DefaultListModel();
		JList list_1 = new JList(model);
		
		File file1 = new File("ProductList.txt");
		Scanner inputFile1 = new Scanner(file1);
		String str1 = "";
		String arr11[] = new String[1000];
		int wi=0;
		while (inputFile1.hasNext())
		{
			str1 = inputFile1.nextLine();
			arr11[wi] = str1;
			wi = wi + 1;
		}
		String[] s4 = new String[100];
		String[] s5 = new String[100];
		for(int i =0;i<wi;i++)
		{
			String[] s1 = arr11[i].split(",");
			//String s3 = s1[1];
			s4[i] = s1[1];
			s5[i]=s1[3];
		}
		//String[] s3 = null;
		
		JList list = new JList(s4);
		String[] s6 = new String[100];
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("ADD")) {
	            int index = list.getSelectedIndex();
	            String s = (String)list.getSelectedValue();
	         //   String[] s1 = s.split("@");
	           
	            model.add(0,s);
	            String amount1 = textField_8.getText();
	          //  String amount = s5[index];
	            
	            int amount = Integer.parseInt(s5[index]);
	            int amount2 = Integer.parseInt(amount1);
	            amount += amount2;
	            amount1 = Integer.toString(amount);
	            textField_8.setText(amount1);
		
			}
			}
		});
		double disc,amoun;
		
		JLabel lblNewLabel = new JLabel("List of Items");
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("OK")) {
				String ds = textField.getText();
				PrintWriter orderid = null;
				try {
					orderid = new PrintWriter(ds+".txt");
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
					System.out.println("@@@");
		          orderid.println("Date : "+ textField_2.getText());
		          orderid.println("Order Number : "+ textField.getText());
		          orderid.println("Customer Name : "+ textField_1.getText());
		          orderid.println("Customer Address : "+ textField_4.getText());
		          orderid.println("Customer mobile No. : "+ textField_5.getText());
		          orderid.println("Customer Email ID : "+ textField_6.getText());
		          orderid.println("Amount : "+ textField_8.getText());
		       //   orderid.println("Total : "+ textField_3.getText());
		          orderid.println();
		          orderid.println("----------------------------------------------------------------------");
//		         
		          orderid.println();
//		          
		          orderid.println();
		          orderid.close();
		          
		          
		          FileWriter fw1 = null;
		          try {
					fw1 = new FileWriter("OrderID.txt",true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		          PrintWriter orderno = new PrintWriter(fw1);
		          int orderno1 = Integer.parseInt(textField.getText());
		          
		          orderno.println(orderno1+1);
		          orderno.close();
		          JOptionPane.showMessageDialog(null,"Product Ordered");
		        //  Dashboard db = new Dashboard();
					//db.setVisible(true);
					//setVisible(false);
		          
		          
		          
			}
				}
			});
		
		JLabel lblAddress = new JLabel("Address");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile No.");
		
		JLabel lblNewLabel_2 = new JLabel("Mail");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Amount");
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setText("0");
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			//	Dashboard db = new Dashboard();
				//db.setVisible(true);
				//setVisible(false);
				}
			});
	
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddress)
					.addContainerGap(764, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(69)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(657, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(39)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
							.addComponent(btnAdd)
							.addGap(66)
							.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRetailerId)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
											.addComponent(lblDate)
											.addGap(29)
											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, 402, 402, 402)))
								.addComponent(lblOrderId, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))))
					.addGap(67)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnCancel)
							.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
							.addComponent(btnOk)
							.addGap(42))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addGap(39)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(63, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOrderId)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDate)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblRetailerId)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblAddress)
							.addGap(29)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2))))
					.addGap(52)
					.addComponent(lblNewLabel)
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnAdd)
							.addGap(369))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
									.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(29)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_3)
										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(146)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnOk)
								.addComponent(btnCancel))
							.addGap(24))))
		);
		
		
		panel.setLayout(gl_panel);
	}


}
