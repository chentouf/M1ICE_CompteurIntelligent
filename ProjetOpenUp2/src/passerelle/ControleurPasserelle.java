/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurPasserelle
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/

package passerelle;

//## auto_generated
import java.util.*;

//## link itsModeleLCD_1 
import lcd.ModeleLCD;
//## link itsModeleLED_1 
import led.ModeleLED;
//## class ControleurPasserelle 
//## link itsControleurCompteur_1 
import Compteur.ControleurCompteur;

//----------------------------------------------------------------------------
// Passerelle/ControleurPasserelle.java                                                                  
//----------------------------------------------------------------------------

//## package Passerelle 


//## class ControleurPasserelle 
public class ControleurPasserelle implements Observer {
    
    protected ArrayList<ControleurCompteur> itsControleurCompteur_1 = new ArrayList<ControleurCompteur>();		//## link itsControleurCompteur_1 
    
    protected ModeleLCD itsModeleLCD_1;		//## link itsModeleLCD_1 
    
    protected ArrayList<ModeleLED> itsModeleLED_1 = new ArrayList<ModeleLED>();		//## link itsModeleLED_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  ControleurPasserelle() {
    }
    
    //## operation getConsoGenerale() 
    public int getConsoGenerale() {
        //#[ operation getConsoGenerale() 
        //#]
    	int result=0;
    	
    	for(ControleurCompteur elem : itsControleurCompteur_1)
    		result += elem.getConso();
    	
    	return result;
    }
    
    //## auto_generated 
    public ListIterator<ControleurCompteur> getItsControleurCompteur_1() {
        ListIterator<ControleurCompteur> iter = itsControleurCompteur_1.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void addItsControleurCompteur_1(ControleurCompteur p_ControleurCompteur) {
        itsControleurCompteur_1.add(0, p_ControleurCompteur);
    }
    
    //## auto_generated 
    public void removeItsControleurCompteur_1(ControleurCompteur p_ControleurCompteur) {
        itsControleurCompteur_1.remove(p_ControleurCompteur);
    }
    
    //## auto_generated 
    public void clearItsControleurCompteur_1() {
        itsControleurCompteur_1.clear();
    }
    
    //## auto_generated 
    public ModeleLCD getItsModeleLCD_1() {
        return itsModeleLCD_1;
    }
    
    //## auto_generated 
    public void setItsModeleLCD_1(ModeleLCD p_ModeleLCD) {
        itsModeleLCD_1 = p_ModeleLCD;
    }
    
    //## auto_generated 
    public ListIterator<ModeleLED> getItsModeleLED_1() {
        ListIterator<ModeleLED> iter = itsModeleLED_1.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void addItsModeleLED_1(ModeleLED p_ModeleLED) {
        itsModeleLED_1.add(0, p_ModeleLED);
    }
    
    //## auto_generated 
    public void removeItsModeleLED_1(ModeleLED p_ModeleLED) {
        itsModeleLED_1.remove(p_ModeleLED);
    }
    
    //## auto_generated 
    public void clearItsModeleLED_1() {
        itsModeleLED_1.clear();
    }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/

