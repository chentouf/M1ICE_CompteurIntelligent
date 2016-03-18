/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/ModeleCompteur.java
*********************************************************************/

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

import java.io.Serializable;
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
	
	//ajout client plus durée défini par le client
    private static int ID = 0;
    protected int hc;		//## attribute hc 
    protected int hp;		//## attribute hp
    protected int id;
    protected boolean etatConnection ;
	private ControleurCompteur controleur;
    
    //## operation ModeleCompteur() 
    public  ModeleCompteur() {
    	super();
    	id = ModeleCompteur.incID();
    	hc = 0;
    	hp = 0;
    	etatConnection = true ;
    }
    
    public ModeleCompteur(ModeleCompteur copy){
    	super();
    	id = copy.getId();
    	hc = copy.getHc();
    	hp = copy.getHp();
    	etatConnection = copy.isConnected();
    }
    
    public static synchronized int incID(){
    	
    	ModeleCompteur.ID++;
    	return ModeleCompteur.ID;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
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
    
    public boolean getConnection(){
    	return etatConnection;
    }
    
    //## auto_generated 
    public void setHp(int p_hp) {
        hp = p_hp;
        setChanged();
        notifyObservers();
    }
    
    public boolean isConnected() {
		return etatConnection;
	}

	public void setConnection(boolean etatConnection) {
		this.etatConnection = etatConnection;
	}
	
	public ModeleCompteur copie(){
		return new ModeleCompteur(this);
	}
	
	public int getIntervalleReleve(){
		return 0;
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
    
    @Override
    public int hashCode(){
    	return id*13;
    }
    
    public ModeleCompteurDate getCompteurDate(){
    	return new ModeleCompteurDate(this);
    }
    
    @Override
    public String toString(){
    	return "Compteur : "+id;
    }

	public void setControleur(ControleurCompteur controleurCompteur) {
		// TODO Auto-generated method stub
		this.controleur = controleurCompteur;
	}
	
	public void stop(){
		controleur.stop();
	}
	
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Compteur/ModeleCompteur.java
*********************************************************************/

