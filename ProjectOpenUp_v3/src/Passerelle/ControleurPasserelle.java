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
import LED.ControleurLED;
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
    
	protected ControleurLED controleurLEDEtatConnectionCompteur ;
    
    protected ControleurLED controleurLEDEtatConnectionRRC;
    
    protected ControleurLCD controleurLCD;		//## link modeleLCD 
    
    protected ModelePasserelle modelePasserelle;		//## link modelePasserelle 
    
    protected int duree; 			// intervale de temps entre deux mesures 
    
    protected VuePasserelle vuePasserelle;
    
    // Constructors
    

    //## auto_generated 
    public  ControleurPasserelle(int duree) {
    	
    	
    	controleurLCD = new ControleurLCD();
    	controleurLEDEtatConnectionCompteur = new ControleurLED() ;
    	controleurLEDEtatConnectionRRC = new ControleurLED();
    	
    	vuePasserelle = new VuePasserelle(controleurLEDEtatConnectionCompteur.getVueLED(),controleurLEDEtatConnectionRRC.getVueLED(), controleurLCD.getVueLCD());
    	modelePasserelle = new ModelePasserelle(vuePasserelle,controleurLCD.getModeleLCD());
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
				controleurLEDEtatConnectionCompteur.getModeleLED().setEtatAAfficher(0);;
			}
    	}
    	
    	controleurLCD.getModeleLCD().setDonneesAAfficher(chaine);
    }
    
    public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	//## auto_generated 
    public ControleurLCD getControleurLCD() {
        return controleurLCD;
    }
    
    //## auto_generated 
    public void setControleurLCD(ControleurLCD p_ModeleLCD) {
    	controleurLCD = p_ModeleLCD;
    }
    
    //## auto_generated 
    public ModelePasserelle getModelePasserelle() {
        return modelePasserelle;
    }
    
    //## auto_generated 
    public void setModelePasserelle(ModelePasserelle p_ModelePasserelle) {
        modelePasserelle = p_ModelePasserelle;
    }
    
    public ControleurLED getControleurLEDEtatConnectionCompteur() {
		return controleurLEDEtatConnectionCompteur;
	}

	public void setControleurLEDEtatConnectionCompteur(ControleurLED controleurLEDEtatConnectionCompteur) {
		this.controleurLEDEtatConnectionCompteur = controleurLEDEtatConnectionCompteur;
	}

	public ControleurLED getControleurLEDEtatConnectionRRC() {
		return controleurLEDEtatConnectionRRC;
	}

	public void setControleurLEDEtatConnectionRRC(ControleurLED modeleLEDEtatConnectionRRC) {
		this.controleurLEDEtatConnectionRRC = controleurLEDEtatConnectionRRC;
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/


