package Passerelle;

import java.util.Iterator;

import Compteur.Client;
import Compteur.ModeleCompteur;
import Compteur.SimulationCompteur;
import LCD.ControleurLCD;
import Passerelle.ControleurPasserelle;

public class SimulationPasserelle implements Runnable {
	

	private ControleurPasserelle passerelle;
	
	public SimulationPasserelle(){
		passerelle = new ControleurPasserelle(1);
	}
	
	public static void main(String[] args){
		SimulationPasserelle simulation = new SimulationPasserelle();
		SimulationCompteur[] tab = new SimulationCompteur[3];
		ControleurLCD lcd = new ControleurLCD();
		
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
