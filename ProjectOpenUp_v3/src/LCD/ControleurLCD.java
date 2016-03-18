/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurLCD
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/LCD/ControleurLCD.java
*********************************************************************/

package LCD;


//----------------------------------------------------------------------------
// LCD/ControleurLCD.java                                                                  
//----------------------------------------------------------------------------

//## package LCD 


//## class ControleurLCD 
public class ControleurLCD {
    
    protected ModeleLCD modeleLCD;		//## link modeleLCD 
    
    protected VueLCD vueLCD;		//## link vueLCD 
    
    
    // Constructors
    
    /**
     * @param modeleLCD
     * @param vueLCD
    */
    //## auto_generated 
    public  ControleurLCD() {
    	this.modeleLCD = new ModeleLCD();
    	this.vueLCD = new VueLCD(this);
    	
    	modeleLCD.addObserver(vueLCD);
    }
    
    //## auto_generated 
    public ModeleLCD getModeleLCD() {
        return modeleLCD;
    }
    
    //## auto_generated 
    public void setModeleLCD(ModeleLCD p_ModeleLCD) {
        modeleLCD = p_ModeleLCD;
    }
    
    //## auto_generated 
    public VueLCD getVueLCD() {
        return vueLCD;
    }
    
    //## auto_generated 
    public void setVueLCD(VueLCD p_VueLCD) {
        vueLCD = p_VueLCD;
    }
    
    public void ajouterCompteur(){
    	
    }

	public void supprimerCompteur(int parseInt) {
		// TODO Auto-generated method stub
		
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/LCD/ControleurLCD.java
*********************************************************************/

