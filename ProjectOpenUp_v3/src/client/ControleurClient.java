package client;

import java.util.Date;

import Compteur.Client;
import Compteur.SimulationCompteur;
import Compteur.VueCompteur;
import RRC.SimulationRRC;

public class ControleurClient {
	private Client c;
	private SimulationRRC simuRRC;
	
	public void lancerAdmin(){
		simuRRC = new SimulationRRC();
		this.c = new Client(10);
		SimulationCompteur[] tab = new SimulationCompteur[3];
		
		for(int i = 1;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(10));
			
			simuRRC.getSimulationPasserelle().passerelle.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
			
		}
		

		simuRRC.initialize();
		simuRRC.getSimulationPasserelle().initialize();
		//simuRRC.getSimulationPasserelle().getControleurPasserelle().getVuePasserelle().setVisible(false);
	}
	
	public void lancerClient(){
		simuRRC = new SimulationRRC();
		this.c = new Client(10);
		VueCompteur.affich = true;
		SimulationCompteur simuc = new SimulationCompteur(c);
		
		simuRRC.getControleurRRC().getVueRRC().setVisible(false);
		simuRRC.getSimulationPasserelle().getControleurPasserelle().getModelePasserelle().addListeCompteurs(simuc.getControleur().getModeleCompteur());
		simuRRC.initialize();
		simuRRC.getSimulationPasserelle().initialize();
		simuRRC.getSimulationPasserelle().getControleurPasserelle().getVuePasserelle().setVisible(false);
		//simuRRC.getSimulationPasserelle().getControleurPasserelle().getVuePasserelle().setVisible(false);
		
		VueClientClient vuecc = new VueClientClient(c,this);
		
	}
	
	public void produireFacture(Date d1, Date d2){
		simuRRC.getControleurRRC().getModeleRRC().produireFacture(c, d1,d2);
	}

	public void lancerRRC() {
		// TODO Auto-generated method stub
		simuRRC = new SimulationRRC();
		this.c = new Client(10);
		VueCompteur.affich = false;
		SimulationCompteur[] tab = new SimulationCompteur[3];
		
		simuRRC.getSimulationPasserelle().getControleurPasserelle().getVuePasserelle().setVisible(false);
		
		for(int i = 1;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(10));
			tab[i].getControleur().getVueCompteur().setVisible(false);
			simuRRC.getSimulationPasserelle().passerelle.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
			new Thread(tab[i]).start();
		}
		

		simuRRC.initialize();
		simuRRC.getSimulationPasserelle().initialize();
		simuRRC.getSimulationPasserelle().getControleurPasserelle().getVuePasserelle().setVisible(false);
	}
	
	public void lancerOpe() {
		// TODO Auto-generated method stub
		VueCompteur.affich = false;
		simuRRC = new SimulationRRC();
		this.c = new Client(10);
		simuRRC.getControleurRRC().getVueRRC().setVisible(false);
		SimulationCompteur[] tab = new SimulationCompteur[3];
		
		for(int i = 1;i<3;i++){
			tab[i] = new SimulationCompteur(new Client(10));
			tab[i].getControleur().getVueCompteur().setVisible(false);
			simuRRC.getSimulationPasserelle().passerelle.getModelePasserelle()
				.addListeCompteurs(tab[i].getControleur().getModeleCompteur());
			// test connection false
			//tab[i].getControleur().getModeleCompteur().setConnection(false);
			new Thread(tab[i]).start();
		}
		

		simuRRC.initialize();
		simuRRC.getSimulationPasserelle().initialize();
	}
	
	
}
