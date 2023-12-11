package Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import Serveur.Joueur;

public class Combat {
	private final static int maxPokemons = 6;
	private static ArrayList<Pokemon> listePokemons = new ArrayList<Pokemon>();
	private Pokemon currentPokemon;
	
	public Combat() {
	}
	
    public static void main(String[] args) {
    	while (listePokemons.size()<maxPokemons) {
    		addPokemon();
    	}
    	System.out.println("Vous avez séléctionné 6 pokemons, vous êtes prêt pour affronter un autre joueur en ligne !");
    	
    }
    
	public static void chooseCurrentPokemon() {
		boolean valid = false;
		int pokeNum;
		Scanner scan = new Scanner(System.in);
		while (!valid) {
			System.out.println("Choisisez un pokemon (numéro)");
			for (int i =0; i<maxPokemons; i++) {
				System.out.println(i + ""+listePokemons.get(i));
			}
			String input = scan.nextLine();
			try {   	
				pokeNum = Integer.parseInt(input);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		scan.close();
	    Pokemon currentPokemon = listePokemons.get(pokeNum);
	}
	
	
	public static void addPokemon() {
	}
	
	public static void start() {
		
	}
	
	public void lancerCombat() {
        Client c = new Client(listePokemons);
        c.run();
	}
}
