/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: VueCompteur
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Compteur/VueCompteur.java
*********************************************************************/

package Compteur;

import java.util.Observable;
import java.util.Observer;


//----------------------------------------------------------------------------
// Compteur/VueCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Compteur 


//## class VueCompteur 
public class VueCompteur implements Observer {
    
    protected String display;		//## attribute display 
    
    // Constructors
    
    //## operation VueCompteur() 
    public  VueCompteur() {
        //#[ operation VueCompteur() 
        //#]
    }
    
    //## operation majVue() 
    public void majVue() {
        //#[ operation majVue()
    	
        //#]
    }
    
    //## auto_generated 
    public String getDisplay() {
        return display;
    }
    
    //## auto_generated 
    public void setDisplay(String p_display) {
        display = p_display;
    }

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		ModeleCompteur modele;
		
		if(arg0 == null){
			System.out.println("erreur");
			return;
		}
		
		if(arg0 instanceof ModeleCompteur){
			modele = (ModeleCompteur)arg0;
			display = new String(modele.getId()+" : "+modele.getHc()+" / "+modele.getHp());
		}
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/VueCompteur.java
*********************************************************************/

