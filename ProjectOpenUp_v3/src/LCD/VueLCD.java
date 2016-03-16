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

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;


//----------------------------------------------------------------------------
// LCD/VueLCD.java                                                                  
//----------------------------------------------------------------------------

//## package LCD 


//## class VueLCD 
public class VueLCD extends JTextArea implements Observer{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String display;		//## attribute display 
    
    
    // Constructors
    
    //## operation VueLCD() 
    public  VueLCD() {
        //#[ operation VueLCD() 
        //#]
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
			System.out.println(display);
			this.setText(display);
		}
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LCD/VueLCD.java
*********************************************************************/

