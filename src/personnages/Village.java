package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois;

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.nbVillageois = 0;
        this.villageois = new Gaulois[nbVillageoisMaximum];
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }
    
    public void ajouterHabitant(Gaulois gaulois) {
    	villageois[nbVillageois] = gaulois;
    	nbVillageois ++;
	}
    
    public Gaulois trouverHabitant(int numeroVillageois) {
    	return villageois[numeroVillageois]; 
	}
    
    public void afficherVillageois() {
    	System.out.println("Dans le " + nom + " du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0;i<nbVillageois;i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
    
    public static void main(String[] args) {
		Village village = new Village("Villages des Irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
			// ERREUR : Index 30 out of bounds for length 3
		Chef abra = new Chef("Abraracourcix", 6, village);
		village.setChef(abra);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
//		
//		Gaulois obelix = new Gaulois("Obélix", 8);
//		village.ajouterHabitant(obelix);
//		village.afficherVillageois();
    }

}
