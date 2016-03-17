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

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;


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
    
    // Constructors
    
    //## operation VueLCD() 
    public  VueLCD() {
        //#[ operation VueLCD() 
        //#]
    	initComponents();
    	this.setVisible(true);
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

        setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }                        
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LCD/VueLCD.java
*********************************************************************/

