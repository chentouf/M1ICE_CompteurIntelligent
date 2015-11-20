/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurCompteur
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Compteur/ControleurCompteur.java
*********************************************************************/

package Compteur;

import java.util.Observable;

//## class ControleurCompteur 

//----------------------------------------------------------------------------
// Compteur/ControleurCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Compteur 


//## class ControleurCompteur 
public class ControleurCompteur extends Observable {
    
    protected ModeleCompteur itsModeleCompteur;		//## link itsModeleCompteur 
    
    protected VueCompteur itsVueCompteur;		//## link itsVueCompteur 
    
    
    // Constructors
    
    //## auto_generated 
    public  ControleurCompteur() {
    }
    
    //## operation getConso() 
    public int getConso() {
        //#[ operation getConso() 
        //#]
    	return 10;
    }
    
    //## auto_generated 
    public ModeleCompteur getItsModeleCompteur() {
        return itsModeleCompteur;
    }
    
    //## auto_generated 
    public void setItsModeleCompteur(ModeleCompteur p_ModeleCompteur) {
        itsModeleCompteur = p_ModeleCompteur;
    }
    
    //## auto_generated 
    public VueCompteur getItsVueCompteur() {
        return itsVueCompteur;
    }
    
    //## auto_generated 
    public void setItsVueCompteur(VueCompteur p_VueCompteur) {
        itsVueCompteur = p_VueCompteur;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/ControleurCompteur.java
*********************************************************************/

