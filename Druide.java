package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
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
	public void preparerPotion(int effetPotionMax) {
		Random random = new Random();
		int forcePotion = random.nextInt(effetPotionMax);
		while (forcePotion <5) {
			forcePotion = random.nextInt(effetPotionMax);
		}
		if (forcePotion >= 7) {
			parler("J'ai préparé une super potion de force ");
			System.out.println(forcePotion);
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force ");
			System.out.println(forcePotion);
		}
		
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion(10);
		
	}

}
