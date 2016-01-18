package Compteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Passerelle.ModelePasserelle;


public class SimulationCompteur implements Runnable {
	
	private ControleurCompteur controleur;
	private Timer t;
	private ModelePasserelle modeleP;

	public SimulationCompteur(String id) {
		// TODO Auto-generated constructor stub
		
		controleur = new ControleurCompteur(id);
		t = null;
	}
	
	public SimulationCompteur(String id,ModelePasserelle modeleP){
		// constructeur utilisé dans le cas ou il est couplé à une passerelle.
		controleur = new ControleurCompteur(id);
		this.modeleP = modeleP; 
		// timer qui notifie la passerelle qu'elle peut faire une relever
		t = new Timer(controleur.getModeleCompteur().getClient().getIntervale(), new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				modeleP.majCompteur(controleur.getModeleCompteur());
			}
		});
	}
	
	public ControleurCompteur getControleur() {
		return controleur;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(t != null){
			t.start();
		}
		
		while(true){
			controleur.getModeleCompteur().setHc(controleur.getModeleCompteur().getHc()+1);
			controleur.getModeleCompteur().setHp(controleur.getModeleCompteur().getHp()+2);
			
			System.out.println(controleur.getVueCompteur().getDisplay());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		SimulationCompteur[] tab = new SimulationCompteur[3];
		for(int i=0;i<3;i++){
			
			tab[i] = new SimulationCompteur(""+i);
			new Thread(tab[i]).start();
		}
	}
}
