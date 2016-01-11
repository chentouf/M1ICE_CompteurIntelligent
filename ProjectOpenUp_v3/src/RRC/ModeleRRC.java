/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ModeleRRC
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

package RRC;

//## link itsControleurPasserelle 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import Passerelle.ControleurPasserelle;
import Compteur.ModeleCompteur;

//----------------------------------------------------------------------------
// RRC/ModeleRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class ModeleRRC 
public class ModeleRRC {
    
    protected int prixEnVigueur;		//## attribute prixEnVigueur 
    protected List<ModeleCompteur> mesureHistorique;
	protected List<ModeleCompteur> mesureCourante; 
    
    // Constructors
    
    //## operation ModeleRRC() 
    public  ModeleRRC() {
        //#[ operation ModeleRRC() 
        //#]
    	this.mesureHistorique = new ArrayList<ModeleCompteur>();
    	this.mesureCourante = new ArrayList<ModeleCompteur>();
    }
    
    //## auto_generated 
    public int getPrixEnVigueur() {
        return prixEnVigueur;
    }
    
    //## auto_generated 
    public void setPrixEnVigueur(int p_prixEnVigueur) {
        prixEnVigueur = p_prixEnVigueur;
    }
    
    public List<ModeleCompteur> getMesureHistorique() {
		return mesureHistorique;
	}

	public void setMesureHistorique(List<ModeleCompteur> mesureHistorique) {
		this.mesureHistorique = mesureHistorique;
	}

    public List<ModeleCompteur> getMesureCourante() {
		return mesureCourante;
	}

	public void setMesureCourante(List<ModeleCompteur> mesureCourante) {
		this.mesureCourante = mesureCourante;
	}
	
	public void initMesure(ListIterator<ModeleCompteur> l){
		ModeleCompteur tmp;
		while(l.hasNext()){
			tmp = l.next();
			mesureHistorique.remove(tmp);
			mesureHistorique.add(tmp);			
		}
	}

	public void majMesure(ListIterator<ModeleCompteur> l){
    	ModeleCompteur tmp;
		while(l.hasNext()){
			tmp = l.next();
			mesureCourante.remove(tmp);
			mesureCourante.add(tmp);			
		}
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

