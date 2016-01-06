/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurCompteur
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Compteur/ControleurCompteur.java
*********************************************************************/

package Compteur;


//----------------------------------------------------------------------------
// Compteur/ControleurCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Compteur 


//## class ControleurCompteur 
public class ControleurCompteur {
    
    protected ModeleCompteur modeleCompteur;		//## link modeleCompteur 
    
    protected VueCompteur vueCompteur;		//## link vueCompteur 
    
    
    // Constructors
    
    /**
     * @param modeleCompteur
     * @param vueCompteur
    */
    //## operation ControleurCompteur(ModeleCompteur,VueCompteur) 
    public  ControleurCompteur(ModeleCompteur modeleCompteur, VueCompteur vueCompteur) {
    	this.modeleCompteur = modeleCompteur ;
    	this.vueCompteur = vueCompteur ;
    }
    //## auto_generated 
    public  ControleurCompteur() {
    }
    
    //## operation majCompteur() 
    public void majCompteur() {
        //#[ operation majCompteur() 
        //#]
    }
    
    //## auto_generated 
    public ModeleCompteur getModeleCompteur() {
        return modeleCompteur;
    }
    
    //## auto_generated 
    public void setModeleCompteur(ModeleCompteur p_ModeleCompteur) {
        modeleCompteur = p_ModeleCompteur;
    }
    
    //## auto_generated 
    public VueCompteur getVueCompteur() {
        return vueCompteur;
    }
    
    //## auto_generated 
    public void setVueCompteur(VueCompteur p_VueCompteur) {
        vueCompteur = p_VueCompteur;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/ControleurCompteur.java
*********************************************************************/

