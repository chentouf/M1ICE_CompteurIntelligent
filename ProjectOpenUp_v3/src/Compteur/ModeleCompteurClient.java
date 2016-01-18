package Compteur;

public class ModeleCompteurClient extends ModeleCompteur{
	
	private Client client;
	
	public ModeleCompteurClient(Client client){
		super();
		
		this.client = new Client();
	}
}
