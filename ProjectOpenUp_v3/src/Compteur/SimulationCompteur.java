package Compteur;


public class SimulationCompteur implements Runnable {
	
	private ControleurCompteur controleur;

	public SimulationCompteur(String id) {
		// TODO Auto-generated constructor stub
		
		controleur = new ControleurCompteur(id);


	}
	
	public ControleurCompteur getControleur() {
		return controleur;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			controleur.getModeleCompteur().setHc(controleur.getModeleCompteur().getHc()+1);
			controleur.getModeleCompteur().setHc(controleur.getModeleCompteur().getHp()+2);
			
			//System.out.println(controleur.getVueCompteur().getDisplay());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		SimulationCompteur[] tab = new SimulationCompteur[3];
		for(int i=0;i<3;i++){
			
			tab[i] = new SimulationCompteur(""+i);
			new Thread(tab[i]).start();
		}
	}
}
