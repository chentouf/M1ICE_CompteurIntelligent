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

import java.util.Comparator;
import java.util.Observable;


//## link modelePasserelle 
import Passerelle.ModelePasserelle;

//----------------------------------------------------------------------------
// Compteur/ModeleCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Compteur 


//## class ModeleCompteur 
public class ModeleCompteur extends Observable{
    
    protected int hc;		//## attribute hc 
    protected int hp;		//## attribute hp
    protected String id;		
    protected boolean etatConnection ;    
    
    // Constructors
    
    //## operation ModeleCompteur() 
    public  ModeleCompteur() {
    	super();
        //#[ operation ModeleCompteur() 
        //#]
    	hc = 0;
    	hp = 0;
    	etatConnection = true ;
    }
    
    public ModeleCompteur(ModeleCompteur copy){
    	super();
    	
    	hc = copy.getHc();
    	hp = copy.getHp();
    	etatConnection = copy.isConnected();
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
        
    
    
    //## auto_generated 
    public int getHc() {
        return hc;
    }
    
    //## auto_generated 
    public void setHc(int p_hc) {
        hc = p_hc;
        setChanged();
        notifyObservers();
    }
    
    //## auto_generated 
    public int getHp() {
        return hp;
    }
    
    //## auto_generated 
    public void setHp(int p_hp) {
        hp = p_hp;
        notifyObservers();
    }
    
    public boolean isConnected() {
		return etatConnection;
	}

	public void setConnection(boolean etatConnection) {
		this.etatConnection = etatConnection;
	}

    @Override
    public boolean equals(Object o){
    	if(o instanceof ModeleCompteur){
    		ModeleCompteur modele = (ModeleCompteur)o;
    		if(modele.getId() == id )
    			return true;
    		else
    			return false;
    	}
    	return false;
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/ModeleCompteur.java
*********************************************************************/

