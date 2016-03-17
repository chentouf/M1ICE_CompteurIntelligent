package Passerelle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    	JPanel main_panel = new JPanel();
    	main_panel.setLayout(new GridLayout(1,2));

    	main_panel.add(buildContentPaneLED());
    	
    	
    	//TODO : ihm lcd
    	main_panel.add(vueLCD);
    	
    	
    	this.setTitle("Simulation Passerelle");
        this.setSize(870, 400);
        this.setVisible(true);
    	setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(main_panel);
    }
    
    private JPanel buildContentPaneLED()
    {
    	JPanel panel = new JPanel();
    	panel.setLayout(new GridLayout(2,4));
    	
    	JPanel titre2 = new JPanel();
    	titre2.add(new JLabel("Etat generale des connexions"));
    	
    	JPanel titre3 = new JPanel();
    	titre3.add(new JLabel("Etat accees distant"));
    	panel.add(titre2);
    	panel.add(titre3);
    	vueLEDAccesDistant.setDisplay(Color.green);
    	vueLEDEtatConnection.setDisplay(Color.green);
    	panel.add(vueLEDAccesDistant);
    	panel.add(vueLEDEtatConnection);

    	return panel;
    }
    
}
