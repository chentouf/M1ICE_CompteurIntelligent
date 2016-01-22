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
import java.util.Map.Entry;

import Passerelle.ControleurPasserelle;
import Compteur.ModeleCompteur;
import Compteur.ModeleCompteurDate;

//----------------------------------------------------------------------------
// RRC/ModeleRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class ModeleRRC 
public class ModeleRRC {

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
    	//TODO :prendre en compte le fait que que la liste ne contiendra plus que les mesures autorisé
		ModeleCompteur modele;
		String chaine;
		for(Entry<ModeleCompteur, LinkedList<ModeleCompteurDate>> entry : map.entrySet()){
    		modele = entry.getValue().getFirst();
			
			
			
    	}
		
		/*ModeleCompteur tmp;
		while(map.hasNext()){
			tmp = map.next();
			mesureCourante.remove(tmp);
			mesureCourante.add(tmp);			
		}*/
    }
	
	public void charger(Date d){
		
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
    
    public void produireFacture() throws IOException
    { 
    	for(Entry<ModeleCompteur, LinkedList<ModeleCompteurDate>> entry : mesure.entrySet())
    	{
    		File fichier = new File("facture"+entry.getKey().getId()+".txt"); 
    		fichier.createNewFile();
    		FileWriter fw = new FileWriter (fichier);
    		float consoHc = (entry.getKey().getHc() - entry.getValue().getLast().getHc()) ;
    		float consoHp = (entry.getKey().getHp() - entry.getValue().getLast().getHp()) ;
    		fw.write(" FACTURE COMPTEUR "+entry.getKey().getId() + "\n");
    		fw.write(" Consomation hc : " + consoHc + " au tarif de" + prixEnVigueurHc + "pour un total de " + consoHc * prixEnVigueurHc +  "\n" );
    		fw.write(" Consomation hp : " + consoHp + " au tarif de" + prixEnVigueurHp + "pour un total de " + consoHp * prixEnVigueurHp +  "\n" );
    		fw.write(" TOTAL FACTURE : " + consoHc * prixEnVigueurHc + consoHp * prixEnVigueurHp );
    		fw.close();
    	}
    	
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

