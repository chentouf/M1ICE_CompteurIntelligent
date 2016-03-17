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
		
		for(int i = 0;i<simuRRC.getTab().length-1;i++){
			
			simuRRC.getSimulationPasserelle().getControleurPasserelle()	.getModelePasserelle()
				.addListeCompteurs(simuRRC.getTab()[i].getControleur().getModeleCompteur());

			new Thread(simuRRC.getTab()[i]).start();
		}
		
		new Thread(simuRRC).start();
		
	}
}
