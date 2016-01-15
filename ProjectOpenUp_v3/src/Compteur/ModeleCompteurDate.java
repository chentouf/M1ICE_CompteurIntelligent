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
	
}
