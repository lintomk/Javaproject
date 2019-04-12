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

public class AddProduct extends JFrame {

	private JPanel contentPane;
	private JTextField textProductName;
	private JTextField textProductType;
	private JTextField textPrice;
	private int productID;
	private String productName,productType,price;
	boolean empty;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddProduct = new JLabel("ADD PRODUCT");
		lblAddProduct.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddProduct.setBounds(144, 38, 241, 14);
		contentPane.add(lblAddProduct);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductName.setBounds(34, 108, 128, 14);
		contentPane.add(lblProductName);
		
		textProductName = new JTextField();
		textProductName.setBounds(183, 105, 86, 20);
		contentPane.add(textProductName);
		textProductName.setColumns(10);
		
		JLabel lblProductType = new JLabel("Product Type");
		lblProductType.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductType.setBounds(52, 152, 94, 14);
		contentPane.add(lblProductType);
		
		textProductType = new JTextField();
		textProductType.setBounds(183, 149, 86, 20);
		contentPane.add(textProductType);
		textProductType.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setBounds(52, 193, 94, 14);
		contentPane.add(lblPrice);
		
		textPrice = new JTextField();
		textPrice.setBounds(183, 190, 86, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try
			     {
				BufferedWriter bw1=new BufferedWriter(new FileWriter("ProductList.txt",true));
				 BufferedReader bR1 = new BufferedReader( new FileReader("ProductList.txt") );
			      if(empty = bR1.readLine() == null ) {
			    	  productID=1;
			      }
			      else {
			    	  productID=productID+1;
			      }

			       productName=textProductName.getText();
			       productType=textProductType.getText();
			       price=textPrice.getText();
			       bw1.write(productID+","+productName+","+productType+","+price);
			       bw1.flush();
			       bw1.newLine();
			       bw1.close();
			       JOptionPane.showMessageDialog(null,"Product Added");
			      }
			     
			     catch(Exception ex)
			     {
			      System.out.println("Exception msg: "+ex);
			     }
			    

			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd.setBounds(136, 227, 89, 23);
		contentPane.add(btnAdd);
	}

}
