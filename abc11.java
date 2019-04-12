import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
/**
	 * Launch the application.
	 */
/**
	 * Create the application.
	 */



import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;



	public class abc11 extends javax.swing.JFrame {

	    /**
	     * Creates new form Java_JTable_Add_Row_Using_TextBoxes
	     */
	    public abc11() {
	        initComponents();
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                         
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jTextFieldID = new javax.swing.JTextField();
	        jTextFieldFN = new javax.swing.JTextField();
	        jTextFieldLN = new javax.swing.JTextField();
	        jTextFieldAGE = new javax.swing.JTextField();
	        btnAddRow = new javax.swing.JButton();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
	        jLabel1.setText("Id :");

	        jLabel2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
	        jLabel2.setText(" Name :");

	        jLabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
	        jLabel3.setText("Designation");

	        jLabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
	        jLabel4.setText("Age :");

	        btnAddRow.setText("add data");
	        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnAddRowActionPerformed(evt);
	            }
	        });

	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Id", "Name", "designation", "Age"
	            }
	        ));
	        jScrollPane1.setViewportView(jTable1);
	        
	        lblEmployeePage = new JLabel("Employee page");
	        lblEmployeePage.setFont(new Font("Tahoma", Font.BOLD, 18));

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addContainerGap()
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        							.addComponent(jLabel1)
	        							.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
	        							.addComponent(jTextFieldID, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
	        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        							.addComponent(jLabel2)
	        							.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
	        							.addComponent(jTextFieldFN, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
	        						.addComponent(btnAddRow, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
	        						.addGroup(layout.createSequentialGroup()
	        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        								.addComponent(jLabel3)
	        								.addGroup(layout.createSequentialGroup()
	        									.addGap(8)
	        									.addComponent(jLabel4)))
	        							.addPreferredGap(ComponentPlacement.UNRELATED)
	        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        								.addComponent(jTextFieldAGE, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
	        								.addComponent(jTextFieldLN, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))))
	        					.addGap(18))
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(23)
	        					.addComponent(lblEmployeePage)
	        					.addPreferredGap(ComponentPlacement.RELATED)))
	        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(29, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap(14, Short.MAX_VALUE)
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(2)
	        					.addComponent(lblEmployeePage)
	        					.addGap(18)
	        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(jTextFieldID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	        					.addGap(18)
	        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(jTextFieldFN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	        					.addGap(18)
	        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(jTextFieldLN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        					.addGap(18)
	        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(jTextFieldAGE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	        					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
	        					.addComponent(btnAddRow, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	        					.addGap(21))
	        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
	        					.addContainerGap())))
	        );
	        getContentPane().setLayout(layout);

	        pack();
	    }// </editor-fold>                       

	    // button to add the row to the jtable 
	    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {                                          
	       // get the model from the jtable
	        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

	         // insert row to the model from jtextfields using addRow method
	        model.addRow(new Object[]{jTextFieldID.getText(), jTextFieldFN.getText(),
	                                  jTextFieldLN.getText(), jTextFieldAGE.getText()});

	        
	    }                                       

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(abc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(abc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(abc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(abc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new abc().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                   
	    private javax.swing.JButton btnAddRow;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTable jTable1;
	    private javax.swing.JTextField jTextFieldAGE;
	    private javax.swing.JTextField jTextFieldFN;
	    private javax.swing.JTextField jTextFieldID;
	    private javax.swing.JTextField jTextFieldLN;
	    private JLabel lblEmployeePage;
	    // End of variables declaration                 
	





	/**
	 * Initialize the contents of the frame.
	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


