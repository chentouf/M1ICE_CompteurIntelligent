package Passerelle;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import LCD.VueLCD;
import LED.VueLED;

public class VuePasserelle extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected VueLCD vueLCD;
	protected VueLED vueLEDEtatConnection;
	protected VueLED vueLEDAccesDistant;
	
	public  VuePasserelle(VueLED vueLEDEtatConnection2, VueLED vueLEDAccesDistant2,VueLCD vueLCD2 ) {
    	super();
    	vueLEDEtatConnection = vueLEDEtatConnection2;
    	vueLEDAccesDistant = vueLEDAccesDistant2;
    	vueLCD = vueLCD2;
		build();
		
       }

    public void build()
    {
    	this.setTitle("Simulation Passerelle");
        this.setSize(500, 200);
        this.setVisible(true);
    	setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
    }
    
    private JPanel buildContentPane()
    {
    	JPanel panel = new JPanel();
    	panel.setLayout(new GridLayout(1,2));
    	vueLEDAccesDistant.setDisplay(Color.green);
    	vueLEDEtatConnection.setDisplay(Color.green);
    	panel.add(vueLEDAccesDistant);
    	panel.add(vueLEDEtatConnection);
    	panel.add(vueLCD);
    	return panel;
    }
    
}
