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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//## link itsControleurPasserelle 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    
    protected List<ModeleCompteur> mesureHistorique;		//## attribute tabMesuresTraitees    
    protected List<ModeleCompteur> mesureCourante;	
    
    // Constructors
    
    //## operation ModeleRRC() 
    public  ModeleRRC() {

    }
    
    //## auto_generated 
    public int getPrixEnVigueur() {
        return prixEnVigueur;
    }
    
    //## auto_generated 
    public void setPrixEnVigueur(int p_prixEnVigueur) {
        prixEnVigueur = p_prixEnVigueur;
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
    		fw.write(" Consomation hc : " + consoHc + " au tarif de" + prixEnVigueur + "pour un total de " + consoHc * prixEnVigueur +  "\n" );
    		fw.write(" Consomation hc : " + consoHp + " au tarif de" + prixEnVigueur + "pour un total de " + consoHp * prixEnVigueur +  "\n" );
    		fw.write(" TOTAL FACTURE : " + consoHc * prixEnVigueur + consoHp * prixEnVigueur );
    		fw.close();
    	}
    	
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/ModeleRRC.java
*********************************************************************/

