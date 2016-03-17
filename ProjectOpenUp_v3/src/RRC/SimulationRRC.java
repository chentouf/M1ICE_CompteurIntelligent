package RRC;

import java.io.IOException;
import java.util.Date;

import Compteur.Client;
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
		controleurRRC = new ControleurRRC(7,8,3);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
			try {
				Thread.sleep(controleurRRC.getModeleRRC().getDuree()*1000); // intervalle de temps entre deux relev� c�t� RRC
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ControleurPasserelle controleurP = simuPasserelle.getControleurPasserelle();
			
			controleurRRC.getModeleRRC().majMesure(controleurP.getModelePasserelle().getReleve()); // simulation de l'acc�s � la passerelle par le RRC
			controleurRRC.getVueRRC().miseAJourAffichageMesures();
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
		Date date = new Date();
		Client clientTest = new Client(0,5);
		Thread t = new Thread(simuRRC.getSimulationPasserelle());
		
		t.start();
		t = new Thread(simuRRC);
		t.start();
		
		tab[0] = new SimulationCompteur(clientTest);
		
		simuRRC.getSimulationPasserelle().getControleurPasserelle()	.getModelePasserelle()
			.addListeCompteurs(tab[0].getControleur().getModeleCompteur());
		// test connection false
		//tab[i].getControleur().getModeleCompteur().setConnection(false);
		new Thread(tab[0]).start();
		
		for(int i = 1;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(i,10));
			
			simuRRC.getSimulationPasserelle().getControleurPasserelle()	.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
			new Thread(tab[i]).start();
		}
		
		try {
			Thread.sleep(15000);
			
			simuRRC.getControleurRRC().getModeleRRC().produireFacture(clientTest,date);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
}
