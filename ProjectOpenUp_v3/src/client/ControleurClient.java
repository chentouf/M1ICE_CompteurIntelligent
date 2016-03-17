package client;

import java.util.Date;

import Compteur.Client;
import Compteur.SimulationCompteur;
import RRC.SimulationRRC;

public class ControleurClient {
	private Client c;
	private SimulationRRC simuRRC;
	
	public void lancerRRC(){
		SimulationRRC rc = new SimulationRRC();
		rc.initialize();
		
		new Thread(rc).start();
	}
	
	public void lancerClient(){
		simuRRC = new SimulationRRC();
		this.c = new Client(0,10);
		SimulationCompteur simuc = new SimulationCompteur(c);
		
		simuRRC.getSimulationPasserelle().getControleurPasserelle().getModelePasserelle().addListeCompteurs(simuc.getControleur().getModeleCompteur());
		simuRRC.initialize();
		simuRRC.getSimulationPasserelle().initialize();
		//simuRRC.getSimulationPasserelle().getControleurPasserelle().getVuePasserelle().setVisible(false);
		
		simuc.initialize();
		
		VueClientClient vuecc = new VueClientClient(c,this);
		
	}
	
	public void produireFacture(Date d1, Date d2){
		simuRRC.getControleurRRC().getModeleRRC().produireFacture(c, d1,d2);
	}
	
	
}
