package Passerelle;

import java.util.Iterator;

import Compteur.Client;
import Compteur.ModeleCompteur;
import Compteur.SimulationCompteur;
import client.VueClientClient;

public class SimulationPasserelle implements Runnable {
	
	public ControleurPasserelle passerelle;
	
	public SimulationPasserelle(){
		passerelle = new ControleurPasserelle(1);
	}
	
	public void initialize(){
		
		new Thread(this).start();
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.passerelle.getModelePasserelle().removeListeCompteurs(tab[1].getControleur().getModeleCompteur());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.passerelle.getModelePasserelle().addListeCompteurs(tab[1].getControleur().getModeleCompteur());*/
	}
	
	public static void main(String[] args){
		SimulationPasserelle pa = new SimulationPasserelle();
		
		SimulationCompteur[] tab = new SimulationCompteur[3];
		Client c = new Client(10);
		
		
		tab[0] = new SimulationCompteur(c);
		for(int i = 1;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(10));
			
			pa.passerelle.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
			new Thread(tab[i]).start();
		}
		
		new Thread(pa).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//System.out.println("okpa");
			passerelle.getModelePasserelle().majSysteme();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ControleurPasserelle getControleurPasserelle(){
		return passerelle;
	}
}
