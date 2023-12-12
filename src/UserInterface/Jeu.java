package UserInterface;

import java.util.Scanner;

import Client.Joueur;
import Client.Pokemon;

public class Jeu {

	public static void main(String[] args) {
		Joueur j;
		boolean valid = false;
		String pseudo;
		Scanner scan = new Scanner(System.in);
		while (!valid) {
			System.out.println("Choisisez un pseudo");
			String input = scan.nextLine();
			try {   	
				pseudo = input;
				j = new Joueur(pseudo);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		scan.close();
		
		valid = false;
		int choice;
		scan = new Scanner(System.in);
		while (!valid) {
			System.out.println("Choisisez un pseudo");
			String input = scan.nextLine();
			try {   	
				choice = Integer.parseInt(input);
				switch (choice) {
					
				}
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		scan.close();
		System.out.println("1- Attraper un pokémon");
		System.out.println("2- Faire évoluer un pokémon");
		System.out.println("3- Jouer en ligne contre un autre joueur");
	}

}
