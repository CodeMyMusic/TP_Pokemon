package Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Combat {
	private static Joueur j;
	private final static int maxPokemons = 6;
	private static ArrayList<Pokemon> listePokemons = new ArrayList<Pokemon>();
	private static Pokemon currentPokemon;

	
	public void setJoueur(Joueur j) {
		Combat.j = j;
	}
	
    public static void main(String[] args) {
    	boolean outOfRange = false;
    	while (!outOfRange) {
    		outOfRange = addPokemon();
    	}
    	System.out.println("Vous avez séléctionné 6 pokemons, vous êtes prêt pour affronter un autre joueur en ligne !");
    }
    
    public static Pokemon choosePokemon(ArrayList<Pokemon> list) {
		boolean valid = false;
		int pokeNum;
		Pokemon p = null;
		Scanner scan = new Scanner(System.in);
		while (!valid) {
			System.out.println("Choisisez un pokemon (numéro)");
			for (int i =0; i<maxPokemons; i++) {
				System.out.println(i + ""+list.get(i));
			}
			String input = scan.nextLine();
			try {   	
				pokeNum = Integer.parseInt(input);
				valid = true;
				p = list.get(pokeNum);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		}
		scan.close();
		return p;
    }
    
	public static void chooseCurrentPokemon() {
	    Pokemon currentPokemon = choosePokemon(listePokemons);
	}
	
	
	public static boolean addPokemon() {
		boolean outOfRange = false;
		if (listePokemons.size()<maxPokemons) {
			listePokemons.add(choosePokemon(j.getListePokemons()));
		}else {
			outOfRange = true;
		}
		return outOfRange;
	}
	
	public static void start() {
		System.out.println("Recherche de ");
	}
	
	public static void lancer() {
        Client c = new Client(listePokemons);
        c.run();
	}
}
