package Compteur;

import java.util.Date;


public class ModeleCompteurDate extends ModeleCompteur{
	private long date;
	
	public ModeleCompteurDate(ModeleCompteur modele){
		super(modele);
		
		//this.date = new Date(System.currentTimeMillis());
		this.date = System.currentTimeMillis();
	}
	
	public ModeleCompteurDate(ModeleCompteurDate modele){
		super(modele);
		
		//this.date = new Date(System.currentTimeMillis());
		this.date = modele.date;
	}
	
	public long getDate() {
		return date;
		//return null;
	}

	public void setDate(Date date) {
		//this.date = date;
	}
	
	@Override
    public boolean equals(Object o){
    	if(o instanceof ModeleCompteurDate){
    		ModeleCompteurDate modele = (ModeleCompteurDate)o;
    		
    		if(modele.getId() == id && this.date == modele.date)
    			return true;
    		else
    			return false;
    	}
    	return false;
    }
	
	public String getDisplay(){
		return "Compteur "+this.id+" : "+this.hc+" // "+this.hp+" au "+new Date(this.date).toString();
	}
	
}
