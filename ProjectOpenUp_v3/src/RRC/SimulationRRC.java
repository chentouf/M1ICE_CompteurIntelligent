package RRC;

import Passerelle.ControleurPasserelle;
import Passerelle.SimulationPasserelle;


public class SimulationRRC implements Runnable {
	
	SimulationPasserelle simuPasserelle;
	ControleurRRC controleurRRC;

	public SimulationRRC(){
		// TODO Auto-generated constructor stub
		simuPasserelle = new SimulationPasserelle();
		controleurRRC = new ControleurRRC(7,8,30);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			new Thread(simuPasserelle);
			
			try {
				Thread.sleep(controleurRRC.getModeleRRC().getDuree());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ControleurPasserelle controleurP = simuPasserelle.getControleurPasserelle();
			
			controleurRRC.getModeleRRC().majMesure(controleurP.getInfo());
		}
	}	
	
	public static void main(String[] args){
		SimulationRRC simuRRC = new SimulationRRC();
		
	}
}
