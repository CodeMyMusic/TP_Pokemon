package UserInterface;

import java.util.Random;
import java.util.Scanner;

import Client.Pokedex;
import Client.Joueur;
import Client.Pokemon;

public class Jeu {
	private static Random rand = new Random(); 
	
	public static HashMap<String,  ListePokemon = {
			
	}

	public static void main(String[] args) {
		Joueur j = newJoueur();
	
		boolean valid = false;
		int choice;
		Scanner scan = new Scanner(System.in);
		while (!valid) {
			System.out.println("Choisisez un pseudo");
			String input = scan.nextLine();
			try {   	
				choice = Integer.parseInt(input);
				if (choice >=0 && choice < 3) {
					valid = true;
					switch (choice) {
					case 0:{
						System.out.println(Jeu.lootbox(j));
					}
					case 1:{
						System.out.println();
					}
				}
				}else {
					System.out.println("Invalide");
				}
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		scan.close();
		System.out.println("1- Attraper un pokémon");
		System.out.println("1- Supprimer un pokémon");
		System.out.println("2- Faire évoluer un pokémon");
		System.out.println("3- Jouer en ligne contre un autre joueur");
	}
		
    public static Pokemon lootbox() {
    	int attrape = rand.nextInt(Pokedex.ListePokemonAttrapables.length);
    	Pokemon p = Pokedex.ListePokemonAttrapables[attrape];
    	
    	// random stats
    	
    	p.setPv(p.getPv()+1);
    	p.setPc(p.getPc()+1);

    	return p;
    }
    
    public static String lootbox(Joueur j) {
        String message = "";
        int tirage = rand.nextInt(100);
        if (tirage < 20) {
        	message = "Pas de chance !";
        } 
        else {
        	message = "Vous avez gagné un pokemon !";
        	j.addPokemon(lootbox());
        }
        return message;
    }
	
	public static Joueur newJoueur() {
		Joueur j = null;
		boolean valid = false;
		String pseudo;
		Scanner scan = new Scanner(System.in);
		while (!valid) {
			System.out.println("Choisisez un pseudo");
			String input = scan.nextLine();
			try {   	
				pseudo = input;
				scan.close();
				j = new Joueur(pseudo);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		return j;
	}

}
