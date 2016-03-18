package client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.JFrame;

import Compteur.Client;
import RRC.ControleurRRC;

public class VueClientClient extends JFrame {

	/**
	 * 
	 */
	private Client c;
	private ControleurClient ctrlc;
	private static final long serialVersionUID = 1L;
	
	public VueClientClient(Client c, ControleurClient ctrlc){
		this.c = c;
		initComponents();
		this.setVisible(true);
		this.ctrlc = ctrlc;
    }
                                               
    private void initComponents() {
    	
    	Calendar cal = Calendar.getInstance();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDate1 = new javax.swing.JTextField();
        jDate2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jLabel3.setText("Debut");
        jPanel1.add(jLabel3);

        jLabel4.setText("Fin");
        jPanel1.add(jLabel4);
        jPanel1.add(jDate1);
        jPanel1.add(jDate2);

        jButton1.setText("Imprimer facture");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Bonjour");
        jPanel2.add(jLabel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)+1);
        jDate1.setText(new SimpleDateFormat("dd/MM/yyy").format(new Date()));
        jDate2.setText(new SimpleDateFormat("dd/MM/yyy").format(cal.getTime()));
        
        pack();
    }                     
                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){                                         
        // TODO add your handling code here:
    	DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
    	Date d1;
    	Date d2;
    	
		try {
			d1 = format.parse(jDate1.getText());
			d2 = format.parse(jDate2.getText());
	    	this.ctrlc.produireFacture(d1,d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jDate2;
    private javax.swing.JTextField jDate1;
    // End of variables declaration                   
}