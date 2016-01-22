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
import java.util.Map.Entry;

import org.omg.CORBA._PolicyStub;









//## link controleurRRC 
import RRC.ControleurRRC;
import RRC.ModeleRRC;
import Compteur.Client;
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
    
    protected ModeleRRC modeleRRC;		//## link controleurRRC 
    
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
    
  //## operation majSysteme() 
    public void majSysteme() {
        //#[ operation majSysteme() 
        //#]*
    	String chaine = new String();
    	ModeleCompteur modele;
    	ModeleCompteurDate modeleDate;
    	
    	for(Entry<ModeleCompteur, LinkedList<ModeleCompteurDate>> entry : listeCompteurs.entrySet()){
    		
    		modele = entry.getKey();
    		modeleDate = entry.getValue().getLast();
    		
    		entry.getValue().addLast(modele.getCompteurDate());
    		
			chaine = chaine.concat("\nCompteur "+modele.getId()+" : ");
			
			if(modele.isConnected())
			{
				chaine=chaine.concat(modele.getHc()+" / "+modele.getHp());
			}
			else
			{
				chaine=chaine.concat("COMPTEUR OFFLINE");
				//modeleLEDEtatConnectionCompteur.setEtatAAfficher(0);; notifie les led
			}
    	}
    	//notification des observer
    	//modeleLCD.setDonneesAAfficher(chaine); notifier le lcd
    }
    
	public Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> getInfo(){
		// TODO: traitement pour correspondre au exigences du client
		return listeCompteurs;
	}
    
    //## operation envoyerinfoRCCPush() 
    public void envoyerinfoRCCPush(ModeleCompteur p_ModeleCompteur) {
        //#[ operation envoyerinfoRCCPush() 
        //#]
    	LinkedList<ModeleCompteurDate> l = listeCompteurs.get(p_ModeleCompteur);
    	
    	if( l == null){
    		System.out.println("erreur");
    		return;
    	}
    }
    
    //## operation majConsommation() 
    public void majConsommation() {
        //#[ operation majConsommation() 
        //#]
    }
    
    public ModeleRRC getModeleRRC() {
		return modeleRRC;
	}
	public void setModeleRRC(ModeleRRC modeleRRC) {
		this.modeleRRC = modeleRRC;
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
    public Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> getListeCompteurs() {
        return listeCompteurs;
    }
    
    public Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> getReleve(){
    	Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> releve = new HashMap<>();
    	LinkedList<ModeleCompteurDate> l;
    	int i;
    	
    	for(Entry<ModeleCompteur,LinkedList<ModeleCompteurDate>> elem : listeCompteurs.entrySet()){
    		l = new LinkedList<ModeleCompteurDate>();
    		i = 0;
    		for(ModeleCompteur m : elem.getValue()){
    			if(i%)
    			l.add(new ModeleCompteurDate(m));
    			
    		}
    		
    		releve.put(elem.getKey().copie(),l);
    	}
    		
    	return releve;
    }
    
    //## auto_generated 
    public void addListeCompteurs(ModeleCompteur modeleCompteur) {
        //listeCompteurs.add(p_ModeleCompteur.getId(),p_ModeleCompteur);
    	LinkedList<ModeleCompteurDate> l = listeCompteurs.get(modeleCompteur);
 
    	
    	if( l != null){
    		System.out.println(modeleCompteur.toString()+"déjà existant");
    		return;
    	}
    	
    	l = new LinkedList<ModeleCompteurDate>();
		l.addLast(modeleCompteur.getCompteurDate());
		listeCompteurs.put(modeleCompteur, l);
    		
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