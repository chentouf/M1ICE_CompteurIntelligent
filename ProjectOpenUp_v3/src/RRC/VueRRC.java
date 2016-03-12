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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Compteur.ModeleCompteur;

//----------------------------------------------------------------------------
// RRC/VueRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class VueRRC 
public class VueRRC extends JFrame implements Observer {
    
    // Constructors
	JLabel lPrixhp = new JLabel("Prix en vigueur HP");
	JLabel lPrixhc = new JLabel("Prix en vigeur HC");
	JLabel lDuree = new JLabel("Durée entre les mesures");
	JTextArea tPrixhp = new JTextArea();
	JTextArea tPrixhc = new JTextArea();
	JTextArea tDuree = new JTextArea();
	
    //## operation VueRRC() 
    public  VueRRC() {
        super();
        build();
    }
    
    public void build()
    {
    	this.setTitle("Simulation Compteur");
        this.setSize(400, 100);
        this.setVisible(true);
    	setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
    }
    
    private JPanel buildContentPane()
    {
    	JPanel panelPrincipal = new JPanel();
    	panelPrincipal.setLayout(new BorderLayout());
    	JPanel panelHaut = new JPanel();
    	panelHaut.setLayout(new GridLayout(2,3));
    	panelHaut.add(lPrixhp);
    	panelHaut.add(lPrixhc);
    	panelHaut.add(lDuree);
    	panelHaut.add(tPrixhp);
    	panelHaut.add(tPrixhc);
    	panelHaut.add(tDuree);
    	panelPrincipal.add(panelHaut,BorderLayout.CENTER);
    	JPanel panelBas = new JPanel();
    	panelBas.setLayout(new BorderLayout());
    	JButton bModifier = new JButton("Modifier");
    	panelBas.add(bModifier, BorderLayout.EAST);
    	panelPrincipal.add(panelBas,BorderLayout.SOUTH);
    	return panelPrincipal;
    }


	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		ModeleRRC modele;

		if(arg0 == null){
			System.out.println("erreur");
			return;
		}
		
		if(arg0 instanceof ModeleRRC){
			modele = (ModeleRRC)arg0;
			tPrixhc.setText( ""+ modele.getPrixEnVigueurHc());
			tPrixhp.setText(""+ modele.getPrixEnVigeurHp());
			tDuree.setText(""+modele.getDuree());
		}
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/VueRRC.java
*********************************************************************/

