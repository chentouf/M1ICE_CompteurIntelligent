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

    protected int prixEnVigueurHc,prixEnVigueurHp;		// à stocker prochainement
    protected List<ModeleCompteur> mesureHistorique;
	protected List<ModeleCompteur> mesureCourante; 
    
    // Constructors
    
    //## operation ModeleRRC() 
    public  ModeleRRC(int prixEnVigeurHp, int prixEnVigeurHc) {

        //#[ operation ModeleRRC() 
        //#]
    	this.prixEnVigueurHp = prixEnVigeurHp;
    	this.prixEnVigueurHc = prixEnVigueurHc;
    	
    	this.mesureHistorique = new ArrayList<ModeleCompteur>();
    	this.mesureCourante = new ArrayList<ModeleCompteur>();
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
	
	public void save() {
		File hist = new File("listeCompteurHist");
		File cour = new File("listeCompteurCour");
		FileOutputStream fout;
		ObjectOutputStream oos;
		
		try {
			if(!hist.exists())
				hist.createNewFile();
			if(!cour.exists())
				cour.createNewFile();	
			
			fout = new FileOutputStream (hist);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(mesureHistorique);
			fout.close();
			
			fout= new FileOutputStream ("listeCompteurHist");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(mesureCourante);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public void produireFacture() throws IOException
    { 
    	for(int i = 0; i < mesureCourante.size(); i++)
    	{
    		File fichier = new File("facture"+mesureCourante.get(i).getId()+".txt"); 
    		fichier.createNewFile();
    		FileWriter fw = new FileWriter (fichier);
    		float consoHc = (mesureCourante.get(i).getHc() - mesureHistorique.get(i).getHc()) ;
    		float consoHp = (mesureCourante.get(i).getHp() - mesureHistorique.get(i).getHp()) ;
    		fw.write(" FACTURE COMPTEUR "+mesureCourante.get(i).getId() + "\n");
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

