/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurLED
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/LED/ControleurLED.java
*********************************************************************/

package LED;


//----------------------------------------------------------------------------
// LED/ControleurLED.java                                                                  
//----------------------------------------------------------------------------

//## package LED 


//## class ControleurLED 
public class ControleurLED {
    
    protected ModeleLED modeleLED;		//## link modeleLED 
    
    protected VueLED vueLED;		//## link vueLED 
    
    
    // Constructors
    
    /**
     * @param modeleLED
     * @param vueLED
    */
    //## operation ControleurLED(ModeleLED,VueLED) 
    public  ControleurLED() {
        this.modeleLED = new ModeleLED();
        this.vueLED = new VueLED();
        this.modeleLED.addObserver(vueLED);
    }
    
    //## auto_generated 
    public ModeleLED getModeleLED() {
        return modeleLED;
    }
    
    //## auto_generated 
    public void setModeleLED(ModeleLED p_ModeleLED) {
        modeleLED = p_ModeleLED;
    }
    
    //## auto_generated 
    public VueLED getVueLED() {
        return vueLED;
    }
    
    //## auto_generated 
    public void setVueLED(VueLED p_VueLED) {
        vueLED = p_VueLED;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LED/ControleurLED.java
*********************************************************************/

