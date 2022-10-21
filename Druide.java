package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public int forcePotion;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom + "et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	private String prendreParole() {
		return "Le druide" + nom + " : ";
	}
	public void preparerPotion() {
		System.out.println(effetPotionMax);
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		if (forcePotion >= 7) {
			parler("J'ai préparé une super potion de force " + forcePotion);
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		
	}
	public void booster(Gaulois gaulois) {
		String var = gaulois.getNom();
		if (var == "Obélix") {
				parler("Non, tu ne peux pas avoir de potion magique");
		}
		else {
			System.out.println("Force Potion :" + forcePotion);
			gaulois.boirePotion(forcePotion);
		}
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		
	}

}
