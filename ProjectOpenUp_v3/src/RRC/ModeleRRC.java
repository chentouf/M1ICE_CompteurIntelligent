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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import Passerelle.ControleurPasserelle;
import Compteur.ModeleCompteur;

//----------------------------------------------------------------------------
// RRC/ModeleRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class ModeleRRC 
public class ModeleRRC {
    
    protected int prixEnVigueur;		//## attribute prixEnVigueur 
    
    protected List<ModeleCompteur[]> tabMesuresTraitees;		//## attribute tabMesuresTraitees    
    
    // Constructors
    
    //## operation ModeleRRC() 
    public  ModeleRRC() {
        //#[ operation ModeleRRC() 
        //#]
    	this.tabMesuresTraitees = new ArrayList<ModeleCompteur[]>();
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
    public List<ModeleCompteur[]> getTabMesuresTraitees() {
        return tabMesuresTraitees;
    }
    
    //## auto_generated 
    public void setTabMesuresTraitees(List<ModeleCompteur[]> p_tabMesuresTraitees) {
        tabMesuresTraitees = p_tabMesuresTraitees;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

