package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force*effetPotion / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8); //création de l'objet asterix de la classe Gaulois correspondant à un gaulois de nom "Astérix" et de force 8.
		Romain romulus = new Romain("Romulus", 5);
		System.out.println(asterix.getNom());
		asterix.parler("Je suis Astérix");
		asterix.boirePotion(2);
		asterix.frapper(romulus);

	}

}