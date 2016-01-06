/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurPasserelle
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/

package Passerelle;

//## auto_generated
import java.util.*;
//## link modeleLCD 
import LCD.ModeleLCD;
//## link listeModeleLED 
import LED.ModeleLED;
//## link modeleRRC 
import RRC.ModeleRRC;

//----------------------------------------------------------------------------
// Passerelle/ControleurPasserelle.java                                                                  
//----------------------------------------------------------------------------

//## package Passerelle 


//## class ControleurPasserelle 
public class ControleurPasserelle {
    
    protected ArrayList<ModeleLED> listeModeleLED = new ArrayList<ModeleLED>();		//## link listeModeleLED 
    
    protected ModeleLCD modeleLCD;		//## link modeleLCD 
    
    protected ModelePasserelle modelePasserelle;		//## link modelePasserelle 
    
    protected ModeleRRC modeleRRC;		//## link modeleRRC 
    
    
    // Constructors
    
    /**
     * @param modeleLED1
     * @param modelePasserelle
     * @param modeleLED2
     * @param modeleLCD
     * @param modelePass
    */
    //## operation ControleurPasserelle(ModeleLED,ModelePasserelle,ModeleLED,ModeleLCD,ModelePasserelle) 
    public  ControleurPasserelle(ModeleLED modeleLED1, ModelePasserelle modelePasserelle, ModeleLED modeleLED2, ModeleLCD modeleLCD, ModelePasserelle modelePass) {
        //#[ operation ControleurPasserelle(ModeleLED,ModelePasserelle,ModeleLED,ModeleLCD,ModelePasserelle) 
        //#]
    }
    //## auto_generated 
    public  ControleurPasserelle() {
    }
    
    //## operation majSysteme() 
    public void majSysteme() {
        //#[ operation majSysteme() 
        //#]
    }
    
    //## auto_generated 
    public ListIterator<ModeleLED> getListeModeleLED() {
        ListIterator<ModeleLED> iter = listeModeleLED.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void addListeModeleLED(ModeleLED p_ModeleLED) {
        listeModeleLED.add(0, p_ModeleLED);
    }
    
    //## auto_generated 
    public void removeListeModeleLED(ModeleLED p_ModeleLED) {
        listeModeleLED.remove(p_ModeleLED);
    }
    
    //## auto_generated 
    public void clearListeModeleLED() {
        listeModeleLED.clear();
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
    public ModelePasserelle getModelePasserelle() {
        return modelePasserelle;
    }
    
    //## auto_generated 
    public void setModelePasserelle(ModelePasserelle p_ModelePasserelle) {
        modelePasserelle = p_ModelePasserelle;
    }
    
    //## auto_generated 
    public ModeleRRC getModeleRRC() {
        return modeleRRC;
    }
    
    //## auto_generated 
    public void setModeleRRC(ModeleRRC p_ModeleRRC) {
        modeleRRC = p_ModeleRRC;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/

