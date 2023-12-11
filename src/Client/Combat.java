package Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import Serveur.Joueur;

public class Combat {
	private Joueur j;
	private final static int maxPokemons = 6;
	private static ArrayList<Pokemon> listePokemons = new ArrayList<Pokemon>();
	private Pokemon currentPokemon;
	
	public Combat() {
	}
	
    public static void main(String[] args) {
    	boolean outOfRange = false;
    	while (listePokemons.size() < maxPokemons) {
    		addPokemon();
    	}
    	System.out.println("Vous avez séléctionné 6 pokemons, vous êtes prêt pour affronter un autre joueur en ligne !");
    }
    
    public static void choosePokemon(ArrayList<Pokemon> list) {
		boolean valid = false;
		int pokeNum;
		Pokemon p;
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
		Pokemon p =  
		scan.close();
		return p;
    }
    
	public static void chooseCurrentPokemon() {
	    Pokemon currentPokemon = choosePokemon(listePokemons);
	}
	
	
	public static boolean addPokemon() {
		boolean outOfRange = false;
		if (listePokemons.size()<maxPokemons) {
			listePokemons.add(choosePokemon(j.));
		}else {
			outOfRange = true;
		}
		return outOfRange;
	}
	
	public static void start() {
		System.out.println("Recherche de ");
	}
	
	public void lancerCombat() {
        Client c = new Client(listePokemons);
        c.run();
	}
}
