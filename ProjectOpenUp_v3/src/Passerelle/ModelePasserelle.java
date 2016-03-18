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

import java.awt.Color;
//## auto_generated
import java.util.*;
import java.util.Map.Entry;

//## link controleurRRC 
import RRC.ControleurRRC;
import RRC.ModeleRRC;
import Compteur.Client;
//## link listeCompteurs 
import Compteur.ModeleCompteur;
import Compteur.ModeleCompteurDate;
import LCD.ModeleLCD;


//----------------------------------------------------------------------------
// Passerelle/ModelePasserelle.java                                                                  
//----------------------------------------------------------------------------

//## package Passerelle 


//## class ModelePasserelle 
public class ModelePasserelle {

    protected int idPasserelle;		//## attribute idPasserelle 
    
    protected ModeleRRC modeleRRC;		//## link controleurRRC 
    
    protected VuePasserelle vuePasserelle;
    
    protected ModeleLCD modeleLCD;
    
    
    protected Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> listeCompteurs = new HashMap<ModeleCompteur,LinkedList<ModeleCompteurDate>>();		//## link listeCompteurs 
    
    // Constructors
    
    /**
     * @param cr
    */
    //## operation ModelePasserelle(ControleurRRC) 
    public  ModelePasserelle(VuePasserelle vuePasserelle,ModeleLCD modeleLCD) {
        //#[ operation ModelePasserelle(ControleurRRC) 
        //#]
    	this.vuePasserelle = vuePasserelle;
    	this.modeleLCD = modeleLCD;
    }
    //## auto_generated 
    public  ModelePasserelle() {
    }
    
  //## operation majSysteme() 
    public void majSysteme() {
    	synchronized(this){
	        //#[ operation majSysteme() 
	        //#]*
	    	String chaine = new String();
	    	ModeleCompteur modele;
	    	ModeleCompteurDate modeleDate;
	    	boolean etat = true;
	    	
	    	for(Entry<ModeleCompteur, LinkedList<ModeleCompteurDate>> entry : listeCompteurs.entrySet()){
	    		modele = entry.getKey();
	    		modeleDate = entry.getValue().getLast();
	    		
	    		if(entry.getKey().isConnected())
	    			entry.getValue().addLast(modele.getCompteurDate());
	    		
				chaine = chaine.concat("\nCompteur "+modele.getId()+" : ");
				
				if(modele.isConnected())
				{
					chaine=chaine.concat(modele.getHc()+" / "+modele.getHp());
					
					
				}
				else
				{
					chaine=chaine.concat("COMPTEUR OFFLINE");
					etat = false;
					//modeleLEDEtatConnectionCompteur.setEtatAAfficher(0);; notifie les led
					
					
				}
				
				if(etat){
					vuePasserelle.vueLEDEtatConnection.setDisplay(Color.green);
					//System.out.println("ok compteur marche");
				}
				else
				{
					vuePasserelle.vueLEDEtatConnection.setDisplay(Color.RED);
				}
					
				
	    	}
	    	//notification des observer
	    	modeleLCD.setDonneesAAfficher(chaine);
    	}
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
		vuePasserelle.vueLEDAccesDistant.setDisplay(Color.blue);
		this.modeleRRC = modeleRRC;
		vuePasserelle.vueLEDAccesDistant.setDisplay(Color.green);
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
    	
    	synchronized(this){	
        	LinkedList<ModeleCompteurDate> l;
        	int i;
        	vuePasserelle.vueLEDAccesDistant.setDisplay(Color.orange);
        	for(Entry<ModeleCompteur,LinkedList<ModeleCompteurDate>> elem : listeCompteurs.entrySet()){
        		l = new LinkedList<ModeleCompteurDate>();
        		i = 0;
        		
        		for(Iterator<ModeleCompteurDate> iter = elem.getValue().iterator();iter.hasNext();){
        			ModeleCompteurDate m = iter.next();
        			
        			if((i % elem.getKey().getIntervalleReleve()) == 0){
        				l.addLast(new ModeleCompteurDate(m));
        			}
        			i++;    			
        		}
        		releve.put(new ModeleCompteur(elem.getKey()),l);
        	}
        	
        	/*for(Entry<ModeleCompteur,LinkedList<ModeleCompteurDate>> elem : releve.entrySet()){	    		

        		System.out.println("P - Compteur : "+elem.getKey().getId()+" :: "+elem.getKey().getHc()+" "+elem.getKey().getHp());
        		for(ModeleCompteurDate m : elem.getValue()){
        			
        			System.out.println(m.getDisplay());
       			
        		}
        	}*/
        	new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					vuePasserelle.vueLEDAccesDistant.setDisplay(Color.green);
				}
			}).start();
    	}
    	
    		
    	return releve;
    }
    
    public LinkedList<ModeleCompteurDate> getReleveModeleCompteur(ModeleCompteur modeleCompteur){
    	return listeCompteurs.get(modeleCompteur);
    }
    
    //## auto_generated 
    public void addListeCompteurs(ModeleCompteur modeleCompteur) {
        //listeCompteurs.add(p_ModeleCompteur.getId(),p_ModeleCompteur);
    	synchronized(this){
    		LinkedList<ModeleCompteurDate> l = listeCompteurs.get(modeleCompteur);
    		 
        	
        	if( l != null){
        		System.out.println(modeleCompteur.toString()+"déjà existant");
        		return;
        	}
        	
        	l = new LinkedList<ModeleCompteurDate>();
    		l.addLast(modeleCompteur.getCompteurDate());
    		listeCompteurs.put(modeleCompteur, l);
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
	public void removeListeCompteurs(int id) {
		// TODO Auto-generated method stub
		ModeleCompteur modele = null;
		synchronized(this){
			for(Entry<ModeleCompteur,LinkedList<ModeleCompteurDate>> elem : listeCompteurs.entrySet()){
        		if(elem.getKey().getId() == id)
        			modele = elem.getKey();
        	}
			if(modele != null){
				modele.stop();
				listeCompteurs.remove(modele);
			}
		}
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Passerelle/ModelePasserelle.java
*********************************************************************/