package RRC;

import Passerelle.ModelePasserelle;
import Passerelle.SimulationPasserelle;


public class SimulationRRC implements Runnable {
	
	SimulationPasserelle simuPasserelle;

	public SimulationRRC(){
		// TODO Auto-generated constructor stub
		simuPasserelle = new SimulationPasserelle();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			new Thread(simuPasserelle);
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ModelePasserelle modeleP = simuPasserelle.getControleurPasserelle().getModelePasserelle();
		}
	}
	
	public static void main(String[] args){
		SimulationRRC simuRRC = new SimulationRRC();
		
	}
}
