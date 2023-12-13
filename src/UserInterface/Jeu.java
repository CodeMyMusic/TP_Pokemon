package UserInterface;

import java.util.Scanner;

import Client.AllPokemons;
import Client.Joueur;
import Client.Pokemon;

public class Jeu {

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
					case 0:
						System.out.println(AllPokemons.lootbox(j));
					}
					
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
