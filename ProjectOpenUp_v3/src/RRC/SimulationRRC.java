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
	SimulationCompteur clientTest;
	SimulationCompteur[] tab;
	
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
				Thread.sleep(controleurRRC.getModeleRRC().getDuree()*1000); // intervalle de temps entre deux relevé côté RRC
				System.out.println(controleurRRC.getModeleRRC().getDuree());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ControleurPasserelle controleurP = simuPasserelle.getControleurPasserelle();
			
			controleurRRC.getModeleRRC().majMesure(controleurP.getModelePasserelle().getReleve()); // simulation de l'accès à la passerelle par le RRC
			controleurRRC.getVueRRC().miseAJourAffichageMesures();
		}
	}	
	
	public SimulationPasserelle getSimulationPasserelle(){
		return simuPasserelle;
	}
	
	public ControleurRRC getControleurRRC(){
		return controleurRRC;
	}
	
	public SimulationCompteur getClientTest() {
		return clientTest;
	}

	public SimulationCompteur[] getTab() {
		return tab;
	}

	public void setTab(SimulationCompteur[] tab) {
		this.tab = tab;
	}

	public void initialize(){
		//ControleurLCD lcd = new ControleurLCD();	
		new Thread(this).start();
	}
	
	public static void main(String[] args){
		SimulationRRC simuRRC = new SimulationRRC();
		
		SimulationCompteur[] tab = new SimulationCompteur[3];
		
		for(int i = 1;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(10));
			
			simuRRC.getSimulationPasserelle().passerelle.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
		}
		
		new Thread(simuRRC.getSimulationPasserelle()).start();
		new Thread(simuRRC).start();
		
	}
}
