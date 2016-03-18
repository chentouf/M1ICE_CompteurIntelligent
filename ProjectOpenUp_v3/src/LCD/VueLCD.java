/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: VueLCD
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/LCD/VueLCD.java
*********************************************************************/

package LCD;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


//----------------------------------------------------------------------------
// LCD/VueLCD.java                                                                  
//----------------------------------------------------------------------------

//## package LCD 


//## class VueLCD 
public class VueLCD extends JPanel implements Observer{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String display;		//## attribute display 
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private int compteur ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private ControleurLCD controleur;
    // Constructors
	private JTextField jTextField1;
	private JPanel jPanel1;
    
    //## operation VueLCD() 
    public  VueLCD(ControleurLCD controleur) {
        //#[ operation VueLCD() 
        //#]
    	initComponents();
    	this.setVisible(true);
    	this.controleur = controleur;
    }
    
    //## auto_generated 
    public String getDisplay() {
        return display;
    }
    
    //## auto_generated 
    public void setDisplay(String p_display) {
        display = p_display;
    }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		ModeleLCD modele;
		if(o instanceof ModeleLCD){
			modele = (ModeleLCD)o;
			display = modele.getDonneesAAfficher();
			jTextArea1.setText(display);
			
		}
	}
                         
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        
        jButton1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e){
        		controleur.ajouterCompteur();
        	}
		});
        
        jButton2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e){
        		controleur.supprimerCompteur(Integer.parseInt(jTextField1.getText()));
        	}
		});
        
        setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jButton1.setText("Ajouter un compteur");
        
        jPanel1.add(jButton1);

        jTextField1.setColumns(3);
        jPanel1.add(jTextField1);

        jButton2.setText("Supprimer compteur");
        jPanel1.add(jButton2);
        
        add(jScrollPane1, java.awt.BorderLayout.CENTER);
        add(jPanel1, java.awt.BorderLayout.PAGE_END);
        
    }
    
    public void ajouterCompteur(){};
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LCD/VueLCD.java
*********************************************************************/

