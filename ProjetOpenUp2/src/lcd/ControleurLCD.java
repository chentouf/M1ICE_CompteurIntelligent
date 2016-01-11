/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurLCD
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/LCD/ControleurLCD.java
*********************************************************************/

package lcd;

import java.util.Observable;
import java.util.Observer;

//## class ControleurLCD 

//----------------------------------------------------------------------------
// LCD/ControleurLCD.java                                                                  
//----------------------------------------------------------------------------

//## package LCD 


//## class ControleurLCD 
public class ControleurLCD implements Observer {
    
    protected ModeleLCD itsModeleLCD;		//## link itsModeleLCD 
    
    protected VueLCD itsVueLCD;		//## link itsVueLCD 
    
    
    // Constructors
    
    //## operation ControleurLCD() 
    public  ControleurLCD() {
        //#[ operation ControleurLCD() 
        //#]
    }
    
    //## auto_generated 
    public ModeleLCD getItsModeleLCD() {
        return itsModeleLCD;
    }
    
    //## auto_generated 
    public void setItsModeleLCD(ModeleLCD p_ModeleLCD) {
        itsModeleLCD = p_ModeleLCD;
    }
    
    //## auto_generated 
    public VueLCD getItsVueLCD() {
        return itsVueLCD;
    }
    
    //## auto_generated 
    public void setItsVueLCD(VueLCD p_VueLCD) {
        itsVueLCD = p_VueLCD;
    }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LCD/ControleurLCD.java
*********************************************************************/

