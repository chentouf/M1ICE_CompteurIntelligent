/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ModeleLED
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/LED/ModeleLED.java
*********************************************************************/

package LED;

import java.awt.Color;
import java.util.Observable;


//----------------------------------------------------------------------------
// LED/ModeleLED.java                                                                  
//----------------------------------------------------------------------------

//## package LED 


//## class ModeleLED 
public class ModeleLED extends Observable {
    
    protected Color etatAAfficher;		//## attribute etatAAfficher 
    
    
    // Constructors
    
    //## operation ModeleLED() 
    public  ModeleLED() {
    	super();
        //#[ operation ModeleLED() 
        //#]
    }
    
    //## auto_generated 
    public Color getEtatAAfficher() {
        return etatAAfficher;
    }
    
    //## auto_generated 
    public void setEtatAAfficher(Color p_etatAAfficher) {
        etatAAfficher = p_etatAAfficher;
        setChanged();
        notifyObservers(etatAAfficher);
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LED/ModeleLED.java
*********************************************************************/

