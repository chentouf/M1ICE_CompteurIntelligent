package LED;

import java.util.Iterator;

import Compteur.Client;
import Compteur.ModeleCompteur;
import Compteur.SimulationCompteur;
import LCD.ControleurLCD;
import Passerelle.ControleurPasserelle;
import Passerelle.SimulationPasserelle;

public class SimulationLED implements Runnable {
	
	private ControleurPasserelle passerelle;
	
	public SimulationLED(){
		passerelle = new ControleurPasserelle(1);
		
	}
	
	public static void main(String[] args){
		SimulationPasserelle simulation = new SimulationPasserelle();
		SimulationCompteur[] tab = new SimulationCompteur[3];
		ControleurLCD lcd = new ControleurLCD();
		
		simulation.passerelle.setControleurLCD(lcd);
		
		new Thread(simulation).start();
		
		for(int i = 0;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(10));
			
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
		
		tab[1].getControleur().getModeleCompteur().setConnection(false);
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tab[1].getControleur().getModeleCompteur().setConnection(true);
		
		
		
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

