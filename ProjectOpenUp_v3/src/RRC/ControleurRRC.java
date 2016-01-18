/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurRRC
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/RRC/ControleurRRC.java
*********************************************************************/

package RRC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import Compteur.ModeleCompteur;
import Passerelle.ControleurPasserelle;

//----------------------------------------------------------------------------
// RRC/ControleurRRC.java                                                                  
//----------------------------------------------------------------------------

//## package RRC 


//## class ControleurRRC 
public class ControleurRRC {
    
    protected ModeleRRC modeleRRC;		//## link modeleRRC 
    
    protected VueRRC vueRRC;		//## link vueRRC 
    // Constructors
    
    /**
     * @param vueRRC
     * @param modeleRRC
    */
    //## operation ControleurRRC(VueRRC,ModeleRRC) 
    public  ControleurRRC(int prixEnVigeurHp, int prixEnVigeurHc, int duree) {
        //#[ operation ControleurRRC(VueRRC,ModeleRRC) 
        //#]
    	modeleRRC = new ModeleRRC(prixEnVigeurHc,prixEnVigeurHp,duree);
    	vueRRC = new VueRRC();
    }
   

    //## auto_generated 
    public ModeleRRC getModeleRRC() {
        return modeleRRC;
    }
    
    //## auto_generated 
    public void setModeleRRC(ModeleRRC p_ModeleRRC) {
        modeleRRC = p_ModeleRRC;
    }
    
    //## auto_generated 
    public VueRRC getVueRRC() {
        return vueRRC;
    }
    
    //## auto_generated 
    public void setVueRRC(VueRRC p_VueRRC) {
        vueRRC = p_VueRRC;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/RRC/ControleurRRC.java
*********************************************************************/

