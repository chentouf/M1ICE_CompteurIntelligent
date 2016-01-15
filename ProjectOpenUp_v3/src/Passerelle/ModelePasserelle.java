/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ModelePasserelle
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ModelePasserelle.java
*********************************************************************/

package Passerelle;

//## auto_generated
import java.util.*;

import org.omg.CORBA._PolicyStub;




//## link controleurRRC 
import RRC.ControleurRRC;
//## link listeCompteurs 
import Compteur.ModeleCompteur;
import Compteur.ModeleCompteurDate;

//----------------------------------------------------------------------------
// Passerelle/ModelePasserelle.java                                                                  
//----------------------------------------------------------------------------

//## package Passerelle 


//## class ModelePasserelle 
public class ModelePasserelle {

    protected int idPasserelle;		//## attribute idPasserelle 
    
    protected ControleurRRC controleurRRC;		//## link controleurRRC 
    
    protected Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> listeCompteurs = new HashMap<ModeleCompteur,LinkedList<ModeleCompteurDate>>();		//## link listeCompteurs 
    
    // Constructors
    
    /**
     * @param cr
    */
    //## operation ModelePasserelle(ControleurRRC) 
    public  ModelePasserelle(final ControleurRRC cr) {
        //#[ operation ModelePasserelle(ControleurRRC) 
        //#]
    }
    //## auto_generated 
    public  ModelePasserelle() {
    }
    
    //## operation envoyerinfoRCCPush() 
    public void envoyerinfoRCCPush() {
        //#[ operation envoyerinfoRCCPush() 
        //#]
    }
    
    //## operation majConsommation() 
    public void majConsommation() {
        //#[ operation majConsommation() 
        //#]
    }
    
    //## auto_generated 
    public int getIdPasserelle() {
        return idPasserelle;
    }
    
    //## auto_generated 
    public void setIdPasserelle(int p_idPasserelle) {
        idPasserelle = p_idPasserelle;
    }
    
    //## auto_generated 
    public ControleurRRC getControleurRRC() {
        return controleurRRC;
    }
    
    //## auto_generated 
    public void setControleurRRC(ControleurRRC p_ControleurRRC) {
        controleurRRC = p_ControleurRRC;
    }
    
    //## auto_generated 
    public Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> getListeCompteurs() {
        
        return listeCompteurs;
    }
    
    //## auto_generated 
    public void addListeCompteurs(ModeleCompteur p_ModeleCompteur) {
        //listeCompteurs.add(p_ModeleCompteur.getId(),p_ModeleCompteur);
    	LinkedList<ModeleCompteurDate> l = listeCompteurs.get(p_ModeleCompteur.getId());
    	
    	if( l != null)
    		l.add(new ModeleCompteurDate(p_ModeleCompteur));
    	else{
    		l = new LinkedList<ModeleCompteurDate>();
    		l.addFirst(new ModeleCompteurDate(p_ModeleCompteur));
    		listeCompteurs.put(p_ModeleCompteur, l);
    	}
    		
    }
    
    //## auto_generated 
    public boolean removeListeCompteurs(ModeleCompteur p_ModeleCompteur) {
        return null == listeCompteurs.remove(p_ModeleCompteur.getId());
    }
    
    //## auto_generated 
    public void clearListeCompteurs() {
        listeCompteurs.clear();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ModelePasserelle.java
*********************************************************************/

