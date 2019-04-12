import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.awt.ScrollPane;
import java.util.Locale;

public class startpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startpage frame = new startpage();
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
	public startpage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 463);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to PET SUPPLY STORE");
		lblWelcomeToThe.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblWelcomeToThe.setBounds(233, 13, 655, 53);
		contentPane.add(lblWelcomeToThe);
		
		JButton btnNewButton = new JButton("Customer");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(628, 207, 309, 62);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JComboBox comboBox = new JComboBox();

				String y=(String)comboBox.getSelectedItem();
				//System.out.println(y);
				if(y.equals("Admin"))
				{
					//System.out.println("you are logged as admin");
					setVisible(false);
					loginpage admlgn = new loginpage();
					admlgn.setVisible(true);
					
					
					}
				else
				{
					//System.out.println("you are logged as customer");
					customerlogin lblgn = new customerlogin();
					lblgn.setVisible(true);
					
					}
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Customer"}));
		comboBox.setBounds(410, 240, 125, 53);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("please select your designation");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(50, 226, 332, 75);
		contentPane.add(lblNewLabel);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
