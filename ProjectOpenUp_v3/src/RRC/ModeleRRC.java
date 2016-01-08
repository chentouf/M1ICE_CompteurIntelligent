/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ModeleRRC
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

package RRC;

//## link itsControleurPasserelle 
import Passerelle.ControleurPasserelle;

//----------------------------------------------------------------------------
// RRC/ModeleRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class ModeleRRC 
public class ModeleRRC {
    
    protected int prixEnVigueur;		//## attribute prixEnVigueur 
    
    protected Object tabMesuresTraitees;		//## attribute tabMesuresTraitees 
    
    protected ControleurPasserelle itsControleurPasserelle;		//## link itsControleurPasserelle 
    
    
    // Constructors
    
    //## operation ModeleRRC() 
    public  ModeleRRC() {
        //#[ operation ModeleRRC() 
        //#]
    }
    
    //## operation produireFacture() 
    public void produireFacture() {
        //#[ operation produireFacture() 
        //#]
    }
    
    //## auto_generated 
    public int getPrixEnVigueur() {
        return prixEnVigueur;
    }
    
    //## auto_generated 
    public void setPrixEnVigueur(int p_prixEnVigueur) {
        prixEnVigueur = p_prixEnVigueur;
    }
    
    //## auto_generated 
    public Object getTabMesuresTraitees() {
        return tabMesuresTraitees;
    }
    
    //## auto_generated 
    public void setTabMesuresTraitees(Object p_tabMesuresTraitees) {
        tabMesuresTraitees = p_tabMesuresTraitees;
    }
    
    //## auto_generated 
    public ControleurPasserelle getItsControleurPasserelle() {
        return itsControleurPasserelle;
    }
    
    //## auto_generated 
    public void setItsControleurPasserelle(ControleurPasserelle p_ControleurPasserelle) {
        itsControleurPasserelle = p_ControleurPasserelle;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

