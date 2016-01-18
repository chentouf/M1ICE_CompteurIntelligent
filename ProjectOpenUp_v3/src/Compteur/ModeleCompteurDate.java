package Compteur;

import java.util.Date;


public class ModeleCompteurDate extends ModeleCompteur{
	private Date date;
	
	public ModeleCompteurDate(ModeleCompteur modele){
		super(modele);
		
		this.date = new Date();
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
    public boolean equals(Object o){
    	if(o instanceof ModeleCompteur){
    		ModeleCompteurDate modele = (ModeleCompteurDate)o;
    		
    		if(modele.getId() == id && this.date == modele.date)
    			return true;
    		else
    			return false;
    	}
    	return false;
    }
	
}
