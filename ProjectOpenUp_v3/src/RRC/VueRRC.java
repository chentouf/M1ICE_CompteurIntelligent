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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Compteur.ModeleCompteur;
import Compteur.ModeleCompteurDate;

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
    public JTextArea tMesures = new JTextArea();
    
    public JPanel buildContentPane()
    {
        JLabel lPrixHP = new JLabel("Prix HP :");
        JLabel lPrixHC  = new JLabel("Prix HC :");
        JLabel lDuree = new JLabel("Duree entre les mesures :");
        
        JPanel pPrincipal = new JPanel();
        pPrincipal.setLayout(new GridLayout(2,1));
        
    	JPanel pParametrage = new JPanel();
    	JPanel pHaut = new JPanel();
    	JPanel pBas = new JPanel();
    	    	
    	pParametrage.setLayout(new BorderLayout());
    	pHaut.setLayout(new GridLayout(3,2));
    	pBas.setLayout(new BorderLayout());
    	
    	miseAJourParametrage();
    	
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
    			miseAJourParametrageRRC();
    			System.out.println("MODELE : "+ mRRC.getPrixEnVigeurHp() +" :: "+ mRRC.getPrixEnVigueurHc() +" :: "+mRRC.getDuree() );
    		}
		});
    	
    	pParametrage.add(pHaut, BorderLayout.CENTER);
    	pParametrage.add(pBas, BorderLayout.SOUTH);
    	
    	JPanel pAffichage = new JPanel();
    	pAffichage.setLayout(new BorderLayout());
    	JLabel lTitreAffichage = new JLabel("Mesures des compteurs reçues");
    	pAffichage.add(lTitreAffichage, BorderLayout.NORTH);
    	pAffichage.add(tMesures, BorderLayout.CENTER);
    	
    	pPrincipal.add(pParametrage);
    	pPrincipal.add(pAffichage);
    	
    	pPrincipal.setVisible(true);
    	
		return pPrincipal;
    }
    
    public void build()
    {
    	this.setTitle("Paramatrage RRC");
        this.setSize(400, 300);
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

	private void miseAJourParametrage() {
    	tPrixHP.setText(""+mRRC.getPrixEnVigeurHp());
    	tPrixHC.setText(""+mRRC.getPrixEnVigueurHc());
    	tDuree.setText(""+mRRC.duree);
	}
	
	private void miseAJourParametrageRRC()
	{
		mRRC.setPrixEnVigeurHp((Integer.parseInt(tPrixHP.getText()))); 
		mRRC.setPrixEnVigueurHc((Integer.parseInt(tPrixHC.getText()))); 
		mRRC.setDuree(((Integer.parseInt(tDuree.getText())))); 
	}
    
	void miseAJourAffichageMesures() {
		
		Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> releve = mRRC.mesure;
		
		
    	for(Entry<ModeleCompteur,LinkedList<ModeleCompteurDate>> elem : releve.entrySet()){	    		

		System.out.println("P - Compteur : "+elem.getKey().getId()+" :: "+elem.getKey().getHc()+" "+elem.getKey().getHp());
		for(ModeleCompteurDate m : elem.getValue()){
			
			tMesures.setText(m.getDisplay());
			System.out.println(m.getDisplay());
			
		}
	}
    
	}}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/VueRRC.java
*********************************************************************/

