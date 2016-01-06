/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ModeleCompteur
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Compteur/ModeleCompteur.java
*********************************************************************/

package Compteur;

//## link modelePasserelle 
import Passerelle.ModelePasserelle;

//----------------------------------------------------------------------------
// Compteur/ModeleCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Compteur 


//## class ModeleCompteur 
public class ModeleCompteur {
    
    protected int hc;		//## attribute hc 
    protected int hp;		//## attribute hp 
    
    protected ModelePasserelle modelePasserelle;		//## link modelePasserelle 
    
    
    // Constructors
    
    //## operation ModeleCompteur() 
    public  ModeleCompteur() {
        //#[ operation ModeleCompteur() 
        //#]
    }
    
    //## operation simulerConso() 
    public void simulerConso() {
    }
    
    //## auto_generated 
    public int getHc() {
        return hc;
    }
    
    //## auto_generated 
    public void setHc(int p_hc) {
        hc = p_hc;
    }
    
    //## auto_generated 
    public int getHp() {
        return hp;
    }
    
    //## auto_generated 
    public void setHp(int p_hp) {
        hp = p_hp;
    }
    
    //## auto_generated 
    public ModelePasserelle getModelePasserelle() {
        return modelePasserelle;
    }
    
    //## auto_generated 
    public void setModelePasserelle(ModelePasserelle p_ModelePasserelle) {
        modelePasserelle = p_ModelePasserelle;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/ModeleCompteur.java
*********************************************************************/

