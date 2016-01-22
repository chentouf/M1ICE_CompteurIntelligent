package RRC;

import java.io.IOException;

import Compteur.SimulationCompteur;
import LCD.ControleurLCD;
import Passerelle.ControleurPasserelle;
import Passerelle.SimulationPasserelle;


public class SimulationRRC implements Runnable {
	
	SimulationPasserelle simuPasserelle;
	ControleurRRC controleurRRC;

	public SimulationRRC(){
		// TODO Auto-generated constructor stub
		simuPasserelle = new SimulationPasserelle();
		controleurRRC = new ControleurRRC(7,8,10);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
			try {
				Thread.sleep(controleurRRC.getModeleRRC().getDuree()*10000); // intervalle de temps entre deux relevé côté RRC
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ControleurPasserelle controleurP = simuPasserelle.getControleurPasserelle();
			
			controleurRRC.getModeleRRC().majMesure(controleurP.getModelePasserelle().getReleve()); // simulation de l'accès à la passerelle par le RRC
		}
	}	
	
	public SimulationPasserelle getSimulationPasserelle(){
		return simuPasserelle;
	}
	
	public ControleurRRC getControleurRRC(){
		return controleurRRC;
	}
	
	public static void main(String[] args){
		SimulationRRC simuRRC = new SimulationRRC();
		SimulationCompteur[] tab = new SimulationCompteur[3];
		ControleurLCD lcd = new ControleurLCD();
		
		Thread t = new Thread(simuRRC.getSimulationPasserelle());
		
		t.start();
		t = new Thread(simuRRC);
		t.start();
		
		for(int i = 0;i<3;i++){
			tab[i] = new SimulationCompteur(""+i);
			
			simuRRC.getSimulationPasserelle().getControleurPasserelle()	.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
			new Thread(tab[i]).start();
		}
		
		try {
			Thread.sleep(simuRRC.getControleurRRC().getModeleRRC().getDuree()*1000);
			
			simuRRC.getControleurRRC().getModeleRRC().produireFacture();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
}
