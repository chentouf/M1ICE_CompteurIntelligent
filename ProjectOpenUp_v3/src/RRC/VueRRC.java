/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: VueRRC
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/RRC/VueRRC.java
*********************************************************************/

package RRC;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Compteur.ModeleCompteur;

//----------------------------------------------------------------------------
// RRC/VueRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class VueRRC 
public class VueRRC extends JFrame{
	
	ModeleRRC mRRC ;
    

    public JTextField tPrixHP = new JTextField() ;
    public JTextField tPrixHC = new JTextField() ;
    public JTextField tDuree = new JTextField() ;
    
    public JPanel buildContentPane()
    {
        JLabel lPrixHP = new JLabel("Prix HP :");
        JLabel lPrixHC  = new JLabel("Prix HC :");
        JLabel lDuree = new JLabel("Duree entre les mesures :");
        
    	JPanel pPrincipal = new JPanel();
    	JPanel pHaut = new JPanel();
    	JPanel pBas = new JPanel();
    	
    	pPrincipal.setLayout(new BorderLayout());
    	pHaut.setLayout(new GridLayout(3,2));
    	pBas.setLayout(new BorderLayout());
    	
    	miseAJourAffichage();
    	
    	pHaut.add(lPrixHP);
    	pHaut.add(tPrixHP);
    	pHaut.add(lPrixHC);
    	pHaut.add(tPrixHC);
    	pHaut.add(lDuree);
    	pHaut.add(tDuree);
    	
    	JButton bModifier = new JButton("Modifier");
    	pBas.add(bModifier, BorderLayout.EAST);
    	bModifier.addMouseListener(new MouseAdapter() {
    		public void mouseClick(MouseEvent e)
    		{
    			miseAJourRRC();
    			System.out.println("MODELE : "+ mRRC.getPrixEnVigeurHp() +" :: "+ mRRC.getPrixEnVigueurHc() +" :: "+mRRC.getDuree() );
    		}
		});
    	
    	pPrincipal.add(pHaut, BorderLayout.CENTER);
    	pPrincipal.add(pBas, BorderLayout.SOUTH);
    	
    	pPrincipal.setVisible(true);
    	
		return pPrincipal;
    }
    
    public void build()
    {
    	this.setTitle("Paramatrage RRC");
        this.setSize(400, 150);
        this.add(buildContentPane());
        this.setVisible(true);
    	setLocationRelativeTo(null); 
		setResizable(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
	
    //## operation VueRRC() 
    public  VueRRC(ModeleRRC m) {
		mRRC = m ;
		build();
    }

	private void miseAJourAffichage() {
    	tPrixHP.setText(""+mRRC.getPrixEnVigeurHp());
    	tPrixHC.setText(""+mRRC.getPrixEnVigueurHc());
    	tDuree.setText(""+mRRC.duree);
	}
	
	private void miseAJourRRC()
	{
		mRRC.setPrixEnVigeurHp((Integer.parseInt(tPrixHP.getText()))); 
		mRRC.setPrixEnVigueurHc((Integer.parseInt(tPrixHC.getText()))); 
		mRRC.setDuree(((Integer.parseInt(tDuree.getText())))); 
	}
    
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/VueRRC.java
*********************************************************************/

