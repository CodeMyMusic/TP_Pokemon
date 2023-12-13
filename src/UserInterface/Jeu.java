package UserInterface;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Client.Pokedex;
import Client.Joueur;
import Client.Pokemon;

public class Jeu {
	private static Random rand = new Random(); 
	private static Scanner scan = new Scanner(System.in);
	
	public static Joueur newJoueur() {
		Joueur j = null;
		boolean valid = false;
		String pseudo;
		while (!valid) {
			System.out.println("Choisisez un pseudo :");
			String input = scan.nextLine();
			try {   	
				pseudo = input;
				valid = true;
				j = new Joueur(pseudo);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		return j;
	}
	
	public static int promptNumber(String message, ArrayList<Integer> n) {
		boolean valid = false;
		int choice = 0;
		while (!valid) {
			System.out.println(message);
			String input = scan.nextLine();
			try {   	
				choice = Integer.parseInt(input);
				if (n.contains(choice)){
					valid = true;
				}else {
					System.err.println("Action n'existe pas");
				}
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		return choice;
	}
	
	private static String[] actions = {
			"0 : Attraper un pokemon",
			"1 : Supprimer un pokemon",
			"2 : Faire évoluer un pokemon",
			"3 : Jouer en ligne contre un autre joueur",
	};
	
	public static void displayActions() {
		for (String s : actions) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		System.err.println("0 : Créer un joueur");
		System.err.println("1 : Charger un joueur");
		
		Joueur j = newJoueur();
		
		displayActions();
	
		ArrayList<Integer> actionsValidNumbers = new ArrayList<Integer>();
		for (int i = 0; i<actions.length; i++) {
			actionsValidNumbers.add(i);
		}
		int nbAction = promptNumber("Choisissez une action", actionsValidNumbers);
		switch (nbAction) {
			// Attraper un pokemon
			case 0:{
				System.out.println(Jeu.lootbox(j));
			}
			// Supprimer un pokemon
			case 1:{				
				System.out.println(j.removePokemon(null));
			}
			// Faire évoluer un pokemon
			case 2:{
				System.out.println();
			}
			// Jouer en ligne contre un autre joueur
		}
	}
		
    public static Pokemon lootbox() {
    	int randomIndex = rand.nextInt(Pokedex.ListePokemonAttrapables.length);
    	Pokemon p = Pokedex.ListePokemonAttrapables[randomIndex];
    	
    	// random stats
    	
    	p.setPv(p.getPv()+1);
    	p.setPc(p.getPc()+1);

    	return p;
    }
    
    public static String lootbox(Joueur j) {
        String message = "";
        int tirage = rand.nextInt(10);
        if (tirage < 2) {
        	message = "Pas de chance !";
        } 
        else {
        	message = "Vous avez gagné un pokemon !";
        	j.addPokemon(lootbox());
        }
        return message;
    }

}
