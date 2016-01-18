package Compteur;

public class Client {
	private int numClient;
	private String nom ;
	private String prenom ;
	private String adresse;
	private int codePostal; 
	private String ville ;
	private int intervalleReleve ;
	
	public Client(int nc, String nm, String p, String a, int cp, String v, int ir)
	{
		numClient = nc ;
		nom = nm ;
		prenom = p ;
		adresse = a ;
		codePostal = cp ;
		ville = v ;
		intervalleReleve = ir ;
	}
	
	public Client(int nc, int ir)
	{
		numClient = nc ;
		nom = "Dupont" ;
		prenom = "Martin" ;
		adresse = "36 Place du Capitole";
		codePostal = 31000  ;
		ville = "Toulouse" ;
		intervalleReleve = ir ;
	}
	
	public int getNumClient() {
		return numClient;
	}
	
	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public int getCodePostal() {
		return codePostal;
	}
	
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public int getIntervalleReleve() {
		return intervalleReleve;
	}
	
	public void setIntervalleReleve(int intervalleReleve) {
		this.intervalleReleve = intervalleReleve;
	}

}
