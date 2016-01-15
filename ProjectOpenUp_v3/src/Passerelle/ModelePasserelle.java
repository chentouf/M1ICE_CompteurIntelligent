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
//## link controleurRRC 
import RRC.ControleurRRC;
//## link listeCompteurs 
import Compteur.ModeleCompteur;

//----------------------------------------------------------------------------
// Passerelle/ModelePasserelle.java                                                                  
//----------------------------------------------------------------------------

//## package Passerelle 


//## class ModelePasserelle 
public class ModelePasserelle {

    protected int idPasserelle;		//## attribute idPasserelle 
    
    protected ControleurRRC controleurRRC;		//## link controleurRRC 
    
    protected LinkedList<ModeleCompteur> listeCompteurs = new LinkedList<ModeleCompteur>();		//## link listeCompteurs 
    
    
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
    public ListIterator<ModeleCompteur> getListeCompteurs() {
        ListIterator<ModeleCompteur> iter = listeCompteurs.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void addListeCompteurs(ModeleCompteur p_ModeleCompteur) {
        listeCompteurs.add(p_ModeleCompteur);
    }
    
    //## auto_generated 
    public void removeListeCompteurs(ModeleCompteur p_ModeleCompteur) {
        listeCompteurs.remove(p_ModeleCompteur);
    }
    
    //## auto_generated 
    public void clearListeCompteurs() {
        listeCompteurs.clear();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ModelePasserelle.java
*********************************************************************/

