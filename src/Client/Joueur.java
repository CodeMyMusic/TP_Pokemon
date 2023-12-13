package Client;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

//dresseur = joueur

public class Joueur {
    private int id;
    private String pseudo;
    private int nbPokemon;
	private ArrayList<Pokemon> listePokemons = new ArrayList<Pokemon>();
	
	

    public ArrayList<Pokemon> getListePokemons() {
		return listePokemons;
	}



	public void setListePokemons(ArrayList<Pokemon> listePokemons) {
		this.listePokemons = listePokemons;
	}



	// Tableau associatif qui permet de stocker des bonbons par type de pokemon
    Map<String, Integer> ListeBonbons = new HashMap<String, Integer>();
    {
        ListeBonbons.put("Normal", 0);
        ListeBonbons.put("Feu", 0);
        ListeBonbons.put("Eau", 0);
        ListeBonbons.put("Plante", 0);
        ListeBonbons.put("Electrik", 0);
        ListeBonbons.put("Glace", 0);
        ListeBonbons.put("Combat", 0);
        ListeBonbons.put("Poison", 0);
        ListeBonbons.put("Sol", 0);
        ListeBonbons.put("Vol", 0);
        ListeBonbons.put("Psy", 0);
        ListeBonbons.put("Insecte", 0);
        ListeBonbons.put("Roche", 0);
        ListeBonbons.put("Spectre", 0);
        ListeBonbons.put("Dragon", 0);
    }

    // Constructeur
    public Joueur(String pseudo) {
        this.pseudo = pseudo;
    }
    
    public String removePokemon(Pokemon p) {
    	System.out.println(p);
    	String pokName = p.getNom();
    	listePokemons.remove(p);
    	return String.format("Pokémon %s supprimé", pokName);
    }
    
    public String addPokemon(Pokemon p) {
    	System.out.println(p);
    	String pokName = p.getNom();
    	listePokemons.add(p);
    	return String.format("Pokémon %s ajouté", pokName);
    }
}
