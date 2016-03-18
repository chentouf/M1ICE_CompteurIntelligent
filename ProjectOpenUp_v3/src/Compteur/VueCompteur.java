/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: VueCompteur
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Compteur/VueCompteur.java
*********************************************************************/

package Compteur;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//----------------------------------------------------------------------------
// Compteur/VueCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Compteur 


//## class VueCompteur 
public class VueCompteur extends JFrame implements Observer {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String display;		//## attribute display 
	private ModeleCompteur modele;
	public static boolean affich = true;
	
    
    // Constructors
	JLabel Compteur = new JLabel("Numero Compteur");
	JLabel hp = new JLabel("HP");
	JLabel hc = new JLabel("HC");
	JLabel idCompteur = new JLabel("");
	JLabel valeurHP = new JLabel("");
	JLabel valeurHC = new JLabel("");
	JButton disconnect = new JButton("ON/OFF");
	
    //## operation VueCompteur() 
	 public  VueCompteur() {
		super();
    }
	    
    public  VueCompteur(ModeleCompteur modele) {
		super();
		this.modele = modele;
		build();
    }
    
    public void build()
    {
    	this.setTitle("Simulation Compteur");
        this.setSize(400, 100);
        this.setVisible(affich);
        
        disconnect.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e){
        		modele.setConnection(
        				!modele.getConnection());
        	}
		});
        
        
    	setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setLayout(new BorderLayout());
		add(buildContentPane(),BorderLayout.CENTER);
		add(disconnect,BorderLayout.SOUTH);
    }
    
    private JPanel buildContentPane()
    {
    	JPanel panel = new JPanel();
    	panel.setLayout(new GridLayout(2,3));
    	panel.add(Compteur);
    	panel.add(hp);
    	panel.add(hc);
    	panel.add(idCompteur);
    	panel.add(valeurHP);
    	panel.add(valeurHC);
    	return panel;
    }
    //## operation majVue() 
    public void majVue() {
        //#[ operation majVue()
    	
        //#]
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
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		ModeleCompteur modele;
		//System.out.println("aloo");
		if(arg0 == null){
			System.out.println("erreur");
			return;
		}
		
		if(arg0 instanceof ModeleCompteur){
			modele = (ModeleCompteur)arg0;
			display = new String(modele.getId()+" : "+modele.getHc()+" / "+modele.getHp());
			idCompteur.setText(""+modele.getId());
			valeurHP.setText(""+modele.getHp());
			valeurHC.setText(""+modele.getHc());
			//System.out.println(modele.getId()+" : "+modele.getHc()+" / "+modele.getHp());
		}
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/VueCompteur.java
*********************************************************************/

