package Client;

import java.util.ArrayList;

public class Joueur {
	private String pseudo;
	private ArrayList<Pokemon> listePokemons = new ArrayList<Pokemon>();

    public Joueur(String pseudo) {
    	this.pseudo = pseudo;
    }
    
    public void chooseRandomPokemon() {
    	
    }
    
    public void combattre() {
    	Combat combat = new Combat();
    	
    }
}
