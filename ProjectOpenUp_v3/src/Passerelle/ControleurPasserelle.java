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
    
	protected ModeleLED modeleLEDEtatConnectionCompteurs ;
    
    protected ModeleLED modeleLEDConnectionRRC ;
    
    protected ModeleLCD modeleLCD;		//## link modeleLCD 
    
    protected ModelePasserelle modelePasserelle;		//## link modelePasserelle 
    
    protected ModeleRRC modeleRRC;		//## link modeleRRC 
    
    
    // Constructors
    
    /**
     * @param modeleLED1
     * @param modelePasserelle
     * @param modeleLED2
     * @param modeleLCD
     * @param modelePass
    */

    //## auto_generated 
    public  ControleurPasserelle() {
    	modelePasserelle = new ModelePasserelle();
    	modeleLCD = new ModeleLCD();
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
			if(modele.getEtatConnection())
			{
				chaine=chaine.concat(modele.getHc()+" / "+modele.getHp());
			}
			else
			{
				chaine=chaine.concat("COMPTEUR OFFLINE");
				modeleLEDEtatConnectionCompteurs.setEtatAAfficher(0);
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
    
    public ModeleLED getModeleLEDEtatConnectionCompteurs() {
		return modeleLEDEtatConnectionCompteurs;
	}

	public void setModeleLEDEtatConnectionCompteurs(ModeleLED modeleLEDEtatConnectionCompteurs) {
		this.modeleLEDEtatConnectionCompteurs = modeleLEDEtatConnectionCompteurs;
	}

	public ModeleLED getModeleLEDConnectionRRC() {
		return modeleLEDConnectionRRC;
	}

	public void setModeleLEDConnectionRRC(ModeleLED modeleLEDConnectionRRC) {
		this.modeleLEDConnectionRRC = modeleLEDConnectionRRC;
	}

    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ControleurPasserelle.java
*********************************************************************/

