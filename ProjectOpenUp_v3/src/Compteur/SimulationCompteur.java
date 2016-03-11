package Compteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class SimulationCompteur implements Runnable {
	
	private ControleurCompteur controleur;
	
	public SimulationCompteur(String id) {
		// TODO Auto-generated constructor stub
		
		controleur = new ControleurCompteur(id);
	}
	
	public SimulationCompteur(ModeleCompteur modele){
		controleur = new ControleurCompteur(modele);
	}

	public ControleurCompteur getControleur() {
		return controleur;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			controleur.getModeleCompteur().setHc(controleur.getModeleCompteur().getHc()+1);
			controleur.getModeleCompteur().setHp(controleur.getModeleCompteur().getHp()+2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String getDisplay(){

		
		return controleur.getVueCompteur().getDisplay();
	}
	
	public static void main(String[] args){
		SimulationCompteur[] tab = new SimulationCompteur[3];
		for(int i=0;i<3;i++){
			
			tab[i] = new SimulationCompteur(""+i);
			new Thread(tab[i]).start();
		}
		
		Timer t = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(SimulationCompteur s : tab)
					System.out.println(s.getDisplay());
			}
		});
		
		t.start();
	}
}
