/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ModeleLCD
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/LCD/ModeleLCD.java
*********************************************************************/

package LCD;

import java.util.Observable;


//----------------------------------------------------------------------------
// LCD/ModeleLCD.java                                                                  
//----------------------------------------------------------------------------

//## package LCD 


//## class ModeleLCD 
public class ModeleLCD extends Observable {
    
    protected String donneesAAfficher;		//## attribute donneesAAfficher 
    
    
    // Constructors
    
    //## operation ModeleLCD() 
    public  ModeleLCD() {
        //#[ operation ModeleLCD() 
        //#]
    }
    
    //## auto_generated 
    public String getDonneesAAfficher() {
        return donneesAAfficher;
    }
    
    //## auto_generated 
    public void setDonneesAAfficher(String p_donneesAAfficher) {
    	
        donneesAAfficher = p_donneesAAfficher;
        
        setChanged();
        notifyObservers();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LCD/ModeleLCD.java
*********************************************************************/

