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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/


