<<<<<<< HEAD
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
import java.util.Map.Entry;

import Compteur.ModeleCompteur;
import Compteur.ModeleCompteurDate;
import LCD.ControleurLCD;
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
    
	protected ModeleLED modeleLEDEtatConnectionCompteur ;
    
    protected ModeleLED modeleLEDEtatConnectionRRC;
    
    protected ModeleLCD modeleLCD;		//## link modeleLCD 
    
    protected ModelePasserelle modelePasserelle;		//## link modelePasserelle 
    
    protected ModeleRRC modeleRRC;		//## link modeleRRC 
    
    protected int duree; 			// intervale de temps entre deux mesures 
    
    
    // Constructors
    

    //## auto_generated 
    public  ControleurPasserelle(int duree) {
    	modelePasserelle = new ModelePasserelle();
    	modeleLCD = new ModeleLCD();
    	modeleLEDEtatConnectionCompteur = new ModeleLED() ;
    	modeleLEDEtatConnectionRRC = new ModeleLED();
    	this.duree = duree;
    }
    
    //## operation majSysteme() 
    public void majSysteme() {
        //#[ operation majSysteme() 
        //#]*
    	String chaine = new String();
    	Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> data = modelePasserelle.getListeCompteurs();
    	ModeleCompteur modele;
    	ModeleCompteurDate modeleDate;
    	
    	for(Entry<ModeleCompteur, LinkedList<ModeleCompteurDate>> entry : data.entrySet()){
    		
    		modele = entry.getKey();
    		modeleDate = entry.getValue().getFirst();
    		
    		entry.getValue().addFirst(modele.getCompteurDate());
    		
			chaine = chaine.concat("\nCompteur "+modele.getId()+" : ");
			
			if(modele.isConnected())
			{
				chaine=chaine.concat(modele.getHc()+" / "+modele.getHp());
			}
			else
			{
				chaine=chaine.concat("COMPTEUR OFFLINE");
				modeleLEDEtatConnectionCompteur.setEtatAAfficher(0);;
			}
    	}
    	
    	modeleLCD.setDonneesAAfficher(chaine);
    }
    
    public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
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
    
    public ModeleLED getModeleLEDEtatConnectionCompteur() {
		return modeleLEDEtatConnectionCompteur;
	}

	public void setModeleLEDEtatConnectionCompteur(ModeleLED modeleLEDEtatConnectionCompteur) {
		this.modeleLEDEtatConnectionCompteur = modeleLEDEtatConnectionCompteur;
	}

	public ModeleLED getModeleLEDEtatConnectionRRC() {
		return modeleLEDEtatConnectionRRC;
	}

	public void setModeleLEDEtatConnectionRRC(ModeleLED modeleLEDEtatConnectionRRC) {
		this.modeleLEDEtatConnectionRRC = modeleLEDEtatConnectionRRC;
	}
	
	public Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> getInfo(){
		// TODO: traitement pour correspondre au exigences du client
		return modelePasserelle.getListeCompteurs();
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
=======
/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurPasserelle
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
>>>>>>> branch 'V3' of https://github.com/chentouf/M1ICE_CompteurIntelligent.git
*********************************************************************/

package Passerelle;

//## auto_generated
import java.util.*;

import Compteur.ModeleCompteur;
import LCD.ControleurLCD;
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
    
	protected ModeleLED modeleLEDEtatConnectionCompteur ;
    
    protected ModeleLED modeleLEDEtatConnectionRRC;
    
    protected ModeleLCD modeleLCD;		//## link modeleLCD 
    
    protected ModelePasserelle modelePasserelle;		//## link modelePasserelle 
    
    protected ModeleRRC modeleRRC;		//## link modeleRRC 
    
    
    // Constructors
    

    //## auto_generated 
    public  ControleurPasserelle() {
    	modelePasserelle = new ModelePasserelle();
    	modeleLCD = new ModeleLCD();
    	modeleLEDEtatConnectionCompteur = new ModeleLED() ;
    	modeleLEDEtatConnectionRRC = new ModeleLED();
    }
    
    //## operation majSysteme() 
    public void majSysteme() {
        //#[ operation majSysteme() 
        //#]*
    	String chaine = new String();
    	Iterator<ModeleCompteur> iter = modelePasserelle.getListeCompteurs();
    	ModeleCompteur modele;
    	
    	while(iter.hasNext()){
			modele = iter.next();
			chaine = chaine.concat("\nCompteur "+modele.getId()+" : ");
			if(modele.isConnected())
			{
				chaine=chaine.concat(modele.getHc()+" / "+modele.getHp());
			}
			else
			{
				chaine=chaine.concat("COMPTEUR OFFLINE");
				modeleLEDEtatConnectionCompteur.setEtatAAfficher(0);;
			}
    	}
    	
    	modeleLCD.setDonneesAAfficher(chaine);
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
    
    public ModeleLED getModeleLEDEtatConnectionCompteur() {
		return modeleLEDEtatConnectionCompteur;
	}

	public void setModeleLEDEtatConnectionCompteur(ModeleLED modeleLEDEtatConnectionCompteur) {
		this.modeleLEDEtatConnectionCompteur = modeleLEDEtatConnectionCompteur;
	}

	public ModeleLED getModeleLEDEtatConnectionRRC() {
		return modeleLEDEtatConnectionRRC;
	}

	public void setModeleLEDEtatConnectionRRC(ModeleLED modeleLEDEtatConnectionRRC) {
		this.modeleLEDEtatConnectionRRC = modeleLEDEtatConnectionRRC;
	}
	
	public ListIterator<ModeleCompteur> getInfo(){
		return modelePasserelle.getListeCompteurs();
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/
