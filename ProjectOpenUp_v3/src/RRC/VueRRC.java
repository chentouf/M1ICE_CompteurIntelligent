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
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Compteur.ModeleCompteur;

//----------------------------------------------------------------------------
// RRC/VueRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class VueRRC 
public class VueRRC implements Observer{
    

    public JTextArea tPrixHP ;
    public JTextArea tPrixHC ;
    public JTextArea tDuree ;
    
    public JPanel createJPane()
    {
        JLabel lPrixHP = new JLabel("Prix HP :");
        JLabel lPrixHC  = new JLabel("Prix HC :");
        JLabel lDuree = new JLabel("Duree entre les mesures :");
    	JPanel pPrincipal = new JPanel();
    	JPanel pHaut = new JPanel();
    	JPanel pBas = new JPanel();
    	pPrincipal.setLayout(new BorderLayout());
    	pHaut.setLayout(new GridLayout(2,3));
    	pBas.setLayout(new BorderLayout());
    	pHaut.add(lPrixHP);
    	pHaut.add(tPrixHP);
    	pHaut.add(lPrixHC);
    	pHaut.add(tPrixHC);
    	pHaut.add(lDuree);
    	pHaut.add(tDuree);
    	JButton bModifier = new JButton("Modifier");
    	pBas.add(bModifier, BorderLayout.EAST);
    	pPrincipal.add(pHaut, BorderLayout.CENTER);
    	pPrincipal.add(pBas, BorderLayout.SOUTH);
    	
		return pPrincipal;
    }
	
    //## operation VueRRC() 
    public  VueRRC() {

    }

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		ModeleRRC modele;
		
		if(arg0 == null){
			System.out.println("erreur");
			return;
		}
		
		if(arg0 instanceof ModeleCompteur){
			modele = (ModeleRRC)arg0;
			tPrixHP.setText(""+modele.prixEnVigueurHp);
			tPrixHC.setText(""+modele.prixEnVigueurHc);
			tDuree.setText(""+modele.duree);
		}
	}
    
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/VueRRC.java
*********************************************************************/

