package Passerelle;

import Compteur.Client;
import Compteur.SimulationCompteur;

public class SimulationPasserelle implements Runnable {
	

	public ControleurPasserelle passerelle;
	
	public SimulationPasserelle(){
		passerelle = new ControleurPasserelle(1);
	}
	
	public void initialize(){
		SimulationPasserelle simulation = new SimulationPasserelle();
		SimulationCompteur[] tab = new SimulationCompteur[3];
		
		new Thread(simulation).start();
		
		for(int i = 0;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(i,10));
			
			simulation.passerelle.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
			new Thread(tab[i]).start();
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		simulation.passerelle.getModelePasserelle().removeListeCompteurs(tab[1].getControleur().getModeleCompteur());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		simulation.passerelle.getModelePasserelle().addListeCompteurs(tab[1].getControleur().getModeleCompteur());
	}
	
	public static void main(String[] args){
		SimulationPasserelle pa = new SimulationPasserelle();
		
		pa.initialize();
		
		new Thread(pa).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
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
