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
	
	public Combat() {
	}
	
    public static void main(String[] args) {
    	while (listePokemons.size()<maxPokemons) {
    		addPokemon();
    	}
    	System.out.println("Vous avez séléctionné 6 pokemons, vous êtes prêt pour affronter un autre joueur en ligne !");
    	
    }
	
	
	public static void addPokemon() {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Choisisez un pokemon (nom ou id sans fautes)");
	    String pokemon = scan.nextLine();
		listePokemons.add(null);
	}
	
	public static findPokemon()
	
	public void lancerCombat() {
        Client c = new Client(listePokemons);
        c.run();
	}
}
