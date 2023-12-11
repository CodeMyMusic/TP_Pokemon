package Client;

import java.util.Random;

public class AllPokemons {
	private static Random rand = new Random(); 
    // Enumération pour représenter les types de Pokémon
    public static enum TypePokemon {
        NORMAL, FEU, EAU, PLANTE, ELECTRIQUE, GLACE, COMBAT, POISON, SOL, VOL, PSY, INSECTE, ROCHE, SPECTRE, DRAGON
    }

    // Liste des pokémons existants
    public static Pokemon[] ListePokemon = {
            new Pokemon("Bulbizarre", TypePokemon.PLANTE, 45, 49),
            new Pokemon("Herbizarre", TypePokemon.PLANTE, 60, 62),
            new Pokemon("Florizarre", TypePokemon.PLANTE, 80, 82),
            new Pokemon("Salamèche", TypePokemon.FEU, 39, 52),
            new Pokemon("Reptincel", TypePokemon.FEU, 58, 64),
            new Pokemon("Dracaufeu", TypePokemon.FEU, 78, 84),
            new Pokemon("Carapuce", TypePokemon.EAU, 44, 48),
            new Pokemon("Carabaffe", TypePokemon.EAU, 59, 63),
            new Pokemon("Tortank", TypePokemon.EAU, 79, 83),
            new Pokemon("Chenipan", TypePokemon.INSECTE, 45, 30),
            new Pokemon("Chrysacier", TypePokemon.INSECTE, 50, 20),
            new Pokemon("Papilusion", TypePokemon.INSECTE, 60, 45),
            new Pokemon("Aspicot", TypePokemon.INSECTE, 40, 35),
            new Pokemon("Coconfort", TypePokemon.INSECTE, 45, 25),
            new Pokemon("Dardargnan", TypePokemon.INSECTE, 65, 90),
            new Pokemon("Roucool", TypePokemon.NORMAL, 40, 45),
            new Pokemon("Roucoups", TypePokemon.NORMAL, 63, 60),
            new Pokemon("Roucarnage", TypePokemon.NORMAL, 83, 80),
            new Pokemon("Rattata", TypePokemon.NORMAL, 30, 56),
            new Pokemon("Rattatac", TypePokemon.NORMAL, 55, 81),
            new Pokemon("Piafabec", TypePokemon.NORMAL, 40, 60),
            new Pokemon("Rapasdepic", TypePokemon.NORMAL, 65, 90),
            new Pokemon("Abo", TypePokemon.POISON, 35, 60),
            new Pokemon("Arbok", TypePokemon.POISON, 60, 85),
            new Pokemon("Pikachu", TypePokemon.ELECTRIQUE, 35, 55),
            new Pokemon("Raichu", TypePokemon.ELECTRIQUE, 60, 90),
    };

    // Liste des pokémons attrapables, qui sont les pokémons de base
    public static Pokemon[] ListePokemonAttrapables = {
            new Pokemon("Bulbizarre", TypePokemon.PLANTE, 45, 49, true),
            new Pokemon("Salamèche", TypePokemon.FEU, 39, 52, true),
            new Pokemon("Carapuce", TypePokemon.EAU, 44, 48, true),
            new Pokemon("Chenipan", TypePokemon.INSECTE, 45, 30, true),
            new Pokemon("Aspicot", TypePokemon.INSECTE, 40, 35, true),
            new Pokemon("Roucool", TypePokemon.NORMAL, 40, 45, true),
            new Pokemon("Rattata", TypePokemon.NORMAL, 30, 56, true),
            new Pokemon("Piafabec", TypePokemon.NORMAL, 40, 60, true),
            new Pokemon("Abo", TypePokemon.POISON, 35, 60, true),
            new Pokemon("Pikachu", TypePokemon.ELECTRIQUE, 35, 55, true),
    };
    
    public static Pokemon lootbox() {
    	Pokemon 
    	int pourcentageChance = rand.nextInt(ListePokemonAttrapables.length*2);
    	if (pourcentageChance >= ListePokemonAttrapables.length) {
    		
    	}
    	Pokemon randomPokemon = ListePokemonAttrapables[pourcentageChance];
    	return randomPokemon;
    }
}
