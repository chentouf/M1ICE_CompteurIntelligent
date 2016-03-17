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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//## link itsControleurPasserelle 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Observable;
import java.util.Map.Entry;

import Passerelle.ControleurPasserelle;
import Compteur.Client;
import Compteur.ModeleCompteur;
import Compteur.ModeleCompteurDate;

//----------------------------------------------------------------------------
// RRC/ModeleRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 

//## class ModeleRRC 
public class ModeleRRC{

    protected int prixEnVigueurHc,prixEnVigueurHp,duree;		// à stocker prochainement
    protected Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> mesure;
    // Constructors
    
    //## operation ModeleRRC() 
    public  ModeleRRC(int prixEnVigeurHp, int prixEnVigeurHc, int duree) {

        //#[ operation ModeleRRC() 
        //#]
    	this.prixEnVigueurHp = prixEnVigeurHp;
    	this.prixEnVigueurHc = prixEnVigeurHc;
    	
    	this.mesure = new HashMap<ModeleCompteur,LinkedList<ModeleCompteurDate>>();
    	this.duree = duree;
    }
    
    public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	//## auto_generated 
    public int getPrixEnVigueurHc() {
        return prixEnVigueurHc;
    }
    
    //## auto_generated 
    public void setPrixEnVigueurHc(int p_prixEnVigueur) {
        prixEnVigueurHc = p_prixEnVigueur;
    }
    

    public int getPrixEnVigeurHp() {
		return prixEnVigueurHp;
	}

	public void setPrixEnVigeurHp(int prixEnVigeurHp) {
		this.prixEnVigueurHp = prixEnVigeurHp;
	}
	
	public void initMesure(){
		mesure = null;
		
		mesure = new HashMap<ModeleCompteur,LinkedList<ModeleCompteurDate>>();
	}

	public void majMesure(Map<ModeleCompteur, LinkedList<ModeleCompteurDate>> map){
		synchronized(this){
	    	//TODO :prendre en compte le fait que que la liste ne contiendra plus que les mesures autorisé
			LinkedList<ModeleCompteurDate> l;
	
			for(Entry<ModeleCompteur, LinkedList<ModeleCompteurDate>> entry : map.entrySet()){
				//System.out.println("R - Compteur : "+entry.getKey().getId()+" :: "+entry.getKey().getHc()+" "+entry.getKey().getHp());
				if( mesure.get(entry.getKey()) != null){
					mesure.remove(entry.getKey());	
				}
				
				mesure.put(entry.getKey(),entry.getValue());
			}
    	}
    }
	
	public void charger(Date d){
		// TODO : Tester le chargement d'un fichier dans la prochaine itération
	}
	
	public void enregistrer() {
		File mesure = new File("listeCompteur"+new Date().toString());
		FileOutputStream fout;
		ObjectOutputStream oos;
		
		try {
			if(!mesure.exists())
				mesure.createNewFile();

			
			fout = new FileOutputStream (mesure);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(mesure);
			fout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public void produireFacture(Client client,Date date) throws IOException{
    	synchronized(this)
        { 
        	if(mesure.containsKey(client)){
        		LinkedList<ModeleCompteurDate> l = mesure.get(client);
	    		System.out.println("Compteur : "+client.getId()+" client : "+client.getNom());
	    		for(ModeleCompteurDate elem : l){
	    			if(new Date(elem.getDate()).compareTo(date) >= 0){
	    				System.out.println(elem.getDisplay());
	    			}
	    		}
        	}
        }
        		
        		
        		/*File fichier = new File("facture"+entry.getKey().getId()+".txt"); 
        		fichier.createNewFile();
        		FileWriter fw = new FileWriter (fichier);
        		
        		
        		//System.out.println("Compteur : "+entry.getKey().getId()+" :: "+entry.getKey().getHp()+" "+entry.getValue().getLast().getHp());
        		/*fw.write(" FACTURE COMPTEUR "+entry.getKey().getId() + "\n");
        		fw.write(" Consomation hc : " + consoHc + " au tarif de " + prixEnVigueurHc + " pour un total de " + consoHc * prixEnVigueurHc +  "\n" );
        		fw.write(" Consomation hp : " + consoHp + " au tarif de " + prixEnVigueurHp + " pour un total de " + consoHp * prixEnVigueurHp +  "\n" );
        		fw.write(" TOTAL FACTURE : " + consoHc * prixEnVigueurHc + consoHp * prixEnVigueurHp );
        		fw.close();*/
        	
        	
        
    }

	public void produireFacture(Client client, Date d1, Date d2) {
		// TODO Auto-generated method stub
		File fichier;
		FileWriter fw;
		int consoHc;
		int consoHp;
		ModeleCompteurDate debut = null;
		ModeleCompteurDate fin = null;
		
		synchronized(this)
        {
			try {
				fichier = new File("facture"+client.getId()+".txt");
				fichier.createNewFile();
				fw = new FileWriter (fichier);
				
				for(Entry<ModeleCompteur,LinkedList<ModeleCompteurDate>> entry : mesure.entrySet()){
					if(client.getId() == entry.getKey().getId()){					
						fw.write("\n\nRelevé de la période :");
						//System.out.println("Compteur : "+client.getId()+" client : "+client.getNom());
						for(ModeleCompteurDate elem : entry.getValue()){
			    			Date d = new Date(elem.getDate());
			    			
			    			if(d1.compareTo(d) <= 0 && d.compareTo(d2) <= 0){
			    				if(debut == null && fin == null ){
			    					debut = elem;
			    					fin = elem;
			    				}
			    				
			    				if(debut.getDate() > elem.getDate()){
			    					debut = elem;
			    				}
			    				
			    				if(fin.getDate() < elem.getDate())
			    					fin = elem;
			    				
			    				//System.out.println(elem.getDisplay());
			    				fw.write("\n"+elem.getDisplay());
			    			}
			    			
			    			
			    			//System.out.println(elem.getDisplay());
			    		}
						
					}
				}
				
				consoHc = (fin.getHc() - debut.getHc()) ;
				consoHp = (fin.getHp() - debut.getHp()) ;
				
				fw.write("\n\nConsommation totale :");
				fw.write("\nhc : " + consoHc + " au tarif de " + prixEnVigueurHc + " pour un total de " + consoHc * prixEnVigueurHc +  "\n" );
        		fw.write("\nhp : " + consoHp + " au tarif de " + prixEnVigueurHp + " pour un total de " + consoHp * prixEnVigueurHp +  "\n" );
				
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
			
        }
	}
	
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

